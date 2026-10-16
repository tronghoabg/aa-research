package com.google.firebase.inappmessaging;

import A.e0;
import D9.f;
import G9.e;
import J9.C0642a;
import J9.C0648g;
import J9.C0653l;
import J9.D;
import J9.H;
import J9.W;
import L8.c;
import L8.l;
import L8.r;
import L8.t;
import L9.h;
import M9.a;
import P9.d;
import Va.C1038ka;
import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import c8.C1581e;
import com.google.firebase.components.ComponentRegistrar;
import d9.InterfaceC2400a;
import df.InterfaceC2432a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import l9.InterfaceC3448d;
import m9.S;
import o1.C3641c;
import q5.InterfaceC3872g;
import s8.g;
import u8.C4262a;
import wa.C4398a;
import y8.InterfaceC4566a;
import y8.InterfaceC4567b;
import y8.InterfaceC4568c;
import ya.b;
import z9.C4623B;
import z9.C4627F;
import za.C4658a;

@Keep
/* loaded from: classes4.dex */
public class FirebaseInAppMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fiam";
    private t backgroundExecutor = new t(InterfaceC4566a.class, Executor.class);
    private t blockingExecutor = new t(InterfaceC4567b.class, Executor.class);
    private t lightWeightExecutor = new t(InterfaceC4568c.class, Executor.class);
    private t legacyTransportFactory = new t(InterfaceC2400a.class, InterfaceC3872g.class);

    /* JADX INFO: Access modifiers changed from: private */
    public C4623B providesFirebaseInAppMessaging(c cVar) {
        g gVar = (g) cVar.a(g.class);
        d dVar = (d) cVar.a(d.class);
        r rVarG = cVar.g(w8.d.class);
        InterfaceC3448d interfaceC3448d = (InterfaceC3448d) cVar.a(InterfaceC3448d.class);
        gVar.a();
        Y9.c cVar2 = new Y9.c((Application) gVar.f45328a, 16);
        S3.c cVar3 = new S3.c(rVarG, interfaceC3448d);
        b bVar = new b(21);
        H h10 = new H();
        xa.d dVar2 = new xa.d(16, false);
        dVar2.f47873b = h10;
        K9.b bVar2 = new K9.b(new C1038ka(22), new S(22), cVar2, new C4658a(21), dVar2, bVar, new Xd.c(22), new C4398a(22), new C1581e(22), cVar3, new e(9, (Executor) cVar.b(this.lightWeightExecutor), (Executor) cVar.b(this.backgroundExecutor), (Executor) cVar.b(this.blockingExecutor), false));
        C0642a c0642a = new C0642a(((C4262a) cVar.a(C4262a.class)).a("fiam"), (Executor) cVar.b(this.blockingExecutor));
        Dd.c cVar4 = new Dd.c(8, gVar, dVar, new a(), false);
        e0 e0Var = new e0(gVar, 13);
        InterfaceC3872g interfaceC3872g = (InterfaceC3872g) cVar.b(this.legacyTransportFactory);
        interfaceC3872g.getClass();
        K9.a aVar = new K9.a(bVar2, 2);
        K9.a aVar2 = new K9.a(bVar2, 11);
        K9.a aVar3 = new K9.a(bVar2, 5);
        f fVar = new f(bVar2, 3);
        InterfaceC2432a interfaceC2432aA = A9.a.a(new L9.a(cVar4, A9.a.a(new J9.r(A9.a.a(new W(e0Var, new K9.a(bVar2, 8), new A9.c(e0Var, 4))), 0)), new K9.a(bVar2, 3), new K9.a(bVar2, 13)));
        K9.a aVar4 = new K9.a(bVar2, 1);
        K9.a aVar5 = new K9.a(bVar2, 15);
        K9.a aVar6 = new K9.a(bVar2, 9);
        K9.a aVar7 = new K9.a(bVar2, 14);
        f fVar2 = new f(bVar2, 2);
        L9.b bVar3 = new L9.b(2, cVar4);
        A9.c cVar5 = new A9.c(cVar4, bVar3);
        L9.b bVar4 = new L9.b(1, cVar4);
        C0648g c0648g = new C0648g(cVar4, bVar3, new K9.a(bVar2, 7), 2);
        A9.c cVar6 = new A9.c(c0642a, 0);
        K9.a aVar8 = new K9.a(bVar2, 4);
        InterfaceC2432a interfaceC2432aA2 = A9.a.a(new D(aVar, aVar2, aVar3, fVar, interfaceC2432aA, aVar4, aVar5, aVar6, aVar7, fVar2, cVar5, bVar4, c0648g, cVar6, aVar8));
        K9.a aVar9 = new K9.a(bVar2, 12);
        L9.b bVar5 = new L9.b(0, cVar4);
        A9.c cVar7 = new A9.c(interfaceC3872g, 0);
        K9.a aVar10 = new K9.a(bVar2, 0);
        K9.a aVar11 = new K9.a(bVar2, 6);
        return (C4623B) A9.a.a(new C4627F(interfaceC2432aA2, aVar9, c0648g, bVar4, new C0653l(aVar6, fVar, aVar5, aVar7, aVar3, fVar2, A9.a.a(new h(bVar5, cVar7, aVar10, bVar4, fVar, aVar11, aVar8)), c0648g), aVar11, new K9.a(bVar2, 10))).get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<L8.b> getComponents() {
        L8.a aVarB = L8.b.b(C4623B.class);
        aVarB.f6983a = LIBRARY_NAME;
        aVarB.c(l.d(Context.class));
        aVarB.c(l.d(d.class));
        aVarB.c(l.d(g.class));
        aVarB.c(l.d(C4262a.class));
        aVarB.c(l.a(w8.d.class));
        aVarB.c(l.c(this.legacyTransportFactory));
        aVarB.c(l.d(InterfaceC3448d.class));
        aVarB.c(l.c(this.backgroundExecutor));
        aVarB.c(l.c(this.blockingExecutor));
        aVarB.c(l.c(this.lightWeightExecutor));
        aVarB.f6989g = new C3641c(this, 27);
        aVarB.f(2);
        return Arrays.asList(aVarB.d(), ic.d.m(LIBRARY_NAME, "21.0.1"));
    }
}
