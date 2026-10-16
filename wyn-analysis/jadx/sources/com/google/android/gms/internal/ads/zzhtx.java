package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public enum zzhtx implements zziet {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    WITH_ID_REQUIREMENT(5),
    UNRECOGNIZED(-1);

    private final int zzh;

    zzhtx(int i5) {
        this.zzh = i5;
    }

    public static zzhtx zzb(int i5) {
        if (i5 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i5 == 1) {
            return TINK;
        }
        if (i5 == 2) {
            return LEGACY;
        }
        if (i5 == 3) {
            return RAW;
        }
        if (i5 == 4) {
            return CRUNCHY;
        }
        if (i5 != 5) {
            return null;
        }
        return WITH_ID_REQUIREMENT;
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
