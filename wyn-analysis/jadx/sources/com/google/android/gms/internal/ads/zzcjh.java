package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class zzcjh {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcjh(zzchu zzchuVar) {
        Context context = zzchuVar.getContext();
        this.zza = context;
        this.zzb = C6.n.f1857D.f1863c.E(context, zzchuVar.zzs().f4927a);
        this.zzc = new WeakReference(zzchuVar);
    }

    public void release() {
    }

    public abstract boolean zze(String str);

    public boolean zzf(String str, String[] strArr) {
        return zze(str);
    }

    public boolean zzg(String str, String[] strArr, zzciz zzcizVar) {
        return zze(str);
    }

    public void zzh(int i5) {
    }

    public void zzi(int i5) {
    }

    public void zzj(int i5) {
    }

    public void zzk(int i5) {
    }

    public abstract void zzl();

    public final void zzm(String str, String str2, long j8, long j10, boolean z2, long j11, long j12, long j13, int i5, int i10) {
        H6.f.f4939b.post(new zzcjc(this, str, str2, j8, j10, j11, j12, j13, z2, i5, i10));
    }

    public final void zzn(String str, String str2, int i5, int i10, long j8, long j10, boolean z2, int i11, int i12) {
        H6.f.f4939b.post(new zzcjd(this, str, str2, i5, i10, j8, j10, z2, i11, i12));
    }

    public final void zzo(String str, String str2, int i5) {
        H6.f.f4939b.post(new zzcje(this, str, str2, i5));
    }

    public final void zzp(String str, String str2, long j8) {
        H6.f.f4939b.post(new zzcjf(this, str, str2, j8));
    }

    public final void zzq(String str, String str2, String str3, String str4) {
        H6.f.f4939b.post(new zzcjg(this, str, str2, str3, str4));
    }

    public final /* synthetic */ void zzw(String str, Map map) {
        zzchu zzchuVar = (zzchu) this.zzc.get();
        if (zzchuVar != null) {
            zzchuVar.zze("onPrecacheEvent", map);
        }
    }
}
