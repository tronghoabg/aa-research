package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ae;
import com.google.firebase.components.r;
import com.google.firebase.concurrent.v;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    static /* synthetic */ d lambda$getComponents$0(com.google.firebase.components.d dVar) {
        return new c((com.google.firebase.e) dVar.f(com.google.firebase.e.class), dVar.c(com.google.firebase.f.g.class), (ExecutorService) dVar.e(new ae(com.google.firebase.b.a.a.class, ExecutorService.class)), v.b((Executor) dVar.e(new ae(com.google.firebase.b.a.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.c<?>> getComponents() {
        com.google.firebase.components.b bVarB = com.google.firebase.components.c.b(d.class);
        bVarB.d(LIBRARY_NAME);
        bVarB.b(r.f(com.google.firebase.e.class));
        bVarB.b(r.d(com.google.firebase.f.g.class));
        bVarB.b(r.e(new ae(com.google.firebase.b.a.a.class, ExecutorService.class)));
        bVarB.b(r.e(new ae(com.google.firebase.b.a.b.class, Executor.class)));
        bVarB.c(new f());
        return Arrays.asList(bVarB.a(), com.google.firebase.f.f.a(), com.google.firebase.h.g.a(LIBRARY_NAME, "19.1.1_1p"));
    }
}
