package com.github.heavenosk.classnamesfold.services

import com.intellij.openapi.project.Project
import com.github.heavenosk.classnamesfold.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
