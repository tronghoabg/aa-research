package f6;

import E5.H0;
import E5.I0;
import E5.J0;

/* renamed from: f6.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2605r extends AbstractC2601n {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f35095e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f35096c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f35097d;

    public C2605r(J0 j02, Object obj, Object obj2) {
        super(j02);
        this.f35096c = obj;
        this.f35097d = obj2;
    }

    @Override // f6.AbstractC2601n, E5.J0
    public final int b(Object obj) {
        Object obj2;
        if (f35095e.equals(obj) && (obj2 = this.f35097d) != null) {
            obj = obj2;
        }
        return this.f35081b.b(obj);
    }

    @Override // f6.AbstractC2601n, E5.J0
    public final H0 f(int i5, H0 h02, boolean z2) {
        this.f35081b.f(i5, h02, z2);
        if (u6.v.a(h02.f3040b, this.f35097d) && z2) {
            h02.f3040b = f35095e;
        }
        return h02;
    }

    @Override // f6.AbstractC2601n, E5.J0
    public final Object l(int i5) {
        Object objL = this.f35081b.l(i5);
        return u6.v.a(objL, this.f35097d) ? f35095e : objL;
    }

    @Override // f6.AbstractC2601n, E5.J0
    public final I0 m(int i5, I0 i02, long j8) {
        this.f35081b.m(i5, i02, j8);
        if (u6.v.a(i02.f3110a, this.f35096c)) {
            i02.f3110a = I0.f3107q;
        }
        return i02;
    }
}
