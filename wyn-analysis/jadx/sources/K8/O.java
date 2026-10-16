package K8;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import cb.AbstractC1593a;
import com.google.android.gms.internal.p002firebaseauthapi.zzbi;
import com.google.android.gms.internal.p002firebaseauthapi.zzbo;
import com.google.android.gms.internal.p002firebaseauthapi.zzce;
import com.google.android.gms.internal.p002firebaseauthapi.zzkh;
import com.google.android.gms.internal.p002firebaseauthapi.zzkm;
import com.google.android.gms.internal.p002firebaseauthapi.zzma;
import com.google.android.gms.internal.p002firebaseauthapi.zzpg;
import com.google.android.gms.internal.p002firebaseauthapi.zzr;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes4.dex */
public final class O {

    /* renamed from: c, reason: collision with root package name */
    public static O f6602c;

    /* renamed from: a, reason: collision with root package name */
    public final String f6603a;

    /* renamed from: b, reason: collision with root package name */
    public final zzma f6604b;

    public O(Context context, String str) {
        zzma zzmaVarZza;
        this.f6603a = str;
        try {
            zzkh.zza();
            zzma.zza zzaVarZza = new zzma.zza().zza(context, "GenericIdpKeyset", "com.google.firebase.auth.api.crypto." + str).zza(zzkm.zza);
            zzaVarZza.zza("android-keystore://firebear_master_key_id." + str);
            zzmaVarZza = zzaVarZza.zza();
        } catch (IOException | GeneralSecurityException e7) {
            AbstractC1593a.t("Exception encountered during crypto setup:\n", e7.getMessage(), "FirebearCryptoHelper");
            zzmaVarZza = null;
        }
        this.f6604b = zzmaVarZza;
    }

    public static O a(Context context, String str) {
        O o7 = f6602c;
        if (o7 == null || !zzr.zza(o7.f6603a, str)) {
            f6602c = new O(context, str);
        }
        return f6602c;
    }

    public final String b() {
        if (this.f6604b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzce zzceVarZza = zzbi.zza(byteArrayOutputStream);
        try {
            synchronized (this.f6604b) {
                this.f6604b.zza().zza().zza(zzceVarZza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e7) {
            AbstractC1593a.t("Exception encountered when attempting to get Public Key:\n", e7.getMessage(), "FirebearCryptoHelper");
            return null;
        }
    }

    public final String c(String str) {
        String str2;
        zzma zzmaVar = this.f6604b;
        if (zzmaVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmaVar) {
                str2 = new String(((zzbo) this.f6604b.zza().zza(zzpg.zza(), zzbo.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e7) {
            AbstractC1593a.t("Exception encountered while decrypting bytes:\n", e7.getMessage(), "FirebearCryptoHelper");
            return null;
        }
    }
}
