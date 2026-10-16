package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bwy implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ bwy(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) throws java.lang.Throwable {
        switch (this.a) {
            case 0:
                defpackage.afer aferVar = ((defpackage.bwz) obj).a;
                if (aferVar != null) {
                    aferVar.invoke();
                }
                return defpackage.afbk.a;
            case 1:
                java.lang.Object obj2 = ((defpackage.kwv) defpackage.dai.az((defpackage.cdd) obj, defpackage.bwi.a)).a;
                while (obj2 != null) {
                    android.view.View view = (android.view.View) obj2;
                    java.lang.Object tag = view.getTag(com.google.android.projection.gearhead.R.id.view_tree_view_model_store_owner);
                    if (tag != null) {
                        return tag;
                    }
                    java.lang.Object objB = defpackage.edd.b(view);
                    obj2 = objB instanceof android.view.View ? (android.view.View) objB : null;
                }
                return null;
            case 2:
                return java.lang.Boolean.valueOf(((java.util.Map) obj).isEmpty());
            case 3:
                return new defpackage.cdu((java.util.Map) obj);
            case 4:
                return obj;
            case 5:
                synchronized (defpackage.cer.b) {
                    java.util.List list = defpackage.cer.g;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((defpackage.affc) list.get(i)).invoke(obj);
                    }
                }
                return defpackage.afbk.a;
            case 6:
                defpackage.affc affcVar = defpackage.cer.a;
                return defpackage.afbk.a;
            case 7:
                return java.lang.Boolean.valueOf(!(((defpackage.cgd) obj) instanceof defpackage.cgb));
            case 8:
                int i2 = defpackage.cmq.x;
                return defpackage.afbk.a;
            case 9:
                return defpackage.afbk.a;
            case 10:
                defpackage.cxl cxlVar = (defpackage.cxl) obj;
                defpackage.cxl cxlVar2 = cxlVar instanceof defpackage.cxl ? cxlVar : null;
                if (cxlVar2 != null && cxlVar2.D) {
                    java.util.Objects.toString(cxlVar);
                    defpackage.csc.c("Apply is called on deactivated node ".concat(java.lang.String.valueOf(cxlVar)));
                }
                return defpackage.afbk.a;
            case 11:
                defpackage.cyz cyzVar = (defpackage.cyz) obj;
                if (cyzVar.w()) {
                    defpackage.cxu cxuVar = cyzVar.b;
                    if (!cxuVar.m) {
                        defpackage.affc affcVarG = cyzVar.a.g();
                        cyzVar.a.i();
                        if (affcVarG == null) {
                            cxuVar.j = null;
                            cxuVar.i = null;
                            cxuVar.T();
                        } else {
                            cxuVar.j = null;
                            cxuVar.Q(cyzVar, 9223372034707292159L, 0L);
                            cxuVar.i = affcVarG;
                        }
                    }
                }
                return defpackage.afbk.a;
            case 12:
                ((defpackage.cwf) obj).i().d = false;
                return defpackage.afbk.a;
            case 13:
                defpackage.cwf cwfVar = (defpackage.cwf) obj;
                cwfVar.i().e = cwfVar.i().d;
                return defpackage.afbk.a;
            case 14:
                ((defpackage.cwf) obj).i().c = false;
                return defpackage.afbk.a;
            case 15:
                defpackage.cyl cylVar = (defpackage.cyl) obj;
                defpackage.cxl cxlVar3 = cylVar.t;
                try {
                    if (cylVar.w()) {
                        cylVar.ax(true);
                        break;
                    }
                    return defpackage.afbk.a;
                } catch (java.lang.Throwable th) {
                    cxlVar3.as(th);
                    throw new defpackage.afap();
                }
            case 16:
                defpackage.affc affcVar2 = defpackage.cyl.p;
                defpackage.cys cysVar = ((defpackage.cyl) obj).I;
                if (cysVar != null) {
                    cysVar.invalidate();
                }
                return defpackage.afbk.a;
            case 17:
                defpackage.cyq cyqVar = (defpackage.cyq) obj;
                if (cyqVar.w()) {
                    cyqVar.b.r();
                }
                return defpackage.afbk.a;
            case 18:
                defpackage.cxl cxlVar4 = (defpackage.cxl) obj;
                if (cxlVar4.am()) {
                    cxlVar4.V(false, true, true);
                }
                return defpackage.afbk.a;
            case 19:
                defpackage.cxl cxlVar5 = (defpackage.cxl) obj;
                if (cxlVar5.am()) {
                    cxlVar5.X(false, true, true);
                }
                return defpackage.afbk.a;
            default:
                defpackage.cxl cxlVar6 = (defpackage.cxl) obj;
                if (cxlVar6.am()) {
                    cxlVar6.J();
                }
                return defpackage.afbk.a;
        }
    }
}
