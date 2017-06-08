node {
    properties([
            buildDiscarder(logRotator(
                    artifactDaysToKeepStr: '',
                    artifactNumToKeepStr: '',
                    daysToKeepStr: '',
                    numToKeepStr: '5'
            )),
            disableConcurrentBuilds(),
            pipelineTriggers([])
    ])

    stage('Pull sources from GitHub') {
        checkout scm
    }

    stage('Run tests') {
        try {
            if (isUnix()) {
                sh './gradlew clean test'
            } else {
                bat './gradlew clean test'
            }

            currentBuild.result = 'SUCCESS'
        } catch (ex) {
            echo "Caught: ${ex}"
            currentBuild.result = 'UNSTABLE'
        }
    }

    stage('Publish test results') {
        allure([
                includeProperties: true,
                jdk: '',
                properties: [],
                reportBuildPolicy: 'ALWAYS',
                results: [[path: 'build/allure-results']]
        ])
    }
}