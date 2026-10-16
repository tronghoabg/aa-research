package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final /* synthetic */ class gtv implements afeg {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ gtv(sx sxVar, boolean z, boolean z2, int i) {
        this.d = i;
        this.c = sxVar;
        this.a = z;
        this.b = z2;
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.d == 0) {
            bux buxVar = (bux) obj;
            int iIntValue = ((Integer) obj2).intValue();
            int i = iIntValue & 3;
            if (buxVar.I(i != 2, iIntValue & 1)) {
                Object obj3 = this.c;
                boolean z = this.b;
                gmt.a(this.a, bxc.i(858177066, true, new bol(obj3, 14), buxVar), buxVar, 48);
                gmt.a(z, bxc.i(367366035, true, new bol(obj3, 15), buxVar), buxVar, 48);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        final dlq dlqVar = (dlq) obj;
        final boolean z2 = this.a;
        final boolean z3 = this.b;
        afec afecVar = new afec() { // from class: bqq
            @Override // defpackage.afec
            public final Object invoke(Object obj4) {
                long j = dlqVar.a >> 32;
                cyi cyiVar = (cyi) obj4;
                cyiVar.d(bqr.c, BitmapDescriptorFactory.HUE_RED);
                float f = (int) j;
                if (z2) {
                    cyiVar.d(bqr.a, f);
                }
                if (z3) {
                    cyiVar.d(bqr.b, -f);
                }
                return afak.a;
            }
        };
        cyi cyiVar = new cyi((byte[]) null);
        afecVar.invoke(cyiVar);
        ?? r6 = cyiVar.a;
        Object obj4 = cyiVar.b;
        int size = r6.size();
        obj4.getClass();
        float[] fArr = (float[]) obj4;
        woy.cB(size, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
        fArrCopyOfRange.getClass();
        anf anfVar = new anf(r6, fArrCopyOfRange);
        sx sxVar = (sx) this.c;
        int i2 = ((amv) sxVar.a).n().b;
        bqr bqrVarG = sxVar.g();
        bqr bqrVarI = sxVar.i();
        if (i2 > 0 || !anfVar.d(bqrVarG)) {
            bqrVarG = !anfVar.d(bqrVarI) ? bqr.c : bqrVarI;
        }
        return new aezu(anfVar, bqrVarG);
    }

    public /* synthetic */ gtv(boolean z, boolean z2, gtw gtwVar, int i) {
        this.d = i;
        this.a = z;
        this.b = z2;
        this.c = gtwVar;
    }
}
