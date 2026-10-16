package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ohj extends defpackage.ogy {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.ICarCall");
    public final defpackage.ogw b;
    public final android.telecom.InCallService d;
    final ajnd e;
    private final android.content.Context g;
    private final defpackage.ohs i;
    private final java.util.concurrent.CopyOnWriteArraySet f = new java.util.concurrent.CopyOnWriteArraySet();
    private final defpackage.xyc h = new defpackage.oha();
    public final android.telecom.Call.Callback c = new defpackage.ohd(this);

    public ohj(android.content.Context context, defpackage.ohs ohsVar) {
        ajnd ajndVar = new ajnd(this, (byte[]) null);
        this.e = ajndVar;
        this.g = context;
        this.b = new defpackage.ogw();
        this.i = ohsVar;
        ohsVar.d.add(ajndVar);
        ohq ohqVar = ohsVar.c;
        if (ohqVar == null) {
            ohqVar = ohsVar.b;
            ohqVar.getClass();
        }
        this.d = ohqVar;
    }

    public final void A(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws android.os.RemoteException {
        this.b.a(carCall).unhold();
    }

    public final boolean B() throws android.os.RemoteException {
        android.telecom.InCallService inCallService = this.d;
        if (inCallService == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5917)).u("Can't get muted if localInCallService is null");
            return false;
        }
        android.telecom.CallAudioState callAudioState = inCallService.getCallAudioState();
        if (callAudioState != null) {
            return callAudioState.isMuted();
        }
        return false;
    }

    public final boolean C(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        android.telecom.InCallService inCallService = this.d;
        if (inCallService == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5920)).u("Can't check local call silence state if localInCallService is null");
            return false;
        }
        if (defpackage.acrf.m()) {
            defpackage.oib oibVar = (defpackage.oib) inCallService;
            android.telecom.Call callA = this.b.a(carCall);
            if (callA != null) {
                ohz ohzVar = (ohz) oibVar.c.get(callA);
                if (ohzVar != null) {
                    return ohzVar.c;
                }
                return false;
            }
        }
        ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 5919)).u("No Telecom Call for the given CarCall");
        return false;
    }

    public final boolean D(defpackage.ohm ohmVar) throws android.os.RemoteException {
        return this.f.add(new defpackage.xyb(this.h, ohmVar));
    }

    public final boolean E(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        android.telecom.InCallService inCallService = this.d;
        if (inCallService == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5928)).u("Can't check local call silence support if localInCallService is null");
            return false;
        }
        if (defpackage.acrf.m()) {
            defpackage.oib oibVar = (defpackage.oib) inCallService;
            android.telecom.Call callA = this.b.a(carCall);
            if (callA != null) {
                ohz ohzVar = (ohz) oibVar.c.get(callA);
                if (ohzVar != null) {
                    return ohzVar.b;
                }
                return false;
            }
        }
        ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 5927)).u("No Telecom Call for the given CarCall");
        return false;
    }

    public final boolean F(defpackage.ohm ohmVar) throws android.os.RemoteException {
        return this.f.remove(new defpackage.xyb(this.h, ohmVar));
    }

    public final void G() throws android.os.RemoteException {
        throw new java.lang.UnsupportedOperationException("ICarCall.dispatchPhoneKeyEvent is deprecated.");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ohm] */
    public final void a(ohi ohiVar) {
        for (defpackage.xyb xybVar : this.f) {
            try {
                ohiVar.a((defpackage.ohm) xybVar.a);
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 5921)).u("Remote Exception - ack!");
                defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, defpackage.zbd.aP).l());
                this.f.remove(xybVar);
            }
        }
    }

    public final int e() throws android.os.RemoteException {
        android.telecom.InCallService inCallService = this.d;
        if (inCallService == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5914)).u("Can't get audio route if localInCallService is null");
            return 0;
        }
        android.telecom.CallAudioState callAudioState = inCallService.getCallAudioState();
        if (callAudioState != null) {
            return callAudioState.getRoute();
        }
        return 0;
    }

    public final int f() throws android.os.RemoteException {
        android.telecom.InCallService inCallService = this.d;
        if (inCallService == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5918)).u("Can't get audio route mask if localInCallService is null");
            return 0;
        }
        android.telecom.CallAudioState callAudioState = inCallService.getCallAudioState();
        if (callAudioState != null) {
            return callAudioState.getSupportedRouteMask();
        }
        return 0;
    }

    public final android.telecom.CallAudioState g() {
        android.telecom.InCallService inCallService = this.d;
        if (inCallService != null) {
            return (android.telecom.CallAudioState) j$.util.Optional.ofNullable(inCallService.getCallAudioState()).orElse(defpackage.oei.a);
        }
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5915)).u("Can't get call audio state if localInCallService is null");
        return defpackage.oei.a;
    }

    public final java.util.List h() throws android.os.RemoteException {
        android.telecom.InCallService inCallService = this.d;
        if (inCallService != null) {
            return this.b.d(inCallService.getCalls());
        }
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5916)).u("Can't get calls if localInCallService is null, returning empty list");
        return java.util.Collections.EMPTY_LIST;
    }

    public final void i(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws android.os.RemoteException {
        this.b.a(carCall).answer(0);
    }

    public final void j(com.google.android.apps.auto.components.telecom.call.CarCall carCall, com.google.android.apps.auto.components.telecom.call.CarCall carCall2) throws android.os.RemoteException {
        defpackage.ogw ogwVar = this.b;
        ogwVar.a(carCall).conference(ogwVar.a(carCall2));
    }

    public final void k(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws android.os.RemoteException {
        android.telecom.Call callA = this.b.a(carCall);
        if (callA != null) {
            callA.disconnect();
        }
    }

    public final void m(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws android.os.RemoteException {
        this.b.a(carCall).hold();
    }

    public final void n(com.google.android.apps.auto.components.telecom.call.CarCall carCall, android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z) {
        android.telecom.Call callA = this.b.a(carCall);
        if (callA != null) {
            callA.phoneAccountSelected(phoneAccountHandle, z);
        }
    }

    public final void o(java.lang.String str) throws android.os.RemoteException {
        p(android.net.Uri.fromParts("tel", str, null), null);
    }

    public final void p(android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
        android.content.Intent intent = new android.content.Intent("android.intent.action.CALL_PRIVILEGED", uri);
        intent.addFlags(268435456);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        android.os.Binder.clearCallingIdentity();
        this.g.startActivity(intent);
    }

    public final void q(com.google.android.apps.auto.components.telecom.call.CarCall carCall, char c) throws android.os.RemoteException {
        this.b.a(carCall).playDtmfTone(c);
    }

    public final void r(com.google.android.apps.auto.components.telecom.call.CarCall carCall, boolean z) throws android.os.RemoteException {
        this.b.a(carCall).postDialContinue(z);
    }

    public final void s(com.google.android.apps.auto.components.telecom.call.CarCall carCall, boolean z, java.lang.String str) throws android.os.RemoteException {
        this.b.a(carCall).reject(z, str);
    }

    public final void t(android.bluetooth.BluetoothDevice bluetoothDevice) {
        android.telecom.InCallService inCallService = this.d;
        if (inCallService == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5922)).u("Can't select Bluetooth audio if localInCallService is null");
        } else {
            jx$.ExternalSyntheticApiModelOutline3.m(inCallService, bluetoothDevice);
        }
    }

    public final void u(com.google.android.apps.auto.components.telecom.call.CarCall carCall, boolean z) {
        android.telecom.InCallService inCallService = this.d;
        if (inCallService == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5924)).u("Can't request local call silence update if localInCallService is null");
            return;
        }
        if (defpackage.acrf.m()) {
            defpackage.oib oibVar = (defpackage.oib) inCallService;
            android.telecom.Call callA = this.b.a(carCall);
            if (callA != null) {
                ahoc.d(defpackage.eqy.b(oibVar), defpackage.mks.a.c(), 0, new fax(oibVar, callA, z, (defpackage.afdk) null, 8), 2);
            } else {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5923)).u("Cannot request call silence for CarCall that does not have a Telecom equivalent");
            }
        }
    }

    public final void v(com.google.android.apps.auto.components.telecom.call.CarCall carCall, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        je$.ExternalSyntheticApiModelOutline0.m(this.b.a(carCall), str, bundle);
    }

    public final void w(int i) throws android.os.RemoteException {
        android.telecom.InCallService inCallService = this.d;
        if (inCallService == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5925)).u("Can't set audio route if localInCallService is null");
        } else {
            inCallService.setAudioRoute(i);
        }
    }

    public final void x(boolean z) throws android.os.RemoteException {
        android.telecom.InCallService inCallService = this.d;
        if (inCallService == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5926)).u("Can't set muted if localInCallService is null");
        } else {
            inCallService.setMuted(z);
        }
    }

    public final void y(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws android.os.RemoteException {
        this.b.a(carCall).splitFromConference();
    }

    public final void z(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws android.os.RemoteException {
        this.b.a(carCall).stopDtmfTone();
    }

    public final void l() throws android.os.RemoteException {
    }
}
