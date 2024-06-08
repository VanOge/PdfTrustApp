android{
    compileSdkExtension = 34
    defaultConfig {
        minSdk = 28
        applicationId = "PdfTrustApp"
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply true
}