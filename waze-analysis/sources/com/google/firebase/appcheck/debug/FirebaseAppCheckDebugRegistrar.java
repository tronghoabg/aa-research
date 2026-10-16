package com.google.firebase.appcheck.debug;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ae;
import com.google.firebase.components.c;
import com.google.firebase.components.d;
import com.google.firebase.components.g;
import com.google.firebase.components.r;
import com.google.firebase.e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class FirebaseAppCheckDebugRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<c<?>> getComponents() {
        final ae aeVar = new ae(com.google.firebase.b.a.c.class, Executor.class);
        final ae aeVar2 = new ae(com.google.firebase.b.a.a.class, Executor.class);
        final ae aeVar3 = new ae(com.google.firebase.b.a.b.class, Executor.class);
        com.google.firebase.components.b bVarB = c.b(com.google.firebase.appcheck.debug.a.b.class);
        bVarB.d("fire-app-check-debug");
        bVarB.b(r.f(e.class));
        bVarB.b(r.d(b.class));
        bVarB.b(r.e(aeVar));
        bVarB.b(r.e(aeVar2));
        bVarB.b(r.e(aeVar3));
        bVarB.c(new g() { // from class: com.google.firebase.appcheck.debug.a
            @Override // com.google.firebase.components.g
            public final Object a(d dVar) {
                return new com.google.firebase.appcheck.debug.a.b((e) dVar.f(e.class), dVar.c(b.class), (Executor) dVar.e(aeVar), (Executor) dVar.e(aeVar2), (Executor) dVar.e(aeVar3));
            }
        });
        return Arrays.asList(bVarB.a(), com.google.firebase.h.g.a("fire-app-check-debug", "17.1.3"));
    }
}
