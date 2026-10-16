package com.waze.uid.e;

import com.waze.uid.b.m;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class a extends f implements h {

    /* renamed from: a, reason: collision with root package name */
    protected f f44478a;

    public a(String str, b bVar, h hVar, m mVar) {
        super(str, bVar, hVar, mVar);
    }

    protected final void a(f fVar) {
        this.f44478a = fVar;
        fVar.f(e.f44481a);
    }

    @Override // com.waze.uid.e.h
    public boolean b(f fVar) {
        return j();
    }

    @Override // com.waze.uid.e.h
    public boolean c(f fVar) {
        return k();
    }

    @Override // com.waze.uid.e.f
    public final boolean d() {
        f fVar = this.f44478a;
        if (fVar == null) {
            return false;
        }
        if (fVar.d()) {
            return true;
        }
        this.f44478a = null;
        e eVar = e.f44482b;
        if (!h(eVar)) {
            return false;
        }
        f(eVar);
        return true;
    }

    @Override // com.waze.uid.e.f
    public boolean e() {
        f fVar = this.f44478a;
        if (fVar != null) {
            return fVar.e();
        }
        com.waze.shared_infra.i.h.k(this.f44487e, "onNext() called without a choice");
        return true;
    }
}
