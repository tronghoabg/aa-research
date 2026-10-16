package V1;

import N1.M;
import N1.N;
import k2.H;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f12908a;

    /* renamed from: b, reason: collision with root package name */
    public int f12909b;

    /* renamed from: c, reason: collision with root package name */
    public long f12910c;

    /* renamed from: d, reason: collision with root package name */
    public final H f12911d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12912e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12913f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f12914g;

    public e(f fVar, String str, int i5, H h10) {
        this.f12914g = fVar;
        this.f12908a = str;
        this.f12909b = i5;
        this.f12910c = h10 == null ? -1L : h10.f38906d;
        if (h10 == null || !h10.b()) {
            return;
        }
        this.f12911d = h10;
    }

    public final boolean a(a aVar) {
        H h10 = aVar.f12890d;
        if (h10 == null) {
            return this.f12909b != aVar.f12889c;
        }
        long j8 = this.f12910c;
        if (j8 == -1) {
            return false;
        }
        if (h10.f38906d > j8) {
            return true;
        }
        H h11 = this.f12911d;
        if (h11 == null) {
            return false;
        }
        N n10 = aVar.f12888b;
        int iB = n10.b(h10.f38903a);
        int iB2 = n10.b(h11.f38903a);
        if (h10.f38906d < h11.f38906d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        boolean zB = h10.b();
        int i5 = h11.f38904b;
        if (!zB) {
            int i10 = h10.f38907e;
            return i10 == -1 || i10 > i5;
        }
        int i11 = h10.f38904b;
        if (i11 > i5) {
            return true;
        }
        if (i11 == i5) {
            return h10.f38905c > h11.f38905c;
        }
        return false;
    }

    public final boolean b(N n10, N n11) {
        H h10;
        int i5 = this.f12909b;
        if (i5 < n10.o()) {
            f fVar = this.f12914g;
            n10.n(i5, fVar.f12917a);
            M m10 = fVar.f12917a;
            for (int i10 = m10.f8069n; i10 <= m10.f8070o; i10++) {
                int iB = n11.b(n10.l(i10));
                if (iB != -1) {
                    i5 = n11.f(iB, fVar.f12918b, false).f8050c;
                    break;
                }
            }
            i5 = -1;
        } else if (i5 >= n11.o()) {
            i5 = -1;
        }
        this.f12909b = i5;
        return i5 != -1 && ((h10 = this.f12911d) == null || n11.b(h10.f38903a) != -1);
    }
}
