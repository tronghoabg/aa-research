package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ofl implements defpackage.oed {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CallManager");
    public final android.content.Context b;
    public final defpackage.oee c;
    public final defpackage.xzg d;
    public final android.os.Handler e;
    public final java.util.Map f;
    public int g;
    public j$.util.Optional h;
    public java.lang.String i;
    public boolean j;
    final defpackage.omf k;
    private final android.telephony.TelephonyManager l;
    private defpackage.lhn m;
    private final java.util.List n;
    private java.lang.String o;
    private android.os.Handler p;
    private boolean q;
    private final defpackage.kfp r;

    public ofl(android.content.Context context) {
        defpackage.ofv ofaVar;
        defpackage.yqm yqmVar = defpackage.ofh.a;
        defpackage.xzg xzgVar = new defpackage.xzg(defpackage.xxd.a);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        this.n = copyOnWriteArrayList;
        this.e = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f = new java.util.HashMap();
        this.g = 0;
        this.h = j$.util.Optional.empty();
        defpackage.ofj ofjVar = new defpackage.ofj(this);
        this.k = ofjVar;
        this.r = new defpackage.ofk(this);
        context.getClass();
        this.b = context;
        copyOnWriteArrayList.add(ofjVar);
        this.l = (android.telephony.TelephonyManager) context.getSystemService("phone");
        ((defpackage.yqj) ((defpackage.yqj) defpackage.ofh.a.f()).ai((char) 5631)).u("creating call adapter instance");
        defpackage.oim oimVar = (defpackage.oim) defpackage.mkp.a.i(defpackage.oim.class);
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService(android.telephony.TelephonyManager.class);
        defpackage.oim oimVar2 = (defpackage.oim) defpackage.mkp.a.i(defpackage.oim.class);
        defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 35, defpackage.zaa.PHONE_SIMS_COUNT_PRESENT);
        rroVarH.h(telephonyManager.getPhoneCount());
        oimVar2.f(rroVarH);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            ofaVar = new defpackage.ofv();
        } else {
            oimVar.x(3, defpackage.zaa.CALL_ADAPTER_GMS_CALL_CLIENT);
            int i = defpackage.ygw.d;
            ofaVar = new ofa(new tia(defpackage.ymx.a), new defpackage.mkc(), new ofg(new defpackage.mkc()));
        }
        this.c = ofaVar;
        this.d = xzgVar;
    }

    static com.google.android.apps.auto.components.telecom.PhoneCall F(com.google.android.apps.auto.components.telecom.call.CarCall carCall, android.content.Context context) {
        java.lang.String strBv = defpackage.ysr.bv(defpackage.oeh.a().u(carCall));
        java.lang.String string = defpackage.oeh.a().m(context, strBv).toString();
        defpackage.oeg oegVarA = defpackage.oeg.a(carCall.e);
        int i = carCall.a;
        java.lang.String strP = defpackage.oeh.a().p(context, carCall);
        java.lang.CharSequence charSequenceL = defpackage.oeh.a().l(context, carCall);
        if (!defpackage.mkc.R().u() || !defpackage.mkc.R().t(carCall)) {
            return new com.google.android.apps.auto.components.telecom.PhoneCall(i, oegVarA, strP, strBv, string, null, 0, defpackage.mkt.b, charSequenceL != null ? charSequenceL.toString() : null);
        }
        android.content.ComponentName componentNameB = defpackage.mkc.R().b(carCall);
        android.content.ComponentName componentName = defpackage.mkt.b;
        defpackage.ysr.aY(!componentNameB.equals(componentName), "No component set for VOIP call");
        java.lang.String string2 = charSequenceL != null ? charSequenceL.toString() : null;
        defpackage.ysr.aY(!componentNameB.equals(componentName), "Should not be creating VOIP calls with the GH_TELECOM component");
        return new com.google.android.apps.auto.components.telecom.PhoneCall(i, oegVarA, strP, strBv, string, null, 0, componentNameB, string2);
    }

    public static void I(java.lang.IllegalArgumentException illegalArgumentException) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 5675)).u("Bluetooth exception when accessing call bluetooth devices.");
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 5676)).y("Exception message: %s", illegalArgumentException.getMessage());
        if (!defpackage.acyc.aQ()) {
            throw illegalArgumentException;
        }
        defpackage.omf.u().f(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, defpackage.zbd.Fj));
    }

    private static void L(android.content.Context context, android.content.ComponentName componentName, boolean z) {
        context.getPackageManager().setComponentEnabledSetting(componentName, true != z ? 2 : 1, 1);
    }

    private static final void M() {
        ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 5682)).u("User initiated action with uninitialized call adapter");
        ((defpackage.oim) defpackage.mkp.a.i(defpackage.oim.class)).B(defpackage.zaa.CALL_ADAPTER_OPERATION, defpackage.zab.CM_ADAPTER_NOT_INITIALIZED);
        ((defpackage.oim) defpackage.mkp.a.i(defpackage.oim.class)).F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, defpackage.zbd.Ey).l());
    }

    @Override // defpackage.oed
    public final boolean A() {
        return !android.text.TextUtils.isEmpty(G());
    }

    @Override // defpackage.oed
    public final boolean B() {
        return l().contains(2);
    }

    @Override // defpackage.oed
    public final boolean C(java.lang.String str) {
        java.lang.String strG = G();
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(strG)) {
            return false;
        }
        return android.telephony.PhoneNumberUtils.compare(str, strG);
    }

    @Override // defpackage.oed
    public final void D(defpackage.omf omfVar) {
        ((defpackage.yqj) a.l().ai((char) 5662)).y("addCarCallListener(%s)", omfVar);
        this.n.add(omfVar);
        if (this.q) {
            this.c.w(omfVar);
        }
    }

    @Override // defpackage.oed
    public final void E(defpackage.omf omfVar) {
        ((defpackage.yqj) a.l().ai((char) 5694)).y("removeCarCallListener(%s)", omfVar);
        this.n.remove(omfVar);
        if (this.q) {
            this.c.x(omfVar);
        }
    }

    final java.lang.String G() {
        java.lang.String str = this.o;
        if (str != null) {
            return str;
        }
        if (!defpackage.mdp.d().k()) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5674)).u("Missing phone permissions. Cannot get voicemail number");
            return null;
        }
        try {
            java.lang.String voiceMailNumber = this.l.getVoiceMailNumber();
            this.o = voiceMailNumber;
            return voiceMailNumber;
        } catch (java.lang.SecurityException e) {
            if (e.getMessage() == null || !(e.getMessage().contains("READ_PHONE_STATE") || e.getMessage().contains("No permission to write APN settings"))) {
                throw e;
            }
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 5692)).u("Despite checking for READ_PHONE_STATE permission, getVoiceMailNumber is failing. Can't get voicemail number.");
            return null;
        }
    }

    public final void H() {
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return;
        }
        L(this.b, defpackage.tib.a, false);
    }

    public final void J(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5678)).u("Logging call duration");
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, defpackage.zbd.af);
        defpackage.xzg xzgVar = this.d;
        rrvVarH.u(xzgVar.a(java.util.concurrent.TimeUnit.MILLISECONDS));
        if (carCall != null) {
            rrvVarH.p(defpackage.mkc.R().b(carCall));
        }
        defpackage.omf.u().f(rrvVarH);
        xzgVar.d();
    }

    public final void K() {
        this.e.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.oed
    public final int a() throws wfo {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 5666)).u("getAudioRoute");
        defpackage.wfp.c();
        int iA = this.q ? this.c.a() : 2;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5667)).w("getAudioRoute: %d", iA);
        return iA;
    }

    @Override // defpackage.oed
    public final android.net.Uri b(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        if (defpackage.mkc.R().u()) {
            return this.c.c(carCall);
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void d() throws wfo {
        defpackage.wfp.c();
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, defpackage.zbd.aM).l());
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            defpackage.kit.b().w(this.r);
        }
        this.i = null;
        com.google.android.apps.auto.components.telecom.call.CarCall carCallG = defpackage.oeh.a().g();
        if (carCallG != null || this.d.a) {
            J(carCallG);
        }
        K();
        if (this.q) {
            this.c.q();
            this.q = false;
        }
        this.o = null;
        defpackage.mni.a().d(defpackage.mnh.g);
        this.f.clear();
        this.g = 0;
        this.h = j$.util.Optional.empty();
        this.j = false;
        android.os.Handler handler = this.p;
        if (handler != null) {
            handler.postDelayed(new defpackage.ocy(this, 8), defpackage.acrf.e());
        } else {
            H();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.oed
    public final com.google.android.apps.auto.components.telecom.PhoneCall e() throws wfo {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5705)).u("swapCalls()");
        defpackage.wfp.c();
        com.google.android.apps.auto.components.telecom.call.CarCall carCallG = defpackage.oeh.a().g();
        com.google.android.apps.auto.components.telecom.call.CarCall carCallH = defpackage.oeh.a().h();
        if (carCallG == null || carCallH == null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 5706)).u("need at least two call to swap.");
            return null;
        }
        if (carCallG.e != 4 || carCallH.e != 3) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(5707)).M("expect primary call to be active and secondary call to be holding for swap to work. But have primary(%s) secondary(%s)", carCallG, carCallH);
            return null;
        }
        defpackage.oee oeeVar = this.c;
        oeeVar.j(carCallG);
        oeeVar.s(carCallH);
        return F(carCallH, this.b);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void eQ() throws wfo {
        defpackage.wfp.c();
        android.os.Handler handler = this.p;
        if (handler == null) {
            handler = new android.os.Handler(android.os.Looper.getMainLooper());
            this.p = handler;
        }
        handler.removeCallbacksAndMessages(null);
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, defpackage.zbd.aL).l());
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            defpackage.kit.b().v(this.r);
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            android.content.Context context = this.b;
            boolean z = defpackage.oeh.a().L(context) && defpackage.oeh.a().R();
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5679)).y("Should enable duplex InCallService: %s", java.lang.Boolean.valueOf(z));
            if (!z) {
                L(context, defpackage.tib.a, false);
            }
            L(context, defpackage.tib.b, !z);
        }
        if (!defpackage.mdp.d().k()) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5700)).u("Missing phone permissions. Doing nothing.");
            return;
        }
        defpackage.oee oeeVar = this.c;
        android.content.Context context2 = this.b;
        oeeVar.p(context2);
        this.q = true;
        java.util.Iterator it = this.n.iterator();
        while (it.hasNext()) {
            oeeVar.w((defpackage.omf) it.next());
        }
        defpackage.lhn lhnVarB = defpackage.laz.a().b(context2, this, new defpackage.ofn());
        this.m = lhnVarB;
        lhnVarB.eQ();
        defpackage.mni.a().b(defpackage.mnh.g, this);
    }

    @Override // defpackage.oed
    public final java.lang.Integer f(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        if (defpackage.mkc.R().u()) {
            return this.c.e(carCall);
        }
        return null;
    }

    @Override // defpackage.oed
    public final java.lang.String g(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        if (defpackage.mkc.R().u()) {
            return this.c.f(carCall);
        }
        return null;
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        java.util.List listI = i();
        if (listI.isEmpty()) {
            printWriter.println("No ongoing calls.");
        } else {
            printWriter.println("Ongoing calls:");
            com.google.android.apps.auto.components.telecom.PhoneCall phoneCall = (com.google.android.apps.auto.components.telecom.PhoneCall) listI.get(0);
            printWriter.printf("Primary call: %s\n\n", phoneCall);
            printWriter.printf("Primary call muted: %s\n", java.lang.Boolean.valueOf(z(phoneCall.a)));
            if (listI.size() > 1) {
                printWriter.printf("Secondary call: %s\n\n", (com.google.android.apps.auto.components.telecom.PhoneCall) listI.get(1));
            }
        }
        printWriter.printf("Audio route: %s\n\n", android.telecom.CallAudioState.audioRouteToString(a()));
    }

    @Override // defpackage.oed
    public final java.util.List i() {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 5664)).u("getting Active calls");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!this.q) {
            M();
            return arrayList;
        }
        com.google.android.apps.auto.components.telecom.call.CarCall carCallG = defpackage.oeh.a().g();
        if (carCallG != null) {
            arrayList.add(F(carCallG, this.b));
        }
        com.google.android.apps.auto.components.telecom.call.CarCall carCallH = defpackage.oeh.a().h();
        if (carCallH != null) {
            arrayList.add(F(carCallH, this.b));
        }
        ((defpackage.yqj) yqmVar.l().ai((char) 5665)).y("got Active calls: %s", arrayList);
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.oed
    public final java.util.List j(java.util.Set set) throws wfo {
        java.util.List<com.google.android.apps.auto.components.telecom.call.CarCall> listK = k();
        int i = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        for (com.google.android.apps.auto.components.telecom.call.CarCall carCall : listK) {
            if (set.contains(defpackage.mkc.R().b(carCall).getPackageName())) {
                ygrVar.i(F(carCall, this.b));
            }
        }
        return ygrVar.g();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.oed
    public final java.util.List k() throws wfo {
        defpackage.wfp.c();
        if (!this.q) {
            M();
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5669)).u("getCalls - ICS not yet active");
            return java.util.Collections.EMPTY_LIST;
        }
        java.util.List listG = this.c.g();
        java.util.ArrayList arrayList = new java.util.ArrayList(((defpackage.ymx) listG).c);
        defpackage.you youVarListIterator = ((defpackage.ygw) listG).listIterator(0);
        while (youVarListIterator.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((com.google.android.apps.auto.components.telecom.call.CarCall) youVarListIterator.next()).a));
        }
        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.f()).l(1, java.util.concurrent.TimeUnit.MINUTES)).ai(5668)).y("getCalls: %s", arrayList);
        return listG;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.oed
    public final java.util.List l() throws wfo {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 5672)).u("getOrderedAvailableAudioRoutes");
        defpackage.wfp.c();
        if (!this.q) {
            M();
            return java.util.Collections.EMPTY_LIST;
        }
        int iB = this.c.b();
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5673)).w("getOrderedAvailableAudioRoutes - mask: %d", iB);
        int i = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        if ((iB & 4) != 0) {
            ygrVar.i(4);
        }
        if ((iB & 2) != 0) {
            ygrVar.i(2);
        }
        if ((iB & 8) != 0) {
            ygrVar.i(8);
        }
        if ((iB & 1) != 0) {
            ygrVar.i(1);
        }
        return ygrVar.g();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.oed
    public final void m(int i) throws wfo {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5660)).w("acceptCall(%d)", i);
        defpackage.wfp.c();
        if (!this.q) {
            M();
            return;
        }
        com.google.android.apps.auto.components.telecom.call.CarCall carCallE = defpackage.oeh.a().e(i);
        if (carCallE != null) {
            this.c.h(carCallE);
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 5661)).u("Could not find call with given id to answer.");
            defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, defpackage.zbd.DV).l());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.oed
    public final void n(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws wfo {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(5677)).w("holdCall(%d)", carCall.a);
        defpackage.wfp.c();
        if (this.q) {
            this.c.j(carCall);
        } else {
            M();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.oed
    @java.lang.Deprecated
    public final void o() throws wfo {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5680)).u("mergeCalls()");
        com.google.android.apps.auto.components.telecom.call.CarCall carCallG = defpackage.oeh.a().g();
        com.google.android.apps.auto.components.telecom.call.CarCall carCallH = defpackage.oeh.a().h();
        if (carCallG == null || carCallH == null) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(5681)).B("mergeCalls: primary: %d secondary: %d", carCallG.a, carCallH.a);
        defpackage.wfp.c();
        this.c.i(carCallG, carCallH);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Code duplicated, block: B:21:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0088  */
    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    @Override // defpackage.oed
    public final void p(java.lang.String str) throws wfo {
        int i;
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5685)).u("placeCall");
        defpackage.wfp.c();
        if (!this.q) {
            M();
            return;
        }
        defpackage.ysr.bj(!android.text.TextUtils.isEmpty(str));
        android.telephony.TelephonyManager telephonyManager = this.l;
        defpackage.oim oimVarU = defpackage.omf.u();
        boolean z = telephonyManager.getSimState() == 5;
        android.content.Context context = this.b;
        boolean z2 = android.provider.Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        boolean zIsEmergencyNumber = android.telephony.PhoneNumberUtils.isEmergencyNumber(str);
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(5686)).R("placeCall: isSimReady:%b airplaneMode:%b emergency:%b", java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2), java.lang.Boolean.valueOf(zIsEmergencyNumber));
        if (zIsEmergencyNumber) {
            oimVarU.x(3, defpackage.zaa.PHONE_CALL_TO_EMERGENCY_NUMBER);
            oimVarU.F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, defpackage.zbd.Ez).l());
        }
        if (z) {
            if (z2) {
                z2 = true;
                if (!zIsEmergencyNumber) {
                    if (true != z2) {
                        i = 2132084026;
                    } else {
                        i = 2132084013;
                    }
                    oimVarU.x(3, defpackage.zaa.PHONE_PLACE_CALL_FAILED);
                    defpackage.ocn.a().f(context, defpackage.mkt.b, i, 0);
                    return;
                }
            }
        } else if (!zIsEmergencyNumber) {
            if (true != z2) {
                i = 2132084026;
            } else {
                i = 2132084013;
            }
            oimVarU.x(3, defpackage.zaa.PHONE_PLACE_CALL_FAILED);
            defpackage.ocn.a().f(context, defpackage.mkt.b, i, 0);
            return;
        }
        if (defpackage.oeh.a().f(9, 0, 1) == null) {
            this.c.k(str);
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 5687)).u("Place call ignored, outgoing call in progress.");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.oed
    public final void q() throws wfo {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5688)).u("placeVoiceMailCall()");
        java.lang.String strG = G();
        if (android.text.TextUtils.isEmpty(strG)) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 5689)).u("Unable to get voicemail number.");
        } else {
            p(strG);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.oed
    public final void r(char c) throws wfo {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai(5690)).v("playDtmfTone(%c)", c);
        defpackage.wfp.c();
        if (!this.q) {
            M();
            return;
        }
        com.google.android.apps.auto.components.telecom.call.CarCall carCallG = defpackage.oeh.a().g();
        if (carCallG == null) {
            ((defpackage.yqj) yqmVar.l().ai((char) 5691)).u("No primary call, no Dtmf tone played");
        } else {
            this.c.l(carCallG, c);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.oed
    public final void s(com.google.android.apps.auto.components.telecom.call.CarCall carCall, android.telecom.PhoneAccountHandle phoneAccountHandle) throws wfo {
        defpackage.wfp.c();
        this.c.v(carCall, phoneAccountHandle);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.oed
    public final void t(int i) throws wfo {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5696)).w("setAudioRoute: %d", i);
        defpackage.wfp.c();
        if (this.q) {
            this.c.n(i);
        } else {
            M();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.oed
    public final void u(int i, boolean z) throws wfo {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai(5697)).E("setMute - callId: %d - muted: %b", i, z);
        defpackage.wfp.c();
        if (!this.q) {
            M();
            return;
        }
        com.google.android.apps.auto.components.telecom.call.CarCall carCallE = defpackage.oeh.a().e(i);
        if (carCallE == null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 5698)).w("Failed to setMuted for call %d, call not found", i);
        } else {
            this.c.o(carCallE, z);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.oed
    public final void v() throws wfo {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 5703)).u("stopDtmfTone()");
        defpackage.wfp.c();
        if (!this.q) {
            M();
            return;
        }
        com.google.android.apps.auto.components.telecom.call.CarCall carCallG = defpackage.oeh.a().g();
        if (carCallG == null) {
            ((defpackage.yqj) yqmVar.l().ai((char) 5704)).u("No primary call, no Dtmf tone stopped");
        } else {
            this.c.r(carCallG);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.oed
    public final void w(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws wfo {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(5708)).w("unholdCall(%d)", carCall.a);
        defpackage.wfp.c();
        if (this.q) {
            this.c.s(carCall);
        } else {
            M();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.oed
    public final void x() throws wfo {
        defpackage.wfp.c();
        if (this.q) {
            java.util.Iterator it = this.n.iterator();
            while (it.hasNext()) {
                this.c.x((defpackage.omf) it.next());
            }
            defpackage.lhn lhnVar = this.m;
            if (lhnVar != null) {
                lhnVar.d();
                this.m = null;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.oed
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean y(int i) throws wfo {
        defpackage.wfp.c();
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5663)).w("closeCall(%d)", i);
        if (this.q) {
            return this.c.t(i);
        }
        M();
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.oed
    public final boolean z(int i) throws wfo {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.l().l(5, java.util.concurrent.TimeUnit.SECONDS)).ai(5670)).w("getMuted for call: %d", i);
        defpackage.wfp.c();
        if (!this.q) {
            M();
            return false;
        }
        com.google.android.apps.auto.components.telecom.call.CarCall carCallE = defpackage.oeh.a().e(i);
        if (carCallE != null) {
            return this.c.u(carCallE);
        }
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 5671)).w("Failed to getMuted for call %d, call not found", i);
        return false;
    }
}
