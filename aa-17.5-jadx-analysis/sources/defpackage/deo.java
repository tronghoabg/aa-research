package defpackage;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final /* synthetic */ class deo implements afei {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ deo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [afeh, java.lang.Object] */
    @Override // defpackage.afei
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        if (this.b != 0) {
            bii biiVar = (bii) obj;
            ((Integer) obj2).intValue();
            bux buxVar = (bux) obj3;
            int iIntValue = ((Integer) obj4).intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= true != buxVar.C(biiVar) ? 2 : 4;
            }
            if (buxVar.I((iIntValue & 131) != 130, iIntValue & 1)) {
                this.a.invoke(biiVar, buxVar, Integer.valueOf(iIntValue & 14));
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        int i = ((dhx) obj3).a;
        int i2 = ((dhy) obj4).a;
        dep depVar = (dep) this.a;
        bym bymVarF = depVar.f.f((dhs) obj, (die) obj2, i, i2);
        if (bymVarF instanceof dim) {
            Object obj5 = ((dim) bymVarF).a;
            obj5.getClass();
            return (Typeface) obj5;
        }
        nfh nfhVar = new nfh(bymVarF, depVar.g);
        depVar.g = nfhVar;
        Object obj6 = nfhVar.c;
        obj6.getClass();
        return (Typeface) obj6;
    }
}
