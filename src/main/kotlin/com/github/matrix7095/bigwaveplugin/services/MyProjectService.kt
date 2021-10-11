package com.github.matrix7095.bigwaveplugin.services

import com.intellij.openapi.project.Project
import com.github.matrix7095.bigwaveplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
