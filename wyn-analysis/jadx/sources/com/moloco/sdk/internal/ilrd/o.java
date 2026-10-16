package com.moloco.sdk.internal.ilrd;

import Va.M6;
import Wf.AbstractC1240b0;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* loaded from: classes4.dex */
public final class o {

    @NotNull
    public static final a$b$b Companion = new a$b$b();

    /* renamed from: a, reason: collision with root package name */
    public final long f28603a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28604b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28605c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28606d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28607e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28608f;

    public o(int i5, int i10, int i11, int i12, int i13, long j8, int i14) {
        if (63 != (i5 & 63)) {
            AbstractC1240b0.k(i5, 63, n.f28602b);
            throw null;
        }
        this.f28603a = j8;
        this.f28604b = i10;
        this.f28605c = i11;
        this.f28606d = i12;
        this.f28607e = i13;
        this.f28608f = i14;
    }

    public static o a(o oVar, long j8, int i5, int i10, int i11, int i12, int i13, int i14) {
        if ((i14 & 2) != 0) {
            i5 = oVar.f28604b;
        }
        int i15 = i5;
        if ((i14 & 4) != 0) {
            i10 = oVar.f28605c;
        }
        int i16 = i10;
        if ((i14 & 8) != 0) {
            i11 = oVar.f28606d;
        }
        return new o(j8, i15, i16, i11, (i14 & 16) != 0 ? oVar.f28607e : i12, (i14 & 32) != 0 ? oVar.f28608f : i13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f28603a == oVar.f28603a && this.f28604b == oVar.f28604b && this.f28605c == oVar.f28605c && this.f28606d == oVar.f28606d && this.f28607e == oVar.f28607e && this.f28608f == oVar.f28608f;
    }

    public final int hashCode() {
        long j8 = this.f28603a;
        return (((((((((((int) (j8 ^ (j8 >>> 32))) * 31) + this.f28604b) * 31) + this.f28605c) * 31) + this.f28606d) * 31) + this.f28607e) * 31) + this.f28608f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImpressionCounts(lastEventReceivedTs=");
        sb2.append(this.f28603a);
        sb2.append(", banner=");
        sb2.append(this.f28604b);
        sb2.append(", mrec=");
        sb2.append(this.f28605c);
        sb2.append(", native=");
        sb2.append(this.f28606d);
        sb2.append(", interstitial=");
        sb2.append(this.f28607e);
        sb2.append(", rewarded=");
        return M6.r(sb2, this.f28608f, ')');
    }

    public o(long j8, int i5, int i10, int i11, int i12, int i13) {
        this.f28603a = j8;
        this.f28604b = i5;
        this.f28605c = i10;
        this.f28606d = i11;
        this.f28607e = i12;
        this.f28608f = i13;
    }
}
