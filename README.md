# kolor
[![Download](https://api.bintray.com/packages/ziggy42/kolor/kolor/images/download.svg) ](https://bintray.com/ziggy42/kolor/kolor/_latestVersion)   
A library to print colored strings, with Kotlin.

![Screenshot](screenshots/screenshot.png)

## Example
Foreground:
```kotlin
println("We all live in a yellow submarine".yellow())
// Or
println(Kolor.foreground("We all live in a yellow submarine", Color.YELLOW))
```

Background:
```kotlin
println("I'm blue da ba dee da ba daa".blueBackground())
// Or
println(Kolor.background("I'm blue da ba dee da ba daa", Color.BLUE))
```

## Usage
Add repository:
```groovy
repositories {
    maven {
        url  "http://dl.bintray.com/ziggy42/kolor"
    }
    ...
}
```

Add dependency:
```groovy
dependencies {
    compile "com.andreapivetta.kolor:kolor:0.0.1"
    ...
}
```