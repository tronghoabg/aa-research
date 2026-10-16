package com.bumptech.glide.load.c.d;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.ac;
import com.bumptech.glide.g.p;
import com.bumptech.glide.g.r;
import com.bumptech.glide.load.a.y;
import com.bumptech.glide.load.w;
import com.bumptech.glide.z;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    final ac f3424a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.b.a f3425b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f3426c;

    /* renamed from: d, reason: collision with root package name */
    private final List f3427d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.a.a.c f3428e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3429f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3430g;

    /* renamed from: h, reason: collision with root package name */
    private z f3431h;

    /* renamed from: i, reason: collision with root package name */
    private i f3432i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f3433j;

    /* renamed from: k, reason: collision with root package name */
    private i f3434k;

    /* renamed from: l, reason: collision with root package name */
    private Bitmap f3435l;
    private i m;
    private int n;
    private int o;
    private int p;

    k(com.bumptech.glide.c cVar, com.bumptech.glide.b.a aVar, int i2, int i3, w wVar, Bitmap bitmap) {
        com.bumptech.glide.load.a.a.c cVarH = cVar.h();
        ac acVarE = com.bumptech.glide.c.e(cVar.a());
        z zVarB = com.bumptech.glide.c.e(cVar.a()).b().i(((com.bumptech.glide.e.i) ((com.bumptech.glide.e.i) com.bumptech.glide.e.i.c(y.f3179b).aa()).ad()).B(i2, i3));
        this.f3427d = new ArrayList();
        this.f3424a = acVarE;
        Handler handler = new Handler(Looper.getMainLooper(), new j(this));
        this.f3428e = cVarH;
        this.f3426c = handler;
        this.f3431h = zVarB;
        this.f3425b = aVar;
        k(wVar, bitmap);
    }

    private final void n() {
        if (!this.f3429f || this.f3430g) {
            return;
        }
        i iVar = this.m;
        if (iVar != null) {
            this.m = null;
            j(iVar);
            return;
        }
        this.f3430g = true;
        com.bumptech.glide.b.a aVar = this.f3425b;
        long jUptimeMillis = SystemClock.uptimeMillis() + aVar.d();
        aVar.g();
        this.f3434k = new i(this.f3426c, aVar.b(), jUptimeMillis);
        this.f3431h.i((com.bumptech.glide.e.i) new com.bumptech.glide.e.i().F(new com.bumptech.glide.f.d(Double.valueOf(Math.random())))).f(aVar).m(this.f3434k);
    }

    private final void o() {
        Bitmap bitmap = this.f3435l;
        if (bitmap != null) {
            this.f3428e.d(bitmap);
            this.f3435l = null;
        }
    }

    private final void p() {
        this.f3429f = false;
    }

    final int a() {
        i iVar = this.f3432i;
        if (iVar != null) {
            return iVar.f3419a;
        }
        return -1;
    }

    final int b() {
        return this.f3425b.c();
    }

    final int c() {
        return this.p;
    }

    final int d() {
        return this.f3425b.a() + this.n;
    }

    final int e() {
        return this.o;
    }

    final Bitmap f() {
        i iVar = this.f3432i;
        return iVar != null ? iVar.a() : this.f3435l;
    }

    final Bitmap g() {
        return this.f3435l;
    }

    final ByteBuffer h() {
        return this.f3425b.f().asReadOnlyBuffer();
    }

    final void i() {
        this.f3427d.clear();
        o();
        p();
        i iVar = this.f3432i;
        if (iVar != null) {
            this.f3424a.f(iVar);
            this.f3432i = null;
        }
        i iVar2 = this.f3434k;
        if (iVar2 != null) {
            this.f3424a.f(iVar2);
            this.f3434k = null;
        }
        i iVar3 = this.m;
        if (iVar3 != null) {
            this.f3424a.f(iVar3);
            this.m = null;
        }
        this.f3425b.h();
        this.f3433j = true;
    }

    final void j(i iVar) {
        this.f3430g = false;
        if (this.f3433j) {
            this.f3426c.obtainMessage(2, iVar).sendToTarget();
            return;
        }
        if (!this.f3429f) {
            this.m = iVar;
            return;
        }
        if (iVar.a() != null) {
            o();
            i iVar2 = this.f3432i;
            this.f3432i = iVar;
            List list = this.f3427d;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((e) list.get(size)).d();
                }
            }
            if (iVar2 != null) {
                this.f3426c.obtainMessage(2, iVar2).sendToTarget();
            }
        }
        n();
    }

    final void k(w wVar, Bitmap bitmap) {
        p.f(wVar);
        p.f(bitmap);
        this.f3435l = bitmap;
        this.f3431h = this.f3431h.i(new com.bumptech.glide.e.i().H(wVar));
        this.n = r.a(bitmap);
        this.o = bitmap.getWidth();
        this.p = bitmap.getHeight();
    }

    final void l(e eVar) {
        if (this.f3433j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        List list = this.f3427d;
        if (list.contains(eVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = list.isEmpty();
        list.add(eVar);
        if (!zIsEmpty || this.f3429f) {
            return;
        }
        this.f3429f = true;
        this.f3433j = false;
        n();
    }

    final void m(e eVar) {
        List list = this.f3427d;
        list.remove(eVar);
        if (list.isEmpty()) {
            p();
        }
    }
}
