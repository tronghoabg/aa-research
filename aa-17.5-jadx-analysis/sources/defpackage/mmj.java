package defpackage;

import android.content.ComponentName;
import com.google.android.apps.auto.components.settings.ui.CarSettingsService;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class mmj implements wd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mmj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.wd
    public final void a(boolean z) {
        switch (this.b) {
            case 0:
                ((mmm) this.a).f = false;
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, yzy.dB).l());
                mpl.f().a().a("key_settings_always_autoplay_media_3", z);
                break;
            case 1:
                ((mmm) this.a).f = true;
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, yzy.dS).l());
                mpl.f().a().a("key_settings_show_rail_widget", z);
                nso nsoVarB = nsr.c().b();
                if (nsoVarB.I() && nsoVarB.F() == z) {
                    nso nsoVarB2 = nsr.c().b();
                    kio.b().e();
                    nsoVarB2.O();
                    break;
                }
                break;
            case 2:
                ((mmm) this.a).l(z);
                break;
            case 3:
                Object obj = this.a;
                if (affa.f(((mmm) obj).g.h().e(), true)) {
                    qn qnVar = ((qw) obj).a;
                    obs.a().f(qnVar, new ComponentName(qnVar, (Class<?>) CarSettingsService.class), R.string.settings_barge_in_change_warning, 1);
                }
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, yzy.ev).l());
                mpl.f().a().b("key_settings_gemini_barge_in", z);
                break;
            case 4:
                ((mmm) this.a).f = true;
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, yzy.cs).l());
                mpl.f().a().a("key_settings_messaging_notifications_enabled", z);
                break;
            case 5:
                Object obj2 = this.a;
                lyp lypVarD = lws.d();
                ((mmm) obj2).f = false;
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, yzy.cy).l());
                lypVarD.e(z);
                break;
            case 6:
                ((ype) CarSettingsService.c.f()).y("#setAutoPlayMessages: %b", Boolean.valueOf(z));
                ((mmm) this.a).f = false;
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, z ? yzy.cB : yzy.cC).l());
                mpl.f().a().a("key_settings_autoplay_messages", z);
                break;
            case 7:
                ((mmm) this.a).f = false;
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, yzy.cL).l());
                mpl.f().a().a("key_settings_notification_chime_enabled", z);
                break;
            case 8:
                ((mmm) this.a).f = false;
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, yzy.cI).l());
                mpl.f().a().a("key_settings_show_message_summarization", z);
                break;
            case 9:
                mms.a(yzy.dX, yzy.dY, z);
                ((ype) mms.f.l().ai((char) 5083)).y("evEnabled set to %s", Boolean.valueOf(z));
                mlq.c();
                qrn qrnVarE = kio.b().e();
                Object obj3 = this.a;
                mlq.b(qrnVarE, "car_ev_features_enabled", z, ((mms) obj3).g);
                qw qwVar = (qw) obj3;
                obs.a().f(qwVar.a, mkn.v, R.string.settings_takes_effect_on_restart, 1);
                qwVar.j();
                break;
            case 10:
                mms.a(yzy.ea, yzy.eb, z);
                ((ype) mms.f.l().ai((char) 5075)).y("connector type 1 set to %s", Boolean.valueOf(z));
                mlq.c();
                mlq.b(kio.b().e(), "car_ev_connector_type_1", z, ((mms) this.a).g);
                break;
            case 11:
                mms.a(yzy.ee, yzy.ef, z);
                ((ype) mms.f.l().ai((char) 5079)).y("connector type combo 1 set to %s", Boolean.valueOf(z));
                mlq.c();
                mlq.b(kio.b().e(), "car_ev_connector_type_combo_1", z, ((mms) this.a).g);
                break;
            case 12:
                mms.a(yzy.ec, yzy.ed, z);
                ((ype) mms.f.l().ai((char) 5076)).y("connector type 2 set to %s", Boolean.valueOf(z));
                mlq.c();
                mlq.b(kio.b().e(), "car_ev_connector_type_2", z, ((mms) this.a).g);
                break;
            case 13:
                mms.a(yzy.eg, yzy.eh, z);
                ((ype) mms.f.l().ai((char) 5080)).y("connector type combo 2 set to %s", Boolean.valueOf(z));
                mlq.c();
                mlq.b(kio.b().e(), "car_ev_connector_type_combo_2", z, ((mms) this.a).g);
                break;
            case 14:
                mms.a(yzy.ei, yzy.ej, z);
                ((ype) mms.f.l().ai((char) 5078)).y("connector type chademo set to %s", Boolean.valueOf(z));
                mlq.c();
                mlq.b(kio.b().e(), "car_ev_connector_type_chademo", z, ((mms) this.a).g);
                break;
            case 15:
                mms.a(yzy.ek, yzy.el, z);
                ((ype) mms.f.l().ai((char) 5082)).y("connector type nacs set to %s", Boolean.valueOf(z));
                mlq.c();
                mlq.b(kio.b().e(), "car_ev_connector_type_nacs", z, ((mms) this.a).g);
                break;
            case 16:
                mms.a(yzy.em, yzy.en, z);
                ((ype) mms.f.l().ai((char) 5077)).y("connector type 6 set to %s", Boolean.valueOf(z));
                mlq.c();
                mlq.b(kio.b().e(), "car_ev_connector_type_6", z, ((mms) this.a).g);
                break;
            case 17:
                mms.a(yzy.eo, yzy.ep, z);
                ((ype) mms.f.l().ai((char) 5081)).y("connector type leccs set to %s", Boolean.valueOf(z));
                mlq.c();
                mlq.b(kio.b().e(), "car_ev_connector_type_leccs", z, ((mms) this.a).g);
                break;
            default:
                Object obj4 = this.a;
                tjt tjtVar = (tjt) obj4;
                tjtVar.b = z;
                ((tjo) obj4).l = null;
                tjtVar.a.invoke(Boolean.valueOf(z));
                break;
        }
    }
}
