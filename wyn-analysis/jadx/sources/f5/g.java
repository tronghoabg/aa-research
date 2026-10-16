package F5;

import E5.I0;
import E5.J0;
import f6.C2613z;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f3900a;

    /* renamed from: b, reason: collision with root package name */
    public int f3901b;

    /* renamed from: c, reason: collision with root package name */
    public long f3902c;

    /* renamed from: d, reason: collision with root package name */
    public final C2613z f3903d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3904e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3905f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f3906g;

    public g(h hVar, String str, int i5, C2613z c2613z) {
        this.f3906g = hVar;
        this.f3900a = str;
        this.f3901b = i5;
        this.f3902c = c2613z == null ? -1L : c2613z.f35115d;
        if (c2613z == null || !c2613z.a()) {
            return;
        }
        this.f3903d = c2613z;
    }

    public final boolean a(a aVar) {
        C2613z c2613z = aVar.f3876d;
        if (c2613z == null) {
            return this.f3901b != aVar.f3875c;
        }
        long j8 = this.f3902c;
        if (j8 == -1) {
            return false;
        }
        if (c2613z.f35115d > j8) {
            return true;
        }
        C2613z c2613z2 = this.f3903d;
        if (c2613z2 == null) {
            return false;
        }
        J0 j02 = aVar.f3874b;
        int iB = j02.b(c2613z.f35112a);
        int iB2 = j02.b(c2613z2.f35112a);
        if (c2613z.f35115d < c2613z2.f35115d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        boolean zA = c2613z.a();
        int i5 = c2613z2.f35113b;
        if (!zA) {
            int i10 = c2613z.f35116e;
            return i10 == -1 || i10 > i5;
        }
        int i11 = c2613z.f35113b;
        if (i11 > i5) {
            return true;
        }
        if (i11 == i5) {
            return c2613z.f35114c > c2613z2.f35114c;
        }
        return false;
    }

    public final boolean b(J0 j02, J0 j03) {
        C2613z c2613z;
        int i5 = this.f3901b;
        if (i5 < j02.o()) {
            h hVar = this.f3906g;
            j02.n(i5, hVar.f3909a);
            I0 i02 = hVar.f3909a;
            for (int i10 = i02.f3122n; i10 <= i02.f3123o; i10++) {
                int iB = j03.b(j02.l(i10));
                if (iB != -1) {
                    i5 = j03.f(iB, hVar.f3910b, false).f3041c;
                    break;
                }
            }
            i5 = -1;
        } else if (i5 >= j03.o()) {
            i5 = -1;
        }
        this.f3901b = i5;
        return i5 != -1 && ((c2613z = this.f3903d) == null || j03.b(c2613z.f35112a) != -1);
    }
}
