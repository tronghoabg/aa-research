package com.google.firebase.auth;

import C8.i;
import E8.a;
import K8.C0692d;
import K8.InterfaceC0689a;
import L8.c;
import L8.l;
import L8.t;
import O9.b;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import s8.g;
import x9.C4504d;
import x9.InterfaceC4505e;
import y8.InterfaceC4566a;
import y8.InterfaceC4567b;
import y8.InterfaceC4568c;
import y8.d;

@Keep
/* loaded from: classes4.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static FirebaseAuth lambda$getComponents$0(t tVar, t tVar2, t tVar3, t tVar4, t tVar5, c cVar) {
        g gVar = (g) cVar.a(g.class);
        b bVarC = cVar.c(a.class);
        b bVarC2 = cVar.c(InterfaceC4505e.class);
        return new C0692d(gVar, bVarC, bVarC2, (Executor) cVar.b(tVar2), (Executor) cVar.b(tVar3), (ScheduledExecutorService) cVar.b(tVar4), (Executor) cVar.b(tVar5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<L8.b> getComponents() {
        t tVar = new t(InterfaceC4566a.class, Executor.class);
        t tVar2 = new t(InterfaceC4567b.class, Executor.class);
        t tVar3 = new t(InterfaceC4568c.class, Executor.class);
        t tVar4 = new t(InterfaceC4568c.class, ScheduledExecutorService.class);
        t tVar5 = new t(d.class, Executor.class);
        L8.a aVar = new L8.a(FirebaseAuth.class, new Class[]{InterfaceC0689a.class});
        aVar.c(l.d(g.class));
        aVar.c(new l(1, 1, InterfaceC4505e.class));
        aVar.c(new l(tVar, 1, 0));
        aVar.c(new l(tVar2, 1, 0));
        aVar.c(new l(tVar3, 1, 0));
        aVar.c(new l(tVar4, 1, 0));
        aVar.c(new l(tVar5, 1, 0));
        aVar.c(l.b(a.class));
        i iVar = new i(1, false);
        iVar.f1939b = tVar;
        iVar.f1940c = tVar2;
        iVar.f1941d = tVar3;
        iVar.f1942e = tVar4;
        iVar.f1943f = tVar5;
        aVar.f6989g = iVar;
        L8.b bVarD = aVar.d();
        C4504d c4504d = new C4504d(0 == true ? 1 : 0);
        L8.a aVarB = L8.b.b(C4504d.class);
        aVarB.f6985c = 1;
        aVarB.f6989g = new F5.c(c4504d);
        return Arrays.asList(bVarD, aVarB.d(), ic.d.m("fire-auth", "23.1.0"));
    }
}
