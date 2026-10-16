package com.google.android.gms.internal.p002firebaseauthapi;

import C8.c;
import C8.f;
import E8.a;
import R8.v;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import cb.AbstractC1593a;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import s8.g;
import s8.j;
import x9.C4503c;
import x9.InterfaceC4505e;

/* loaded from: classes.dex */
public final class zzadu {
    private Context zza;
    private zzaen zzb;
    private String zzc;
    private final g zzd;
    private boolean zze;
    private String zzf;

    public zzadu(Context context, g gVar, String str) {
        this.zze = false;
        AbstractC1732v.i(context);
        this.zza = context;
        AbstractC1732v.i(gVar);
        this.zzd = gVar;
        this.zzc = v.f("Android/Fallback/", str);
    }

    private static String zza(g gVar) {
        a aVar = (a) FirebaseAuth.getInstance(gVar).f27303v.get();
        if (aVar == null) {
            return null;
        }
        try {
            c cVar = (c) Tasks.await(((f) aVar).a(false));
            j jVar = cVar.f1911b;
            if (jVar != null) {
                Log.w("LocalRequestInterceptor", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(jVar)));
            }
            return cVar.f1910a;
        } catch (InterruptedException e7) {
            e = e7;
            AbstractC1593a.t("Unexpected error getting App Check token: ", e.getMessage(), "LocalRequestInterceptor");
            return null;
        } catch (ExecutionException e10) {
            e = e10;
            AbstractC1593a.t("Unexpected error getting App Check token: ", e.getMessage(), "LocalRequestInterceptor");
            return null;
        }
    }

    private static String zzb(g gVar) {
        InterfaceC4505e interfaceC4505e = (InterfaceC4505e) FirebaseAuth.getInstance(gVar).f27304w.get();
        if (interfaceC4505e != null) {
            try {
                return (String) Tasks.await(((C4503c) interfaceC4505e).b());
            } catch (InterruptedException | ExecutionException e7) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e7.getMessage());
            }
        }
        return null;
    }

    public final void zzb(String str) {
        this.zzf = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzadu(g gVar, String str) {
        this(gVar.f45328a, gVar, str);
        gVar.a();
    }

    public final void zza(URLConnection uRLConnection) {
        String strF;
        if (this.zze) {
            strF = N0.a.f(this.zzc, "/FirebaseUI-Android");
        } else {
            strF = N0.a.f(this.zzc, "/FirebaseCore-Android");
        }
        if (this.zzb == null) {
            this.zzb = new zzaen(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzadx.zza());
        uRLConnection.setRequestProperty("X-Client-Version", strF);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        g gVar = this.zzd;
        gVar.a();
        uRLConnection.setRequestProperty("X-Firebase-GMPID", gVar.f45330c.f45344b);
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String strZza = zza(this.zzd);
        if (!TextUtils.isEmpty(strZza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", strZza);
        }
        this.zzf = null;
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }
}
