package com.google.android.recaptcha.internal;

import Bf.r;
import Ef.H;
import Fe.c;
import com.google.android.recaptcha.RecaptchaException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class zzdq {

    @Nullable
    private final zzav zza;

    public zzdq(@Nullable zzav zzavVar, @NotNull zzdo zzdoVar) {
        this.zza = zzavVar;
    }

    @Nullable
    public final Object zza(@NotNull String str, @NotNull zzqt zzqtVar, @NotNull zzdc zzdcVar, @NotNull InterfaceC3103c interfaceC3103c) throws RecaptchaException {
        return H.l(new zzdp(this, str, zzqtVar, zzdcVar, null), interfaceC3103c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String zzb(@NotNull zzpq zzpqVar, @NotNull zzdc zzdcVar) throws Exception {
        String strC;
        zzdf zzdfVar;
        try {
            String strZzJ = zzpqVar.zzJ();
            String strZzK = zzpqVar.zzK();
            boolean zZzd = this.zza.zzd(strZzK);
            zzdf zzdfVar2 = zZzd;
            if (zZzd == 1) {
                zzdf zzdfVarZzf = zzdcVar.zzf(25);
                try {
                    strC = this.zza.zza(strZzK);
                    if (strC != null) {
                        zzdfVarZzf.zza();
                        zzdfVar = zzdfVarZzf;
                    }
                } catch (Exception unused) {
                    zzdfVarZzf.zzb(new zzbj(zzbh.zzk, zzbg.zzR, null));
                }
                zzdfVarZzf.zzb(new zzbj(zzbh.zzk, zzbg.zzS, null));
                zzdfVar2 = zzdfVarZzf;
                strC = null;
                zzdfVar = zzdfVar2;
            } else {
                strC = null;
                zzdfVar = zzdfVar2;
            }
            if (strC == null) {
                try {
                    this.zza.zzb();
                    zzdf zzdfVarZzf2 = zzdcVar.zzf(23);
                    try {
                        try {
                            URLConnection uRLConnectionOpenConnection = new URL(strZzJ).openConnection();
                            AbstractC3340k.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                            httpURLConnection.setRequestMethod("GET");
                            httpURLConnection.setDoInput(true);
                            httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                            httpURLConnection.connect();
                            if (httpURLConnection.getResponseCode() != 200) {
                                throw new zzbj(zzbh.zzc, new zzbg(httpURLConnection.getResponseCode()), null);
                            }
                            try {
                                strC = c.C("gzip".equals(httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream())) : new InputStreamReader(httpURLConnection.getInputStream()));
                                zzdfVarZzf2.zza();
                                zzdf zzdfVarZzf3 = zzdcVar.zzf(24);
                                try {
                                    this.zza.zzc(strZzK, strC);
                                    zzdfVarZzf3.zza();
                                } catch (Exception unused2) {
                                    zzdfVarZzf3.zzb(new zzbj(zzbh.zzk, zzbg.zzT, null));
                                }
                            } catch (Exception unused3) {
                                throw new zzbj(zzbh.zzc, zzbg.zzP, null);
                            }
                        } catch (Exception unused4) {
                            throw new zzbj(zzbh.zzc, zzbg.zzO, null);
                        }
                    } catch (Exception unused5) {
                        throw new zzbj(zzbh.zzb, zzbg.zzN, null);
                    }
                } catch (zzbj e7) {
                    zzdfVar.zzb(e7);
                    throw e7;
                }
            }
            return r.h0(zzpqVar.zzk(), "JAVASCRIPT_TAG", strC, false);
        } catch (Exception e10) {
            if (e10 instanceof zzbj) {
                throw e10;
            }
            throw new zzbj(zzbh.zzb, zzbg.zzL, null);
        }
    }
}
