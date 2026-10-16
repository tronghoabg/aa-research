package j$.time.chrono;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import j$.time.temporal.Temporal;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class z implements n, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final z f37552d;

    /* renamed from: e, reason: collision with root package name */
    private static final z[] f37553e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* renamed from: a, reason: collision with root package name */
    private final transient int f37554a;

    /* renamed from: b, reason: collision with root package name */
    private final transient j$.time.g f37555b;

    /* renamed from: c, reason: collision with root package name */
    private final transient String f37556c;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object B(j$.time.temporal.r rVar) {
        return AbstractC2901i.n(this, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean g(j$.time.temporal.q qVar) {
        return AbstractC2901i.j(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int q(j$.time.temporal.q qVar) {
        return AbstractC2901i.f(this, (j$.time.temporal.a) qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long w(j$.time.temporal.q qVar) {
        return AbstractC2901i.g(this, qVar);
    }

    static {
        z zVar = new z(-1, j$.time.g.g0(1868, 1, 1), "Meiji");
        f37552d = zVar;
        f37553e = new z[]{zVar, new z(0, j$.time.g.g0(1912, 7, 30), "Taisho"), new z(1, j$.time.g.g0(1926, 12, 25), "Showa"), new z(2, j$.time.g.g0(1989, 1, 8), "Heisei"), new z(3, j$.time.g.g0(2019, 5, 1), "Reiwa")};
    }

    static z m() {
        return f37553e[r0.length - 1];
    }

    static long A() {
        int iA0 = Http2Connection.DEGRADED_PONG_TIMEOUT_NS - m().f37555b.a0();
        z[] zVarArr = f37553e;
        int iA02 = zVarArr[0].f37555b.a0();
        for (int i5 = 1; i5 < zVarArr.length; i5++) {
            z zVar = zVarArr[i5];
            iA0 = Math.min(iA0, (zVar.f37555b.a0() - iA02) + 1);
            iA02 = zVar.f37555b.a0();
        }
        return iA0;
    }

    static long y() {
        long jF = j$.time.temporal.a.DAY_OF_YEAR.o().f();
        for (z zVar : f37553e) {
            jF = Math.min(jF, ((zVar.f37555b.c0() ? 366 : 365) - zVar.f37555b.X()) + 1);
            if (zVar.r() != null) {
                jF = Math.min(jF, zVar.r().f37555b.X() - 1);
            }
        }
        return jF;
    }

    private z(int i5, j$.time.g gVar, String str) {
        this.f37554a = i5;
        this.f37555b = gVar;
        this.f37556c = str;
    }

    final j$.time.g n() {
        return this.f37555b;
    }

    public static z v(int i5) {
        int i10 = i5 + 1;
        if (i10 >= 0) {
            z[] zVarArr = f37553e;
            if (i10 < zVarArr.length) {
                return zVarArr[i10];
            }
        }
        throw new j$.time.c("Invalid era: " + i5);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        return temporal.d(getValue(), j$.time.temporal.a.ERA);
    }

    public static z[] C() {
        z[] zVarArr = f37553e;
        return (z[]) Arrays.copyOf(zVarArr, zVarArr.length);
    }

    static z h(j$.time.g gVar) {
        if (gVar.b0(y.f37548d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 are not supported");
        }
        z[] zVarArr = f37553e;
        for (int length = zVarArr.length - 1; length >= 0; length--) {
            z zVar = zVarArr[length];
            if (gVar.compareTo(zVar.f37555b) >= 0) {
                return zVar;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return this.f37554a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (qVar != aVar) {
            return j$.time.temporal.l.d(this, qVar);
        }
        return w.f37546d.K(aVar);
    }

    public final String toString() {
        return this.f37556c;
    }

    final z r() {
        if (this == m()) {
            return null;
        }
        return v(this.f37554a + 1);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 5, this);
    }

    final void H(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.f37554a);
    }
}
