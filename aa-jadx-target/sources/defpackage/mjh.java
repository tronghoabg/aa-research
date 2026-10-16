package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mjh implements defpackage.kje {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mjh(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, qyx] */
    /* JADX WARN: Type inference failed for: r10v33, types: [java.lang.Object, qyx] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, qyx] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, qza] */
    @Override // defpackage.kje
    public final void a() throws defpackage.qsu, defpackage.qst, rlo {
        rif rifVar;
        com.google.android.gms.car.RadioConfiguration radioConfigurationF = null;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                defpackage.yqm yqmVar = com.google.android.apps.auto.components.radio.RadioMediaBrowserService.g;
                java.lang.Object obj = this.b;
                java.lang.Object obj2 = this.a;
                if (defpackage.omv.c("CAR.RADIO", 3)) {
                    defpackage.rrx.a("CAR.RADIO", null, "onCustomAction()");
                }
                try {
                    ((qsv) obj).a.o((java.lang.String) obj2);
                    return;
                } catch (android.os.RemoteException e) {
                    defpackage.oml.I(e);
                    return;
                } catch (java.lang.IllegalStateException e2) {
                    defpackage.oml.G(e2);
                    return;
                }
            case 1:
                java.lang.Object obj3 = this.b;
                com.google.android.apps.auto.components.carlocalmedia.CarLocalMediaBrowserService carLocalMediaBrowserService = (com.google.android.apps.auto.components.carlocalmedia.CarLocalMediaBrowserService) obj3;
                rif rifVar2 = carLocalMediaBrowserService.i;
                java.lang.Object obj4 = this.a;
                if (rifVar2 == null) {
                    try {
                        defpackage.mkp.a.g();
                        ((com.google.android.apps.auto.components.carlocalmedia.CarLocalMediaBrowserService) obj3).i = defpackage.oml.r((defpackage.qsh) obj4);
                        if (carLocalMediaBrowserService.k || (rifVar = carLocalMediaBrowserService.i) == null) {
                            return;
                        }
                        try {
                            ((defpackage.rps) rifVar.a).g(new defpackage.rdp(rifVar, new ajnd(obj3, (byte[]) null), 8));
                            ((com.google.android.apps.auto.components.carlocalmedia.CarLocalMediaBrowserService) obj3).k = true;
                            return;
                        } catch (defpackage.qst e3) {
                            carLocalMediaBrowserService.k(false);
                            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.carlocalmedia.CarLocalMediaBrowserService.g.h()).p(e3)).ai((char) 3219)).u("Can't enable car local media");
                            return;
                        }
                    } catch (defpackage.qst | defpackage.qsu unused) {
                        carLocalMediaBrowserService.k(false);
                        ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.carlocalmedia.CarLocalMediaBrowserService.g.f()).ai((char) 3220)).u("Car local media not supported by target device");
                        carLocalMediaBrowserService.stopSelf();
                        return;
                    }
                }
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Object obj5 = this.b;
                com.google.android.apps.auto.components.radio.RadioMediaBrowserService radioMediaBrowserService = (com.google.android.apps.auto.components.radio.RadioMediaBrowserService) obj5;
                qsv qsvVar = radioMediaBrowserService.i;
                java.lang.Object obj6 = this.a;
                if (qsvVar == null) {
                    try {
                        defpackage.mkp.a.g();
                        ((com.google.android.apps.auto.components.radio.RadioMediaBrowserService) obj5).i = defpackage.oml.t((defpackage.qsh) obj6);
                    } catch (defpackage.qsu unused2) {
                        radioMediaBrowserService.j.j(mjo.b);
                        ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.radio.RadioMediaBrowserService.g.f()).ai((char) 5007)).u("Radio not supported by target device");
                        return;
                    }
                    break;
                }
                radioMediaBrowserService.j.j(mjo.a);
                qsv qsvVar2 = radioMediaBrowserService.i;
                if (qsvVar2 != null) {
                    if (!radioMediaBrowserService.m) {
                        try {
                            ajnd ajndVar = ((com.google.android.apps.auto.components.radio.RadioMediaBrowserService) obj5).q;
                            ajndVar.getClass();
                            ?? r8 = qsvVar2.b;
                            r8.add(ajndVar);
                            if (defpackage.omv.c("CAR.RADIO", 3)) {
                                defpackage.rrx.d(3, "CAR.RADIO", null, "registerCallback: %d callbacks", java.lang.Integer.valueOf(r8.size()));
                            }
                            try {
                                try {
                                    qsvVar2.a.t(qsvVar2.d);
                                } catch (java.lang.IllegalStateException e4) {
                                    defpackage.oml.G(e4);
                                }
                            } catch (android.os.RemoteException e5) {
                                defpackage.oml.I(e5);
                            }
                            if (defpackage.omv.c("CAR.RADIO", 3)) {
                                defpackage.rrx.a("CAR.RADIO", null, "getRadioConfiguration()");
                            }
                            try {
                                try {
                                    radioConfigurationF = qsvVar2.a.f();
                                } catch (android.os.RemoteException e6) {
                                    defpackage.oml.I(e6);
                                }
                            } catch (java.lang.IllegalStateException e7) {
                                defpackage.oml.G(e7);
                            }
                            ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.radio.RadioMediaBrowserService.g.f()).ai(5003)).y("Radio configuration: %s", radioConfigurationF);
                            if (radioConfigurationF != null) {
                                java.util.List list = radioConfigurationF.a;
                                if (!list.isEmpty()) {
                                    ((com.google.android.apps.auto.components.radio.RadioMediaBrowserService) obj5).k.e.j(defpackage.ygw.o(list));
                                    ((com.google.android.apps.auto.components.radio.RadioMediaBrowserService) obj5).o = (defpackage.yhx) j$.util.Collection.-EL.stream(list).map(new mjb(9)).filter(new defpackage.lyk(10)).collect(defpackage.yds.b);
                                    ((com.google.android.apps.auto.components.radio.RadioMediaBrowserService) obj5).p = ((com.google.android.gms.car.RadioConfiguration.RadioBandGroup) list.get(0)).c;
                                }
                            }
                            ((com.google.android.apps.auto.components.radio.RadioMediaBrowserService) obj5).m = true;
                        } catch (defpackage.qst e8) {
                            radioMediaBrowserService.j.j(mjo.c);
                            throw e8;
                        }
                    }
                    break;
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.radio.RadioMediaBrowserService.g.h()).ai((char) 5005)).u("Radio not connected");
                }
                ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.radio.RadioMediaBrowserService.g.f()).ai((char) 5006)).u("Connected");
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Object obj7 = this.b;
                java.lang.Object obj8 = this.a;
                defpackage.yqm yqmVar2 = defpackage.mpk.a;
                try {
                    defpackage.mkp.a.g();
                    ((defpackage.qtv) defpackage.kit.b().e()).d().z((android.content.Intent) obj7, (android.os.Bundle) obj8);
                    return;
                } catch (java.lang.IllegalArgumentException e9) {
                    defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 42, defpackage.zaa.PROJECTION_CONTEXT_COMPONENT_MISSING);
                    android.content.ComponentName component = ((android.content.Intent) obj7).getComponent();
                    if (component != null) {
                        rroVarH.g(component.flattenToShortString());
                    }
                    defpackage.omf.u().F(rroVarH.l());
                    throw e9;
                }
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                int i = defpackage.ngg.a;
                defpackage.mkp.a.g();
                defpackage.oml.D((defpackage.qsh) this.a, "car_day_night_mode", ((defpackage.ngi) this.b).i);
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.mkp.a.g();
                defpackage.oml.F(defpackage.kit.b().e(), (com.google.android.gms.car.display.CarDisplayId) this.a, ((defpackage.oyr) this.b).a);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.mkp.a.g();
                defpackage.oml.B(defpackage.kit.b().e(), (com.google.android.gms.car.display.CarDisplayId) this.a, ((defpackage.oyr) this.b).a);
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.mkp.a.f();
                defpackage.qsh qshVar = (defpackage.qsh) this.a;
                defpackage.rpe rpeVarF = defpackage.ooa.f(qshVar);
                com.google.android.gearhead.appdecor.AppDecorService appDecorService = (com.google.android.gearhead.appdecor.AppDecorService) this.b;
                appDecorService.j = rpeVarF;
                appDecorService.a(11, 0);
                defpackage.mkp.a.g();
                if (defpackage.oml.h(qshVar, "toll_card_sensor_enabled")) {
                    appDecorService.a(22, 3);
                    return;
                }
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.mkp.a.g();
                defpackage.oml.D(((xck) this.b).r, "settings_native_app_dpi", this.a.toString());
                return;
            default:
                defpackage.mkp.a.g();
                ((androidx.preference.Preference) this.b).y = java.lang.Integer.valueOf(java.lang.Integer.parseInt(defpackage.oml.y(((xck) this.a).r, "settings_native_app_dpi", "160")));
                return;
        }
    }

    public /* synthetic */ mjh(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
