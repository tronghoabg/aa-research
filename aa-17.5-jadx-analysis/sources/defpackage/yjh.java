package defpackage;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes3.dex */
public final class yjh implements yiz {
    private final /* synthetic */ int g;
    public static final yjh f = new yjh(5);
    public static final yjh e = new yjh(4);
    public static final yjh d = new yjh(3);
    public static final yjh c = new yjh(2);
    public static final yjh b = new yjh(1);
    public static final yjh a = new yjh(0);

    public yjh(int i) {
        this.g = i;
    }

    public static final yjj g(Object obj, int i, yjj yjjVar) {
        return yjjVar == null ? new yjj(obj, i) : new yji(obj, i, yjjVar);
    }

    public static final yjg h(Object obj, int i, yjg yjgVar) {
        return yjgVar == null ? new yjg(obj, i) : new yjf(obj, i, yjgVar);
    }

    public static final yjl i(Object obj, int i, yjl yjlVar) {
        return yjlVar == null ? new yjl(obj, i) : new yjk(obj, i, yjlVar);
    }

    public static final yjq j(yjr yjrVar, Object obj, int i, yjq yjqVar) {
        ReferenceQueue referenceQueue = yjrVar.g;
        return yjqVar == null ? new yjq(referenceQueue, obj, i) : new yjp(referenceQueue, obj, i, yjqVar);
    }

    public static final yjt k(yju yjuVar, Object obj, int i, yjt yjtVar) {
        ReferenceQueue referenceQueue = yjuVar.g;
        return yjtVar == null ? new yjt(referenceQueue, obj, i) : new yjs(referenceQueue, obj, i, yjtVar);
    }

    public static final yjw l(yjx yjxVar, Object obj, int i, yjw yjwVar) {
        ReferenceQueue referenceQueue = yjxVar.g;
        return yjwVar == null ? new yjw(referenceQueue, obj, i) : new yjv(referenceQueue, obj, i, yjwVar);
    }

    @Override // defpackage.yiz
    public final /* synthetic */ yiy a(yjc yjcVar, yiy yiyVar, yiy yiyVar2) {
        int i = this.g;
        if (i == 0) {
            yjj yjjVar = (yjj) yiyVar;
            yjj yjjVarG = g(yjjVar.a, yjjVar.b, (yjj) yiyVar2);
            yjjVarG.c = yjjVar.c;
            return yjjVarG;
        }
        if (i == 1) {
            yjg yjgVar = (yjg) yiyVar;
            return h(yjgVar.a, yjgVar.b, (yjg) yiyVar2);
        }
        if (i == 2) {
            yjm yjmVar = (yjm) yjcVar;
            yjl yjlVar = (yjl) yiyVar;
            yjl yjlVar2 = (yjl) yiyVar2;
            if (yjc.m(yjlVar)) {
                return null;
            }
            yjl yjlVarI = i(yjlVar.a, yjlVar.b, yjlVar2);
            yjlVarI.c = yjlVar.c.b(yjmVar.g, yjlVarI);
            return yjlVarI;
        }
        if (i == 3) {
            yjr yjrVar = (yjr) yjcVar;
            yjq yjqVar = (yjq) yiyVar;
            yjq yjqVar2 = (yjq) yiyVar2;
            Object obj = yjqVar.get();
            if (obj == null) {
                return null;
            }
            return j(yjrVar, obj, yjqVar.a, yjqVar2);
        }
        if (i == 4) {
            yju yjuVar = (yju) yjcVar;
            yjt yjtVar = (yjt) yiyVar;
            yjt yjtVar2 = (yjt) yiyVar2;
            Object obj2 = yjtVar.get();
            if (obj2 == null) {
                return null;
            }
            yjt yjtVarK = k(yjuVar, obj2, yjtVar.a, yjtVar2);
            yjtVarK.b = yjtVar.b;
            return yjtVarK;
        }
        yjx yjxVar = (yjx) yjcVar;
        yjw yjwVar = (yjw) yiyVar;
        yjw yjwVar2 = (yjw) yiyVar2;
        Object obj3 = yjwVar.get();
        if (obj3 == null || yjc.m(yjwVar)) {
            return null;
        }
        yjw yjwVarL = l(yjxVar, obj3, yjwVar.a, yjwVar2);
        yjwVarL.b = yjwVar.b.b(yjxVar.h, yjwVarL);
        return yjwVarL;
    }

    @Override // defpackage.yiz
    public final /* synthetic */ yiy b(yjc yjcVar, Object obj, int i, yiy yiyVar) {
        int i2 = this.g;
        if (i2 == 0) {
            return g(obj, i, (yjj) yiyVar);
        }
        if (i2 == 1) {
            return h(obj, i, (yjg) yiyVar);
        }
        if (i2 != 2) {
            return i2 != 3 ? i2 != 4 ? l((yjx) yjcVar, obj, i, (yjw) yiyVar) : k((yju) yjcVar, obj, i, (yjt) yiyVar) : j((yjr) yjcVar, obj, i, (yjq) yiyVar);
        }
        return i(obj, i, (yjl) yiyVar);
    }

    @Override // defpackage.yiz
    public final /* synthetic */ yjc c(ykc ykcVar, int i) {
        int i2 = this.g;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? new yjx(ykcVar, i) : new yju(ykcVar, i) : new yjr(ykcVar, i) : new yjm(ykcVar, i) : new yjc(ykcVar, i, (byte[]) null) : new yjc(ykcVar, i, (char[]) null);
    }

    @Override // defpackage.yiz
    public final yje d() {
        int i = this.g;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? yje.b : yje.b : yje.b : yje.a : yje.a : yje.a;
    }

    @Override // defpackage.yiz
    public final yje e() {
        int i = this.g;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? yje.b : yje.a : yje.a : yje.b : yje.a : yje.a;
    }

    @Override // defpackage.yiz
    public final /* synthetic */ void f(yjc yjcVar, yiy yiyVar, Object obj) {
        int i = this.g;
        if (i == 0) {
            ((yjj) yiyVar).c = obj;
            return;
        }
        if (i == 1) {
            return;
        }
        if (i == 2) {
            yjl yjlVar = (yjl) yiyVar;
            yjz yjzVar = yjlVar.c;
            yjlVar.c = new yka(((yjm) yjcVar).g, obj, yjlVar);
            yjzVar.clear();
            return;
        }
        if (i == 3) {
        } else if (i == 4) {
            ((yjt) yiyVar).b = obj;
        } else {
            yjw yjwVar = (yjw) yiyVar;
            yjz yjzVar2 = yjwVar.b;
            yjwVar.b = new yka(((yjx) yjcVar).h, obj, yjwVar);
            yjzVar2.clear();
        }
    }
}
