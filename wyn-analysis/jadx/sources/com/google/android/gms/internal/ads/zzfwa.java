package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzfwa implements zzfvt {
    private static zzfwa zza;
    private float zzb = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private zzfvo zzc;
    private zzfvs zzd;

    public zzfwa(zzfvp zzfvpVar, zzfvl zzfvlVar) {
    }

    public static zzfwa zza() {
        if (zza == null) {
            zza = new zzfwa(new zzfvp(), new zzfvl());
        }
        return zza;
    }

    public final void zzb(Context context) {
        this.zzc = new zzfvo(new Handler(), context, new zzfvk(), this);
    }

    public final void zzc() {
        zzfvr.zza().zzg(this);
        zzfvr.zza().zze();
        zzfxc.zzb().zzc();
        this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfvt
    public final void zzd(boolean z2) {
        if (z2) {
            zzfxc.zzb().zzc();
        } else {
            zzfxc.zzb().zze();
        }
    }

    public final void zze() {
        zzfxc.zzb().zzd();
        zzfvr.zza().zzf();
        this.zzc.zzb();
    }

    public final void zzf(float f10) {
        this.zzb = f10;
        if (this.zzd == null) {
            this.zzd = zzfvs.zza();
        }
        Iterator it = this.zzd.zzf().iterator();
        while (it.hasNext()) {
            ((zzfuy) it.next()).zzg().zzo(f10);
        }
    }

    public final float zzg() {
        return this.zzb;
    }
}
