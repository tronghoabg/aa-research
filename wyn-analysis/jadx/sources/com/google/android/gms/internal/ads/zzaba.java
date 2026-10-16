package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzaba {
    public final zzbg zza;
    public final int[] zzb;

    public zzaba(zzbg zzbgVar, int[] iArr, int i5) {
        if (iArr.length == 0) {
            zzeh.zzf("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzbgVar;
        this.zzb = iArr;
    }
}
