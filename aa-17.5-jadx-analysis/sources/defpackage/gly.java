package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.inputmethod.InputConnection;
import androidx.car.app.model.Alert;
import androidx.car.app.model.TemplateWrapper;
import com.google.android.apps.auto.components.apphost.view.TemplateView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ActionStripView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.InputSignInView;
import com.google.android.apps.auto.components.radio.RadioMediaBrowserService;
import com.google.android.gms.car.RadioProgramInfo;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class gly implements Handler.Callback {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public gly(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v28, types: [gkt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v39, types: [gkt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v52, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v15, types: [geb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        eqa eqaVar;
        byte[] bArr = null;
        boolean z = false;
        switch (this.b) {
            case 0:
                if (message.what != 1) {
                    if (message.what != 2) {
                        gks.k("CarApp.H", "Unknown message: %s", message);
                        return false;
                    }
                    Intent intent = new Intent();
                    gmg gmgVar = (gmg) this.a;
                    Intent component = intent.setComponent(gmgVar.c);
                    mt.h(gmgVar.g.b(), component);
                    gks.b("CarApp.H", "Re-binding to app after encoding session info");
                    gmgVar.a(component);
                    return true;
                }
                gmg gmgVar2 = (gmg) this.a;
                if (((gmh) gmgVar2.g.d()).b) {
                    gks.b("CarApp.H", "Not unbinding due to the app being a navigation app");
                } else if (gmgVar2.g.d().f()) {
                    gks.b("CarApp.H", "Not unbinding due to the app being a media app");
                } else {
                    if (!gmgVar2.g.d().e()) {
                        gmgVar2.g();
                        return true;
                    }
                    gks.b("CarApp.H", "Not unbinding due to the app being a built-in app");
                }
                gks.b("CarApp.H", "Skip unbinding as app is exempt");
                return true;
            case 1:
                gnk gnkVar = gnk.values()[message.what];
                if (gnkVar == gnk.a) {
                    gks.k("CarApp.H", "Unexpected message for handler %s", message);
                    return false;
                }
                kzt kztVar = (kzt) this.a;
                ((gns) kztVar.d).c((ComponentName) kztVar.a, gnkVar, gnl.h);
                gdp gdpVar = new gdp();
                gdpVar.e = 1;
                gdpVar.b = "ANR API: ".concat(String.valueOf(gnkVar.name()));
                gdpVar.c = new esx(this, gnkVar, 15, bArr);
                kztVar.b.a(new gdq(gdpVar));
                return true;
            case 2:
                if (message.what == 1) {
                    ((icr) this.a).c((icq) message.obj);
                    return true;
                }
                if (message.what != 2) {
                    return false;
                }
                ((icr) this.a).c.i((icq) message.obj);
                return false;
            case 3:
                if (message.what != 1 && message.what != 2) {
                    ((ype) ((ype) jsb.a.h()).ai((char) 2708)).y("Unknown message: %s", message);
                    return false;
                }
                boolean z2 = message.what == 2;
                if (z2) {
                    Object obj = this.a;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    jsb jsbVar = (jsb) obj;
                    long j = jsbVar.f + jsb.b;
                    if (j > jUptimeMillis) {
                        Handler handler = jsbVar.c;
                        Message messageObtainMessage = handler.obtainMessage(2);
                        messageObtainMessage.obj = message.obj;
                        handler.removeMessages(messageObtainMessage.what);
                        handler.sendMessageAtTime(messageObtainMessage, j);
                        return true;
                    }
                    jsbVar.f = jUptimeMillis;
                }
                ncp ncpVar = (ncp) message.obj;
                Object obj2 = this.a;
                mqb mqbVar = (mqb) ncpVar.a;
                jsb jsbVar2 = (jsb) obj2;
                jsp jspVarD = jsbVar2.d(mqbVar);
                if (jspVarD == null) {
                    ((ype) jsb.a.l().ai(2707)).M("Fragment has been cleared for app: %s when handling template data: %s", mqbVar.c(), ncpVar.c);
                    return false;
                }
                geu geuVar = (geu) jsbVar2.i.get();
                if (lbh.d().gN() && geuVar != null) {
                    Object obj3 = ncpVar.c;
                    jsj jsjVarX = geuVar.x();
                    Object obj4 = jspVarD.o;
                    gdy gdyVar = (gdy) obj4;
                    LinkedHashMap linkedHashMap = gdyVar.h;
                    linkedHashMap.clear();
                    TemplateWrapper templateWrapper = (TemplateWrapper) obj3;
                    linkedHashMap.put(gdyVar.i, Integer.toString(templateWrapper.getCurrentTaskStep()));
                    linkedHashMap.put(gdyVar.j, templateWrapper.getTemplate().getClass().getSimpleName());
                    linkedHashMap.put(gdyVar.k, "Touch: " + jsjVarX.a() + ", Touchpad: " + jsjVarX.b());
                    ((eqj) obj4).j(gdyVar.r());
                }
                TemplateWrapper templateWrapper2 = (TemplateWrapper) ncpVar.c;
                jsbVar2.g = templateWrapper2;
                if (geuVar != null) {
                    jsbVar2.h = ((gsf) geuVar.F(gsf.class)).c();
                }
                ((TemplateView) ncpVar.b).p(templateWrapper2, !z2);
                return true;
            case 4:
                if (message.what == 1) {
                    ((kbu) this.a).a.b();
                    return true;
                }
                if (message.what != 2) {
                    return false;
                }
                ?? r12 = this.a;
                if (!((hlf) r12).j.e.a(eps.d)) {
                    return true;
                }
                ((kbu) r12).a.a(r12);
                return true;
            case 5:
                if (message.what != 1) {
                    return false;
                }
                ((kby) this.a).a.b();
                return true;
            case 6:
                if (message.what == 1) {
                    ((ActionStripView) this.a).a(((Boolean) message.obj).booleanValue());
                } else {
                    ((ype) ((ype) ActionStripView.a.h()).ai((char) 2917)).y("Unknown message: %s", message);
                }
                return false;
            case 7:
                int i = InputSignInView.j;
                if (message.what == 1) {
                    gku gkuVar = ((InputSignInView) this.a).g;
                    if (gkuVar == null) {
                        return false;
                    }
                    gkuVar.b();
                    return true;
                }
                if (message.what == 2) {
                    ?? r122 = this.a;
                    InputSignInView inputSignInView = (InputSignInView) r122;
                    if (inputSignInView.g != null && (eqaVar = inputSignInView.f) != null) {
                        if (!((hlf) eqaVar).j.e.a(eps.d) || inputSignInView.g.c()) {
                            return true;
                        }
                        inputSignInView.g.a(r122);
                        return true;
                    }
                }
                return false;
            case 8:
                if (message.what != 1) {
                    return false;
                }
                nfs nfsVar = (nfs) this.a;
                long jUptimeMillis2 = SystemClock.uptimeMillis() - nfsVar.f;
                long jUptimeMillis3 = SystemClock.uptimeMillis() - nfsVar.g;
                if (jUptimeMillis2 >= nfs.b.toMillis()) {
                    nfsVar.k.m(true);
                    return true;
                }
                int i2 = nfsVar.h;
                boolean z3 = i2 != -1 && ((long) i2) < nfs.d.toSeconds();
                boolean z4 = nfsVar.g != -1 && jUptimeMillis3 < nfs.e.toMillis();
                eqm eqmVar = nfsVar.k;
                if (!z3 && !z4) {
                    z = true;
                }
                eqmVar.m(Boolean.valueOf(z));
                return true;
            case 9:
                if (message.what == 1) {
                    String str = (String) message.obj;
                    InputConnection inputConnection = ((qjj) this.a).a;
                    inputConnection.beginBatchEdit();
                    inputConnection.deleteSurroundingText(Alert.DURATION_SHOW_INDEFINITELY, 0);
                    inputConnection.commitText(str, 1);
                    inputConnection.endBatchEdit();
                }
                return false;
            case 10:
                if (omc.c("CAR.RADIO", 3)) {
                    rrd.d(3, "CAR.RADIO", null, "handleMessage: %d", Integer.valueOf(message.what));
                }
                switch (message.what) {
                    case 13:
                        for (ajmd ajmdVar : ((qsb) this.a).b) {
                            int i3 = message.arg1;
                            yph yphVar = RadioMediaBrowserService.g;
                            Object obj5 = ajmdVar.a;
                            dnw dnwVar = ((RadioMediaBrowserService) obj5).n;
                            if (dnwVar != null) {
                                dnwVar.b(Integer.valueOf(i3));
                            }
                            if (i3 == 2 || i3 == 3 || i3 == 4) {
                                obs.a().f((Context) obj5, mkn.G, R.string.radio_tune_error_station_unavailable, 0);
                            }
                        }
                        break;
                    case 14:
                        Iterator it = ((qsb) this.a).b.iterator();
                        while (it.hasNext()) {
                            ((ajmd) it.next()).r(((Boolean) message.obj).booleanValue());
                        }
                        break;
                    case 15:
                        for (ajmd ajmdVar2 : ((qsb) this.a).b) {
                            RadioProgramInfo radioProgramInfo = (RadioProgramInfo) message.obj;
                            boolean z5 = message.arg1 == 1;
                            boolean z6 = message.arg2 == 1;
                            yph yphVar2 = RadioMediaBrowserService.g;
                            mjg.a(((RadioMediaBrowserService) ajmdVar2.a).l.b, new mio(radioProgramInfo, z6));
                            ajmdVar2.r(z5);
                        }
                        break;
                    case 16:
                        for (ajmd ajmdVar3 : ((qsb) this.a).b) {
                            List list = (List) message.obj;
                            yph yphVar3 = RadioMediaBrowserService.g;
                            list.size();
                            ((RadioMediaBrowserService) ajmdVar3.a).k.c.j(yfq.o(list));
                        }
                        break;
                    case 17:
                        for (ajmd ajmdVar4 : ((qsb) this.a).b) {
                            List list2 = (List) message.obj;
                            yph yphVar4 = RadioMediaBrowserService.g;
                            list2.size();
                            ((RadioMediaBrowserService) ajmdVar4.a).k.d.j(yfq.o(list2));
                        }
                        break;
                    default:
                        rrd.d(5, "CAR.RADIO", null, "unknown message: %d", Integer.valueOf(message.what));
                        break;
                }
                if (omc.c("CAR.RADIO", 3) && ((qsb) this.a).b.isEmpty()) {
                    rrd.a("CAR.RADIO", null, "no callbacks registered");
                }
                return true;
            case 11:
                qry qryVar = ((roe) this.a).b;
                if (qryVar != null) {
                    int i4 = message.what;
                    if (i4 == 1) {
                        qryVar.a(message.arg1, message.arg2, ((Integer) message.obj).intValue());
                    } else if (i4 != 2) {
                        rrd.d(5, "CAR.MSG", null, "Unexpected message %s", message);
                    } else {
                        qryVar.b(message.arg1);
                    }
                }
                return true;
            default:
                int i5 = message.what;
                if (i5 == 0) {
                    int i6 = message.arg1;
                    return true;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        return false;
                    }
                    ((xqb) this.a).e.b(message.arg1);
                    return true;
                }
                Bundle bundle = (Bundle) message.obj;
                return true;
        }
    }
}
