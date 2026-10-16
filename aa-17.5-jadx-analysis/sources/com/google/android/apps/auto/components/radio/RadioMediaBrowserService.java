package com.google.android.apps.auto.components.radio;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.apps.auto.components.radio.RadioMediaBrowserService;
import com.google.android.gms.car.RadioProgramSelector;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import defpackage.acrz;
import defpackage.ajmd;
import defpackage.dnw;
import defpackage.dsg;
import defpackage.ept;
import defpackage.eqa;
import defpackage.eqj;
import defpackage.eqm;
import defpackage.etf;
import defpackage.etp;
import defpackage.ett;
import defpackage.fjt;
import defpackage.gjt;
import defpackage.kgq;
import defpackage.kio;
import defpackage.kiy;
import defpackage.lpc;
import defpackage.lsh;
import defpackage.lws;
import defpackage.mhr;
import defpackage.mih;
import defpackage.mil;
import defpackage.mim;
import defpackage.min;
import defpackage.mis;
import defpackage.mit;
import defpackage.miu;
import defpackage.miw;
import defpackage.miy;
import defpackage.mjc;
import defpackage.mjd;
import defpackage.mje;
import defpackage.mjg;
import defpackage.mjh;
import defpackage.mji;
import defpackage.mjm;
import defpackage.omc;
import defpackage.qsb;
import defpackage.rrd;
import defpackage.skn;
import defpackage.vuf;
import defpackage.wub;
import defpackage.ycm;
import defpackage.yfq;
import defpackage.yfy;
import defpackage.ygr;
import defpackage.yls;
import defpackage.yly;
import defpackage.ymp;
import defpackage.ype;
import defpackage.yph;
import defpackage.yzy;
import defpackage.yzz;
import defpackage.zfq;
import defpackage.zgp;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Objects;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class RadioMediaBrowserService extends ett implements mji, eqa {
    public static final yph g = yph.c("GH.Radio");
    private static final ygr r = new ymp(RemoteApiConstants.NOW_PACKAGE);
    public mje h;
    public qsb i;
    public mil k;
    public mjg l;
    public dnw n;
    public String p;
    public ajmd q;
    private mjm s;
    private ScheduledExecutorService t;
    private skn u;
    private min v;
    private final gjt w = new gjt(this);
    public final eqm j = new eqm(mjh.b);
    public boolean m = false;
    public ygr o = yly.a;

    @Override // defpackage.ett
    public final etf a(String str, int i, Bundle bundle) {
        yph yphVar = g;
        ((ype) ((ype) yphVar.f()).ai(5014)).R("getRoot for %s (uid: %d) with hints: %s", str, Integer.valueOf(i), bundle == null ? "null" : vuf.P(bundle));
        if (this.k == null) {
            ((ype) ((ype) yphVar.h()).ai((char) 5017)).u("Service not initialized properly");
            return null;
        }
        if (!Objects.equals(str, "com.google.android.projection.gearhead") && (!r.contains(str) || !this.u.b(str))) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        Stream map = Collection.EL.stream(this.o).map(new miw(9));
        int i2 = yfq.d;
        bundle2.putParcelableArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ROOT_LIST", new ArrayList<>((yfq) map.collect(ycm.a)));
        if (!TextUtils.isEmpty(this.p)) {
            bundle2.putString("com.google.android.apps.auto.radio.DEFAULT_BAND_SCAN_CUSTOM_ACTION", this.p);
        }
        if (bundle == null || !bundle.getBoolean("android.service.media.extra.SUGGESTED", false)) {
            ((ype) ((ype) yphVar.e()).ai((char) 5015)).u("Returning AAP radio root.");
            return new etf("AAPRadioRoot", bundle2);
        }
        ((ype) ((ype) yphVar.e()).ai((char) 5016)).u("Suggested request received, returning favorites root.");
        return new etf(mih.b.a(), bundle2);
    }

    @Override // defpackage.ett
    public final void c(String str, etp etpVar) {
        yfq yfqVar;
        if (this.k == null) {
            ((ype) ((ype) g.h()).ai((char) 5019)).u("Service not initialized properly");
            int i = yfq.d;
            etpVar.b(yls.a);
            return;
        }
        min minVar = this.v;
        if (!minVar.a()) {
            ((ype) ((ype) min.a.h()).ai((char) 4984)).u("Trying to access data out of lifecycle");
            int i2 = yfq.d;
            yfqVar = yls.a;
        } else if (Objects.equals(str, "AAPRadioRoot")) {
            minVar.c.keySet();
            yfy yfyVar = minVar.c;
            mih mihVar = mih.b;
            Stream map = Stream.CC.concat(yfyVar.containsKey(mihVar) ? Stream.CC.empty() : Stream.CC.of(mihVar), Collection.EL.stream(minVar.c.keySet())).distinct().sorted(Comparator.CC.comparingInt(new mim(0))).map(new lpc(minVar, 9));
            int i3 = yfq.d;
            yfqVar = (yfq) map.collect(ycm.a);
        } else {
            mih mihVar2 = (mih) minVar.d.get(str);
            if (mihVar2 != null) {
                yfqVar = (yfq) minVar.c.get(mihVar2);
                if ((mihVar2.b() && (yfqVar == null || yfqVar.isEmpty())) || yfqVar == null) {
                    int i4 = yfq.d;
                    yfqVar = yls.a;
                }
            } else if (Objects.equals(str, mih.b.a())) {
                int i5 = yfq.d;
                yfqVar = yls.a;
            } else {
                ((ype) ((ype) min.a.h()).ai((char) 4982)).y("Unknown browse node:%s", str);
                int i6 = yfq.d;
                yfqVar = yls.a;
            }
        }
        etpVar.b(yfqVar);
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return (ept) this.w.b;
    }

    @Override // defpackage.mji
    public final eqj i() {
        return this.j;
    }

    @Override // defpackage.mji
    public final ygr j() {
        return this.o;
    }

    @Override // defpackage.mji
    public final zgp k(RadioProgramSelector radioProgramSelector) {
        qsb qsbVar = this.i;
        if (qsbVar == null) {
            ((ype) ((ype) g.h()).ai((char) 5026)).u("Radio not connected");
            return wub.Y(4);
        }
        if (this.n != null) {
            ((ype) ((ype) g.h()).ai((char) 5025)).u("Already tuning to a station, skipping");
            return wub.Y(4);
        }
        int i = 2;
        zgp zgpVarAe = wub.ae(dsg.w(new fjt(this, qsbVar, radioProgramSelector, i)), true != lws.l(radioProgramSelector.a.a) ? 6000 : 12000, TimeUnit.MILLISECONDS, this.t);
        zgpVarAe.c(new mhr(this, i), zfq.a);
        return zgpVarAe;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    public final void l() {
        ((ype) g.l().ai((char) 4999)).u("Car got disconnected");
        qsb qsbVar = this.i;
        if (qsbVar != null) {
            ajmd ajmdVar = this.q;
            if (ajmdVar != null) {
                ?? r0 = qsbVar.b;
                r0.remove(ajmdVar);
                if (omc.c("CAR.RADIO", 3)) {
                    rrd.d(3, "CAR.RADIO", null, "unregisterCallback: %d callbacks", Integer.valueOf(r0.size()));
                }
            }
            this.i = null;
        }
        mjg mjgVar = this.l;
        if (mjgVar != null) {
            mjgVar.b(new mis(0, null, null));
        }
        this.j.j(mjh.c);
        this.m = false;
        this.o = yly.a;
    }

    @Override // defpackage.mji
    public final void m(String str) {
        qsb qsbVar = this.i;
        if (qsbVar == null) {
            ((ype) ((ype) g.h()).ai((char) 5012)).u("Radio not connected");
        } else {
            kgq.d(new mjc(str, qsbVar, 0), "GH.Radio", yzz.RADIO_APP, yzy.LY, "Can't send custom action", new Object[0]);
        }
    }

    @Override // defpackage.mji
    public final void n(boolean z) {
        qsb qsbVar = this.i;
        if (qsbVar == null) {
            ((ype) ((ype) g.h()).ai((char) 5021)).u("Radio not connected");
        } else {
            kgq.d(new mjd(z, qsbVar, 1), "GH.Radio", yzz.RADIO_APP, yzy.LW, "Can't set favorite", new Object[0]);
        }
    }

    @Override // defpackage.mji
    public final void o(boolean z) {
        qsb qsbVar = this.i;
        if (qsbVar == null) {
            ((ype) ((ype) g.h()).ai((char) 5022)).u("Radio not connected");
        } else {
            kgq.d(new mjd(z, qsbVar, 0), "GH.Radio", yzz.RADIO_APP, yzy.LU, "Can't mute", new Object[0]);
        }
    }

    @Override // defpackage.ett, android.app.Service
    public final IBinder onBind(Intent intent) {
        this.w.p();
        if (acrz.s()) {
            return super.onBind(intent);
        }
        return null;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b("AAPRadioRoot");
    }

    @Override // defpackage.ett, android.app.Service
    public final void onCreate() {
        this.w.q();
        super.onCreate();
        if (!acrz.k() || !acrz.s()) {
            ((ype) ((ype) g.h()).ai((char) 5011)).u("Radio not enabled, stopping.");
            stopSelf();
            return;
        }
        this.l = new mjg();
        Random random = new Random();
        mil milVar = new mil(new miy(getResources(), random), new miu(getResources(), random));
        this.k = milVar;
        this.v = new min(this, milVar, this);
        this.q = new ajmd(this, null);
        this.t = Executors.newSingleThreadScheduledExecutor();
        mjm mjmVar = new mjm(this, this, this.v, this.l, this, new mit(getResources(), random));
        this.s = mjmVar;
        d(mjmVar.b.b());
        this.k.h.fE(this, new lsh(this, 11));
        if (this.h == null) {
            this.h = new mje(this);
            kio kioVarB = kio.b();
            mje mjeVar = this.h;
            mjeVar.getClass();
            kioVarB.v(mjeVar);
        }
        this.u = skn.a(this);
    }

    @Override // defpackage.ett, android.app.Service
    public final void onDestroy() {
        this.w.r();
        l();
        this.q = null;
        this.s = null;
        mje mjeVar = this.h;
        if (mjeVar != null) {
            kio.b().w(mjeVar);
            this.h = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        this.w.s();
        return 1;
    }

    @Override // defpackage.mji
    public final void p(final int i) {
        final qsb qsbVar = this.i;
        if (qsbVar == null) {
            ((ype) ((ype) g.h()).ai((char) 5023)).u("Radio not connected");
        } else {
            kgq.d(new kiy() { // from class: mjb
                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, qyb] */
                @Override // defpackage.kiy
                public final void a() throws qrz {
                    yph yphVar = RadioMediaBrowserService.g;
                    int i2 = i;
                    qsb qsbVar2 = qsbVar;
                    if (omc.c("CAR.RADIO", 3)) {
                        rrd.a("CAR.RADIO", null, "skipStation()");
                    }
                    try {
                        qsbVar2.a.v(i2);
                    } catch (RemoteException e) {
                        olm.h(e);
                    } catch (IllegalStateException e2) {
                        olm.f(e2);
                    }
                }
            }, "GH.Radio", yzz.RADIO_APP, yzy.LX, "Can't skip station", new Object[0]);
        }
    }
}
