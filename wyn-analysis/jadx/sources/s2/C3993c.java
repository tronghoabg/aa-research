package s2;

import N1.D;
import java.util.ArrayList;

/* renamed from: s2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3993c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f44861a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44862b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44863c;

    /* renamed from: d, reason: collision with root package name */
    public final int f44864d;

    /* renamed from: e, reason: collision with root package name */
    public final int f44865e;

    /* renamed from: f, reason: collision with root package name */
    public final int f44866f;

    /* renamed from: g, reason: collision with root package name */
    public final int f44867g;

    /* renamed from: h, reason: collision with root package name */
    public final int f44868h;

    /* renamed from: i, reason: collision with root package name */
    public final int f44869i;

    /* renamed from: j, reason: collision with root package name */
    public final int f44870j;
    public final float k;

    /* renamed from: l, reason: collision with root package name */
    public final String f44871l;

    public C3993c(ArrayList arrayList, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, String str) {
        this.f44861a = arrayList;
        this.f44862b = i5;
        this.f44863c = i10;
        this.f44864d = i11;
        this.f44865e = i12;
        this.f44866f = i13;
        this.f44867g = i14;
        this.f44868h = i15;
        this.f44869i = i16;
        this.f44870j = i17;
        this.k = f10;
        this.f44871l = str;
    }

    public static C3993c a(Q1.o oVar) {
        String strA;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        int i15;
        int i16;
        try {
            oVar.H(4);
            int iU = (oVar.u() & 3) + 1;
            if (iU == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iU2 = oVar.u() & 31;
            for (int i17 = 0; i17 < iU2; i17++) {
                int iA = oVar.A();
                int i18 = oVar.f9703b;
                oVar.H(iA);
                byte[] bArr = oVar.f9702a;
                byte[] bArr2 = Q1.a.f9659a;
                byte[] bArr3 = new byte[iA + 4];
                System.arraycopy(Q1.a.f9659a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i18, bArr3, 4, iA);
                arrayList.add(bArr3);
            }
            int iU3 = oVar.u();
            for (int i19 = 0; i19 < iU3; i19++) {
                int iA2 = oVar.A();
                int i20 = oVar.f9703b;
                oVar.H(iA2);
                byte[] bArr4 = oVar.f9702a;
                byte[] bArr5 = Q1.a.f9659a;
                byte[] bArr6 = new byte[iA2 + 4];
                System.arraycopy(Q1.a.f9659a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i20, bArr6, 4, iA2);
                arrayList.add(bArr6);
            }
            if (iU2 > 0) {
                R1.m mVarI = R1.n.i(iU, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i21 = mVarI.f10137e;
                int i22 = mVarI.f10138f;
                int i23 = mVarI.f10140h + 8;
                int i24 = mVarI.f10141i + 8;
                int i25 = mVarI.f10147p;
                int i26 = mVarI.f10148q;
                int i27 = mVarI.f10149r;
                int i28 = mVarI.f10150s;
                float f11 = mVarI.f10139g;
                strA = Q1.a.a(mVarI.f10133a, mVarI.f10134b, mVarI.f10135c);
                i12 = i26;
                i13 = i27;
                i14 = i28;
                f10 = f11;
                i10 = i22;
                i11 = i23;
                i15 = i24;
                i16 = i25;
                i5 = i21;
            } else {
                strA = null;
                i5 = -1;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = 16;
                f10 = 1.0f;
                i15 = -1;
                i16 = -1;
            }
            return new C3993c(arrayList, iU, i5, i10, i11, i15, i16, i12, i13, i14, f10, strA);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw D.a(e7, "Error parsing AVC config");
        }
    }
}
