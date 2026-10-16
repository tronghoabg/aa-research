package com.google.firebase.f;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {
    public static com.google.firebase.components.c a() {
        return com.google.firebase.components.c.f(new e(), d.class);
    }

    public static String b(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", e(str, str2), str3, "perf-android-sdk", "android-ide");
    }

    public static String c(String str, String str2) {
        return String.format("%s/trends?utm_source=%s&utm_medium=%s", e(str, str2), "perf-android-sdk", "android-ide");
    }

    public static String d(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", e(str, str2), str3, "perf-android-sdk", "android-ide");
    }

    private static String e(String str, String str2) {
        return String.format("%s/project/%s/performance/app/android:%s", "https://console.firebase.google.com", str, str2);
    }
}
