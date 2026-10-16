package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public enum zzbdz implements zziet {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(999);

    private final int zzh;

    zzbdz(int i5) {
        this.zzh = i5;
    }

    public static zzbdz zzb(int i5) {
        if (i5 == 0) {
            return UNSUPPORTED;
        }
        if (i5 == 2) {
            return ARM7;
        }
        if (i5 == 999) {
            return UNKNOWN;
        }
        if (i5 == 4) {
            return X86;
        }
        if (i5 == 5) {
            return ARM64;
        }
        if (i5 == 6) {
            return X86_64;
        }
        if (i5 != 7) {
            return null;
        }
        return RISCV64;
    }

    public static zziev zzc() {
        return zzbdy.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zziet
    public final int zza() {
        return this.zzh;
    }
}
