package com.google.firebase.iid;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.r;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class Registrar implements ComponentRegistrar {
    static /* synthetic */ FirebaseInstanceId lambda$getComponents$0(com.google.firebase.components.d dVar) {
        com.google.firebase.e eVar = (com.google.firebase.e) dVar.f(com.google.firebase.e.class);
        return new FirebaseInstanceId(eVar, new g(eVar.a()), a.b(), a.b(), dVar.c(com.google.firebase.h.h.class), dVar.c(com.google.firebase.f.h.class), (com.google.firebase.installations.d) dVar.f(com.google.firebase.installations.d.class));
    }

    static /* synthetic */ com.google.firebase.iid.a.a lambda$getComponents$1(com.google.firebase.components.d dVar) {
        return new i((FirebaseInstanceId) dVar.f(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.c<?>> getComponents() {
        com.google.firebase.components.b bVarB = com.google.firebase.components.c.b(FirebaseInstanceId.class);
        bVarB.b(r.f(com.google.firebase.e.class));
        bVarB.b(r.d(com.google.firebase.h.h.class));
        bVarB.b(r.d(com.google.firebase.f.h.class));
        bVarB.b(r.f(com.google.firebase.installations.d.class));
        final int i2 = 1;
        bVarB.c(new com.google.firebase.components.g() { // from class: com.google.firebase.iid.h
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                return i2 != 0 ? Registrar.lambda$getComponents$0(dVar) : Registrar.lambda$getComponents$1(dVar);
            }
        });
        bVarB.f();
        com.google.firebase.components.c cVarA = bVarB.a();
        com.google.firebase.components.b bVarB2 = com.google.firebase.components.c.b(com.google.firebase.iid.a.a.class);
        bVarB2.b(r.f(FirebaseInstanceId.class));
        final int i3 = 0;
        bVarB2.c(new com.google.firebase.components.g() { // from class: com.google.firebase.iid.h
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                return i3 != 0 ? Registrar.lambda$getComponents$0(dVar) : Registrar.lambda$getComponents$1(dVar);
            }
        });
        return Arrays.asList(cVarA, bVarB2.a(), com.google.firebase.h.g.a("fire-iid", "21.1.1"));
    }
}
