subprojects {   //subprojects表示对所有的子项目生效
    apply(plugin = "java")   //定义插件需要使用apply来完成，plugin{}在这里不行

    group = "blog.yuanyuan"   //定义组
    version = "unspecified"  //定义版本

    configure<JavaPluginExtension> {
        sourceCompatibility = Version.sourceVersion
        targetCompatibility = Version.targetVersion
    }

    repositories {   //定义自定义仓库地址
        mavenAlibaba()
    }
}