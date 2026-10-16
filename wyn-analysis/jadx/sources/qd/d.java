package Qd;

import A.AbstractC0213f;
import Cd.C0352u;
import Wf.AbstractC1240b0;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* loaded from: classes5.dex */
public final class d implements Comparable<d> {

    @NotNull
    public static final c Companion = new c();

    /* renamed from: j, reason: collision with root package name */
    public static final InterfaceC2525i[] f9970j;

    /* renamed from: a, reason: collision with root package name */
    public final int f9971a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9972b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9973c;

    /* renamed from: d, reason: collision with root package name */
    public final f f9974d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9975e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9976f;

    /* renamed from: g, reason: collision with root package name */
    public final e f9977g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9978h;

    /* renamed from: i, reason: collision with root package name */
    public final long f9979i;

    static {
        EnumC2526j enumC2526j = EnumC2526j.f34668b;
        f9970j = new InterfaceC2525i[]{null, null, null, Fe.c.y(enumC2526j, new C0352u(4)), null, null, Fe.c.y(enumC2526j, new C0352u(5)), null, null};
        a.a(0L);
    }

    public /* synthetic */ d(int i5, int i10, int i11, int i12, f fVar, int i13, int i14, e eVar, int i15, long j8) {
        if (511 != (i5 & 511)) {
            AbstractC1240b0.k(i5, 511, b.f9969a.getDescriptor());
            throw null;
        }
        this.f9971a = i10;
        this.f9972b = i11;
        this.f9973c = i12;
        this.f9974d = fVar;
        this.f9975e = i13;
        this.f9976f = i14;
        this.f9977g = eVar;
        this.f9978h = i15;
        this.f9979i = j8;
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        d other = dVar;
        AbstractC3340k.e(other, "other");
        long j8 = this.f9979i;
        long j10 = other.f9979i;
        if (j8 < j10) {
            return -1;
        }
        return j8 == j10 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f9971a == dVar.f9971a && this.f9972b == dVar.f9972b && this.f9973c == dVar.f9973c && this.f9974d == dVar.f9974d && this.f9975e == dVar.f9975e && this.f9976f == dVar.f9976f && this.f9977g == dVar.f9977g && this.f9978h == dVar.f9978h && this.f9979i == dVar.f9979i;
    }

    public final int hashCode() {
        int iHashCode = (((this.f9977g.hashCode() + ((((((this.f9974d.hashCode() + (((((this.f9971a * 31) + this.f9972b) * 31) + this.f9973c) * 31)) * 31) + this.f9975e) * 31) + this.f9976f) * 31)) * 31) + this.f9978h) * 31;
        long j8 = this.f9979i;
        return iHashCode + ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GMTDate(seconds=");
        sb2.append(this.f9971a);
        sb2.append(", minutes=");
        sb2.append(this.f9972b);
        sb2.append(", hours=");
        sb2.append(this.f9973c);
        sb2.append(", dayOfWeek=");
        sb2.append(this.f9974d);
        sb2.append(", dayOfMonth=");
        sb2.append(this.f9975e);
        sb2.append(", dayOfYear=");
        sb2.append(this.f9976f);
        sb2.append(", month=");
        sb2.append(this.f9977g);
        sb2.append(", year=");
        sb2.append(this.f9978h);
        sb2.append(", timestamp=");
        return AbstractC0213f.e(sb2, this.f9979i, ')');
    }

    public d(int i5, int i10, int i11, f dayOfWeek, int i12, int i13, e month, int i14, long j8) {
        AbstractC3340k.e(dayOfWeek, "dayOfWeek");
        AbstractC3340k.e(month, "month");
        this.f9971a = i5;
        this.f9972b = i10;
        this.f9973c = i11;
        this.f9974d = dayOfWeek;
        this.f9975e = i12;
        this.f9976f = i13;
        this.f9977g = month;
        this.f9978h = i14;
        this.f9979i = j8;
    }
}
