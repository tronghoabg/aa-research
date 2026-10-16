package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.f.aa;
import com.google.android.gms.f.x;
import com.google.android.gms.o.ag;
import com.google.android.gms.o.t;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.e f9937a;

    /* renamed from: b, reason: collision with root package name */
    private final g f9938b;

    /* renamed from: c, reason: collision with root package name */
    private final aa f9939c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.g.c f9940d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.g.c f9941e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.installations.d f9942f;

    d(com.google.firebase.e eVar, g gVar, aa aaVar, com.google.firebase.g.c cVar, com.google.firebase.g.c cVar2, com.google.firebase.installations.d dVar) {
        this.f9937a = eVar;
        this.f9938b = gVar;
        this.f9939c = aaVar;
        this.f9940d = cVar;
        this.f9941e = cVar2;
        this.f9942f = dVar;
    }

    private final String b() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.f9937a.g().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public final t a(String str, String str2) {
        int iE;
        Bundle bundle = new Bundle();
        bundle.putString("scope", ProxyConfig.MATCH_ALL_SCHEMES);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f9937a.d().c());
        g gVar = this.f9938b;
        bundle.putString("gmsv", Integer.toString(gVar.a()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", gVar.c());
        bundle.putString("app_ver_name", gVar.d());
        bundle.putString("firebase-app-name-hash", b());
        try {
            String strA = ((com.google.firebase.installations.j) ag.f(this.f9942f.h())).a();
            if (TextUtils.isEmpty(strA)) {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strA);
            }
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e2);
        }
        bundle.putString("cliv", "fiid-21.1.1");
        com.google.firebase.f.h hVar = (com.google.firebase.f.h) this.f9941e.a();
        com.google.firebase.h.h hVar2 = (com.google.firebase.h.h) this.f9940d.a();
        if (hVar != null && hVar2 != null && (iE = hVar.e()) != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(com.google.firebase.crashlytics.a.h.g.b(iE)));
            bundle.putString("Firebase-Client", hVar2.b());
        }
        return this.f9939c.d(bundle).b(a.a(), new x(4));
    }
}
