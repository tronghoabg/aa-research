package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final /* synthetic */ class kwq implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kwq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        switch (this.b) {
            case 0:
                if (str.equals("key_work_profile_support")) {
                    ((eqj) this.a).j(Boolean.valueOf(kws.a()));
                    break;
                }
                break;
            case 1:
                if (affa.f(str, "settings_native_app_dpi")) {
                    ((ipn) this.a).j();
                    break;
                }
                break;
            case 2:
                yph yphVar = lvv.a;
                ((ype) yphVar.l().ai(4350)).M("onSharedPreferenceChangedListener invoked with key: %s (%s)", str, jrl.a());
                lvv lvvVar = (lvv) this.a;
                if (!lvvVar.c) {
                    ((ype) ((ype) yphVar.g()).ai((char) 4353)).u("Should not receive callbacks when not started.");
                    break;
                } else {
                    int i = 12;
                    if (!"key_settings_messaging_notifications_enabled".equals(str)) {
                        if ("key_settings_messaging_group_notifications".equals(str)) {
                            lvvVar.m(new iwu(14));
                            lvv.l(new iwu(i));
                            break;
                        }
                    } else {
                        lvvVar.m(new iwu(13));
                        lvv.l(new iwu(i));
                        break;
                    }
                }
                break;
            case 3:
                ((lyu) this.a).d.c();
                break;
            case 4:
                if (!acxa.K().b.contains(str)) {
                    ((mmm) this.a).k(str);
                    break;
                }
                break;
            case 5:
                if (acxa.K().b.contains(str)) {
                    ((mmm) this.a).k(str);
                    break;
                }
                break;
            case 6:
                pgr pgrVar = (pgr) this.a;
                pgrVar.x = pgrVar.V.getString(str, "UNKNOWN");
                break;
            case 7:
                yph yphVar2 = qir.a;
                ((ype) yphVar2.l().ai(7378)).M("onSharedPreferenceChangedListener invoked with key: %s (%s)", str, jrl.a());
                qir qirVar = (qir) this.a;
                if (!qirVar.c) {
                    ((ype) ((ype) yphVar2.g()).ai((char) 7381)).u("Should not receive callbacks when not started.");
                    break;
                } else {
                    int i2 = 2;
                    if (!"key_settings_messaging_notifications_enabled".equals(str)) {
                        if ("key_settings_messaging_group_notifications".equals(str)) {
                            qirVar.m(new qhc(4));
                            qir.l(new qhc(i2));
                            break;
                        }
                    } else {
                        qirVar.m(new qhc(3));
                        qir.l(new qhc(i2));
                        break;
                    }
                }
                break;
            case 8:
                if (!acxa.K().b.contains(str)) {
                    ((xbo) this.a).v(str);
                    break;
                }
                break;
            default:
                if (acxa.K().b.contains(str) || (actj.n() && str.equals("key_settings_messaging_allow_notification_data_sharing_agsa"))) {
                    ((xbo) this.a).v(str);
                    break;
                }
                break;
        }
    }

    public kwq(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
