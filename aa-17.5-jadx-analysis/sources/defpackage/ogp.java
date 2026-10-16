package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.telecom.Call;
import android.telecom.CallAudioState;
import android.telecom.InCallService;
import android.telecom.PhoneAccountHandle;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import j$.util.Optional;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class ogp extends oge {
    public static final yph a = yph.c("GH.ICarCall");
    public final ogc b;
    public final InCallService d;
    final ajmd e;
    private final Context g;
    private final ogy i;
    private final CopyOnWriteArraySet f = new CopyOnWriteArraySet();
    private final xww h = new ogg();
    public final Call.Callback c = new ogj(this);

    public ogp(Context context, ogy ogyVar) {
        ajmd ajmdVar = new ajmd(this, null);
        this.e = ajmdVar;
        this.g = context;
        this.b = new ogc();
        this.i = ogyVar;
        ogyVar.d.add(ajmdVar);
        InCallService inCallService = ogyVar.c;
        if (inCallService == null) {
            inCallService = ogyVar.b;
            inCallService.getClass();
        }
        this.d = inCallService;
    }

    @Override // defpackage.ogf
    public final void A(CarCall carCall) throws RemoteException {
        this.b.a(carCall).unhold();
    }

    @Override // defpackage.ogf
    public final boolean B() throws RemoteException {
        InCallService inCallService = this.d;
        if (inCallService == null) {
            ((ype) ((ype) a.h()).ai((char) 5891)).u("Can't get muted if localInCallService is null");
            return false;
        }
        CallAudioState callAudioState = inCallService.getCallAudioState();
        if (callAudioState != null) {
            return callAudioState.isMuted();
        }
        return false;
    }

    @Override // defpackage.ogf
    public final boolean C(CarCall carCall) {
        InCallService inCallService = this.d;
        if (inCallService == null) {
            ((ype) ((ype) a.h()).ai((char) 5894)).u("Can't check local call silence state if localInCallService is null");
            return false;
        }
        if (acqd.m()) {
            ohh ohhVar = (ohh) inCallService;
            Call callA = this.b.a(carCall);
            if (callA != null) {
                ohf ohfVar = (ohf) ohhVar.c.get(callA);
                if (ohfVar != null) {
                    return ohfVar.c;
                }
                return false;
            }
        }
        ((ype) ((ype) a.g()).ai((char) 5893)).u("No Telecom Call for the given CarCall");
        return false;
    }

    @Override // defpackage.ogf
    public final boolean D(ogs ogsVar) throws RemoteException {
        return this.f.add(new xwv(this.h, ogsVar));
    }

    @Override // defpackage.ogf
    public final boolean E(CarCall carCall) {
        InCallService inCallService = this.d;
        if (inCallService == null) {
            ((ype) ((ype) a.h()).ai((char) 5902)).u("Can't check local call silence support if localInCallService is null");
            return false;
        }
        if (acqd.m()) {
            ohh ohhVar = (ohh) inCallService;
            Call callA = this.b.a(carCall);
            if (callA != null) {
                ohf ohfVar = (ohf) ohhVar.c.get(callA);
                if (ohfVar != null) {
                    return ohfVar.b;
                }
                return false;
            }
        }
        ((ype) ((ype) a.g()).ai((char) 5901)).u("No Telecom Call for the given CarCall");
        return false;
    }

    @Override // defpackage.ogf
    public final boolean F(ogs ogsVar) throws RemoteException {
        return this.f.remove(new xwv(this.h, ogsVar));
    }

    @Override // defpackage.ogf
    public final void G() throws RemoteException {
        throw new UnsupportedOperationException("ICarCall.dispatchPhoneKeyEvent is deprecated.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ogs] */
    public final void a(ogo ogoVar) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            xwv xwvVar = (xwv) it.next();
            try {
                ogoVar.a(xwvVar.a);
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 5895)).u("Remote Exception - ack!");
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, yzy.aP).l());
                this.f.remove(xwvVar);
            }
        }
    }

    @Override // defpackage.ogf
    public final int e() throws RemoteException {
        InCallService inCallService = this.d;
        if (inCallService == null) {
            ((ype) ((ype) a.h()).ai((char) 5888)).u("Can't get audio route if localInCallService is null");
            return 0;
        }
        CallAudioState callAudioState = inCallService.getCallAudioState();
        if (callAudioState != null) {
            return callAudioState.getRoute();
        }
        return 0;
    }

    @Override // defpackage.ogf
    public final int f() throws RemoteException {
        InCallService inCallService = this.d;
        if (inCallService == null) {
            ((ype) ((ype) a.h()).ai((char) 5892)).u("Can't get audio route mask if localInCallService is null");
            return 0;
        }
        CallAudioState callAudioState = inCallService.getCallAudioState();
        if (callAudioState != null) {
            return callAudioState.getSupportedRouteMask();
        }
        return 0;
    }

    @Override // defpackage.ogf
    public final CallAudioState g() {
        InCallService inCallService = this.d;
        if (inCallService != null) {
            return (CallAudioState) Optional.ofNullable(inCallService.getCallAudioState()).orElse(odo.a);
        }
        ((ype) ((ype) a.h()).ai((char) 5889)).u("Can't get call audio state if localInCallService is null");
        return odo.a;
    }

    @Override // defpackage.ogf
    public final List h() throws RemoteException {
        InCallService inCallService = this.d;
        if (inCallService != null) {
            return this.b.d(inCallService.getCalls());
        }
        ((ype) ((ype) a.h()).ai((char) 5890)).u("Can't get calls if localInCallService is null, returning empty list");
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.ogf
    public final void i(CarCall carCall) throws RemoteException {
        this.b.a(carCall).answer(0);
    }

    @Override // defpackage.ogf
    public final void j(CarCall carCall, CarCall carCall2) throws RemoteException {
        ogc ogcVar = this.b;
        ogcVar.a(carCall).conference(ogcVar.a(carCall2));
    }

    @Override // defpackage.ogf
    public final void k(CarCall carCall) throws RemoteException {
        Call callA = this.b.a(carCall);
        if (callA != null) {
            callA.disconnect();
        }
    }

    @Override // defpackage.ogf
    public final void m(CarCall carCall) throws RemoteException {
        this.b.a(carCall).hold();
    }

    @Override // defpackage.ogf
    public final void n(CarCall carCall, PhoneAccountHandle phoneAccountHandle, boolean z) {
        Call callA = this.b.a(carCall);
        if (callA != null) {
            callA.phoneAccountSelected(phoneAccountHandle, z);
        }
    }

    @Override // defpackage.ogf
    public final void o(String str) throws RemoteException {
        p(Uri.fromParts("tel", str, null), null);
    }

    @Override // defpackage.ogf
    public final void p(Uri uri, Bundle bundle) throws RemoteException {
        Intent intent = new Intent("android.intent.action.CALL_PRIVILEGED", uri);
        intent.addFlags(268435456);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        Binder.clearCallingIdentity();
        this.g.startActivity(intent);
    }

    @Override // defpackage.ogf
    public final void q(CarCall carCall, char c) throws RemoteException {
        this.b.a(carCall).playDtmfTone(c);
    }

    @Override // defpackage.ogf
    public final void r(CarCall carCall, boolean z) throws RemoteException {
        this.b.a(carCall).postDialContinue(z);
    }

    @Override // defpackage.ogf
    public final void s(CarCall carCall, boolean z, String str) throws RemoteException {
        this.b.a(carCall).reject(z, str);
    }

    @Override // defpackage.ogf
    public final void t(BluetoothDevice bluetoothDevice) {
        InCallService inCallService = this.d;
        if (inCallService == null) {
            ((ype) ((ype) a.h()).ai((char) 5896)).u("Can't select Bluetooth audio if localInCallService is null");
        } else {
            inCallService.requestBluetoothAudio(bluetoothDevice);
        }
    }

    @Override // defpackage.ogf
    public final void u(CarCall carCall, boolean z) {
        InCallService inCallService = this.d;
        if (inCallService == null) {
            ((ype) ((ype) a.h()).ai((char) 5898)).u("Can't request local call silence update if localInCallService is null");
            return;
        }
        if (acqd.m()) {
            ohh ohhVar = (ohh) inCallService;
            Call callA = this.b.a(carCall);
            if (callA != null) {
                ahnc.d(dty.f(ohhVar), mkm.a.c(), 0, new far(ohhVar, callA, z, (afck) null, 8), 2);
            } else {
                ((ype) ((ype) a.h()).ai((char) 5897)).u("Cannot request call silence for CarCall that does not have a Telecom equivalent");
            }
        }
    }

    @Override // defpackage.ogf
    public final void v(CarCall carCall, String str, Bundle bundle) throws RemoteException {
        this.b.a(carCall).sendCallEvent(str, bundle);
    }

    @Override // defpackage.ogf
    public final void w(int i) throws RemoteException {
        InCallService inCallService = this.d;
        if (inCallService == null) {
            ((ype) ((ype) a.h()).ai((char) 5899)).u("Can't set audio route if localInCallService is null");
        } else {
            inCallService.setAudioRoute(i);
        }
    }

    @Override // defpackage.ogf
    public final void x(boolean z) throws RemoteException {
        InCallService inCallService = this.d;
        if (inCallService == null) {
            ((ype) ((ype) a.h()).ai((char) 5900)).u("Can't set muted if localInCallService is null");
        } else {
            inCallService.setMuted(z);
        }
    }

    @Override // defpackage.ogf
    public final void y(CarCall carCall) throws RemoteException {
        this.b.a(carCall).splitFromConference();
    }

    @Override // defpackage.ogf
    public final void z(CarCall carCall) throws RemoteException {
        this.b.a(carCall).stopDtmfTone();
    }

    @Override // defpackage.ogf
    public final void l() throws RemoteException {
    }
}
