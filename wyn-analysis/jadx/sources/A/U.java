package A;

import N.B0;
import N.C0718d;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import N.C0751z;
import com.unity3d.services.UnityAdsConstants;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final S3.c f79a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80b;

    /* renamed from: c, reason: collision with root package name */
    public final N.Y f81c;

    /* renamed from: d, reason: collision with root package name */
    public final N.Y f82d;

    /* renamed from: e, reason: collision with root package name */
    public final N.Y f83e;

    /* renamed from: f, reason: collision with root package name */
    public final N.Y f84f;

    /* renamed from: g, reason: collision with root package name */
    public final N.Y f85g;

    /* renamed from: h, reason: collision with root package name */
    public final X.p f86h;

    /* renamed from: i, reason: collision with root package name */
    public final X.p f87i;

    /* renamed from: j, reason: collision with root package name */
    public final N.Y f88j;
    public final C0751z k;

    public U(S3.c cVar, String str) {
        this.f79a = cVar;
        this.f80b = str;
        Object objB = b();
        N.P p10 = N.P.f7730f;
        this.f81c = C0718d.G(objB, p10);
        this.f82d = C0718d.G(new N(b(), b()), p10);
        this.f83e = C0718d.G(0L, p10);
        this.f84f = C0718d.G(Long.MIN_VALUE, p10);
        this.f85g = C0718d.G(Boolean.TRUE, p10);
        this.f86h = C0718d.F();
        this.f87i = C0718d.F();
        this.f88j = C0718d.G(Boolean.FALSE, p10);
        T t10 = new T(this, 0);
        Dd.c cVar2 = B0.f7667a;
        this.k = new C0751z(t10);
    }

    public final void a(Object obj, C0740o c0740o, int i5) {
        int i10;
        c0740o.N(-1493585151);
        if ((i5 & 14) == 0) {
            i10 = (c0740o.e(obj) ? 4 : 2) | i5;
        } else {
            i10 = i5;
        }
        if ((i5 & 112) == 0) {
            i10 |= c0740o.e(this) ? 32 : 16;
        }
        if ((i10 & 91) == 18 && c0740o.x()) {
            c0740o.I();
        } else if (!d()) {
            g(obj, c0740o, i10 & 126);
            if (!AbstractC3340k.a(obj, b()) || ((Number) this.f84f.getValue()).longValue() != Long.MIN_VALUE || ((Boolean) this.f85g.getValue()).booleanValue()) {
                c0740o.M(1157296644);
                boolean zE = c0740o.e(this);
                Object objF = c0740o.F();
                if (zE || objF == C0732k.f7800a) {
                    objF = new Q(this, null);
                    c0740o.U(objF);
                }
                c0740o.p(false);
                C0718d.d(c0740o, this, (tf.p) objF);
            }
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new S(this, obj, i5, 0);
    }

    public final Object b() {
        return ((N.Y) this.f79a.f10936b).getValue();
    }

    public final N c() {
        return (N) this.f82d.getValue();
    }

    public final boolean d() {
        return ((Boolean) this.f88j.getValue()).booleanValue();
    }

    public final void e(long j8, float f10) {
        long j10;
        long j11;
        long jLongValue;
        N.Y y10 = this.f84f;
        long jLongValue2 = ((Number) y10.getValue()).longValue();
        long j12 = Long.MIN_VALUE;
        S3.c cVar = this.f79a;
        if (jLongValue2 == Long.MIN_VALUE) {
            y10.setValue(Long.valueOf(j8));
            ((N.Y) cVar.f10937c).setValue(Boolean.TRUE);
        }
        this.f85g.setValue(Boolean.FALSE);
        Long lValueOf = Long.valueOf(j8 - ((Number) y10.getValue()).longValue());
        N.Y y11 = this.f83e;
        y11.setValue(lValueOf);
        ListIterator listIterator = this.f86h.listIterator();
        boolean z2 = true;
        while (true) {
            X.v vVar = (X.v) listIterator;
            if (!vVar.hasNext()) {
                break;
            }
            O o7 = (O) vVar.next();
            boolean zBooleanValue = ((Boolean) o7.f63e.getValue()).booleanValue();
            N.Y y12 = o7.f63e;
            if (zBooleanValue) {
                j10 = j12;
            } else {
                long jLongValue3 = ((Number) y11.getValue()).longValue();
                j10 = j12;
                N.Y y13 = o7.f64f;
                if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    j11 = 0;
                    jLongValue = o7.a().f51h;
                } else {
                    j11 = 0;
                    jLongValue = (long) ((jLongValue3 - ((Number) y13.getValue()).longValue()) / f10);
                }
                o7.f66h.setValue(o7.a().a(jLongValue));
                o7.f67i = o7.a().b(jLongValue);
                if (jLongValue >= o7.a().f51h) {
                    y12.setValue(Boolean.TRUE);
                    y13.setValue(Long.valueOf(j11));
                }
            }
            if (!((Boolean) y12.getValue()).booleanValue()) {
                z2 = false;
            }
            j12 = j10;
        }
        long j13 = j12;
        ListIterator listIterator2 = this.f87i.listIterator();
        while (true) {
            X.v vVar2 = (X.v) listIterator2;
            if (!vVar2.hasNext()) {
                break;
            }
            U u10 = (U) vVar2.next();
            if (!AbstractC3340k.a(u10.f81c.getValue(), u10.b())) {
                u10.e(((Number) y11.getValue()).longValue(), f10);
            }
            if (!AbstractC3340k.a(u10.f81c.getValue(), u10.b())) {
                z2 = false;
            }
        }
        if (z2) {
            y10.setValue(Long.valueOf(j13));
            ((N.Y) cVar.f10936b).setValue(this.f81c.getValue());
            y11.setValue(0L);
            ((N.Y) cVar.f10937c).setValue(Boolean.FALSE);
        }
    }

    public final void f(Object obj, Object obj2) {
        this.f84f.setValue(Long.MIN_VALUE);
        S3.c cVar = this.f79a;
        ((N.Y) cVar.f10937c).setValue(Boolean.FALSE);
        boolean zD = d();
        N.Y y10 = this.f81c;
        if (!zD || !AbstractC3340k.a(b(), obj) || !AbstractC3340k.a(y10.getValue(), obj2)) {
            ((N.Y) cVar.f10936b).setValue(obj);
            y10.setValue(obj2);
            this.f88j.setValue(Boolean.TRUE);
            this.f82d.setValue(new N(obj, obj2));
        }
        ListIterator listIterator = this.f87i.listIterator();
        while (true) {
            X.v vVar = (X.v) listIterator;
            if (!vVar.hasNext()) {
                break;
            }
            U u10 = (U) vVar.next();
            if (u10.d()) {
                u10.f(u10.b(), u10.f81c.getValue());
            }
        }
        ListIterator listIterator2 = this.f86h.listIterator();
        while (true) {
            X.v vVar2 = (X.v) listIterator2;
            if (!vVar2.hasNext()) {
                return;
            }
            O o7 = (O) vVar2.next();
            o7.f66h.setValue(o7.a().a(0L));
            o7.f67i = o7.a().b(0L);
        }
    }

    public final void g(Object obj, C0740o c0740o, int i5) {
        int i10;
        c0740o.N(-583974681);
        if ((i5 & 14) == 0) {
            i10 = (c0740o.e(obj) ? 4 : 2) | i5;
        } else {
            i10 = i5;
        }
        if ((i5 & 112) == 0) {
            i10 |= c0740o.e(this) ? 32 : 16;
        }
        if ((i10 & 91) == 18 && c0740o.x()) {
            c0740o.I();
        } else if (!d()) {
            N.Y y10 = this.f81c;
            if (!AbstractC3340k.a(y10.getValue(), obj)) {
                this.f82d.setValue(new N(y10.getValue(), obj));
                ((N.Y) this.f79a.f10936b).setValue(y10.getValue());
                y10.setValue(obj);
                if (!(((Number) this.f84f.getValue()).longValue() != Long.MIN_VALUE)) {
                    this.f85g.setValue(Boolean.TRUE);
                }
                ListIterator listIterator = this.f86h.listIterator();
                while (true) {
                    X.v vVar = (X.v) listIterator;
                    if (!vVar.hasNext()) {
                        break;
                    }
                    ((O) vVar.next()).f65g.setValue(Boolean.TRUE);
                }
            }
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new S(this, obj, i5, 1);
    }
}
