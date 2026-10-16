package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzbic;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzdob implements zzdcz, zzdkl {
    private final zzced zza;
    private final Context zzb;
    private final zzceg zzc;
    private final View zzd;
    private String zze;
    private final zzbic.zza.EnumC0140zza zzf;
    private final zzfkn zzg;

    public zzdob(zzced zzcedVar, Context context, zzceg zzcegVar, View view, zzbic.zza.EnumC0140zza enumC0140zza, zzfkn zzfknVar) {
        this.zza = zzcedVar;
        this.zzb = context;
        this.zzc = zzcegVar;
        this.zzd = view;
        this.zzf = enumC0140zza;
        this.zzg = zzfknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzd(zzcbw zzcbwVar, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zzceg zzcegVar = this.zzc;
        Context context = this.zzb;
        if (zzcegVar.zzb(context) && this.zzg.zzaG) {
            try {
                zzcegVar.zzp(context, zzcegVar.zzk(context), this.zza.zzb(), zzcbwVar.zzb(), zzcbwVar.zzc());
            } catch (RemoteException e7) {
                int i5 = G6.L.f4523b;
                H6.l.g("Remote Exception to get reward item.", e7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdK() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzds() {
        if (this.zzg.zzaG) {
            this.zza.zza(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdt() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.zzg.zzaG) {
            View view = this.zzd;
            if (view != null && this.zze != null) {
                this.zzc.zzh(view.getContext(), this.zze);
            }
            this.zza.zza(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzh() {
        zzbic.zza.EnumC0140zza enumC0140zza = this.zzf;
        if (enumC0140zza != zzbic.zza.EnumC0140zza.APP_OPEN && this.zzg.zzaG) {
            String strZzg = this.zzc.zzg(this.zzb);
            this.zze = strZzg;
            this.zze = String.valueOf(strZzg).concat(enumC0140zza == zzbic.zza.EnumC0140zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }
}
