package com.google.android.gms.internal.p002firebaseauthapi;

import N0.a;
import android.text.TextUtils;
import cb.AbstractC1593a;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import s8.g;

/* loaded from: classes.dex */
final class zzadv extends zzaej implements zzafd {
    private zzadp zza;
    private zzado zzb;
    private zzaes zzc;
    private final zzads zzd;
    private final g zze;
    private String zzf;
    private zzadu zzg;

    public zzadv(g gVar, zzads zzadsVar) {
        this(gVar, zzadsVar, null, null, null);
    }

    private final zzadu zzb() {
        if (this.zzg == null) {
            this.zzg = new zzadu(this.zze, this.zzd.zzb());
        }
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzafm zzafmVar, zzael<zzafl> zzaelVar) throws IOException {
        AbstractC1732v.i(zzafmVar);
        AbstractC1732v.i(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/createAuthUri", this.zzf), zzafmVar, zzaelVar, zzafl.class, zzadpVar.zza);
    }

    private zzadv(g gVar, zzads zzadsVar, zzaes zzaesVar, zzadp zzadpVar, zzado zzadoVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.zze = gVar;
        gVar.a();
        this.zzf = gVar.f45330c.f45343a;
        AbstractC1732v.i(zzadsVar);
        this.zzd = zzadsVar;
        zza(null, null, null);
        zzafb.zza(this.zzf, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzafo zzafoVar, zzael<Void> zzaelVar) throws IOException {
        AbstractC1732v.i(zzafoVar);
        AbstractC1732v.i(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/deleteAccount", this.zzf), zzafoVar, zzaelVar, Void.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzafn zzafnVar, zzael<zzafq> zzaelVar) throws IOException {
        AbstractC1732v.i(zzafnVar);
        AbstractC1732v.i(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/emailLinkSignin", this.zzf), zzafnVar, zzaelVar, zzafq.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzafp zzafpVar, zzael<zzafs> zzaelVar) throws IOException {
        AbstractC1732v.i(zzafpVar);
        AbstractC1732v.i(zzaelVar);
        zzado zzadoVar = this.zzb;
        zzaeo.zza(zzadoVar.zza("/accounts/mfaEnrollment:finalize", this.zzf), zzafpVar, zzaelVar, zzafs.class, zzadoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzafr zzafrVar, zzael<zzafu> zzaelVar) throws IOException {
        AbstractC1732v.i(zzafrVar);
        AbstractC1732v.i(zzaelVar);
        zzado zzadoVar = this.zzb;
        zzaeo.zza(zzadoVar.zza("/accounts/mfaSignIn:finalize", this.zzf), zzafrVar, zzaelVar, zzafu.class, zzadoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzafz zzafzVar, zzael<zzagl> zzaelVar) throws IOException {
        AbstractC1732v.i(zzafzVar);
        AbstractC1732v.i(zzaelVar);
        zzaes zzaesVar = this.zzc;
        zzaeo.zza(zzaesVar.zza("/token", this.zzf), zzafzVar, zzaelVar, zzagl.class, zzaesVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzagc zzagcVar, zzael<zzagb> zzaelVar) throws IOException {
        AbstractC1732v.i(zzagcVar);
        AbstractC1732v.i(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/getAccountInfo", this.zzf), zzagcVar, zzaelVar, zzagb.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzagg zzaggVar, zzael<zzagf> zzaelVar) throws IOException {
        AbstractC1732v.i(zzaggVar);
        AbstractC1732v.i(zzaelVar);
        if (zzaggVar.zzb() != null) {
            zzb().zzb(zzaggVar.zzb().f5791h);
        }
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/getOobConfirmationCode", this.zzf), zzaggVar, zzaelVar, zzagf.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzagi zzagiVar, zzael<zzagh> zzaelVar) {
        AbstractC1732v.i(zzagiVar);
        AbstractC1732v.i(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/getRecaptchaParam", this.zzf), zzaelVar, zzagh.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzagj zzagjVar, zzael<zzagm> zzaelVar) {
        AbstractC1732v.i(zzagjVar);
        AbstractC1732v.i(zzaelVar);
        zzado zzadoVar = this.zzb;
        String strG = zzadoVar.zza("/recaptchaConfig", this.zzf) + "&clientType=" + zzagjVar.zzb() + "&version=" + zzagjVar.zzc();
        if (!zzag.zzc(zzagjVar.zzd())) {
            strG = a.g(strG, "&tenantId=", zzagjVar.zzd());
        }
        zzaeo.zza(strG, zzaelVar, zzagm.class, zzadoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        zza(null, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzagw zzagwVar, zzael<zzagv> zzaelVar) throws IOException {
        AbstractC1732v.i(zzagwVar);
        AbstractC1732v.i(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/resetPassword", this.zzf), zzagwVar, zzaelVar, zzagv.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzagy zzagyVar, zzael<zzaha> zzaelVar) throws IOException {
        AbstractC1732v.i(zzagyVar);
        AbstractC1732v.i(zzaelVar);
        zzado zzadoVar = this.zzb;
        zzaeo.zza(zzadoVar.zza("/accounts:revokeToken", this.zzf), zzagyVar, zzaelVar, zzaha.class, zzadoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzagz zzagzVar, zzael<zzahc> zzaelVar) throws IOException {
        AbstractC1732v.i(zzagzVar);
        AbstractC1732v.i(zzaelVar);
        if (!TextUtils.isEmpty(zzagzVar.zzc())) {
            zzb().zzb(zzagzVar.zzc());
        }
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/sendVerificationCode", this.zzf), zzagzVar, zzaelVar, zzahc.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzahb zzahbVar, zzael<zzahe> zzaelVar) throws IOException {
        AbstractC1732v.i(zzahbVar);
        AbstractC1732v.i(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/setAccountInfo", this.zzf), zzahbVar, zzaelVar, zzahe.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(String str, zzael<Void> zzaelVar) {
        AbstractC1732v.i(zzaelVar);
        zzb().zza(str);
        zzaelVar.zza((zzael<Void>) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzahg zzahgVar, zzael<zzahf> zzaelVar) throws IOException {
        AbstractC1732v.i(zzahgVar);
        AbstractC1732v.i(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/signupNewUser", this.zzf), zzahgVar, zzaelVar, zzahf.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzahi zzahiVar, zzael<zzahh> zzaelVar) throws IOException {
        AbstractC1732v.i(zzahiVar);
        AbstractC1732v.i(zzaelVar);
        if (zzahiVar instanceof zzahm) {
            zzahm zzahmVar = (zzahm) zzahiVar;
            if (!TextUtils.isEmpty(zzahmVar.zzb())) {
                zzb().zzb(zzahmVar.zzb());
            }
        }
        zzado zzadoVar = this.zzb;
        zzaeo.zza(zzadoVar.zza("/accounts/mfaEnrollment:start", this.zzf), zzahiVar, zzaelVar, zzahh.class, zzadoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzahk zzahkVar, zzael<zzahj> zzaelVar) throws IOException {
        AbstractC1732v.i(zzahkVar);
        AbstractC1732v.i(zzaelVar);
        if (!TextUtils.isEmpty(zzahkVar.zzb())) {
            zzb().zzb(zzahkVar.zzb());
        }
        zzado zzadoVar = this.zzb;
        zzaeo.zza(zzadoVar.zza("/accounts/mfaSignIn:start", this.zzf), zzahkVar, zzaelVar, zzahj.class, zzadoVar.zza);
    }

    private final void zza(zzaes zzaesVar, zzadp zzadpVar, zzado zzadoVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        String strZza = zzafc.zza("firebear.secureToken");
        if (TextUtils.isEmpty(strZza)) {
            strZza = zzafb.zzd(this.zzf);
        } else {
            AbstractC1593a.t("Found hermetic configuration for secureToken URL: ", strZza, "LocalClient");
        }
        if (this.zzc == null) {
            this.zzc = new zzaes(strZza, zzb());
        }
        String strZza2 = zzafc.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(strZza2)) {
            strZza2 = zzafb.zzb(this.zzf);
        } else {
            AbstractC1593a.t("Found hermetic configuration for identityToolkit URL: ", strZza2, "LocalClient");
        }
        if (this.zza == null) {
            this.zza = new zzadp(strZza2, zzb());
        }
        String strZza3 = zzafc.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(strZza3)) {
            strZza3 = zzafb.zzc(this.zzf);
        } else {
            AbstractC1593a.t("Found hermetic configuration for identityToolkitV2 URL: ", strZza3, "LocalClient");
        }
        if (this.zzb == null) {
            this.zzb = new zzado(strZza3, zzb());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzahr zzahrVar, zzael<zzaht> zzaelVar) throws IOException {
        AbstractC1732v.i(zzahrVar);
        AbstractC1732v.i(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/verifyAssertion", this.zzf), zzahrVar, zzaelVar, zzaht.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzahw zzahwVar, zzael<zzahv> zzaelVar) throws IOException {
        AbstractC1732v.i(zzahwVar);
        AbstractC1732v.i(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/verifyCustomToken", this.zzf), zzahwVar, zzaelVar, zzahv.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzahy zzahyVar, zzael<zzahx> zzaelVar) throws IOException {
        AbstractC1732v.i(zzahyVar);
        AbstractC1732v.i(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/verifyPassword", this.zzf), zzahyVar, zzaelVar, zzahx.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzaia zzaiaVar, zzael<zzahz> zzaelVar) throws IOException {
        AbstractC1732v.i(zzaiaVar);
        AbstractC1732v.i(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/verifyPhoneNumber", this.zzf), zzaiaVar, zzaelVar, zzahz.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzaic zzaicVar, zzael<zzaib> zzaelVar) throws IOException {
        AbstractC1732v.i(zzaicVar);
        AbstractC1732v.i(zzaelVar);
        zzado zzadoVar = this.zzb;
        zzaeo.zza(zzadoVar.zza("/accounts/mfaEnrollment:withdraw", this.zzf), zzaicVar, zzaelVar, zzaib.class, zzadoVar.zza);
    }
}
