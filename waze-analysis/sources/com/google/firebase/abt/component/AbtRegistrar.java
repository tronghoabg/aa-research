package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.a.a.c;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.d;
import com.google.firebase.components.r;
import com.google.firebase.h.g;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    static /* synthetic */ a lambda$getComponents$0(d dVar) {
        return new a(dVar.c(c.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.c<?>> getComponents() {
        com.google.firebase.components.b bVarB = com.google.firebase.components.c.b(a.class);
        bVarB.d(LIBRARY_NAME);
        bVarB.b(r.f(Context.class));
        bVarB.b(r.d(c.class));
        bVarB.c(new b(0));
        return Arrays.asList(bVarB.a(), g.a(LIBRARY_NAME, "21.1.2_1p"));
    }
}
