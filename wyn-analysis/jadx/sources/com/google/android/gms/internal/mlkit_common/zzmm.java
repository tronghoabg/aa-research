package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes4.dex */
public enum zzmm implements zzba {
    UNKNOWN(0),
    TRANSLATE(1);

    private final int zzd;

    zzmm(int i5) {
        this.zzd = i5;
    }

    public static zzmm zzb(int i5) {
        for (zzmm zzmmVar : values()) {
            if (zzmmVar.zzd == i5) {
                return zzmmVar;
            }
        }
        return UNKNOWN;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzba
    public final int zza() {
        return this.zzd;
    }
}
