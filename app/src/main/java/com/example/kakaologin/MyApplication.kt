package com.example.kakaologin

import android.app.Application
import com.kakao.sdk.common.KakaoSdk


class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // 다른 초기화 코드들

        // Kakao SDK 초기화
        KakaoSdk.init(this, "055a9c39996f45deea198684ece55a14")
    }
}