package defpackage;

import android.content.ComponentName;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import androidx.car.app.model.Alert;
import com.google.android.apps.auto.components.apphost.view.widgets.common.AlertView;
import com.google.android.gms.car.RadioProgramSelector;
import j$.util.function.Consumer$CC;
import java.io.PrintWriter;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class iju implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ iju(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = 1;
        switch (this.b) {
            case 0:
                yph yphVar = ijv.a;
                xgg xggVarB = xgg.b(((Integer) obj).intValue());
                xggVarB.getClass();
                ((abnp) this.a).I(xggVarB);
                break;
            case 1:
                Alert alert = (Alert) obj;
                alert.getClass();
                ((gdl) ((gsv) this.a).c).d(alert.getId());
                break;
            case 2:
                yph yphVar2 = ijv.a;
                xge xgeVarB = xge.b(((Integer) obj).intValue());
                xgeVarB.getClass();
                ((abnp) this.a).H(xgeVarB);
                break;
            case 3:
                yph yphVar3 = ijv.a;
                xgc xgcVarB = xgc.b(((Integer) obj).intValue());
                xgcVarB.getClass();
                abnp abnpVar = (abnp) this.a;
                abnpVar.t();
                xgj xgjVar = (xgj) abnpVar.b;
                aboe aboeVar = xgj.a;
                abod abodVar = xgjVar.k;
                if (!abodVar.c()) {
                    xgjVar.k = abnv.G(abodVar);
                }
                xgjVar.k.g(xgcVarB.a());
                break;
            case 4:
                yph yphVar4 = ijv.a;
                xgd xgdVarB = xgd.b(((Integer) obj).intValue());
                xgdVarB.getClass();
                abnp abnpVar2 = (abnp) this.a;
                abnpVar2.t();
                xgj xgjVar2 = (xgj) abnpVar2.b;
                aboe aboeVar2 = xgj.a;
                abod abodVar2 = xgjVar2.m;
                if (!abodVar2.c()) {
                    xgjVar2.m = abnv.G(abodVar2);
                }
                xgjVar2.m.g(xgdVarB.a());
                break;
            case 5:
                yph yphVar5 = ijv.a;
                xgf xgfVarB = xgf.b(((Integer) obj).intValue());
                xgfVarB.getClass();
                abnp abnpVar3 = (abnp) this.a;
                abnpVar3.t();
                xgj xgjVar3 = (xgj) abnpVar3.b;
                aboe aboeVar3 = xgj.a;
                abod abodVar3 = xgjVar3.l;
                if (!abodVar3.c()) {
                    xgjVar3.l = abnv.G(abodVar3);
                }
                xgjVar3.l.g(xgfVarB.a());
                break;
            case 6:
                ((yfl) ((rjg) this.a).a).i(ikp.z((xmv) obj));
                break;
            case 7:
                abnp abnpVarA = ikp.A((RadioProgramSelector.RadioProgramIdentifier) obj);
                abnp abnpVar4 = (abnp) this.a;
                abnpVar4.t();
                xmz xmzVar = (xmz) abnpVar4.b;
                xmv xmvVar = (xmv) abnpVarA.q();
                xmz xmzVar2 = xmz.a;
                xmvVar.getClass();
                aboh abohVar = xmzVar.d;
                if (!abohVar.c()) {
                    xmzVar.d = abnv.I(abohVar);
                }
                xmzVar.d.add(xmvVar);
                break;
            case 8:
                yph yphVar6 = iqw.a;
                ((ype) ((ype) irg.a.f()).ai((char) 1239)).u("onUsageAssistantFocusGain");
                irg irgVar = (irg) ((izj) obj).a;
                irgVar.f++;
                irgVar.a((String) this.a);
                break;
            case 9:
                yph yphVar7 = iqw.a;
                ((ype) ((ype) irg.a.f()).ai((char) 1240)).u("onUsageAssistantFocusLoss");
                r5.f--;
                ((irg) ((izj) obj).a).a((String) this.a);
                break;
            case 10:
                jcn jcnVar = jco.a;
                ((jcl) obj).d((PrintWriter) this.a);
                break;
            case 11:
                ((jku) obj).b(new jef((Exception) this.a));
                break;
            case 12:
                ((jku) obj).b(new jed(false, (Exception) this.a));
                break;
            case 13:
                ((jku) obj).b(new jed(true, (Exception) this.a));
                break;
            case 14:
                jku jkuVar = (jku) obj;
                ((ype) jkv.a.l().ai((char) 2268)).u("Handing off to car wifi setup callback to start the connection");
                jkuVar.f.c.post(new jlh(jkuVar, this.a, i, (byte[]) null));
                break;
            case 15:
                ((jox) this.a).c((qup) obj);
                break;
            case 16:
                yph yphVar8 = jsp.a;
                ((geu) obj).o((Configuration) this.a);
                break;
            case 17:
                yph yphVar9 = jsp.a;
                ((geu) obj).o((Configuration) this.a);
                break;
            case 18:
                ((ygp) this.a).c((ComponentName) obj);
                break;
            case 19:
                ((AlertView) this.a).a((Drawable) obj);
                break;
            default:
                ((kch) this.a).d.d(((Alert) obj).getId());
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
