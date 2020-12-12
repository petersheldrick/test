package com.github.petersheldrick.test.services

import com.intellij.openapi.project.Project
import com.github.petersheldrick.test.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
