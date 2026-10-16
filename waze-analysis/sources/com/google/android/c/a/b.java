package com.google.android.c.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum b implements eg {
    ARCH_UNKNOWN(0),
    ARCH_NON_NATIVE(1),
    ARCH_ARMV5(2),
    ARCH_ARMV7(4),
    ARCH_ARM64(5),
    ARCH_MIPS(6),
    ARCH_MIPS_64(7),
    ARCH_X86(8),
    ARCH_X86_64(9),
    ARCH_RISCV64(10);


    /* renamed from: l, reason: collision with root package name */
    private final int f3859l;

    b(int i2) {
        this.f3859l = i2;
    }

    public static b a(int i2) {
        switch (i2) {
            case 0:
                return ARCH_UNKNOWN;
            case 1:
                return ARCH_NON_NATIVE;
            case 2:
                return ARCH_ARMV5;
            case 3:
            default:
                return null;
            case 4:
                return ARCH_ARMV7;
            case 5:
                return ARCH_ARM64;
            case 6:
                return ARCH_MIPS;
            case 7:
                return ARCH_MIPS_64;
            case 8:
                return ARCH_X86;
            case 9:
                return ARCH_X86_64;
            case 10:
                return ARCH_RISCV64;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f3859l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3859l);
    }
}
