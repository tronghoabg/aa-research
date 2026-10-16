package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class coi implements afeg {
    private final /* synthetic */ int a;

    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((cnh) obj).m(((Float) obj2).floatValue());
                break;
            case 1:
                ((cnh) obj).i(((Float) obj2).floatValue());
                break;
            case 2:
                ((cnh) obj).k(((ckz) obj2).a);
                break;
            case 3:
                ((cnd) obj).i((String) obj2);
                break;
            case 4:
                ((cnd) obj).l(((Float) obj2).floatValue());
                break;
            case 5:
                ((cnd) obj).j(((Float) obj2).floatValue());
                break;
            case 6:
                ((cnd) obj).k(((Float) obj2).floatValue());
                break;
            case 7:
                ((cnd) obj).m(((Float) obj2).floatValue());
                break;
            case 8:
                ((cnd) obj).n(((Float) obj2).floatValue());
                break;
            case 9:
                ((cnd) obj).o(((Float) obj2).floatValue());
                break;
            case 10:
                ((cnd) obj).p(((Float) obj2).floatValue());
                break;
            case 11:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                ddr ddrVar = ((ddu) obj).b;
                afeg afegVar = ded.a;
                deb debVar = ddx.u;
                break;
            case 15:
                dms dmsVarA = dmj.a((cxb) obj);
                dmsVarA.y = (afec) obj2;
                dmsVarA.d = new cxm(dmsVarA, 11);
                dmsVarA.e = true;
                dmsVarA.q.invoke();
                break;
            case 16:
                dms dmsVarA2 = dmj.a((cxb) obj);
                dmsVarA2.z = (afec) obj2;
                dmsVarA2.f = new cxm(dmsVarA2, 10);
                break;
            case 17:
                cfy cfyVar = (cfy) obj2;
                dms dmsVarA3 = dmj.a((cxb) obj);
                if (cfyVar != dmsVarA3.g) {
                    dmsVarA3.g = cfyVar;
                    afec afecVar = dmsVarA3.h;
                    if (afecVar != null) {
                        afecVar.invoke(cfyVar);
                    }
                }
                break;
            case 18:
                dlg dlgVar = (dlg) obj2;
                dms dmsVarA4 = dmj.a((cxb) obj);
                if (dlgVar != dmsVarA4.i) {
                    dmsVarA4.i = dlgVar;
                    afec afecVar2 = dmsVarA4.j;
                    if (afecVar2 != null) {
                        afecVar2.invoke(dlgVar);
                    }
                }
                break;
            case 19:
                eqa eqaVar = (eqa) obj2;
                dms dmsVarA5 = dmj.a((cxb) obj);
                if (eqaVar != dmsVarA5.k) {
                    dmsVarA5.k = eqaVar;
                    ecw.e(dmsVarA5, eqaVar);
                }
                break;
            default:
                fbg fbgVar = (fbg) obj2;
                dms dmsVarA6 = dmj.a((cxb) obj);
                if (fbgVar != dmsVarA6.l) {
                    dmsVarA6.l = fbgVar;
                    ebi.k(dmsVarA6, fbgVar);
                }
                break;
        }
        return afak.a;
    }
}
