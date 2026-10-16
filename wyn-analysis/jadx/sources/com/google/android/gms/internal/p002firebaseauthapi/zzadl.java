package com.google.android.gms.internal.p002firebaseauthapi;

import O9.b;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import h7.C2793a;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public interface zzadl {
    public static final C2793a zza = new C2793a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    Context zza();

    Uri.Builder zza(Intent intent, String str, String str2);

    String zza(String str);

    HttpURLConnection zza(URL url);

    void zza(Uri uri, String str, b bVar);

    void zza(String str, Status status);
}
