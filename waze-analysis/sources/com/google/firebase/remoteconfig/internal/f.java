package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.o.ag;
import com.google.android.libraries.phenotype.client.stable.au;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f10664a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Executor f10665b = new com.google.android.gms.f.v(10);

    /* renamed from: c, reason: collision with root package name */
    private final Executor f10666c;

    /* renamed from: d, reason: collision with root package name */
    private final w f10667d;

    /* renamed from: e, reason: collision with root package name */
    private com.google.android.gms.o.t f10668e = null;

    private f(Executor executor, w wVar) {
        this.f10666c = executor;
        this.f10667d = wVar;
    }

    public static synchronized f c(Executor executor, w wVar) {
        String strC;
        Map map;
        strC = wVar.c();
        map = f10664a;
        if (!map.containsKey(strC)) {
            map.put(strC, new f(executor, wVar));
        }
        return (f) map.get(strC);
    }

    public static /* synthetic */ com.google.android.gms.o.t h(f fVar, h hVar) {
        fVar.i(hVar);
        return ag.c(hVar);
    }

    private final synchronized void i(h hVar) {
        this.f10668e = ag.c(hVar);
    }

    public final synchronized com.google.android.gms.o.t a() {
        com.google.android.gms.o.t tVar = this.f10668e;
        if (tVar == null || (tVar.j() && !this.f10668e.k())) {
            Executor executor = this.f10666c;
            w wVar = this.f10667d;
            Objects.requireNonNull(wVar);
            this.f10668e = ag.a(executor, new com.google.firebase.appcheck.playintegrity.a.c(wVar, 6));
        }
        return this.f10668e;
    }

    public final com.google.android.gms.o.t b(h hVar) {
        au auVar = new au(this, hVar, 4);
        Executor executor = this.f10666c;
        return ag.a(executor, auVar).e(executor, new d(this, hVar, 0));
    }

    public final h d() {
        return g();
    }

    public final void e() {
        synchronized (this) {
            this.f10668e = ag.c(null);
        }
        this.f10667d.d();
    }

    final h g() throws ExecutionException, TimeoutException {
        synchronized (this) {
            com.google.android.gms.o.t tVar = this.f10668e;
            if (tVar != null && tVar.k()) {
                return (h) this.f10668e.g();
            }
            try {
                com.google.android.gms.o.t tVarA = a();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                e eVar = new e();
                Executor executor = f10665b;
                tVarA.q(executor, eVar);
                tVarA.p(executor, eVar);
                tVarA.l(executor, eVar);
                if (!eVar.a(timeUnit)) {
                    throw new TimeoutException("Task await timed out.");
                }
                if (tVarA.k()) {
                    return (h) tVarA.g();
                }
                throw new ExecutionException(tVarA.f());
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e2);
                return null;
            }
        }
    }
}
