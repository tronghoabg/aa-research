package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcjl extends zzcjh {
    public zzcjl(zzchu zzchuVar) {
        super(zzchuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final boolean zze(String str) {
        String strD = H6.f.d(str, "MD5");
        zzchu zzchuVar = (zzchu) this.zzc.get();
        if (zzchuVar != null && strD != null) {
            zzchuVar.zzt(strD, this);
        }
        int i5 = G6.L.f4523b;
        H6.l.f("VideoStreamNoopCache is doing nothing.");
        zzq(str, strD, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final void zzl() {
    }
}
