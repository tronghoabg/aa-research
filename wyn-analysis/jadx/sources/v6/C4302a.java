package v6;

import E5.o0;
import java.util.ArrayList;
import u6.AbstractC4256a;

/* renamed from: v6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4302a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f46834a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46835b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46836c;

    /* renamed from: d, reason: collision with root package name */
    public final int f46837d;

    /* renamed from: e, reason: collision with root package name */
    public final float f46838e;

    /* renamed from: f, reason: collision with root package name */
    public final String f46839f;

    public C4302a(ArrayList arrayList, int i5, int i10, int i11, float f10, String str) {
        this.f46834a = arrayList;
        this.f46835b = i5;
        this.f46836c = i10;
        this.f46837d = i11;
        this.f46838e = f10;
        this.f46839f = str;
    }

    public static C4302a a(Y4.b bVar) throws o0 {
        byte[] bArr;
        float f10;
        String str;
        int i5;
        int i10;
        try {
            bVar.B(4);
            int iQ = (bVar.q() & 3) + 1;
            if (iQ == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iQ2 = bVar.q() & 31;
            int i11 = 0;
            while (true) {
                bArr = AbstractC4256a.f46659a;
                if (i11 >= iQ2) {
                    break;
                }
                int iV = bVar.v();
                int i12 = bVar.f16680b;
                bVar.B(iV);
                byte[] bArr2 = bVar.f16679a;
                byte[] bArr3 = new byte[iV + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i12, bArr3, 4, iV);
                arrayList.add(bArr3);
                i11++;
            }
            int iQ3 = bVar.q();
            for (int i13 = 0; i13 < iQ3; i13++) {
                int iV2 = bVar.v();
                int i14 = bVar.f16680b;
                bVar.B(iV2);
                byte[] bArr4 = bVar.f16679a;
                byte[] bArr5 = new byte[iV2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i14, bArr5, 4, iV2);
                arrayList.add(bArr5);
            }
            if (iQ2 > 0) {
                u6.n nVarA = AbstractC4256a.A(iQ, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i15 = nVarA.f46697e;
                int i16 = nVarA.f46698f;
                f10 = nVarA.f46699g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(nVarA.f46693a), Integer.valueOf(nVarA.f46694b), Integer.valueOf(nVarA.f46695c));
                i5 = i15;
                i10 = i16;
            } else {
                f10 = 1.0f;
                str = null;
                i5 = -1;
                i10 = -1;
            }
            return new C4302a(arrayList, iQ, i5, i10, f10, str);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw o0.a("Error parsing AVC config", e7);
        }
    }
}
