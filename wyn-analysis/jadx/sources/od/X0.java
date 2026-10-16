package od;

import ad.C1355I;
import java.io.OutputStream;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class X0 extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f41844a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public pd.t f41845b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z0 f41846c;

    public X0(Z0 z02) {
        this.f41846c = z02;
    }

    @Override // java.io.OutputStream
    public final void write(int i5) {
        pd.t tVar = this.f41845b;
        if (tVar == null || tVar.f43601b <= 0) {
            write(new byte[]{(byte) i5}, 0, 1);
            return;
        }
        tVar.f43600a.X((byte) i5);
        tVar.f43601b--;
        tVar.f43602c++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i5, int i10) {
        pd.t tVar = this.f41845b;
        ArrayList arrayList = this.f41844a;
        Z0 z02 = this.f41846c;
        if (tVar == null) {
            z02.f41863g.getClass();
            pd.t tVarH = C1355I.h(i10);
            this.f41845b = tVarH;
            arrayList.add(tVarH);
        }
        while (i10 > 0) {
            int iMin = Math.min(i10, this.f41845b.f43601b);
            if (iMin == 0) {
                int iMax = Math.max(i10, this.f41845b.f43602c * 2);
                z02.f41863g.getClass();
                pd.t tVarH2 = C1355I.h(iMax);
                this.f41845b = tVarH2;
                arrayList.add(tVarH2);
            } else {
                this.f41845b.a(bArr, i5, iMin);
                i5 += iMin;
                i10 -= iMin;
            }
        }
    }
}
