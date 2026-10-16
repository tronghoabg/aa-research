package com.google.w.v;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum c implements eg {
    COM_ANDROID_WEBVIEW(0),
    COM_GOOGLE_ANDROID_WEBVIEW(1),
    COM_ANDROID_CHROME(2),
    COM_CHROME_BETA(3),
    COM_CHROME_DEV(4),
    COM_CHROME_CANARY(5),
    COM_GOOGLE_ANDROID_APPS_CHROME(6),
    COM_GOOGLE_ANDROID_WEBVIEW_BETA(7),
    COM_GOOGLE_ANDROID_WEBVIEW_DEV(8),
    COM_GOOGLE_ANDROID_WEBVIEW_CANARY(9),
    COM_GOOGLE_ANDROID_WEBVIEW_DEBUG(10),
    OTHER(11);

    private final int n;

    c(int i2) {
        this.n = i2;
    }

    public static c a(int i2) {
        switch (i2) {
            case 0:
                return COM_ANDROID_WEBVIEW;
            case 1:
                return COM_GOOGLE_ANDROID_WEBVIEW;
            case 2:
                return COM_ANDROID_CHROME;
            case 3:
                return COM_CHROME_BETA;
            case 4:
                return COM_CHROME_DEV;
            case 5:
                return COM_CHROME_CANARY;
            case 6:
                return COM_GOOGLE_ANDROID_APPS_CHROME;
            case 7:
                return COM_GOOGLE_ANDROID_WEBVIEW_BETA;
            case 8:
                return COM_GOOGLE_ANDROID_WEBVIEW_DEV;
            case 9:
                return COM_GOOGLE_ANDROID_WEBVIEW_CANARY;
            case 10:
                return COM_GOOGLE_ANDROID_WEBVIEW_DEBUG;
            case 11:
                return OTHER;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
