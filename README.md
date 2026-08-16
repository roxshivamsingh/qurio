# Quiro - Kotlin Multiplatform Application

## 📱 Overview

Quiro is a modern Kotlin Multiplatform (KMP) application designed to demonstrate cross-platform
development capabilities. This project serves as a learning foundation for beginners exploring
Kotlin Multiplatform development.

## 🎯 Purpose

This application is built to help beginners understand:

- Kotlin Multiplatform project structure
- Shared code between Android and iOS
- Basic UI implementation in both platforms
- Common KMP patterns and best practices

## 🏗️ Project Structure

```
Quiro/
├── composeApp/          # Shared UI code using Compose Multiplatform
│   ├── src/
│   │   ├── androidMain/    # Android-specific code
│   │   ├── iosMain/        # iOS-specific code
│   │   └── commonMain/     # Shared code for all platforms
├── shared/              # Shared business logic
│   └── src/
│       ├── commonMain/     # Platform-agnostic code
│       ├── androidMain/    # Android implementations
│       └── iosMain/        # iOS implementations
└── build.gradle.kts     # Main build configuration
```

## 🚀 Getting Started

### Prerequisites

- **JDK 17** or later
- **Android Studio** with KMP plugin (recommended) or IntelliJ IDEA
- **Xcode** (for iOS development, macOS only)
- **Kotlin Multiplatform Mobile Plugin** installed

### Installation

1. **Clone the repository**

```bash
git clone https://github.com/roxshivamsingh/qurio
cd quiro
```

2. **Open in Android Studio**
    - File → Open → Select the project directory
    - Wait for Gradle sync to complete

3. **Run the application**

   **Android:**
   ```bash
   ./gradlew :composeApp:androidDebug
   ```

   **iOS (macOS only):**
   ```bash
   ./gradlew :composeApp:iosDebug
   ```
   Or open the iOS project in Xcode:
    - Navigate to `composeApp/iosApp/`
    - Open `iosApp.xcodeproj` in Xcode
    - Click Run button

## 📚 Key Features (To Be Implemented)

- [ ] Cross-platform UI with Compose Multiplatform
- [ ] Shared ViewModels and business logic
- [ ] Platform-specific implementations
- [ ] Network requests with Ktor
- [ ] Local data storage
- [ ] Dependency injection

## 🛠️ Technology Stack

| Component     | Technology            |
|---------------|-----------------------|
| Language      | Kotlin                |
| UI Framework  | Compose Multiplatform |
| Networking    | Ktor (planned)        |
| Serialization | kotlinx.serialization |
| Coroutines    | kotlinx.coroutines    |
| Testing       | Kotlin Test           |
| Build Tool    | Gradle KTS            |

## 📖 Learning Resources for Beginners

### Kotlin Multiplatform Concepts

1. **Common Code** - Code written in `commonMain` that works on all platforms
2. **Platform-Specific Code** - Implementations in `androidMain` and `iosMain`
3. **Expect/Actual Mechanism** - Define expected declarations in common code and provide actual
   implementations per platform

### Basic Example

```kotlin
// In commonMain
expect fun getPlatformName(): String

// In androidMain
actual fun getPlatformName(): String = "Android"

// In iosMain
actual fun getPlatformName(): String = "iOS"
```

## 🧪 Testing

Run all tests:

```bash
./gradlew check
```

Run platform-specific tests:

```bash
./gradlew :shared:androidTest
./gradlew :shared:iosTest
```

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 Development Tips for Beginners

1. **Start with common code**: Focus on business logic that doesn't depend on platform specifics
2. **Use expect/actual**: Define interfaces in common code and implement them per platform
3. **Test early**: Write tests in common code to verify shared logic
4. **Use platform-specific libraries**: Wrap platform-specific functionality in expect/actual
   classes
5. **Follow conventions**: Keep platform-specific code organized in their respective source sets

## 🐛 Common Issues and Solutions

### Gradle Sync Fails

- Ensure JDK 17 is installed
- Check internet connection for dependency downloads
- Invalidate caches: File → Invalidate Caches and Restart

### iOS Build Fails

- Ensure Xcode is installed and up to date
- Run `pod install` in the iOS project directory
- Check iOS deployment target compatibility

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👥 Authors

- Your Name - *Initial work*

## 🙏 Acknowledgments

- JetBrains for Kotlin Multiplatform
- Compose Multiplatform team
- Kotlin community contributors

---

## 🗺️ Roadmap

- [ ] Add navigation
- [ ] Implement API integration
- [ ] Add database support
- [ ] Create UI components library
- [ ] Add CI/CD pipeline
- [ ] Write comprehensive tests
- [ ] Add analytics
- [ ] Implement push notifications

---

## 📞 Support

For support, email your-email@example.com or open an issue in the repository.

---

**Happy Coding! 🚀**
