package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ae;
import com.google.firebase.components.r;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    static /* synthetic */ i lambda$getComponents$0(ae aeVar, com.google.firebase.components.d dVar) {
        return new i((Context) dVar.f(Context.class), (ScheduledExecutorService) dVar.e(aeVar), (com.google.firebase.e) dVar.f(com.google.firebase.e.class), (com.google.firebase.installations.d) dVar.f(com.google.firebase.installations.d.class), ((com.google.firebase.abt.component.a) dVar.f(com.google.firebase.abt.component.a.class)).a(), dVar.c(com.google.firebase.a.a.c.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.c<?>> getComponents() {
        final ae aeVar = new ae(com.google.firebase.b.a.b.class, ScheduledExecutorService.class);
        com.google.firebase.components.b bVarD = com.google.firebase.components.c.d(i.class, com.google.firebase.remoteconfig.a.a.class);
        bVarD.d(LIBRARY_NAME);
        bVarD.b(r.f(Context.class));
        bVarD.b(r.e(aeVar));
        bVarD.b(r.f(com.google.firebase.e.class));
        bVarD.b(r.f(com.google.firebase.installations.d.class));
        bVarD.b(r.f(com.google.firebase.abt.component.a.class));
        bVarD.b(r.d(com.google.firebase.a.a.c.class));
        bVarD.c(new com.google.firebase.components.g() { // from class: com.google.firebase.remoteconfig.j
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                return RemoteConfigRegistrar.lambda$getComponents$0(aeVar, dVar);
            }
        });
        bVarD.g();
        return Arrays.asList(bVarD.a(), com.google.firebase.h.g.a(LIBRARY_NAME, "23.0.2_1p"));
    }
}
