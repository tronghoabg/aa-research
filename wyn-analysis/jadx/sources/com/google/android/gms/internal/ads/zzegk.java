package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.common.internal.InterfaceC1713b;
import com.google.android.gms.common.internal.InterfaceC1714c;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class zzegk implements InterfaceC1713b, InterfaceC1714c {
    protected final zzcgd zza = new zzcgd();
    protected final Object zzb = new Object();
    protected boolean zzc = false;
    protected boolean zzd = false;
    protected zzcbk zze;
    protected zzcam zzf;

    public static void zzc(Context context, p8.p pVar, Executor executor) {
        if (((Boolean) zzbkp.zzj.zze()).booleanValue() || ((Boolean) zzbkp.zzh.zze()).booleanValue()) {
            zzhcf.zzr(pVar, new zzegh(context), executor);
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1713b
    public abstract /* synthetic */ void onConnected(Bundle bundle);

    public void onConnectionFailed(d7.b bVar) {
        int i5 = G6.L.f4523b;
        H6.l.a("Disconnected from remote ad request service.");
        this.zza.zzd(new zzegz(1));
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1713b
    public void onConnectionSuspended(int i5) {
        int i10 = G6.L.f4523b;
        H6.l.a("Cannot connect to remote service, fallback to local instance.");
    }

    public final void zzb() {
        synchronized (this.zzb) {
            try {
                this.zzd = true;
                if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                    this.zzf.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
