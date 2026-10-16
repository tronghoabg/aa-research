package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public enum zzhta implements zziet {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    private final int zzg;

    zzhta(int i5) {
        this.zzg = i5;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zziet
    public final int zza() {
        return this == UNRECOGNIZED ? zzifc.zza() : this.zzg;
    }
}
