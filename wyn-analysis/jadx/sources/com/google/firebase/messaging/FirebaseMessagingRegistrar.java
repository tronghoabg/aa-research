package com.google.firebase.messaging;

import L8.a;
import L8.c;
import L8.l;
import L8.t;
import P9.d;
import W9.m;
import Y9.b;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import d9.InterfaceC2401b;
import java.util.Arrays;
import java.util.List;
import l9.InterfaceC3448d;
import q5.InterfaceC3872g;
import s8.g;
import x9.f;
import y9.InterfaceC4569a;

@Keep
/* loaded from: classes4.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(t tVar, c cVar) {
        g gVar = (g) cVar.a(g.class);
        if (cVar.a(InterfaceC4569a.class) == null) {
            return new FirebaseMessaging(gVar, cVar.c(b.class), cVar.c(f.class), (d) cVar.a(d.class), cVar.f(tVar), (InterfaceC3448d) cVar.a(InterfaceC3448d.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<L8.b> getComponents() {
        t tVar = new t(InterfaceC2401b.class, InterfaceC3872g.class);
        a aVarB = L8.b.b(FirebaseMessaging.class);
        aVarB.f6983a = LIBRARY_NAME;
        aVarB.c(l.d(g.class));
        aVarB.c(new l(0, 0, InterfaceC4569a.class));
        aVarB.c(l.b(b.class));
        aVarB.c(l.b(f.class));
        aVarB.c(l.d(d.class));
        aVarB.c(new l(tVar, 0, 1));
        aVarB.c(l.d(InterfaceC3448d.class));
        aVarB.f6989g = new m(tVar, 0);
        aVarB.f(1);
        return Arrays.asList(aVarB.d(), ic.d.m(LIBRARY_NAME, "24.1.0"));
    }
}
