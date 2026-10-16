package com.google.android.gms.internal.ads;

import D6.H0;
import D6.n1;
import android.app.Activity;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import q7.BinderC3877b;
import x6.AbstractC4480k;
import x6.InterfaceC4486q;
import z6.AbstractC4619b;

/* loaded from: classes3.dex */
public final class zzbgm extends AbstractC4619b {
    AbstractC4480k zza;
    private final zzbgq zzb;
    private final AtomicReference zzc;
    private final zzbgn zzd;
    private InterfaceC4486q zze;
    private final AtomicLong zzf;

    public zzbgm(zzbgq zzbgqVar) {
        this.zzd = new zzbgn();
        this.zzf = new AtomicLong();
        this.zzb = zzbgqVar;
        this.zzc = new AtomicReference();
    }

    public final String getAdUnitId() {
        String strZzj;
        String str;
        AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                strZzj = this.zzb.zzj();
            } catch (RemoteException e7) {
                H6.l.i("#007 Could not call remote method.", e7);
                strZzj = null;
            }
            if (strZzj == null) {
                this.zzc.set("");
            } else {
                this.zzc.set(strZzj);
            }
            str = (String) this.zzc.get();
        }
        return str;
    }

    public final AbstractC4480k getFullScreenContentCallback() {
        return this.zza;
    }

    public final InterfaceC4486q getOnPaidEventListener() {
        return this.zze;
    }

    public final long getPlacementId() {
        long j8;
        AtomicLong atomicLong = this.zzf;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    long jZzk = this.zzb.zzk();
                    AtomicLong atomicLong2 = this.zzf;
                    atomicLong2.set(jZzk);
                    j8 = atomicLong2.get();
                } catch (RemoteException e7) {
                    H6.l.i("#007 Could not call remote method.", e7);
                    return 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j8;
    }

    @Override // z6.AbstractC4619b
    public final x6.t getResponseInfo() {
        H0 h0Zzg;
        try {
            h0Zzg = this.zzb.zzg();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
            h0Zzg = null;
        }
        return new x6.t(h0Zzg);
    }

    @Override // z6.AbstractC4619b
    public final void setFullScreenContentCallback(AbstractC4480k abstractC4480k) {
        this.zza = abstractC4480k;
        this.zzd.zzb(abstractC4480k);
    }

    @Override // z6.AbstractC4619b
    public final void setImmersiveMode(boolean z2) {
        try {
            this.zzb.zzh(z2);
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // z6.AbstractC4619b
    public final void setOnPaidEventListener(InterfaceC4486q interfaceC4486q) {
        this.zze = interfaceC4486q;
        try {
            this.zzb.zzi(new n1(interfaceC4486q));
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final void setPlacementId(long j8) {
        try {
            this.zzb.zzl(j8);
            this.zzf.set(j8);
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // z6.AbstractC4619b
    public final void show(Activity activity) {
        try {
            this.zzb.zzf(new BinderC3877b(activity), this.zzd);
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public zzbgm(zzbgq zzbgqVar, String str) {
        this.zzd = new zzbgn();
        this.zzf = new AtomicLong();
        this.zzb = zzbgqVar;
        this.zzc = new AtomicReference(str);
    }
}
