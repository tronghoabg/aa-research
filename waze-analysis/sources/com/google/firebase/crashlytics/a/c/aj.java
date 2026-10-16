package com.google.firebase.crashlytics.a.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    com.google.android.gms.o.w f9120a;

    /* renamed from: b, reason: collision with root package name */
    boolean f9121b;

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences f9122c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.e f9123d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f9124e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9125f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f9126g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.o.w f9127h;

    public aj(com.google.firebase.e eVar) {
        Boolean boolValueOf;
        Object obj = new Object();
        this.f9124e = obj;
        this.f9120a = new com.google.android.gms.o.w();
        this.f9121b = false;
        this.f9125f = false;
        this.f9127h = new com.google.android.gms.o.w();
        Context contextA = eVar.a();
        this.f9123d = eVar;
        SharedPreferences sharedPreferencesD = g.d(contextA);
        this.f9122c = sharedPreferencesD;
        if (sharedPreferencesD.contains("firebase_crashlytics_collection_enabled")) {
            this.f9125f = false;
            boolValueOf = Boolean.valueOf(sharedPreferencesD.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        this.f9126g = boolValueOf == null ? f(contextA) : boolValueOf;
        synchronized (obj) {
            if (e()) {
                this.f9120a.e(null);
                this.f9121b = true;
            }
        }
    }

    private final Boolean f(Context context) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        try {
            packageManager = context.getPackageManager();
        } catch (PackageManager.NameNotFoundException e2) {
            com.google.firebase.crashlytics.a.i.a().e("Could not read data collection permission from manifest", e2);
        }
        Boolean boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        if (boolValueOf == null) {
            this.f9125f = false;
            return null;
        }
        this.f9125f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolValueOf));
    }

    public final com.google.android.gms.o.t a() {
        com.google.android.gms.o.t tVarA;
        synchronized (this.f9124e) {
            tVarA = this.f9120a.a();
        }
        return tVarA;
    }

    public final com.google.android.gms.o.t b(Executor executor) {
        com.google.android.gms.o.t tVarA = this.f9127h.a();
        com.google.android.gms.o.t tVarA2 = a();
        int i2 = ay.f9162a;
        com.google.android.gms.o.w wVar = new com.google.android.gms.o.w();
        aw awVar = new aw(wVar, 3);
        tVarA.b(executor, awVar);
        tVarA2.b(executor, awVar);
        return wVar.a();
    }

    public final void c(boolean z) {
        if (!z) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f9127h.e(null);
    }

    public final synchronized void d(Boolean bool) {
        if (bool != null) {
            try {
                this.f9125f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f9126g = bool != null ? bool : f(this.f9123d.a());
        SharedPreferences.Editor editorEdit = this.f9122c.edit();
        if (bool != null) {
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("firebase_crashlytics_collection_enabled");
        }
        editorEdit.apply();
        synchronized (this.f9124e) {
            boolean zE = e();
            boolean z = this.f9121b;
            if (zE) {
                if (!z) {
                    this.f9120a.e(null);
                    this.f9121b = true;
                }
            } else if (z) {
                this.f9120a = new com.google.android.gms.o.w();
                this.f9121b = false;
            }
        }
    }

    public final synchronized boolean e() {
        boolean zM;
        Boolean bool = this.f9126g;
        if (bool != null) {
            zM = bool.booleanValue();
        } else {
            try {
                zM = this.f9123d.m();
            } catch (IllegalStateException unused) {
                zM = false;
            }
        }
        com.google.firebase.crashlytics.a.i.a().b(String.format("Crashlytics automatic data collection %s by %s.", true != zM ? "DISABLED" : "ENABLED", this.f9126g == null ? "global Firebase setting" : this.f9125f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
        return zM;
    }
}
