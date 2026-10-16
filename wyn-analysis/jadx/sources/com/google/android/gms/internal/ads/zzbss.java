package com.google.android.gms.internal.ads;

import D6.BinderC0397t;
import D6.C0378j;
import D6.C0388o;
import D6.C0392q;
import D6.H0;
import D6.Q0;
import D6.n1;
import D6.t1;
import D6.w1;
import D6.x1;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.MobileAds;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import q7.BinderC3877b;
import x6.AbstractC4473d;
import x6.AbstractC4480k;
import x6.C4481l;
import x6.InterfaceC4486q;

/* loaded from: classes3.dex */
public final class zzbss extends y6.d {
    private final Context zza;
    private final w1 zzb;
    private final D6.L zzc;
    private final AtomicReference zzd;
    private final zzbvf zze;
    private final long zzf;
    private y6.f zzg;
    private AbstractC4480k zzh;
    private InterfaceC4486q zzi;
    private final AtomicLong zzj;

    public zzbss(Context context, D6.L l10) {
        this.zze = new zzbvf();
        this.zzf = System.currentTimeMillis();
        this.zzj = new AtomicLong();
        this.zza = context;
        this.zzd = new AtomicReference();
        this.zzb = w1.f2529a;
        this.zzc = l10;
    }

    public final String getAdUnitId() {
        String strZzu;
        String str;
        AtomicReference atomicReference = this.zzd;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                strZzu = this.zzc.zzu();
            } catch (RemoteException e7) {
                H6.l.i("#007 Could not call remote method.", e7);
                strZzu = null;
            }
            if (strZzu == null) {
                this.zzd.set("");
            } else {
                this.zzd.set(strZzu);
            }
            str = (String) this.zzd.get();
        }
        return str;
    }

    public final y6.f getAppEventListener() {
        return this.zzg;
    }

    public final AbstractC4480k getFullScreenContentCallback() {
        return this.zzh;
    }

    public final InterfaceC4486q getOnPaidEventListener() {
        return this.zzi;
    }

    public final long getPlacementId() {
        AtomicLong atomicLong = this.zzj;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    D6.L l10 = this.zzc;
                    if (l10 != null) {
                        long jZzU = l10.zzU();
                        AtomicLong atomicLong2 = this.zzj;
                        atomicLong2.set(jZzU);
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

    @Override // I6.a
    public final x6.t getResponseInfo() {
        H0 h0Zzt = null;
        try {
            D6.L l10 = this.zzc;
            if (l10 != null) {
                h0Zzt = l10.zzt();
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
        return new x6.t(h0Zzt);
    }

    @Override // y6.d
    public final void setAppEventListener(y6.f fVar) {
        try {
            this.zzg = fVar;
            D6.L l10 = this.zzc;
            if (l10 != null) {
                l10.zzi(fVar != null ? new zzbfm(fVar) : null);
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // I6.a
    public final void setFullScreenContentCallback(AbstractC4480k abstractC4480k) {
        try {
            this.zzh = abstractC4480k;
            D6.L l10 = this.zzc;
            if (l10 != null) {
                l10.zzS(new BinderC0397t(abstractC4480k));
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // I6.a
    public final void setImmersiveMode(boolean z2) {
        try {
            D6.L l10 = this.zzc;
            if (l10 != null) {
                l10.zzK(z2);
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // I6.a
    public final void setOnPaidEventListener(InterfaceC4486q interfaceC4486q) {
        try {
            this.zzi = interfaceC4486q;
            D6.L l10 = this.zzc;
            if (l10 != null) {
                l10.zzP(new n1(interfaceC4486q));
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final void setPlacementId(long j8) {
        try {
            D6.L l10 = this.zzc;
            if (l10 != null) {
                l10.zzT(j8);
                this.zzj.set(j8);
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // I6.a
    public final void show(Activity activity) {
        if (activity == null) {
            H6.l.f("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            D6.L l10 = this.zzc;
            if (l10 != null) {
                l10.zzR(new BinderC3877b(activity));
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final void zza(Q0 q02, AbstractC4473d abstractC4473d) {
        try {
            D6.L l10 = this.zzc;
            if (l10 != null) {
                q02.f2371n = this.zzf;
                w1 w1Var = this.zzb;
                Context context = this.zza;
                w1Var.getClass();
                l10.zzQ(w1.a(context, q02), new t1(abstractC4473d, this));
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
            abstractC4473d.onAdFailedToLoad(new C4481l(0, "Internal Error.", MobileAds.ERROR_DOMAIN, null, null));
        }
    }

    public zzbss(Context context, String str) {
        zzbvf zzbvfVar = new zzbvf();
        this.zze = zzbvfVar;
        this.zzf = System.currentTimeMillis();
        this.zzj = new AtomicLong();
        this.zza = context;
        this.zzd = new AtomicReference(str);
        this.zzb = w1.f2529a;
        C0388o c0388o = C0392q.f2477g.f2479b;
        x1 x1Var = new x1();
        c0388o.getClass();
        this.zzc = (D6.L) new C0378j(c0388o, context, x1Var, str, zzbvfVar).d(context, false);
    }

    public zzbss(Context context, String str, D6.L l10) {
        w1 w1Var = w1.f2529a;
        this.zze = new zzbvf();
        this.zzf = System.currentTimeMillis();
        this.zzj = new AtomicLong();
        this.zza = context;
        this.zzd = new AtomicReference(str);
        this.zzb = w1Var;
        this.zzc = l10;
    }
}
