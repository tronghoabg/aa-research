package com.google.firebase.appcheck.playintegrity;

import com.google.firebase.appcheck.playintegrity.a.e;
import com.google.firebase.b.a.b;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ae;
import com.google.firebase.components.c;
import com.google.firebase.components.r;
import com.google.firebase.h.g;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class FirebaseAppCheckPlayIntegrityRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<c<?>> getComponents() {
        ae aeVar = new ae(com.google.firebase.b.a.c.class, Executor.class);
        ae aeVar2 = new ae(b.class, Executor.class);
        com.google.firebase.components.b bVarB = c.b(e.class);
        bVarB.d("fire-app-check-play-integrity");
        bVarB.b(r.f(com.google.firebase.e.class));
        bVarB.b(r.e(aeVar));
        bVarB.b(r.e(aeVar2));
        bVarB.c(new com.google.firebase.h.e(aeVar, aeVar2, 1));
        return Arrays.asList(bVarB.a(), g.a("fire-app-check-play-integrity", "17.1.3"));
    }
}
