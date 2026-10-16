package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kww implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kww(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                if (str.equals("key_work_profile_support")) {
                    ((defpackage.eqp) this.a).j(java.lang.Boolean.valueOf(defpackage.kwy.a()));
                }
                break;
            case 1:
                if (defpackage.afga.f(str, "settings_native_app_dpi")) {
                    ((ipu) this.a).j();
                    break;
                }
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqm yqmVar = lwc.a;
                ((defpackage.yqj) yqmVar.l().ai(4353)).M("onSharedPreferenceChangedListener invoked with key: %s (%s)", str, defpackage.jrm.a());
                lwc lwcVar = (lwc) this.a;
                if (!lwcVar.c) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 4356)).u("Should not receive callbacks when not started.");
                } else {
                    int i = 12;
                    if ("key_settings_messaging_notifications_enabled".equals(str)) {
                        lwcVar.m(new defpackage.ixc(13));
                        lwc.l(new defpackage.ixc(i));
                    } else if ("key_settings_messaging_group_notifications".equals(str)) {
                        lwcVar.m(new defpackage.ixc(14));
                        lwc.l(new defpackage.ixc(i));
                    }
                }
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.lza) this.a).d.c();
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                if (!defpackage.acyc.L().b.contains(str)) {
                    ((mms) this.a).k(str);
                }
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                if (defpackage.acyc.L().b.contains(str)) {
                    ((mms) this.a).k(str);
                }
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                phn phnVar = (phn) this.a;
                phnVar.x = phnVar.V.getString(str, "UNKNOWN");
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.yqm yqmVar2 = defpackage.qjm.a;
                ((defpackage.yqj) yqmVar2.l().ai(7403)).M("onSharedPreferenceChangedListener invoked with key: %s (%s)", str, defpackage.jrm.a());
                defpackage.qjm qjmVar = (defpackage.qjm) this.a;
                if (!qjmVar.c) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar2.g()).ai((char) 7406)).u("Should not receive callbacks when not started.");
                } else {
                    int i2 = 2;
                    if ("key_settings_messaging_notifications_enabled".equals(str)) {
                        qjmVar.m(new defpackage.qhx(3));
                        defpackage.qjm.l(new defpackage.qhx(i2));
                    } else if ("key_settings_messaging_group_notifications".equals(str)) {
                        qjmVar.m(new defpackage.qhx(4));
                        defpackage.qjm.l(new defpackage.qhx(i2));
                    }
                }
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                if (!defpackage.acyc.L().b.contains(str)) {
                    ((xck) this.a).v(str);
                }
                break;
            default:
                if (defpackage.acyc.L().b.contains(str) || (defpackage.acul.n() && str.equals("key_settings_messaging_allow_notification_data_sharing_agsa"))) {
                    ((xck) this.a).v(str);
                }
                break;
        }
    }

    public kww(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
