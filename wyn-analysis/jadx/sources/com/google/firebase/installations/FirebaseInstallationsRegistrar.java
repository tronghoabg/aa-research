package com.google.firebase.installations;

import J9.C0664x;
import L8.a;
import L8.b;
import L8.c;
import L8.l;
import L8.t;
import M8.j;
import P9.d;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import s8.g;
import x9.C4504d;
import x9.InterfaceC4505e;
import y8.InterfaceC4566a;
import y8.InterfaceC4567b;

@Keep
/* loaded from: classes4.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(c cVar) {
        return new P9.c((g) cVar.a(g.class), cVar.c(InterfaceC4505e.class), (ExecutorService) cVar.b(new t(InterfaceC4566a.class, ExecutorService.class)), new j((Executor) cVar.b(new t(InterfaceC4567b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        a aVarB = b.b(d.class);
        aVarB.f6983a = LIBRARY_NAME;
        aVarB.c(l.d(g.class));
        aVarB.c(l.b(InterfaceC4505e.class));
        aVarB.c(new l(new t(InterfaceC4566a.class, ExecutorService.class), 1, 0));
        aVarB.c(new l(new t(InterfaceC4567b.class, Executor.class), 1, 0));
        aVarB.f6989g = new C0664x(20);
        b bVarD = aVarB.d();
        C4504d c4504d = new C4504d(0);
        a aVarB2 = b.b(C4504d.class);
        aVarB2.f6985c = 1;
        aVarB2.f6989g = new F5.c(c4504d);
        return Arrays.asList(bVarD, aVarB2.d(), ic.d.m(LIBRARY_NAME, "18.0.0"));
    }
}
