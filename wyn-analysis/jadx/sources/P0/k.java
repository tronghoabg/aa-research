package p0;

import Va.zb;
import d0.C2384c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f43141a;

    /* renamed from: b, reason: collision with root package name */
    public final long f43142b;

    /* renamed from: c, reason: collision with root package name */
    public final long f43143c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f43144d;

    /* renamed from: e, reason: collision with root package name */
    public final long f43145e;

    /* renamed from: f, reason: collision with root package name */
    public final long f43146f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f43147g;

    /* renamed from: h, reason: collision with root package name */
    public final int f43148h;

    /* renamed from: i, reason: collision with root package name */
    public final long f43149i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f43150j;
    public zb k;

    public k(long j8, long j10, long j11, boolean z2, long j12, long j13, boolean z10, boolean z11, int i5, long j14) {
        this.f43141a = j8;
        this.f43142b = j10;
        this.f43143c = j11;
        this.f43144d = z2;
        this.f43145e = j12;
        this.f43146f = j13;
        this.f43147g = z10;
        this.f43148h = i5;
        this.f43149i = j14;
        zb zbVar = new zb();
        zbVar.f14848a = z11;
        zbVar.f14849b = z11;
        this.k = zbVar;
    }

    public final void a() {
        zb zbVar = this.k;
        zbVar.f14849b = true;
        zbVar.f14848a = true;
    }

    public final boolean b() {
        zb zbVar = this.k;
        return zbVar.f14849b || zbVar.f14848a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) j.a(this.f43141a));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f43142b);
        sb2.append(", position=");
        sb2.append((Object) C2384c.g(this.f43143c));
        sb2.append(", pressed=");
        sb2.append(this.f43144d);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f43145e);
        sb2.append(", previousPosition=");
        sb2.append((Object) C2384c.g(this.f43146f));
        sb2.append(", previousPressed=");
        sb2.append(this.f43147g);
        sb2.append(", isConsumed=");
        sb2.append(b());
        sb2.append(", type=");
        int i5 = this.f43148h;
        sb2.append((Object) (i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb2.append(", historical=");
        Object obj = this.f43150j;
        if (obj == null) {
            obj = ff.v.f35432a;
        }
        sb2.append(obj);
        sb2.append(",scrollDelta=");
        sb2.append((Object) C2384c.g(this.f43149i));
        sb2.append(')');
        return sb2.toString();
    }

    public k(long j8, long j10, long j11, boolean z2, long j12, long j13, boolean z10, int i5, ArrayList arrayList, long j14) {
        this(j8, j10, j11, z2, j12, j13, z10, false, i5, j14);
        this.f43150j = arrayList;
    }
}
