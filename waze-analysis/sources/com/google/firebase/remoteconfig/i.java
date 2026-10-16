package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.android.gms.o.ag;
import com.google.firebase.components.aa;
import com.google.firebase.messaging.l;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.n;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.v;
import com.google.firebase.remoteconfig.internal.w;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i implements com.google.firebase.remoteconfig.a.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10614a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final Random f10615b = new Random();

    /* renamed from: c, reason: collision with root package name */
    private static final Map f10616c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Context f10618e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f10619f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.firebase.e f10620g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.firebase.installations.d f10621h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.firebase.abt.c f10622i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.firebase.g.c f10623j;

    /* renamed from: k, reason: collision with root package name */
    private final String f10624k;

    /* renamed from: d, reason: collision with root package name */
    private final Map f10617d = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    private final Map f10625l = new HashMap();

    i(Context context, ScheduledExecutorService scheduledExecutorService, com.google.firebase.e eVar, com.google.firebase.installations.d dVar, com.google.firebase.abt.c cVar, com.google.firebase.g.c cVar2) {
        this.f10618e = context;
        this.f10619f = scheduledExecutorService;
        this.f10620g = eVar;
        this.f10621h = dVar;
        this.f10622i = cVar;
        this.f10623j = cVar2;
        this.f10624k = eVar.d().c();
        h.b(context);
        ag.a(scheduledExecutorService, new com.google.firebase.appcheck.playintegrity.a.c(this, 5));
    }

    private final com.google.firebase.remoteconfig.internal.f g(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.f.c(this.f10619f, w.b(this.f10618e, String.format("%s_%s_%s_%s.json", "frc", this.f10624k, str, str2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void h(boolean z) {
        Iterator it = f10616c.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).d(z);
        }
    }

    private static boolean i(com.google.firebase.e eVar) {
        return eVar.g().equals("[DEFAULT]");
    }

    public final synchronized b a(String str) {
        com.google.firebase.remoteconfig.internal.f fVarG;
        com.google.firebase.remoteconfig.internal.f fVarG2;
        com.google.firebase.remoteconfig.internal.f fVarG3;
        v vVar;
        n nVar;
        ScheduledExecutorService scheduledExecutorService;
        com.google.firebase.e eVar;
        fVarG = g(str, "fetch");
        fVarG2 = g(str, "activate");
        fVarG3 = g(str, "defaults");
        vVar = new v(this.f10618e.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", this.f10624k, str, "settings"), 0));
        scheduledExecutorService = this.f10619f;
        nVar = new n(scheduledExecutorService, fVarG2, fVarG3);
        eVar = this.f10620g;
        com.google.firebase.messaging.b bVar = null;
        if (i(eVar) && str.equals("firebase")) {
            bVar = new com.google.firebase.messaging.b(this.f10623j);
        }
        if (bVar != null) {
            Objects.requireNonNull(bVar);
            nVar.b(new l(bVar));
        }
        return b(eVar, str, this.f10621h, this.f10622i, scheduledExecutorService, fVarG, fVarG2, fVarG3, c(str, fVarG, vVar), nVar, vVar, new com.google.firebase.remoteconfig.internal.a.c(fVarG2, com.google.firebase.remoteconfig.internal.a.a.a(fVarG2, fVarG3), scheduledExecutorService));
    }

    final synchronized b b(com.google.firebase.e eVar, String str, com.google.firebase.installations.d dVar, com.google.firebase.abt.c cVar, Executor executor, com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2, com.google.firebase.remoteconfig.internal.f fVar3, m mVar, n nVar, v vVar, com.google.firebase.remoteconfig.internal.a.c cVar2) {
        Map map;
        String str2;
        com.google.firebase.e eVar2;
        com.google.firebase.remoteconfig.internal.f fVar4;
        m mVar2;
        v vVar2;
        com.google.firebase.abt.c cVar3;
        com.google.firebase.installations.d dVar2;
        map = this.f10617d;
        if (map.containsKey(str)) {
            str2 = str;
        } else {
            Context context = this.f10618e;
            if (str.equals("firebase") && i(eVar)) {
                eVar2 = eVar;
                dVar2 = dVar;
                cVar3 = cVar;
                fVar4 = fVar2;
                mVar2 = mVar;
                vVar2 = vVar;
            } else {
                eVar2 = eVar;
                fVar4 = fVar2;
                mVar2 = mVar;
                vVar2 = vVar;
                cVar3 = null;
                dVar2 = dVar;
            }
            str2 = str;
            b bVar = new b(cVar3, executor, fVar, fVar2, fVar3, mVar, nVar, vVar, d(eVar2, dVar2, mVar2, fVar4, context, str, vVar2), cVar2);
            bVar.e();
            map.put(str2, bVar);
            f10616c.put(str2, bVar);
        }
        return (b) map.get(str2);
    }

    final synchronized m c(String str, com.google.firebase.remoteconfig.internal.f fVar, v vVar) {
        com.google.firebase.e eVar;
        com.google.firebase.g.c aaVar;
        eVar = this.f10620g;
        aaVar = i(eVar) ? this.f10623j : new aa(4);
        return new m(this.f10621h, aaVar, this.f10619f, f10615b, fVar, new ConfigFetchHttpClient(this.f10618e, eVar.d().c(), eVar.d().b(), str, vVar.a(), vVar.a()), vVar, this.f10625l);
    }

    final synchronized o d(com.google.firebase.e eVar, com.google.firebase.installations.d dVar, m mVar, com.google.firebase.remoteconfig.internal.f fVar, Context context, String str, v vVar) {
        return new o(eVar, dVar, mVar, fVar, context, str, vVar, this.f10619f);
    }

    @Override // com.google.firebase.remoteconfig.a.a
    public final void f(com.google.firebase.crashlytics.a.f fVar) {
        a("firebase").b().b(fVar);
    }
}
