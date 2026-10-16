package com.bumptech.glide.e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.a.y;
import com.bumptech.glide.load.c.a.ab;
import com.bumptech.glide.load.c.a.t;
import com.bumptech.glide.load.c.a.z;
import com.bumptech.glide.load.o;
import com.bumptech.glide.load.r;
import com.bumptech.glide.load.s;
import com.bumptech.glide.load.w;
import com.bumptech.glide.p;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private int f2813a;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f2817e;

    /* renamed from: f, reason: collision with root package name */
    private int f2818f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f2819g;

    /* renamed from: h, reason: collision with root package name */
    private int f2820h;
    private boolean m;
    private Drawable o;
    private int p;
    private boolean t;
    private Resources.Theme u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean z;

    /* renamed from: b, reason: collision with root package name */
    private float f2814b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    private y f2815c = y.f3181d;

    /* renamed from: d, reason: collision with root package name */
    private p f2816d = p.f3557c;

    /* renamed from: i, reason: collision with root package name */
    private boolean f2821i = true;

    /* renamed from: j, reason: collision with root package name */
    private int f2822j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f2823k = -1;

    /* renamed from: l, reason: collision with root package name */
    private o f2824l = com.bumptech.glide.f.c.b();
    private boolean n = true;
    private s q = new s();
    private Map r = new com.bumptech.glide.g.d();
    private Class s = Object.class;
    private boolean y = true;

    private final a a(t tVar, w wVar) {
        a aVarA = A(tVar, wVar);
        aVarA.y = true;
        return aVarA;
    }

    private final boolean b(int i2) {
        return c(this.f2813a, i2);
    }

    private static boolean c(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    final a A(t tVar, w wVar) {
        if (this.v) {
            return j().A(tVar, wVar);
        }
        Z(tVar);
        return I(wVar, false);
    }

    public final a B(int i2, int i3) {
        if (this.v) {
            return j().B(i2, i3);
        }
        this.f2823k = i2;
        this.f2822j = i3;
        this.f2813a |= 512;
        ac();
        return this;
    }

    public final a C(p pVar) {
        if (this.v) {
            return j().C(pVar);
        }
        com.bumptech.glide.g.p.f(pVar);
        this.f2816d = pVar;
        this.f2813a |= 8;
        ac();
        return this;
    }

    final a D(r rVar) {
        if (this.v) {
            return j().D(rVar);
        }
        this.q.d(rVar);
        ac();
        return this;
    }

    public final a E(r rVar, Object obj) {
        if (this.v) {
            return j().E(rVar, obj);
        }
        com.bumptech.glide.g.p.f(rVar);
        com.bumptech.glide.g.p.f(obj);
        this.q.e(rVar, obj);
        ac();
        return this;
    }

    public final a F(o oVar) {
        if (this.v) {
            return j().F(oVar);
        }
        com.bumptech.glide.g.p.f(oVar);
        this.f2824l = oVar;
        this.f2813a |= 1024;
        ac();
        return this;
    }

    public final a G(Resources.Theme theme) {
        if (this.v) {
            return j().G(theme);
        }
        this.u = theme;
        int i2 = this.f2813a;
        if (theme != null) {
            this.f2813a = i2 | 32768;
            return E(com.bumptech.glide.load.c.c.g.f3395a, theme);
        }
        this.f2813a = (-32769) & i2;
        return D(com.bumptech.glide.load.c.c.g.f3395a);
    }

    public final a H(w wVar) {
        return I(wVar, true);
    }

    final a I(w wVar, boolean z) {
        if (this.v) {
            return j().I(wVar, z);
        }
        z zVar = new z(wVar, z);
        K(Bitmap.class, wVar, z);
        K(Drawable.class, zVar, z);
        K(BitmapDrawable.class, zVar, z);
        K(com.bumptech.glide.load.c.d.e.class, new com.bumptech.glide.load.c.d.h(wVar), z);
        ac();
        return this;
    }

    final a J(t tVar, w wVar) {
        if (this.v) {
            return j().J(tVar, wVar);
        }
        Z(tVar);
        return H(wVar);
    }

    final a K(Class cls, w wVar, boolean z) {
        if (this.v) {
            return j().K(cls, wVar, z);
        }
        com.bumptech.glide.g.p.f(cls);
        com.bumptech.glide.g.p.f(wVar);
        this.r.put(cls, wVar);
        int i2 = this.f2813a;
        this.n = true;
        this.f2813a = 67584 | i2;
        this.y = false;
        if (z) {
            this.f2813a = i2 | 198656;
            this.m = true;
        }
        ac();
        return this;
    }

    public final Class L() {
        return this.s;
    }

    public final Map M() {
        return this.r;
    }

    public final boolean N() {
        return this.z;
    }

    protected final boolean O() {
        return this.v;
    }

    public final boolean P() {
        return b(4);
    }

    public final boolean Q(a aVar) {
        if (Float.compare(aVar.f2814b, this.f2814b) != 0) {
            return false;
        }
        int i2 = aVar.f2818f;
        Drawable drawable = aVar.f2817e;
        if (!com.bumptech.glide.g.r.k(null, null)) {
            return false;
        }
        int i3 = aVar.f2820h;
        Drawable drawable2 = aVar.f2819g;
        if (!com.bumptech.glide.g.r.k(null, null)) {
            return false;
        }
        int i4 = aVar.p;
        Drawable drawable3 = aVar.o;
        if (!com.bumptech.glide.g.r.k(null, null) || this.f2821i != aVar.f2821i || this.f2822j != aVar.f2822j || this.f2823k != aVar.f2823k || this.m != aVar.m || this.n != aVar.n) {
            return false;
        }
        boolean z = aVar.w;
        boolean z2 = aVar.x;
        return this.f2815c.equals(aVar.f2815c) && this.f2816d == aVar.f2816d && this.q.equals(aVar.q) && this.r.equals(aVar.r) && this.s.equals(aVar.s) && com.bumptech.glide.g.r.k(this.f2824l, aVar.f2824l) && com.bumptech.glide.g.r.k(this.u, aVar.u);
    }

    public final boolean R() {
        return this.f2821i;
    }

    public final boolean S() {
        return b(8);
    }

    final boolean T() {
        return this.y;
    }

    public final boolean U() {
        return b(256);
    }

    public final boolean V() {
        return this.n;
    }

    public final boolean W() {
        return this.m;
    }

    public final boolean X() {
        return b(2048);
    }

    public final boolean Y() {
        return com.bumptech.glide.g.r.o(this.f2823k, this.f2822j);
    }

    public final void Z(t tVar) {
        r rVar = t.f3362g;
        com.bumptech.glide.g.p.f(tVar);
        E(rVar, tVar);
    }

    public final a aa() {
        if (this.v) {
            return j().aa();
        }
        this.z = true;
        this.f2813a |= 1048576;
        ac();
        return this;
    }

    public final void ab() {
        this.t = true;
    }

    protected final void ac() {
        if (this.t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final a ad() {
        if (this.v) {
            return j().ad();
        }
        this.f2821i = false;
        this.f2813a |= 256;
        ac();
        return this;
    }

    public final void ae() {
        if (this.t && !this.v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.v = true;
        ab();
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return Q((a) obj);
        }
        return false;
    }

    public int hashCode() {
        float f2 = this.f2814b;
        int i2 = com.bumptech.glide.g.r.f2918a;
        return com.bumptech.glide.g.r.e(this.u, com.bumptech.glide.g.r.e(this.f2824l, com.bumptech.glide.g.r.e(this.s, com.bumptech.glide.g.r.e(this.r, com.bumptech.glide.g.r.e(this.q, com.bumptech.glide.g.r.e(this.f2816d, com.bumptech.glide.g.r.e(this.f2815c, com.bumptech.glide.g.r.d(0, com.bumptech.glide.g.r.d(0, com.bumptech.glide.g.r.d(this.n ? 1 : 0, com.bumptech.glide.g.r.d(this.m ? 1 : 0, com.bumptech.glide.g.r.d(this.f2823k, com.bumptech.glide.g.r.d(this.f2822j, com.bumptech.glide.g.r.d(this.f2821i ? 1 : 0, com.bumptech.glide.g.r.e(null, com.bumptech.glide.g.r.d(0, com.bumptech.glide.g.r.e(null, com.bumptech.glide.g.r.d(0, com.bumptech.glide.g.r.e(null, com.bumptech.glide.g.r.d(0, com.bumptech.glide.g.r.d(Float.floatToIntBits(f2), 17)))))))))))))))))))));
    }

    public a i(a aVar) {
        if (this.v) {
            return j().i(aVar);
        }
        int i2 = aVar.f2813a;
        if (c(i2, 2)) {
            this.f2814b = aVar.f2814b;
        }
        if (c(i2, 262144)) {
            boolean z = aVar.w;
            this.w = false;
        }
        if (c(i2, 1048576)) {
            this.z = aVar.z;
        }
        if (c(i2, 4)) {
            this.f2815c = aVar.f2815c;
        }
        if (c(i2, 8)) {
            this.f2816d = aVar.f2816d;
        }
        if (c(i2, 16)) {
            Drawable drawable = aVar.f2817e;
            this.f2817e = null;
            this.f2818f = 0;
            this.f2813a &= -33;
        }
        if (c(aVar.f2813a, 32)) {
            int i3 = aVar.f2818f;
            this.f2818f = 0;
            this.f2817e = null;
            this.f2813a &= -17;
        }
        if (c(aVar.f2813a, 64)) {
            Drawable drawable2 = aVar.f2819g;
            this.f2819g = null;
            this.f2820h = 0;
            this.f2813a &= -129;
        }
        if (c(aVar.f2813a, 128)) {
            int i4 = aVar.f2820h;
            this.f2820h = 0;
            this.f2819g = null;
            this.f2813a &= -65;
        }
        int i5 = aVar.f2813a;
        if (c(i5, 256)) {
            this.f2821i = aVar.f2821i;
        }
        if (c(i5, 512)) {
            this.f2823k = aVar.f2823k;
            this.f2822j = aVar.f2822j;
        }
        if (c(i5, 1024)) {
            this.f2824l = aVar.f2824l;
        }
        if (c(i5, 4096)) {
            this.s = aVar.s;
        }
        if (c(i5, 8192)) {
            Drawable drawable3 = aVar.o;
            this.o = null;
            this.p = 0;
            this.f2813a &= -16385;
        }
        if (c(aVar.f2813a, 16384)) {
            int i6 = aVar.p;
            this.p = 0;
            this.o = null;
            this.f2813a &= -8193;
        }
        int i7 = aVar.f2813a;
        if (c(i7, 32768)) {
            this.u = aVar.u;
        }
        if (c(i7, 65536)) {
            this.n = aVar.n;
        }
        if (c(i7, 131072)) {
            this.m = aVar.m;
        }
        if (c(i7, 2048)) {
            this.r.putAll(aVar.r);
            this.y = aVar.y;
        }
        if (c(aVar.f2813a, 524288)) {
            boolean z2 = aVar.x;
            this.x = false;
        }
        if (!this.n) {
            this.r.clear();
            int i8 = this.f2813a;
            this.m = false;
            this.f2813a = i8 & (-133121);
            this.y = true;
        }
        this.f2813a |= aVar.f2813a;
        this.q.c(aVar.q);
        ac();
        return this;
    }

    @Override // 
    public a j() {
        try {
            a aVar = (a) super.clone();
            s sVar = new s();
            aVar.q = sVar;
            sVar.c(this.q);
            com.bumptech.glide.g.d dVar = new com.bumptech.glide.g.d();
            aVar.r = dVar;
            dVar.putAll(this.r);
            aVar.t = false;
            aVar.v = false;
            return aVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final float n() {
        return this.f2814b;
    }

    public final int o() {
        return this.f2822j;
    }

    public final int p() {
        return this.f2823k;
    }

    public final p q() {
        return this.f2816d;
    }

    public final o r() {
        return this.f2824l;
    }

    public final s s() {
        return this.q;
    }

    public final y t() {
        return this.f2815c;
    }

    public final a u() {
        return J(t.f3358c, new com.bumptech.glide.load.c.a.i());
    }

    public final a v(Class cls) {
        if (this.v) {
            return j().v(cls);
        }
        com.bumptech.glide.g.p.f(cls);
        this.s = cls;
        this.f2813a |= 4096;
        ac();
        return this;
    }

    public final a w(y yVar) {
        if (this.v) {
            return j().w(yVar);
        }
        com.bumptech.glide.g.p.f(yVar);
        this.f2815c = yVar;
        this.f2813a |= 4;
        ac();
        return this;
    }

    public final a x() {
        return A(t.f3359d, new com.bumptech.glide.load.c.a.g());
    }

    public final a y() {
        return a(t.f3358c, new com.bumptech.glide.load.c.a.h());
    }

    public final a z() {
        return a(t.f3357b, new ab());
    }
}
