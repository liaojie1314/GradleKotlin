
import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin: Plugin<Project> {
    override fun apply(target: Project) {  //直接在apply中注册新的任务，这样插件加载之后就具有这些任务了
        target.tasks.register("a") {
            doLast { println("你干嘛") }
        }

        target.tasks.register("b") {
            doLast { println("哎哟") }
            dependsOn(target.tasks.named("a"))
        }
    }
}