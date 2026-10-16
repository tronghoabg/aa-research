package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.net.Uri;
import android.telecom.CallAudioState;
import android.telecom.PhoneAccountHandle;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class oeg implements odk {
    private final tgy a;
    private final oem b;
    private final mjv c;

    public oeg(tgy tgyVar, mjv mjvVar, oem oemVar) {
        this.a = tgyVar;
        this.c = mjvVar;
        this.b = oemVar;
    }

    @Override // defpackage.odk
    public final int a() {
        tgy tgyVar = this.a;
        synchronized (((the) tgyVar).c) {
            thc thcVar = ((the) tgyVar).d;
            if (thcVar != null && thcVar.b()) {
                return thcVar.g.intValue();
            }
            return 2;
        }
    }

    @Override // defpackage.odk
    public final int b() {
        tgy tgyVar = this.a;
        synchronized (((the) tgyVar).c) {
            thc thcVar = ((the) tgyVar).d;
            if (thcVar != null && thcVar.b()) {
                return thcVar.f.intValue();
            }
            return 0;
        }
    }

    @Override // defpackage.odk
    public final Uri c(CarCall carCall) {
        throw new UnsupportedOperationException("getVoipCallIcon not supported in Q-");
    }

    @Override // defpackage.odk
    public final CallAudioState d() {
        throw new UnsupportedOperationException("Call audio state in not available in Q-.");
    }

    @Override // defpackage.odk
    public final Integer e(CarCall carCall) {
        throw new UnsupportedOperationException("getParticipantCount not supported in Q-");
    }

    @Override // defpackage.odk
    public final String f(CarCall carCall) {
        throw new UnsupportedOperationException("getCurrentSpeaker not supported in Q-");
    }

    @Override // defpackage.odk
    public final List g() {
        Stream map = Collection.EL.stream(this.a.a()).map(new mix(this.c, 9));
        int i = yfq.d;
        return yfq.y((Iterable) map.collect(ycm.a));
    }

    @Override // defpackage.odk
    public final void h(CarCall carCall) {
        tgy tgyVar = this.a;
        com.google.android.gms.car.CarCall carCallA = this.c.A(carCall);
        qqe qqeVar = ((the) tgyVar).e;
        if (qqeVar != null) {
            svz svzVarA = qqeVar.a(carCallA);
            svzVarA.n(new kmp(carCallA, 8));
            svzVarA.j(new tgz(carCallA, 3));
        }
    }

    @Override // defpackage.odk
    public final void i(CarCall carCall, CarCall carCall2) {
        mjv mjvVar = this.c;
        com.google.android.gms.car.CarCall carCallA = mjvVar.A(carCall);
        com.google.android.gms.car.CarCall carCallA2 = mjvVar.A(carCall2);
        qqe qqeVar = ((the) this.a).e;
        if (qqeVar != null) {
            qqeVar.i(carCallA, carCallA2);
        }
    }

    @Override // defpackage.odk
    public final void j(CarCall carCall) {
        tgy tgyVar = this.a;
        com.google.android.gms.car.CarCall carCallA = this.c.A(carCall);
        qqe qqeVar = ((the) tgyVar).e;
        if (qqeVar != null) {
            qqeVar.k(carCallA);
        }
    }

    @Override // defpackage.odk
    public final void k(String str) {
        qqe qqeVar = ((the) this.a).e;
        if (qqeVar != null) {
            svz svzVarG = qqeVar.g(str);
            svzVarG.n(new tha(0));
            svzVarG.j(new kmq(4));
        }
    }

    @Override // defpackage.odk
    public final void l(CarCall carCall, char c) {
        com.google.android.gms.car.CarCall carCallA = this.c.A(carCall);
        qqe qqeVar = ((the) this.a).e;
        if (qqeVar != null) {
            qqeVar.m(carCallA, c);
        }
    }

    @Override // defpackage.odk
    public final void m(BluetoothDevice bluetoothDevice) {
        throw new UnsupportedOperationException("Requesting audio routing for specific device is not supported in Q-.");
    }

    @Override // defpackage.odk
    public final void n(int i) {
        qqe qqeVar = ((the) this.a).e;
        if (qqeVar != null) {
            svz svzVarH = qqeVar.h(i);
            svzVarH.n(new tha(1));
            svzVarH.j(new kmq(3));
        }
    }

    @Override // defpackage.odk
    public final void o(CarCall carCall, boolean z) {
        qqe qqeVar = ((the) this.a).e;
        if (qqeVar != null) {
            qqeVar.o(z);
        }
    }

    @Override // defpackage.odk
    public final void p(Context context) {
        yph yphVar = the.a;
        ((ype) ((ype) yphVar.f()).ai((char) 9065)).u("start");
        context.getClass();
        the theVar = (the) this.a;
        theVar.f = context;
        theVar.e = new qqe(theVar.f);
        theVar.e.j();
        thb thbVar = theVar.g;
        qqe qqeVar = theVar.e;
        smr smrVarS = qqeVar.s(thbVar, "call-listener");
        smx smxVar = new smx();
        smxVar.c = smrVarS;
        smxVar.a = new qpy(smrVarS, 3);
        smxVar.b = new qpy(smrVarS, 4);
        smxVar.f = 11007;
        qqeVar.x(smxVar.a());
        theVar.c(null, null);
        oem oemVar = this.b;
        ((ype) yphVar.l().ai((char) 9046)).y("addListener: %s", oemVar);
        List list = theVar.b;
        synchronized (list) {
            list.add(oemVar);
        }
    }

    @Override // defpackage.odk
    public final void q() {
        oem oemVar = this.b;
        ((ype) the.a.l().ai((char) 9058)).y("removeListener: %s", oemVar);
        List list = ((the) this.a).b;
        synchronized (list) {
            list.remove(oemVar);
        }
        tgy tgyVar = this.a;
        ((ype) ((ype) the.a.f()).ai((char) 9066)).u("stop");
        the theVar = (the) tgyVar;
        qqe qqeVar = theVar.e;
        if (qqeVar != null) {
            smp smpVar = qqeVar.s(theVar.g, "call-listener").a;
            smpVar.getClass();
            qqeVar.v(smpVar, 11009);
            theVar.e = null;
        }
        synchronized (theVar.c) {
            ((the) tgyVar).d = null;
        }
    }

    @Override // defpackage.odk
    public final void r(CarCall carCall) {
        com.google.android.gms.car.CarCall carCallA = this.c.A(carCall);
        qqe qqeVar = ((the) this.a).e;
        if (qqeVar != null) {
            qqeVar.p(carCallA);
        }
    }

    @Override // defpackage.odk
    public final void s(CarCall carCall) {
        tgy tgyVar = this.a;
        com.google.android.gms.car.CarCall carCallA = this.c.A(carCall);
        qqe qqeVar = ((the) tgyVar).e;
        if (qqeVar != null) {
            qqeVar.q(carCallA);
        }
    }

    @Override // defpackage.odk
    public final boolean t(int i) {
        thc thcVar;
        tgy tgyVar = this.a;
        synchronized (((the) tgyVar).c) {
            if (((the) tgyVar).e != null && (thcVar = ((the) tgyVar).d) != null) {
                for (com.google.android.gms.car.CarCall carCall : thcVar.c) {
                    if (carCall.a == i) {
                        if (carCall.e == 2) {
                            qqe qqeVar = ((the) tgyVar).e;
                            qqeVar.getClass();
                            svz svzVarN = qqeVar.n(carCall);
                            svzVarN.n(new kmp(carCall, 2));
                            svzVarN.j(new tgz(carCall, 0));
                        } else {
                            qqe qqeVar2 = ((the) tgyVar).e;
                            qqeVar2.getClass();
                            svz svzVarB = qqeVar2.b(carCall);
                            svzVarB.n(new kmp(carCall, 7));
                            svzVarB.j(new tgz(carCall, 2));
                        }
                        return true;
                    }
                }
                mjv.x(thd.e, null);
                return false;
            }
            return false;
        }
    }

    @Override // defpackage.odk
    public final boolean u(CarCall carCall) {
        tgy tgyVar = this.a;
        synchronized (((the) tgyVar).c) {
            thc thcVar = ((the) tgyVar).d;
            if (thcVar != null && thcVar.b()) {
                return thcVar.e.booleanValue();
            }
            return false;
        }
    }

    @Override // defpackage.odk
    public final void v(CarCall carCall, PhoneAccountHandle phoneAccountHandle) {
        com.google.android.gms.car.CarCall carCallA = this.c.A(carCall);
        qqe qqeVar = ((the) this.a).e;
        if (qqeVar != null) {
            qqeVar.l(carCallA, phoneAccountHandle);
        }
    }

    @Override // defpackage.odk
    public final void w(ebf ebfVar) {
        oem oemVar = this.b;
        oemVar.a.add(ebfVar);
        Iterator it = this.a.a().iterator();
        while (it.hasNext()) {
            ebfVar.n(oemVar.b.z((com.google.android.gms.car.CarCall) it.next()));
        }
    }

    @Override // defpackage.odk
    public final void x(ebf ebfVar) {
        this.b.a.remove(ebfVar);
    }
}
