package com.google.firebase.appcheck;

import C8.f;
import F5.c;
import L8.a;
import L8.b;
import L8.l;
import L8.t;
import com.applovin.impl.Y;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import s8.g;
import x9.C4504d;
import x9.InterfaceC4505e;
import y8.InterfaceC4566a;
import y8.InterfaceC4567b;
import y8.InterfaceC4568c;
import y8.d;

/* loaded from: classes4.dex */
public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        t tVar = new t(d.class, Executor.class);
        t tVar2 = new t(InterfaceC4568c.class, Executor.class);
        t tVar3 = new t(InterfaceC4566a.class, Executor.class);
        t tVar4 = new t(InterfaceC4567b.class, ScheduledExecutorService.class);
        a aVar = new a(f.class, new Class[]{E8.a.class});
        aVar.f6983a = "fire-app-check";
        aVar.c(l.d(g.class));
        aVar.c(new l(tVar, 1, 0));
        aVar.c(new l(tVar2, 1, 0));
        aVar.c(new l(tVar3, 1, 0));
        aVar.c(new l(tVar4, 1, 0));
        aVar.c(l.b(InterfaceC4505e.class));
        aVar.f6989g = new Y(tVar, tVar2, tVar3, tVar4);
        aVar.f(1);
        b bVarD = aVar.d();
        C4504d c4504d = new C4504d(0);
        a aVarB = b.b(C4504d.class);
        aVarB.f6985c = 1;
        aVarB.f6989g = new c(c4504d);
        return Arrays.asList(bVarD, aVarB.d(), ic.d.m("fire-app-check", "18.0.0"));
    }
}
