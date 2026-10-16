package com.google.firebase.inappmessaging.display;

import B9.f;
import C9.a;
import D9.b;
import D9.e;
import G9.d;
import L8.c;
import S3.l;
import S3.q;
import android.app.Application;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import df.InterfaceC2432a;
import java.util.Arrays;
import java.util.List;
import s8.g;
import y3.C4552j;
import z9.C4623B;
import za.C4658a;

@Keep
/* loaded from: classes4.dex */
public class FirebaseInAppMessagingDisplayRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fiamd";

    /* JADX INFO: Access modifiers changed from: private */
    public f buildFirebaseInAppMessagingUI(c cVar) {
        g gVar = (g) cVar.a(g.class);
        C4623B c4623b = (C4623B) cVar.a(C4623B.class);
        gVar.a();
        Application application = (Application) gVar.f45328a;
        C4552j c4552j = new C4552j(application, 9);
        C4658a c4658a = new C4658a(18);
        q qVar = new q();
        qVar.f10996a = a.a(new G9.a(c4552j, 0));
        qVar.f10997b = a.a(e.f2570b);
        qVar.f10998c = a.a(new b((InterfaceC2432a) qVar.f10996a, 0));
        d dVar = new d(c4658a, (InterfaceC2432a) qVar.f10996a);
        qVar.f10999d = new G9.c(c4658a, dVar, 7);
        qVar.f11000e = new G9.c(c4658a, dVar, 4);
        qVar.f11001f = new G9.c(c4658a, dVar, 5);
        qVar.f11002g = new G9.c(c4658a, dVar, 6);
        qVar.f11003h = new G9.c(c4658a, dVar, 2);
        qVar.f11004i = new G9.c(c4658a, dVar, 3);
        qVar.f11005j = new G9.c(c4658a, dVar, 1);
        qVar.k = new G9.c(c4658a, dVar, 0);
        l lVar = new l(c4623b);
        ya.b bVar = new ya.b(18);
        InterfaceC2432a interfaceC2432aA = a.a(new G9.a(lVar, 2));
        F9.a aVar = new F9.a(qVar, 2);
        F9.a aVar2 = new F9.a(qVar, 3);
        f fVar = (f) ((a) a.a(new B9.g(interfaceC2432aA, aVar, a.a(new b(a.a(new G9.a(bVar, aVar2)), 1)), new F9.a(qVar, 0), aVar2, new F9.a(qVar, 1), a.a(e.f2569a)))).get();
        application.registerActivityLifecycleCallbacks(fVar);
        return fVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<L8.b> getComponents() {
        L8.a aVarB = L8.b.b(f.class);
        aVarB.f6983a = LIBRARY_NAME;
        aVarB.c(L8.l.d(g.class));
        aVarB.c(L8.l.d(C4623B.class));
        aVarB.f6989g = new B8.b(this, 1);
        aVarB.f(2);
        return Arrays.asList(aVarB.d(), ic.d.m(LIBRARY_NAME, "21.0.1"));
    }
}
