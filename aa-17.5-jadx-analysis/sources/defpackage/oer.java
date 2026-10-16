package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telecom.CallAudioState;
import android.telecom.PhoneAccountHandle;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.apps.auto.components.telecom.PhoneCall;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Optional;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class oer implements odj {
    public static final yph a = yph.c("GH.CallManager");
    public final Context b;
    public final odk c;
    public final xya d;
    public final Handler e;
    public final Map f;
    public int g;
    public Optional h;
    public String i;
    public boolean j;
    final ebf k;
    private final TelephonyManager l;
    private lhg m;
    private final List n;
    private String o;
    private Handler p;
    private boolean q;
    private final kfn r;

    public oer(Context context) {
        odk oegVar;
        yph yphVar = oen.a;
        xya xyaVar = new xya(xvx.a);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.n = copyOnWriteArrayList;
        this.e = new Handler(Looper.getMainLooper());
        this.f = new HashMap();
        this.g = 0;
        this.h = Optional.empty();
        oep oepVar = new oep(this);
        this.k = oepVar;
        this.r = new oeq(this);
        context.getClass();
        this.b = context;
        copyOnWriteArrayList.add(oepVar);
        this.l = (TelephonyManager) context.getSystemService("phone");
        ((ype) ((ype) oen.a.f()).ai((char) 5605)).u("creating call adapter instance");
        ohs ohsVar = (ohs) mki.a.i(ohs.class);
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(TelephonyManager.class);
        ohs ohsVar2 = (ohs) mki.a.i(ohs.class);
        rqu rquVarH = rqv.h(yxy.GEARHEAD, 35, yyv.PHONE_SIMS_COUNT_PRESENT);
        rquVarH.h(telephonyManager.getPhoneCount());
        ohsVar2.f(rquVarH);
        if (Build.VERSION.SDK_INT >= 30) {
            oegVar = new ofb();
        } else {
            ohsVar.x(3, yyv.CALL_ADAPTER_GMS_CALL_CLIENT);
            int i = yfq.d;
            oegVar = new oeg(new the(yls.a), new mjv(), new oem(new mjv()));
        }
        this.c = oegVar;
        this.d = xyaVar;
    }

    static PhoneCall F(CarCall carCall, Context context) {
        String strAl = woy.al(odn.a().u(carCall));
        String string = odn.a().m(context, strAl).toString();
        odm odmVarA = odm.a(carCall.e);
        int i = carCall.a;
        String strP = odn.a().p(context, carCall);
        CharSequence charSequenceL = odn.a().l(context, carCall);
        if (!mcd.A().u() || !mcd.A().t(carCall)) {
            return new PhoneCall(i, odmVarA, strP, strAl, string, null, 0, mkn.b, charSequenceL != null ? charSequenceL.toString() : null);
        }
        ComponentName componentNameB = mcd.A().b(carCall);
        ComponentName componentName = mkn.b;
        woy.O(!componentNameB.equals(componentName), "No component set for VOIP call");
        String string2 = charSequenceL != null ? charSequenceL.toString() : null;
        woy.O(!componentNameB.equals(componentName), "Should not be creating VOIP calls with the GH_TELECOM component");
        return new PhoneCall(i, odmVarA, strP, strAl, string, null, 0, componentNameB, string2);
    }

    public static void I(IllegalArgumentException illegalArgumentException) {
        yph yphVar = a;
        ((ype) ((ype) yphVar.g()).ai((char) 5649)).u("Bluetooth exception when accessing call bluetooth devices.");
        ((ype) ((ype) yphVar.g()).ai((char) 5650)).y("Exception message: %s", illegalArgumentException.getMessage());
        if (!acxa.aN()) {
            throw illegalArgumentException;
        }
        ebf.j().f(rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, yzy.Ff));
    }

    private static void L(Context context, ComponentName componentName, boolean z) {
        context.getPackageManager().setComponentEnabledSetting(componentName, true != z ? 2 : 1, 1);
    }

    private static final void M() {
        ((ype) ((ype) a.g()).ai((char) 5656)).u("User initiated action with uninitialized call adapter");
        ((ohs) mki.a.i(ohs.class)).B(yyv.CALL_ADAPTER_OPERATION, yyw.CM_ADAPTER_NOT_INITIALIZED);
        ((ohs) mki.a.i(ohs.class)).F(rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, yzy.Eu).l());
    }

    @Override // defpackage.odj
    public final boolean A() {
        return !TextUtils.isEmpty(G());
    }

    @Override // defpackage.odj
    public final boolean B() {
        return l().contains(2);
    }

    @Override // defpackage.odj
    public final boolean C(String str) {
        String strG = G();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(strG)) {
            return false;
        }
        return PhoneNumberUtils.compare(str, strG);
    }

    @Override // defpackage.odj
    public final void D(ebf ebfVar) {
        ((ype) a.l().ai((char) 5636)).y("addCarCallListener(%s)", ebfVar);
        this.n.add(ebfVar);
        if (this.q) {
            this.c.w(ebfVar);
        }
    }

    @Override // defpackage.odj
    public final void E(ebf ebfVar) {
        ((ype) a.l().ai((char) 5668)).y("removeCarCallListener(%s)", ebfVar);
        this.n.remove(ebfVar);
        if (this.q) {
            this.c.x(ebfVar);
        }
    }

    final String G() {
        String str = this.o;
        if (str != null) {
            return str;
        }
        if (!lgv.c().k()) {
            ((ype) ((ype) a.f()).ai((char) 5648)).u("Missing phone permissions. Cannot get voicemail number");
            return null;
        }
        try {
            String voiceMailNumber = this.l.getVoiceMailNumber();
            this.o = voiceMailNumber;
            return voiceMailNumber;
        } catch (SecurityException e) {
            if (e.getMessage() == null || !(e.getMessage().contains("READ_PHONE_STATE") || e.getMessage().contains("No permission to write APN settings"))) {
                throw e;
            }
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5666)).u("Despite checking for READ_PHONE_STATE permission, getVoiceMailNumber is failing. Can't get voicemail number.");
            return null;
        }
    }

    public final void H() {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        L(this.b, thf.a, false);
    }

    public final void J(CarCall carCall) {
        ((ype) ((ype) a.f()).ai((char) 5652)).u("Logging call duration");
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, yzy.af);
        xya xyaVar = this.d;
        rrbVarH.u(xyaVar.a(TimeUnit.MILLISECONDS));
        if (carCall != null) {
            rrbVarH.p(mcd.A().b(carCall));
        }
        ebf.j().f(rrbVarH);
        xyaVar.d();
    }

    public final void K() {
        this.e.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.odj
    public final int a() {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 5640)).u("getAudioRoute");
        wer.c();
        int iA = this.q ? this.c.a() : 2;
        ((ype) ((ype) yphVar.f()).ai((char) 5641)).w("getAudioRoute: %d", iA);
        return iA;
    }

    @Override // defpackage.odj
    public final Uri b(CarCall carCall) {
        if (mcd.A().u()) {
            return this.c.c(carCall);
        }
        return null;
    }

    @Override // defpackage.lhg
    public final void c() {
        wer.c();
        Handler handler = this.p;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
            this.p = handler;
        }
        handler.removeCallbacksAndMessages(null);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, yzy.aL).l());
        if (Build.VERSION.SDK_INT >= 30) {
            kio.b().v(this.r);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            Context context = this.b;
            boolean z = odn.a().L(context) && odn.a().R();
            ((ype) ((ype) a.f()).ai((char) 5653)).y("Should enable duplex InCallService: %s", Boolean.valueOf(z));
            if (!z) {
                L(context, thf.a, false);
            }
            L(context, thf.b, !z);
        }
        if (!lgv.c().k()) {
            ((ype) ((ype) a.f()).ai((char) 5674)).u("Missing phone permissions. Doing nothing.");
            return;
        }
        odk odkVar = this.c;
        Context context2 = this.b;
        odkVar.p(context2);
        this.q = true;
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            odkVar.w((ebf) it.next());
        }
        lhg lhgVarB = lau.a().b(context2, this, new oet());
        this.m = lhgVarB;
        lhgVarB.c();
        mnc.a().b(mnb.g, this);
    }

    @Override // defpackage.lhg
    public final void d() {
        wer.c();
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, yzy.aM).l());
        if (Build.VERSION.SDK_INT >= 30) {
            kio.b().w(this.r);
        }
        this.i = null;
        CarCall carCallG = odn.a().g();
        if (carCallG != null || this.d.a) {
            J(carCallG);
        }
        K();
        if (this.q) {
            this.c.q();
            this.q = false;
        }
        this.o = null;
        mnc.a().d(mnb.g);
        this.f.clear();
        this.g = 0;
        this.h = Optional.empty();
        this.j = false;
        Handler handler = this.p;
        if (handler != null) {
            handler.postDelayed(new nqw(this, 20), acqd.e());
        } else {
            H();
        }
    }

    @Override // defpackage.odj
    public final PhoneCall e() {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 5679)).u("swapCalls()");
        wer.c();
        CarCall carCallG = odn.a().g();
        CarCall carCallH = odn.a().h();
        if (carCallG == null || carCallH == null) {
            ((ype) ((ype) yphVar.h()).ai((char) 5680)).u("need at least two call to swap.");
            return null;
        }
        if (carCallG.e != 4 || carCallH.e != 3) {
            ((ype) ((ype) yphVar.h()).ai(5681)).M("expect primary call to be active and secondary call to be holding for swap to work. But have primary(%s) secondary(%s)", carCallG, carCallH);
            return null;
        }
        odk odkVar = this.c;
        odkVar.j(carCallG);
        odkVar.s(carCallH);
        return F(carCallH, this.b);
    }

    @Override // defpackage.odj
    public final Integer f(CarCall carCall) {
        if (mcd.A().u()) {
            return this.c.e(carCall);
        }
        return null;
    }

    @Override // defpackage.odj
    public final String g(CarCall carCall) {
        if (mcd.A().u()) {
            return this.c.f(carCall);
        }
        return null;
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        List listI = i();
        if (listI.isEmpty()) {
            printWriter.println("No ongoing calls.");
        } else {
            printWriter.println("Ongoing calls:");
            PhoneCall phoneCall = (PhoneCall) listI.get(0);
            printWriter.printf("Primary call: %s\n\n", phoneCall);
            printWriter.printf("Primary call muted: %s\n", Boolean.valueOf(z(phoneCall.a)));
            if (listI.size() > 1) {
                printWriter.printf("Secondary call: %s\n\n", (PhoneCall) listI.get(1));
            }
        }
        printWriter.printf("Audio route: %s\n\n", CallAudioState.audioRouteToString(a()));
    }

    @Override // defpackage.odj
    public final List i() {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 5638)).u("getting Active calls");
        ArrayList arrayList = new ArrayList();
        if (!this.q) {
            M();
            return arrayList;
        }
        CarCall carCallG = odn.a().g();
        if (carCallG != null) {
            arrayList.add(F(carCallG, this.b));
        }
        CarCall carCallH = odn.a().h();
        if (carCallH != null) {
            arrayList.add(F(carCallH, this.b));
        }
        ((ype) yphVar.l().ai((char) 5639)).y("got Active calls: %s", arrayList);
        return arrayList;
    }

    @Override // defpackage.odj
    public final List j(Set set) {
        List<CarCall> listK = k();
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        for (CarCall carCall : listK) {
            if (set.contains(mcd.A().b(carCall).getPackageName())) {
                yflVar.i(F(carCall, this.b));
            }
        }
        return yflVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.odj
    public final List k() {
        wer.c();
        if (!this.q) {
            M();
            ((ype) ((ype) a.f()).ai((char) 5643)).u("getCalls - ICS not yet active");
            return Collections.EMPTY_LIST;
        }
        List listG = this.c.g();
        ArrayList arrayList = new ArrayList(((yls) listG).c);
        ynp ynpVarListIterator = ((yfq) listG).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            arrayList.add(Integer.valueOf(((CarCall) ynpVarListIterator.next()).a));
        }
        ((ype) ((ype) ((ype) a.f()).l(1, TimeUnit.MINUTES)).ai(5642)).y("getCalls: %s", arrayList);
        return listG;
    }

    @Override // defpackage.odj
    public final List l() {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 5646)).u("getOrderedAvailableAudioRoutes");
        wer.c();
        if (!this.q) {
            M();
            return Collections.EMPTY_LIST;
        }
        int iB = this.c.b();
        ((ype) ((ype) yphVar.f()).ai((char) 5647)).w("getOrderedAvailableAudioRoutes - mask: %d", iB);
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        if ((iB & 4) != 0) {
            yflVar.i(4);
        }
        if ((iB & 2) != 0) {
            yflVar.i(2);
        }
        if ((iB & 8) != 0) {
            yflVar.i(8);
        }
        if ((iB & 1) != 0) {
            yflVar.i(1);
        }
        return yflVar.g();
    }

    @Override // defpackage.odj
    public final void m(int i) {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 5634)).w("acceptCall(%d)", i);
        wer.c();
        if (!this.q) {
            M();
            return;
        }
        CarCall carCallE = odn.a().e(i);
        if (carCallE != null) {
            this.c.h(carCallE);
        } else {
            ((ype) ((ype) yphVar.g()).ai((char) 5635)).u("Could not find call with given id to answer.");
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, yzy.DR).l());
        }
    }

    @Override // defpackage.odj
    public final void n(CarCall carCall) {
        ((ype) ((ype) a.f()).ai(5651)).w("holdCall(%d)", carCall.a);
        wer.c();
        if (this.q) {
            this.c.j(carCall);
        } else {
            M();
        }
    }

    @Override // defpackage.odj
    @Deprecated
    public final void o() {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 5654)).u("mergeCalls()");
        CarCall carCallG = odn.a().g();
        CarCall carCallH = odn.a().h();
        if (carCallG == null || carCallH == null) {
            return;
        }
        ((ype) ((ype) yphVar.f()).ai(5655)).B("mergeCalls: primary: %d secondary: %d", carCallG.a, carCallH.a);
        wer.c();
        this.c.i(carCallG, carCallH);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    @Override // defpackage.odj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(java.lang.String r14) {
        /*
            r13 = this;
            yph r0 = defpackage.oer.a
            yop r1 = r0.f()
            java.lang.String r2 = "placeCall"
            r3 = 5659(0x161b, float:7.93E-42)
            defpackage.a.bs(r1, r2, r3)
            defpackage.wer.c()
            boolean r1 = r13.q
            if (r1 != 0) goto L18
            M()
            return
        L18:
            boolean r1 = android.text.TextUtils.isEmpty(r14)
            r2 = 1
            r1 = r1 ^ r2
            defpackage.woy.Z(r1)
            android.telephony.TelephonyManager r1 = r13.l
            ohs r3 = defpackage.ebf.j()
            int r1 = r1.getSimState()
            r4 = 5
            r5 = 0
            if (r1 != r4) goto L31
            r1 = r2
            goto L32
        L31:
            r1 = r5
        L32:
            android.content.Context r4 = r13.b
            android.content.ContentResolver r6 = r4.getContentResolver()
            java.lang.String r7 = "airplane_mode_on"
            int r6 = android.provider.Settings.System.getInt(r6, r7, r5)
            if (r6 == 0) goto L42
            r6 = r2
            goto L43
        L42:
            r6 = r5
        L43:
            boolean r7 = android.telephony.PhoneNumberUtils.isEmergencyNumber(r14)
            yop r8 = r0.f()
            ype r8 = (defpackage.ype) r8
            r9 = 5660(0x161c, float:7.931E-42)
            yop r8 = r8.ai(r9)
            ype r8 = (defpackage.ype) r8
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r7)
            java.lang.String r12 = "placeCall: isSimReady:%b airplaneMode:%b emergency:%b"
            r8.R(r12, r9, r10, r11)
            r8 = 3
            if (r7 == 0) goto L7f
            yyv r9 = defpackage.yyv.PHONE_CALL_TO_EMERGENCY_NUMBER
            r3.x(r8, r9)
            yxy r9 = defpackage.yxy.GEARHEAD
            yzz r10 = defpackage.yzz.PHONE_CALL
            yzy r11 = defpackage.yzy.Ev
            rrb r9 = defpackage.rrc.h(r9, r10, r11)
            rqy r9 = r9.l()
            r3.F(r9)
        L7f:
            if (r1 == 0) goto L84
            if (r6 == 0) goto L9e
            r6 = r2
        L84:
            if (r7 != 0) goto L9e
            if (r2 == r6) goto L8c
            r13 = 2132084025(0x7f150539, float:1.9808209E38)
            goto L8f
        L8c:
            r13 = 2132084012(0x7f15052c, float:1.9808183E38)
        L8f:
            yyv r14 = defpackage.yyv.PHONE_PLACE_CALL_FAILED
            r3.x(r8, r14)
            obs r14 = defpackage.obs.a()
            android.content.ComponentName r0 = defpackage.mkn.b
            r14.f(r4, r0, r13, r5)
            return
        L9e:
            odo r1 = defpackage.odn.a()
            r3 = 9
            int[] r2 = new int[]{r3, r5, r2}
            com.google.android.apps.auto.components.telecom.call.CarCall r1 = r1.f(r2)
            if (r1 != 0) goto Lb4
            odk r13 = r13.c
            r13.k(r14)
            return
        Lb4:
            yop r13 = r0.h()
            java.lang.String r14 = "Place call ignored, outgoing call in progress."
            r0 = 5661(0x161d, float:7.933E-42)
            defpackage.a.bs(r13, r14, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oer.p(java.lang.String):void");
    }

    @Override // defpackage.odj
    public final void q() {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 5662)).u("placeVoiceMailCall()");
        String strG = G();
        if (TextUtils.isEmpty(strG)) {
            ((ype) ((ype) yphVar.h()).ai((char) 5663)).u("Unable to get voicemail number.");
        } else {
            p(strG);
        }
    }

    @Override // defpackage.odj
    public final void r(char c) {
        yph yphVar = a;
        ((ype) yphVar.l().ai(5664)).v("playDtmfTone(%c)", c);
        wer.c();
        if (!this.q) {
            M();
            return;
        }
        CarCall carCallG = odn.a().g();
        if (carCallG == null) {
            ((ype) yphVar.l().ai((char) 5665)).u("No primary call, no Dtmf tone played");
        } else {
            this.c.l(carCallG, c);
        }
    }

    @Override // defpackage.odj
    public final void s(CarCall carCall, PhoneAccountHandle phoneAccountHandle) {
        wer.c();
        this.c.v(carCall, phoneAccountHandle);
    }

    @Override // defpackage.odj
    public final void t(int i) {
        ((ype) ((ype) a.f()).ai((char) 5670)).w("setAudioRoute: %d", i);
        wer.c();
        if (this.q) {
            this.c.n(i);
        } else {
            M();
        }
    }

    @Override // defpackage.odj
    public final void u(int i, boolean z) {
        yph yphVar = a;
        ((ype) yphVar.l().ai(5671)).E("setMute - callId: %d - muted: %b", i, z);
        wer.c();
        if (!this.q) {
            M();
            return;
        }
        CarCall carCallE = odn.a().e(i);
        if (carCallE == null) {
            ((ype) ((ype) yphVar.h()).ai((char) 5672)).w("Failed to setMuted for call %d, call not found", i);
        } else {
            this.c.o(carCallE, z);
        }
    }

    @Override // defpackage.odj
    public final void v() {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 5677)).u("stopDtmfTone()");
        wer.c();
        if (!this.q) {
            M();
            return;
        }
        CarCall carCallG = odn.a().g();
        if (carCallG == null) {
            ((ype) yphVar.l().ai((char) 5678)).u("No primary call, no Dtmf tone stopped");
        } else {
            this.c.r(carCallG);
        }
    }

    @Override // defpackage.odj
    public final void w(CarCall carCall) {
        ((ype) ((ype) a.f()).ai(5682)).w("unholdCall(%d)", carCall.a);
        wer.c();
        if (this.q) {
            this.c.s(carCall);
        } else {
            M();
        }
    }

    @Override // defpackage.odj
    public final void x() {
        wer.c();
        if (this.q) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                this.c.x((ebf) it.next());
            }
            lhg lhgVar = this.m;
            if (lhgVar != null) {
                lhgVar.d();
                this.m = null;
            }
        }
    }

    @Override // defpackage.odj
    @ResultIgnorabilityUnspecified
    public final boolean y(int i) {
        wer.c();
        ((ype) ((ype) a.f()).ai((char) 5637)).w("closeCall(%d)", i);
        if (this.q) {
            return this.c.t(i);
        }
        M();
        return false;
    }

    @Override // defpackage.odj
    public final boolean z(int i) {
        yph yphVar = a;
        ((ype) ((ype) yphVar.l().l(5, TimeUnit.SECONDS)).ai(5644)).w("getMuted for call: %d", i);
        wer.c();
        if (!this.q) {
            M();
            return false;
        }
        CarCall carCallE = odn.a().e(i);
        if (carCallE != null) {
            return this.c.u(carCallE);
        }
        ((ype) ((ype) yphVar.h()).ai((char) 5645)).w("Failed to getMuted for call %d, call not found", i);
        return false;
    }
}
