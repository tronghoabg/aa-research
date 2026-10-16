package s2;

import N1.D;
import Va.X7;
import java.util.Collections;
import java.util.List;
import l8.AbstractC3409K;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final List f44921a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44922b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44923c;

    /* renamed from: d, reason: collision with root package name */
    public final int f44924d;

    /* renamed from: e, reason: collision with root package name */
    public final int f44925e;

    /* renamed from: f, reason: collision with root package name */
    public final int f44926f;

    /* renamed from: g, reason: collision with root package name */
    public final int f44927g;

    /* renamed from: h, reason: collision with root package name */
    public final int f44928h;

    /* renamed from: i, reason: collision with root package name */
    public final float f44929i;

    /* renamed from: j, reason: collision with root package name */
    public final int f44930j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final X7 f44931l;

    public t(List list, int i5, int i10, int i11, int i12, int i13, int i14, int i15, float f10, int i16, String str, X7 x72) {
        this.f44921a = list;
        this.f44922b = i5;
        this.f44923c = i10;
        this.f44924d = i11;
        this.f44925e = i12;
        this.f44926f = i13;
        this.f44927g = i14;
        this.f44928h = i15;
        this.f44929i = f10;
        this.f44930j = i16;
        this.k = str;
        this.f44931l = x72;
    }

    public static t a(Q1.o oVar, boolean z2, X7 x72) {
        boolean z10;
        R1.i iVarF;
        int i5;
        int i10 = 4;
        try {
            if (z2) {
                oVar.H(4);
            } else {
                oVar.H(21);
            }
            int iU = oVar.u() & 3;
            int iU2 = oVar.u();
            int i11 = oVar.f9703b;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                z10 = true;
                if (i13 >= iU2) {
                    break;
                }
                oVar.H(1);
                int iA = oVar.A();
                for (int i15 = 0; i15 < iA; i15++) {
                    int iA2 = oVar.A();
                    i14 += iA2 + 4;
                    oVar.H(iA2);
                }
                i13++;
            }
            oVar.G(i11);
            byte[] bArr = new byte[i14];
            X7 x73 = x72;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            float f10 = 1.0f;
            String strB = null;
            int i23 = 0;
            int i24 = 0;
            while (i23 < iU2) {
                int iU3 = oVar.u() & 63;
                int iA3 = oVar.A();
                int i25 = i12;
                X7 x7H = x73;
                while (i25 < iA3) {
                    boolean z11 = z10;
                    int iA4 = oVar.A();
                    int i26 = iU;
                    System.arraycopy(R1.n.f10151a, i12, bArr, i24, i10);
                    int i27 = i24 + 4;
                    System.arraycopy(oVar.f9702a, oVar.f9703b, bArr, i27, iA4);
                    if (iU3 == 32 && i25 == 0) {
                        x7H = R1.n.h(i27, i27 + iA4, bArr);
                    } else {
                        if (iU3 == 33 && i25 == 0) {
                            R1.j jVarG = R1.n.g(bArr, i27, i27 + iA4, x7H);
                            i16 = jVarG.f10119b + 8;
                            i17 = jVarG.f10120c + 8;
                            int i28 = jVarG.f10125h;
                            int i29 = jVarG.f10126i;
                            i18 = i28;
                            int i30 = jVarG.f10127j;
                            float f11 = jVarG.f10123f;
                            int i31 = jVarG.f10124g;
                            R1.g gVar = jVarG.f10118a;
                            if (gVar != null) {
                                i5 = i31;
                                strB = Q1.a.b(gVar.f10105a, gVar.f10106b, gVar.f10107c, gVar.f10108d, gVar.f10109e, gVar.f10110f);
                            } else {
                                i5 = i31;
                            }
                            i22 = i5;
                            f10 = f11;
                            i20 = i30;
                            i19 = i29;
                        } else if (iU3 == 39 && i25 == 0 && (iVarF = R1.n.f(i27, i27 + iA4, bArr)) != null && x7H != null) {
                            i12 = 0;
                            i21 = iVarF.f10117b == ((R1.f) ((AbstractC3409K) x7H.f13841a).get(0)).f10104b ? 4 : 5;
                        }
                        i12 = 0;
                    }
                    i24 = i27 + iA4;
                    oVar.H(iA4);
                    i25++;
                    z10 = z11;
                    iU = i26;
                    i10 = 4;
                }
                i23++;
                x73 = x7H;
                i10 = 4;
            }
            return new t(i14 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iU + 1, i16, i17, i18, i19, i20, i21, f10, i22, strB, x73);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw D.a(e7, "Error parsing".concat(z2 ? "L-HEVC config" : "HEVC config"));
        }
    }
}
