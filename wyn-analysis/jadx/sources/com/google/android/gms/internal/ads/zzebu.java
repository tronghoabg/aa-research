package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import j$.util.Objects;
import org.json.JSONException;

/* loaded from: classes3.dex */
final class zzebu implements zzhcc {
    final /* synthetic */ zzece zza;

    public zzebu(zzece zzeceVar) {
        Objects.requireNonNull(zzeceVar);
        this.zza = zzeceVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        synchronized (this) {
            zzece zzeceVar = this.zza;
            zzeceVar.zzn(true);
            C6.n.f1857D.k.getClass();
            zzeceVar.zzm("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (SystemClock.elapsedRealtime() - zzeceVar.zzo()));
            zzeceVar.zzp().zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            zzece zzeceVar = this.zza;
            zzeceVar.zzn(true);
            C6.n.f1857D.k.getClass();
            zzeceVar.zzm("com.google.android.gms.ads.MobileAds", true, "", (int) (SystemClock.elapsedRealtime() - zzeceVar.zzo()));
            zzeceVar.zzq().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() throws JSONException {
                    this.zza.zza.zzl(str);
                }
            });
        }
    }
}
