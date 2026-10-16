package com.google.android.gms.internal.p002firebaseauthapi;

import N0.a;
import R8.v;
import a.AbstractC1304a;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.firebase.auth.FirebaseAuth;
import h7.C2793a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import s8.g;

/* loaded from: classes.dex */
public final class zzadj extends AsyncTask<Void, Void, zzadi> {
    private static final C2793a zza = new C2793a("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzadl> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final g zzg;

    public zzadj(String str, String str2, Intent intent, g gVar, zzadl zzadlVar) {
        AbstractC1732v.f(str);
        this.zzb = str;
        AbstractC1732v.i(gVar);
        this.zzg = gVar;
        AbstractC1732v.f(str2);
        AbstractC1732v.i(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        AbstractC1732v.f(stringExtra);
        Uri.Builder builderBuildUpon = Uri.parse(zzadlVar.zza(stringExtra)).buildUpon();
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendPath("getProjectConfig").appendQueryParameter(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, stringExtra).appendQueryParameter("androidPackageName", str);
        AbstractC1732v.i(str2);
        builderAppendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.zzc = builderBuildUpon.build().toString();
        this.zzd = new WeakReference<>(zzadlVar);
        this.zze = zzadlVar.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzadi doInBackground(Void... voidArr) throws IOException {
        try {
            URL url = new URL(this.zzc);
            zzadl zzadlVar = this.zzd.get();
            HttpURLConnection httpURLConnectionZza = zzadlVar.zza(url);
            httpURLConnectionZza.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            httpURLConnectionZza.setConnectTimeout(60000);
            new zzadu(zzadlVar.zza(), this.zzg, zzads.zza().zzb()).zza(httpURLConnectionZza);
            int responseCode = httpURLConnectionZza.getResponseCode();
            if (responseCode != 200) {
                String strZza = zza(httpURLConnectionZza);
                zza.c("Error getting project config. Failed with " + strZza + StringUtils.SPACE + responseCode, new Object[0]);
                return zzadi.zzb(strZza);
            }
            zzagk zzagkVar = new zzagk();
            zzagkVar.zza(new String(zza(httpURLConnectionZza.getInputStream(), 128)));
            if (!TextUtils.isEmpty(this.zzf)) {
                return !zzagkVar.zza().contains(this.zzf) ? zzadi.zzb("UNAUTHORIZED_DOMAIN") : zzadi.zza(this.zzf);
            }
            for (String str : zzagkVar.zza()) {
                if (zza(str)) {
                    return zzadi.zza(str);
                }
            }
            return null;
        } catch (zzabg e7) {
            zza.c(v.f("ConversionException encountered: ", e7.getMessage()), new Object[0]);
            return null;
        } catch (IOException e10) {
            zza.c(v.f("IOException occurred: ", e10.getMessage()), new Object[0]);
            return null;
        } catch (NullPointerException e11) {
            zza.c(v.f("Null pointer encountered: ", e11.getMessage()), new Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onCancelled(zzadi zzadiVar) {
        onPostExecute((zzadi) null);
    }

    private static String zza(HttpURLConnection httpURLConnection) throws zzabg {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream == null) {
                return "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
            }
            return (String) zzadr.zza(new String(zza(errorStream, 128)), String.class);
        } catch (IOException e7) {
            zza.f("Error parsing error message from response body in getErrorMessageFromBody. ".concat(String.valueOf(e7)), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(zzadi zzadiVar) {
        String strZza;
        String strZzb;
        Uri.Builder builder;
        zzadl zzadlVar = this.zzd.get();
        if (zzadiVar != null) {
            strZza = zzadiVar.zza();
            strZzb = zzadiVar.zzb();
        } else {
            strZza = null;
            strZzb = null;
        }
        if (zzadlVar == null) {
            zza.c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (!TextUtils.isEmpty(strZza) && (builder = this.zze) != null) {
            builder.authority(strZza);
            zzadlVar.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).f27303v);
        } else {
            zzadlVar.zza(this.zzb, AbstractC1304a.i0(strZzb));
        }
    }

    private static boolean zza(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            if (host != null) {
                if (host.endsWith("firebaseapp.com")) {
                    return true;
                }
                if (host.endsWith("web.app")) {
                    return true;
                }
            }
        } catch (URISyntaxException e7) {
            zza.c(a.h("Error parsing URL for auth domain check: ", str, ". ", e7.getMessage()), new Object[0]);
        }
        return false;
    }

    private static byte[] zza(InputStream inputStream, int i5) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 != -1) {
                    byteArrayOutputStream.write(bArr, 0, i10);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            byteArrayOutputStream.close();
            throw th;
        }
    }
}
