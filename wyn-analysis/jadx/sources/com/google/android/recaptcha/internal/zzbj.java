package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import ef.C2527k;
import ff.AbstractC2640A;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class zzbj extends Exception {
    public static final /* synthetic */ int zza = 0;

    @NotNull
    private static final Map zzb;

    @NotNull
    private final zzbh zzc;

    @NotNull
    private final zzbg zzd;

    @Nullable
    private final String zze;

    @NotNull
    private final Map zzf;

    static {
        C2527k c2527k = new C2527k(zzrc.JS_NETWORK_ERROR, new zzbj(zzbh.zzc, zzbg.zzd, null));
        zzrc zzrcVar = zzrc.JS_INTERNAL_ERROR;
        zzbh zzbhVar = zzbh.zzb;
        zzb = AbstractC2640A.R(c2527k, new C2527k(zzrcVar, new zzbj(zzbhVar, zzbg.zzc, null)), new C2527k(zzrc.JS_INVALID_SITE_KEY, new zzbj(zzbh.zzd, zzbg.zze, null)), new C2527k(zzrc.JS_INVALID_SITE_KEY_TYPE, new zzbj(zzbh.zze, zzbg.zzf, null)), new C2527k(zzrc.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzbj(zzbh.zzf, zzbg.zzg, null)), new C2527k(zzrc.JS_INVALID_ACTION, new zzbj(zzbh.zzg, zzbg.zzh, null)), new C2527k(zzrc.JS_PROGRAM_ERROR, new zzbj(zzbhVar, zzbg.zzj, null)));
    }

    public zzbj(@NotNull zzbh zzbhVar, @NotNull zzbg zzbgVar, @Nullable String str) {
        this.zzc = zzbhVar;
        this.zzd = zzbgVar;
        this.zze = str;
        zzbh zzbhVar2 = zzbh.zzc;
        RecaptchaErrorCode recaptchaErrorCode = RecaptchaErrorCode.NETWORK_ERROR;
        this.zzf = AbstractC2640A.R(new C2527k(zzbhVar2, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new C2527k(zzbh.zzh, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new C2527k(zzbh.zzd, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), new C2527k(zzbh.zze, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), new C2527k(zzbh.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), new C2527k(zzbh.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), new C2527k(zzbh.zzb, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null)), new C2527k(zzbh.zzj, new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null)));
    }

    @NotNull
    public final zzbg zza() {
        return this.zzd;
    }

    @NotNull
    public final zzbh zzb() {
        return this.zzc;
    }

    @NotNull
    public final RecaptchaException zzc() {
        if (AbstractC3340k.a(this.zzd, zzbg.zzI)) {
            return new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
        }
        if (AbstractC3340k.a(this.zzd, zzbg.zzap)) {
            return new RecaptchaException(RecaptchaErrorCode.NO_NETWORK_FOUND, null, 2, null);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzf.get(this.zzc);
        return recaptchaException == null ? new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null) : recaptchaException;
    }

    @Nullable
    public final String zzd() {
        return this.zze;
    }
}
