package com.google.android.gms.internal.identity;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C1701o;
import com.google.android.gms.common.api.internal.C1703q;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzbh implements InterfaceC1708w, zzdr {
    final /* synthetic */ zzbi zza;
    private final zzbg zzb;
    private C1703q zzc;
    private boolean zzd = true;

    public zzbh(zzbi zzbiVar, C1703q c1703q, zzbg zzbgVar) {
        this.zza = zzbiVar;
        this.zzc = c1703q;
        this.zzb = zzbgVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
    public final void accept(Object obj, Object obj2) throws RemoteException {
        C1701o c1701o;
        boolean z2;
        zzdz zzdzVar = (zzdz) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        synchronized (this) {
            c1701o = this.zzc.f26552c;
            z2 = this.zzd;
            this.zzc.a();
        }
        if (c1701o == null) {
            taskCompletionSource.setResult(Boolean.FALSE);
        } else {
            this.zzb.zza(zzdzVar, c1701o, z2, taskCompletionSource);
        }
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final synchronized C1703q zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final synchronized void zzb(C1703q c1703q) {
        C1703q c1703q2 = this.zzc;
        if (c1703q2 != c1703q) {
            c1703q2.a();
            this.zzc = c1703q;
        }
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final void zzc() {
        C1701o c1701o;
        synchronized (this) {
            this.zzd = false;
            c1701o = this.zzc.f26552c;
        }
        if (c1701o != null) {
            this.zza.doUnregisterEventListener(c1701o, 2441);
        }
    }
}
