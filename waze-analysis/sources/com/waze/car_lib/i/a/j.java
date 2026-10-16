package com.waze.car_lib.i.a;

import android.util.Size;
import com.waze.map.b.dm;
import com.waze.map.eb;
import com.waze.map.ec;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final af f19875a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.isolated.c f19876b;

    /* renamed from: c, reason: collision with root package name */
    private final Size f19877c;

    /* renamed from: d, reason: collision with root package name */
    private ec f19878d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f19879e;

    /* renamed from: f, reason: collision with root package name */
    private final ch f19880f;

    /* renamed from: g, reason: collision with root package name */
    private final float f19881g;

    /* renamed from: h, reason: collision with root package name */
    private final float f19882h;

    /* renamed from: i, reason: collision with root package name */
    private float f19883i;

    /* renamed from: j, reason: collision with root package name */
    private float f19884j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f19885k;

    /* renamed from: l, reason: collision with root package name */
    private br f19886l;
    private float m;
    private boolean n;
    private float o;
    private float p;
    private float q;
    private br r;

    public j(af afVar, com.waze.map.isolated.c cVar, Size size, ec ecVar, boolean z, ch chVar, float f2, float f3) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(cVar, "canvasTouchController");
        h.g.b.x.f(size, "surfaceSize");
        h.g.b.x.f(ecVar, "touchNotifier");
        h.g.b.x.f(chVar, "visibleAreaFlow");
        this.f19875a = afVar;
        this.f19876b = cVar;
        this.f19877c = size;
        this.f19878d = ecVar;
        this.f19879e = z;
        this.f19880f = chVar;
        this.f19881g = f2;
        this.f19882h = f3;
        this.o = 200.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        this.f19876b.onTouchEvent(com.waze.map.isolated.t.f29251d, h.a.i.d(new com.waze.map.isolated.r(this.f19883i, this.f19884j)));
        this.f19878d.b(eb.f28817b);
        this.f19885k = false;
    }

    private final void h() {
        br brVar = this.f19886l;
        if (brVar == null || !brVar.bZ()) {
            return;
        }
        br brVar2 = this.f19886l;
        if (brVar2 != null) {
            brVar2.s(null);
        }
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        com.waze.map.isolated.t tVar = com.waze.map.isolated.t.f29251d;
        float f2 = this.p;
        float f3 = this.o;
        float f4 = this.q;
        this.f19876b.onTouchEvent(tVar, h.a.i.i(new com.waze.map.isolated.r(f2 + f3, f4), new com.waze.map.isolated.r(f2 - f3, f4)));
        this.n = false;
        this.f19878d.b(eb.f28817b);
    }

    private final void j() {
        br brVar = this.r;
        if (brVar == null || !brVar.bZ()) {
            return;
        }
        br brVar2 = this.r;
        if (brVar2 != null) {
            brVar2.s(null);
        }
        i();
    }

    public final void c(float f2, float f3) {
        synchronized (this) {
            j();
            h();
            com.waze.map.isolated.c cVar = this.f19876b;
            cVar.onTouchEvent(com.waze.map.isolated.t.f29248a, h.a.i.d(new com.waze.map.isolated.r(f2, f3)));
            this.f19878d.b(eb.f28816a);
            cVar.onTouchEvent(com.waze.map.isolated.t.f29250c, h.a.i.d(new com.waze.map.isolated.r(f2, f3)));
            this.f19878d.b(eb.f28817b);
        }
    }

    public final void d(float f2, float f3, float f4) {
        synchronized (this) {
            h();
            br brVar = this.r;
            if (brVar != null) {
                brVar.s(null);
            }
            this.r = aj.z(this.f19875a, null, null, new i(this, null, 1, null), 3);
            if (!this.n) {
                this.n = true;
                this.p = f2;
                this.q = f3;
                this.o = 200.0f;
                com.waze.map.isolated.c cVar = this.f19876b;
                com.waze.map.isolated.t tVar = com.waze.map.isolated.t.f29249b;
                float f5 = this.p;
                float f6 = this.q;
                cVar.onTouchEvent(tVar, h.a.i.i(new com.waze.map.isolated.r(f5, f6), new com.waze.map.isolated.r(f5, f6)));
                this.f19878d.b(eb.f28816a);
            }
            this.o *= f4;
            com.waze.map.isolated.c cVar2 = this.f19876b;
            com.waze.map.isolated.t tVar2 = com.waze.map.isolated.t.f29252e;
            float f7 = this.p;
            float f8 = this.o;
            float f9 = this.q;
            cVar2.onTouchEvent(tVar2, h.a.i.i(new com.waze.map.isolated.r(f7 + f8, f9), new com.waze.map.isolated.r(f7 - f8, f9)));
        }
    }

    public final void e(float f2, float f3) {
        dm dmVar;
        synchronized (this) {
            j();
            br brVar = this.f19886l;
            if (brVar != null) {
                brVar.s(null);
            }
            this.f19886l = aj.z(this.f19875a, null, null, new i(this, null, 0), 3);
            if (!this.f19885k) {
                this.f19885k = true;
                Size size = this.f19877c;
                this.f19883i = size.getWidth() * 0.5f;
                float height = size.getHeight() * 0.6f;
                this.f19884j = height;
                this.m = height;
                this.f19876b.onTouchEvent(com.waze.map.isolated.t.f29249b, h.a.i.d(new com.waze.map.isolated.r(this.f19883i, this.f19884j)));
                this.f19878d.b(eb.f28816a);
            }
            this.f19883i -= f2;
            if (f3 > 0.0f && (dmVar = (dm) this.f19880f.d()) != null && dmVar.a() > 0.2f && this.f19879e) {
                float height2 = this.f19877c.getHeight() * 0.15f * this.f19882h;
                this.f19884j = (h.k.n.e(this.f19884j - height2, 1.0f) * ((float) Math.exp((-f3) / h.k.n.e((this.m - height2) * this.f19881g, 1.0f)))) + height2;
            } else {
                this.f19884j -= f3;
            }
            this.f19876b.onTouchEvent(com.waze.map.isolated.t.f29252e, h.a.i.d(new com.waze.map.isolated.r(this.f19883i, this.f19884j)));
        }
    }

    public final void f(ec ecVar) {
        h.g.b.x.f(ecVar, "<set-?>");
        this.f19878d = ecVar;
    }
}
