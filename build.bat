@echo off
REM Build script for Neon Dungeon (Windows)

echo 🎮 Neon Dungeon Build Script
echo ============================
echo.

REM Check if Maven is installed
where mvn >nul 2>nul
if %ERRORLEVEL% EQU 0 (
    echo 📦 Maven found. Building with Maven...
    call mvn clean package
    
    if %ERRORLEVEL% EQU 0 (
        echo.
        echo ✅ Build successful!
        echo.
        echo 🎮 To run the game:
        echo    java -jar target\Neon-Dungeon.jar
    ) else (
        echo ❌ Maven build failed
        exit /b 1
    )
) else (
    echo ❌ Maven not found. Installing using manual compilation...
    echo.
    
    echo 📦 Compiling Java files...
    javac -d bin src\com\neondungeon\**\*.java
    
    if %ERRORLEVEL% EQU 0 (
        echo ✅ Compilation successful!
        echo.
        echo 📦 Creating JAR file...
        jar cfe Neon-Dungeon.jar com.neondungeon.Main -C bin .
        
        if %ERRORLEVEL% EQU 0 (
            echo ✅ JAR created successfully!
            echo.
            echo 🎮 To run the game:
            echo    java -jar Neon-Dungeon.jar
        ) else (
            echo ❌ Failed to create JAR
            exit /b 1
        )
    ) else (
        echo ❌ Compilation failed
        exit /b 1
    )
)
