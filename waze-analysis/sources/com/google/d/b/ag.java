package com.google.d.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.core.content.ContextCompat;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f7204a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7205b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f7206c;

    public ag(Context context, String str) throws PackageManager.NameNotFoundException {
        Context contextCreateDeviceProtectedStorageContext = ContextCompat.createDeviceProtectedStorageContext(context);
        this.f7205b = contextCreateDeviceProtectedStorageContext;
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(str), 0);
        this.f7206c = sharedPreferences;
        boolean z = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                Context context2 = contextCreateDeviceProtectedStorageContext;
                PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                if (packageManager != null) {
                    Context context3 = contextCreateDeviceProtectedStorageContext;
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), 128);
                    if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                        z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.f7204a = z;
    }

    public static ag b(char c2) {
        return new ag(new com.google.firebase.messaging.l(new h(c2)), false, n.f7242a);
    }

    public static final void g() {
        an.B(o.f7244b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator i(CharSequence charSequence) {
        return new b(this, charSequence, (p) ((com.google.firebase.messaging.l) this.f7206c).f10212a);
    }

    public final ag a() {
        return new ag((com.google.firebase.messaging.l) this.f7206c, true, (p) this.f7205b);
    }

    public final Iterable c(CharSequence charSequence) {
        an.B(charSequence);
        return new af(this, charSequence);
    }

    public final List e(CharSequence charSequence) {
        an.B(charSequence);
        Iterator itI = i(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itI.hasNext()) {
            arrayList.add((String) itI.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final synchronized boolean h() {
        return this.f7204a;
    }

    private ag(com.google.firebase.messaging.l lVar, boolean z, p pVar) {
        this.f7206c = lVar;
        this.f7204a = z;
        this.f7205b = pVar;
    }
}
