package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class cct implements afeg, afeh, afei, afej, afek, afel, afem, afen, afds, afdt, afdv, afdw, afdx, afdy, afdz, afea, afeb, afed, afee {
    public final boolean a;
    public Object b;
    public List c;
    public bxf d;
    private final int e;

    public cct(int i, boolean z, Object obj) {
        this.e = i;
        this.a = z;
        this.b = obj;
    }

    private final void h(bux buxVar) {
        bxf bxfVarP;
        if (!this.a || (bxfVarP = ((bvv) buxVar).P()) == null) {
            return;
        }
        bxfVarP.q();
        if (bxc.h(this.d, bxfVarP)) {
            this.d = bxfVarP;
            return;
        }
        List list = this.c;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(bxfVarP);
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (bxc.h((bxf) list.get(i), bxfVarP)) {
                list.set(i, bxfVarP);
                return;
            }
        }
        list.add(bxfVarP);
    }

    public final Object a(bux buxVar, int i) {
        bux buxVarC = buxVar.c(this.e);
        h(buxVarC);
        int i2 = true != buxVarC.C(this) ? 2 : 4;
        Object obj = this.b;
        obj.getClass();
        affz.g(obj, 2);
        Object objInvoke = ((afeg) obj).invoke(buxVarC, Integer.valueOf(i | i2));
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new aqb(this, 2, (char[]) null);
        }
        return objInvoke;
    }

    public final Object b(Object obj, bux buxVar, int i) {
        bux buxVarC = buxVar.c(this.e);
        h(buxVarC);
        int i2 = true != buxVarC.C(this) ? 16 : 32;
        Object obj2 = this.b;
        obj2.getClass();
        affz.g(obj2, 3);
        Object objInvoke = ((afeh) obj2).invoke(obj, buxVarC, Integer.valueOf(i2 | i));
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new dbb(this, obj, i, 1);
        }
        return objInvoke;
    }

    public final Object c(Object obj, Object obj2, bux buxVar, int i) {
        bux buxVarC = buxVar.c(this.e);
        h(buxVarC);
        int i2 = true != buxVarC.C(this) ? 128 : 256;
        Object obj3 = this.b;
        obj3.getClass();
        affz.g(obj3, 4);
        Object objInvoke = ((afei) obj3).invoke(obj, obj2, buxVarC, Integer.valueOf(i2 | i));
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new alu(this, obj, obj2, i, 7, null);
        }
        return objInvoke;
    }

    public final Object d(Object obj, Object obj2, Object obj3, bux buxVar, int i) {
        bux buxVarC = buxVar.c(this.e);
        h(buxVarC);
        int i2 = true != buxVarC.C(this) ? 1024 : 2048;
        Object obj4 = this.b;
        obj4.getClass();
        affz.g(obj4, 5);
        Object objInvoke = ((afej) obj4).invoke(obj, obj2, obj3, buxVarC, Integer.valueOf(i2 | i));
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bhn(this, obj, obj2, obj3, i, 2);
        }
        return objInvoke;
    }

    public final Object e(Object obj, Object obj2, Object obj3, Object obj4, bux buxVar, int i) {
        bux buxVarC = buxVar.c(this.e);
        h(buxVarC);
        int i2 = true != buxVarC.C(this) ? 8192 : 16384;
        Object obj5 = this.b;
        obj5.getClass();
        affz.g(obj5, 6);
        Object objInvoke = ((afek) obj5).invoke(obj, obj2, obj3, obj4, buxVarC, Integer.valueOf(i | i2));
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new agh(this, obj, obj2, obj3, obj4, i, 2);
        }
        return objInvoke;
    }

    public final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, bux buxVar, int i) {
        bux buxVarC = buxVar.c(this.e);
        h(buxVarC);
        int i2 = true != buxVarC.C(this) ? 524288 : 1048576;
        Object obj7 = this.b;
        obj7.getClass();
        affz.g(obj7, 8);
        Object objInvoke = ((afem) obj7).invoke(obj, obj2, obj3, obj4, obj5, obj6, buxVarC, Integer.valueOf(i | i2));
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new ccs(this, obj, obj2, obj3, obj4, obj5, obj6, i, 0);
        }
        return objInvoke;
    }

    public final Object g(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, bux buxVar, final int i) {
        bux buxVarC = buxVar.c(this.e);
        h(buxVarC);
        int i2 = true != buxVarC.C(this) ? 4194304 : 8388608;
        Object obj8 = this.b;
        obj8.getClass();
        affz.g(obj8, 9);
        Object objInvoke = ((afen) obj8).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, buxVarC, Integer.valueOf(i | i2));
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: ccr
                @Override // defpackage.afeg
                public final Object invoke(Object obj9, Object obj10) {
                    bux buxVar2 = (bux) obj9;
                    ((Integer) obj10).intValue();
                    cct cctVar = this.a;
                    Object obj11 = obj;
                    Object obj12 = obj2;
                    Object obj13 = obj3;
                    int i3 = i;
                    int i4 = 306783378 & i3;
                    int i5 = 613566756 & i3;
                    cctVar.g(obj11, obj12, obj13, obj4, obj5, obj6, obj7, buxVar2, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 + i4) & i5) | 1);
                    return afak.a;
                }
            };
        }
        return objInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afem
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return f(obj, obj2, obj3, obj4, obj5, obj6, obj7, ((Number) obj8).intValue());
    }

    @Override // defpackage.afeh
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b(obj, (bux) obj2, ((Number) obj3).intValue());
    }

    @Override // defpackage.afei
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return c(obj, obj2, (bux) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.afej
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return d(obj, obj2, obj3, (bux) obj4, ((Number) obj5).intValue());
    }

    @Override // defpackage.afek
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return e(obj, obj2, obj3, obj4, (bux) obj5, ((Number) obj6).intValue());
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((bux) obj, ((Number) obj2).intValue());
    }

    @Override // defpackage.afen
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return g(obj, obj2, obj3, obj4, obj5, obj6, obj7, (bux) obj8, ((Number) obj9).intValue());
    }
}
