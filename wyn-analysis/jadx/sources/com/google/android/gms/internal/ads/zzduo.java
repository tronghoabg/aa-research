package com.google.android.gms.internal.ads;

import D6.L0;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q7.BinderC3877b;
import q7.InterfaceC3876a;
import x.C4412e;
import x.C4429v;

/* loaded from: classes3.dex */
public final class zzduo extends zzbnb {
    private final Context zza;
    private final zzdqb zzb;
    private zzdra zzc;
    private zzdpw zzd;

    public zzduo(Context context, zzdqb zzdqbVar, zzdra zzdraVar, zzdpw zzdpwVar) {
        this.zza = context;
        this.zzb = zzdqbVar;
        this.zzc = zzdraVar;
        this.zzd = zzdpwVar;
    }

    public final /* synthetic */ zzdpw zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final String zze(String str) {
        return (String) this.zzb.zzad().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final zzbml zzf(String str) {
        return (zzbml) this.zzb.zzaa().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final List zzg() {
        try {
            zzdqb zzdqbVar = this.zzb;
            C4429v c4429vZzaa = zzdqbVar.zzaa();
            C4429v c4429vZzad = zzdqbVar.zzad();
            String[] strArr = new String[c4429vZzaa.f47563c + c4429vZzad.f47563c];
            int i5 = 0;
            for (int i10 = 0; i10 < c4429vZzaa.f47563c; i10++) {
                strArr[i5] = (String) c4429vZzaa.g(i10);
                i5++;
            }
            for (int i11 = 0; i11 < c4429vZzad.f47563c; i11++) {
                strArr[i5] = (String) c4429vZzad.g(i11);
                i5++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e7) {
            C6.n.f1857D.f1868h.zzh(e7, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final String zzh() {
        return this.zzb.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final void zzi(String str) {
        zzdpw zzdpwVar = this.zzd;
        if (zzdpwVar != null) {
            zzdpwVar.zza(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final void zzj() {
        zzdpw zzdpwVar = this.zzd;
        if (zzdpwVar != null) {
            zzdpwVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final L0 zzk() {
        return this.zzb.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final void zzl() {
        zzdpw zzdpwVar = this.zzd;
        if (zzdpwVar != null) {
            zzdpwVar.zzd();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final InterfaceC3876a zzm() {
        return new BinderC3877b(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final boolean zzn(InterfaceC3876a interfaceC3876a) throws SecurityException {
        zzdra zzdraVar;
        Object objS = BinderC3877b.S(interfaceC3876a);
        if (!(objS instanceof ViewGroup) || (zzdraVar = this.zzc) == null || !zzdraVar.zzd((ViewGroup) objS)) {
            return false;
        }
        this.zzb.zzT().zzaq(new zzdun(this, "_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final boolean zzo() {
        zzdpw zzdpwVar = this.zzd;
        if (zzdpwVar != null && !zzdpwVar.zzM()) {
            return false;
        }
        zzdqb zzdqbVar = this.zzb;
        return zzdqbVar.zzW() != null && zzdqbVar.zzT() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final boolean zzp() {
        zzdqb zzdqbVar = this.zzb;
        zzelv zzelvVarZzZ = zzdqbVar.zzZ();
        if (zzelvVarZzZ == null) {
            int i5 = G6.L.f4523b;
            H6.l.f("Trying to start OMID session before creation.");
            return false;
        }
        C6.n.f1857D.f1884y.zze(zzelvVarZzZ.zza());
        if (zzdqbVar.zzW() == null) {
            return true;
        }
        zzdqbVar.zzW().zze("onSdkLoaded", new C4412e(0));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final void zzq(InterfaceC3876a interfaceC3876a) throws SecurityException {
        zzdpw zzdpwVar;
        Object objS = BinderC3877b.S(interfaceC3876a);
        if (!(objS instanceof View) || this.zzb.zzZ() == null || (zzdpwVar = this.zzd) == null) {
            return;
        }
        zzdpwVar.zzN((View) objS);
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final void zzr() {
        try {
            String strZzac = this.zzb.zzac();
            if (Objects.equals(strZzac, "Google")) {
                int i5 = G6.L.f4523b;
                H6.l.f("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(strZzac)) {
                int i10 = G6.L.f4523b;
                H6.l.f("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdpw zzdpwVar = this.zzd;
                if (zzdpwVar != null) {
                    zzdpwVar.zzL(strZzac, false);
                }
            }
        } catch (NullPointerException e7) {
            C6.n.f1857D.f1868h.zzh(e7, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final zzbmi zzs() throws RemoteException {
        try {
            return this.zzd.zzP().zza();
        } catch (NullPointerException e7) {
            C6.n.f1857D.f1868h.zzh(e7, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final boolean zzt(InterfaceC3876a interfaceC3876a) throws SecurityException {
        zzdra zzdraVar;
        Object objS = BinderC3877b.S(interfaceC3876a);
        if (!(objS instanceof ViewGroup) || (zzdraVar = this.zzc) == null || !zzdraVar.zze((ViewGroup) objS)) {
            return false;
        }
        this.zzb.zzU().zzaq(new zzdun(this, "_videoMediaView"));
        return true;
    }
}
