package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class twd implements tyf {
    float a = Float.MAX_VALUE;
    float b = Float.MAX_VALUE;
    float c = -3.4028235E38f;
    float d = BitmapDescriptorFactory.HUE_RED;
    final /* synthetic */ twf e;

    public twd(twf twfVar) {
        this.e = twfVar;
    }

    @Override // defpackage.tyf
    public final float a() {
        return this.d;
    }

    @Override // defpackage.tyf
    public final too b() {
        return new too(Math.round(this.a), Math.round(this.b));
    }

    @Override // defpackage.tyf
    public final uws c(List list, boolean z, float[] fArr, float[] fArr2, float[] fArr3, float f, urw urwVar, ugl uglVar, usm usmVar) {
        uhn uhnVar;
        float f2 = this.a;
        float f3 = this.b;
        twf twfVar = this.e;
        float f4 = twfVar.r;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uho uhoVar = (uho) it.next();
            List<uhp> list2 = uhoVar.b;
            boolean z2 = false;
            uhn uhnVarA = uhq.a(uglVar, ((uhp) list2.get(0)).j[0], f4, uhoVar.c, uhoVar.d);
            abdd abddVar = uhoVar.a;
            abnh abnhVar = abhx.h;
            abddVar.j(abnhVar);
            Object objJ = abddVar.w.j(abnhVar.d);
            float fFloatValue = ((Float) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).floatValue();
            for (uhp uhpVar : list2) {
                float[] fArr4 = uhpVar.c;
                int[] iArr = uhpVar.a;
                int[] iArr2 = uhpVar.i;
                ukf[] ukfVarArr = uhpVar.j;
                int i = uhnVarA.a;
                int i2 = uhnVarA.b;
                boolean z3 = z2;
                int i3 = uhoVar.e;
                Iterator it2 = it;
                int length = fArr4.length;
                if (length == 0 || ukfVarArr[z3 ? 1 : 0] == null) {
                    z2 = z3 ? 1 : 0;
                    it = it2;
                } else {
                    float f5 = f2;
                    float[] fArrD = uhq.d(iArr2, ukfVarArr, f4, twfVar.k);
                    if (z) {
                        uhnVar = uhnVarA;
                        f2 = f5;
                        use.e(fArr4, f2, f3, iArr, fArr, fArr2, fArr3, f, fFloatValue, usmVar);
                    } else {
                        uhnVar = uhnVarA;
                        f2 = f5;
                        int i4 = use.a;
                        use.g(new urx(fArr4, length, f2, f3), fArrD, i, i2, i3, 0, iArr2, null, iArr, false, fFloatValue, usmVar);
                        usmVar.i();
                    }
                    z2 = z3 ? 1 : 0;
                    it = it2;
                    uhnVarA = uhnVar;
                }
            }
        }
        return uhq.b(usmVar, z);
    }

    @Override // defpackage.tyf
    public final void d(uho uhoVar) {
        float[] fArr;
        Iterator it = uhoVar.b.iterator();
        while (it.hasNext()) {
            float[] fArr2 = ((uhp) it.next()).c;
            int length = fArr2.length;
            if (length == 0 || (length & 1) != 0) {
                fArr = new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
            } else {
                float fMin = Float.MAX_VALUE;
                float fMax = -3.4028235E38f;
                float fMin2 = Float.MAX_VALUE;
                for (int i = 0; i < fArr2.length; i += 2) {
                    fMin = Math.min(fArr2[i], fMin);
                    fMax = Math.max(fArr2[i], fMax);
                    fMin2 = Math.min(fArr2[i + 1], fMin2);
                }
                fArr = new float[]{fMin, fMax, fMin2};
            }
            this.a = Math.min(fArr[0], this.a);
            this.c = Math.max(fArr[1], this.c);
            this.b = Math.min(fArr[2], this.b);
            this.d = this.c - this.a;
        }
    }
}
