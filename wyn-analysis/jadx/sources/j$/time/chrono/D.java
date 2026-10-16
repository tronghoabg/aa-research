package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class D extends AbstractC2896d {
    private static final long serialVersionUID = 1300372329181994526L;

    /* renamed from: a, reason: collision with root package name */
    private final transient j$.time.g f37501a;

    D(j$.time.g gVar) {
        Objects.requireNonNull(gVar, "isoDate");
        this.f37501a = gVar;
    }

    @Override // j$.time.chrono.InterfaceC2894b
    public final m a() {
        return B.f37499d;
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    public final int hashCode() {
        B.f37499d.getClass();
        return this.f37501a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    public final n E() {
        return W() >= 1 ? E.ROC : E.BEFORE_ROC;
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.B(this);
        }
        if (!AbstractC2901i.i(this, qVar)) {
            throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", qVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i5 = C.f37500a[aVar.ordinal()];
        if (i5 == 1 || i5 == 2 || i5 == 3) {
            return this.f37501a.t(qVar);
        }
        if (i5 != 4) {
            return B.f37499d.K(aVar);
        }
        j$.time.temporal.t tVarO = j$.time.temporal.a.YEAR.o();
        return j$.time.temporal.t.j(1L, W() <= 0 ? (-tVarO.e()) + 1912 : tVarO.d() - 1911);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i5 = C.f37500a[((j$.time.temporal.a) qVar).ordinal()];
            if (i5 == 4) {
                int iW = W();
                if (iW < 1) {
                    iW = 1 - iW;
                }
                return iW;
            }
            j$.time.g gVar = this.f37501a;
            if (i5 == 5) {
                return ((W() * 12) + gVar.Y()) - 1;
            }
            if (i5 == 6) {
                return W();
            }
            if (i5 != 7) {
                return gVar.w(qVar);
            }
            return W() < 1 ? 0 : 1;
        }
        return qVar.s(this);
    }

    private int W() {
        return this.f37501a.a0() - 1911;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    @Override // j$.time.chrono.AbstractC2896d, j$.time.temporal.Temporal
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.chrono.D d(long r9, j$.time.temporal.q r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.a
            if (r0 == 0) goto L99
            r0 = r11
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r8.w(r0)
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L10
            return r8
        L10:
            int[] r1 = j$.time.chrono.C.f37500a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            j$.time.g r3 = r8.f37501a
            r4 = 7
            r5 = 6
            r6 = 4
            if (r2 == r6) goto L4b
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L4b
            goto L61
        L27:
            j$.time.chrono.B r11 = j$.time.chrono.B.f37499d
            j$.time.temporal.t r11 = r11.K(r0)
            r11.b(r9, r0)
            int r11 = r8.W()
            long r0 = (long) r11
            r4 = 12
            long r0 = r0 * r4
            int r11 = r3.Y()
            long r4 = (long) r11
            long r0 = r0 + r4
            r4 = 1
            long r0 = r0 - r4
            long r9 = r9 - r0
            j$.time.g r9 = r3.m0(r9)
            j$.time.chrono.D r9 = r8.Y(r9)
            return r9
        L4b:
            j$.time.chrono.B r2 = j$.time.chrono.B.f37499d
            j$.time.temporal.t r2 = r2.K(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L84
            if (r0 == r5) goto L79
            if (r0 == r4) goto L6a
        L61:
            j$.time.g r9 = r3.d(r9, r11)
            j$.time.chrono.D r9 = r8.Y(r9)
            return r9
        L6a:
            int r9 = r8.W()
            int r9 = 1912 - r9
            j$.time.g r9 = r3.t0(r9)
            j$.time.chrono.D r9 = r8.Y(r9)
            return r9
        L79:
            int r2 = r2 + 1911
            j$.time.g r9 = r3.t0(r2)
            j$.time.chrono.D r9 = r8.Y(r9)
            return r9
        L84:
            int r9 = r8.W()
            r10 = 1
            if (r9 < r10) goto L8e
            int r2 = r2 + 1911
            goto L90
        L8e:
            int r2 = 1912 - r2
        L90:
            j$.time.g r9 = r3.t0(r2)
            j$.time.chrono.D r9 = r8.Y(r9)
            return r9
        L99:
            j$.time.chrono.b r9 = super.d(r9, r11)
            j$.time.chrono.D r9 = (j$.time.chrono.D) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.D.d(long, j$.time.temporal.q):j$.time.chrono.D");
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    /* renamed from: l */
    public final InterfaceC2894b s(j$.time.temporal.m mVar) {
        return (D) super.s(mVar);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.temporal.Temporal
    public final Temporal s(j$.time.g gVar) {
        return (D) super.s(gVar);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    public final InterfaceC2894b I(j$.time.temporal.p pVar) {
        return (D) super.I(pVar);
    }

    @Override // j$.time.chrono.AbstractC2896d
    final InterfaceC2894b V(long j8) {
        return Y(this.f37501a.o0(j8));
    }

    @Override // j$.time.chrono.AbstractC2896d
    final InterfaceC2894b U(long j8) {
        return Y(this.f37501a.m0(j8));
    }

    @Override // j$.time.chrono.AbstractC2896d
    final InterfaceC2894b T(long j8) {
        return Y(this.f37501a.l0(j8));
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b, j$.time.temporal.Temporal
    public final InterfaceC2894b e(long j8, TemporalUnit temporalUnit) {
        return (D) super.e(j8, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.temporal.Temporal
    public final Temporal e(long j8, TemporalUnit temporalUnit) {
        return (D) super.e(j8, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    /* renamed from: M */
    public final InterfaceC2894b o(long j8, TemporalUnit temporalUnit) {
        return (D) super.o(j8, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.temporal.Temporal
    public final Temporal o(long j8, ChronoUnit chronoUnit) {
        return (D) super.o(j8, chronoUnit);
    }

    private D Y(j$.time.g gVar) {
        return gVar.equals(this.f37501a) ? this : new D(gVar);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    public final long x() {
        return this.f37501a.x();
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            return this.f37501a.equals(((D) obj).f37501a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 7, this);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    public final InterfaceC2897e z(j$.time.k kVar) {
        return C2899g.S(this, kVar);
    }
}
