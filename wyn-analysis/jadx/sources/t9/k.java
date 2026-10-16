package t9;

import ka.B1;
import ka.C1;

/* loaded from: classes4.dex */
public final class k implements p {

    /* renamed from: a, reason: collision with root package name */
    public final C1 f45960a;

    public k(C1 c12) {
        A6.c.z(s9.p.h(c12) || s9.p.g(c12), "NumericIncrementTransformOperation expects a NumberValue operand", new Object[0]);
        this.f45960a = c12;
    }

    @Override // t9.p
    public final C1 a(C1 c12) {
        if (s9.p.h(c12) || s9.p.g(c12)) {
            return c12;
        }
        B1 b1W = C1.w();
        b1W.h(0L);
        return (C1) b1W.build();
    }

    @Override // t9.p
    public final C1 b(C1 c12, s8.q qVar) {
        long jR;
        C1 c1A = a(c12);
        if (s9.p.h(c1A)) {
            C1 c13 = this.f45960a;
            if (s9.p.h(c13)) {
                long jR2 = c1A.r();
                if (s9.p.g(c13)) {
                    jR = (long) c13.getDoubleValue();
                } else {
                    if (!s9.p.h(c13)) {
                        A6.c.s("Expected 'operand' to be of Number type, but was " + c13.getClass().getCanonicalName(), new Object[0]);
                        throw null;
                    }
                    jR = c13.r();
                }
                long j8 = jR2 + jR;
                if (((jR ^ j8) & (jR2 ^ j8)) < 0) {
                    j8 = j8 >= 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                B1 b1W = C1.w();
                b1W.h(j8);
                return (C1) b1W.build();
            }
        }
        if (s9.p.h(c1A)) {
            double d3 = d() + c1A.r();
            B1 b1W2 = C1.w();
            b1W2.f(d3);
            return (C1) b1W2.build();
        }
        A6.c.z(s9.p.g(c1A), "Expected NumberValue to be of type DoubleValue, but was ", c12.getClass().getCanonicalName());
        double d5 = d() + c1A.getDoubleValue();
        B1 b1W3 = C1.w();
        b1W3.f(d5);
        return (C1) b1W3.build();
    }

    public final double d() {
        C1 c12 = this.f45960a;
        if (s9.p.g(c12)) {
            return c12.getDoubleValue();
        }
        if (s9.p.h(c12)) {
            return c12.r();
        }
        A6.c.s("Expected 'operand' to be of Number type, but was " + c12.getClass().getCanonicalName(), new Object[0]);
        throw null;
    }

    @Override // t9.p
    public final C1 c(C1 c12, C1 c13) {
        return c13;
    }
}
