package com.google.firebase.appcheck.debug;

import B8.d;
import L8.a;
import L8.b;
import L8.l;
import L8.t;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import s8.g;
import y8.InterfaceC4566a;
import y8.InterfaceC4567b;
import y8.InterfaceC4568c;

/* loaded from: classes4.dex */
public class FirebaseAppCheckDebugRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        t tVar = new t(InterfaceC4568c.class, Executor.class);
        t tVar2 = new t(InterfaceC4566a.class, Executor.class);
        t tVar3 = new t(InterfaceC4567b.class, Executor.class);
        a aVarB = b.b(d.class);
        aVarB.f6983a = "fire-app-check-debug";
        aVarB.c(l.d(g.class));
        aVarB.c(l.b(A8.b.class));
        aVarB.c(new l(tVar, 1, 0));
        aVarB.c(new l(tVar2, 1, 0));
        aVarB.c(new l(tVar3, 1, 0));
        aVarB.f6989g = new A8.a(tVar, tVar2, tVar3, 0);
        return Arrays.asList(aVarB.d(), ic.d.m("fire-app-check-debug", "18.0.0"));
    }
}
