package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.car.bluetooth.data.CarBluetoothData;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Optional;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class qrg extends qvq implements rsg, rgn, ruu {
    public static final ypf a = ols.R("CAR.BT.SVC");
    private static final xhp[] u = {xhp.BLUETOOTH_PAIRING_NUMERIC_COMPARISON, xhp.BLUETOOTH_PAIRING_PIN};
    public int b;
    public xhp c;
    public rhg d;
    public rgs e;
    public rsh g;
    public rgv h;
    public String j;
    public final CarBluetoothData k;
    public final boolean l;
    public final qrd m;
    public final Context n;
    public final rwz o;
    public final rwc p;
    public final rhw q;
    public final rwb r;
    public final wyd t;
    private String v;
    private xhp[] w;
    public final List f = new LinkedList();
    public boolean i = false;
    public volatile boolean s = false;

    public qrg(Context context, rwz rwzVar, rwc rwcVar, rhw rhwVar, wyd wydVar, rwb rwbVar, CarBluetoothData carBluetoothData, boolean z) {
        if (Build.VERSION.SDK_INT >= 34 && acuc.g()) {
            context = context.createDeviceContext(0);
        }
        this.n = context;
        this.o = rwzVar;
        this.p = rwcVar;
        this.q = rhwVar;
        this.t = wydVar;
        this.r = rwbVar;
        this.k = carBluetoothData;
        this.l = z;
        this.b = -6;
        this.m = new qrd(this, context);
    }

    protected static final rgk x(Context context) {
        if (Build.VERSION.SDK_INT >= 34 && acuc.g()) {
            context = context.createDeviceContext(0);
        }
        return rgk.a(context);
    }

    private final void y() {
        this.b = -1;
        this.c = xhp.BLUETOOTH_PAIRING_UNAVAILABLE;
        this.d = null;
        rgs rgsVarD = d(Looper.getMainLooper(), null, this);
        this.e = rgsVarD;
        rgsVarD.c(rgo.EVENT_SKIP_REQUESTED);
    }

    private final boolean z(Callable callable) {
        a.l().ai(7704).y("doBinderTask. task=%s", callable);
        return ((Boolean) rbe.b(new rmn(this, callable, 1))).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ruu
    @ResultIgnorabilityUnspecified
    public final rso a(xnz xnzVar) {
        ypf ypfVar = a;
        ypfVar.l().ai(7722).u("CarBluetoothService onServiceDiscovery");
        if ((xnzVar.b & 32) == 0) {
            ypfVar.f().ai(7729).u("No bluetooth service available.");
            return null;
        }
        xht xhtVar = xnzVar.h;
        if (xhtVar == null) {
            xhtVar = xht.b;
        }
        String str = xhtVar.c;
        int i = 0;
        int i2 = 1;
        if (BluetoothAdapter.checkBluetoothAddress(str)) {
            this.j = str;
            Optional optionalOfNullable = Optional.ofNullable(this.k);
            if (true == optionalOfNullable.isPresent() && ((CarBluetoothData) optionalOfNullable.get()).b()) {
                optionalOfNullable = Optional.empty();
            }
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable(((CarBluetoothData) optionalOfNullable.get()).a());
            }
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable(((BluetoothDevice) optionalOfNullable.get()).getAddress());
            }
            qqz qqzVar = new qqz(str, 0);
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable(Boolean.valueOf(!((String) optionalOfNullable.get()).equals(qqzVar.a)));
            }
            if (((Boolean) optionalOfNullable.orElse(false)).booleanValue()) {
                ols.M(this.n, yxi.ANDROID_AUTO_NOT_SUPPORTED_DONGLE_DETECTED);
            }
        }
        if (acnm.a.gu().b()) {
            this.o.d(yzz.BLUETOOTH, yzy.qB);
            ypfVar.h().ai(7728).u("Not starting BT service since disable flag is set!");
            return null;
        }
        this.s = false;
        xht xhtVar2 = xnzVar.h;
        String str2 = (xhtVar2 == null ? xht.b : xhtVar2).c;
        if (xhtVar2 == null) {
            xhtVar2 = xht.b;
        }
        xhp[] xhpVarArr = (xhp[]) new abof(xhtVar2.d, xht.a).toArray(new xhp[0]);
        ypfVar.l().ai(7723).y("CarBluetoothService. car address=%s", str2);
        if (TextUtils.isEmpty(str2)) {
            this.o.d(yzz.BLUETOOTH, yzy.qC);
            ypfVar.h().ai(7727).u("Bluetooth address is empty");
            y();
            return this;
        }
        if ("SKIP_THIS_BLUETOOTH".equals(str2)) {
            this.o.d(yzz.BLUETOOTH, yzy.qD);
            ypfVar.l().ai(7726).u("Special car Bluetooth address that should be skipped");
            y();
            return this;
        }
        xhp xhpVar = xhp.BLUETOOTH_PAIRING_UNAVAILABLE;
        xhp[] xhpVarArr2 = u;
        int length = xhpVarArr2.length;
        xhp xhpVar2 = xhpVar;
        for (int i3 = 0; i3 < 2; i3++) {
            xhp xhpVar3 = xhpVarArr2[i3];
            int length2 = xhpVarArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    break;
                }
                xhp xhpVar4 = xhpVarArr[i4];
                if (xhpVar4 == xhpVar3) {
                    ypfVar.l().ai(7725).y("Bluetooth pairing method chosen: %s", xhpVar4);
                    xhpVar2 = xhpVar4;
                    break;
                }
                i4++;
            }
        }
        this.c = xhpVar2;
        if (this.t.h() != 2 && this.c == xhpVar) {
            this.o.d(yzz.BLUETOOTH, yzy.qF);
            ypfVar.l().ai(7724).u("No supported pairing method");
            this.b = -4;
            this.d = null;
            rgs rgsVarD = d(Looper.getMainLooper(), null, this);
            this.e = rgsVarD;
            rgsVarD.c(rgo.EVENT_SERVICE_INITIALIZATION_FAILED);
            return this;
        }
        rhg rhgVar = new rhg(this.n, str2, new wyd(this, null));
        this.d = rhgVar;
        int i5 = rhgVar.n;
        if (i5 == -3) {
            this.b = -5;
            this.o.d(yzz.BLUETOOTH, yzy.qI);
        } else if (i5 == -2) {
            this.b = -3;
            this.o.d(yzz.BLUETOOTH, yzy.qH);
        } else if (i5 != 0) {
            this.b = -2;
            this.o.d(yzz.BLUETOOTH, yzy.qJ);
        } else {
            this.b = 0;
            this.o.d(yzz.BLUETOOTH, yzy.qG);
        }
        if (this.b != 0) {
            rgs rgsVarD2 = d(Looper.getMainLooper(), null, this);
            this.e = rgsVarD2;
            rgsVarD2.c(rgo.EVENT_SERVICE_INITIALIZATION_FAILED);
            return this;
        }
        rgs rgsVarD3 = d(Looper.getMainLooper(), this.d, this);
        this.e = rgsVarD3;
        rgsVarD3.c(rgo.EVENT_SERVICE_INITIALIZED);
        this.v = str2;
        this.w = xhpVarArr;
        qrd qrdVar = this.m;
        qrg qrgVar = qrdVar.e;
        yfq yfqVarO = yfq.o(acxv.a.gu().g().b);
        if (!yfqVarO.isEmpty()) {
            CarInfoInternal carInfoInternal = new CarInfoInternal(qrgVar.p.l(), null, false, 0L, 0L, null, null, null, null, 0, null, 0, 0, 0, false, false, 0L, false, null, 0, null);
            if (yfqVarO.isEmpty()) {
                ypfVar.f().ai(7683).u("disabling A2dp via profile disabler");
                Context context = qrgVar.n;
                qrdVar.c = new rgj(x(context), qrgVar.h());
                rgj rgjVar = qrdVar.c;
                rgj.a.l().ai(8018).u("start");
                rgjVar.b.f(context, new rgi(rgjVar), 2);
                qrdVar.b = null;
            } else {
                int size = yfqVarO.size();
                boolean z = false;
                int i6 = 0;
                while (true) {
                    if (i < size) {
                        rrh rrhVar = (rrh) yfqVarO.get(i);
                        int i7 = (rrhVar.equals(rrh.a) ? 1 : 0) ^ i2;
                        if ((rrhVar.b & i2) != 0) {
                            i7 &= rrhVar.c.equalsIgnoreCase(carInfoInternal.a.a) ? 1 : 0;
                        }
                        if ((rrhVar.b & 2) != 0) {
                            i7 &= rrhVar.d.equalsIgnoreCase(carInfoInternal.a.b) ? 1 : 0;
                        }
                        if ((rrhVar.b & 8) != 0) {
                            i7 &= rrhVar.f.equalsIgnoreCase(carInfoInternal.a.j) ? 1 : 0;
                        }
                        if ((rrhVar.b & 4) != 0) {
                            i7 &= rrhVar.e.equals(carInfoInternal.a.c) ? 1 : 0;
                        }
                        if ((rrhVar.b & 32) != 0) {
                            i7 &= rrhVar.h.equalsIgnoreCase(carInfoInternal.a.i) ? 1 : 0;
                        }
                        if (rrhVar.g) {
                            if (i7 != 0) {
                                break;
                            }
                        } else {
                            i6 |= i7;
                            z = true;
                        }
                        i++;
                        i2 = 1;
                    } else if (!z || i6 != 0) {
                    }
                }
            }
        }
        qrdVar.b();
        return this;
    }

    @Override // defpackage.rso
    public final ruq b(rut rutVar) {
        return new rsh(this, rutVar);
    }

    @Override // defpackage.qvr
    public final int c() {
        a.l().ai(7707).u("getInitializationStatus");
        return ((Integer) rbe.a(Looper.getMainLooper(), new qrb(this))).intValue();
    }

    protected final rgs d(Looper looper, rhg rhgVar, rgn rgnVar) {
        rwz rwzVar = this.o;
        return new rgs(looper, rhgVar, rgnVar, this.t, this.q, rwzVar, new rgt(rwzVar, rhgVar));
    }

    @Override // defpackage.qvr
    public final String g() {
        if (Build.VERSION.SDK_INT < 30) {
            return this.v;
        }
        a.l().ai(7705).u("getCarBluetoothAddress");
        return (String) rbe.a(Looper.getMainLooper(), new iml(this, 2));
    }

    @Override // defpackage.rso
    public final void gl(PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.qvr
    public final String h() {
        a.l().ai(7706).u("getCarBluetoothEndpointAddress");
        return (String) rbe.a(Looper.getMainLooper(), new iml(this, 3));
    }

    @Override // defpackage.qvr
    public final String i() {
        a.l().ai(7708).u("getStartingCarBluetoothAddress");
        return (String) rbe.b(new flt(this, 12));
    }

    public final void j() {
        if (this.b != 0) {
            throw new IllegalStateException("Service not initialized");
        }
    }

    @Override // defpackage.rso
    public final void k() {
        throw null;
    }

    @Override // defpackage.rso
    public final void l(ruq ruqVar) {
        a.l().ai(7720).u("onEndPointReady");
        new sss(Looper.getMainLooper()).post(new jpx(this, ruqVar, 4, (char[]) null));
    }

    public final void m(qre qreVar) {
        ypf ypfVar = a;
        ypfVar.l().ai(7700).y("deliverEventToClients. callbackinvoker=%s", qreVar);
        if (this.b != 0) {
            ypfVar.g().ai(7703).u("deliverEventToClients: Service not initialized");
            return;
        }
        if (this.g == null) {
            ypfVar.g().ai(7702).u("deliverEventToClients: Channel not established yet");
            return;
        }
        if (this.i) {
            return;
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            qrf qrfVar = (qrf) it.next();
            try {
                qreVar.a(qrfVar.a);
            } catch (RemoteException e) {
                a.g().p(e).ai(7701).y("Exception in deliverEventToClients. clientCallbackInvoker=%s", qreVar);
                qrfVar.a();
                it.remove();
            }
        }
    }

    @Override // defpackage.qvr
    public final void n() {
        this.m.b();
    }

    public final void o(Runnable runnable) {
        a.l().ai(7709).y("handleIncomingMessage. handler=%s", runnable);
        rbe.h(new qqy(this, runnable, 2, (byte[]) null));
    }

    public final void p(String str) {
        Optional optionalOfNullable = Optional.ofNullable(x(this.n));
        miq miqVar = new miq(str, 12);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((rgk) optionalOfNullable.get()).b((String) miqVar.a));
        }
        if (true != optionalOfNullable.isPresent()) {
            return;
        }
        rgl rglVar = (rgl) optionalOfNullable.get();
        a.f().ai(7717).y("setting device metadata for %s", rglVar.b());
        rglVar.a.setMetadata(17, "Carkit".getBytes());
    }

    @Override // defpackage.qvr
    public final boolean q() {
        a.l().ai(7712).u("isEnabled");
        rhg rhgVar = this.d;
        rhgVar.getClass();
        return z(new flt(rhgVar, 13));
    }

    @Override // defpackage.qvr
    public final boolean r() {
        a.l().ai(7713).u("isHfpConnected");
        return z(new flt(this, 15));
    }

    @Override // defpackage.qvr
    public final boolean s() {
        a.l().ai(7714).u("isHfpConnecting");
        return z(new flt(this, 16));
    }

    @Override // defpackage.qvr
    public final boolean t() {
        a.l().ai(7715).u("isPaired");
        rhg rhgVar = this.d;
        rhgVar.getClass();
        return z(new flt(rhgVar, 14));
    }

    @Override // defpackage.qvr
    public final boolean u() {
        a.l().ai(7716).u("isPairing");
        rhg rhgVar = this.d;
        rhgVar.getClass();
        return z(new flt(rhgVar, 17));
    }

    @Override // defpackage.qvr
    @ResultIgnorabilityUnspecified
    public final boolean v(qvu qvuVar) {
        a.l().ai(7732).y("registerClient. client=%s", qvuVar.asBinder());
        return ((Boolean) rbe.a(Looper.getMainLooper(), new qrc(this, qvuVar))).booleanValue();
    }

    @Override // defpackage.qvr
    public final int[] w() {
        return woy.dP(this.w);
    }
}
