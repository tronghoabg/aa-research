package Y2;

import N1.C;
import N1.C0764m;
import N1.C0765n;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f16437a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16438b;

    public f(int i5, List list) {
        this.f16437a = i5;
        this.f16438b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Y2.A a(int r5, Q1.n r6) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.f.a(int, Q1.n):Y2.A");
    }

    public List b(Q1.n nVar) {
        String str;
        int i5;
        List listSingletonList;
        boolean zC = c(32);
        List list = this.f16438b;
        if (zC) {
            return list;
        }
        Q1.o oVar = new Q1.o((byte[]) nVar.f9698d);
        while (oVar.a() > 0) {
            int iU = oVar.u();
            int iU2 = oVar.f9703b + oVar.u();
            if (iU == 134) {
                ArrayList arrayList = new ArrayList();
                int iU3 = oVar.u() & 31;
                for (int i10 = 0; i10 < iU3; i10++) {
                    String strS = oVar.s(3, StandardCharsets.UTF_8);
                    int iU4 = oVar.u();
                    boolean z2 = (iU4 & 128) != 0;
                    if (z2) {
                        i5 = iU4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i5 = 1;
                    }
                    byte bU = (byte) oVar.u();
                    oVar.H(1);
                    if (z2) {
                        boolean z10 = (bU & 64) != 0;
                        byte[] bArr = Q1.a.f9659a;
                        listSingletonList = Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    C0764m c0764m = new C0764m();
                    c0764m.f8194m = C.m(str);
                    c0764m.f8186d = strS;
                    c0764m.f8178G = i5;
                    c0764m.f8197p = listSingletonList;
                    arrayList.add(new C0765n(c0764m));
                }
                list = arrayList;
            }
            oVar.G(iU2);
        }
        return list;
    }

    public boolean c(int i5) {
        return (i5 & this.f16437a) != 0;
    }

    public f() {
        this.f16437a = 1;
        this.f16438b = Collections.singletonList(null);
    }

    public f(ArrayList arrayList) {
        this.f16437a = 0;
        this.f16438b = arrayList;
    }
}
