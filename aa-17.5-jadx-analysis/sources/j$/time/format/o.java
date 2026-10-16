package j$.time.format;

import j$.time.LocalDate;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class o extends i {
    public static final LocalDate h = LocalDate.O(2000, 1, 1);
    public final j$.time.chrono.b g;

    public o(j$.time.temporal.n nVar, int i, int i2, j$.time.chrono.b bVar, int i3) {
        super(nVar, i, i2, e0.NOT_NEGATIVE, i3);
        this.g = bVar;
    }

    @Override // j$.time.format.i
    public final long a(x xVar, long j) {
        long jAbs = Math.abs(j);
        j$.time.chrono.b bVar = this.g;
        long jH = bVar != null ? j$.desugar.sun.nio.fs.g.u(xVar.a).l(bVar).h(this.a) : 0;
        long[] jArr = i.f;
        if (j >= jH) {
            long j2 = jArr[this.b];
            if (j < jH + j2) {
                return jAbs % j2;
            }
        }
        return jAbs % jArr[this.c];
    }

    @Override // j$.time.format.i
    public final boolean b(v vVar) {
        if (vVar.c) {
            return super.b(vVar);
        }
        return false;
    }

    @Override // j$.time.format.i
    public final int c(final v vVar, long j, final int i, final int i2) {
        final o oVar;
        v vVar2;
        final long j2;
        int iH;
        long j3;
        j$.time.chrono.b bVar = this.g;
        if (bVar != null) {
            j$.time.chrono.a aVar = vVar.c().c;
            if (aVar == null && (aVar = vVar.a.d) == null) {
                aVar = j$.time.chrono.s.c;
            }
            iH = aVar.l(bVar).h(this.a);
            oVar = this;
            j2 = j;
            Consumer consumer = new Consumer() { // from class: j$.time.format.n
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.a.c(vVar, j2, i, i2);
                }

                @Override // java.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Consumer$CC.$default$andThen(this, consumer2);
                }
            };
            vVar2 = vVar;
            ArrayList arrayList = vVar2.e;
            if (arrayList == null) {
                arrayList = new ArrayList();
                vVar2.e = arrayList;
            }
            arrayList.add(consumer);
        } else {
            oVar = this;
            vVar2 = vVar;
            j2 = j;
            iH = 0;
        }
        int i3 = i2 - i;
        int i4 = oVar.b;
        if (i3 != i4 || j2 < 0) {
            j3 = j2;
        } else {
            long j4 = i.f[i4];
            long j5 = iH;
            long j6 = j5 - (j5 % j4);
            long j7 = iH > 0 ? j6 + j2 : j6 - j2;
            j3 = j7 < j5 ? j4 + j7 : j7;
        }
        return vVar2.f(oVar.a, j3, i, i2);
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.e == -1) {
            return this;
        }
        return new o(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i) {
        return new o(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "ReducedValue(" + String.valueOf(this.a) + "," + this.b + "," + this.c + "," + String.valueOf(Objects.requireNonNullElse(this.g, 0)) + ")";
    }
}
