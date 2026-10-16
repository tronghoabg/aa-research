package com.b.a.a.a;

import com.b.b.a.v;
import com.b.b.d.x;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class g implements v {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f2533a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f2534b;

    g(i iVar, c cVar, k kVar) {
        this.f2533a = cVar;
        this.f2534b = kVar;
        Objects.requireNonNull(iVar);
    }

    @Override // com.b.b.a.v
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        x xVar = (x) obj;
        xVar.a();
        com.b.b.a.i.f();
        boolean zA = xVar.a();
        c cVar = this.f2533a;
        if (zA) {
            cVar.a(this.f2534b);
        } else {
            cVar.b(new com.b.a.a.a.a.c());
        }
    }
}
