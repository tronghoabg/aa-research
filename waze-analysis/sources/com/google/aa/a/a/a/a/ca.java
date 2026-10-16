package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ca implements eg {
    OS_TYPE_UNKNOWN(0),
    OS_TYPE_MAC(1),
    OS_TYPE_WINDOWS(2),
    OS_TYPE_ANDROID(3),
    OS_TYPE_CROS(4),
    OS_TYPE_LINUX(5),
    OS_TYPE_OPENBSD(6);


    /* renamed from: i, reason: collision with root package name */
    private final int f3732i;

    ca(int i2) {
        this.f3732i = i2;
    }

    public static ca a(int i2) {
        switch (i2) {
            case 0:
                return OS_TYPE_UNKNOWN;
            case 1:
                return OS_TYPE_MAC;
            case 2:
                return OS_TYPE_WINDOWS;
            case 3:
                return OS_TYPE_ANDROID;
            case 4:
                return OS_TYPE_CROS;
            case 5:
                return OS_TYPE_LINUX;
            case 6:
                return OS_TYPE_OPENBSD;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f3732i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3732i);
    }
}
