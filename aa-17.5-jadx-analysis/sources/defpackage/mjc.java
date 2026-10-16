package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.preference.Preference;
import com.google.android.apps.auto.components.carlocalmedia.CarLocalMediaBrowserService;
import com.google.android.apps.auto.components.radio.RadioMediaBrowserService;
import com.google.android.gearhead.appdecor.AppDecorService;
import com.google.android.gms.car.RadioConfiguration;
import com.google.android.gms.car.display.CarDisplayId;
import j$.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class mjc implements kiy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mjc(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, qyb] */
    /* JADX WARN: Type inference failed for: r11v33, types: [java.lang.Object, qyb] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, qyb] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, qye] */
    @Override // defpackage.kiy
    public final void a() throws qrz, qsa {
        rhj rhjVar;
        int i = 8;
        RadioConfiguration radioConfigurationF = null;
        switch (this.c) {
            case 0:
                yph yphVar = RadioMediaBrowserService.g;
                Object obj = this.b;
                Object obj2 = this.a;
                if (omc.c("CAR.RADIO", 3)) {
                    rrd.a("CAR.RADIO", null, "onCustomAction()");
                }
                try {
                    ((qsb) obj).a.o((String) obj2);
                    return;
                } catch (RemoteException e) {
                    olm.h(e);
                    return;
                } catch (IllegalStateException e2) {
                    olm.f(e2);
                    return;
                }
            case 1:
                Object obj3 = this.b;
                CarLocalMediaBrowserService carLocalMediaBrowserService = (CarLocalMediaBrowserService) obj3;
                rhj rhjVar2 = carLocalMediaBrowserService.i;
                Object obj4 = this.a;
                if (rhjVar2 == null) {
                    try {
                        mki.a.g();
                        ((CarLocalMediaBrowserService) obj3).i = ols.r((qrn) obj4);
                        if (carLocalMediaBrowserService.k || (rhjVar = carLocalMediaBrowserService.i) == null) {
                            return;
                        }
                        try {
                            ((rox) rhjVar.a).g(new rcu(rhjVar, new ajmd(obj3, null), i));
                            ((CarLocalMediaBrowserService) obj3).k = true;
                            return;
                        } catch (qrz e3) {
                            carLocalMediaBrowserService.k(false);
                            ((ype) ((ype) ((ype) CarLocalMediaBrowserService.g.h()).p(e3)).ai((char) 3215)).u("Can't enable car local media");
                            return;
                        }
                    } catch (qrz | qsa unused) {
                        carLocalMediaBrowserService.k(false);
                        ((ype) ((ype) CarLocalMediaBrowserService.g.f()).ai((char) 3216)).u("Car local media not supported by target device");
                        carLocalMediaBrowserService.stopSelf();
                        return;
                    }
                }
                return;
            case 2:
                Object obj5 = this.b;
                RadioMediaBrowserService radioMediaBrowserService = (RadioMediaBrowserService) obj5;
                qsb qsbVar = radioMediaBrowserService.i;
                Object obj6 = this.a;
                if (qsbVar == null) {
                    try {
                        mki.a.g();
                        ((RadioMediaBrowserService) obj5).i = ols.t((qrn) obj6);
                    } catch (qsa unused2) {
                        radioMediaBrowserService.j.j(mjh.b);
                        ((ype) ((ype) RadioMediaBrowserService.g.f()).ai((char) 5004)).u("Radio not supported by target device");
                        return;
                    }
                }
                radioMediaBrowserService.j.j(mjh.a);
                qsb qsbVar2 = radioMediaBrowserService.i;
                if (qsbVar2 == null) {
                    ((ype) ((ype) RadioMediaBrowserService.g.h()).ai((char) 5002)).u("Radio not connected");
                } else if (!radioMediaBrowserService.m) {
                    try {
                        ajmd ajmdVar = ((RadioMediaBrowserService) obj5).q;
                        ajmdVar.getClass();
                        ?? r9 = qsbVar2.b;
                        r9.add(ajmdVar);
                        if (omc.c("CAR.RADIO", 3)) {
                            rrd.d(3, "CAR.RADIO", null, "registerCallback: %d callbacks", Integer.valueOf(r9.size()));
                        }
                        try {
                            try {
                                qsbVar2.a.t(qsbVar2.d);
                            } catch (IllegalStateException e4) {
                                olm.f(e4);
                            }
                        } catch (RemoteException e5) {
                            olm.h(e5);
                        }
                        if (omc.c("CAR.RADIO", 3)) {
                            rrd.a("CAR.RADIO", null, "getRadioConfiguration()");
                        }
                        try {
                            radioConfigurationF = qsbVar2.a.f();
                        } catch (RemoteException e6) {
                            olm.h(e6);
                        } catch (IllegalStateException e7) {
                            olm.f(e7);
                        }
                        ((ype) ((ype) RadioMediaBrowserService.g.f()).ai(5000)).y("Radio configuration: %s", radioConfigurationF);
                        if (radioConfigurationF != null) {
                            List list = radioConfigurationF.a;
                            if (!list.isEmpty()) {
                                ((RadioMediaBrowserService) obj5).k.e.j(yfq.o(list));
                                ((RadioMediaBrowserService) obj5).o = (ygr) Collection.EL.stream(list).map(new miw(8)).filter(new lye(9)).collect(ycm.b);
                                ((RadioMediaBrowserService) obj5).p = ((RadioConfiguration.RadioBandGroup) list.get(0)).c;
                            }
                        }
                        ((RadioMediaBrowserService) obj5).m = true;
                    } catch (qrz e8) {
                        radioMediaBrowserService.j.j(mjh.c);
                        throw e8;
                    }
                }
                ((ype) ((ype) RadioMediaBrowserService.g.f()).ai((char) 5003)).u("Connected");
                return;
            case 3:
                Object obj7 = this.b;
                Object obj8 = this.a;
                yph yphVar2 = mpe.a;
                try {
                    mki.a.g();
                    ((qsz) kio.b().e()).d().z((Intent) obj7, (Bundle) obj8);
                    return;
                } catch (IllegalArgumentException e9) {
                    rqu rquVarH = rqv.h(yxy.GEARHEAD, 42, yyv.PROJECTION_CONTEXT_COMPONENT_MISSING);
                    ComponentName component = ((Intent) obj7).getComponent();
                    if (component != null) {
                        rquVarH.g(component.flattenToShortString());
                    }
                    ebf.j().F(rquVarH.l());
                    throw e9;
                }
            case 4:
                int i2 = nfo.a;
                mki.a.g();
                ols.D((qrn) this.a, "car_day_night_mode", ((nfp) this.b).i);
                return;
            case 5:
                mki.a.g();
                ols.F(kio.b().e(), (CarDisplayId) this.a, ((oxu) this.b).a);
                return;
            case 6:
                mki.a.g();
                ols.B(kio.b().e(), (CarDisplayId) this.a, ((oxu) this.b).a);
                return;
            case 7:
                mki.a.f();
                qrn qrnVar = (qrn) this.a;
                roj rojVarF = oni.f(qrnVar);
                AppDecorService appDecorService = (AppDecorService) this.b;
                appDecorService.j = rojVarF;
                appDecorService.a(11, 0);
                mki.a.g();
                if (ols.h(qrnVar, "toll_card_sensor_enabled")) {
                    appDecorService.a(22, 3);
                    return;
                }
                return;
            case 8:
                mki.a.g();
                ols.D(((xbo) this.b).r, "settings_native_app_dpi", this.a.toString());
                return;
            default:
                mki.a.g();
                ((Preference) this.b).y = Integer.valueOf(Integer.parseInt(ols.y(((xbo) this.a).r, "settings_native_app_dpi", "160")));
                return;
        }
    }

    public /* synthetic */ mjc(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
