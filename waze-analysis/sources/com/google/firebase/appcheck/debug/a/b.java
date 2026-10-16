package com.google.firebase.appcheck.debug.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.o.ag;
import com.google.android.gms.o.t;
import com.google.android.gms.o.w;
import com.google.firebase.appcheck.a.f;
import com.google.firebase.appcheck.a.g;
import com.google.firebase.e;
import com.google.firebase.g.c;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements com.google.firebase.appcheck.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8884a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final String f8885b = "com.google.firebase.appcheck.debug.a.b";

    /* renamed from: c, reason: collision with root package name */
    private final f f8886c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f8887d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f8888e;

    /* renamed from: f, reason: collision with root package name */
    private final g f8889f;

    /* renamed from: g, reason: collision with root package name */
    private final t f8890g;

    public b(e eVar, c cVar, Executor executor, Executor executor2, Executor executor3) {
        t tVarC;
        av.m(eVar);
        this.f8886c = new f(eVar);
        this.f8887d = executor;
        this.f8888e = executor3;
        this.f8889f = new g();
        String strA = cVar.a() != null ? ((com.google.firebase.appcheck.debug.b) cVar.a()).a() : null;
        if (strA == null) {
            w wVar = new w();
            executor2.execute(new a(eVar, wVar, 0));
            tVarC = wVar.a();
        } else {
            tVarC = ag.c(strA);
        }
        this.f8890g = tVarC;
    }

    static /* synthetic */ void c(e eVar, w wVar) {
        Context contextA = eVar.a();
        String strH = eVar.h();
        av.k(strH);
        SharedPreferences sharedPreferences = contextA.getSharedPreferences(String.format("com.google.firebase.appcheck.debug.store.%s", strH), 0);
        String string = sharedPreferences.getString("com.google.firebase.appcheck.debug.DEBUG_SECRET", null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            sharedPreferences.edit().putString("com.google.firebase.appcheck.debug.DEBUG_SECRET", string).apply();
        }
        Log.d(f8885b, "Enter this debug secret into the allow list in the Firebase Console for your project: ".concat(String.valueOf(string)));
        wVar.c(string);
    }

    @Override // com.google.firebase.appcheck.a
    public final t a() {
        int i2 = 1;
        com.google.firebase.appcheck.a.c cVar = new com.google.firebase.appcheck.a.c(this, i2);
        t tVar = this.f8890g;
        Executor executor = this.f8887d;
        return tVar.e(executor, cVar).e(executor, new com.google.android.gms.f.w(i2));
    }
}
