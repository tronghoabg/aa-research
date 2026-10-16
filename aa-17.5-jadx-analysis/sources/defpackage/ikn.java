package defpackage;

import android.bluetooth.BluetoothDevice;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.apps.auto.components.config.phenotype.receiver.FlagUpdaterReceiver;
import com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver;
import com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable;
import com.google.android.projection.gearhead.companion.devsettings.AppQualityTesterActivity;
import j$.util.Map;
import j$.util.Optional;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import org.chromium.net.UrlRequest;

/* loaded from: classes.dex */
public final class ikn implements zge {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ikn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        switch (this.b) {
            case 0:
                ((ype) ((ype) ikp.a.l().p(th)).ai(180)).u("Failed to extract RadioProgramInfo for onFavoriteListUpdate");
                break;
            case 1:
                ((ype) ((ype) ikp.a.l().p(th)).ai(175)).u("Failed to extract RadioProgramInfo for onProgramListUpdate");
                break;
            case 2:
                th.getClass();
                ((ype) ((ype) FlagUpdaterReceiver.a.h()).p(th)).u("Failed to load flags from snapshot");
                ((mmc) this.a).i();
                break;
            case 3:
                if (!(th instanceof CancellationException)) {
                    ((ype) ((ype) ((ype) kpn.a.g()).p(th)).ai((char) 3334)).u("Error checking connectivity state");
                    ((kpn) this.a).n = true;
                    break;
                } else {
                    yph yphVar = kpn.a;
                    break;
                }
            case 4:
                ((ype) ((ype) ((ype) kql.a.h()).p(th)).ai((char) 3379)).u("Could not get persisted data");
                break;
            case 5:
                ((ype) ((ype) ((ype) kyw.a.h()).p(th)).ai((char) 3556)).u("Failure getting Assistant stored data");
                break;
            case 6:
                ((ype) ((ype) ((ype) kyw.a.h()).p(th)).ai((char) 3557)).u("Failure getting Assistant stored data");
                break;
            case 7:
                ((ype) ((ype) ((ype) kyw.a.h()).p(th)).ai((char) 3558)).u("Failure marking impression in Assistant stored data");
                break;
            case 8:
                ((ype) ((ype) ((ype) kyw.a.h()).p(th)).ai((char) 3560)).u("Failure marking impression in Assistant stored data");
                break;
            case 9:
                yph yphVar2 = mjm.a;
                ((mjl) this.a).e.a();
                break;
            case 10:
                ((ype) ((ype) ((ype) onu.a.g()).p(th)).ai((char) 6060)).u("Failed to retrieve weather, error thrown.");
                ((onu) this.a).i();
                break;
            case 11:
                ((ype) ((ype) ((ype) WifiBluetoothReceiver.a.g()).p(th)).ai((char) 6151)).u("Rfcomm trial failed.");
                break;
            case 12:
                ((ype) ((ype) ((ype) WifiBluetoothReceiver.a.h()).p(th)).ai(6153)).y("Unable to get WiFi config for %s", this.a);
                break;
            case 13:
                ((dnw) this.a).d(th);
                break;
            case 14:
                if (th instanceof CancellationException) {
                    ((UrlRequest) this.a).cancel();
                    break;
                }
                break;
            case 15:
                if (th instanceof CancellationException) {
                    ((UrlRequest) this.a).cancel();
                    break;
                }
                break;
            case 16:
                ryc.a.h().p(th).ai(8542).u("Could not get persisted data");
                break;
            case 17:
                break;
            case 18:
                ((AppQualityTesterActivity) this.a).u.setEnabled(true);
                ((ype) ((ype) ((ype) AppQualityTesterActivity.m.h()).p(th)).ai((char) 9953)).u("Unable to access test results with error");
                break;
            case 19:
                ((ador) this.a).f(th);
                break;
            default:
                ((ador) this.a).f(th);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, qye] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, qye] */
    @Override // defpackage.zge
    public final /* synthetic */ void b(Object obj) {
        List list;
        List list2;
        int i = 0;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                List list3 = (List) obj;
                ikp ikpVar = (ikp) obj2;
                if (!ikpVar.c) {
                    ((ype) ikp.a.l().ai((char) 181)).u("Car no longer connected");
                    ikp.C(list3);
                    return;
                }
                synchronized (ikpVar.e) {
                    list = ((ikp) obj2).l;
                    ((ikp) obj2).l = list3;
                }
                ikp ikpVar2 = (ikp) this.a;
                if (ikpVar2.c) {
                    yfq yfqVarI = ikpVar2.i();
                    int size = yfqVarI.size();
                    while (i < size) {
                        ikf ikfVar = (ikf) yfqVarI.get(i);
                        if (ikpVar2.c) {
                            try {
                                ikfVar.a.e(list3);
                            } catch (RemoteException e) {
                                ((ype) ((ype) ((ype) ikp.a.h()).p(e)).ai((char) 184)).u("Error calling onFavoriteListUpdate()");
                            }
                            i++;
                        }
                    }
                }
                ikp.C(list);
                return;
            case 1:
                Object obj3 = this.a;
                List list4 = (List) obj;
                ikp ikpVar3 = (ikp) obj3;
                if (!ikpVar3.c) {
                    ((ype) ikp.a.l().ai((char) 176)).u("Car no longer connected");
                    ikp.C(list4);
                    return;
                }
                synchronized (ikpVar3.e) {
                    list2 = ((ikp) obj3).k;
                    ((ikp) obj3).k = list4;
                }
                ikp ikpVar4 = (ikp) this.a;
                if (ikpVar4.c) {
                    yfq yfqVarI2 = ikpVar4.i();
                    int size2 = yfqVarI2.size();
                    while (i < size2) {
                        ikf ikfVar2 = (ikf) yfqVarI2.get(i);
                        if (ikpVar4.c) {
                            try {
                                ikfVar2.a.h(list4);
                            } catch (RemoteException e2) {
                                ((ype) ((ype) ((ype) ikp.a.h()).p(e2)).ai((char) 187)).u("Error calling onProgramListUpdate()");
                            }
                            i++;
                        }
                    }
                }
                ikp.C(list2);
                return;
            case 2:
                ((ype) FlagUpdaterReceiver.a.f()).u("Successfully loaded flags from snapshot");
                ((mmc) this.a).i();
                return;
            case 3:
                Boolean bool = (Boolean) obj;
                ((ype) ((ype) kpn.a.f()).ai((char) 3336)).y("connectivity state updated: %s", bool);
                boolean zBooleanValue = bool.booleanValue();
                kpn kpnVar = (kpn) this.a;
                kpnVar.n = zBooleanValue;
                kpnVar.j = kpn.p();
                return;
            case 4:
                wic wicVar = (wic) obj;
                kql kqlVar = (kql) this.a;
                int i2 = kqlVar.j;
                if (i2 == 0) {
                    throw null;
                }
                if (i2 != 3) {
                    long j = wicVar.a;
                    if (j != -1) {
                        kqlVar.c(j);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((kyw) this.a).t.m(Boolean.valueOf(((kwz) obj).c));
                return;
            case 6:
                ((kyw) this.a).t.m(Boolean.valueOf(((kwz) obj).c));
                return;
            case 7:
                ((ype) ((ype) kyw.a.f()).ai((char) 3559)).u("Marked Assistant media recommendation impression");
                ((kyw) this.a).t.m(true);
                return;
            case 8:
                ((ype) ((ype) kyw.a.f()).ai((char) 3561)).u("Marked Assistant media recommendation impression");
                ((kyw) this.a).t.m(true);
                return;
            case 9:
                if (((Integer) obj).intValue() != 1) {
                    ((mjl) this.a).e.a();
                    return;
                }
                return;
            case 10:
                onv onvVar = (onv) obj;
                if (onvVar == null) {
                    ((ype) ((ype) onu.a.h()).ai((char) 6061)).u("Failed to retrieve weather, data null.");
                    ((onu) this.a).i();
                    return;
                }
                yph yphVar = onu.a;
                onu onuVar = (onu) this.a;
                onuVar.d.m(onvVar);
                onu.f(yzy.Bn);
                onuVar.g(aczg.b());
                return;
            case 11:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Object obj4 = this.a;
                if (zBooleanValue2) {
                    kfl.g().g(yxi.WIRELESS_BT_RECEIVER_RFCOMM_AFTER_FAILED_SDP_QUERY_SUCCEED, oyl.a((BluetoothDevice) obj4), SystemClock.elapsedRealtime());
                    return;
                } else {
                    kfl.g().g(yxi.WIRELESS_BT_RECEIVER_RFCOMM_AFTER_FAILED_SDP_QUERY_FAILED, oyl.a((BluetoothDevice) obj4), SystemClock.elapsedRealtime());
                    return;
                }
            case 12:
                Optional optional = (Optional) obj;
                mla mlaVar = new mla(this.a, 9);
                if (true != optional.isPresent()) {
                    return;
                }
                Object obj5 = optional.get();
                Object obj6 = mlaVar.a;
                ozf.b().d((BluetoothDevice) obj6).c(new oez(obj6, 17), mki.a.d);
                return;
            case 13:
                ((dnw) this.a).b((oyn) obj);
                return;
            case 14:
                return;
            case 15:
                return;
            case 16:
                wic wicVar2 = (wic) obj;
                ryc rycVar = (ryc) this.a;
                int i3 = rycVar.o;
                if (i3 == 0) {
                    throw null;
                }
                if (i3 != 3) {
                    long j2 = wicVar2.a;
                    if (j2 != -1) {
                        rycVar.h(j2);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                SamplerDecisionParcelable samplerDecisionParcelable = (SamplerDecisionParcelable) obj;
                WeakHashMap weakHashMap = sjn.b;
                synchronized (weakHashMap) {
                    Map.EL.putIfAbsent(weakHashMap, Integer.valueOf(((sjn) this.a).c.hashCode()), samplerDecisionParcelable);
                }
                return;
            case 18:
                yfq yfqVar = (yfq) obj;
                AppQualityTesterActivity appQualityTesterActivity = (AppQualityTesterActivity) this.a;
                appQualityTesterActivity.u.setEnabled(true);
                appQualityTesterActivity.r = yfq.y(yfqVar);
                appQualityTesterActivity.s.b(appQualityTesterActivity.r);
                yph yphVar2 = AppQualityTesterActivity.m;
                ((ype) ((ype) yphVar2.f()).ai(9954)).y("Component Name : %s", appQualityTesterActivity.q);
                int size3 = yfqVar.size();
                while (i < size3) {
                    ((ype) ((ype) yphVar2.f()).ai(9955)).y("%s", (kev) yfqVar.get(i));
                    i++;
                }
                return;
            case 19:
                ((ador) this.a).h((adnq) obj);
                return;
            default:
                ((ador) this.a).d((adnq) obj);
                return;
        }
    }
}
