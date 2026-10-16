package com.google.android.gms.internal.ads;

import D6.C0361b;
import D6.C0388o;
import D6.C0392q;
import D6.H0;
import D6.Q0;
import D6.m1;
import D6.n1;
import D6.w1;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import q7.BinderC3877b;
import x6.AbstractC4480k;
import x6.InterfaceC4486q;
import x6.InterfaceC4487r;

/* loaded from: classes3.dex */
public final class zzccy extends R6.c {
    private final AtomicReference zza;
    private final zzccp zzb;
    private final Context zzc;
    private final zzcdh zzd;
    private R6.a zze;
    private InterfaceC4486q zzf;
    private AbstractC4480k zzg;
    private final long zzh;
    private final AtomicLong zzi;

    public zzccy(Context context, zzccp zzccpVar) {
        this.zzh = System.currentTimeMillis();
        this.zzi = new AtomicLong();
        this.zzc = context.getApplicationContext();
        this.zza = new AtomicReference();
        this.zzb = zzccpVar;
        this.zzd = new zzcdh();
    }

    public final Bundle getAdMetadata() {
        try {
            zzccp zzccpVar = this.zzb;
            if (zzccpVar != null) {
                return zzccpVar.zzg();
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
        return new Bundle();
    }

    public final String getAdUnitId() {
        String strZzn;
        String str;
        AtomicReference atomicReference = this.zza;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                strZzn = this.zzb.zzn();
            } catch (RemoteException e7) {
                H6.l.i("#007 Could not call remote method.", e7);
                strZzn = null;
            }
            if (strZzn == null) {
                this.zza.set("");
            } else {
                this.zza.set(strZzn);
            }
            str = (String) this.zza.get();
        }
        return str;
    }

    public final AbstractC4480k getFullScreenContentCallback() {
        return this.zzg;
    }

    public final R6.a getOnAdMetadataChangedListener() {
        return this.zze;
    }

    public final InterfaceC4486q getOnPaidEventListener() {
        return this.zzf;
    }

    public final long getPlacementId() {
        long j8;
        zzccp zzccpVar;
        AtomicLong atomicLong = this.zzi;
        long jZzq = 0;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                zzccpVar = this.zzb;
            } catch (RemoteException e7) {
                H6.l.i("#007 Could not call remote method.", e7);
            }
            if (zzccpVar != null) {
                jZzq = zzccpVar.zzq();
                AtomicLong atomicLong2 = this.zzi;
                atomicLong2.set(jZzq);
                j8 = atomicLong2.get();
            } else {
                AtomicLong atomicLong22 = this.zzi;
                atomicLong22.set(jZzq);
                j8 = atomicLong22.get();
            }
        }
        return j8;
    }

    @Override // R6.c
    public final x6.t getResponseInfo() {
        H0 h0Zzm = null;
        try {
            zzccp zzccpVar = this.zzb;
            if (zzccpVar != null) {
                h0Zzm = zzccpVar.zzm();
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
        return new x6.t(h0Zzm);
    }

    public final R6.b getRewardItem() {
        Xd.c cVar = R6.b.f10368Q8;
        try {
            zzccp zzccpVar = this.zzb;
            zzccm zzccmVarZzl = zzccpVar != null ? zzccpVar.zzl() : null;
            return zzccmVarZzl == null ? cVar : new zzccz(zzccmVarZzl);
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
            return cVar;
        }
    }

    @Override // R6.c
    public final void setFullScreenContentCallback(AbstractC4480k abstractC4480k) {
        this.zzg = abstractC4480k;
        this.zzd.zzb(abstractC4480k);
    }

    @Override // R6.c
    public final void setImmersiveMode(boolean z2) {
        try {
            zzccp zzccpVar = this.zzb;
            if (zzccpVar != null) {
                zzccpVar.zzp(z2);
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // R6.c
    public final void setOnAdMetadataChangedListener(R6.a aVar) {
        try {
            this.zze = aVar;
            zzccp zzccpVar = this.zzb;
            if (zzccpVar != null) {
                zzccpVar.zzf(new m1(aVar));
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // R6.c
    public final void setOnPaidEventListener(InterfaceC4486q interfaceC4486q) {
        try {
            this.zzf = interfaceC4486q;
            zzccp zzccpVar = this.zzb;
            if (zzccpVar != null) {
                zzccpVar.zzo(new n1(interfaceC4486q));
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final void setPlacementId(long j8) {
        try {
            zzccp zzccpVar = this.zzb;
            if (zzccpVar != null) {
                zzccpVar.zzr(j8);
                this.zzi.set(j8);
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // R6.c
    public final void setServerSideVerificationOptions(R6.e eVar) {
        if (eVar != null) {
            try {
                zzccp zzccpVar = this.zzb;
                if (zzccpVar != null) {
                    zzccpVar.zzh(new zzcdd(eVar));
                }
            } catch (RemoteException e7) {
                H6.l.i("#007 Could not call remote method.", e7);
            }
        }
    }

    @Override // R6.c
    public final void show(Activity activity, InterfaceC4487r interfaceC4487r) {
        zzcdh zzcdhVar = this.zzd;
        zzcdhVar.zzc(interfaceC4487r);
        if (activity == null) {
            H6.l.f("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzccp zzccpVar = this.zzb;
            if (zzccpVar != null) {
                zzccpVar.zze(zzcdhVar);
                zzccpVar.zzb(new BinderC3877b(activity));
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final void zza(Q0 q02, R6.d dVar) {
        try {
            zzccp zzccpVar = this.zzb;
            if (zzccpVar != null) {
                q02.f2371n = this.zzh;
                zzccpVar.zzc(w1.a(this.zzc, q02), new zzcdc(dVar, this));
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public zzccy(Context context, String str, zzccp zzccpVar) {
        this.zzh = System.currentTimeMillis();
        this.zzi = new AtomicLong();
        this.zzc = context.getApplicationContext();
        this.zza = new AtomicReference(str);
        this.zzb = zzccpVar;
        this.zzd = new zzcdh();
    }

    public zzccy(Context context, String str) {
        C0388o c0388o = C0392q.f2477g.f2479b;
        zzbvf zzbvfVar = new zzbvf();
        c0388o.getClass();
        this(context, str, (zzccp) new C0361b(c0388o, context, str, zzbvfVar).d(context, false));
    }
}
