plugins {
    `kotlin-dsl`
}


repositories {
    mavenCentral()
}

gradlePlugin {
    plugins {
        create("my-custom-plugin") {   //创建一个新的Plugin
            id = "my-plugin"  //插件的ID
            implementationClass = "MyPlugin"   //插件的实现类
        }
    }
}