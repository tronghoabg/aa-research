package D8;

import Q1.o;
import wg.b;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2561a;

    /* renamed from: b, reason: collision with root package name */
    public String f2562b;

    public static a a(o oVar) {
        String str;
        oVar.H(2);
        int iU = oVar.u();
        int i5 = iU >> 1;
        int iU2 = ((oVar.u() >> 3) & 31) | ((iU & 1) << 5);
        if (i5 == 4 || i5 == 5 || i5 == 7) {
            str = "dvhe";
        } else if (i5 == 8) {
            str = "hev1";
        } else {
            if (i5 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i5);
        return new a(N0.a.d(iU2, iU2 >= 10 ? "." : ".0", sb2), 3);
    }

    public String toString() {
        switch (this.f2561a) {
            case 2:
                return b.c(new StringBuilder("Phase('"), this.f2562b, "')");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(String str, int i5) {
        this.f2561a = i5;
        this.f2562b = str;
    }
}
