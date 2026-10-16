package v6;

import E5.o0;
import java.util.Collections;
import java.util.List;
import u6.AbstractC4256a;

/* renamed from: v6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4304c {

    /* renamed from: a, reason: collision with root package name */
    public final List f46845a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46846b;

    /* renamed from: c, reason: collision with root package name */
    public final float f46847c;

    /* renamed from: d, reason: collision with root package name */
    public final String f46848d;

    public C4304c(List list, int i5, float f10, String str) {
        this.f46845a = list;
        this.f46846b = i5;
        this.f46847c = f10;
        this.f46848d = str;
    }

    public static C4304c a(Y4.b bVar) throws o0 {
        boolean z2;
        int i5;
        try {
            bVar.B(21);
            int iQ = bVar.q() & 3;
            int iQ2 = bVar.q();
            int i10 = bVar.f16680b;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                z2 = true;
                if (i12 >= iQ2) {
                    break;
                }
                bVar.B(1);
                int iV = bVar.v();
                for (int i14 = 0; i14 < iV; i14++) {
                    int iV2 = bVar.v();
                    i13 += iV2 + 4;
                    bVar.B(iV2);
                }
                i12++;
            }
            bVar.A(i10);
            byte[] bArr = new byte[i13];
            float f10 = 1.0f;
            String strC = null;
            int i15 = 0;
            int i16 = 0;
            while (i15 < iQ2) {
                int iQ3 = bVar.q() & 63;
                int iV3 = bVar.v();
                int i17 = i11;
                while (i17 < iV3) {
                    int iV4 = bVar.v();
                    boolean z10 = z2;
                    System.arraycopy(AbstractC4256a.f46662d, i11, bArr, i16, 4);
                    int i18 = i16 + 4;
                    System.arraycopy(bVar.f16679a, bVar.f16680b, bArr, i18, iV4);
                    if (iQ3 == 33 && i17 == 0) {
                        u6.l lVarZ = AbstractC4256a.z(i18, i18 + iV4, bArr);
                        float f11 = lVarZ.f46690g;
                        i5 = iQ;
                        strC = AbstractC4256a.c(lVarZ.f46684a, lVarZ.f46685b, lVarZ.f46686c, lVarZ.f46687d, lVarZ.f46688e, lVarZ.f46689f);
                        f10 = f11;
                    } else {
                        i5 = iQ;
                    }
                    i16 = i18 + iV4;
                    bVar.B(iV4);
                    i17++;
                    z2 = z10;
                    iQ = i5;
                    i11 = 0;
                }
                i15++;
                i11 = 0;
            }
            return new C4304c(i13 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iQ + 1, f10, strC);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw o0.a("Error parsing HEVC config", e7);
        }
    }
}
