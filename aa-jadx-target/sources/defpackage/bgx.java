package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bgx implements defpackage.affh {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public bgx(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.affh
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.b;
        if (i == 0) {
            long j = ((defpackage.ckd) obj).a;
            defpackage.bve bveVar = (defpackage.bve) obj2;
            int iIntValue = ((java.lang.Number) obj3).intValue();
            int i2 = iIntValue & 17;
            if (bveVar.I(i2 != 16, iIntValue & 1)) {
                defpackage.bgy.a.a((android.graphics.drawable.Drawable) this.a, bveVar, 48);
            } else {
                bveVar.s();
            }
            return defpackage.afbk.a;
        }
        if (i != 1) {
            long j2 = ((defpackage.ckd) obj).a;
            defpackage.bve bveVar2 = (defpackage.bve) obj2;
            int iIntValue2 = ((java.lang.Number) obj3).intValue();
            if (bveVar2.I((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                defpackage.bgy.a.a((android.graphics.drawable.Drawable) this.a, bveVar2, 48);
            } else {
                bveVar2.s();
            }
            return defpackage.afbk.a;
        }
        long j3 = ((defpackage.ckd) obj).a;
        defpackage.bve bveVar3 = (defpackage.bve) obj2;
        int iIntValue3 = ((java.lang.Number) obj3).intValue();
        if ((iIntValue3 & 6) == 0) {
            iIntValue3 |= true != bveVar3.B(j3) ? 2 : 4;
        }
        if (bveVar3.I((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
            defpackage.bgq.b(((defpackage.bfy) this.a).c, j3, bveVar3, (iIntValue3 << 3) & 112);
        } else {
            bveVar3.s();
        }
        return defpackage.afbk.a;
    }
}
