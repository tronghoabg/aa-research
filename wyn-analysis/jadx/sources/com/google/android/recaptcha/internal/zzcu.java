package com.google.android.recaptcha.internal;

import Ef.E;
import Fe.e;
import com.google.android.recaptcha.RecaptchaAction;
import ef.C2515C;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.MissingResourceException;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
final class zzcu extends AbstractC3471j implements p {
    final /* synthetic */ zzdc zza;
    final /* synthetic */ zzcx zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ zzpw zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcu(zzdc zzdcVar, zzcx zzcxVar, RecaptchaAction recaptchaAction, zzpw zzpwVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zza = zzdcVar;
        this.zzb = zzcxVar;
        this.zzc = recaptchaAction;
        this.zzd = zzpwVar;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        return new zzcu(this.zza, this.zzb, this.zzc, this.zzd, interfaceC3103c);
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcu) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws zzbj, MissingResourceException, IOException {
        a aVar = a.f39711a;
        e.U(obj);
        zzdf zzdfVarZzf = this.zza.zzf(28);
        zzqc zzqcVarZzf = zzqd.zzf();
        zzcx zzcxVar = this.zzb;
        zzqcVarZzf.zzu(zzcxVar.zze());
        zzqcVarZzf.zzd(this.zzc.getAction());
        zzqcVarZzf.zzp(zzcxVar.zzf.zzL());
        zzqcVarZzf.zzq(zzcxVar.zzf.zzK());
        zzpw zzpwVar = this.zzd;
        zzqcVarZzf.zzs(zzpwVar.zzJ());
        zzqcVarZzf.zze(zzpwVar.zzj());
        zzqcVarZzf.zzr(zzpwVar.zzK());
        zzqcVarZzf.zzt(zzpwVar);
        zzqd zzqdVar = (zzqd) zzqcVarZzf.zzj();
        try {
            zzbv zzbvVar = this.zzb.zze;
            try {
                int i5 = zzdt.zza;
                if (!zzdt.zzb(zzbvVar.zzd())) {
                    throw new zzbj(zzbh.zzc, zzbg.zzQ, null);
                }
                URLConnection uRLConnectionOpenConnection = new URL(zzbvVar.zzd()).openConnection();
                AbstractC3340k.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuffer");
                httpURLConnection.connect();
                httpURLConnection.getOutputStream().write(zzqdVar.zzd());
                if (httpURLConnection.getResponseCode() != 200) {
                    throw zzdr.zzb(httpURLConnection.getResponseCode());
                }
                try {
                    zzqf zzqfVarZzi = zzqf.zzi(httpURLConnection.getInputStream());
                    zzdfVarZzf.zza();
                    return zzqfVarZzi;
                } catch (Exception unused) {
                    throw new zzbj(zzbh.zzb, zzbg.zzG, null);
                }
            } catch (Exception e7) {
                if (e7 instanceof zzbj) {
                    throw ((zzbj) e7);
                }
                throw new zzbj(zzbh.zzc, zzbg.zzF, null);
            }
        } catch (Exception e10) {
            zzbj zzbjVar = e10 instanceof zzbj ? (zzbj) e10 : new zzbj(zzbh.zzb, zzbg.zzZ, null);
            zzdfVarZzf.zzb(zzbjVar);
            throw zzbjVar;
        }
    }
}
