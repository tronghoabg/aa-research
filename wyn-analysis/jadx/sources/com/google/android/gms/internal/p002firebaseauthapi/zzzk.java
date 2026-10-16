package com.google.android.gms.internal.p002firebaseauthapi;

import J8.C0630e;
import J8.F;
import J8.I;
import a.AbstractC1304a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;

/* loaded from: classes.dex */
public final class zzzk {
    private final zzaej zza;

    public zzzk(zzaej zzaejVar) {
        AbstractC1732v.i(zzaejVar);
        this.zza = zzaejVar;
    }

    public final void zzb(String str, String str2, zzade zzadeVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.f(str2);
        AbstractC1732v.i(zzadeVar);
        zza(str, new zzabc(this, str2, zzadeVar));
    }

    public final void zzc(String str, String str2, zzade zzadeVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.f(str2);
        AbstractC1732v.i(zzadeVar);
        zza(str, new zzabf(this, str2, zzadeVar));
    }

    public final void zzd(String str, String str2, zzade zzadeVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.i(zzadeVar);
        this.zza.zza(new zzagw(str, null, str2), new zzzx(this, zzadeVar));
    }

    public final void zze(String str, String str2, zzade zzadeVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.i(zzadeVar);
        this.zza.zza(new zzafm(str, str2), new zzzv(this, zzadeVar));
    }

    public final void zzf(String str, zzade zzadeVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.i(zzadeVar);
        zza(str, new zzaag(this, zzadeVar));
    }

    public static void zza(zzzk zzzkVar, zzaht zzahtVar, zzade zzadeVar, zzaem zzaemVar) {
        Status statusI0;
        if (zzahtVar.zzo()) {
            I iZzb = zzahtVar.zzb();
            String strZzc = zzahtVar.zzc();
            String strZzj = zzahtVar.zzj();
            if (zzahtVar.zzm()) {
                statusI0 = new Status(17012, null, null, null);
            } else {
                statusI0 = AbstractC1304a.i0(zzahtVar.zzd());
            }
            zzadeVar.zza(new zzzi(statusI0, iZzb, strZzc, strZzj));
            return;
        }
        zzzkVar.zza(new zzagl(zzahtVar.zzi(), zzahtVar.zze(), Long.valueOf(zzahtVar.zza()), "Bearer"), zzahtVar.zzh(), zzahtVar.zzg(), Boolean.valueOf(zzahtVar.zzn()), zzahtVar.zzb(), zzadeVar, zzaemVar);
    }

    public final void zzf(String str, String str2, zzade zzadeVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.f(str2);
        AbstractC1732v.i(zzadeVar);
        zza(str2, new zzaaj(this, str, zzadeVar));
    }

    private final void zzd(zzagg zzaggVar, zzade zzadeVar) {
        AbstractC1732v.i(zzaggVar);
        AbstractC1732v.i(zzadeVar);
        this.zza.zza(zzaggVar, new zzaay(this, zzadeVar));
    }

    public final void zzb(String str, zzade zzadeVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.i(zzadeVar);
        this.zza.zza(new zzafz(str), new zzzn(this, zzadeVar));
    }

    public final void zzc(String str, zzade zzadeVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.i(zzadeVar);
        zza(str, new zzaav(this, zzadeVar));
    }

    public final void zze(String str, zzade zzadeVar) {
        AbstractC1732v.i(zzadeVar);
        this.zza.zza(new zzahg(str), new zzabb(this, zzadeVar));
    }

    public final void zzc(zzagg zzaggVar, zzade zzadeVar) {
        zzd(zzaggVar, zzadeVar);
    }

    public final void zzd(String str, zzade zzadeVar) {
        AbstractC1732v.i(zzadeVar);
        this.zza.zza(str, new zzaaz(this, zzadeVar));
    }

    public final void zzb(zzagg zzaggVar, zzade zzadeVar) {
        AbstractC1732v.f(zzaggVar.zzc());
        AbstractC1732v.i(zzadeVar);
        this.zza.zza(zzaggVar, new zzzu(this, zzadeVar));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzade zzadeVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.f(str2);
        AbstractC1732v.i(zzadeVar);
        this.zza.zza(new zzahy(str, str2, str3, str4), new zzzp(this, zzadeVar));
    }

