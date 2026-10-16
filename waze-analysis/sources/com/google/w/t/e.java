package com.google.w.t;

import com.google.v.eg;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum e implements eg {
    WINDOWS_EDITION_UNKNOWN(0),
    WINDOWS_EDITION_HOME(1),
    WINDOWS_EDITION_PROFESSIONAL(2),
    WINDOWS_EDITION_ENTERPRISE(3),
    WINDOWS_EDITION_EDUCATION(4),
    WINDOWS_EDITION_IOT(5),
    WINDOWS_EDITION_SERVER(6),
    WINDOWS_EDITION_UNLICENSED(7),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    private final int f13400k;

    e(int i2) {
        this.f13400k = i2;
    }

    public static ei a() {
        return b.f13369d;
    }

    public static e b(int i2) {
        switch (i2) {
            case 0:
                return WINDOWS_EDITION_UNKNOWN;
            case 1:
                return WINDOWS_EDITION_HOME;
            case 2:
                return WINDOWS_EDITION_PROFESSIONAL;
            case 3:
                return WINDOWS_EDITION_ENTERPRISE;
            case 4:
                return WINDOWS_EDITION_EDUCATION;
            case 5:
                return WINDOWS_EDITION_IOT;
            case 6:
                return WINDOWS_EDITION_SERVER;
            case 7:
                return WINDOWS_EDITION_UNLICENSED;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f13400k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13400k);
    }
}
