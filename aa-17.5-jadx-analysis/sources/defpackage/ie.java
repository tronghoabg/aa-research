package defpackage;

import android.os.Message;
import android.support.v7.app.AlertController;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import androidx.preference.Preference;
import com.google.android.apps.auto.carservice.frx.phonescreen.PhonescreenFrxActivity;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.MaterialStandardDialpadView;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.StandardDialpadView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ActionButtonView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class ie implements View.OnClickListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ie(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v43, types: [gkt, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message messageObtain = null;
        int i = 0;
        int i2 = 1;
        switch (this.b) {
            case 0:
                ((gl) this.a).f();
                break;
            case 1:
                AlertController alertController = (AlertController) this.a;
                if (view == alertController.i && (message2 = alertController.k) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view != alertController.l || (message = alertController.n) == null) {
                    Button button = alertController.o;
                } else {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                alertController.G.obtainMessage(1, alertController.b).sendToTarget();
                break;
            case 2:
                ((Toolbar) this.a).j();
                break;
            case 3:
                ((Preference) this.a).gO(view);
                break;
            case 4:
                ((gdu) this.a).b();
                break;
            case 5:
                ((ype) ((ype) jmo.g.e()).ai((char) 2359)).u("onClick: exit");
                Object obj = this.a;
                PhonescreenFrxActivity phonescreenFrxActivityK = ((jms) obj).k();
                jmo jmoVar = (jmo) obj;
                wou wouVar = new wou(jmoVar.requireContext(), 0);
                wouVar.B(jmoVar.getString(R.string.car_setup_exit_dialog_title));
                wouVar.x(jmoVar.getString(R.string.frx_common_never), new jmn(obj, phonescreenFrxActivityK, i2));
                wouVar.z(jmoVar.getString(R.string.bt_auth_exit_dialog_later), new jmn(obj, phonescreenFrxActivityK, i));
                wouVar.b().show();
                break;
            case 6:
                yph yphVar = jmr.g;
                ((ype) ((ype) yphVar.e()).ai((char) 2363)).u("onClick: accept");
                Object obj2 = this.a;
                jmr jmrVar = (jmr) obj2;
                if (jmrVar.i()) {
                    ((ype) ((ype) yphVar.e()).ai((char) 2362)).u("acceptWhenUnlocked (delaying action until phone is unlocked)");
                    jmrVar.j.a();
                } else {
                    ((ype) ((ype) yphVar.e()).ai((char) 2361)).u("acceptWhenUnlocked");
                }
                ((ype) ((ype) yphVar.e()).ai((char) 2360)).u("acceptAndContinue");
                jms jmsVar = (jms) obj2;
                jmsVar.j(yzy.bH);
                jmsVar.k().C();
                jmrVar.c();
                break;
            case 7:
                afdr afdrVarC = ((fwi) this.a).c();
                if (afdrVarC != null) {
                    afdrVarC.invoke();
                    break;
                }
                break;
            case 8:
                ((juf) this.a).g(true);
                break;
            case 9:
                ((juf) this.a).g(true);
                break;
            case 10:
                hem hemVarL = ((hlf) this.a).i.l(gsf.class);
                hemVarL.getClass();
                ((gsf) hemVarL).b();
                break;
            case 11:
                ((afdr) ((affv) this.a).a).invoke();
                break;
            case 12:
                ebf.j().F(odn.a().k(yzz.PHONE_DIALPAD, yzy.O).l());
                MaterialStandardDialpadView materialStandardDialpadView = (MaterialStandardDialpadView) this.a;
                if (materialStandardDialpadView.f.length() > 0) {
                    materialStandardDialpadView.f.deleteCharAt(r7.length() - 1);
                    materialStandardDialpadView.h();
                    break;
                }
                break;
            case 13:
                StandardDialpadView standardDialpadView = (StandardDialpadView) this.a;
                if (standardDialpadView.e.length() != 0) {
                    ((ype) StandardDialpadView.a.l().ai(2885)).y("Calling %s", standardDialpadView.e);
                    ohs ohsVarJ = ebf.j();
                    yxy yxyVar = yxy.GEARHEAD;
                    yzz yzzVar = yzz.PHONE_DIALPAD;
                    ohsVarJ.F(rrc.h(yxyVar, yzzVar, yzy.Q).l());
                    if (standardDialpadView.e.toString().equals(null)) {
                        ohsVarJ.o(yzzVar, yzy.Y);
                    }
                    ebf.A().p(standardDialpadView.e.toString());
                    break;
                } else {
                    obs.a().f(standardDialpadView.getContext(), mkn.b, R.string.dial_a_number, 0);
                    break;
                }
            case 14:
                ebf.j().F(odn.a().k(yzz.PHONE_DIALPAD, yzy.O).l());
                StandardDialpadView standardDialpadView2 = (StandardDialpadView) this.a;
                if (standardDialpadView2.e.length() > 0) {
                    standardDialpadView2.e.deleteCharAt(r7.length() - 1);
                    standardDialpadView2.g();
                    break;
                }
                break;
            case 15:
                ohs ohsVarJ2 = ebf.j();
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.CAR_APP_LIBRARY, yzy.sM);
                ?? r6 = this.a;
                rrbVarH.p(((gmh) ((hlf) r6).i.d()).a);
                ohsVarJ2.F(rrbVarH.l());
                kbu kbuVar = (kbu) r6;
                kbuVar.d.removeMessages(1);
                gku gkuVar = kbuVar.a;
                if (!gkuVar.c()) {
                    gkuVar.a(r6);
                    break;
                }
                break;
            case 16:
                ((kcp) this.a).r();
                break;
            case 17:
                ((kcu) this.a).r();
                break;
            case 18:
                int i3 = ActionButtonView.a;
                ((fvv) this.a).f.invoke();
                break;
            case 19:
                ((geu) this.a).g().a();
                break;
            default:
                ((geu) this.a).g().a();
                break;
        }
    }

    public /* synthetic */ ie(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
