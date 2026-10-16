package K;

import N.C0740o;
import N.L0;
import e0.C2465q;

/* renamed from: K.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0676a {

    /* renamed from: a, reason: collision with root package name */
    public static final E.F f6216a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f6217b = 64;

    /* renamed from: c, reason: collision with root package name */
    public static final float f6218c = 36;

    /* renamed from: d, reason: collision with root package name */
    public static final float f6219d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final E.F f6220e;

    static {
        float f10 = 16;
        float f11 = 8;
        f6216a = new E.F(f10, f11, f10, f11);
        f6220e = new E.F(f11, f11, f11, f11);
    }

    public static C0685j a(long j8, long j10, C0740o c0740o, int i5, int i10) {
        c0740o.M(1870371134);
        if ((i10 & 1) != 0) {
            j8 = ((C0680e) c0740o.j(AbstractC0682g.f6260a)).b();
        }
        long j11 = j8;
        if ((i10 & 2) != 0) {
            j10 = AbstractC0682g.b(j11, c0740o);
        }
        L0 l02 = AbstractC0682g.f6260a;
        long jG = e0.z.g(C2465q.a(((C0680e) c0740o.j(l02)).a(), 0.12f), ((C0680e) c0740o.j(l02)).c());
        long jA = ((C0680e) c0740o.j(l02)).a();
        Ba.c.y(c0740o);
        C0685j c0685j = new C0685j(j11, j10, jG, C2465q.a(jA, 0.38f));
        c0740o.p(false);
        return c0685j;
    }
}
