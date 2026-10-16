package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public abstract class zzgtf implements zzgts {
    public static zzgtf zzc() {
        return zzgte.zzb;
    }

    public static zzgtf zzd(char c10) {
        return new zzgtb(c10);
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c10);
}
