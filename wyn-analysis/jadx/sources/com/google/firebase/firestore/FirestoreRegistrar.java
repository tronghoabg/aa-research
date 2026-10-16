package com.google.firebase.firestore;

import E8.a;
import K8.InterfaceC0689a;
import L8.c;
import Y9.b;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import ic.d;
import java.util.Arrays;
import java.util.List;
import m9.B;
import m9.I;
import s8.g;
import s8.l;
import v9.h;
import x9.f;

@Keep
/* loaded from: classes4.dex */
public class FirestoreRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fst";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ I lambda$getComponents$0(c cVar) {
        return new I((Context) cVar.a(Context.class), (g) cVar.a(g.class), cVar.g(InterfaceC0689a.class), cVar.g(a.class), new h(cVar.c(b.class), cVar.c(f.class), (l) cVar.a(l.class)));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<L8.b> getComponents() {
        L8.a aVarB = L8.b.b(I.class);
        aVarB.f6983a = LIBRARY_NAME;
        aVarB.c(L8.l.d(g.class));
        aVarB.c(L8.l.d(Context.class));
        aVarB.c(L8.l.b(f.class));
        aVarB.c(L8.l.b(b.class));
        aVarB.c(L8.l.a(InterfaceC0689a.class));
        aVarB.c(L8.l.a(a.class));
        aVarB.c(new L8.l(0, 0, l.class));
        aVarB.f6989g = new B(1);
        return Arrays.asList(aVarB.d(), d.m(LIBRARY_NAME, "25.1.1"));
    }
}
