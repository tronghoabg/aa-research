package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    static /* synthetic */ FirebaseMessaging lambda$getComponents$0(com.google.firebase.components.ae aeVar, com.google.firebase.components.d dVar) {
        com.google.firebase.e eVar = (com.google.firebase.e) dVar.f(com.google.firebase.e.class);
        com.google.firebase.iid.a.a aVar = (com.google.firebase.iid.a.a) dVar.f(com.google.firebase.iid.a.a.class);
        com.google.firebase.g.c cVarC = dVar.c(com.google.firebase.h.h.class);
        com.google.firebase.g.c cVarC2 = dVar.c(com.google.firebase.f.h.class);
        com.google.firebase.installations.d dVar2 = (com.google.firebase.installations.d) dVar.f(com.google.firebase.installations.d.class);
        com.google.firebase.g.c cVarB = dVar.b(aeVar);
        com.google.firebase.e.c cVar = (com.google.firebase.e.c) dVar.f(com.google.firebase.e.c.class);
        u uVar = new u(eVar.a());
        return new FirebaseMessaging(eVar, aVar, cVarB, cVar, uVar, new s(eVar, uVar, new com.google.android.gms.f.aa(eVar.a()), cVarC, cVarC2, dVar2), Executors.newSingleThreadExecutor(new com.google.android.gms.common.util.a.b("Firebase-Messaging-Task")), new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.a.b("Firebase-Messaging-Init")), new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.a.b("Firebase-Messaging-File-Io")));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.c<?>> getComponents() {
        final com.google.firebase.components.ae aeVar = new com.google.firebase.components.ae(com.google.firebase.datatransport.b.class, com.google.android.datatransport.h.class);
        com.google.firebase.components.b bVarB = com.google.firebase.components.c.b(FirebaseMessaging.class);
        bVarB.d(LIBRARY_NAME);
        bVarB.b(com.google.firebase.components.r.f(com.google.firebase.e.class));
        bVarB.b(com.google.firebase.components.r.b(com.google.firebase.iid.a.a.class));
        bVarB.b(com.google.firebase.components.r.d(com.google.firebase.h.h.class));
        bVarB.b(com.google.firebase.components.r.d(com.google.firebase.f.h.class));
        bVarB.b(com.google.firebase.components.r.f(com.google.firebase.installations.d.class));
        bVarB.b(com.google.firebase.components.r.c(aeVar));
        bVarB.b(com.google.firebase.components.r.f(com.google.firebase.e.c.class));
        bVarB.c(new com.google.firebase.components.g() { // from class: com.google.firebase.messaging.r
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                return FirebaseMessagingRegistrar.lambda$getComponents$0(aeVar, dVar);
            }
        });
        bVarB.f();
        return Arrays.asList(bVarB.a(), com.google.firebase.h.g.a(LIBRARY_NAME, "24.0.0"));
    }
}
