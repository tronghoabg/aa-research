package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.telecom.CallAudioState;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ofb implements odk {
    public static final yph a = yph.c("GH.LocalICSCallAdapter");
    public ogf c;
    public Handler e;
    public int i;
    public int j;
    private Context m;
    private TelephonyManager n;
    private boolean o;
    private ofa p;
    private mpb q;
    private ComponentName r;
    private int s;
    public final List b = new CopyOnWriteArrayList();
    public final ogr k = new ogr(this);
    private final Runnable l = new nwg(this, 3);
    public boolean d = false;
    public final Map f = new HashMap();
    public final Map g = new HashMap();
    public final Map h = new HashMap();
    private final ServiceConnection t = new oex(this);

    public static void A(yzy yzyVar, boolean z, ComponentName componentName) {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, yzyVar);
        if (componentName != null) {
            rrbVarH.p(componentName);
        }
        E(rrbVarH, z);
    }

    private static void E(rrb rrbVar, boolean z) {
        if (z) {
            rrbVar.v(zaa.TELECOM_ICS_API_FAILURE);
        }
        ebf.j().F(rrbVar.l());
    }

    private final void F(boolean z) {
        ogf ogfVar;
        if (!this.d || (ogfVar = this.c) == null) {
            ((ype) ((ype) a.g()).ai(5773)).Q("setMuted - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogfVar.x(z);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5774)).u("Error calling ICarCall.setMuted.");
        }
    }

    private final boolean G(CarCall carCall) {
        ogf ogfVar;
        boolean zE = false;
        if (!mcd.A().t(carCall)) {
            return false;
        }
        if (!acqd.m()) {
            Bundle bundle = carCall.f.j;
            if (bundle == null) {
                return false;
            }
            boolean z = bundle.getBoolean("android.telecom.extra.USE_LOCAL_CALL_SILENCE_CAPABILITY");
            TimeUnit.SECONDS.getClass();
            return z;
        }
        if (this.d && (ogfVar = this.c) != null) {
            try {
                zE = ogfVar.E(carCall);
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5735)).u("Cannot fetch VoipLocalCallSilence support.");
            }
            TimeUnit.SECONDS.getClass();
        }
        return zE;
    }

    public static void z(yyv yyvVar, boolean z, ComponentName componentName) {
        rqu rquVarH = rqv.h(yxy.GEARHEAD, 37, yyvVar);
        if (z) {
            rquVarH.i(yyw.CM_ADAPTER_API_FAILURE);
        }
        if (componentName != null) {
            rquVarH.g(componentName.flattenToShortString());
        }
        ebf.j().F(rquVarH.l());
    }

    public final void B() {
        if (this.o) {
            return;
        }
        ((ype) ((ype) a.f()).ai((char) 5758)).u("enabling duplex ics in :projection");
        odn.a().S(this.m, thf.a);
        this.o = true;
        y();
    }

    public final boolean C() {
        ogf ogfVar;
        if (!this.d || (ogfVar = this.c) == null) {
            return false;
        }
        try {
            return ogfVar.B();
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5750)).u("Error calling ICarCall.getMuted.");
            return false;
        }
    }

    public final boolean D(CarCall carCall) {
        if ((carCall.f.i & 256) != 256) {
            return true;
        }
        if (!mcd.A().u()) {
            return false;
        }
        String packageName = mcd.A().b(carCall).getPackageName();
        if (mcd.A().s(this.m, packageName)) {
            return true;
        }
        if (!mcd.A().q(packageName)) {
            return false;
        }
        TimeUnit.MINUTES.getClass();
        return true;
    }

    @Override // defpackage.odk
    public final int a() {
        ogf ogfVar;
        if (!this.d || (ogfVar = this.c) == null) {
            ((ype) ((ype) a.g()).ai(5742)).Q("getAudioRoute - not actioning - bound: %b, null: %b", this.d, this.c == null);
        } else {
            try {
                int iE = ogfVar.e();
                if (iE != 0) {
                    return iE;
                }
                return 2;
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5743)).u("Error calling ICarCall.getAudioRoute.");
            }
        }
        return 2;
    }

    @Override // defpackage.odk
    public final int b() {
        ogf ogfVar;
        if (!this.d || (ogfVar = this.c) == null) {
            ((ype) ((ype) a.g()).ai(5751)).Q("getSupportedAudioRouteMask - not actioning - bound: %b, null: %b", this.d, this.c == null);
        } else {
            try {
                return ogfVar.f();
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5752)).u("Error calling ICarCall.getSupportedAudioRouteMask.");
            }
        }
        return 0;
    }

    @Override // defpackage.odk
    public final Uri c(CarCall carCall) {
        return (Uri) this.h.get(carCall);
    }

    @Override // defpackage.odk
    public final CallAudioState d() {
        ogf ogfVar;
        if (!this.d || (ogfVar = this.c) == null) {
            ((ype) ((ype) a.g()).ai(5744)).Q("getCallAudioState - not actioning - bound: %b, null: %b", this.d, this.c == null);
        } else {
            try {
                return ogfVar.g();
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5745)).u("Error calling ICarCall.getCallAudioState.");
            }
        }
        return odo.a;
    }

    @Override // defpackage.odk
    public final Integer e(CarCall carCall) {
        return (Integer) this.f.get(carCall);
    }

    @Override // defpackage.odk
    public final String f(CarCall carCall) {
        return (String) this.g.get(carCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.odk
    public final List g() {
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        if (!this.d || this.c == null) {
            ((ype) ((ype) a.g()).ai(5746)).Q("getCalls - not actioning - bound: %b, null: %b", this.d, this.c == null);
        } else {
            ArrayList<CarCall> arrayList = new ArrayList();
            try {
                ?? H = this.c.h();
                H.getClass();
                arrayList = H;
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5747)).u("Error calling ICarCall.getCalls.");
            }
            for (CarCall carCall : arrayList) {
                if (carCall.e != 7 && D(carCall)) {
                    yflVar.i(carCall);
                }
            }
        }
        return yfq.y(yflVar.g());
    }

    @Override // defpackage.odk
    public final void h(CarCall carCall) {
        ogf ogfVar;
        if (!this.d || (ogfVar = this.c) == null) {
            ((ype) ((ype) a.g()).ai(5726)).Q("answerCall - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogfVar.i(carCall);
            z = false;
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5727)).u("Error calling ICarCall.answerCall.");
        }
        z(yyv.PHONE_ACCEPT_CALL, z, mcd.A().b(carCall));
        A(yzy.Eq, z, mcd.A().b(carCall));
    }

    @Override // defpackage.odk
    public final void i(CarCall carCall, CarCall carCall2) {
        ogf ogfVar;
        if (!this.d || (ogfVar = this.c) == null) {
            ((ype) ((ype) a.g()).ai(5740)).Q("conference - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogfVar.j(carCall, carCall2);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5741)).u("Error calling ICarCall.conference.");
        }
    }

    @Override // defpackage.odk
    public final void j(CarCall carCall) {
        ogf ogfVar;
        if (!this.d || (ogfVar = this.c) == null) {
            ((ype) ((ype) a.g()).ai(5753)).Q("holdCall - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogfVar.m(carCall);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5754)).u("Error calling ICarCall.holdCall.");
        }
    }

    @Override // defpackage.odk
    public final void k(String str) {
        ogf ogfVar;
        if (lgv.c().k()) {
            if (Objects.equals(this.r, thf.a)) {
                B();
            }
            Uri uriFromParts = Uri.fromParts("tel", str, null);
            TelecomManager telecomManager = (TelecomManager) this.m.getSystemService("telecom");
            telecomManager.getClass();
            telecomManager.placeCall(uriFromParts, new Bundle());
            z(yyv.PHONE_PLACE_CALL, false, null);
            A(yzy.En, false, null);
            return;
        }
        if (!this.d || (ogfVar = this.c) == null) {
            ((ype) ((ype) a.g()).ai(5762)).Q("placeCall - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogfVar.o(str);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5763)).u("Error calling ICarCall.placeCall.");
            z = true;
        }
        z(yyv.PHONE_PLACE_CALL, z, null);
        A(yzy.En, z, null);
    }

    @Override // defpackage.odk
    public final void l(CarCall carCall, char c) {
        ogf ogfVar;
        if (!this.d || (ogfVar = this.c) == null) {
            ((ype) ((ype) a.g()).ai(5764)).Q("playDtmfTone - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogfVar.q(carCall, c);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5765)).u("Error calling ICarCall.playDtmfTone.");
        }
    }

    @Override // defpackage.odk
    public final void m(BluetoothDevice bluetoothDevice) {
        ogf ogfVar;
        if (!this.d || (ogfVar = this.c) == null) {
            ((ype) ((ype) a.g()).ai(5767)).Q("requestBluetoothAudio - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogfVar.t(bluetoothDevice);
            z = false;
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5768)).u("Error calling ICarCall.requestBluetoothAudio.");
        }
        E(odn.a().k(yzz.PHONE_CALL, yzy.Ew), z);
    }

    @Override // defpackage.odk
    public final void n(int i) {
        ogf ogfVar;
        if (!this.d || (ogfVar = this.c) == null) {
            ((ype) ((ype) a.g()).ai(5771)).Q("setAudioRoute - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogfVar.w(i);
            z = false;
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5772)).u("Error calling ICarCall.setAudioRoute.");
        }
        E(odn.a().k(yzz.PHONE_CALL, yzy.Et), z);
        z(yyv.CM_SET_AUDIO_ROUTE, z, null);
    }

    @Override // defpackage.odk
    public final void o(CarCall carCall, boolean z) {
        ogf ogfVar;
        ogf ogfVar2;
        if (!G(carCall)) {
            F(z);
            return;
        }
        if (!z) {
            F(false);
        }
        if (acqd.m()) {
            if (!this.d || (ogfVar2 = this.c) == null) {
                return;
            }
            try {
                ogfVar2.u(carCall, z);
                return;
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5775)).u("Error calling requestVoipLocalCallSilenceUpdate");
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.telecom.extra.LOCAL_CALL_SILENCE_STATE", z);
        if (!this.d || (ogfVar = this.c) == null) {
            ((ype) ((ype) a.g()).ai(5769)).Q("sendCallEvent - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogfVar.v(carCall, "android.telecom.event.LOCAL_CALL_SILENCE_STATE_CHANGED", bundle);
        } catch (RemoteException e2) {
            ((ype) ((ype) ((ype) a.g()).p(e2)).ai((char) 5770)).u("Error calling ICarCall.sendCallEvent.");
            z = true;
        }
        E(odn.a().k(yzz.PHONE_CALL, yzy.Kk), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    @Override // defpackage.odk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(android.content.Context r4) {
        /*
            r3 = this;
            r0 = 5776(0x1690, float:8.094E-42)
            yph r1 = defpackage.ofb.a
            java.lang.String r2 = "start"
            defpackage.a.bu(r2, r0, r1)
            android.content.Context r4 = r4.getApplicationContext()
            r3.m = r4
            int r4 = r3.j
            int r4 = r4 + 1
            r3.j = r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r4 < r0) goto L34
            android.content.Context r4 = r3.m
            odo r0 = defpackage.odn.a()
            boolean r4 = r0.L(r4)
            if (r4 == 0) goto L34
            odo r4 = defpackage.odn.a()
            boolean r4 = r4.R()
            if (r4 == 0) goto L34
            android.content.ComponentName r4 = defpackage.thf.a
            goto L36
        L34:
            android.content.ComponentName r4 = defpackage.thf.b
        L36:
            r3.r = r4
            android.content.ComponentName r0 = defpackage.thf.a
            boolean r4 = j$.util.Objects.equals(r4, r0)
            if (r4 == 0) goto La0
            android.telephony.TelephonyManager r4 = r3.n
            if (r4 != 0) goto L53
            android.content.Context r4 = r3.m
            java.lang.String r0 = "phone"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4
            r4.getClass()
            r3.n = r4
        L53:
            ofa r4 = r3.p
            if (r4 != 0) goto L5e
            oew r4 = new oew
            r4.<init>(r3)
            r3.p = r4
        L5e:
            mpb r4 = r3.q
            if (r4 != 0) goto L75
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r4.<init>(r0)
            r3.e = r4
            oev r4 = new oev
            r0 = 0
            r4.<init>(r3, r0)
            r3.q = r4
        L75:
            android.telephony.TelephonyManager r4 = r3.n
            r4.getClass()
            android.content.Context r0 = r3.m
            java.util.concurrent.Executor r0 = defpackage.hg$$ExternalSyntheticApiModelOutline0.m(r0)
            ofa r1 = r3.p
            r1.getClass()
            defpackage.a$$ExternalSyntheticApiModelOutline2.m(r4, r0, r1)
            android.telephony.TelephonyManager r4 = r3.n
            int r4 = r4.getCallState()
            if (r4 == 0) goto L93
            r3.B()
        L93:
            mpd r4 = defpackage.mpd.b()
            mpb r3 = r3.q
            r3.getClass()
            r4.g(r3)
            return
        La0:
            r3.y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofb.p(android.content.Context):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.odk
    public final void q() {
        TelephonyManager telephonyManager;
        ofa ofaVar;
        ynp ynpVarListIterator = ((yfq) g()).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            A(yzy.Es, false, mcd.A().b((CarCall) ynpVarListIterator.next()));
        }
        try {
            ogf ogfVar = this.c;
            if (ogfVar != null) {
                ogfVar.F(this.k);
            }
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5777)).u("Error removing listener.");
        }
        wer.f(this.l);
        if (this.d) {
            this.m.unbindService(this.t);
            this.d = false;
        }
        this.s = 0;
        this.i = 0;
        if (Objects.equals(this.r, thf.a)) {
            Handler handler = this.e;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            if (Build.VERSION.SDK_INT >= 31 && (telephonyManager = this.n) != null && (ofaVar = this.p) != null) {
                telephonyManager.unregisterTelephonyCallback(ofaVar);
            }
            if (this.q != null) {
                mpd.b().j(this.q);
            }
            this.o = false;
        }
    }

    @Override // defpackage.odk
    public final void r(CarCall carCall) {
        ogf ogfVar;
        if (!this.d || (ogfVar = this.c) == null) {
            ((ype) ((ype) a.g()).ai(5778)).Q("stopDtmfTone - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogfVar.z(carCall);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5779)).u("Error calling ICarCall.stopDtmfTone.");
        }
    }

    @Override // defpackage.odk
    public final void s(CarCall carCall) {
        ogf ogfVar;
        if (!this.d || (ogfVar = this.c) == null) {
            ((ype) ((ype) a.g()).ai(5780)).Q("unholdCall - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogfVar.A(carCall);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5781)).u("Error calling ICarCall.unholdCall.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.odk
    @ResultIgnorabilityUnspecified
    public final boolean t(int i) {
        yyv yyvVar = yyv.PHONE_END_CALL;
        yzy yzyVar = yzy.Eo;
        ComponentName componentName = null;
        if (!this.d || this.c == null) {
            ((ype) ((ype) a.g()).ai(5737)).Q("closeCall - not actioning - bound: %b, null: %b", this.d, this.c == null);
        } else {
            try {
                ynp ynpVarListIterator = ((yfq) g()).listIterator(0);
                while (ynpVarListIterator.hasNext()) {
                    CarCall carCall = (CarCall) ynpVarListIterator.next();
                    if (carCall.a == i) {
                        ComponentName componentNameB = mcd.A().b(carCall);
                        try {
                            if (odn.a().G(carCall)) {
                                yyvVar = yyv.PHONE_REJECT_CALL;
                                yzyVar = yzy.Ep;
                                this.c.s(carCall, false, "");
                            } else {
                                this.c.k(carCall);
                            }
                            z(yyvVar, false, componentNameB);
                            A(yzyVar, false, componentNameB);
                            return true;
                        } catch (RemoteException e) {
                            e = e;
                            componentName = componentNameB;
                            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5739)).u("Error calling ICarCall.");
                            ((ype) ((ype) a.g()).ai((char) 5738)).u("couldn't close call");
                            z(yyvVar, true, componentName);
                            A(yzyVar, true, componentName);
                            return false;
                        }
                    }
                }
            } catch (RemoteException e2) {
                e = e2;
            }
        }
        ((ype) ((ype) a.g()).ai((char) 5738)).u("couldn't close call");
        z(yyvVar, true, componentName);
        A(yzyVar, true, componentName);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d A[ORIG_RETURN, RETURN] */
    @Override // defpackage.odk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(com.google.android.apps.auto.components.telecom.call.CarCall r5) {
        /*
            r4 = this;
            boolean r0 = r4.G(r5)
            if (r0 == 0) goto L40
            boolean r0 = defpackage.acqd.m()
            r1 = 0
            if (r0 == 0) goto L29
            boolean r0 = r4.d
            if (r0 == 0) goto L37
            ogf r0 = r4.c
            if (r0 == 0) goto L37
            boolean r5 = r0.C(r5)     // Catch: android.os.RemoteException -> L1a
            goto L35
        L1a:
            r5 = move-exception
            yph r0 = defpackage.ofb.a
            yop r0 = r0.g()
            java.lang.String r2 = "Cannot fetch local call silence state"
            r3 = 5749(0x1675, float:8.056E-42)
            defpackage.a.bv(r0, r2, r3, r5)
            goto L37
        L29:
            com.google.android.apps.auto.components.telecom.call.CarCall$Details r5 = r5.f
            android.os.Bundle r5 = r5.j
            if (r5 == 0) goto L37
            java.lang.String r0 = "android.telecom.extra.LOCAL_CALL_SILENCE_STATE"
            boolean r5 = r5.getBoolean(r0, r1)
        L35:
            if (r5 != 0) goto L3d
        L37:
            boolean r4 = r4.C()
            if (r4 == 0) goto L3f
        L3d:
            r4 = 1
            return r4
        L3f:
            return r1
        L40:
            boolean r4 = r4.C()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofb.u(com.google.android.apps.auto.components.telecom.call.CarCall):boolean");
    }

    @Override // defpackage.odk
    public final void v(CarCall carCall, PhoneAccountHandle phoneAccountHandle) {
        ogf ogfVar;
        if (!this.d || (ogfVar = this.c) == null) {
            ((ype) ((ype) a.g()).ai(5760)).Q("phoneAccountSelected - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogfVar.n(carCall, phoneAccountHandle, false);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5761)).u("Error calling ICarCall.phoneAccountSelected.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.odk
    public final void w(ebf ebfVar) {
        List list = this.b;
        synchronized (list) {
            list.add(ebfVar);
        }
        if (!this.d || this.c == null) {
            return;
        }
        ynp ynpVarListIterator = ((yfq) g()).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            ebfVar.n((CarCall) ynpVarListIterator.next());
        }
    }

    @Override // defpackage.odk
    public final void x(ebf ebfVar) {
        List list = this.b;
        synchronized (list) {
            list.remove(ebfVar);
        }
    }

    public final void y() {
        Intent intent = new Intent();
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 5729)).y("ICS component enabled: %s", this.r.getShortClassName());
        intent.setComponent(this.r);
        intent.setAction("local_gearhead_ics_intent");
        if (this.m.bindService(intent, this.t, 1)) {
            return;
        }
        ((ype) ((ype) yphVar.h()).ai((char) 5730)).u("Could not connect to ICS.");
        int i = this.s;
        if (i < 3) {
            this.s = i + 1;
            wer.d(this.l, 1500L);
        } else {
            ((ype) ((ype) yphVar.g()).ai((char) 5731)).u("Max retries reached for connecting to ICS.");
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, yzy.aF).l());
        }
    }
}
