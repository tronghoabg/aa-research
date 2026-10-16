package com.google.firebase.sessions;

import Ef.A;
import L8.a;
import L8.c;
import L8.l;
import L8.t;
import O9.b;
import P9.d;
import a2.v;
import android.content.Context;
import androidx.annotation.Keep;
import com.applovin.impl.Z0;
import com.google.firebase.components.ComponentRegistrar;
import ea.C2480D;
import ea.C2499n;
import ea.C2501p;
import ea.InterfaceC2484H;
import ea.InterfaceC2506v;
import ea.K;
import ea.M;
import ea.V;
import ea.W;
import ga.j;
import java.util.List;
import jf.InterfaceC3108h;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import q5.InterfaceC3872g;
import r7.AbstractC3935e;
import s8.g;
import y8.InterfaceC4566a;
import y8.InterfaceC4567b;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "LL8/b;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "ea/p", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @NotNull
    private static final String LIBRARY_NAME = "fire-sessions";

    @NotNull
    private static final C2501p Companion = new C2501p();

    @NotNull
    private static final t firebaseApp = t.a(g.class);

    @NotNull
    private static final t firebaseInstallationsApi = t.a(d.class);

    @NotNull
    private static final t backgroundDispatcher = new t(InterfaceC4566a.class, A.class);

    @NotNull
    private static final t blockingDispatcher = new t(InterfaceC4567b.class, A.class);

    @NotNull
    private static final t transportFactory = t.a(InterfaceC3872g.class);

    @NotNull
    private static final t sessionsSettings = t.a(j.class);

    @NotNull
    private static final t sessionLifecycleServiceBinder = t.a(V.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2499n getComponents$lambda$0(c cVar) {
        Object objB = cVar.b(firebaseApp);
        AbstractC3340k.d(objB, "container[firebaseApp]");
        Object objB2 = cVar.b(sessionsSettings);
        AbstractC3340k.d(objB2, "container[sessionsSettings]");
        Object objB3 = cVar.b(backgroundDispatcher);
        AbstractC3340k.d(objB3, "container[backgroundDispatcher]");
        Object objB4 = cVar.b(sessionLifecycleServiceBinder);
        AbstractC3340k.d(objB4, "container[sessionLifecycleServiceBinder]");
        return new C2499n((g) objB, (j) objB2, (InterfaceC3108h) objB3, (V) objB4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M getComponents$lambda$1(c cVar) {
        return new M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2484H getComponents$lambda$2(c cVar) {
        Object objB = cVar.b(firebaseApp);
        AbstractC3340k.d(objB, "container[firebaseApp]");
        Object objB2 = cVar.b(firebaseInstallationsApi);
        AbstractC3340k.d(objB2, "container[firebaseInstallationsApi]");
        Object objB3 = cVar.b(sessionsSettings);
        AbstractC3340k.d(objB3, "container[sessionsSettings]");
        b bVarF = cVar.f(transportFactory);
        AbstractC3340k.d(bVarF, "container.getProvider(transportFactory)");
        v vVar = new v(bVarF, 7);
        Object objB4 = cVar.b(backgroundDispatcher);
        AbstractC3340k.d(objB4, "container[backgroundDispatcher]");
        return new K((g) objB, (d) objB2, (j) objB3, vVar, (InterfaceC3108h) objB4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j getComponents$lambda$3(c cVar) {
        Object objB = cVar.b(firebaseApp);
        AbstractC3340k.d(objB, "container[firebaseApp]");
        Object objB2 = cVar.b(blockingDispatcher);
        AbstractC3340k.d(objB2, "container[blockingDispatcher]");
        Object objB3 = cVar.b(backgroundDispatcher);
        AbstractC3340k.d(objB3, "container[backgroundDispatcher]");
        Object objB4 = cVar.b(firebaseInstallationsApi);
        AbstractC3340k.d(objB4, "container[firebaseInstallationsApi]");
        return new j((g) objB, (InterfaceC3108h) objB2, (InterfaceC3108h) objB3, (d) objB4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2506v getComponents$lambda$4(c cVar) {
        g gVar = (g) cVar.b(firebaseApp);
        gVar.a();
        Context context = gVar.f45328a;
        AbstractC3340k.d(context, "container[firebaseApp].applicationContext");
        Object objB = cVar.b(backgroundDispatcher);
        AbstractC3340k.d(objB, "container[backgroundDispatcher]");
        return new C2480D(context, (InterfaceC3108h) objB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V getComponents$lambda$5(c cVar) {
        Object objB = cVar.b(firebaseApp);
        AbstractC3340k.d(objB, "container[firebaseApp]");
        return new W((g) objB);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<L8.b> getComponents() {
        a aVarB = L8.b.b(C2499n.class);
        aVarB.f6983a = LIBRARY_NAME;
        t tVar = firebaseApp;
        aVarB.c(l.c(tVar));
        t tVar2 = sessionsSettings;
        aVarB.c(l.c(tVar2));
        t tVar3 = backgroundDispatcher;
        aVarB.c(l.c(tVar3));
        aVarB.c(l.c(sessionLifecycleServiceBinder));
        aVarB.f6989g = new Z0(11);
        aVarB.f(2);
        L8.b bVarD = aVarB.d();
        a aVarB2 = L8.b.b(M.class);
        aVarB2.f6983a = "session-generator";
        aVarB2.f6989g = new Z0(12);
        L8.b bVarD2 = aVarB2.d();
        a aVarB3 = L8.b.b(InterfaceC2484H.class);
        aVarB3.f6983a = "session-publisher";
        aVarB3.c(new l(tVar, 1, 0));
        t tVar4 = firebaseInstallationsApi;
        aVarB3.c(l.c(tVar4));
        aVarB3.c(new l(tVar2, 1, 0));
        aVarB3.c(new l(transportFactory, 1, 1));
        aVarB3.c(new l(tVar3, 1, 0));
        aVarB3.f6989g = new Z0(13);
        L8.b bVarD3 = aVarB3.d();
        a aVarB4 = L8.b.b(j.class);
        aVarB4.f6983a = "sessions-settings";
        aVarB4.c(new l(tVar, 1, 0));
        aVarB4.c(l.c(blockingDispatcher));
        aVarB4.c(new l(tVar3, 1, 0));
        aVarB4.c(new l(tVar4, 1, 0));
        aVarB4.f6989g = new Z0(14);
        L8.b bVarD4 = aVarB4.d();
        a aVarB5 = L8.b.b(InterfaceC2506v.class);
        aVarB5.f6983a = "sessions-datastore";
        aVarB5.c(new l(tVar, 1, 0));
        aVarB5.c(new l(tVar3, 1, 0));
        aVarB5.f6989g = new Z0(15);
        L8.b bVarD5 = aVarB5.d();
        a aVarB6 = L8.b.b(V.class);
        aVarB6.f6983a = "sessions-service-binder";
        aVarB6.c(new l(tVar, 1, 0));
        aVarB6.f6989g = new Z0(16);
        return AbstractC3935e.D(bVarD, bVarD2, bVarD3, bVarD4, bVarD5, aVarB6.d(), ic.d.m(LIBRARY_NAME, "2.0.7"));
    }
}
