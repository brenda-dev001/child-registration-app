# 🧩 Child Registration App

**English** | [Português](README.pt-BR.md)

Android application developed as an academic project during my Systems Analysis and Development studies, focusing on child registration and management using Kotlin, Jetpack Compose, Room Database, and Android architecture components.

## ✨ Features

- Register children and their guardians.
- Search for children by CPF.
- Search for guardians by CPF and view their associated children.
- Update children's information.
- Update guardians' information.
- Delete child registrations.
- Display statistics, including the total number of registered children and their average age.
- Local data persistence using Room Database.

## 🛠️ Technologies Used

\<p align="center">   \<img src="[https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/kotlin/kotlin-original.svg](https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/kotlin/kotlin-original.svg)" width="40" height="40" alt="Kotlin" title="Kotlin" />   &nbsp;   \<img src="[https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/android/android-original.svg](https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/android/android-original.svg)" width="40" height="40" alt="Android" title="Android" />   &nbsp;   \<img src="[https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jetpackcompose/jetpackcompose-original.svg](https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jetpackcompose/jetpackcompose-original.svg)" width="40" height="40" alt="Jetpack Compose" title="Jetpack Compose" />   &nbsp;   \<img src="[https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/sqlite/sqlite-original.svg](https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/sqlite/sqlite-original.svg)" width="40" height="40" alt="SQLite" title="SQLite" />   &nbsp;   \<img src="[https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/androidstudio/androidstudio-original.svg](https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/androidstudio/androidstudio-original.svg)" width="40" height="40" alt="Android Studio" title="Android Studio" /> \</p>

## ⚙️ How It Works

The project consists of an Android application developed with Kotlin and Jetpack Compose, using Room Database for local data persistence.

The application follows a layered architecture, separating responsibilities into **UI**, **ViewModel**, **Repository**, and **DAO**.

The main entity is `Child`, which stores children's information along with their guardians' details.

The application allows users to register, search, update, and delete child records. Guardians can also be searched by CPF, allowing users to view the children associated with them.

Database operations are performed using Kotlin Coroutines, while Jetpack Compose manages the user interface and reacts to state changes.

## 📁 Project Structure

```text
child-registration-app/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/clinicofkids/
│   │       │   ├── data/
│   │       │   │   ├── model/
│   │       │   │   └── repository/
│   │       │   └── ui/
│   │       │       ├── screens/
│   │       │       │   ├── child/
│   │       │       │   └── search/
│   │       │       └── theme/
│   │       ├── res/
│   │       └── AndroidManifest.xml
│   └── build.gradle.kts
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
└── .gitignore
```

## 🚀 Running the Project

1. Install Android Studio.

2. Clone the repository:

   ```bash
   git clone https://github.com/brenda-dev001/child-registration-app.git
   ```

3. Open the project in Android Studio.

4. Wait for Gradle synchronization to complete.

5. Configure an Android emulator or connect a physical Android device.

6. Build and run the application using Android Studio.

The application uses Room Database to store records locally, without requiring an external database server.

## 📌 Project Status

Project developed for educational purposes, focusing on Kotlin, Jetpack Compose, Room Database, SQLite, MVVM architecture, CRUD operations, navigation, state management, and Kotlin Coroutines.

## 👩‍💻 Author

Developed by [Brenda](https://github.com/brenda-dev001) as an academic project during my Systems Analysis and Development studies.
