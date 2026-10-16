package com.waze.uid.e;

import com.waze.uid.b.m;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class c extends f {

    /* renamed from: a, reason: collision with root package name */
    private f f44480a;

    public c(String str, b bVar, h hVar, m mVar) {
        super(str, bVar, hVar, mVar);
        this.f44480a = null;
    }

    protected abstract f a();

    @Override // com.waze.uid.e.f
    public final boolean d() {
        if (g()) {
            return this.f44480a.d();
        }
        return false;
    }

    @Override // com.waze.uid.e.f
    public final boolean e() {
        if (g()) {
            return this.f44480a.e();
        }
        return false;
    }

    @Override // com.waze.uid.e.f
    public final void f(e eVar) {
        super.f(eVar);
        if (g()) {
            this.f44480a.f(eVar);
        }
    }

    protected final boolean g() {
        return this.f44480a != null;
    }

    @Override // com.waze.uid.e.f
    public boolean h(e eVar) {
        this.f44480a = a();
        if (g()) {
            return this.f44480a.h(eVar);
        }
        return true;
    }
}
