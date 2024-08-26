import org.gradle.api.artifacts.dsl.RepositoryHandler

fun RepositoryHandler.mavenAlibaba() = maven {
    setUrl("https://maven.aliyun.com/repository/public/")
}