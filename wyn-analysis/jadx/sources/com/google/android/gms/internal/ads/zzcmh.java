package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.J0;
import D6.N0;
import D6.r1;
import android.os.RemoteException;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import x.C4412e;

/* loaded from: classes3.dex */
public final class zzcmh extends J0 {
    private final zzchu zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private N0 zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbnq zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcmh(zzchu zzchuVar, float f10, boolean z2, boolean z10) {
        this.zza = zzchuVar;
        this.zzi = f10;
        this.zzc = z2;
        this.zzd = z10;
    }

    private final void zzw(String str, Map map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put(HandleInvocationsFromAdViewer.KEY_ACTION, str);
        zzcfy.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzt(map2);
            }
        });
    }

    private final void zzx(final int i5, final int i10, final boolean z2, final boolean z10) {
        zzcfy.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzu(i5, i10, z2, z10);
            }
        });
    }

    public final void zzc(r1 r1Var) {
        Object obj = this.zzb;
        boolean z2 = r1Var.f2487b;
        boolean z10 = r1Var.f2488c;
        synchronized (obj) {
            this.zzl = z2;
            this.zzm = z10;
        }
        boolean z11 = r1Var.f2486a;
        String str = true != z2 ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        String str2 = true != z10 ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        String str3 = true != z11 ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        C4412e c4412e = new C4412e(3);
        c4412e.put("muteStart", str3);
        c4412e.put("customControlsRequested", str);
        c4412e.put("clickToExpandRequested", str2);
        zzw("initialState", DesugarCollections.unmodifiableMap(c4412e));
    }

    public final void zzd(float f10) {
        synchronized (this.zzb) {
            this.zzj = f10;
        }
    }

    @Override // D6.L0
    public final void zze() {
        zzw("play", null);
    }

    @Override // D6.L0
    public final void zzf() {
        zzw("pause", null);
    }

    @Override // D6.L0
    public final void zzg(boolean z2) {
        zzw(true != z2 ? "unmute" : "mute", null);
    }

    @Override // D6.L0
    public final boolean zzh() {
        boolean z2;
        synchronized (this.zzb) {
            z2 = this.zzh;
        }
        return z2;
    }

    @Override // D6.L0
    public final int zzi() {
        int i5;
        synchronized (this.zzb) {
            i5 = this.zze;
        }
        return i5;
    }

    @Override // D6.L0
    public final float zzj() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzi;
        }
        return f10;
    }

    @Override // D6.L0
    public final float zzk() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzj;
        }
        return f10;
    }

    @Override // D6.L0
    public final void zzl(N0 n02) {
        synchronized (this.zzb) {
            this.zzf = n02;
        }
    }

    @Override // D6.L0
    public final float zzm() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzk;
        }
        return f10;
    }

    @Override // D6.L0
    public final boolean zzn() {
        boolean z2;
        synchronized (this.zzb) {
            try {
                z2 = false;
                if (this.zzc && this.zzl) {
                    z2 = true;
                }
            } finally {
            }
        }
        return z2;
    }

    @Override // D6.L0
    public final N0 zzo() throws RemoteException {
        N0 n02;
        synchronized (this.zzb) {
            n02 = this.zzf;
        }
        return n02;
    }

    @Override // D6.L0
    public final boolean zzp() {
        boolean z2;
        Object obj = this.zzb;
        boolean zZzn = zzn();
        synchronized (obj) {
            z2 = false;
            if (!zZzn) {
                try {
                    if (this.zzm && this.zzd) {
                        z2 = true;
                    }
                } finally {
                }
            }
        }
        return z2;
    }

    @Override // D6.L0
    public final void zzq() {
        zzw("stop", null);
    }

    public final void zzr() {
        boolean z2;
        int i5;
        synchronized (this.zzb) {
            z2 = this.zzh;
            i5 = this.zze;
            this.zze = 3;
        }
        zzx(i5, 3, z2, z2);
    }

    public final void zzs(float f10, float f11, int i5, boolean z2, float f12) {
        boolean z10;
        boolean z11;
        int i10;
        synchronized (this.zzb) {
            try {
                z10 = true;
                if (f11 == this.zzi && f12 == this.zzk) {
                    z10 = false;
                }
                this.zzi = f11;
                if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzox)).booleanValue()) {
                    this.zzj = f10;
                }
                z11 = this.zzh;
                this.zzh = z2;
                i10 = this.zze;
                this.zze = i5;
                float f13 = this.zzk;
                this.zzk = f12;
                if (Math.abs(f12 - f13) > 1.0E-4f) {
                    this.zza.zzE().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            try {
                zzbnq zzbnqVar = this.zzn;
                if (zzbnqVar != null) {
                    zzbnqVar.zze();
                }
            } catch (RemoteException e7) {
                H6.l.i("#007 Could not call remote method.", e7);
            }
        }
        zzx(i10, i5, z11, z2);
    }

    public final /* synthetic */ void zzt(Map map) {
        this.zza.zze("pubVideoCmd", map);
    }

    public final /* synthetic */ void zzu(int i5, int i10, boolean z2, boolean z10) {
        int i11;
        boolean z11;
        boolean z12;
        N0 n02;
        N0 n03;
        N0 n04;
        synchronized (this.zzb) {
            try {
                boolean z13 = this.zzg;
                if (z13 || i10 != 1) {
                    i11 = i10;
                    z11 = false;
                } else {
                    i10 = 1;
                    i11 = 1;
                    z11 = true;
                }
                boolean z14 = i5 != i10;
                if (z14 && i11 == 1) {
                    z12 = true;
                    i11 = 1;
                } else {
                    z12 = false;
                }
                boolean z15 = z14 && i11 == 2;
                boolean z16 = z14 && i11 == 3;
                this.zzg = z13 || z11;
                if (z11) {
                    try {
                        N0 n05 = this.zzf;
                        if (n05 != null) {
                            n05.zze();
                        }
                    } catch (RemoteException e7) {
                        H6.l.i("#007 Could not call remote method.", e7);
                    }
                }
                if (z12 && (n04 = this.zzf) != null) {
                    n04.zzf();
                }
                if (z15 && (n03 = this.zzf) != null) {
                    n03.zzg();
                }
                if (z16) {
                    N0 n06 = this.zzf;
                    if (n06 != null) {
                        n06.zzh();
                    }
                    this.zza.zzz();
                }
                if (z2 != z10 && (n02 = this.zzf) != null) {
                    n02.n(z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzv(zzbnq zzbnqVar) {
        synchronized (this.zzb) {
            this.zzn = zzbnqVar;
        }
    }
}
