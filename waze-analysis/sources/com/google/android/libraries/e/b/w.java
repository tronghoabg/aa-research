package com.google.android.libraries.e.b;

import com.google.b.d.b.ah;
import com.google.d.m.a.ag;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;
import com.google.d.m.a.cf;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class w implements b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f5911a;

    /* synthetic */ w(x xVar) {
        Objects.requireNonNull(xVar);
        this.f5911a = xVar;
    }

    @Override // com.google.android.libraries.e.b.b
    public final bm a(final ag agVar, final Executor executor) {
        return com.google.android.material.focus.d.i(bd.n(bd.j(this.f5911a.f5915d.c()), ah.b(new ag() { // from class: com.google.android.libraries.e.b.v
            @Override // com.google.d.m.a.ag
            public final bm apply(Object obj) {
                return this.f5908a.f5911a.f5919h.m(agVar, executor);
            }
        }), cf.y()));
    }
}
