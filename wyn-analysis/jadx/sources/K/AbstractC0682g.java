package K;

import N.C0740o;
import N.L0;
import N.Y;
import e0.C2465q;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: K.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0682g {

    /* renamed from: a, reason: collision with root package name */
    public static final L0 f6260a = new L0(C0681f.f6251j);

    public static final long a(C0680e contentColorFor, long j8) {
        AbstractC3340k.e(contentColorFor, "$this$contentColorFor");
        boolean zB = C2465q.b(j8, contentColorFor.b());
        Y y10 = contentColorFor.f6246h;
        if (zB) {
            return ((C2465q) y10.getValue()).f34382a;
        }
        if (C2465q.b(j8, ((C2465q) contentColorFor.f6240b.getValue()).f34382a)) {
            return ((C2465q) y10.getValue()).f34382a;
        }
        boolean zB2 = C2465q.b(j8, ((C2465q) contentColorFor.f6241c.getValue()).f34382a);
        Y y11 = contentColorFor.f6247i;
        return zB2 ? ((C2465q) y11.getValue()).f34382a : C2465q.b(j8, ((C2465q) contentColorFor.f6242d.getValue()).f34382a) ? ((C2465q) y11.getValue()).f34382a : C2465q.b(j8, ((C2465q) contentColorFor.f6243e.getValue()).f34382a) ? ((C2465q) contentColorFor.f6248j.getValue()).f34382a : C2465q.b(j8, contentColorFor.c()) ? contentColorFor.a() : C2465q.b(j8, ((C2465q) contentColorFor.f6245g.getValue()).f34382a) ? ((C2465q) contentColorFor.f6249l.getValue()).f34382a : C2465q.f34380i;
    }

    public static final long b(long j8, C0740o c0740o) {
        long jA = a((C0680e) c0740o.j(f6260a), j8);
        return jA != C2465q.f34380i ? jA : ((C2465q) c0740o.j(AbstractC0684i.f6262a)).f34382a;
    }

    public static C0680e c(long j8, long j10, int i5, long j11) {
        long jC = (i5 & 1) != 0 ? e0.z.c(4284612846L) : j8;
        long jC2 = (i5 & 2) != 0 ? e0.z.c(4281794739L) : j10;
        long jC3 = (i5 & 4) != 0 ? e0.z.c(4278442694L) : j11;
        long jC4 = e0.z.c(4278290310L);
        long j12 = C2465q.f34375d;
        long jC5 = e0.z.c(4289724448L);
        long j13 = C2465q.f34373b;
        return new C0680e(jC, jC2, jC3, jC4, j12, j12, jC5, j12, j13, j13, j13, j12, true);
    }
}
