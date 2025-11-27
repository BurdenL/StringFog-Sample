// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
}

buildscript {

    dependencies {

        classpath("com.github.megatronking.stringfog:gradle-plugin:5.1.0")

        // 选用加解密算法库，默认实现了xor算法，也可以使用自己的加解密库。
        classpath("com.github.megatronking.stringfog:xor:5.0.0")
    }
}


tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}