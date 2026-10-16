package j$.time.format;

import j$.time.LocalDate;
import j$.time.chrono.Chronology;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class o extends i {

    /* renamed from: h, reason: collision with root package name */
    public static final LocalDate f49972h = LocalDate.of(2000, 1, 1);

    /* renamed from: g, reason: collision with root package name */
    public final j$.time.chrono.b f49973g;

    public o(j$.time.temporal.m mVar, int i2, int i3, j$.time.chrono.b bVar, int i4) {
        super(mVar, i2, i3, c0.NOT_NEGATIVE, i4);
        this.f49973g = bVar;
    }

    @Override // j$.time.format.i
    public final long a(w wVar, long j2) {
        long jAbs = Math.abs(j2);
        j$.time.chrono.b bVar = this.f49973g;
        long jF = bVar != null ? Chronology.CC.a(wVar.f49999a).C(bVar).f(this.f49948a) : 0;
        long[] jArr = i.f49947f;
        if (j2 >= jF) {
            long j3 = jArr[this.f49949b];
            if (j2 < jF + j3) {
                return jAbs % j3;
            }
        }
        return jAbs % jArr[this.f49950c];
    }

    @Override // j$.time.format.i
    public final boolean b(u uVar) {
        if (uVar.f49992c) {
            return super.b(uVar);
        }
        return false;
    }

    @Override // j$.time.format.i
    public final int c(final u uVar, long j2, final int i2, final int i3) {
        final o oVar;
        u uVar2;
        final long j3;
        int iF;
        long j4;
        j$.time.chrono.b bVar = this.f49973g;
        if (bVar != null) {
            Chronology chronology = uVar.c().f49925c;
            if (chronology == null && (chronology = uVar.f49990a.f49903e) == null) {
                chronology = j$.time.chrono.r.f49878d;
            }
            iF = chronology.C(bVar).f(this.f49948a);
            oVar = this;
            j3 = j2;
            Consumer consumer = new Consumer() { // from class: j$.time.format.n
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void u(Object obj) {
                    this.f49967a.c(uVar, j3, i2, i3);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Consumer$CC.$default$andThen(this, consumer2);
                }
            };
            uVar2 = uVar;
            ArrayList arrayList = uVar2.f49994e;
            if (arrayList == null) {
                arrayList = new ArrayList();
                uVar2.f49994e = arrayList;
            }
            arrayList.add(consumer);
        } else {
            oVar = this;
            uVar2 = uVar;
            j3 = j2;
            iF = 0;
        }
        int i4 = i3 - i2;
        int i5 = oVar.f49949b;
        if (i4 != i5 || j3 < 0) {
            j4 = j3;
        } else {
            long j5 = i.f49947f[i5];
            long j6 = iF;
            long j7 = j6 - (j6 % j5);
            long j8 = iF > 0 ? j7 + j3 : j7 - j3;
            j4 = j8 < j6 ? j5 + j8 : j8;
        }
        return uVar2.f(oVar.f49948a, j4, i2, i3);
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.f49952e == -1) {
            return this;
        }
        return new o(this.f49948a, this.f49949b, this.f49950c, this.f49973g, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i2) {
        return new o(this.f49948a, this.f49949b, this.f49950c, this.f49973g, this.f49952e + i2);
    }

    @Override // j$.time.format.i
    public final String toString() {
        String strValueOf = String.valueOf(this.f49948a);
        Object objRequireNonNull = this.f49973g;
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(0, "defaultObj");
        }
        return "ReducedValue(" + strValueOf + "," + this.f49949b + "," + this.f49950c + "," + String.valueOf(objRequireNonNull) + ")";
    }
}
