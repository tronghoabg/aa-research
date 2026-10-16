package U4;

import B4.f;
import B4.g;
import B4.k;
import E4.m;
import L4.p;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.wynauto.wyn.R;

/* loaded from: classes.dex */
public abstract class a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public int f12269a;

    /* renamed from: d, reason: collision with root package name */
    public int f12272d;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12277i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12280m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12281n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12283p;

    /* renamed from: b, reason: collision with root package name */
    public m f12270b = m.f2935d;

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.d f12271c = com.bumptech.glide.d.f24227a;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12273e = true;

    /* renamed from: f, reason: collision with root package name */
    public int f12274f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f12275g = -1;

    /* renamed from: h, reason: collision with root package name */
    public B4.d f12276h = X4.a.f16118b;

    /* renamed from: j, reason: collision with root package name */
    public g f12278j = new g();
    public Y4.d k = new Y4.d(0);

    /* renamed from: l, reason: collision with root package name */
    public Class f12279l = Object.class;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12282o = true;

    public static boolean e(int i5, int i10) {
        return (i5 & i10) != 0;
    }

    public a a(a aVar) {
        if (this.f12281n) {
            return clone().a(aVar);
        }
        int i5 = aVar.f12269a;
        if (e(aVar.f12269a, 1048576)) {
            this.f12283p = aVar.f12283p;
        }
        if (e(aVar.f12269a, 4)) {
            this.f12270b = aVar.f12270b;
        }
        if (e(aVar.f12269a, 8)) {
            this.f12271c = aVar.f12271c;
        }
        if (e(aVar.f12269a, 16)) {
            this.f12269a &= -33;
        }
        if (e(aVar.f12269a, 32)) {
            this.f12269a &= -17;
        }
        if (e(aVar.f12269a, 64)) {
            this.f12272d = 0;
            this.f12269a &= -129;
        }
        if (e(aVar.f12269a, 128)) {
            this.f12272d = aVar.f12272d;
            this.f12269a &= -65;
        }
        if (e(aVar.f12269a, 256)) {
            this.f12273e = aVar.f12273e;
        }
        if (e(aVar.f12269a, 512)) {
            this.f12275g = aVar.f12275g;
            this.f12274f = aVar.f12274f;
        }
        if (e(aVar.f12269a, Segment.SHARE_MINIMUM)) {
            this.f12276h = aVar.f12276h;
        }
        if (e(aVar.f12269a, 4096)) {
            this.f12279l = aVar.f12279l;
        }
        if (e(aVar.f12269a, Segment.SIZE)) {
            this.f12269a &= -16385;
        }
        if (e(aVar.f12269a, Http2.INITIAL_MAX_FRAME_SIZE)) {
            this.f12269a &= -8193;
        }
        if (e(aVar.f12269a, 131072)) {
            this.f12277i = aVar.f12277i;
        }
        if (e(aVar.f12269a, 2048)) {
            this.k.putAll(aVar.k);
            this.f12282o = aVar.f12282o;
        }
        this.f12269a |= aVar.f12269a;
        this.f12278j.f1589b.h(aVar.f12278j.f1589b);
        j();
        return this;
    }

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            g gVar = new g();
            aVar.f12278j = gVar;
            gVar.f1589b.h(this.f12278j.f1589b);
            Y4.d dVar = new Y4.d(0);
            aVar.k = dVar;
            dVar.putAll(this.k);
            aVar.f12280m = false;
            aVar.f12281n = false;
            return aVar;
        } catch (CloneNotSupportedException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final a c(Class cls) {
        if (this.f12281n) {
            return clone().c(cls);
        }
        this.f12279l = cls;
        this.f12269a |= 4096;
        j();
        return this;
    }

    public final a d(m mVar) {
        if (this.f12281n) {
            return clone().d(mVar);
        }
        this.f12270b = mVar;
        this.f12269a |= 4;
        j();
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        char[] cArr = Y4.m.f16700a;
        return this.f12272d == aVar.f12272d && this.f12273e == aVar.f12273e && this.f12274f == aVar.f12274f && this.f12275g == aVar.f12275g && this.f12277i == aVar.f12277i && this.f12270b.equals(aVar.f12270b) && this.f12271c == aVar.f12271c && this.f12278j.equals(aVar.f12278j) && this.k.equals(aVar.k) && this.f12279l.equals(aVar.f12279l) && this.f12276h.equals(aVar.f12276h);
    }

    public final a f(int i5, int i10) {
        if (this.f12281n) {
            return clone().f(i5, i10);
        }
        this.f12275g = i5;
        this.f12274f = i10;
        this.f12269a |= 512;
        j();
        return this;
    }

    public final a g() {
        if (this.f12281n) {
            return clone().g();
        }
        this.f12272d = R.drawable.image_placeholder;
        this.f12269a = (this.f12269a | 128) & (-65);
        j();
        return this;
    }

    public final a h() {
        com.bumptech.glide.d dVar = com.bumptech.glide.d.f24228b;
        if (this.f12281n) {
            return clone().h();
        }
        this.f12271c = dVar;
        this.f12269a |= 8;
        j();
        return this;
    }

    public final int hashCode() {
        char[] cArr = Y4.m.f16700a;
        return Y4.m.f(Y4.m.f(Y4.m.f(Y4.m.f(Y4.m.f(Y4.m.f(Y4.m.f(Y4.m.e(0, Y4.m.e(0, Y4.m.e(1, Y4.m.e(this.f12277i ? 1 : 0, Y4.m.e(this.f12275g, Y4.m.e(this.f12274f, Y4.m.e(this.f12273e ? 1 : 0, Y4.m.f(Y4.m.e(0, Y4.m.f(Y4.m.e(this.f12272d, Y4.m.f(Y4.m.e(0, Y4.m.e(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f12270b), this.f12271c), this.f12278j), this.k), this.f12279l), this.f12276h), null);
    }

    public final void j() {
        if (this.f12280m) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final a k(f fVar) {
        B4.a aVar = B4.a.f1579a;
        if (this.f12281n) {
            return clone().k(fVar);
        }
        gc.b.j(fVar);
        this.f12278j.f1589b.put(fVar, aVar);
        j();
        return this;
    }

    public final a l(X4.b bVar) {
        if (this.f12281n) {
            return clone().l(bVar);
        }
        this.f12276h = bVar;
        this.f12269a |= Segment.SHARE_MINIMUM;
        j();
        return this;
    }

    public final a m() {
        if (this.f12281n) {
            return clone().m();
        }
        this.f12273e = false;
        this.f12269a |= 256;
        j();
        return this;
    }

    public final a n(K4.a aVar) {
        if (this.f12281n) {
            return clone().n(aVar);
        }
        p pVar = new p(aVar);
        o(Bitmap.class, aVar);
        o(Drawable.class, pVar);
        o(BitmapDrawable.class, pVar);
        o(P4.c.class, new P4.d(aVar));
        j();
        return this;
    }

    public final a o(Class cls, k kVar) {
        if (this.f12281n) {
            return clone().o(cls, kVar);
        }
        gc.b.j(kVar);
        this.k.put(cls, kVar);
        int i5 = this.f12269a;
        this.f12282o = false;
        this.f12269a = i5 | 198656;
        this.f12277i = true;
        j();
        return this;
    }

    public final a p() {
        if (this.f12281n) {
            return clone().p();
        }
        this.f12283p = true;
        this.f12269a |= 1048576;
        j();
        return this;
    }
}
