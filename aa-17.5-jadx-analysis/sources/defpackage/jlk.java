package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.hardware.usb.UsbAccessory;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.car.app.serialization.Bundleable;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.gms.carsetup.setup.UsbConnectionHelper;
import j$.time.Instant;
import j$.util.OptionalInt;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final /* synthetic */ class jlk implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ jlk(Bundleable bundleable, gpx gpxVar, gqb gqbVar, ComponentName componentName, boolean z, int i) {
        this.f = i;
        this.c = bundleable;
        this.d = gpxVar;
        this.e = gqbVar;
        this.b = componentName;
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, sgj] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        if (i == 0) {
            pbu pbuVar = (pbu) ((jll) this.b).a.h;
            if (pbuVar.b) {
                ((kny) pbuVar.r.e).e(yxi.WIRELESS_WIFI_STARTUP_MANAGER_ON_HANDOFF_COMPLETE, OptionalInt.of(((Integer) pbuVar.o.get()).intValue()));
            } else {
                ols.M(pbuVar.c, yxi.STARTUP_MANAGER_ON_HANDOFF_COMPLETE);
            }
            if (pbuVar.q) {
                ((ype) ((ype) pbx.a.f()).ai(6290)).Q("Socket completed. Success: %b. SocketResult needed additional handling: %b", true, pbuVar.e.a(ozu.a));
            }
            ype ypeVar = (ype) ((ype) pbx.a.f()).ai(6288);
            ComponentName componentName = pbuVar.k;
            String strFlattenToString = componentName != null ? componentName.flattenToString() : "<null>";
            boolean z = this.a;
            ?? r4 = this.e;
            Object obj = this.d;
            Object obj2 = this.c;
            ypeVar.N("Handoff complete. Interested component: %s. Success: %b.", strFlattenToString, true);
            CarInfoInternal carInfoInternal = (CarInfoInternal) obj2;
            pbuVar.g.post(new isq(pbuVar, (List) r4, carInfoInternal, z, 8));
            if (obj != null) {
                CarInfo carInfo = carInfoInternal.a;
                new sak(pbuVar.c).c(carInfo.e, carInfo.f, (xob) obj);
                return;
            }
            return;
        }
        if (i == 1) {
            boolean z2 = this.a;
            Object obj3 = this.b;
            Object obj4 = this.e;
            Object obj5 = this.c;
            try {
                if (((Bundleable) obj5).a() instanceof MediaSessionCompat.Token) {
                    Object objA = ((Bundleable) obj5).a();
                    objA.getClass();
                    ((ynz) gpx.c.f().o(ypi.a, "CarApp.H.Media").ai(66)).u("requesting view model");
                    gev.c(new isq((gqb) obj4, (MediaSessionCompat.Token) objA, (ComponentName) obj3, z2, 1));
                    return;
                }
                return;
            } catch (xr e) {
                Object obj6 = this.d;
                ((ynz) ((ynz) gpx.c.f().o(ypi.a, "CarApp.H.Media")).p(e).ai(67)).u("could not extract token. ");
                geb gebVarF = ((gpx) obj6).a.f();
                gdp gdpVar = new gdp();
                gdpVar.a = e;
                gebVarF.a(new gdq(gdpVar));
                return;
            }
        }
        if (i == 2) {
            boolean z3 = this.a;
            Object obj7 = this.e;
            Object obj8 = this.d;
            Object obj9 = this.b;
            Object obj10 = this.c;
            synchronized (obj10) {
                if (z3) {
                    Locale locale = Locale.US;
                    abnf abnfVar = ((pay) obj8).c;
                    if (abnfVar == null) {
                        abnfVar = abnf.a;
                    }
                    ((koo) obj10).g((kom) obj9, String.format(locale, "active_time elapsed (%d ms)", Long.valueOf(abqs.a(abnfVar))));
                    ((koo) obj10).j((pba) obj7);
                } else {
                    ((koo) obj10).j((pba) obj7);
                }
            }
            return;
        }
        if (i == 3) {
            boolean z4 = this.a;
            ?? r2 = this.d;
            Object obj11 = this.c;
            Object obj12 = this.b;
            ypf ypfVar = sgf.a;
            ((AtomicBoolean) this.e).set(true);
            Context context = (Context) obj12;
            ols.M(context, yxi.CAR_SETUP_CHECK_FRX_TIMEOUT);
            sgf.c(context, (UsbAccessory) obj11, r2, z4);
            return;
        }
        if (i == 4) {
            ((UsbConnectionHelper) this.e).a((Context) this.b, (UsbAccessory) this.c, false, this.a, this.d);
            return;
        }
        Context context2 = zus.a;
        ?? r0 = this.c;
        if (r0.gu() != null) {
            Object obj13 = this.b;
            Object obj14 = this.d;
            Object obj15 = this.e;
            tng tngVar = (tng) r0.gu();
            Context context3 = (Context) obj13;
            zyb zybVar = (zyb) obj15;
            zbi zbiVar = (zbi) obj14;
            abnp abnpVarG = ysi.G(zybVar, zbiVar, context3.getPackageName());
            if (tngVar.e == null) {
                tngVar.e = tngVar.d.getSharedPreferences("GeoMonitoringSharedPref", 0);
                tngVar.f = tngVar.e.getLong("InitializedEventPreviousEventMsPrefKey", -1L);
            }
            long j = tngVar.f;
            if (j != -1) {
                abnpVarG.t();
                zbu zbuVar = (zbu) abnpVarG.b;
                zbu zbuVar2 = zbu.a;
                zbuVar.c |= 536870912;
                zbuVar.m = j;
            }
            boolean z5 = this.a;
            tmb tmbVar = tngVar.c;
            tngVar.f = Instant.now().toEpochMilli();
            zbu zbuVar3 = (zbu) abnpVarG.q();
            tngVar.a.c("ApplicationProcessStarted").a(0L, sij.a(zbuVar3));
            tngVar.a();
            tng.b("ApplicationProcessStarted", zbuVar3);
            if (z5) {
                tng tngVar2 = (tng) r0.gu();
                String packageName = context3.getPackageName();
                int iB = (int) addj.b();
                abnp abnpVarN = zax.a.n();
                abnpVarN.t();
                zax zaxVar = (zax) abnpVarN.b;
                zaxVar.b |= 1;
                zaxVar.c = iB;
                abnpVarN.t();
                zax zaxVar2 = (zax) abnpVarN.b;
                zaxVar2.d = 2;
                zaxVar2.b |= 2;
                zax zaxVar3 = (zax) abnpVarN.q();
                abnp abnpVarN2 = zbh.a.n();
                abnpVarN2.t();
                zbh zbhVar = (zbh) abnpVarN2.b;
                zbhVar.c = 1;
                zbhVar.b = 1 | zbhVar.b;
                abnpVarN2.t();
                zbh zbhVar2 = (zbh) abnpVarN2.b;
                zbhVar2.d = 6;
                zbhVar2.b = 2 | zbhVar2.b;
                abnpVarN2.t();
                zbh zbhVar3 = (zbh) abnpVarN2.b;
                zaxVar3.getClass();
                zbhVar3.e = zaxVar3;
                zbhVar3.b |= 4;
                zbh zbhVar4 = (zbh) abnpVarN2.q();
                abnp abnpVarG2 = ysi.G(zybVar, zbiVar, packageName);
                abnpVarG2.t();
                zbu zbuVar4 = (zbu) abnpVarG2.b;
                zbu zbuVar5 = zbu.a;
                zbhVar4.getClass();
                zbuVar4.l = zbhVar4;
                zbuVar4.c |= 268435456;
                zbu zbuVar6 = (zbu) abnpVarG2.q();
                tngVar2.a.c("RecoveryAttempt").a(0L, sij.a(zbuVar6));
                tngVar2.a();
                tng.b("RecoveryAttempt", zbuVar6);
            }
        }
    }

    public /* synthetic */ jlk(UsbConnectionHelper usbConnectionHelper, Context context, UsbAccessory usbAccessory, boolean z, sgj sgjVar, int i) {
        this.f = i;
        this.e = usbConnectionHelper;
        this.b = context;
        this.c = usbAccessory;
        this.a = z;
        this.d = sgjVar;
    }

    public /* synthetic */ jlk(AtomicBoolean atomicBoolean, Context context, UsbAccessory usbAccessory, xyc xycVar, boolean z, int i) {
        this.f = i;
        this.e = atomicBoolean;
        this.b = context;
        this.c = usbAccessory;
        this.d = xycVar;
        this.a = z;
    }

    public /* synthetic */ jlk(jll jllVar, CarInfoInternal carInfoInternal, xob xobVar, List list, boolean z, int i) {
        this.f = i;
        this.b = jllVar;
        this.c = carInfoInternal;
        this.d = xobVar;
        this.e = list;
        this.a = z;
    }

    public /* synthetic */ jlk(koo kooVar, boolean z, kom komVar, pay payVar, pba pbaVar, int i) {
        this.f = i;
        this.c = kooVar;
        this.a = z;
        this.b = komVar;
        this.d = payVar;
        this.e = pbaVar;
    }

    public /* synthetic */ jlk(xyc xycVar, zyb zybVar, zbi zbiVar, Context context, boolean z, int i) {
        this.f = i;
        this.c = xycVar;
        this.e = zybVar;
        this.d = zbiVar;
        this.b = context;
        this.a = z;
    }
}
