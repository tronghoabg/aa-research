package com.google.firebase.abt.component;

import L8.a;
import L8.b;
import L8.c;
import L8.l;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import m9.B;
import u8.C4262a;
import w8.d;

@Keep
/* loaded from: classes4.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C4262a lambda$getComponents$0(c cVar) {
        return new C4262a((Context) cVar.a(Context.class), cVar.c(d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        a aVarB = b.b(C4262a.class);
        aVarB.f6983a = LIBRARY_NAME;
        aVarB.c(l.d(Context.class));
        aVarB.c(l.b(d.class));
        aVarB.f6989g = new B(24);
        return Arrays.asList(aVarB.d(), ic.d.m(LIBRARY_NAME, "21.1.1"));
    }
}
