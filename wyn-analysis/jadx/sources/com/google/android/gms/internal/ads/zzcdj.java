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
import q7.BinderC3877b;
import x6.AbstractC4480k;
import x6.InterfaceC4486q;
import x6.InterfaceC4487r;

/* loaded from: classes3.dex */
public final class zzcdj extends S6.a {
    private final String zza;
    private final zzccp zzb;
    private final Context zzc;
    private final zzcdh zzd;
    private AbstractC4480k zze;
    private R6.a zzf;
    private InterfaceC4486q zzg;
    private final long zzh = System.currentTimeMillis();
    private final AtomicLong zzi = new AtomicLong();

    public zzcdj(Context context, String str) {
        this.zza = str;
        this.zzc = context.getApplicationContext();
        C0388o c0388o = C0392q.f2477g.f2479b;
        zzbvf zzbvfVar = new zzbvf();
        c0388o.getClass();
        this.zzb = (zzccp) new C0361b(c0388o, context, str, zzbvfVar).d(context, false);
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
        return this.zza;
    }

    public final AbstractC4480k getFullScreenContentCallback() {
        return this.zze;
    }

    public final R6.a getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    public final InterfaceC4486q getOnPaidEventListener() {
        return this.zzg;
    }

    public final long getPlacementId() {
        AtomicLong atomicLong = this.zzi;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    zzccp zzccpVar = this.zzb;
                    if (zzccpVar != null) {
                        long jZzq = zzccpVar.zzq();
                        AtomicLong atomicLong2 = this.zzi;
                        atomicLong2.set(jZzq);
                        return atomicLong2.get();
                    }
                } catch (RemoteException e7) {
                    H6.l.i("#007 Could not call remote method.", e7);
                }
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // S6.a
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
        try {
            zzccp zzccpVar = this.zzb;
            zzccm zzccmVarZzl = zzccpVar != null ? zzccpVar.zzl() : null;
            if (zzccmVarZzl != null) {
                return new zzccz(zzccmVarZzl);
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
        return R6.b.f10368Q8;
    }

    @Override // S6.a
    public final void setFullScreenContentCallback(AbstractC4480k abstractC4480k) {
        this.zze = abstractC4480k;
        this.zzd.zzb(abstractC4480k);
    }

    @Override // S6.a
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

    @Override // S6.a
    public final void setOnAdMetadataChangedListener(R6.a aVar) {
        this.zzf = aVar;
        try {
            zzccp zzccpVar = this.zzb;
            if (zzccpVar != null) {
                zzccpVar.zzf(new m1(aVar));
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // S6.a
    public final void setOnPaidEventListener(InterfaceC4486q interfaceC4486q) {
        this.zzg = interfaceC4486q;
        try {
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

    @Override // S6.a
    public final void setServerSideVerificationOptions(R6.e eVar) {
        try {
            zzccp zzccpVar = this.zzb;
            if (zzccpVar != null) {
                zzccpVar.zzh(new zzcdd(eVar));
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // S6.a
    public final void show(Activity activity, InterfaceC4487r interfaceC4487r) {
        zzcdh zzcdhVar = this.zzd;
        zzcdhVar.zzc(interfaceC4487r);
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

    public final void zza(Q0 q02, S6.b bVar) {
        try {
            zzccp zzccpVar = this.zzb;
            if (zzccpVar != null) {
                q02.f2371n = this.zzh;
                zzccpVar.zzd(w1.a(this.zzc, q02), new zzcdi(bVar, this));
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }
}
