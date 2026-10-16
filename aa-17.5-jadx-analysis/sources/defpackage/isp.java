package defpackage;

import android.app.Notification;
import android.bluetooth.BluetoothProfile;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.wifi.WifiInfo;
import android.os.Handler;
import android.util.SparseArray;
import androidx.car.app.serialization.Bundleable;
import com.google.android.apps.auto.components.bugreport.BugreportProjectionNotificationReceiver;
import com.google.android.apps.auto.components.bugreport.BugreportRequester;
import com.google.android.apps.auto.components.system.transcription.TranscriptionFragment;
import com.google.android.gearhead.appdecor.AppDecorService;
import com.google.android.gms.car.AudioFocusInfo;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.projection.gearhead.R;
import j$.lang.Iterable$EL;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class isp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public isp(fy fyVar, List list, List list2, int i, int i2) {
        this.e = i2;
        this.b = fyVar;
        this.c = list;
        this.d = list2;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22, types: [androidx.car.app.hardware.ICarHardwareResult, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [android.bluetooth.BluetoothProfile, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws PackageManager.NameNotFoundException {
        switch (this.e) {
            case 0:
                AudioAttributes audioAttributes = ((AudioFocusInfo) this.d).a;
                if (a.O()) {
                    Object obj = this.b;
                    Object obj2 = this.c;
                    ((ype) iqw.a.l().ai(1186)).R("onExternalAppLoseAudioFocus externalAppFocusChange: %s, audioClientPackageName: %s audioAttributes: %s", new zjd(zjc.a, epq.k(this.a)), obj2, audioAttributes);
                    iqw iqwVar = (iqw) ((isr) obj).b;
                    iqwVar.h();
                    iqwVar.i = null;
                    if (iqw.n((String) obj2, audioAttributes)) {
                        if (!acmd.G()) {
                            iqwVar.t--;
                            iqwVar.j(null);
                            break;
                        } else {
                            Iterable$EL.forEach(iqwVar.s, new iju(obj2, 9));
                            break;
                        }
                    }
                }
                break;
            case 1:
                ((fy) this.b).b.execute(new af(this, gi.a(new fx(this)), 7, (char[]) null));
                break;
            case 2:
                ((jkv) this.d).b((String) this.c, this.a, (WifiInfo) this.b, null, false);
                break;
            case 3:
                Object obj3 = this.d;
                jkv jkvVar = (jkv) obj3;
                jkvVar.d(yxi.WIRELESS_WIFI_LEGACY_NETWORK_REQUEST_FAILED_TIMEOUT);
                jkvVar.g();
                int i = jkvVar.f;
                int i2 = (int) aczv.i();
                if (i2 < 0) {
                    i2 = 2;
                }
                if (i != i2) {
                    Object obj4 = this.b;
                    int i3 = this.a;
                    Object obj5 = this.c;
                    ((ype) jkv.a.l().ai((char) 2274)).u("Timeout while requesting wifi network, retrying");
                    jkvVar.f++;
                    Handler handler = jkvVar.c;
                    isp ispVar = new isp(obj3, (String) obj5, i3, obj4, 2);
                    long j = aczv.j();
                    handler.postDelayed(ispVar, j >= 0 ? j : 1000L);
                    break;
                } else {
                    jkvVar.j.a(yze.PROTOCOL_IO_ERROR, yzf.WIFI_NETWORK_UNAVAILABLE, "Wifi network request failed - timeout");
                    jkvVar.d(yxi.WIRELESS_WIFI_LEGACY_NETWORK_REQUEST_FAILED_TIMEOUT_LAST_ATTEMPT);
                    ((ype) ((ype) jqj.a.f()).ai(2622)).T("Wifi socket connect event: status = %d, socket retry count = %s, network retry count = %s, error code = %d, connection time = %s ms", Integer.valueOf(2), null, Integer.valueOf(jkvVar.f), Integer.valueOf(303 == 0 ? 0 : 303 - 1), null);
                    break;
                }
            case 4:
                ype ypeVar = (ype) ((ype) jvu.c.f()).ai(2779);
                jvt jvtVar = (jvt) this.c;
                jvu jvuVar = jvtVar.a;
                String strB = jvuVar.b();
                int i4 = this.a;
                ypeVar.K("%s subscribed to car hardware result type=%d", strB, i4);
                ?? r1 = this.b;
                Object obj6 = this.d;
                if (i4 == 3) {
                    jvtVar.a(i4, (Bundleable) obj6, r1, null);
                    break;
                } else if (i4 == 4) {
                    jvtVar.a(i4, (Bundleable) obj6, r1, "com.google.android.gms.permission.CAR_FUEL");
                    break;
                } else if (i4 == 5) {
                    jvtVar.a(i4, (Bundleable) obj6, r1, "com.google.android.gms.permission.CAR_SPEED");
                    break;
                } else if (i4 == 6) {
                    jvtVar.a(i4, (Bundleable) obj6, r1, "com.google.android.gms.permission.CAR_MILEAGE");
                    break;
                } else {
                    switch (i4) {
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            if (!jvuVar.d) {
                                jvtVar.c(i4, r1);
                                break;
                            } else {
                                jvtVar.a(i4, (Bundleable) obj6, r1, "android.permission.ACCESS_FINE_LOCATION");
                                break;
                            }
                        default:
                            jvtVar.c(i4, r1);
                            break;
                    }
                }
            case 5:
                AtomicReference atomicReference = (AtomicReference) this.c;
                Object obj7 = atomicReference.get();
                obj7.getClass();
                if (((CharSequence) obj7).length() != 0) {
                    int i5 = this.a;
                    Object obj8 = this.d;
                    Context context = (Context) this.b;
                    Intent intent = (Intent) obj8;
                    Intent intentPutExtra = new Intent(context, (Class<?>) BugreportRequester.RetrieveBugreportReceiver.class).putExtra("android.intent.extra.SUBJECT", (String) atomicReference.get()).putExtra("EXTRA_BUGREPORT_SRC_FILE", intent.getStringExtra("EXTRA_BUGREPORT_SRC_FILE")).putExtra("EXTRA_BUGREPORT_DST_FILE", kgi.d(Instant.ofEpochMilli(intent.getLongExtra("EXTRA_HAPPENED_TIME", -1L)))).putExtra("EXTRA_HAPPENED_TIME", intent.getLongExtra("EXTRA_HAPPENED_TIME", -1L));
                    intentPutExtra.getClass();
                    mas.c();
                    dsx dsxVar = new dsx(context, "gearhead_surveys_and_feedback");
                    dsxVar.n(R.drawable.gs_android_auto_vd_24);
                    dsxVar.l();
                    dsxVar.i((CharSequence) atomicReference.get());
                    dsxVar.h(intent.getStringExtra("DESCRIPTION"));
                    dsxVar.g = wdu.c(context, i5, intentPutExtra, 201326592);
                    dsxVar.e(16, true);
                    Notification notificationA = dsxVar.a();
                    notificationA.getClass();
                    new dug(context).b(null, i5, notificationA);
                    Intent intentPutExtra2 = new Intent(context, (Class<?>) BugreportProjectionNotificationReceiver.class).setAction("START_NOTIFICATION").putExtra("EXTRA_TRANSCRIBED_TITLE", (String) atomicReference.get()).putExtra("android.intent.extra.SUBJECT", intent.getStringExtra("android.intent.extra.SUBJECT")).putExtra("TRUNCATED_SUBJECT", intent.getStringExtra("TRUNCATED_SUBJECT")).putExtra("DESCRIPTION", intent.getStringExtra("DESCRIPTION")).putExtra("EXTRA_HAPPENED_TIME", intent.getLongExtra("EXTRA_HAPPENED_TIME", -1L)).putExtra("EXTRA_NOTIFICATION_ID", i5).putExtra("EXTRA_BUGREPORT_SRC_FILE", intent.getStringExtra("EXTRA_BUGREPORT_SRC_FILE")).putExtra("EXTRA_BUGREPORT_DST_FILE", intent.getStringExtra("EXTRA_BUGREPORT_DST_FILE"));
                    intentPutExtra2.getClass();
                    context.sendBroadcast(intentPutExtra2);
                    break;
                }
                break;
            case 6:
                ((obs) this.c).f((Context) this.d, (ComponentName) this.b, this.a, 0);
                break;
            case 7:
                odg odgVar = ((odf) this.d).a;
                TranscriptionFragment transcriptionFragmentA = odgVar.a();
                if (transcriptionFragmentA == null) {
                    odgVar.b();
                    break;
                } else {
                    transcriptionFragmentA.a((String) this.c, this.a, (Bitmap) this.b, null);
                    break;
                }
            case 8:
                ((ozb) this.c).e.closeProfileProxy(this.a, this.b);
                ((oza) this.d).d.shutdown();
                break;
            case 9:
                Object obj9 = this.c;
                pcs pcsVar = (pcs) this.d;
                pcsVar.e = (String) obj9;
                pcsVar.f = this.a;
                pcsVar.g = (WifiInfo) this.b;
                pcsVar.e(true);
                pcsVar.h = true;
                break;
            case 10:
                pgr pgrVar = (pgr) this.d;
                Iterator it = pgrVar.n.iterator();
                while (it.hasNext()) {
                    pgrVar.B.d(new ode(pgrVar, (pah) it.next(), (String) this.c, this.a, (WifiInfo) this.b, 2));
                }
                break;
            case 11:
                ype ypeVar2 = (ype) ((ype) pgr.a.f()).ai(6470);
                int i6 = this.a;
                Object obj10 = this.c;
                ypeVar2.K("Connected to desired WiFi network: connect to %s:%d", obj10, i6);
                ozt oztVar = ((pgb) this.d).a;
                woy.aa(oztVar instanceof pcs, "onReadyForProjectionInitiation was reachable without legacy network manager");
                pcs pcsVar2 = (pcs) oztVar;
                pcsVar2.b.post(new isp(pcsVar2, (String) obj10, i6, this.b, 9));
                break;
            case 12:
                obs obsVarA = obs.a();
                Context context2 = mki.a.c;
                ComponentName componentName = (ComponentName) new ntn(this.b).i(AppDecorService.b);
                CarRegionId carRegionId = ((raa) this.d).a;
                obsVarA.e(context2, componentName, this.c, this.a, nsr.c().a(carRegionId.h).k(carRegionId));
                break;
            case 13:
                SparseArray sparseArray = rnw.a;
                Object obj11 = this.b;
                Object obj12 = this.d;
                int i7 = this.a;
                Object obj13 = this.c;
                if (omc.c("CAR.PROJECTION.CAHI", 3)) {
                    rrd.d(3, "CAR.PROJECTION.CAHI", null, "%s onVideoConfigurationChange(%s, %s, %s)", ((rnw) obj13).t, Integer.valueOf(i7), obj12, obj11);
                }
                rnw rnwVar = (rnw) obj13;
                if (rnwVar.y()) {
                    DrawingSpec drawingSpec = (DrawingSpec) obj12;
                    rnwVar.B = drawingSpec;
                    Configuration configuration = (Configuration) obj11;
                    rnwVar.o = configuration;
                    rnwVar.x();
                    rnwVar.p = true;
                    if (rnwVar.I != null) {
                        if ((configuration.uiMode & 48) != (rnwVar.f.getResources().getConfiguration().uiMode & 48)) {
                            if (omc.c("CAR.PROJECTION.CAHI", 3)) {
                                rrd.d(3, "CAR.PROJECTION.CAHI", null, "%s Configuration in onVideoConfigurationChange does not match context.", rnwVar.t);
                            }
                            rnwVar.v(rnwVar.f.getResources());
                        }
                        if (((~rnwVar.q) & i7) != 0) {
                            rnwVar.r();
                            rnwVar.q();
                            break;
                        } else {
                            if (rnwVar.w.p(raj.G)) {
                                rnwVar.u(rnwVar.k.i());
                                rnwVar.w();
                                rnwVar.I.d(rnwVar.k.i().getResources().getConfiguration());
                            } else {
                                rnwVar.v(rnwVar.k.b().getResources());
                                rnwVar.w();
                                rnwVar.I.d(rnwVar.k.b().getResources().getConfiguration());
                            }
                            if (obj12 != null) {
                                rnwVar.s(drawingSpec);
                            }
                            rnwVar.q();
                            break;
                        }
                    } else {
                        if (obj12 != null) {
                            rnwVar.s(drawingSpec);
                        }
                        rnwVar.q();
                        break;
                    }
                }
                break;
            case 14:
                Object obj14 = this.d;
                sbm sbmVar = (sbm) obj14;
                sbmVar.d();
                if (sbmVar.j != 2) {
                    Object obj15 = this.b;
                    int i8 = this.a;
                    Object obj16 = this.c;
                    sbm.a.l().ai(8692).u("Timeout while requesting wifi network, retrying");
                    sbmVar.j++;
                    sbmVar.e.postDelayed(new isp(obj14, (String) obj16, i8, obj15, 15), 1000L);
                    break;
                } else {
                    sbmVar.d.e(yze.PROTOCOL_IO_ERROR, yzf.WIFI_NETWORK_UNAVAILABLE, "Wifi network request failed - timeout");
                    sbmVar.m.g(2, null, Integer.valueOf(sbmVar.j), 303, null);
                    break;
                }
            default:
                ((sbm) this.d).b((String) this.c, this.a, (WifiInfo) this.b, null, false);
                break;
        }
    }

    public /* synthetic */ isp(isr isrVar, int i, String str, AudioFocusInfo audioFocusInfo, int i2) {
        this.e = i2;
        this.b = isrVar;
        this.a = i;
        this.c = str;
        this.d = audioFocusInfo;
    }

    public /* synthetic */ isp(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.e = i2;
        this.c = obj;
        this.a = i;
        this.d = obj2;
        this.b = obj3;
    }

    public /* synthetic */ isp(Object obj, String str, int i, Object obj2, int i2) {
        this.e = i2;
        this.d = obj;
        this.c = str;
        this.a = i;
        this.b = obj2;
    }

    public /* synthetic */ isp(AtomicReference atomicReference, Context context, Intent intent, int i, int i2) {
        this.e = i2;
        this.c = atomicReference;
        this.b = context;
        this.d = intent;
        this.a = i;
    }

    public /* synthetic */ isp(obs obsVar, Context context, ComponentName componentName, int i, int i2) {
        this.e = i2;
        this.c = obsVar;
        this.d = context;
        this.b = componentName;
        this.a = i;
    }

    public /* synthetic */ isp(ozb ozbVar, int i, BluetoothProfile bluetoothProfile, oza ozaVar, int i2) {
        this.e = i2;
        this.c = ozbVar;
        this.a = i;
        this.b = bluetoothProfile;
        this.d = ozaVar;
    }

    public /* synthetic */ isp(raa raaVar, ComponentName componentName, CharSequence charSequence, int i, int i2) {
        this.e = i2;
        this.d = raaVar;
        this.b = componentName;
        this.c = charSequence;
        this.a = i;
    }
}
