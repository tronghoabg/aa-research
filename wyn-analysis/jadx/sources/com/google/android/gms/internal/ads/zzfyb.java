package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.internal.InterfaceC1713b;
import com.google.android.gms.common.internal.InterfaceC1714c;

/* loaded from: classes3.dex */
final class zzfyb implements InterfaceC1713b, InterfaceC1714c {
    private final zzfys zza;
    private final zzfym zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private boolean zze = false;

    public zzfyb(Context context, Looper looper, zzfym zzfymVar) {
        this.zzb = zzfymVar;
        this.zza = new zzfys(context, looper, this, this, 12800000);
    }

    private final void zzb() {
        synchronized (this.zzc) {
            try {
                zzfys zzfysVar = this.zza;
                if (zzfysVar.isConnected() || zzfysVar.isConnecting()) {
                    zzfysVar.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1713b
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                this.zze = true;
                try {
                    this.zza.zzp().zzf(new zzfyq(this.zzb.zzaN()));
                } catch (Exception unused) {
                } catch (Throwable th) {
                    zzb();
                    throw th;
                }
                zzb();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1713b
    public final void onConnectionSuspended(int i5) {
    }

    public final void zza() {
        synchronized (this.zzc) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    this.zza.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1714c
    public final void onConnectionFailed(d7.b bVar) {
    }
}
