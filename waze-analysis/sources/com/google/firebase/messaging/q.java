package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FirebaseMessaging f10222a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.e.c f10223b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10224c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f10225d;

    /* renamed from: e, reason: collision with root package name */
    private p f10226e;

    q(FirebaseMessaging firebaseMessaging, com.google.firebase.e.c cVar) {
        Objects.requireNonNull(firebaseMessaging);
        this.f10222a = firebaseMessaging;
        this.f10223b = cVar;
    }

    final synchronized void a() {
        Boolean boolValueOf;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        if (this.f10224c) {
            return;
        }
        Context contextA = this.f10222a.f10061f.a();
        SharedPreferences sharedPreferences = contextA.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        } else {
            try {
                packageManager = contextA.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
            }
            boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        }
        this.f10225d = boolValueOf;
        if (boolValueOf == null) {
            p pVar = new p(this);
            this.f10226e = pVar;
            this.f10223b.b(com.google.firebase.a.class, pVar);
        }
        this.f10224c = true;
    }

    final synchronized boolean b() {
        Boolean bool;
        a();
        bool = this.f10225d;
        return bool != null ? bool.booleanValue() : this.f10222a.f10061f.m();
    }
}
