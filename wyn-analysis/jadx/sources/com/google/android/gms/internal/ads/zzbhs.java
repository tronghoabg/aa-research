package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public final class zzbhs {
    private zzbhh zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzbhs(Context context) {
        this.zzc = context;
    }

    public final Future zza(zzbhi zzbhiVar) {
        zzbhm zzbhmVar = new zzbhm(this);
        zzbhq zzbhqVar = new zzbhq(this, zzbhiVar, zzbhmVar);
        zzbhr zzbhrVar = new zzbhr(this, zzbhmVar);
        synchronized (this.zzd) {
            zzbhh zzbhhVar = new zzbhh(this.zzc, C6.n.f1857D.f1879t.j(), zzbhqVar, zzbhrVar);
            this.zza = zzbhhVar;
            zzbhhVar.checkAvailabilityAndConnect();
        }
        return zzbhmVar;
    }

    public final /* synthetic */ void zzb() {
        synchronized (this.zzd) {
            try {
                zzbhh zzbhhVar = this.zza;
                if (zzbhhVar == null) {
                    return;
                }
                zzbhhVar.disconnect();
                this.zza = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ zzbhh zzc() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzd() {
        return this.zzb;
    }

    public final /* synthetic */ void zze(boolean z2) {
        this.zzb = true;
    }

    public final /* synthetic */ Object zzf() {
        return this.zzd;
    }
}
