package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class bgt implements afeh {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bgt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.afeh
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        if (i == 0) {
            long j = ((cjv) obj).a;
            bux buxVar = (bux) obj2;
            int iIntValue = ((Number) obj3).intValue();
            int i2 = iIntValue & 17;
            if (buxVar.I(i2 != 16, iIntValue & 1)) {
                bgu.a.a((Drawable) this.a, buxVar, 48);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        if (i != 1) {
            long j2 = ((cjv) obj).a;
            bux buxVar2 = (bux) obj2;
            int iIntValue2 = ((Number) obj3).intValue();
            if (buxVar2.I((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                bgu.a.a((Drawable) this.a, buxVar2, 48);
            } else {
                buxVar2.s();
            }
            return afak.a;
        }
        long j3 = ((cjv) obj).a;
        bux buxVar3 = (bux) obj2;
        int iIntValue3 = ((Number) obj3).intValue();
        if ((iIntValue3 & 6) == 0) {
            iIntValue3 |= true != buxVar3.B(j3) ? 2 : 4;
        }
        if (buxVar3.I((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
            bgm.b(((bfv) this.a).c, j3, buxVar3, (iIntValue3 << 3) & 112);
        } else {
            buxVar3.s();
        }
        return afak.a;
    }
}
