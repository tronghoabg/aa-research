package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Network;
import android.net.wifi.WifiInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.system.ErrnoException;
import android.system.OsConstants;
import com.google.android.apps.auto.carservice.service.impl.GearheadCarServiceCallbacks;
import com.google.android.gms.car.bluetooth.data.CarBluetoothData;
import com.google.android.gms.carsetup.setup.UsbConnectionHelper;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class jqj extends rwu {
    public static final yph a = yph.c("GH.CAR");
    public final Handler c;
    public final jnj e;
    public final ima f;
    public final Configuration g;
    public final Context h;
    public final jox i;
    public final jqa j;
    public final jnl k;
    public volatile boolean l;
    private final xyc m;
    public final jla b = new jld();
    public final CountDownLatch d = new CountDownLatch(1);

    public jqj(Context context, Configuration configuration, Handler handler, jnw jnwVar) {
        Context contextC = jfj.c(context);
        this.h = contextC;
        this.g = configuration;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.c = handler;
        xyc xycVarL = wub.L(new ilk(this, 19));
        this.m = xycVarL;
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 2605)).u("gearheadCarServiceBinder in mainHandler: true");
        ima imaVar = new ima(new GearheadCarServiceCallbacks(contextC), contextC, ikz.a(contextC), xycVarL);
        GearheadCarServiceCallbacks.b = imaVar;
        GearheadCarServiceCallbacks.c = imaVar;
        this.f = imaVar;
        jqa jqaVar = new jqa(handler2, contextC, imaVar);
        this.j = jqaVar;
        this.k = new jnl(contextC.getApplicationContext(), jqaVar);
        ((ype) ((ype) yphVar.f()).ai((char) 2610)).u("Using GearheadCarServiceBinder in CarMessageService.");
        new iws(imaVar, imaVar, contextC);
        jou jouVar = new jou(contextC, handler, handler2, imaVar, jqaVar);
        this.e = jouVar;
        jqaVar.e = jouVar;
        this.i = new jox(jnwVar, handler, new jgw(handler2, 9));
        ((ype) ((ype) yphVar.f()).ai((char) 2606)).u("Using Gearhead for projection services. All aboard! 🚀");
    }

    static ParcelFileDescriptor a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorDup = parcelFileDescriptor.dup();
            try {
                parcelFileDescriptor.close();
                return parcelFileDescriptorDup;
            } catch (IOException e) {
                ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 2611)).u("Failed to close original file descriptor.");
                return parcelFileDescriptorDup;
            }
        } catch (IOException e2) {
            throw new IllegalStateException("Failed to duplicate file descriptor.", e2);
        }
    }

    public static boolean q(Configuration configuration) {
        return (configuration.uiMode & 15) == 3;
    }

    private static Map w(List list, List list2) {
        if (list.size() != list2.size()) {
            throw new IllegalArgumentException("Service ID and type do not match");
        }
        yfu yfuVar = new yfu(4);
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Integer num = (Integer) it.next();
            num.intValue();
            int iIntValue = ((Integer) it2.next()).intValue();
            rro rroVarB = rro.b(iIntValue);
            if (rroVarB == null) {
                ((ype) ((ype) a.h()).ai((char) 2623)).w("Unknown service type: %d", iIntValue);
                rroVarB = rro.UNKNOWN;
            }
            yfuVar.e(num, rroVarB);
        }
        return yfuVar.d(true);
    }

    private static Object x(xyc xycVar) {
        try {
            return xycVar.gu();
        } catch (IllegalArgumentException | IllegalStateException | NullPointerException | UnsupportedOperationException e) {
            throw jrv.b(a, "getCarService failed", e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, qup] */
    @Override // defpackage.rwv
    public final qup b() {
        woy.aa(this.l, "not initialized");
        return x(new ilk(this, 20));
    }

    @Override // defpackage.rwv
    public final rwp c(rws rwsVar) {
        woy.aa(this.l, "not initialized");
        this.b.a(this.h);
        try {
            jnj jnjVar = this.e;
            zhc zhcVar = new zhc();
            ((jou) jnjVar).d.post(new joq((jou) jnjVar, zhcVar, rwsVar));
            return (rwp) zhcVar.t(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw jrv.b(a, "Sensor service fetch failed.", e);
        }
    }

    @Override // defpackage.rwv
    public final void d(long j, int i, Bundle bundle, rwy rwyVar) throws InterruptedException, IOException {
        CarBluetoothData carBluetoothData;
        woy.aa(this.l, "not initialized");
        jla jlaVar = this.b;
        Context context = this.h;
        jlaVar.a(context);
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai(2612)).F("Handoff session %d (connection type: %d)", j, i);
        String strB = dsg.B(context);
        ((ype) ((ype) yphVar.f()).ai((char) 2613)).u("Projection runs in proxy. Update iCar to the proxy.");
        p();
        woy.aa(this.j.a() == this.f, "Requested to use Gearhead for projection but not configured with local Car Service implementation.");
        if (i == 2) {
            if (aczv.a.gu().at()) {
                ClassLoader classLoader = CarBluetoothData.class.getClassLoader();
                classLoader.getClass();
                bundle.setClassLoader(classLoader);
                carBluetoothData = (CarBluetoothData) bundle.getParcelable("WIFI_STARTING_BLUETOOTH_DEVICE");
            } else {
                carBluetoothData = null;
            }
            String string = bundle.getString("PARAM_HOST_ADDRESS");
            int i2 = bundle.getInt("PARAM_SERVICE_PORT", -1);
            WifiInfo wifiInfo = (WifiInfo) bundle.getParcelable("wifi_info");
            Network network = (Network) bundle.getParcelable("PARAM_SERVICE_WIFI_NETWORK");
            boolean z = bundle.getBoolean("WIFI_Q_ENABLED", false);
            string.getClass();
            woy.O(i2 >= 0, "port cannot be negative");
            ((ype) ((ype) yphVar.f()).ai(2616)).R("Handling wifi handoff %s:%d (%s)", string, Integer.valueOf(i2), wifiInfo);
            this.c.post(new jqg(this, j, new Handler(Looper.getMainLooper()), rwyVar, strB, carBluetoothData, string, i2, wifiInfo, network, z));
            return;
        }
        ClassLoader classLoader2 = UsbConnectionHelper.TrackedParcelFileDescriptor.class.getClassLoader();
        if (classLoader2 != null) {
            bundle.setClassLoader(classLoader2);
        }
        UsbConnectionHelper.TrackedParcelFileDescriptor trackedParcelFileDescriptorA = UsbConnectionHelper.TrackedParcelFileDescriptor.a((ParcelFileDescriptor) bundle.getParcelable("car_setup.EXTRA_CAR_CONNECTION_FILE_DESCRIPTOR"));
        trackedParcelFileDescriptorA.getClass();
        try {
            ParcelFileDescriptor parcelFileDescriptorA = a(trackedParcelFileDescriptorA);
            this.c.post(new jqc(this, j, i, koo.n() ? jxc.h(parcelFileDescriptorA) : spu.aP(parcelFileDescriptorA), rwyVar, strB));
        } catch (IllegalStateException e) {
            boolean z2 = trackedParcelFileDescriptorA.l.get();
            if (!z2) {
                Throwable cause = e.getCause();
                if (cause instanceof IOException) {
                    cause = cause.getCause();
                }
                if (!(cause instanceof ErrnoException) || ((ErrnoException) cause).errno != OsConstants.EBADF) {
                    throw new IllegalStateException("dup failed, but fd is not closed", e);
                }
            }
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 2614)).u("File descriptor is already closed during handoff. Tearing down.");
            Context context2 = this.h;
            if (z2) {
                ols.M(context2, yxi.USB_FD_CLOSED_DURING_STARTUP);
            } else {
                ols.M(context2, yxi.USB_FD_BAD_DURING_STARTUP);
            }
            try {
                rwyVar.j();
            } catch (RemoteException e2) {
                ((ype) ((ype) ((ype) a.g()).p(e2)).ai((char) 2615)).u("Unable to tear down during handoff");
            }
        }
    }

    @Override // defpackage.rwv
    @Deprecated
    public final void f() {
        woy.aa(this.l, "not initialized");
        this.b.a(this.h);
        ((ype) ((ype) a.h()).ai((char) 2619)).u("Call to deprecated method invalidateDelegateICar.");
    }

    @Override // defpackage.rwv
    public final void g(long j, ParcelFileDescriptor parcelFileDescriptor, rwy rwyVar) {
        woy.aa(this.l, "not initialized");
        jla jlaVar = this.b;
        Context context = this.h;
        String strB = dsg.B(context);
        jlaVar.a(context);
        ((ype) ((ype) a.f()).ai(2626)).x("Process handoff of session %d", j);
        this.c.post(new jqb(this, j, koo.n() ? jxc.h(a(parcelFileDescriptor)) : spu.aP(a(parcelFileDescriptor)), rwyVar, strB, 2));
    }

    @Override // defpackage.rwv
    public final void h(long j, rwy rwyVar) {
        woy.aa(this.l, "not initialized");
        this.b.a(this.h);
        ((ype) ((ype) a.f()).ai(2627)).x("Resume session %d", j);
        this.c.post(new jqh(this, j, rwyVar, 0));
    }

    @Override // defpackage.rwv
    public final void i(long j, int i) {
        woy.aa(this.l, "not initialized");
        this.b.a(this.h);
        ((ype) ((ype) a.f()).ai(2628)).F("Sending bye-bye for session %d with reason %d", j, i);
        this.c.post(new lvm(this, j, i, 1));
    }

    @Override // defpackage.rwv
    public final void j(long j, List list, List list2, rwm rwmVar) {
        woy.aa(this.l, "not initialized");
        this.b.a(this.h);
        ((ype) ((ype) a.f()).ai(2629)).x("Start additional services %d", j);
        this.c.post(new jqb(this, j, list, w(list, list2), rwmVar, 0));
    }

    @Override // defpackage.rwv
    public final void k(long j, List list, ParcelFileDescriptor parcelFileDescriptor, rwm rwmVar) {
        woy.aa(this.l, "not initialized");
        this.b.a(this.h);
        ((ype) ((ype) a.f()).ai(2630)).x("Start required services %d", j);
        this.c.post(new jqb(this, j, list, a(parcelFileDescriptor), rwmVar, 3));
    }

    @Override // defpackage.rwv
    public final void l(long j, List list, List list2, ParcelFileDescriptor parcelFileDescriptor, rwm rwmVar) {
        woy.aa(this.l, "not initialized");
        this.b.a(this.h);
        ((ype) ((ype) a.f()).ai(2631)).x("Start required services with types %d", j);
        this.c.post(new jqi(this, j, list, w(list, list2), a(parcelFileDescriptor), rwmVar));
    }

    @Override // defpackage.rwv
    public final void m(long j) {
        woy.aa(this.l, "not initialized");
        this.b.a(this.h);
        this.c.post(new lma(this, j, 1));
        this.k.a();
        ((ype) ((ype) a.f()).ai(2632)).x("Stopping session: %d", j);
    }

    @Override // defpackage.rwv
    public final void n(long j, Bundle bundle) {
        woy.aa(this.l, "not initialized");
        this.c.post(new jqh(this, bundle, j, 1));
    }

    @Override // defpackage.rwv
    public final void o(boolean z, boolean z2) {
        woy.aa(this.l, "not initialized");
        this.b.a(this.h);
        ((ype) ((ype) a.f()).ai(2634)).Q("updateCarAuthorizationState: proj:%b bt:%b", z, z2);
        jou jouVar = (jou) this.e;
        jouVar.e.post(new jol(jouVar, z, z2, 0));
    }

    public final void p() throws InterruptedException {
        try {
            this.d.await();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 2635)).u("Interrupted while constructing delegate chain!");
        }
    }

    @Override // defpackage.rwv
    public final boolean r(long j) {
        woy.aa(this.l, "not initialized");
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 2620)).u("isInterestedInHandoff - initialized");
        this.b.a(this.h);
        ((ype) ((ype) yphVar.f()).ai(2621)).x("Interested in handoff %d: true", j);
        return true;
    }

    @Override // defpackage.rwv
    public final boolean s(int i, int i2, ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) throws IOException {
        woy.aa(this.l, "not initialized");
        if (i != 0 && i != 1) {
            return false;
        }
        ((ype) ((ype) a.h()).ai((char) 2617)).u("Migration finalized. Ignoring migration attempt but pretending to take it.");
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e) {
                ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 2618)).u("Unable to close file descriptor.");
            }
        }
        return true;
    }

    @Override // defpackage.rwv
    @Deprecated
    public final void t() {
    }

    @Override // defpackage.rwv
    public final void u() {
    }
}
