package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class dxp extends afde implements afeg {
    /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(aabf aabfVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = aabfVar;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [dzh, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.c;
        if (i == 0) {
            dxp dxpVar = new dxp((sm) this.b, afckVar, 0, null);
            dxpVar.a = obj;
            return dxpVar;
        }
        if (i == 1) {
            dxp dxpVar2 = new dxp((aabf) this.b, afckVar, 1);
            dxpVar2.a = obj;
            return dxpVar2;
        }
        if (i == 2) {
            dxp dxpVar3 = new dxp((sm) this.b, afckVar, 2);
            dxpVar3.a = obj;
            return dxpVar3;
        }
        if (i == 3) {
            dxp dxpVar4 = new dxp((dzh) this.b, afckVar, 3);
            dxpVar4.a = obj;
            return dxpVar4;
        }
        if (i == 4) {
            dxp dxpVar5 = new dxp((epv) this.b, afckVar, 4);
            dxpVar5.a = obj;
            return dxpVar5;
        }
        Object obj2 = this.b;
        if (i != 5) {
            dxp dxpVar6 = new dxp((gzp) obj2, afckVar, 6);
            dxpVar6.a = obj;
            return dxpVar6;
        }
        dxp dxpVar7 = new dxp((gzf) obj2, afckVar, 5);
        dxpVar7.a = obj;
        return dxpVar7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0149  */
    /* JADX WARN: Type inference failed for: r4v19, types: [dyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21, types: [dzh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23, types: [epz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [dxz, java.lang.Object] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r5) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxp.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            return ((dxp) b((Uri) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 1) {
            return ((dxp) b((dxl) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 2) {
            return ((dxp) b((String) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 3) {
            return ((dxp) b(obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 4) {
            return ((dxp) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 5) {
            return ((dxp) b((hay) obj, (afck) obj2)).hT(afak.a);
        }
        return ((dxp) b((hjq) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(dzh dzhVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = dzhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(epv epvVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = epvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(gzf gzfVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = gzfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(gzp gzpVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = gzpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(sm smVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = smVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(sm smVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.c = i;
        this.b = smVar;
    }
}
