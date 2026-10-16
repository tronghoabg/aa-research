package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ikd implements java.util.function.Consumer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ikd(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v36, types: [ipp, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = 2;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.yqm yqmVar = defpackage.ike.a;
                xhh xhhVarB = xhh.b(((java.lang.Integer) obj).intValue());
                xhhVarB.getClass();
                ((defpackage.abor) this.a).I(xhhVarB);
                break;
            case 1:
                androidx.car.app.model.Alert alert = (androidx.car.app.model.Alert) obj;
                alert.getClass();
                ((gdr) ((gtd) this.a).c).d(alert.getId());
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqm yqmVar2 = defpackage.ike.a;
                xhf xhfVarB = xhf.b(((java.lang.Integer) obj).intValue());
                xhfVarB.getClass();
                ((defpackage.abor) this.a).H(xhfVarB);
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.yqm yqmVar3 = defpackage.ike.a;
                xhd xhdVarB = xhd.b(((java.lang.Integer) obj).intValue());
                xhdVarB.getClass();
                defpackage.abor aborVar = (defpackage.abor) this.a;
                aborVar.t();
                xhk xhkVar = aborVar.b;
                defpackage.abpg abpgVar = xhk.a;
                defpackage.abpf abpfVar = xhkVar.k;
                if (!abpfVar.c()) {
                    xhkVar.k = defpackage.abox.G(abpfVar);
                }
                xhkVar.k.g(xhdVarB.a());
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yqm yqmVar4 = defpackage.ike.a;
                xhe xheVarB = xhe.b(((java.lang.Integer) obj).intValue());
                xheVarB.getClass();
                defpackage.abor aborVar2 = (defpackage.abor) this.a;
                aborVar2.t();
                xhk xhkVar2 = aborVar2.b;
                defpackage.abpg abpgVar2 = xhk.a;
                defpackage.abpf abpfVar2 = xhkVar2.m;
                if (!abpfVar2.c()) {
                    xhkVar2.m = defpackage.abox.G(abpfVar2);
                }
                xhkVar2.m.g(xheVarB.a());
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.yqm yqmVar5 = defpackage.ike.a;
                xhg xhgVarB = xhg.b(((java.lang.Integer) obj).intValue());
                xhgVarB.getClass();
                defpackage.abor aborVar3 = (defpackage.abor) this.a;
                aborVar3.t();
                xhk xhkVar3 = aborVar3.b;
                defpackage.abpg abpgVar3 = xhk.a;
                defpackage.abpf abpfVar3 = xhkVar3.l;
                if (!abpfVar3.c()) {
                    xhkVar3.l = defpackage.abox.G(abpfVar3);
                }
                xhkVar3.l.g(xhgVarB.a());
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.ygr) ((defpackage.rkc) this.a).a).i(defpackage.ikz.z((xnw) obj));
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.abor aborVarA = defpackage.ikz.A((com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier) obj);
                defpackage.abor aborVar4 = (defpackage.abor) this.a;
                aborVar4.t();
                xoa xoaVar = aborVar4.b;
                xnw xnwVarQ = aborVarA.q();
                xoa xoaVar2 = xoa.a;
                xnwVarQ.getClass();
                defpackage.abpj abpjVar = xoaVar.d;
                if (!abpjVar.c()) {
                    xoaVar.d = defpackage.abox.I(abpjVar);
                }
                xoaVar.d.add(xnwVarQ);
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                j$.util.Optional optional = ((defpackage.iph) this.a).aj;
                defpackage.ilx ilxVar = new defpackage.ilx((android.view.Surface) obj, i);
                if (true == optional.isPresent()) {
                    optional.get().b((android.view.Surface) ilxVar.a);
                    break;
                }
                break;
            case 9:
                defpackage.yqm yqmVar6 = defpackage.irf.a;
                ((defpackage.yqj) ((defpackage.yqj) defpackage.iro.a.f()).ai((char) 1239)).u("onUsageAssistantFocusGain");
                defpackage.iro iroVar = (defpackage.iro) ((defpackage.izq) obj).a;
                iroVar.f++;
                iroVar.a((java.lang.String) this.a);
                break;
            case 10:
                defpackage.yqm yqmVar7 = defpackage.irf.a;
                ((defpackage.yqj) ((defpackage.yqj) defpackage.iro.a.f()).ai((char) 1240)).u("onUsageAssistantFocusLoss");
                defpackage.iro iroVar2 = (defpackage.iro) ((defpackage.izq) obj).a;
                iroVar2.f--;
                iroVar2.a((java.lang.String) this.a);
                break;
            case 11:
                defpackage.jcu jcuVar = defpackage.jcv.a;
                ((defpackage.jcs) obj).d((java.io.PrintWriter) this.a);
                break;
            case 12:
                ((jlc) obj).b(new jem((java.lang.Exception) this.a));
                break;
            case 13:
                ((jlc) obj).b(new jek(false, (java.lang.Exception) this.a));
                break;
            case 14:
                ((jlc) obj).b(new jek(true, (java.lang.Exception) this.a));
                break;
            case 15:
                jlc jlcVar = (jlc) obj;
                ((defpackage.yqj) jld.a.l().ai((char) 2269)).u("Handing off to car wifi setup callback to start the connection");
                jlcVar.f.c.post(new jlb(jlcVar, this.a, 2, (byte[]) null));
                break;
            case 16:
                ((defpackage.jpf) this.a).c((defpackage.qvl) obj);
                break;
            case 17:
                defpackage.yqm yqmVar8 = jsq.a;
                ((gfa) obj).o((android.content.res.Configuration) this.a);
                break;
            case 18:
                defpackage.yqm yqmVar9 = jsq.a;
                ((gfa) obj).o((android.content.res.Configuration) this.a);
                break;
            case 19:
                ((defpackage.yhv) this.a).c((android.content.ComponentName) obj);
                break;
            default:
                ((com.google.android.apps.auto.components.apphost.view.widgets.common.AlertView) this.a).a((android.graphics.drawable.Drawable) obj);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
