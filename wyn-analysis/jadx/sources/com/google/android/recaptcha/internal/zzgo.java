package com.google.android.recaptcha.internal;

import Ef.C0514u;
import Ef.InterfaceC0513t;
import android.webkit.JavascriptInterface;
import ef.C2515C;
import java.util.MissingResourceException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class zzgo {
    final /* synthetic */ zzgv zza;

    @Nullable
    private Long zzb;

    @NotNull
    private final zzgz zzc = zzgz.zzb();

    public zzgo(zzgv zzgvVar) {
        this.zza = zzgvVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    @Nullable
    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzlce(@NotNull String str) throws zzlc, MissingResourceException {
        zzgv zzgvVar = this.zza;
        if (zzgvVar.zzq().zzb == null) {
            zzdf zzdfVar = zzgvVar.zzm;
            if (zzdfVar != null) {
                zzdfVar.zza();
            }
            this.zza.zzm = null;
        }
        zzb();
        zzop zzopVarZzJ = zzop.zzJ(zzhz.zzh().zzj(str));
        zzrd zzrdVarZzi = zzre.zzi();
        zzrdVarZzi.zze(zzopVarZzJ);
        this.zza.zzl.zze((zzre) zzrdVarZzi.zzj());
    }

    @JavascriptInterface
    public final void zzlsm(@NotNull String str) {
        zzb();
        zzrd zzrdVarZzi = zzre.zzi();
        zzrdVarZzi.zzp(zzpe.zzi(zzhz.zzh().zzj(str)));
        this.zza.zzl.zze((zzre) zzrdVarZzi.zzj());
    }

    @JavascriptInterface
    public final void zzoid(@NotNull String str) throws zzlc {
        zzb();
        zzqz zzqzVarZzg = zzqz.zzg(zzhz.zzh().zzj(str));
        zzqzVarZzg.zzi().name();
        if (zzqzVarZzg.zzi() != zzrc.JS_CODE_SUCCESS) {
            zzqzVarZzg.zzi().name();
            int i5 = zzbj.zza;
            zzbj zzbjVarZza = zzbi.zza(zzqzVarZzg.zzi());
            this.zza.zzu().hashCode();
            ((C0514u) this.zza.zzu()).Y(zzbjVarZza);
            return;
        }
        this.zza.zzu().hashCode();
        if (((C0514u) this.zza.zzu()).K(C2515C.f34653a)) {
            return;
        }
        this.zza.zzu().hashCode();
    }

    @JavascriptInterface
    public final void zzrp(@NotNull String str) {
        zzb();
        zzdv zzdvVar = this.zza.zzb;
        if (zzdvVar == null) {
            zzdvVar = null;
        }
        zzdvVar.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(@NotNull String str) throws zzlc {
        zzb();
        zzpw zzpwVarZzi = zzpw.zzi(zzhz.zzh().zzj(str));
        zzpwVarZzi.toString();
        InterfaceC0513t interfaceC0513t = (InterfaceC0513t) this.zza.zzi.remove(zzpwVarZzi.zzk());
        if (interfaceC0513t != null) {
            ((C0514u) interfaceC0513t).K(zzpwVarZzi);
        }
    }
}
