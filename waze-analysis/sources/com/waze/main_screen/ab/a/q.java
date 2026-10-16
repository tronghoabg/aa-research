package com.waze.main_screen.ab.a;

import com.waze.map.b.ai;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class q implements m {

    /* renamed from: a, reason: collision with root package name */
    private final ai f25646a;

    /* renamed from: b, reason: collision with root package name */
    private final af f25647b;

    /* renamed from: c, reason: collision with root package name */
    private final bm f25648c;

    /* renamed from: d, reason: collision with root package name */
    private final bq f25649d;

    /* renamed from: e, reason: collision with root package name */
    private final bn f25650e;

    /* renamed from: f, reason: collision with root package name */
    private final ch f25651f;

    /* renamed from: g, reason: collision with root package name */
    private final ch f25652g;

    public q(ai aiVar) {
        x.f(aiVar, "mainMapController");
        this.f25646a = aiVar;
        int i2 = av.f51370a;
        af afVarE = aj.e(ac.f51860a.c().plus(aj.Q()));
        this.f25647b = afVarE;
        bm bmVarC = bu.c(0, 1, kotlinx.coroutines.a.a.f51272b);
        this.f25648c = bmVarC;
        this.f25649d = kotlinx.coroutines.b.ai.S(bmVarC);
        bn bnVarB = ck.b(h.a.i.h());
        this.f25650e = bnVarB;
        ch chVarU = kotlinx.coroutines.b.ai.U(bnVarB);
        this.f25651f = chVarU;
        kotlinx.coroutines.b.k kVarY = kotlinx.coroutines.b.ai.y(new p(chVarU));
        int i3 = bz.f51630a;
        this.f25652g = kotlinx.coroutines.b.ai.V(kVarY, afVarE, by.b(), false);
    }

    @Override // com.waze.main_screen.ab.i
    public final void a(Integer num) {
        this.f25648c.c(new i(num));
    }

    @Override // com.waze.main_screen.ab.i
    public final void b(com.waze.main_screen.ab.g gVar) {
        Object objD;
        x.f(gVar, "compatPopup");
        if (gVar instanceof com.waze.main_screen.ab.b) {
            this.f25646a.q(com.waze.map.b.e.f28236a);
        }
        bn bnVar = this.f25650e;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, h.a.i.ag((List) objD, gVar)));
    }

    @Override // com.waze.main_screen.ab.i
    public final void c(int i2) {
        this.f25648c.c(new j(i2));
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f25647b, bo.g("Closed", null));
    }

    @Override // com.waze.main_screen.ab.i
    public final void d(int i2) {
        this.f25648c.c(new k(i2));
    }

    @Override // com.waze.main_screen.ab.a.m
    public final bq e() {
        return this.f25649d;
    }

    @Override // com.waze.main_screen.ab.a.m
    public final ch f() {
        return this.f25652g;
    }

    @Override // com.waze.main_screen.ab.a.m
    public final ch g() {
        return this.f25651f;
    }

    @Override // com.waze.main_screen.ab.a.m
    public final void h() {
        this.f25648c.c(g.f25636a);
    }

    @Override // com.waze.main_screen.ab.a.m
    public final void i() {
        this.f25648c.c(h.f25637a);
    }

    @Override // com.waze.main_screen.ab.a.m
    public final void j() {
        bn bnVar = this.f25650e;
        Iterable iterable = (Iterable) bnVar.d();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((com.waze.main_screen.ab.g) it.next()) instanceof com.waze.main_screen.ab.b) {
                    this.f25646a.q(com.waze.map.b.g.f28352a);
                    break;
                }
            }
        }
        bnVar.e(h.a.i.h());
    }
}
