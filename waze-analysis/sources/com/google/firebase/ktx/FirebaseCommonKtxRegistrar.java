package com.google.firebase.ktx;

import com.google.firebase.b.a.d;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ae;
import com.google.firebase.components.b;
import com.google.firebase.components.c;
import com.google.firebase.components.r;
import h.a.i;
import h.g.b.x;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.ab;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        b bVarA = c.a(new ae(com.google.firebase.b.a.a.class, ab.class));
        bVarA.b(r.e(new ae(com.google.firebase.b.a.a.class, Executor.class)));
        bVarA.c(a.f10052b);
        c cVarA = bVarA.a();
        x.e(cVarA, "build(...)");
        b bVarA2 = c.a(new ae(com.google.firebase.b.a.c.class, ab.class));
        bVarA2.b(r.e(new ae(com.google.firebase.b.a.c.class, Executor.class)));
        bVarA2.c(a.f10051a);
        c cVarA2 = bVarA2.a();
        x.e(cVarA2, "build(...)");
        b bVarA3 = c.a(new ae(com.google.firebase.b.a.b.class, ab.class));
        bVarA3.b(r.e(new ae(com.google.firebase.b.a.b.class, Executor.class)));
        bVarA3.c(a.f10053c);
        c cVarA3 = bVarA3.a();
        x.e(cVarA3, "build(...)");
        b bVarA4 = c.a(new ae(d.class, ab.class));
        bVarA4.b(r.e(new ae(d.class, Executor.class)));
        bVarA4.c(a.f10054d);
        c cVarA4 = bVarA4.a();
        x.e(cVarA4, "build(...)");
        return i.i(cVarA, cVarA2, cVarA3, cVarA4);
    }
}
