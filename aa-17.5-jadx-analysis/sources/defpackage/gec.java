package defpackage;

import android.util.Log;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.MaterialStandardDialpadView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.RowView;
import com.google.android.apps.auto.components.calendar.calling.CalendarEventPhoneNumber;
import com.google.android.apps.auto.components.telecom.PhoneCall;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class gec implements us {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gec(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, jtf] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v46, types: [java.lang.Object, us] */
    /* JADX WARN: Type inference failed for: r6v6, types: [afdr, java.lang.Object] */
    @Override // defpackage.us
    public final void onClick() {
        switch (this.b) {
            case 0:
                this.a.run();
                break;
            case 1:
                Log.i("GH.AJTelemetry", "onKeyboardOpen");
                fux fuxVar = (fux) ((ieb) this.a).b;
                fuxVar.a = gml.b;
                fuxVar.a();
                break;
            case 2:
                this.a.invoke();
                break;
            case 3:
                ((gex) this.a).c.invoke();
                break;
            case 4:
                ((geu) this.a).g().a();
                break;
            case 5:
                this.a.run();
                break;
            case 6:
                kex kexVar = (kex) this.a;
                kexVar.a.d();
                gml gmlVar = gml.b;
                jst jstVar = (jst) kexVar.c;
                jstVar.b = gmlVar;
                jstVar.a();
                break;
            case 7:
                ((juf) this.a).g(true);
                break;
            case 8:
                ((juf) this.a).g(true);
                break;
            case 9:
                MaterialStandardDialpadView materialStandardDialpadView = (MaterialStandardDialpadView) this.a;
                if (materialStandardDialpadView.f.length() != 0) {
                    ((ype) MaterialStandardDialpadView.a.l().ai(2870)).y("Calling %s", materialStandardDialpadView.f);
                    ohs ohsVarJ = ebf.j();
                    yxy yxyVar = yxy.GEARHEAD;
                    yzz yzzVar = yzz.PHONE_DIALPAD;
                    ohsVarJ.F(rrc.h(yxyVar, yzzVar, yzy.Q).l());
                    if (materialStandardDialpadView.f.toString().equals(null)) {
                        ohsVarJ.o(yzzVar, yzy.Y);
                    }
                    ebf.A().p(materialStandardDialpadView.f.toString());
                    break;
                } else {
                    obs.a().f(materialStandardDialpadView.getContext(), mkn.b, R.string.dial_a_number, 0);
                    break;
                }
            case 10:
                ype ypeVar = (ype) MaterialStandardDialpadView.a.l().ai(2869);
                ?? r6 = this.a;
                ypeVar.w("Closing call %d", ((PhoneCall) r6.get(0)).a);
                ebf.j().F(odn.a().i(((PhoneCall) r6.get(0)).a, yzz.PHONE_DIALPAD, yzy.I).l());
                ebf.A().y(((PhoneCall) r6.get(0)).a);
                break;
            case 11:
                ((kcp) this.a).r();
                break;
            case 12:
                ((kcu) this.a).r();
                break;
            case 13:
                yph yphVar = MaterialRowView.a;
                ((ohe) this.a).h(!r6.i());
                break;
            case 14:
                yph yphVar2 = MaterialRowView.a;
                ((ogz) this.a).b(!r6.c());
                break;
            case 15:
                yph yphVar3 = RowView.a;
                ((ogz) this.a).b(!r6.c());
                break;
            case 16:
                yph yphVar4 = RowView.a;
                ((ohe) this.a).h(!r6.i());
                break;
            case 17:
                qw qwVar = (qw) this.a;
                qx qxVarG = qwVar.g();
                qn qnVar = qwVar.a;
                qnVar.getClass();
                qxVarG.f(new kgm(qnVar));
                break;
            case 18:
                int i = kgn.h;
                this.a.onClick();
                break;
            case 19:
                kgo.c();
                kgn kgnVar = (kgn) this.a;
                kgo.a(kgnVar.f, yzz.CALENDAR_DISAMBIGUATE_ACTION_VIEW, kgnVar.g);
                break;
            default:
                int i2 = kgn.h;
                kgo.c();
                kgo.b((CalendarEventPhoneNumber) this.a, yzz.CALENDAR_DISAMBIGUATE_ACTION_VIEW, "android.intent.action.CALL");
                break;
        }
    }
}
