package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import com.google.android.gms.car.diagnostics.CriticalError;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.time.Duration;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final /* synthetic */ class ire implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ire(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v63, types: [java.lang.Object, jhf] */
    /* JADX WARN: Type inference failed for: r12v64, types: [java.lang.Object, jhf] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        UUID uuidFromString;
        switch (this.b) {
            case 0:
                irf irfVar = (irf) this.a;
                irfVar.a.a();
                ipy ipyVar = irfVar.b;
                if (ipyVar != null) {
                    ipyVar.a();
                    return;
                }
                return;
            case 1:
                Object obj = this.a;
                irb irbVar = (irb) obj;
                if (irbVar.u) {
                    ((ype) ((ype) irb.a.f()).ai((char) 1213)).u("The other thread is handling AudioRecord read error.");
                    return;
                }
                irbVar.u = true;
                iqc[] iqcVarArr = irbVar.v;
                iqc iqcVar = iqcVarArr[0];
                iqc iqcVar2 = iqcVarArr[1];
                if (iqcVar != null) {
                    iqcVar.f();
                }
                if (iqcVar2 != null) {
                    iqcVar2.f();
                }
                ((ype) ((ype) irb.a.f()).ai((char) 1212)).w("Schedule audio capture restart in %d millis.", 2000);
                new Handler(Looper.getMainLooper()).postDelayed(new ilp(obj, 20), 2000L);
                return;
            case 2:
                ((irv) this.a).b();
                return;
            case 3:
                yph yphVar = iso.a;
                ((ype) ((ype) yphVar.f()).ai((char) 1300)).u("Request android audio focus on exit");
                int iD = ((iso) this.a).d(1, new AudioAttributes.Builder().setUsage(1).setContentType(1).build());
                if (iD == 1 || iD == 2) {
                    return;
                }
                ((ype) ((ype) yphVar.g()).ai((char) 1301)).w("Request audio focus before exit failed: %d", iD);
                return;
            case 4:
                yph yphVar2 = iuc.a;
                ((ima) this.a).a(CriticalError.a(yze.PROTOCOL_BYEBYE_REQUESTED_BY_USER, yzf.BYEBYE_BY_USER));
                return;
            case 5:
                Object obj2 = this.a;
                iuo iuoVar = (iuo) obj2;
                synchronized (iuoVar.c) {
                    iuu iuuVar = ((iuo) obj2).b;
                    ((iuo) obj2).d = ((iuo) obj2).f(iuo.b(iuuVar), iuuVar);
                    uuidFromString = UUID.fromString(((iuo) obj2).d.g);
                }
                iuu iuuVar2 = iuoVar.b;
                jkk jkkVar = iuuVar2.p;
                if (jkkVar == null) {
                    ((ype) ((ype) iuu.a.h()).ai((char) 1360)).u("Unable to configure display before window manager init");
                } else {
                    iuw iuwVarA = iuuVar2.o.a();
                    iuwVarA.getClass();
                    jkkVar.t(iuwVarA, uuidFromString);
                }
                iuoVar.h.e(iuoVar.g());
                return;
            case 6:
                int iM = (int) acqy.m();
                Object obj3 = this.a;
                float thermalHeadroom = Build.VERSION.SDK_INT >= 30 ? ((ixn) ((ixs) obj3).l).a.getThermalHeadroom((int) Duration.ofSeconds(iM).toSeconds()) : Float.NaN;
                if (!Float.isNaN(thermalHeadroom) && thermalHeadroom >= BitmapDescriptorFactory.HUE_RED) {
                    ixs ixsVar = (ixs) obj3;
                    boolean z = ixsVar.B;
                    float f = ixsVar.A;
                    if (thermalHeadroom >= f) {
                        ixsVar.B = true;
                    } else if (thermalHeadroom < f * ((float) acqy.b())) {
                        ixsVar.B = false;
                    }
                    if (z != ixsVar.B) {
                        ((ype) ((ype) ixs.a.f()).ai(1525)).R("Thermal headroom throttling %s due to headroom: %f (threshold: %f)", Boolean.valueOf(ixsVar.B), Float.valueOf(thermalHeadroom), Float.valueOf(ixsVar.A));
                        if (ixsVar.B) {
                            ixsVar.C = SystemClock.elapsedRealtime();
                            ixsVar.i.e(yzz.CAR_SERVICE, yzy.vI);
                        } else {
                            ixsVar.i.f(yzz.CAR_SERVICE, yzy.vJ, ixsVar.C > 0 ? SystemClock.elapsedRealtime() - ixsVar.C : 0L);
                        }
                        ixsVar.d();
                    }
                }
                synchronized (((ixs) obj3).m) {
                    if (((ixs) obj3).G) {
                        ((ixs) obj3).p.postDelayed(this, acqy.n() * 1000);
                        return;
                    }
                    return;
                }
            case 7:
                ilb.e();
                Object obj4 = this.a;
                iya iyaVar = (iya) obj4;
                if (iyaVar.r() == null) {
                    ((ype) ((ype) iya.a.h()).ai((char) 1624)).u("ignoring request to cache outside of a projection session");
                    return;
                }
                tfk tfkVar = tfk.a;
                tfj tfjVar = tfj.GEARHEAD_CPV_PREFETCH_LAUNCHER_APPS;
                tfkVar.b(tfjVar);
                synchronized (iyaVar.e) {
                    yph yphVar3 = iya.a;
                    ((ype) yphVar3.l().ai(1622)).y("preCacheProjectionApps starting CI=%s", ((iya) obj4).d);
                    ynp ynpVarListIterator = iya.b.listIterator(0);
                    while (ynpVarListIterator.hasNext()) {
                        ixz ixzVar = (ixz) ynpVarListIterator.next();
                        ((iya) obj4).e(ixzVar.a, ixzVar.b);
                    }
                    ((ype) yphVar3.l().ai(1623)).u("preCacheProjectionApps done");
                }
                tfkVar.d(tfjVar, 1);
                iyaVar.f.countDown();
                return;
            case 8:
                iyl.a.f().ai(1640).u("car did not send byebye response. will quit.");
                iyl iylVar = (iyl) this.a;
                iylVar.h.aF(yze.CAR_NOT_RESPONDING, yzf.BYEBYE_TIMEOUT, "byebye timeout");
                ols.M(iylVar.c, yxi.PROJECTION_ENDED_BYEBYE_TIMEOUT);
                return;
            case 9:
                izl.a.l().ai(1673).u("onReceiverClosed: Posted READER_CLOSE on control channel's handler");
                ((izj) this.a).a(yzf.READER_CLOSE);
                return;
            case 10:
                Context context = (Context) this.a;
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
                if (wifiManager == null || connectivityManager == null) {
                    ols.M(context, yxi.WIRELESS_WIFI_FAILED_TO_GET_WIFI_INFO);
                    return;
                }
                if (!wifiManager.isWifiEnabled()) {
                    ols.M(context, yxi.WIRELESS_WIFI_STATE_DISABLED);
                    return;
                }
                ols.M(context, yxi.WIRELESS_WIFI_STATE_ENABLED);
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                if (connectionInfo == null || networkInfo == null || !networkInfo.isConnected()) {
                    ols.M(context, yxi.WIRELESS_WIFI_NOT_CONNECTED_TO_ANY_NETWORK);
                    return;
                } else {
                    ols.M(context, yxi.WIRELESS_WIFI_CONNECTED_TO_A_NETWORK);
                    ols.N(context, yxi.WIRELESS_WIFI_RSSI_SIGNAL_LEVEL, WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100));
                    return;
                }
            case 11:
                ((jcl) this.a).c();
                return;
            case 12:
                ((jdc) this.a).c();
                return;
            case 13:
                ((jdd) this.a).a();
                return;
            case 14:
                jov jovVar = (jov) this.a;
                if (!jovVar.c.compareAndSet(true, false)) {
                    ((ype) jov.a.l().ai((char) 2552)).u("MTMC byte counting not started, nothing to do on stop.");
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime() - jovVar.f;
                AtomicLong atomicLong = jovVar.d;
                AtomicLong atomicLong2 = jovVar.e;
                long j = atomicLong.get();
                long j2 = atomicLong2.get();
                rrb rrbVarH = rrc.h(yxy.CAR_SERVICE, yzz.CAR_SERVICE, yzy.tZ);
                abnp abnpVarN = yyu.a.n();
                abnpVarN.t();
                yyu yyuVar = (yyu) abnpVarN.b;
                yyuVar.b = 1 | yyuVar.b;
                yyuVar.c = j;
                abnpVarN.t();
                yyu yyuVar2 = (yyu) abnpVarN.b;
                yyuVar2.b = 2 | yyuVar2.b;
                yyuVar2.d = j2;
                abnpVarN.t();
                yyu yyuVar3 = (yyu) abnpVarN.b;
                yyuVar3.b |= 4;
                yyuVar3.e = jElapsedRealtime;
                rrbVarH.q = xxh.h((yyu) abnpVarN.q());
                jovVar.b.b((rrc) rrbVarH.l());
                ype ypeVar = (ype) ((ype) jov.a.f()).ai(2551);
                Long lValueOf = Long.valueOf(j);
                zjc zjcVar = zjc.a;
                ypeVar.R("MTMC byte counting stopped. Read %s bytes and wrote %s bytes over %s milliseconds.", new zjd(zjcVar, lValueOf), new zjd(zjcVar, Long.valueOf(j2)), new zjd(zjcVar, Long.valueOf(jElapsedRealtime)));
                return;
            case 15:
                jej jejVar = (jej) this.a;
                jejVar.a();
                jejVar.b.shutdownNow();
                return;
            case 16:
                yph yphVar4 = jfp.a;
                throw new jfo((Throwable) this.a);
            case 17:
                break;
            case 18:
                Choreographer.getInstance().postFrameCallback(((jgl) this.a).r);
                return;
            case 19:
                ?? r12 = this.a;
                ((ina) ((jgs) r12).c).al.d(r12);
                return;
            default:
                ?? r122 = this.a;
                ((ina) ((jgs) r122).c).al.c(r122);
                return;
        }
        while (true) {
            jfv jfvVar = (jfv) this.a;
            if (!jfvVar.c) {
                return;
            }
            try {
                Thread.sleep(((jfv) r0).d);
                jfvVar.y("2 | TIME: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(Calendar.getInstance().getTime()) + "\n");
                ArrayList arrayList = jfvVar.e;
                int size = arrayList.size();
                for (int i = 0; i < arrayList.size(); i++) {
                    jfs jfsVar = (jfs) arrayList.get(i);
                    jfsVar.b(jfvVar.b, jfsVar.a(jfvVar.d));
                    if (i < size - 1) {
                        try {
                            jfvVar.b.append((CharSequence) " | ");
                        } catch (IOException unused) {
                            ((ype) jfs.a.l().ai((char) 2002)).u("couldn't write to log file");
                        }
                    }
                }
                jfvVar.y("\n");
            } catch (InterruptedException unused2) {
                ((ype) jfv.a.l().ai((char) 2006)).u("Wifi reporting thread interrupted");
                return;
            }
        }
    }

    public ire(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
