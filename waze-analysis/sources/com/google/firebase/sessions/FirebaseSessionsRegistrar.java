package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final q Companion = new q();
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final com.google.firebase.components.ae<kotlinx.coroutines.ab> backgroundDispatcher;
    private static final com.google.firebase.components.ae<kotlinx.coroutines.ab> blockingDispatcher;
    private static final com.google.firebase.components.ae<com.google.firebase.e> firebaseApp;
    private static final com.google.firebase.components.ae<com.google.firebase.installations.d> firebaseInstallationsApi;
    private static final com.google.firebase.components.ae<ax> sessionLifecycleServiceBinder;
    private static final com.google.firebase.components.ae<com.google.firebase.sessions.b.k> sessionsSettings;
    private static final com.google.firebase.components.ae<com.google.android.datatransport.h> transportFactory;

    static {
        com.google.firebase.components.ae<com.google.firebase.e> aeVarA = com.google.firebase.components.ae.a(com.google.firebase.e.class);
        h.g.b.x.e(aeVarA, "unqualified(...)");
        firebaseApp = aeVarA;
        com.google.firebase.components.ae<com.google.firebase.installations.d> aeVarA2 = com.google.firebase.components.ae.a(com.google.firebase.installations.d.class);
        h.g.b.x.e(aeVarA2, "unqualified(...)");
        firebaseInstallationsApi = aeVarA2;
        com.google.firebase.components.ae<kotlinx.coroutines.ab> aeVar = new com.google.firebase.components.ae<>(com.google.firebase.b.a.a.class, kotlinx.coroutines.ab.class);
        h.g.b.x.e(aeVar, "qualified(...)");
        backgroundDispatcher = aeVar;
        com.google.firebase.components.ae<kotlinx.coroutines.ab> aeVar2 = new com.google.firebase.components.ae<>(com.google.firebase.b.a.b.class, kotlinx.coroutines.ab.class);
        h.g.b.x.e(aeVar2, "qualified(...)");
        blockingDispatcher = aeVar2;
        com.google.firebase.components.ae<com.google.android.datatransport.h> aeVarA3 = com.google.firebase.components.ae.a(com.google.android.datatransport.h.class);
        h.g.b.x.e(aeVarA3, "unqualified(...)");
        transportFactory = aeVarA3;
        com.google.firebase.components.ae<com.google.firebase.sessions.b.k> aeVarA4 = com.google.firebase.components.ae.a(com.google.firebase.sessions.b.k.class);
        h.g.b.x.e(aeVarA4, "unqualified(...)");
        sessionsSettings = aeVarA4;
        com.google.firebase.components.ae<ax> aeVarA5 = com.google.firebase.components.ae.a(ax.class);
        h.g.b.x.e(aeVarA5, "unqualified(...)");
        sessionLifecycleServiceBinder = aeVarA5;
    }

    static final n getComponents$lambda$0(com.google.firebase.components.d dVar) {
        Object objE = dVar.e(firebaseApp);
        h.g.b.x.e(objE, "get(...)");
        Object objE2 = dVar.e(sessionsSettings);
        h.g.b.x.e(objE2, "get(...)");
        Object objE3 = dVar.e(backgroundDispatcher);
        h.g.b.x.e(objE3, "get(...)");
        Object objE4 = dVar.e(sessionLifecycleServiceBinder);
        h.g.b.x.e(objE4, "get(...)");
        return new n((com.google.firebase.e) objE, (com.google.firebase.sessions.b.k) objE2, (h.c.j) objE3, (ax) objE4);
    }

    static final ap getComponents$lambda$1(com.google.firebase.components.d dVar) {
        return new ap(ba.f10919a, ao.f10826a);
    }

    static final ak getComponents$lambda$2(com.google.firebase.components.d dVar) {
        Object objE = dVar.e(firebaseApp);
        h.g.b.x.e(objE, "get(...)");
        Object objE2 = dVar.e(firebaseInstallationsApi);
        h.g.b.x.e(objE2, "get(...)");
        Object objE3 = dVar.e(sessionsSettings);
        h.g.b.x.e(objE3, "get(...)");
        com.google.firebase.sessions.b.k kVar = (com.google.firebase.sessions.b.k) objE3;
        com.google.firebase.g.c cVarB = dVar.b(transportFactory);
        h.g.b.x.e(cVarB, "getProvider(...)");
        com.google.firebase.messaging.a.g gVar = new com.google.firebase.messaging.a.g(cVarB);
        Object objE4 = dVar.e(backgroundDispatcher);
        h.g.b.x.e(objE4, "get(...)");
        return new an((com.google.firebase.e) objE, (com.google.firebase.installations.d) objE2, kVar, gVar, (h.c.j) objE4);
    }

    static final com.google.firebase.sessions.b.k getComponents$lambda$3(com.google.firebase.components.d dVar) {
        Object objE = dVar.e(firebaseApp);
        h.g.b.x.e(objE, "get(...)");
        Object objE2 = dVar.e(blockingDispatcher);
        h.g.b.x.e(objE2, "get(...)");
        Object objE3 = dVar.e(backgroundDispatcher);
        h.g.b.x.e(objE3, "get(...)");
        Object objE4 = dVar.e(firebaseInstallationsApi);
        h.g.b.x.e(objE4, "get(...)");
        return new com.google.firebase.sessions.b.k((com.google.firebase.e) objE, (h.c.j) objE2, (h.c.j) objE3, (com.google.firebase.installations.d) objE4);
    }

    static final w getComponents$lambda$4(com.google.firebase.components.d dVar) {
        Context contextA = ((com.google.firebase.e) dVar.e(firebaseApp)).a();
        h.g.b.x.e(contextA, "getApplicationContext(...)");
        Object objE = dVar.e(backgroundDispatcher);
        h.g.b.x.e(objE, "get(...)");
        return new ag(contextA, (h.c.j) objE);
    }

    static final ax getComponents$lambda$5(com.google.firebase.components.d dVar) {
        Object objE = dVar.e(firebaseApp);
        h.g.b.x.e(objE, "get(...)");
        return new ay((com.google.firebase.e) objE);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.c<? extends Object>> getComponents() {
        com.google.firebase.components.b bVarB = com.google.firebase.components.c.b(n.class);
        bVarB.d(LIBRARY_NAME);
        com.google.firebase.components.ae<com.google.firebase.e> aeVar = firebaseApp;
        bVarB.b(com.google.firebase.components.r.e(aeVar));
        com.google.firebase.components.ae<com.google.firebase.sessions.b.k> aeVar2 = sessionsSettings;
        bVarB.b(com.google.firebase.components.r.e(aeVar2));
        com.google.firebase.components.ae<kotlinx.coroutines.ab> aeVar3 = backgroundDispatcher;
        bVarB.b(com.google.firebase.components.r.e(aeVar3));
        bVarB.b(com.google.firebase.components.r.e(sessionLifecycleServiceBinder));
        final int i2 = 1;
        bVarB.c(new com.google.firebase.components.g() { // from class: com.google.firebase.sessions.p
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                int i3 = i2;
                return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? FirebaseSessionsRegistrar.getComponents$lambda$5(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$4(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$3(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$2(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$0(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$1(dVar);
            }
        });
        bVarB.g();
        final int i3 = 0;
        com.google.firebase.components.b bVarB2 = com.google.firebase.components.c.b(ap.class);
        bVarB2.d("session-generator");
        bVarB2.c(new com.google.firebase.components.g() { // from class: com.google.firebase.sessions.p
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                int i32 = i3;
                return i32 != 0 ? i32 != 1 ? i32 != 2 ? i32 != 3 ? i32 != 4 ? FirebaseSessionsRegistrar.getComponents$lambda$5(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$4(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$3(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$2(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$0(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$1(dVar);
            }
        });
        com.google.firebase.components.b bVarB3 = com.google.firebase.components.c.b(ak.class);
        bVarB3.d("session-publisher");
        bVarB3.b(com.google.firebase.components.r.e(aeVar));
        com.google.firebase.components.ae<com.google.firebase.installations.d> aeVar4 = firebaseInstallationsApi;
        bVarB3.b(com.google.firebase.components.r.e(aeVar4));
        bVarB3.b(com.google.firebase.components.r.e(aeVar2));
        bVarB3.b(com.google.firebase.components.r.g(transportFactory));
        bVarB3.b(com.google.firebase.components.r.e(aeVar3));
        final int i4 = 2;
        bVarB3.c(new com.google.firebase.components.g() { // from class: com.google.firebase.sessions.p
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                int i32 = i4;
                return i32 != 0 ? i32 != 1 ? i32 != 2 ? i32 != 3 ? i32 != 4 ? FirebaseSessionsRegistrar.getComponents$lambda$5(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$4(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$3(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$2(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$0(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$1(dVar);
            }
        });
        com.google.firebase.components.b bVarB4 = com.google.firebase.components.c.b(com.google.firebase.sessions.b.k.class);
        bVarB4.d("sessions-settings");
        bVarB4.b(com.google.firebase.components.r.e(aeVar));
        bVarB4.b(com.google.firebase.components.r.e(blockingDispatcher));
        bVarB4.b(com.google.firebase.components.r.e(aeVar3));
        bVarB4.b(com.google.firebase.components.r.e(aeVar4));
        final int i5 = 3;
        bVarB4.c(new com.google.firebase.components.g() { // from class: com.google.firebase.sessions.p
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                int i32 = i5;
                return i32 != 0 ? i32 != 1 ? i32 != 2 ? i32 != 3 ? i32 != 4 ? FirebaseSessionsRegistrar.getComponents$lambda$5(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$4(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$3(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$2(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$0(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$1(dVar);
            }
        });
        com.google.firebase.components.b bVarB5 = com.google.firebase.components.c.b(w.class);
        bVarB5.d("sessions-datastore");
        bVarB5.b(com.google.firebase.components.r.e(aeVar));
        bVarB5.b(com.google.firebase.components.r.e(aeVar3));
        final int i6 = 4;
        bVarB5.c(new com.google.firebase.components.g() { // from class: com.google.firebase.sessions.p
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                int i32 = i6;
                return i32 != 0 ? i32 != 1 ? i32 != 2 ? i32 != 3 ? i32 != 4 ? FirebaseSessionsRegistrar.getComponents$lambda$5(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$4(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$3(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$2(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$0(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$1(dVar);
            }
        });
        com.google.firebase.components.b bVarB6 = com.google.firebase.components.c.b(ax.class);
        bVarB6.d("sessions-service-binder");
        bVarB6.b(com.google.firebase.components.r.e(aeVar));
        final int i7 = 5;
        bVarB6.c(new com.google.firebase.components.g() { // from class: com.google.firebase.sessions.p
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                int i32 = i7;
                return i32 != 0 ? i32 != 1 ? i32 != 2 ? i32 != 3 ? i32 != 4 ? FirebaseSessionsRegistrar.getComponents$lambda$5(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$4(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$3(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$2(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$0(dVar) : FirebaseSessionsRegistrar.getComponents$lambda$1(dVar);
            }
        });
        return h.a.i.i(bVarB.a(), bVarB2.a(), bVarB3.a(), bVarB4.a(), bVarB5.a(), bVarB6.a(), com.google.firebase.h.g.a(LIBRARY_NAME, "2.0.4_1p"));
    }
}
