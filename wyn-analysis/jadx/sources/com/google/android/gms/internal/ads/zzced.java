package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class zzced implements zzbex {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzced(Context context, String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final void zza(boolean z2) {
        C6.n nVar = C6.n.f1857D;
        zzceg zzcegVar = nVar.f1885z;
        Context context = this.zza;
        if (zzcegVar.zzb(context)) {
            synchronized (this.zzb) {
                try {
                    if (this.zzd == z2) {
                        return;
                    }
                    this.zzd = z2;
                    String str = this.zzc;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.zzd) {
                        nVar.f1885z.zze(context, str);
                    } else {
                        nVar.f1885z.zzf(context, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzdj(zzbew zzbewVar) {
        zza(zzbewVar.zzj);
    }
}
