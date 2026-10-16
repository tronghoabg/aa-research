package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.support.v4.app.Fragment;
import androidx.car.app.model.CarIcon;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;

/* loaded from: classes.dex */
public final /* synthetic */ class niu implements nfx {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ niu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v22, types: [eqa, java.lang.Object] */
    @Override // defpackage.nfx
    public final boolean a(nge ngeVar) {
        int i = this.b;
        if (i == 0) {
            return ((niy) this.a).j(ngeVar);
        }
        if (i == 1) {
            Object obj = this.a;
            if (!((Fragment) obj).isAdded()) {
                ((ype) nhr.b.h()).u("Trying to run education after rail detatched");
                return false;
            }
            nhr nhrVar = (nhr) obj;
            if (nhrVar.c != null) {
                nhr.b(ngeVar, yzy.eQ, "another tooltip is already showing", new Object[0]);
                return false;
            }
            if (!(ngeVar instanceof nma)) {
                yzy yzyVar = yzy.eR;
                String simpleName = ngeVar.getClass().getSimpleName();
                simpleName.getClass();
                nhr.b(ngeVar, yzyVar, "unrecognized display type %s", simpleName);
                return false;
            }
            nma nmaVar = (nma) ngeVar;
            nok nokVarC = nhrVar.c(nmaVar.a());
            if (nokVarC == null || ((byw) nokVarC.a).b == 0) {
                nhr.b(ngeVar, yzy.eS, "anchor view %s is null or not shown", nmaVar.a());
                return false;
            }
            khc.t(new wci("GH.CompRailBaseFrag", yzz.RAIL, yzy.eP, "Error building tooltip", new Object[0]), new lxu(obj, ngeVar, nokVarC, 6, (char[]) null));
            return true;
        }
        if (i == 2) {
            return ((niy) this.a).j(ngeVar);
        }
        owj owjVar = null;
        Object[] objArr = 0;
        if (i == 3) {
            if (!(ngeVar instanceof nqn)) {
                return false;
            }
            ?? r12 = this.a;
            nqu.c.l().u("Showing immersive toolbar education");
            nqn nqnVar = (nqn) ngeVar;
            owj owjVar2 = new owj((eqa) r12);
            nqp nqpVar = new nqp();
            owjVar2.b = (noh) khc.t(new wci("IMMERSIVE_TOOLBAR_EDUCATION", yzz.IMMERSIVE_MODE, yzy.LB, "Unable to create immersive toolbar education", new Object[0]), new nlh(owjVar2, nqpVar, 11));
            nqpVar.a.b(new cct(-80858378, true, new mxw(nqpVar, owjVar2, 7, objArr == true ? 1 : 0)));
            if (owjVar2.b != null) {
                ngf.g().i(nqnVar);
                owjVar = owjVar2;
            }
            ((nqu) r12).g = owjVar;
            return true;
        }
        if (!(ngeVar instanceof nvm)) {
            return false;
        }
        Object obj2 = this.a;
        ((ype) ((ype) nvn.a.f()).ai((char) 5467)).u("Showing quick feedback display");
        nvm nvmVar = (nvm) ngeVar;
        int i2 = nvp.a;
        int i3 = nvmVar.b;
        int i4 = nvmVar.c;
        Context context = ((nvn) obj2).b;
        String string = context.getString(i3);
        String string2 = i4 == 0 ? null : context.getString(i4);
        GhIcon ghIcon = nvmVar.d;
        CarIcon carIcon = nvmVar.e;
        yzz yzzVar = nvmVar.f;
        ComponentName componentName = nvmVar.g;
        nvo nvoVar = nvmVar.h;
        aaew aaewVar = new aaew(null);
        aaewVar.b = nvp.a(context, yzzVar, yzy.FQ, componentName, nvoVar);
        aaewVar.e = GhIcon.p(context, 2131233163);
        nul nulVar = new nul(aaewVar);
        aaew aaewVar2 = new aaew(null);
        aaewVar2.b = nvp.a(context, yzzVar, yzy.FP, componentName, nvoVar);
        aaewVar2.e = GhIcon.p(context, 2131233162);
        nul nulVar2 = new nul(aaewVar2);
        num numVar = new num();
        numVar.m = string;
        numVar.d = ghIcon;
        numVar.e = carIcon;
        numVar.a = nup.HIGH;
        numVar.x = nuo.f;
        numVar.j = false;
        numVar.A = nun.b;
        numVar.f = "com.google.android.projection.gearhead";
        numVar.p = nulVar;
        numVar.q = nulVar2;
        if (string2 != null) {
            ntz ntzVarA = nub.a();
            ntzVarA.d = string2;
            ntzVarA.a = ghIcon;
            ntzVarA.b = carIcon;
            ntzVarA.j = "com.google.android.projection.gearhead";
            ntzVarA.f = nulVar;
            ntzVarA.h = nulVar2;
            ntzVarA.g = nua.a;
            ntzVarA.b(System.currentTimeMillis());
            numVar.u = ntzVarA.a();
        }
        nur nurVarB = numVar.b();
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzzVar, yzy.FO);
        rrbVarH.p(componentName);
        ohsVarJ.F(rrbVarH.l());
        nuj nujVarB = nuj.b();
        nvm.a.longValue();
        nujVarB.j("quick_feedback_notification_tag", 759347436L, nurVarB);
        ngf.g().i(ngeVar);
        return true;
    }
}
