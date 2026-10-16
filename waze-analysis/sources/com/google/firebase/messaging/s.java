package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.webkit.ProxyConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.e f10228a;

    /* renamed from: b, reason: collision with root package name */
    private final u f10229b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.f.aa f10230c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.g.c f10231d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.g.c f10232e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.installations.d f10233f;

    s(com.google.firebase.e eVar, u uVar, com.google.android.gms.f.aa aaVar, com.google.firebase.g.c cVar, com.google.firebase.g.c cVar2, com.google.firebase.installations.d dVar) {
        this.f10228a = eVar;
        this.f10229b = uVar;
        this.f10230c = aaVar;
        this.f10231d = cVar;
        this.f10232e = cVar2;
        this.f10233f = dVar;
    }

    private final com.google.android.gms.o.t f(String str, String str2, Bundle bundle) {
        int iE;
        try {
            bundle.putString("scope", str2);
            bundle.putString("sender", str);
            bundle.putString("subtype", str);
            bundle.putString("gmp_app_id", this.f10228a.d().c());
            u uVar = this.f10229b;
            bundle.putString("gmsv", Integer.toString(uVar.a()));
            bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
            bundle.putString("app_ver", uVar.c());
            bundle.putString("app_ver_name", uVar.d());
            bundle.putString("firebase-app-name-hash", g());
            try {
                String strA = ((com.google.firebase.installations.j) com.google.android.gms.o.ag.f(this.f10233f.h())).a();
                if (TextUtils.isEmpty(strA)) {
                    Log.w("FirebaseMessaging", "FIS auth token is empty");
                } else {
                    bundle.putString("Goog-Firebase-Installations-Auth", strA);
                }
            } catch (InterruptedException | ExecutionException e2) {
                Log.e("FirebaseMessaging", "Failed to get FIS auth token", e2);
            }
            bundle.putString("appid", (String) com.google.android.gms.o.ag.f(this.f10233f.a()));
            bundle.putString("cliv", "fcm-24.0.0");
            com.google.firebase.f.h hVar = (com.google.firebase.f.h) this.f10232e.a();
            com.google.firebase.h.h hVar2 = (com.google.firebase.h.h) this.f10231d.a();
            if (hVar != null && hVar2 != null && (iE = hVar.e()) != 1) {
                bundle.putString("Firebase-Client-Log-Type", Integer.toString(com.google.firebase.crashlytics.a.h.g.b(iE)));
                bundle.putString("Firebase-Client", hVar2.b());
            }
            return this.f10230c.d(bundle);
        } catch (InterruptedException | ExecutionException e3) {
            return com.google.android.gms.o.ag.b(e3);
        }
    }

    private final String g() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.f10228a.g().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private static final com.google.android.gms.o.t h(com.google.android.gms.o.t tVar) {
        return tVar.b(new com.google.android.gms.f.v(6), new com.google.android.gms.f.x(8));
    }

    final com.google.android.gms.o.t a() {
        return this.f10230c.b();
    }

    final com.google.android.gms.o.t b() {
        return h(f(com.waze.c.c.e.d(this.f10228a), ProxyConfig.MATCH_ALL_SCHEMES, new Bundle()));
    }

    final com.google.android.gms.o.t c(boolean z) {
        return this.f10230c.e(z);
    }

    final com.google.android.gms.o.t d(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/".concat(str2));
        return h(f(str, "/topics/".concat(str2), bundle));
    }

    final com.google.android.gms.o.t e(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/".concat(str2));
        bundle.putString("delete", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        return h(f(str, "/topics/".concat(str2), bundle));
    }
}
