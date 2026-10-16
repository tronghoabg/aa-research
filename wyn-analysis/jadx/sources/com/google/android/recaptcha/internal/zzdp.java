package com.google.android.recaptcha.internal;

import A6.h;
import Ef.E;
import Fe.e;
import ef.C2515C;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.MissingResourceException;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
final class zzdp extends AbstractC3471j implements p {
    final /* synthetic */ zzdq zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzqt zzc;
    final /* synthetic */ zzdc zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdp(zzdq zzdqVar, String str, zzqt zzqtVar, zzdc zzdcVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zza = zzdqVar;
        this.zzb = str;
        this.zzc = zzqtVar;
        this.zzd = zzdcVar;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        return new zzdp(this.zza, this.zzb, this.zzc, this.zzd, interfaceC3103c);
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdp) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws zzbj, MissingResourceException, IOException {
        a aVar = a.f39711a;
        e.U(obj);
        zzdf zzdfVarZzf = this.zzd.zzf(22);
        zzqt zzqtVar = this.zzc;
        String str = this.zzb;
        try {
            if (!zzdt.zzb(str)) {
                throw new zzbj(zzbh.zzc, zzbg.zzQ, null);
            }
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                AbstractC3340k.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                String strEncode = URLEncoder.encode(zzqtVar.zzL(), "UTF-8");
                String strEncode2 = URLEncoder.encode(zzqtVar.zzk(), "UTF-8");
                int iZzS = zzqtVar.zzS();
                byte[] bytes = ("k=" + strEncode + "&pk=" + strEncode2 + "&mst=" + URLEncoder.encode(iZzS != 2 ? iZzS != 3 ? iZzS != 4 ? iZzS != 5 ? "UNRECOGNIZED" : "IOS" : "ANDROID_OFFPLAY" : "ANDROID_ONPLAY" : "UNSPECIFIED", "UTF-8") + "&msv=" + URLEncoder.encode(zzqtVar.zzJ(), "UTF-8") + "&msi=" + URLEncoder.encode(zzqtVar.zzK(), "UTF-8") + "&mov=" + zzqtVar.zzj() + "&mkc=" + zzqtVar.zzi()).getBytes(Charset.forName("UTF-8"));
                try {
                    try {
                        zzdr.zza(httpURLConnection);
                        try {
                            zzdr.zzd(httpURLConnection).write(bytes);
                            if (httpURLConnection.getResponseCode() == 200) {
                                try {
                                    zzpq zzpqVarZzi = zzpq.zzi(zzdr.zzc(httpURLConnection));
                                    httpURLConnection.disconnect();
                                    zzdfVarZzf.zza();
                                    return zzpqVarZzi;
                                } catch (Exception unused) {
                                    throw new zzbj(zzbh.zzb, zzbg.zzG, null);
                                }
                            }
                            try {
                                int responseCode = httpURLConnection.getResponseCode();
                                byte[] bArrF = h.F(httpURLConnection.getErrorStream());
                                if (responseCode != 400) {
                                    throw zzdr.zzb(responseCode);
                                }
                                zzrb zzrbVarZzg = zzrb.zzg(bArrF);
                                int i5 = zzbj.zza;
                                throw zzbi.zza(zzrbVarZzg.zzi());
                            } catch (Exception unused2) {
                                throw new zzbj(zzbh.zzc, zzbg.zzai, null);
                            }
                        } catch (IOException e7) {
                            throw new zzbj(zzbh.zzc, zzbg.zzah, e7.getMessage());
                        } catch (Exception e10) {
                            throw new zzbj(zzbh.zzc, zzbg.zzam, e10.getMessage());
                        }
                    } catch (Exception e11) {
                        if (e11 instanceof zzbj) {
                            throw ((zzbj) e11);
                        }
                        throw new zzbj(zzbh.zzc, zzbg.zzF, e11.getMessage());
                    }
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (Exception e12) {
                throw new zzbj(zzbh.zzc, zzbg.zzaj, e12.getMessage());
            }
        } catch (zzbj e13) {
            zzdfVarZzf.zzb(e13);
            throw e13;
        } catch (Exception e14) {
            zzbj zzbjVar = new zzbj(zzbh.zzb, zzbg.zza, e14.getMessage());
            zzdfVarZzf.zzb(zzbjVar);
            throw zzbjVar;
        }
    }
}
