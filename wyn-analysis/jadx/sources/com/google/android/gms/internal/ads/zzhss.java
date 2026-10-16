package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public enum zzhss implements zziet {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    private final int zzh;

    zzhss(int i5) {
        this.zzh = i5;
    }

    public static zzhss zzb(int i5) {
        if (i5 == 0) {
            return UNKNOWN_HASH;
        }
        if (i5 == 1) {
            return SHA1;
        }
        if (i5 == 2) {
            return SHA384;
        }
        if (i5 == 3) {
            return SHA256;
        }
        if (i5 == 4) {
            return SHA512;
        }
        if (i5 != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zziet
    public final int zza() {
        return this == UNRECOGNIZED ? zzifc.zza() : this.zzh;
    }
}
