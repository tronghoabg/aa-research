package com.google.w.t;

import com.google.v.eg;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum a implements eg {
    CPU_ARCHITECTURE_UNKNOWN(0),
    CPU_ARCHITECTURE_X86(1),
    CPU_ARCHITECTURE_X64(2),
    CPU_ARCHITECTURE_ARM(3),
    CPU_ARCHITECTURE_ARM64(4),
    CPU_ARCHITECTURE_IA64(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f13365i;

    a(int i2) {
        this.f13365i = i2;
    }

    public static ei a() {
        return b.f13367b;
    }

    public static a b(int i2) {
        if (i2 == 0) {
            return CPU_ARCHITECTURE_UNKNOWN;
        }
        if (i2 == 1) {
            return CPU_ARCHITECTURE_X86;
        }
        if (i2 == 2) {
            return CPU_ARCHITECTURE_X64;
        }
        if (i2 == 3) {
            return CPU_ARCHITECTURE_ARM;
        }
        if (i2 == 4) {
            return CPU_ARCHITECTURE_ARM64;
        }
        if (i2 != 5) {
            return null;
        }
        return CPU_ARCHITECTURE_IA64;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f13365i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13365i);
    }
}
