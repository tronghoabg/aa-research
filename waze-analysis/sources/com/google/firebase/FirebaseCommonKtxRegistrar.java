package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ae;
import com.google.firebase.components.r;
import h.g.b.x;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.ab;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.c<?>> getComponents() {
        com.google.firebase.components.b bVarA = com.google.firebase.components.c.a(new ae(com.google.firebase.b.a.a.class, ab.class));
        bVarA.b(r.e(new ae(com.google.firebase.b.a.a.class, Executor.class)));
        bVarA.c(f.f9885b);
        com.google.firebase.components.c cVarA = bVarA.a();
        x.e(cVarA, "build(...)");
        com.google.firebase.components.b bVarA2 = com.google.firebase.components.c.a(new ae(com.google.firebase.b.a.c.class, ab.class));
        bVarA2.b(r.e(new ae(com.google.firebase.b.a.c.class, Executor.class)));
        bVarA2.c(f.f9884a);
        com.google.firebase.components.c cVarA2 = bVarA2.a();
        x.e(cVarA2, "build(...)");
        com.google.firebase.components.b bVarA3 = com.google.firebase.components.c.a(new ae(com.google.firebase.b.a.b.class, ab.class));
        bVarA3.b(r.e(new ae(com.google.firebase.b.a.b.class, Executor.class)));
        bVarA3.c(f.f9886c);
        com.google.firebase.components.c cVarA3 = bVarA3.a();
        x.e(cVarA3, "build(...)");
        com.google.firebase.components.b bVarA4 = com.google.firebase.components.c.a(new ae(com.google.firebase.b.a.d.class, ab.class));
        bVarA4.b(r.e(new ae(com.google.firebase.b.a.d.class, Executor.class)));
        bVarA4.c(f.f9887d);
        com.google.firebase.components.c cVarA4 = bVarA4.a();
        x.e(cVarA4, "build(...)");
        return h.a.i.i(cVarA, cVarA2, cVarA3, cVarA4);
    }
}
