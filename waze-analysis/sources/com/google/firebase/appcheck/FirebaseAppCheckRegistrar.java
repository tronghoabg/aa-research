package com.google.firebase.appcheck;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ae;
import com.google.firebase.components.r;
import com.google.firebase.f.f;
import com.google.firebase.f.g;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<com.google.firebase.components.c<?>> getComponents() {
        final ae aeVar = new ae(com.google.firebase.b.a.d.class, Executor.class);
        final ae aeVar2 = new ae(com.google.firebase.b.a.c.class, Executor.class);
        final ae aeVar3 = new ae(com.google.firebase.b.a.a.class, Executor.class);
        final ae aeVar4 = new ae(com.google.firebase.b.a.b.class, ScheduledExecutorService.class);
        com.google.firebase.components.b bVarD = com.google.firebase.components.c.d(d.class, com.google.firebase.appcheck.b.b.class);
        bVarD.d("fire-app-check");
        bVarD.b(r.f(com.google.firebase.e.class));
        bVarD.b(r.e(aeVar));
        bVarD.b(r.e(aeVar2));
        bVarD.b(r.e(aeVar3));
        bVarD.b(r.e(aeVar4));
        bVarD.b(r.d(g.class));
        bVarD.c(new com.google.firebase.components.g() { // from class: com.google.firebase.appcheck.e
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                return new com.google.firebase.appcheck.a.d((com.google.firebase.e) dVar.f(com.google.firebase.e.class), dVar.c(g.class), (Executor) dVar.e(aeVar), (Executor) dVar.e(aeVar2), (Executor) dVar.e(aeVar3), (ScheduledExecutorService) dVar.e(aeVar4));
            }
        });
        bVarD.f();
        return Arrays.asList(bVarD.a(), f.a(), com.google.firebase.h.g.a("fire-app-check", "17.1.3_1p"));
    }
}
