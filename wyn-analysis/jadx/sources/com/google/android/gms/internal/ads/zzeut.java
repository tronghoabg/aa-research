package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import p7.AbstractC3772b;

/* loaded from: classes3.dex */
public final class zzeut implements zzfcs {
    private final zzhcp zza;
    private final zzflg zzb;

    public zzeut(zzhcp zzhcpVar, zzflg zzflgVar, zzflw zzflwVar) {
        this.zza = zzhcpVar;
        this.zzb = zzflgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzeus
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 5;
    }

    public final zzeuu zzc() throws GeneralSecurityException {
        List listAsList;
        zzbio zzbioVar = zzbix.zzie;
        C0395s c0395s = C0395s.f2489e;
        String strZza = null;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            String strY = AbstractC3772b.Y(this.zzb.zzd);
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzig)).booleanValue()) {
                listAsList = Arrays.asList(((String) c0395s.f2492c.zzd(zzbix.zzih)).split(","));
            } else {
                listAsList = Arrays.asList(((String) c0395s.f2492c.zzd(zzbix.zzif)).split(","));
            }
            if (listAsList.contains(AbstractC3772b.X(strY))) {
                strZza = zzflw.zza();
            }
        }
        return new zzeuu(strZza);
    }
}
