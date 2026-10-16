package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.net.Network;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.TouchEventCompleteData;
import com.google.android.gms.carsetup.CarSetupServiceImpl;
import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final /* synthetic */ class rpo implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rpo(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, rwp] */
    /* JADX WARN: Type inference failed for: r14v46, types: [java.lang.Object, rxh] */
    /* JADX WARN: Type inference failed for: r14v69, types: [java.lang.Object, sbn] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Pair pair;
        Pair pairD;
        int i = -1;
        switch (this.c) {
            case 0:
                Object obj = this.b;
                rps rpsVar = (rps) this.a;
                if (rpsVar.e.contains(obj)) {
                    ((rpp) obj).a(rpsVar.g, rpsVar.h);
                    return;
                }
                return;
            case 1:
                Object obj2 = this.a;
                rnw rnwVar = (rnw) obj2;
                if (rnwVar.I != null) {
                    Object obj3 = this.b;
                    if (rnwVar.y()) {
                        pair = rnwVar.b;
                        ror rorVar = rnwVar.k;
                        if (rorVar != null && (pairD = rorVar.d((MotionEvent) obj3)) != null) {
                            pair = pairD;
                        }
                    } else {
                        pair = rnwVar.b;
                    }
                    if (omc.c("CAR.PROJECTION.CAHI", 2)) {
                        rrd.d(2, "CAR.PROJECTION.CAHI", null, "%s.onMotionEvent(%s) hint=%s", rnwVar.t, obj3, pair);
                    }
                    ols olsVar = rnwVar.K;
                    int iIntValue = ((Integer) pair.first).intValue();
                    rom romVar = (rom) pair.second;
                    if (romVar != null) {
                        try {
                            i = romVar.b;
                        } catch (RemoteException unused) {
                            rnwVar.t();
                            return;
                        }
                    }
                    Rect rect = romVar != null ? romVar.c : null;
                    qxy qxyVar = ((rnw) obj2).i;
                    if (qxyVar != null) {
                        qxyVar.l(new TouchEventCompleteData(iIntValue, rect, i));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                xnz xnzVar = ((xoc) this.a).c;
                if (xnzVar == null) {
                    xnzVar = xnz.a;
                }
                ruv[] ruvVarArr = ((ruw) ((rta) this.b).y.a).g;
                if (ruvVarArr == null) {
                    throw new IllegalStateException("Service updated before service discovery");
                }
                for (ruv ruvVar : ruvVarArr) {
                    if (ruvVar.a == xnzVar.c) {
                        Object obj4 = ruvVar.d;
                        if (obj4 instanceof rsn) {
                            ((rsn) obj4).a();
                            return;
                        } else {
                            if (obj4 == null) {
                                throw new IllegalStateException("Service updated before service discovery is complete");
                            }
                            ruw.a.h().ai(8345).y("Attempted to update a service that is not updatable: %s", xnzVar);
                            return;
                        }
                    }
                }
                throw new IllegalArgumentException("Updating a service that was not registered during service discovery");
            case 3:
                ((rvx) this.b).d.h((ByteBuffer) this.a);
                return;
            case 4:
                rxf.l((Context) this.b, (yxo) this.a);
                return;
            case 5:
                Object obj5 = this.b;
                ypf ypfVar = rxf.a;
                okx okxVarQ = rxi.q((Context) obj5);
                Object obj6 = this.a;
                Object obj7 = rxk.b;
                Object obj8 = ((ykd) obj6).a;
                synchronized (obj7) {
                    if (!okxVarQ.d) {
                        rxk.a.h().ai(8478).u("Troubleshooter Feedback Reporting not enabled, killing startup.");
                        return;
                    }
                    ykd ykdVar = new ykd(obj8, null);
                    rxm.a.l().ai(8499).u("Creating bug report thread.");
                    rxn rxnVar = new rxn(ykdVar);
                    rxnVar.start();
                    ((rxk) obj8).f = xxh.h(rxnVar);
                    return;
                }
            case 6:
                rxf.m((Context) this.b, (yxo) this.a);
                return;
            case 7:
                Object obj9 = this.b;
                ypf ypfVar2 = rxf.a;
                Object obj10 = this.a;
                obj10.getClass();
                rxf.a.l().ai(8468).u("Updating troubleshooter parameters");
                Uri uriBuild = rxj.a.buildUpon().appendPath("parameters").build();
                ContentValues contentValues = new ContentValues();
                contentValues.put("troubleshooter_parameters", ((abmd) obj10).h());
                rxf.o((Context) obj9, new rxb(uriBuild, contentValues, 0));
                return;
            case 8:
                rxf.k((Context) this.b, "cancel_notification_for_persistent_detector", (yxo) this.a);
                return;
            case 9:
                rxf.k((Context) this.b, "show_notification_for_persistent_detector", (yxo) this.a);
                return;
            case 10:
                Context context = ((rxg) this.b).b.d;
                okx okxVarQ2 = rxi.q(context);
                if (okxVarQ2.c) {
                    this.a.a(rxi.r(context), okxVarQ2);
                    return;
                }
                return;
            case 11:
                Object obj11 = this.a;
                rxl rxlVar = (rxl) obj11;
                ypf ypfVar3 = rxlVar.a;
                yop yopVarAi = ypfVar3.l().ai(8482);
                Object obj12 = this.b;
                oky okyVar = (oky) obj12;
                yopVarAi.y("Collecting bug report for issue %s.", okyVar.c);
                try {
                    ypfVar3.l().ai(8484).M("Finished collecting bug report for issue %s, file stored to %s.", ((oky) obj12).c, ((rxl) obj11).c.b(((oky) obj12).c, true));
                    rxf.n(((rxl) obj11).b, (oky) obj12, 5);
                    return;
                } catch (IOException e) {
                    yop yopVarAi2 = rxlVar.a.h().p(e).ai(8483);
                    yxo yxoVarB = yxo.b(okyVar.d);
                    if (yxoVarB == null) {
                        yxoVarB = yxo.DETECTOR_TYPE_UNSPECIFIED;
                    }
                    yopVarAi2.y("FAILED TO COLLECT BUG REPORT FOR ISSUE. TYPE: %s", yxoVarB.name());
                    return;
                }
            case 12:
                rzx rzxVar = (rzx) ((qzb) this.a).a.get();
                if (rzxVar != null) {
                    Object obj13 = this.b;
                    if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
                        rrd.d(3, "CAR.CLIENT.WM.WIN", null, "%s onWindowAttributesChanged(attrs: %s)", rzxVar.a, obj13);
                    }
                    ror rorVar2 = rzxVar.g;
                    if (rorVar2 != null) {
                        rorVar2.w(((CarWindowManagerLayoutParams) obj13).a);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                rzx rzxVar2 = (rzx) ((qzb) this.a).a.get();
                if (rzxVar2 != null) {
                    rzxVar2.p((Rect) this.b);
                    return;
                }
                return;
            case 14:
                Object obj14 = this.b;
                Object obj15 = this.a;
                if (rrd.e("CAR.CLIENT.WM.WIN", 2)) {
                    rrd.d(2, "CAR.CLIENT.WM.WIN", null, "%s onKeyEvent(keyEvent:%s)", ((qzb) obj15).a(), obj14);
                }
                rzx rzxVar3 = (rzx) ((qzb) obj15).a.get();
                if (rzxVar3 != null) {
                    if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
                        rrd.d(3, "CAR.CLIENT.WM.WIN", null, "%s onKeyEvent(%s)", rzxVar3.a, obj14);
                    }
                    Pair pair2 = new Pair(false, null);
                    ror rorVar3 = rzxVar3.g;
                    if (rorVar3 != null) {
                        pair2 = rorVar3.c((KeyEvent) obj14);
                    }
                    if (rzxVar3.g == null || pair2 == null || !((Boolean) pair2.first).booleanValue()) {
                        rzxVar3.d(false, pair2 != null ? (rom) pair2.second : null);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                rzx rzxVar4 = (rzx) ((qzb) this.a).a.get();
                if (rzxVar4 != null) {
                    rzxVar4.m((DrawingSpec) this.b, null);
                    return;
                }
                return;
            case 16:
                Object obj16 = this.a;
                if (rrd.e("CAR.CLIENT.WM.WIN", 2)) {
                    rrd.d(2, "CAR.CLIENT.WM.WIN", null, "%s onMotionEvent() Post to CarWindow", ((qzb) obj16).a());
                }
                rzx rzxVar5 = (rzx) ((qzb) obj16).a.get();
                if (rzxVar5 != null) {
                    ror rorVar4 = rzxVar5.g;
                    if (rorVar4 == null) {
                        rzxVar5.j(-1, null);
                        return;
                    }
                    Pair pairD2 = rorVar4.d((MotionEvent) this.b);
                    if (pairD2 != null) {
                        rzxVar5.j(((Integer) pairD2.first).intValue(), (rom) pairD2.second);
                        return;
                    } else {
                        rzxVar5.j(-1, null);
                        return;
                    }
                }
                return;
            case 17:
                Bundle bundle = (Bundle) this.b;
                String string = bundle.getString("PARAM_HOST_ADDRESS");
                int i2 = bundle.getInt("PARAM_SERVICE_PORT", -1);
                WifiInfo wifiInfo = (WifiInfo) bundle.getParcelable("wifi_info");
                Network network = (Network) bundle.getParcelable("PARAM_SERVICE_WIFI_NETWORK");
                boolean z = bundle.getBoolean("WIFI_Q_ENABLED");
                CarSetupServiceImpl.a.f().ai(8654).S("Start wifi setup %s:%s isUsingQNetworkStack=%b wifiInfo=(%s)", string, Integer.valueOf(i2), Boolean.valueOf(z), wifiInfo);
                ?? r14 = this.a;
                CarSetupServiceImpl carSetupServiceImpl = (CarSetupServiceImpl) r14;
                sbm sbmVar = carSetupServiceImpl.n;
                ypf ypfVar4 = sbm.a;
                ypfVar4.l().ai(8690).u("init");
                if (sbmVar.h) {
                    ypfVar4.g().ai(8691).u("Already initialized");
                } else {
                    sbmVar.d = r14;
                    sbmVar.f = Executors.newScheduledThreadPool(1);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.wifi.STATE_CHANGE");
                    dup.e(sbmVar.b, sbmVar.l, intentFilter, null, 2);
                    sbmVar.j = 0;
                    sbmVar.h = true;
                }
                carSetupServiceImpl.n.b(string, i2, wifiInfo, network, z);
                return;
            case 18:
                ParcelFileDescriptor parcelFileDescriptorFromSocket = ParcelFileDescriptor.fromSocket((Socket) this.a);
                ((CarSetupServiceImpl) this.b).h(new sas(parcelFileDescriptorFromSocket, parcelFileDescriptorFromSocket), parcelFileDescriptorFromSocket, parcelFileDescriptorFromSocket, true);
                return;
            case 19:
                Object obj17 = this.a;
                CarSetupServiceImpl carSetupServiceImpl2 = (CarSetupServiceImpl) obj17;
                if (carSetupServiceImpl2.m()) {
                    return;
                }
                Object obj18 = this.b;
                woy.aa(((Boolean) carSetupServiceImpl2.p.gu()).booleanValue(), "Unable to handoff car connection and not configured to fall back to GMS Core.");
                carSetupServiceImpl2.w.post(new rpo(obj17, obj18, 17));
                return;
            default:
                ?? r0 = this.b;
                Object obj19 = this.a;
                if (r0 == 0) {
                    CarSetupServiceImpl carSetupServiceImpl3 = ((sat) obj19).d;
                    carSetupServiceImpl3.e(yze.PROTOCOL_WRONG_CONFIGURATION, yzf.NO_SENSORS, "No sensors");
                    carSetupServiceImpl3.k();
                    return;
                }
                sat satVar = (sat) obj19;
                if (satVar.o) {
                    CarSetupServiceImpl carSetupServiceImpl4 = satVar.d;
                    ypf ypfVar5 = CarSetupServiceImpl.a;
                    carSetupServiceImpl4.x.d(r0);
                    if (carSetupServiceImpl4.i != null) {
                        carSetupServiceImpl4.g();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ rpo(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
