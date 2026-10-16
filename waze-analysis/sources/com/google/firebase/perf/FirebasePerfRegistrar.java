package com.google.firebase.perf;

import com.google.android.datatransport.h;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ae;
import com.google.firebase.components.g;
import com.google.firebase.components.r;
import com.google.firebase.j;
import com.google.firebase.remoteconfig.i;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    static /* synthetic */ b lambda$getComponents$0(ae aeVar, com.google.firebase.components.d dVar) {
        return new b((com.google.firebase.e) dVar.f(com.google.firebase.e.class), (j) dVar.c(j.class).a(), (Executor) dVar.e(aeVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d providesFirebasePerformance(com.google.firebase.components.d dVar) {
        dVar.f(b.class);
        com.google.firebase.perf.b.a.a aVarA = com.google.firebase.perf.b.a.c.a();
        aVarA.b(new com.google.firebase.perf.b.b.a((com.google.firebase.e) dVar.f(com.google.firebase.e.class), (com.google.firebase.installations.d) dVar.f(com.google.firebase.installations.d.class), dVar.c(i.class), dVar.c(h.class)));
        return aVarA.a().a();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.c<?>> getComponents() {
        final ae aeVar = new ae(com.google.firebase.b.a.d.class, Executor.class);
        com.google.firebase.components.b bVarB = com.google.firebase.components.c.b(d.class);
        bVarB.d(LIBRARY_NAME);
        bVarB.b(r.f(com.google.firebase.e.class));
        bVarB.b(r.h(i.class));
        bVarB.b(r.f(com.google.firebase.installations.d.class));
        bVarB.b(r.h(h.class));
        bVarB.b(r.f(b.class));
        bVarB.c(new com.google.firebase.abt.component.b(2));
        com.google.firebase.components.b bVarB2 = com.google.firebase.components.c.b(b.class);
        bVarB2.d(EARLY_LIBRARY_NAME);
        bVarB2.b(r.f(com.google.firebase.e.class));
        bVarB2.b(r.d(j.class));
        bVarB2.b(r.e(aeVar));
        bVarB2.g();
        bVarB2.c(new g() { // from class: com.google.firebase.perf.c
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                return FirebasePerfRegistrar.lambda$getComponents$0(aeVar, dVar);
            }
        });
        return Arrays.asList(bVarB.a(), bVarB2.a(), com.google.firebase.h.g.a(LIBRARY_NAME, "22.0.5_1p"));
    }
}
