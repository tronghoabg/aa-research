package com.waze.ui.p;

import com.waze.map.b.ai;
import com.waze.map.b.bf;
import com.waze.map.main.aa;
import com.waze.map.main.ab;
import h.g.b.x;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements ab {

    /* renamed from: a, reason: collision with root package name */
    private final ai f43195a;

    /* renamed from: b, reason: collision with root package name */
    private final ab f43196b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f43197c;

    public g(ai aiVar, ab abVar) {
        x.f(aiVar, "mainMapController");
        x.f(abVar, "mainMapGeometryController");
        this.f43195a = aiVar;
        this.f43196b = abVar;
        new e(aiVar.g(), 2);
        this.f43197c = kotlinx.coroutines.b.ai.D(aiVar.g());
    }

    @Override // com.waze.map.main.ab
    public final ch a() {
        return this.f43196b.a();
    }

    @Override // com.waze.map.main.ab
    public final void b(aa aaVar) {
        x.f(aaVar, "geometry");
        this.f43196b.b(aaVar);
    }

    public final ai c() {
        return this.f43195a;
    }

    public final kotlinx.coroutines.b.k d() {
        return this.f43197c;
    }

    public final kotlinx.coroutines.b.k e() {
        return new e(bf.b(this.f43195a), 0);
    }

    public final kotlinx.coroutines.b.k f() {
        return new e(bf.b(this.f43195a), 1);
    }

    public final void g() {
        this.f43195a.r(com.waze.map.b.q.f28364a, true);
    }

    public final void h() {
        this.f43195a.r(com.waze.map.b.p.f28363a, true);
    }

    public final void i(float f2) {
        ai aiVar = this.f43195a;
        x.f(aiVar, "<this>");
        aiVar.o(new com.waze.map.b.m(f2));
    }

    public final void j() {
        bf.c(this.f43195a);
    }

    public final void k() {
        bf.d(this.f43195a);
    }
}
