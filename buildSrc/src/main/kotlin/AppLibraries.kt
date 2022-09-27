import org.gradle.api.artifacts.dsl.DependencyHandler
import dependancies.*

fun DependencyHandler.libraries() {

    androidX()
    DaggerHilt()
    glide()
    gson()
    gander()
    materialDesign()
    NavGraph()
    okHttp()
    retrofit()
    vmLifeCycle()
    androidPaging()
    dataBinding()
}