package defpackage;

import android.app.Activity;
import android.support.v4.app.Fragment;
import androidx.preference.Preference;
import com.google.android.projection.gearhead.R;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final /* synthetic */ class xaw implements exl {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ xaw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.exl
    public final boolean a(Preference preference, Object obj) {
        switch (this.b) {
            case 0:
                jez jezVarA = jez.a((String) obj);
                ((ype) xaz.c.l().ai((char) 10009)).M("onPreferenceChanged(%s): %s", obj, jezVarA);
                xaz xazVar = (xaz) this.a;
                nrc.b().c(jezVarA, yzz.SETTINGS_COMMON, xazVar.d);
                ((xbo) xazVar.b.a).y(R.string.settings_takes_effect_on_restart);
                return true;
            case 1:
                nfp nfpVarA = nfp.a((String) obj);
                ((ype) xau.c.l().ai((char) 10006)).M("onPreferenceChanged(%s): %s", obj, nfpVarA);
                nfo.b().c(nfpVarA, yzz.SETTINGS_COMMON, ((xau) this.a).d);
                return true;
            case 2:
                final boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ((xbo) this.a).u(new xbn() { // from class: xbc
                    @Override // defpackage.xbn
                    public final void a(Activity activity) {
                        yph yphVar = xbo.f;
                        Executor executor = mki.a.d;
                        abnp abnpVarN = okx.a.n();
                        abnpVarN.t();
                        okx okxVar = (okx) abnpVarN.b;
                        okxVar.b |= 2;
                        okxVar.d = zBooleanValue;
                        okx okxVar2 = (okx) abnpVarN.q();
                        ypf ypfVar = rxf.a;
                        executor.execute(new rpo(activity, okxVar2, 7, null));
                    }
                });
                return true;
            case 3:
                omc.a().l(((Fragment) this.a).getActivity(), ((Boolean) obj).booleanValue());
                return true;
            case 4:
                kgq.d(new mjc(this.a, obj, 8, null), "GH.CarPreference", yzz.SETTINGS_COMMON, yzy.sK, "Cannot access car", new Object[0]);
                return true;
            case 5:
                mpl.f().a().b("key_settings_gemini_share_precise_location", ((Boolean) obj).booleanValue());
                ((xas) this.a).p(yzy.ew);
                return true;
            case 6:
                Boolean bool = (Boolean) obj;
                lws.d().e(bool.booleanValue());
                if (Boolean.TRUE.equals(obj)) {
                    ((xas) this.a).p(yzy.jo);
                }
                return !bool.booleanValue();
            default:
                if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
                    mpl.f().a().b("key_settings_messaging_allow_notification_data_sharing_agsa", true);
                    ((xbo) this.a).t();
                    return true;
                }
                Object obj2 = this.a;
                wou wouVar = new wou(((Fragment) obj2).getActivity(), 0);
                wouVar.A(R.string.permissions_settings_assistant_notifications_alert_dialog_title);
                wouVar.u(R.string.permissions_settings_assistant_notifications_alert_dialog_body);
                wouVar.s(true);
                wouVar.y(R.string.permissions_settings_assistant_notifications_alert_dialog_turn_off, new mhb(this, 11));
                wouVar.w(R.string.permissions_settings_assistant_notifications_alert_dialog_cancel, new xan(2));
                xbo xboVar = (xbo) obj2;
                xboVar.o = wouVar.b();
                xboVar.o.show();
                return false;
        }
    }

    public xaw(xbo xboVar, int i, boolean[] zArr) {
        this.b = i;
        this.a = xboVar;
    }
}
