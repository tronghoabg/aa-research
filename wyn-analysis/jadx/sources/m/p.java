package M;

import U8.v0;
import d0.C2384c;
import g0.InterfaceC2663d;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final float f7200a = 10;

    public static final float a(InterfaceC2663d interfaceC2663d, boolean z2, long j8) {
        long jF = v0.f(d0.f.d(j8), d0.f.b(j8));
        float fSqrt = ((float) Math.sqrt((C2384c.c(jF) * C2384c.c(jF)) + (C2384c.b(jF) * C2384c.b(jF)))) / 2.0f;
        return z2 ? interfaceC2663d.t(f7200a) + fSqrt : fSqrt;
    }
}
