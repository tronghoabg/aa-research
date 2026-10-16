package j$.time.chrono;

import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* loaded from: classes2.dex */
public final class r extends AbstractC2896d {
    private static final long serialVersionUID = -5207853542612002020L;

    /* renamed from: a, reason: collision with root package name */
    private final transient p f37538a;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f37539b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f37540c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f37541d;

    static r Y(p pVar, int i5, int i10, int i11) {
        return new r(pVar, i5, i10, i11);
    }

    static r Z(p pVar, long j8) {
        return new r(pVar, j8);
    }

    private r(p pVar, int i5, int i10, int i11) {
        pVar.W(i5, i10, i11);
        this.f37538a = pVar;
        this.f37539b = i5;
        this.f37540c = i10;
        this.f37541d = i11;
    }

    private r(p pVar, long j8) {
        int[] iArrX = pVar.X((int) j8);
        this.f37538a = pVar;
        this.f37539b = iArrX[0];
        this.f37540c = iArrX[1];
        this.f37541d = iArrX[2];
    }

    @Override // j$.time.chrono.InterfaceC2894b
    public final m a() {
        return this.f37538a;
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    public final n E() {
        return s.AH;
    }

    public final int X() {
        return this.f37538a.Z(this.f37539b);
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
        int i5 = q.f37537a[aVar.ordinal()];
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? this.f37538a.K(aVar) : j$.time.temporal.t.j(1L, 5L) : j$.time.temporal.t.j(1L, X()) : j$.time.temporal.t.j(1L, r2.Y(this.f37539b, this.f37540c));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.s(this);
        }
        int i5 = q.f37537a[((j$.time.temporal.a) qVar).ordinal()];
        int i10 = this.f37540c;
        int i11 = this.f37541d;
        int i12 = this.f37539b;
        switch (i5) {
            case 1:
                return i11;
            case 2:
                return W();
            case 3:
                return ((i11 - 1) / 7) + 1;
            case 4:
                return ((int) j$.time.b.e(x() + 3, 7)) + 1;
            case 5:
                return ((i11 - 1) % 7) + 1;
            case 6:
                return ((W() - 1) % 7) + 1;
            case 7:
                return x();
            case 8:
                return ((W() - 1) / 7) + 1;
            case 9:
                return i10;
            case 10:
                return ((i12 * 12) + i10) - 1;
            case 11:
                return i12;
            case 12:
                return i12;
            case 13:
                return i12 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.temporal.Temporal
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final r d(long j8, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (r) super.d(j8, qVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        p pVar = this.f37538a;
        pVar.K(aVar).b(j8, aVar);
        int i5 = (int) j8;
        int i10 = q.f37537a[aVar.ordinal()];
        int i11 = this.f37541d;
        int i12 = this.f37540c;
        int i13 = this.f37539b;
        switch (i10) {
            case 1:
                return c0(i13, i12, i5);
            case 2:
                return T(Math.min(i5, X()) - W());
            case 3:
                return T((j8 - w(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return T(j8 - (((int) j$.time.b.e(x() + 3, 7)) + 1));
            case 5:
                return T(j8 - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return T(j8 - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new r(pVar, j8);
            case 8:
                return T((j8 - w(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return c0(i13, i5, i11);
            case 10:
                return U(j8 - (((i13 * 12) + i12) - 1));
            case 11:
                if (i13 < 1) {
                    i5 = 1 - i5;
                }
                return c0(i5, i12, i11);
            case 12:
                return c0(i5, i12, i11);
            case 13:
                return c0(1 - i13, i12, i11);
            default:
                throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", qVar));
        }
    }

    private r c0(int i5, int i10, int i11) {
        p pVar = this.f37538a;
        int iY = pVar.Y(i5, i10);
        if (i11 > iY) {
            i11 = iY;
        }
        return new r(pVar, i5, i10, i11);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    /* renamed from: l */
    public final InterfaceC2894b s(j$.time.temporal.m mVar) {
        return (r) super.s(mVar);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.temporal.Temporal
    public final Temporal s(j$.time.g gVar) {
        return (r) super.s(gVar);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    public final InterfaceC2894b I(j$.time.temporal.p pVar) {
        return (r) super.I(pVar);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    public final long x() {
        return this.f37538a.W(this.f37539b, this.f37540c, this.f37541d);
    }

    private int W() {
        return this.f37538a.V(this.f37539b, this.f37540c) + this.f37541d;
    }

    @Override // j$.time.chrono.AbstractC2896d
    final InterfaceC2894b V(long j8) {
        if (j8 == 0) {
            return this;
        }
        long j10 = this.f37539b + ((int) j8);
        int i5 = (int) j10;
        if (j10 == i5) {
            return c0(i5, this.f37540c, this.f37541d);
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC2896d
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final r U(long j8) {
        if (j8 == 0) {
            return this;
        }
        long j10 = (this.f37539b * 12) + (this.f37540c - 1) + j8;
        return c0(this.f37538a.T(j$.time.b.f(j10, 12L)), ((int) j$.time.b.e(j10, 12L)) + 1, this.f37541d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC2896d
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final r T(long j8) {
        return new r(this.f37538a, x() + j8);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b, j$.time.temporal.Temporal
    public final InterfaceC2894b e(long j8, TemporalUnit temporalUnit) {
        return (r) super.e(j8, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.temporal.Temporal
    public final Temporal e(long j8, TemporalUnit temporalUnit) {
        return (r) super.e(j8, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    /* renamed from: M */
    public final InterfaceC2894b o(long j8, TemporalUnit temporalUnit) {
        return (r) super.o(j8, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.temporal.Temporal
    public final Temporal o(long j8, ChronoUnit chronoUnit) {
        return (r) super.o(j8, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f37539b == rVar.f37539b && this.f37540c == rVar.f37540c && this.f37541d == rVar.f37541d && this.f37538a.equals(rVar.f37538a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    public final int hashCode() {
        this.f37538a.getClass();
        int i5 = this.f37539b;
        return (((i5 << 11) + (this.f37540c << 6)) + this.f37541d) ^ ((i5 & BackupConstant.CLOSE_NOT_SHOW_CODE) ^ 2100100019);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    public final InterfaceC2897e z(j$.time.k kVar) {
        return C2899g.S(this, kVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 6, this);
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f37538a);
        objectOutput.writeInt(j$.time.temporal.l.a(this, j$.time.temporal.a.YEAR));
        objectOutput.writeByte(j$.time.temporal.l.a(this, j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(j$.time.temporal.l.a(this, j$.time.temporal.a.DAY_OF_MONTH));
    }
}
