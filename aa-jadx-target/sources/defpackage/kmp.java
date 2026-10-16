package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kmp implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kmp(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ((kmq) this.a).requestFocus();
                return;
            case 1:
                ((android.view.View) this.a).requestFocus();
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((kmq) this.a).requestFocus();
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.kmm kmmVarO = ((kmq) this.a).o();
                if (kmmVarO != null) {
                    kmmVarO.requestFocus();
                    return;
                }
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                knw knwVar = knw.p;
                yyp yypVar = (yyp) knj.b.getOrDefault(defpackage.pbd.SHUTDOWN, yyp.a);
                knj knjVar = (knj) this.a;
                knjVar.e.a(knwVar, yypVar);
                knjVar.d.quitSafely();
                knjVar.f = true;
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((koq) this.a).a();
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.kpr) this.a).a.w();
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.connectivity.reset.ConnectionResetReceiver.a.h()).ai((char) 3381)).y("Reset method %s not supported on this version of Android", ((rza) this.a).name());
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                kqt kqtVar = (kqt) this.a;
                if (kqtVar.h) {
                    if ((kqtVar.d.getCurrentFunctions() & 2) != 0) {
                        ((defpackage.yqj) kqt.a.l().ai((char) 3389)).u("Accessory connected, canceling device mode switch.");
                        return;
                    }
                    ((defpackage.yqj) kqt.a.l().ai(3388)).x("No accessory mode connection within %d ms", kqtVar.e.toMillis());
                    defpackage.omv.i(kqtVar.c, defpackage.yyn.USB_ISSUE_NO_ACCESSORY_MODE_TIMEOUT);
                    kqtVar.i = true;
                    kqtVar.f();
                    return;
                }
                return;
            case 9:
                kqt kqtVar2 = (kqt) this.a;
                int i = kqtVar2.g;
                kqtVar2.g = i + 1;
                ajku ajkuVar = kqtVar2.l;
                if (i >= ajkuVar.b.size()) {
                    ((defpackage.yqj) kqt.a.l().ai((char) 3385)).u("Ran out of USB modes to attempt.");
                    defpackage.omv.i(kqtVar2.c, defpackage.yyn.USB_ISSUE_NO_ACCESSORY_MODE_FAILED_TO_FIND_USB_FUNCTION);
                    kqtVar2.k = 3;
                    return;
                }
                defpackage.yqm yqmVar = kqt.a;
                ((defpackage.yqj) yqmVar.l().ai(3386)).w("Attempting to switch to USB mode %d", i);
                long jLongValue = ((java.lang.Long) ajkuVar.k(i)).longValue();
                if (jLongValue >= 0) {
                    kqtVar2.c(jLongValue);
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3387)).u("Function switch triggered, but performed no action.");
                }
                kqtVar2.b();
                kqtVar2.k = 2;
                return;
            case 10:
                java.lang.Object obj = this.a;
                if (defpackage.acyc.am() && !((defpackage.kzb) obj).m) {
                    ((defpackage.yqj) defpackage.kzb.a.l().ai((char) 3618)).u("notifyVoiceSessionReady called when session is not active. Ignoring.");
                    return;
                }
                java.util.Iterator it = ((defpackage.kzb) obj).g.iterator();
                while (it.hasNext()) {
                    defpackage.lao.c(new defpackage.kos(obj, (defpackage.kxd) it.next(), 11, null));
                }
                return;
            case 11:
                ((defpackage.kzb) this.a).u();
                return;
            case 12:
                defpackage.yqm yqmVar2 = defpackage.kzb.a;
                kzy kzyVarA = kzy.a();
                java.lang.Object obj2 = this.a;
                ((defpackage.saf) obj2).f("AssistantSuggestionsManager", new defpackage.kza(kzyVarA, obj2, 5)).l();
                return;
            case 13:
                ((defpackage.kzb) this.a).U();
                return;
            case 14:
                ((defpackage.yqj) ((defpackage.yqj) defpackage.lar.a.f()).ai((char) 3692)).u("Adding OS deprecation notification to Projected");
                defpackage.nuz.b().j("GH.DeprecationAlertGen", 28L, (nvh) this.a);
                return;
            case 15:
                lbd lbdVar = (lbd) this.a;
                if (lbdVar.i.b()) {
                    lbdVar.h();
                    return;
                }
                return;
            case 16:
                java.lang.Object obj3 = this.a;
                synchronized (obj3) {
                    ((defpackage.yqj) defpackage.ldt.a.l().ai(3761)).u("Timeout exceeded.");
                    ((defpackage.ldt) obj3).f = false;
                    ((defpackage.ldt) obj3).g = true;
                    ((defpackage.ldt) obj3).h();
                    break;
                }
                return;
            case 17:
                ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.frx.phonescreen.WirelessPreflightActivity.n.f()).ai((char) 3841)).u("User didn't unlock to proceed within 30s.");
                java.lang.Object obj4 = this.a;
                if (((com.google.android.apps.auto.components.frx.phonescreen.WirelessPreflightActivity) obj4).isFinishing()) {
                    return;
                }
                com.google.android.apps.auto.components.frx.phonescreen.WirelessPreflightActivity.D(defpackage.zbe.FRX_WIRELESS_PREFLIGHT_ACTIVITY, defpackage.zbd.pV);
                lfc lfcVar = (lfc) obj4;
                lfcVar.r = true;
                lfcVar.E();
                return;
            case 18:
                defpackage.liu liuVar = (defpackage.liu) this.a;
                liuVar.i = defpackage.liu.r();
                liuVar.a();
                return;
            case 19:
                ((do) ((defpackage.lma) this.a).b).k();
                return;
            default:
                ((do) ((defpackage.lma) this.a).b).b();
                return;
        }
    }
}