    public static /* synthetic */ void zza(zzzk zzzkVar, zzade zzadeVar, zzahg zzahgVar, zzaem zzaemVar) {
        AbstractC1732v.i(zzadeVar);
        AbstractC1732v.i(zzahgVar);
        AbstractC1732v.i(zzaemVar);
        zzzkVar.zza.zza(zzahgVar, new zzaad(zzzkVar, zzadeVar, zzaemVar));
    }

    public static /* synthetic */ void zza(zzzk zzzkVar, zzade zzadeVar, zzagl zzaglVar, zzahb zzahbVar, zzaem zzaemVar) {
        AbstractC1732v.i(zzadeVar);
        AbstractC1732v.i(zzaglVar);
        AbstractC1732v.i(zzahbVar);
        AbstractC1732v.i(zzaemVar);
        zzzkVar.zza.zza(new zzagc(zzaglVar.zzc()), new zzzq(zzzkVar, zzaemVar, zzadeVar, zzaglVar, zzahbVar));
    }

    public static /* synthetic */ void zza(zzzk zzzkVar, zzade zzadeVar, zzagl zzaglVar, zzage zzageVar, zzahb zzahbVar, zzaem zzaemVar) {
        AbstractC1732v.i(zzadeVar);
        AbstractC1732v.i(zzaglVar);
        AbstractC1732v.i(zzageVar);
        AbstractC1732v.i(zzahbVar);
        AbstractC1732v.i(zzaemVar);
        zzzkVar.zza.zza(zzahbVar, new zzzt(zzzkVar, zzahbVar, zzageVar, zzadeVar, zzaglVar, zzaemVar));
    }

    public final void zza(String str, String str2, zzade zzadeVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.i(zzadeVar);
        zzahb zzahbVar = new zzahb();
        zzahbVar.zze(str);
        zzahbVar.zzh(str2);
        this.zza.zza(zzahbVar, new zzabe(this, zzadeVar));
    }

    public final void zza(zzagw zzagwVar, zzade zzadeVar) {
        AbstractC1732v.f(zzagwVar.zzb());
        AbstractC1732v.i(zzadeVar);
        this.zza.zza(zzagwVar, new zzzz(this, zzadeVar));
    }

    public final void zza(String str, String str2, String str3, String str4, zzade zzadeVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.f(str2);
        AbstractC1732v.i(zzadeVar);
        this.zza.zza(new zzahg(str, str2, null, str3, str4, null), new zzzm(this, zzadeVar));
    }

    public final void zza(String str, zzade zzadeVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.i(zzadeVar);
        zza(str, new zzaax(this, zzadeVar));
    }

    private final void zza(String str, zzael<zzagl> zzaelVar) {
        AbstractC1732v.i(zzaelVar);
        AbstractC1732v.f(str);
        zzagl zzaglVarZzb = zzagl.zzb(str);
        if (zzaglVarZzb.zzg()) {
            zzaelVar.zza((zzael<zzagl>) zzaglVarZzb);
        } else {
            this.zza.zza(new zzafz(zzaglVarZzb.zzd()), new zzabh(this, zzaelVar));
        }
    }

    public final void zza(zzafp zzafpVar, String str, zzade zzadeVar) {
        AbstractC1732v.i(zzafpVar);
        AbstractC1732v.i(zzadeVar);
        zza(str, new zzaap(this, zzafpVar, zzadeVar));
    }

