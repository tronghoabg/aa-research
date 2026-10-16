package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum aq implements eg {
    OS_UNKNOWN(0),
    MAC(1),
    WINDOWS(2),
    ANDROID(3),
    LINUX(4),
    CHROME_OS(5),
    IPAD(6),
    IPHONE(7),
    IPOD(8),
    CHROMECAST(9);


    /* renamed from: l, reason: collision with root package name */
    private final int f3666l;

    aq(int i2) {
        this.f3666l = i2;
    }

    public static aq a(int i2) {
        switch (i2) {
            case 0:
                return OS_UNKNOWN;
            case 1:
                return MAC;
            case 2:
                return WINDOWS;
            case 3:
                return ANDROID;
            case 4:
                return LINUX;
            case 5:
                return CHROME_OS;
            case 6:
                return IPAD;
            case 7:
                return IPHONE;
            case 8:
                return IPOD;
            case 9:
                return CHROMECAST;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f3666l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3666l);
    }
}
