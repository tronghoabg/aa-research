package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzflw {
    public zzflw() {
        try {
            zzhfc.zza();
        } catch (GeneralSecurityException e7) {
            G6.L.k("Failed to Configure Aead. ".concat(e7.toString()));
            C6.n.f1857D.f1868h.zzh(e7, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() throws GeneralSecurityException {
        byte[] byteArray;
        try {
            zzhek zzhekVarZzg = zzhek.zzg(zzhec.zzb(zzhna.zza().zzc("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzhdv.zzb(zzhekVarZzg, zzhdu.zzb(byteArrayOutputStream));
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e7) {
            G6.L.k("Failed to generate key".concat(e7.toString()));
            C6.n.f1857D.f1868h.zzh(e7, "CryptoUtils.generateKey");
            byteArray = new byte[0];
        }
        return Base64.encodeToString(byteArray, 11);
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdzo zzdzoVar) {
        zzhek zzhekVarZzc;
        if (str != null && (zzhekVarZzc = zzc(str)) != null) {
            try {
                byte[] bArrZza = ((zzhdr) zzhekVarZzc.zzh(zzhlg.zza(), zzhdr.class)).zza(bArr, bArr2);
                zzdzoVar.zzc().put("ds", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                return new String(bArrZza, StandardCharsets.UTF_8);
            } catch (UnsupportedOperationException | GeneralSecurityException e7) {
                G6.L.k("Failed to decrypt ".concat(e7.toString()));
                C6.n.f1857D.f1868h.zzh(e7, "CryptoUtils.decrypt");
                zzdzoVar.zzc().put("dsf", e7.toString());
            }
        }
        return null;
    }

    private static final zzhek zzc(String str) throws GeneralSecurityException {
        try {
            try {
                return zzhdv.zza(zzhdt.zza(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e7) {
            G6.L.k("Failed to get keysethandle".concat(e7.toString()));
            C6.n.f1857D.f1868h.zzh(e7, "CryptoUtils.getHandle");
            return null;
        }
    }
}