    public final void zza(zzafr zzafrVar, zzade zzadeVar) {
        AbstractC1732v.i(zzafrVar);
        AbstractC1732v.i(zzadeVar);
        this.zza.zza(zzafrVar, new zzaar(this, zzadeVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzafn zzafnVar, zzade zzadeVar) {
        AbstractC1732v.i(zzafnVar);
        AbstractC1732v.i(zzadeVar);
        this.zza.zza(zzafnVar, new zzzr(this, zzadeVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzagl zzaglVar, String str, String str2, Boolean bool, I i5, zzade zzadeVar, zzaem zzaemVar) {
        AbstractC1732v.i(zzaglVar);
        AbstractC1732v.i(zzaemVar);
        AbstractC1732v.i(zzadeVar);
        this.zza.zza(new zzagc(zzaglVar.zzc()), new zzzs(this, zzaemVar, str2, str, bool, i5, zzadeVar, zzaglVar));
    }

    public final void zza(zzagi zzagiVar, zzade zzadeVar) {
        AbstractC1732v.i(zzagiVar);
        AbstractC1732v.i(zzadeVar);
        this.zza.zza(zzagiVar, new zzaas(this, zzadeVar));
    }

    public final void zza(zzagj zzagjVar, zzade zzadeVar) {
        AbstractC1732v.i(zzagjVar);
        AbstractC1732v.i(zzadeVar);
        this.zza.zza(zzagjVar, new zzaat(this, zzadeVar));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzade zzadeVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.f(str2);
        AbstractC1732v.f(str3);
        AbstractC1732v.i(zzadeVar);
        zza(str3, new zzaaa(this, str, str2, str4, str5, zzadeVar));
    }

    public final void zza(String str, zzahr zzahrVar, zzade zzadeVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.i(zzahrVar);
        AbstractC1732v.i(zzadeVar);
        zza(str, new zzaae(this, zzahrVar, zzadeVar));
    }

    public final void zza(String str, zzaia zzaiaVar, zzade zzadeVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.i(zzaiaVar);
        AbstractC1732v.i(zzadeVar);
        zza(str, new zzaac(this, zzaiaVar, zzadeVar));
    }

    public final void zza(zzagy zzagyVar, zzade zzadeVar) {
        this.zza.zza(zzagyVar, new zzaba(this, zzadeVar));
    }

    public final void zza(zzagg zzaggVar, zzade zzadeVar) {
        AbstractC1732v.f(zzaggVar.zzd());
        AbstractC1732v.i(zzadeVar);
        zzd(zzaggVar, zzadeVar);
    }

    public final void zza(zzagz zzagzVar, zzade zzadeVar) {
        AbstractC1732v.f(zzagzVar.zzd());
        AbstractC1732v.i(zzadeVar);
        this.zza.zza(zzagzVar, new zzzy(this, zzadeVar));
    }

    public final void zza(zzahr zzahrVar, zzade zzadeVar) {
        AbstractC1732v.i(zzahrVar);
        AbstractC1732v.i(zzadeVar);
        zzahrVar.zzb(true);
        this.zza.zza(zzahrVar, new zzaan(this, zzadeVar));
    }

    public final void zza(zzahw zzahwVar, zzade zzadeVar) {
        AbstractC1732v.i(zzahwVar);
        AbstractC1732v.i(zzadeVar);
        this.zza.zza(zzahwVar, new zzzw(this, zzadeVar));
    }

    public final void zza(C0630e c0630e, String str, zzade zzadeVar) {
        AbstractC1732v.i(c0630e);
        AbstractC1732v.i(zzadeVar);
        if (c0630e.f5802e) {
            zza(c0630e.f5801d, new zzzo(this, c0630e, str, zzadeVar));
        } else {
            zza(new zzafn(c0630e, null, str), zzadeVar);
        }
    }

    public final void zza(zzaia zzaiaVar, zzade zzadeVar) {
        AbstractC1732v.i(zzaiaVar);
        AbstractC1732v.i(zzadeVar);
        this.zza.zza(zzaiaVar, new zzaab(this, zzadeVar));
    }

    public final void zza(zzahi zzahiVar, zzade zzadeVar) {
        AbstractC1732v.i(zzahiVar);
        AbstractC1732v.i(zzadeVar);
        this.zza.zza(zzahiVar, new zzaam(this, zzahiVar, zzadeVar));
    }

    public final void zza(zzahk zzahkVar, zzade zzadeVar) {
        AbstractC1732v.i(zzahkVar);
        AbstractC1732v.i(zzadeVar);
        this.zza.zza(zzahkVar, new zzaaq(this, zzadeVar));
    }

    public final void zza(String str, String str2, String str3, zzade zzadeVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.f(str2);
        AbstractC1732v.i(zzadeVar);
        zza(str, new zzaal(this, str2, str3, zzadeVar));
    }

    public final void zza(String str, F f10, zzade zzadeVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.i(f10);
        AbstractC1732v.i(zzadeVar);
        zza(str, new zzabd(this, f10, zzadeVar));
    }
}
