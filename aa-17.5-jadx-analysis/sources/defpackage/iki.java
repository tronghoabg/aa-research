package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.car.CarPhoneStatus;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class iki extends qxo implements jbg, jbo {
    public static final yph a = yph.c("CAR.INST");
    public final aat b = new aat(0);
    public volatile boolean c;
    private final Context d;
    private final rbe e;
    private final jer f;
    private jbh g;

    public iki(Context context, rbe rbeVar, jer jerVar) {
        this.d = context;
        this.e = rbeVar;
        this.f = jerVar;
    }

    private static final void n(qxs qxsVar) {
        if (qxsVar == null) {
            throw new IllegalArgumentException("CarPhoneStatusEventListener is null");
        }
    }

    @Override // defpackage.jbo
    @ResultIgnorabilityUnspecified
    public final iyw a(xnz xnzVar) {
        if ((xnzVar.b & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            return null;
        }
        this.c = true;
        return this;
    }

    @Override // defpackage.iyw
    public final jbj b(jbn jbnVar) {
        return new jbh(this, jbnVar);
    }

    @Override // defpackage.iyw
    public final jcv c() {
        return roc.aH();
    }

    @Override // defpackage.iyw
    public final jcv d() {
        return roc.aH();
    }

    public final void f(ikh ikhVar) {
        qxs qxsVar = ikhVar.a;
        qxsVar.asBinder().unlinkToDeath(ikhVar, 0);
        this.b.remove(qxsVar.asBinder());
    }

    @Override // defpackage.qxp
    public final void g(CarPhoneStatus carPhoneStatus) throws RemoteException {
        this.f.b();
        if (!this.c) {
            throw new IllegalStateException("CarNotConnected");
        }
        if (this.g == null) {
            throw new IllegalStateException("PhoneStatusEndpoint not set.");
        }
        int i = 0;
        while (true) {
            CarPhoneStatus.CarCall[] carCallArr = carPhoneStatus.a;
            if (i >= carCallArr.length) {
                break;
            }
            rbe.d(carCallArr[i].f);
            i++;
        }
        abnp abnpVarN = xmd.a.n();
        CarPhoneStatus.CarCall[] carCallArr2 = carPhoneStatus.a;
        if (carCallArr2 != null) {
            for (CarPhoneStatus.CarCall carCall : carCallArr2) {
                xmc xmcVarB = xmc.b(carCall.a);
                abnp abnpVarN2 = xmb.a.n();
                xmc xmcVar = (xmc) new ntn(xmcVarB).i(xmc.UNKNOWN);
                abnpVarN2.t();
                xmb xmbVar = (xmb) abnpVarN2.b;
                xmbVar.c = xmcVar.h;
                xmbVar.b |= 1;
                int i2 = carCall.b;
                abnpVarN2.t();
                xmb xmbVar2 = (xmb) abnpVarN2.b;
                xmbVar2.b |= 2;
                xmbVar2.d = i2;
                String str = carCall.c;
                if (str != null) {
                    abnpVarN2.t();
                    xmb xmbVar3 = (xmb) abnpVarN2.b;
                    xmbVar3.b |= 4;
                    xmbVar3.e = str;
                }
                String str2 = carCall.d;
                if (str2 != null) {
                    abnpVarN2.t();
                    xmb xmbVar4 = (xmb) abnpVarN2.b;
                    xmbVar4.b |= 8;
                    xmbVar4.f = str2;
                }
                String str3 = carCall.e;
                if (str3 != null) {
                    abnpVarN2.t();
                    xmb xmbVar5 = (xmb) abnpVarN2.b;
                    xmbVar5.b |= 16;
                    xmbVar5.g = str3;
                }
                byte[] bArr = carCall.f;
                if (bArr != null) {
                    abms abmsVarV = abms.v(bArr);
                    abnpVarN2.t();
                    xmb xmbVar6 = (xmb) abnpVarN2.b;
                    abmsVarV.getClass();
                    xmbVar6.b |= 32;
                    xmbVar6.h = abmsVarV;
                }
                abnpVarN.t();
                xmd xmdVar = (xmd) abnpVarN.b;
                xmb xmbVar7 = (xmb) abnpVarN2.q();
                xmbVar7.getClass();
                aboh abohVar = xmdVar.c;
                if (!abohVar.c()) {
                    xmdVar.c = abnv.I(abohVar);
                }
                xmdVar.c.add(xmbVar7);
            }
        }
        int i3 = carPhoneStatus.b;
        abnpVarN.t();
        xmd xmdVar2 = (xmd) abnpVarN.b;
        xmdVar2.b |= 1;
        xmdVar2.d = i3;
        this.g.k(32769, (xmd) abnpVarN.q());
    }

    @Override // defpackage.qxp
    public final void h(qxs qxsVar, CarPhoneStatus carPhoneStatus) throws RemoteException {
        n(qxsVar);
        g(carPhoneStatus);
    }

    @Override // defpackage.qxp
    public final boolean i() {
        return this.c;
    }

    @Override // defpackage.qxp
    @ResultIgnorabilityUnspecified
    public final boolean j(int i, qxs qxsVar) {
        if (!this.e.l(this.d, getCallingUid())) {
            throw new SecurityException("Wrong signature - go/gearhead-retail-device");
        }
        n(qxsVar);
        aat aatVar = this.b;
        synchronized (aatVar) {
            if (!aatVar.containsKey(qxsVar.asBinder())) {
                ikh ikhVar = new ikh(this, i, qxsVar);
                try {
                    ikhVar.a.asBinder().linkToDeath(ikhVar, 0);
                    aatVar.put(qxsVar.asBinder(), ikhVar);
                } catch (RemoteException e) {
                    ((ype) ((ype) ((ype) a.h()).p(e)).ai(174)).u("Adding listener failed");
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.qxp
    public final boolean k(qxs qxsVar) {
        return j(0, qxsVar);
    }

    @Override // defpackage.qxp
    @ResultIgnorabilityUnspecified
    public final boolean l(qxs qxsVar) {
        n(qxsVar);
        aat aatVar = this.b;
        synchronized (aatVar) {
            ikh ikhVar = (ikh) aatVar.get(qxsVar.asBinder());
            if (ikhVar == null) {
                return false;
            }
            f(ikhVar);
            return true;
        }
    }

    @Override // defpackage.iyw
    public final void m(PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.iyw
    public final void q() {
        throw null;
    }

    @Override // defpackage.iyw
    public final void r(jbj jbjVar) {
        this.g = (jbh) jbjVar;
    }
}
