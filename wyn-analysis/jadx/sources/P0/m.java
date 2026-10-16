package p0;

import d0.C2384c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f43154a;

    /* renamed from: b, reason: collision with root package name */
    public final long f43155b;

    /* renamed from: c, reason: collision with root package name */
    public final long f43156c;

    /* renamed from: d, reason: collision with root package name */
    public final long f43157d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f43158e;

    /* renamed from: f, reason: collision with root package name */
    public final int f43159f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f43160g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f43161h;

    /* renamed from: i, reason: collision with root package name */
    public final long f43162i;

    public m(long j8, long j10, long j11, long j12, boolean z2, int i5, boolean z10, ArrayList arrayList, long j13) {
        this.f43154a = j8;
        this.f43155b = j10;
        this.f43156c = j11;
        this.f43157d = j12;
        this.f43158e = z2;
        this.f43159f = i5;
        this.f43160g = z10;
        this.f43161h = arrayList;
        this.f43162i = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f43154a == mVar.f43154a && this.f43155b == mVar.f43155b && C2384c.a(this.f43156c, mVar.f43156c) && C2384c.a(this.f43157d, mVar.f43157d) && this.f43158e == mVar.f43158e && this.f43159f == mVar.f43159f && this.f43160g == mVar.f43160g && this.f43161h.equals(mVar.f43161h) && C2384c.a(this.f43162i, mVar.f43162i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j8 = this.f43154a;
        long j10 = this.f43155b;
        int iD = (C2384c.d(this.f43157d) + ((C2384c.d(this.f43156c) + (((((int) (j8 ^ (j8 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31)) * 31)) * 31;
        boolean z2 = this.f43158e;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i10 = (((iD + i5) * 31) + this.f43159f) * 31;
        boolean z10 = this.f43160g;
        return C2384c.d(this.f43162i) + ((this.f43161h.hashCode() + ((i10 + (z10 ? 1 : z10 ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputEventData(id=");
        sb2.append((Object) j.a(this.f43154a));
        sb2.append(", uptime=");
        sb2.append(this.f43155b);
        sb2.append(", positionOnScreen=");
        sb2.append((Object) C2384c.g(this.f43156c));
        sb2.append(", position=");
        sb2.append((Object) C2384c.g(this.f43157d));
        sb2.append(", down=");
        sb2.append(this.f43158e);
        sb2.append(", type=");
        int i5 = this.f43159f;
        sb2.append((Object) (i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb2.append(", issuesEnterExit=");
        sb2.append(this.f43160g);
        sb2.append(", historical=");
        sb2.append(this.f43161h);
        sb2.append(", scrollDelta=");
        sb2.append((Object) C2384c.g(this.f43162i));
        sb2.append(')');
        return sb2.toString();
    }
}
