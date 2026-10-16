package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum h implements eg {
    CLIENT_UNKNOWN(0),
    EMULATOR(1),
    PHENOTYPE(2),
    SERVICE(3),
    CLIENT(4),
    INSTALLER(5),
    HYPERVISOR(6),
    INSTALLER_PHENOTYPE(7);


    /* renamed from: j, reason: collision with root package name */
    private final int f3782j;

    h(int i2) {
        this.f3782j = i2;
    }

    public static h a(int i2) {
        switch (i2) {
            case 0:
                return CLIENT_UNKNOWN;
            case 1:
                return EMULATOR;
            case 2:
                return PHENOTYPE;
            case 3:
                return SERVICE;
            case 4:
                return CLIENT;
            case 5:
                return INSTALLER;
            case 6:
                return HYPERVISOR;
            case 7:
                return INSTALLER_PHENOTYPE;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f3782j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3782j);
    }
}
