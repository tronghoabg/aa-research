package com.google.firebase.crashlytics;

import L8.a;
import L8.b;
import L8.l;
import L8.t;
import android.util.Log;
import ca.InterfaceC1592a;
import com.google.firebase.components.ComponentRegistrar;
import fa.C2619a;
import fa.c;
import fa.d;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import s8.g;
import y8.InterfaceC4566a;
import y8.InterfaceC4567b;
import y8.InterfaceC4568c;

/* loaded from: classes4.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f27318d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final t f27319a = new t(InterfaceC4566a.class, ExecutorService.class);

    /* renamed from: b, reason: collision with root package name */
    public final t f27320b = new t(InterfaceC4567b.class, ExecutorService.class);

    /* renamed from: c, reason: collision with root package name */
    public final t f27321c = new t(InterfaceC4568c.class, ExecutorService.class);

    static {
        d dVar = d.f35276a;
        Map map = c.f35275b;
        if (map.containsKey(dVar)) {
            Log.d("SessionsDependencies", "Dependency " + dVar + " already added.");
            return;
        }
        map.put(dVar, new C2619a(new Nf.d(true)));
        Log.d("SessionsDependencies", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a aVarB = b.b(N8.c.class);
        aVarB.f6983a = "fire-cls";
        aVarB.c(l.d(g.class));
        aVarB.c(l.d(P9.d.class));
        aVarB.c(new l(this.f27319a, 1, 0));
        aVarB.c(new l(this.f27320b, 1, 0));
        aVarB.c(new l(this.f27321c, 1, 0));
        aVarB.c(l.a(O8.a.class));
        aVarB.c(l.a(w8.d.class));
        aVarB.c(l.a(InterfaceC1592a.class));
        aVarB.f6989g = new B8.b(this, 23);
        aVarB.f(2);
        return Arrays.asList(aVarB.d(), ic.d.m("fire-cls", "19.3.0"));
    }
}
