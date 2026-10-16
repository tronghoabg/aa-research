package com.google.firebase.dynamiclinks.internal;

import L8.a;
import L8.b;
import L8.c;
import L8.l;
import androidx.annotation.Keep;
import com.applovin.impl.Z0;
import com.google.firebase.components.ComponentRegistrar;
import e9.AbstractC2475a;
import f9.h;
import java.util.Arrays;
import java.util.List;
import s8.g;
import w8.d;

@Keep
/* loaded from: classes4.dex */
public final class FirebaseDynamicLinkRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-dl";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC2475a lambda$getComponents$0(c cVar) {
        return new h((g) cVar.a(g.class), cVar.c(d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<b> getComponents() {
        a aVarB = b.b(AbstractC2475a.class);
        aVarB.f6983a = LIBRARY_NAME;
        aVarB.c(l.d(g.class));
        aVarB.c(l.b(d.class));
        aVarB.f6989g = new Z0(21);
        return Arrays.asList(aVarB.d(), ic.d.m(LIBRARY_NAME, "22.1.0"));
    }
}
