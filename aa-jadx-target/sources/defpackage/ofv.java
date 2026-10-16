package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ofv implements defpackage.oee {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.LocalICSCallAdapter");
    public ogz c;
    public android.os.Handler e;
    public int i;
    public int j;
    private android.content.Context m;
    private android.telephony.TelephonyManager n;
    private boolean o;
    private ofu p;
    private defpackage.mph q;
    private android.content.ComponentName r;
    private int s;
    public final java.util.List b = new java.util.concurrent.CopyOnWriteArrayList();
    public final defpackage.ohl k = new defpackage.ohl(this);
    private final java.lang.Runnable l = new defpackage.jpa(this, 18, null);
    public boolean d = false;
    public final java.util.Map f = new java.util.HashMap();
    public final java.util.Map g = new java.util.HashMap();
    public final java.util.Map h = new java.util.HashMap();
    private final android.content.ServiceConnection t = new defpackage.ofr(this);

    public static void A(defpackage.zbd zbdVar, boolean z, android.content.ComponentName componentName) {
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, zbdVar);
        if (componentName != null) {
            rrvVarH.p(componentName);
        }
        E(rrvVarH, z);
    }

    private static void E(defpackage.rrv rrvVar, boolean z) {
        if (z) {
            rrvVar.v(defpackage.zbf.TELECOM_ICS_API_FAILURE);
        }
        defpackage.omf.u().F(rrvVar.l());
    }

    private final void F(boolean z) {
        ogz ogzVar;
        if (!this.d || (ogzVar = this.c) == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(5799)).Q("setMuted - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogzVar.x(z);
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5800)).u("Error calling ICarCall.setMuted.");
        }
    }

    private final boolean G(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        ogz ogzVar;
        boolean zE = false;
        if (!defpackage.mkc.R().t(carCall)) {
            return false;
        }
        if (!defpackage.acrf.m()) {
            android.os.Bundle bundle = carCall.f.j;
            if (bundle == null) {
                return false;
            }
            boolean z = bundle.getBoolean("android.telecom.extra.USE_LOCAL_CALL_SILENCE_CAPABILITY");
            java.util.concurrent.TimeUnit.SECONDS.getClass();
            return z;
        }
        if (this.d && (ogzVar = this.c) != null) {
            try {
                zE = ogzVar.E(carCall);
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5761)).u("Cannot fetch VoipLocalCallSilence support.");
            }
            java.util.concurrent.TimeUnit.SECONDS.getClass();
        }
        return zE;
    }

    public static void z(defpackage.zaa zaaVar, boolean z, android.content.ComponentName componentName) {
        defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 37, zaaVar);
        if (z) {
            rroVarH.i(defpackage.zab.CM_ADAPTER_API_FAILURE);
        }
        if (componentName != null) {
            rroVarH.g(componentName.flattenToShortString());
        }
        defpackage.omf.u().F(rroVarH.l());
    }

    public final void B() {
        if (this.o) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5784)).u("enabling duplex ics in :projection");
        defpackage.oeh.a().S(this.m, defpackage.tib.a);
        this.o = true;
        y();
    }

    public final boolean C() {
        ogz ogzVar;
        if (!this.d || (ogzVar = this.c) == null) {
            return false;
        }
        try {
            return ogzVar.B();
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5776)).u("Error calling ICarCall.getMuted.");
            return false;
        }
    }

    public final boolean D(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        if ((carCall.f.i & 256) != 256) {
            return true;
        }
        if (!defpackage.mkc.R().u()) {
            return false;
        }
        java.lang.String packageName = defpackage.mkc.R().b(carCall).getPackageName();
        if (defpackage.mkc.R().s(this.m, packageName)) {
            return true;
        }
        if (!defpackage.mkc.R().q(packageName)) {
            return false;
        }
        java.util.concurrent.TimeUnit.MINUTES.getClass();
        return true;
    }

    @Override // defpackage.oee
    public final int a() {
        ogz ogzVar;
        if (!this.d || (ogzVar = this.c) == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(5768)).Q("getAudioRoute - not actioning - bound: %b, null: %b", this.d, this.c == null);
        } else {
            try {
                int iE = ogzVar.e();
                if (iE != 0) {
                    return iE;
                }
                return 2;
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5769)).u("Error calling ICarCall.getAudioRoute.");
            }
        }
        return 2;
    }

    @Override // defpackage.oee
    public final int b() {
        ogz ogzVar;
        if (!this.d || (ogzVar = this.c) == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(5777)).Q("getSupportedAudioRouteMask - not actioning - bound: %b, null: %b", this.d, this.c == null);
        } else {
            try {
                return ogzVar.f();
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5778)).u("Error calling ICarCall.getSupportedAudioRouteMask.");
            }
        }
        return 0;
    }

    @Override // defpackage.oee
    public final android.net.Uri c(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        return (android.net.Uri) this.h.get(carCall);
    }

    @Override // defpackage.oee
    public final android.telecom.CallAudioState d() {
        ogz ogzVar;
        if (!this.d || (ogzVar = this.c) == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(5770)).Q("getCallAudioState - not actioning - bound: %b, null: %b", this.d, this.c == null);
        } else {
            try {
                return ogzVar.g();
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5771)).u("Error calling ICarCall.getCallAudioState.");
            }
        }
        return defpackage.oei.a;
    }

    @Override // defpackage.oee
    public final java.lang.Integer e(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        return (java.lang.Integer) this.f.get(carCall);
    }

    @Override // defpackage.oee
    public final java.lang.String f(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        return (java.lang.String) this.g.get(carCall);
    }

    @Override // defpackage.oee
    public final java.util.List g() {
        int i = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        if (!this.d || this.c == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(5772)).Q("getCalls - not actioning - bound: %b, null: %b", this.d, this.c == null);
        } else {
            java.util.List<com.google.android.apps.auto.components.telecom.call.CarCall> arrayList = new java.util.ArrayList();
            try {
                java.util.List listH = this.c.h();
                listH.getClass();
                arrayList = listH;
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5773)).u("Error calling ICarCall.getCalls.");
            }
            for (com.google.android.apps.auto.components.telecom.call.CarCall carCall : arrayList) {
                if (carCall.e != 7 && D(carCall)) {
                    ygrVar.i(carCall);
                }
            }
        }
        return defpackage.ygw.y(ygrVar.g());
    }

    @Override // defpackage.oee
    public final void h(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        ogz ogzVar;
        boolean z = true;
        if (!this.d || (ogzVar = this.c) == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(5752)).Q("answerCall - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogzVar.i(carCall);
            z = false;
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5753)).u("Error calling ICarCall.answerCall.");
        }
        z(defpackage.zaa.PHONE_ACCEPT_CALL, z, defpackage.mkc.R().b(carCall));
        A(defpackage.zbd.Eu, z, defpackage.mkc.R().b(carCall));
    }

    @Override // defpackage.oee
    public final void i(com.google.android.apps.auto.components.telecom.call.CarCall carCall, com.google.android.apps.auto.components.telecom.call.CarCall carCall2) {
        ogz ogzVar;
        if (!this.d || (ogzVar = this.c) == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(5766)).Q("conference - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogzVar.j(carCall, carCall2);
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5767)).u("Error calling ICarCall.conference.");
        }
    }

    @Override // defpackage.oee
    public final void j(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        ogz ogzVar;
        if (!this.d || (ogzVar = this.c) == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(5779)).Q("holdCall - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogzVar.m(carCall);
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5780)).u("Error calling ICarCall.holdCall.");
        }
    }

    @Override // defpackage.oee
    public final void k(java.lang.String str) {
        ogz ogzVar;
        boolean z = false;
        if (defpackage.mdp.d().k()) {
            if (j$.util.Objects.equals(this.r, defpackage.tib.a)) {
                B();
            }
            android.net.Uri uriFromParts = android.net.Uri.fromParts("tel", str, null);
            android.telecom.TelecomManager telecomManager = (android.telecom.TelecomManager) this.m.getSystemService("telecom");
            telecomManager.getClass();
            telecomManager.placeCall(uriFromParts, new android.os.Bundle());
            z(defpackage.zaa.PHONE_PLACE_CALL, false, null);
            A(defpackage.zbd.Er, false, null);
            return;
        }
        if (!this.d || (ogzVar = this.c) == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(5788)).Q("placeCall - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogzVar.o(str);
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5789)).u("Error calling ICarCall.placeCall.");
            z = true;
        }
        z(defpackage.zaa.PHONE_PLACE_CALL, z, null);
        A(defpackage.zbd.Er, z, null);
    }

    @Override // defpackage.oee
    public final void l(com.google.android.apps.auto.components.telecom.call.CarCall carCall, char c) {
        ogz ogzVar;
        if (!this.d || (ogzVar = this.c) == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(5790)).Q("playDtmfTone - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogzVar.q(carCall, c);
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5791)).u("Error calling ICarCall.playDtmfTone.");
        }
    }

    @Override // defpackage.oee
    public final void m(android.bluetooth.BluetoothDevice bluetoothDevice) {
        ogz ogzVar;
        boolean z = true;
        if (!this.d || (ogzVar = this.c) == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(5793)).Q("requestBluetoothAudio - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogzVar.t(bluetoothDevice);
            z = false;
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5794)).u("Error calling ICarCall.requestBluetoothAudio.");
        }
        E(defpackage.oeh.a().k(defpackage.zbe.PHONE_CALL, defpackage.zbd.EA), z);
    }

    @Override // defpackage.oee
    public final void n(int i) {
        ogz ogzVar;
        boolean z = true;
        if (!this.d || (ogzVar = this.c) == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(5797)).Q("setAudioRoute - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogzVar.w(i);
            z = false;
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5798)).u("Error calling ICarCall.setAudioRoute.");
        }
        E(defpackage.oeh.a().k(defpackage.zbe.PHONE_CALL, defpackage.zbd.Ex), z);
        z(defpackage.zaa.CM_SET_AUDIO_ROUTE, z, null);
    }

    @Override // defpackage.oee
    public final void o(com.google.android.apps.auto.components.telecom.call.CarCall carCall, boolean z) {
        ogz ogzVar;
        ogz ogzVar2;
        if (!G(carCall)) {
            F(z);
            return;
        }
        boolean z2 = false;
        if (!z) {
            F(false);
        }
        if (defpackage.acrf.m()) {
            if (!this.d || (ogzVar2 = this.c) == null) {
                return;
            }
            try {
                ogzVar2.u(carCall, z);
                return;
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5801)).u("Error calling requestVoipLocalCallSilenceUpdate");
                return;
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("android.telecom.extra.LOCAL_CALL_SILENCE_STATE", z);
        if (!this.d || (ogzVar = this.c) == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(5795)).Q("sendCallEvent - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogzVar.v(carCall, "android.telecom.event.LOCAL_CALL_SILENCE_STATE_CHANGED", bundle);
        } catch (android.os.RemoteException e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e2)).ai((char) 5796)).u("Error calling ICarCall.sendCallEvent.");
            z2 = true;
        }
        E(defpackage.oeh.a().k(defpackage.zbe.PHONE_CALL, defpackage.zbd.Ko), z2);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    @Override // defpackage.oee
    public final void p(android.content.Context context) {
        android.content.ComponentName componentName;
        ((defpackage.yqj) a.l().ai((char) 5802)).u("start");
        this.m = context.getApplicationContext();
        this.j++;
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            if (defpackage.oeh.a().L(this.m) && defpackage.oeh.a().R()) {
                componentName = defpackage.tib.a;
            } else {
                componentName = defpackage.tib.b;
            }
        } else {
            componentName = defpackage.tib.b;
        }
        this.r = componentName;
        if (!j$.util.Objects.equals(componentName, defpackage.tib.a)) {
            y();
            return;
        }
        if (this.n == null) {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) this.m.getSystemService("phone");
            telephonyManager.getClass();
            this.n = telephonyManager;
        }
        if (this.p == null) {
            this.p = new ofq(this);
        }
        if (this.q == null) {
            this.e = new android.os.Handler(android.os.Looper.getMainLooper());
            this.q = new ofp(this, 0);
        }
        android.telephony.TelephonyManager telephonyManager2 = this.n;
        telephonyManager2.getClass();
        java.util.concurrent.Executor executorM = hh$.ExternalSyntheticApiModelOutline0.m(this.m);
        ofu ofuVar = this.p;
        ofuVar.getClass();
        a$.ExternalSyntheticApiModelOutline0.m(telephonyManager2, executorM, ofuVar);
        if (this.n.getCallState() != 0) {
            B();
        }
        defpackage.mpj mpjVarB = defpackage.mpj.b();
        defpackage.mph mphVar = this.q;
        mphVar.getClass();
        mpjVarB.g(mphVar);
    }

    @Override // defpackage.oee
    public final void q() {
        android.telephony.TelephonyManager telephonyManager;
        ofu ofuVar;
        defpackage.you youVarListIterator = ((defpackage.ygw) g()).listIterator(0);
        while (youVarListIterator.hasNext()) {
            A(defpackage.zbd.Ew, false, defpackage.mkc.R().b((com.google.android.apps.auto.components.telecom.call.CarCall) youVarListIterator.next()));
        }
        try {
            ogz ogzVar = this.c;
            if (ogzVar != null) {
                ogzVar.F(this.k);
            }
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5803)).u("Error removing listener.");
        }
        defpackage.wfp.f(this.l);
        if (this.d) {
            this.m.unbindService(this.t);
            this.d = false;
        }
        this.s = 0;
        this.i = 0;
        if (j$.util.Objects.equals(this.r, defpackage.tib.a)) {
            android.os.Handler handler = this.e;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            if (android.os.Build.VERSION.SDK_INT >= 31 && (telephonyManager = this.n) != null && (ofuVar = this.p) != null) {
                a$.ExternalSyntheticApiModelOutline0.m(telephonyManager, ofuVar);
            }
            if (this.q != null) {
                defpackage.mpj.b().j(this.q);
            }
            this.o = false;
        }
    }

    @Override // defpackage.oee
    public final void r(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        ogz ogzVar;
        if (!this.d || (ogzVar = this.c) == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(5804)).Q("stopDtmfTone - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogzVar.z(carCall);
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5805)).u("Error calling ICarCall.stopDtmfTone.");
        }
    }

    @Override // defpackage.oee
    public final void s(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        ogz ogzVar;
        if (!this.d || (ogzVar = this.c) == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(5806)).Q("unholdCall - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogzVar.A(carCall);
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5807)).u("Error calling ICarCall.unholdCall.");
        }
    }

    @Override // defpackage.oee
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean t(int i) {
        defpackage.zaa zaaVar = defpackage.zaa.PHONE_END_CALL;
        defpackage.zbd zbdVar = defpackage.zbd.Es;
        android.content.ComponentName componentName = null;
        if (!this.d || this.c == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(5763)).Q("closeCall - not actioning - bound: %b, null: %b", this.d, this.c == null);
        } else {
            try {
                defpackage.you youVarListIterator = ((defpackage.ygw) g()).listIterator(0);
                while (youVarListIterator.hasNext()) {
                    com.google.android.apps.auto.components.telecom.call.CarCall carCall = (com.google.android.apps.auto.components.telecom.call.CarCall) youVarListIterator.next();
                    if (carCall.a == i) {
                        android.content.ComponentName componentNameB = defpackage.mkc.R().b(carCall);
                        try {
                            if (defpackage.oeh.a().G(carCall)) {
                                zaaVar = defpackage.zaa.PHONE_REJECT_CALL;
                                zbdVar = defpackage.zbd.Et;
                                this.c.s(carCall, false, "");
                            } else {
                                this.c.k(carCall);
                            }
                            z(zaaVar, false, componentNameB);
                            A(zbdVar, false, componentNameB);
                            return true;
                        } catch (android.os.RemoteException e) {
                            e = e;
                            componentName = componentNameB;
                        }
                    }
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5765)).u("Error calling ICarCall.");
                }
            } catch (android.os.RemoteException e2) {
                e = e2;
            }
        }
        ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 5764)).u("couldn't close call");
        z(zaaVar, true, componentName);
        A(zbdVar, true, componentName);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d A[ORIG_RETURN, RETURN] */
    @Override // defpackage.oee
    public final boolean u(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        boolean zC;
        ogz ogzVar;
        if (!G(carCall)) {
            return C();
        }
        if (!defpackage.acrf.m()) {
            android.os.Bundle bundle = carCall.f.j;
            if (bundle != null) {
                zC = bundle.getBoolean("android.telecom.extra.LOCAL_CALL_SILENCE_STATE", false);
                if (zC) {
                    return true;
                }
            }
        } else if (this.d && (ogzVar = this.c) != null) {
            try {
                zC = ogzVar.C(carCall);
                if (zC) {
                    return true;
                }
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5775)).u("Cannot fetch local call silence state");
            }
        }
        return C();
    }

    @Override // defpackage.oee
    public final void v(com.google.android.apps.auto.components.telecom.call.CarCall carCall, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        ogz ogzVar;
        if (!this.d || (ogzVar = this.c) == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(5786)).Q("phoneAccountSelected - not actioning - bound: %b, null: %b", this.d, this.c == null);
            return;
        }
        try {
            ogzVar.n(carCall, phoneAccountHandle, false);
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5787)).u("Error calling ICarCall.phoneAccountSelected.");
        }
    }

    @Override // defpackage.oee
    public final void w(defpackage.omf omfVar) {
        java.util.List list = this.b;
        synchronized (list) {
            list.add(omfVar);
        }
        if (!this.d || this.c == null) {
            return;
        }
        defpackage.you youVarListIterator = ((defpackage.ygw) g()).listIterator(0);
        while (youVarListIterator.hasNext()) {
            omfVar.a((com.google.android.apps.auto.components.telecom.call.CarCall) youVarListIterator.next());
        }
    }

    @Override // defpackage.oee
    public final void x(defpackage.omf omfVar) {
        java.util.List list = this.b;
        synchronized (list) {
            list.remove(omfVar);
        }
    }

    public final void y() {
        android.content.Intent intent = new android.content.Intent();
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 5755)).y("ICS component enabled: %s", this.r.getShortClassName());
        intent.setComponent(this.r);
        intent.setAction("local_gearhead_ics_intent");
        if (this.m.bindService(intent, this.t, 1)) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 5756)).u("Could not connect to ICS.");
        int i = this.s;
        if (i < 3) {
            this.s = i + 1;
            defpackage.wfp.d(this.l, 1500L);
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 5757)).u("Max retries reached for connecting to ICS.");
            defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, defpackage.zbd.aF).l());
        }
    }
}
