package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;

/* loaded from: classes3.dex */
public final class zzewn implements zzfcq {
    private final Integer zza;

    private zzewn(Integer num) {
        this.zza = num;
    }

    public static zzewn zzb(H6.a aVar) {
        zzbio zzbioVar = zzbix.zzlH;
        C0395s c0395s = C0395s.f2489e;
        zzbiv zzbivVar = c0395s.f2492c;
        zzbiv zzbivVar2 = c0395s.f2492c;
        if (!((Boolean) zzbivVar.zzd(zzbioVar)).booleanValue()) {
            return new zzewn(null);
        }
        U u10 = C6.n.f1857D.f1863c;
        int extensionVersion = 0;
        try {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30 && SdkExtensions.getExtensionVersion(30) > 3) {
                extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            } else if (((Boolean) zzbivVar2.zzd(zzbix.zzlK)).booleanValue() && aVar.f4929c >= ((Integer) zzbivVar2.zzd(zzbix.zzlJ)).intValue() && i5 >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                extensionVersion = SdkExtensions.getExtensionVersion(31);
            }
        } catch (Exception e7) {
            C6.n.f1857D.f1868h.zzh(e7, "AdUtil.getAdServicesExtensionVersion");
        }
        return new zzewn(Integer.valueOf(extensionVersion));
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Integer num = this.zza;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
