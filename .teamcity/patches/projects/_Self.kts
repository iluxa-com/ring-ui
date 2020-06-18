package patches.projects

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.Project
import jetbrains.buildServer.configs.kotlin.v2018_2.projectFeatures.buildReportTab
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the root project
accordingly, and delete the patch script.
*/
changeProject(DslContext.projectId) {
    params {
        expect {
            param("env.PUPPETEER_SKIP_CHROMIUM_DOWNLOAD", "true")
        }
        update {
            text("env.PUPPETEER_SKIP_CHROMIUM_DOWNLOAD", "true", allowEmpty = true)
        }
    }

    features {
        add {
            buildReportTab {
                id = "PROJECT_EXT_156"
                title = "Yarn audit"
                startPage = "yarn-audit.html"
            }
        }
    }
}
