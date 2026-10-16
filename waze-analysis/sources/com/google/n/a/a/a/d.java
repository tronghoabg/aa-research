package com.google.n.a.a.a;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum d implements eg {
    PLATFORM_UNSPECIFIED(0),
    TEST_PLATFORM(1),
    SERVER(2),
    EXTERNAL_SERVER(9),
    ANDROID(3),
    IOS(4),
    KAIOS(5),
    CHROME_OS(6),
    DESKTOP_CLIENT(7),
    WEB_CLIENT(8);


    /* renamed from: k, reason: collision with root package name */
    private static final eh f12496k = new c(0);
    private final int m;

    d(int i2) {
        this.m = i2;
    }

    public static eh a() {
        return f12496k;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
