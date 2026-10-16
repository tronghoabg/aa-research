package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum y implements eg {
    DESKTOP_SERVICES_CLIENT_TYPE_UNSPECIFIED(0),
    DAEMON(1),
    INSTALLER(2),
    UNINSTALLER(3),
    OVERLAY(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f3832g;

    y(int i2) {
        this.f3832g = i2;
    }

    public static y a(int i2) {
        if (i2 == 0) {
            return DESKTOP_SERVICES_CLIENT_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return DAEMON;
        }
        if (i2 == 2) {
            return INSTALLER;
        }
        if (i2 == 3) {
            return UNINSTALLER;
        }
        if (i2 != 4) {
            return null;
        }
        return OVERLAY;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f3832g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3832g);
    }
}
