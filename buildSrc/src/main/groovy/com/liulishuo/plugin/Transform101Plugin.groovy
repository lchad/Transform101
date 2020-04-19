package com.liulishuo.plugin

import com.android.build.gradle.BaseExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.ProjectConfigurationException

class Transform101Plugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        if (!project.android) {
        throw new ProjectConfigurationException("error, not android", Throwable())
        }
        project.task('testPlugin') {
            doLast {
                println 'hello, world!'
            }
        }
//        ((BaseExtension)project.extensions.findByType(BaseExtension.class)).registerTransform(CustomTransform())
    }
}