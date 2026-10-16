package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.provider.Settings;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.bluetooth.data.CarBluetoothData;
import com.google.android.gms.car.diagnostics.CriticalError;
import com.google.android.gms.carsetup.CarInfoInternal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class joi implements IBinder.DeathRecipient, jnh, jae {
    public static final yph a = yph.c("GH.CarConnSession");
    public final Context b;
    public final long c;
    public final int d;
    public final Handler e;
    public final ima f;
    public final List g;
    public final String h;
    public final jkw i;
    public final jqm j;
    public final CarBluetoothData k;
    public volatile jbp l;
    public volatile CarInfoInternal m;
    public volatile String n;
    public volatile long o;
    public volatile int p;
    public volatile int q;
    public volatile xob r;
    public volatile xob s;
    public final List t;
    public volatile boolean u;
    public boolean v;
    public final boolean w;
    public final jot x;
    public volatile sji y;
    private final AtomicBoolean z;

    public joi(Context context, long j, int i, Handler handler, jot jotVar, ima imaVar, jqm jqmVar, CarBluetoothData carBluetoothData) {
        boolean z;
        String string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), "android_id");
        this.z = new AtomicBoolean();
        this.g = new ArrayList();
        xob xobVar = xob.a;
        this.r = xobVar;
        this.s = xobVar;
        this.t = new ArrayList();
        boolean z2 = false;
        this.u = false;
        this.v = false;
        this.b = context;
        this.c = j;
        this.d = i;
        this.e = handler;
        this.x = jotVar;
        this.f = imaVar;
        this.j = jqmVar;
        this.h = string;
        this.k = carBluetoothData;
        jfg jfgVar = imaVar.O;
        if (Build.VERSION.SDK_INT >= 30) {
            z = true;
        } else {
            try {
                z = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).getLongVersionCode() >= 221512000;
                if (!z) {
                    jfgVar.e(yzz.AUDIO_SERVICE_MIGRATION, yzy.yh);
                }
            } catch (PackageManager.NameNotFoundException e) {
                jfgVar.e(yzz.AUDIO_SERVICE_MIGRATION, yzy.yf);
                ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 2470)).u("Unable to determine GMS Core version, so audio service migration will not be available.");
                z = false;
            }
        }
        if (z) {
            this.e.post(new aq(this, jfgVar, 19));
        }
        boolean z3 = Build.VERSION.SDK_INT >= 30;
        ype ypeVar = (ype) ((ype) a.f()).ai(2475);
        Boolean boolValueOf = Boolean.valueOf(z);
        zjc zjcVar = zjc.a;
        ypeVar.M("canCarServiceLiteHandleMigration %s; isMigrationFlagEnabled %s", new zjd(zjcVar, boolValueOf), new zjd(zjcVar, Boolean.valueOf(z3)));
        if (z && z3) {
            z2 = true;
        }
        if (!z2) {
            jfgVar.e(yzz.AUDIO_SERVICE_MIGRATION, yzy.yj);
        }
        this.w = z2;
        this.i = new jkw(context);
    }

    static void f(jbp jbpVar, Iterable iterable, Map map) {
        rro rroVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (map.containsKey(num)) {
                rroVar = (rro) map.get(num);
                rroVar.getClass();
            } else {
                ((ype) ((ype) a.h()).ai((char) 2466)).w("No service type found for id: %d", iIntValue);
                rroVar = rro.UNKNOWN;
            }
            ((ype) ((ype) a.f()).ai(2467)).D("Create proxy end points for %d with service type: %s", iIntValue, rroVar);
            jbpVar.a(new jdt(iIntValue, rroVar));
        }
    }

    public static void i(CarInfoInternal carInfoInternal, ima imaVar) {
        jey jeyVarA = jey.a(imaVar.Y("driver_position_setting_key", jey.d.name()));
        CarInfo carInfo = carInfoInternal.a;
        ((ype) a.l().ai((char) 2481)).M("maybeOverrideDriverPosition: carInfoPosition=%s, driverPositionSetting=%s", xje.b(carInfo.h), jeyVarA);
        int iOrdinal = jeyVarA.ordinal();
        if (iOrdinal == 1) {
            carInfo.h = 0;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            carInfo.h = 1;
        }
    }

    public static void j(SharedPreferences sharedPreferences, Bundle bundle, String str) {
        if (sharedPreferences.contains(str)) {
            bundle.putBoolean(str, sharedPreferences.getBoolean(str, false));
        }
    }

    public static void k(SharedPreferences sharedPreferences, Bundle bundle, String str) {
        if (sharedPreferences.contains(str)) {
            bundle.putString(str, sharedPreferences.getString(str, null));
        }
    }

    @Override // defpackage.jnh
    public final void a(xhv xhvVar) {
        c();
        e();
        ((ype) ((ype) a.f()).ai(2489)).w("Sending bye-bye request with reason %d", xhvVar == null ? 0 : xhvVar.i);
        this.l.f(xhvVar);
    }

    @Override // defpackage.jbn
    public final void aF(yze yzeVar, yzf yzfVar, String str) {
        this.e.post(new xx((Object) this, yzeVar, yzfVar, str, 11));
    }

    @Override // defpackage.jnh
    public final void b() {
        m(yze.UNKNOWN_CODE, yzf.UNKNOWN_DETAIL);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        ((ype) ((ype) a.h()).ai((char) 2465)).u("Startup callback binder died, tearing down connection session.");
        this.e.post(new jgu((jnh) this, 16));
    }

    public final void c() {
        if (this.e.getLooper() != Looper.myLooper()) {
            throw new IllegalStateException();
        }
    }

    public final void d() {
        e();
        if (!this.u) {
            throw new IllegalStateException();
        }
    }

    public final void e() {
        this.l.getClass();
        this.y.getClass();
    }

    public final void g(boolean z, xhv xhvVar) {
        for (rwy rwyVar : this.g) {
            if (z) {
                try {
                    rwyVar.d(xhvVar.i);
                } catch (RemoteException e) {
                    ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 2469)).u("Can't callback to startup service client");
                }
            } else {
                rwyVar.b(xhvVar.i);
            }
        }
    }

    public final void h(CarInfoInternal carInfoInternal, xob xobVar) {
        if (acwf.a.gu().a()) {
            if (acrz.a.gu().i()) {
                Iterator<E> it = xobVar.c.iterator();
                while (it.hasNext()) {
                    if ((((xnz) it.next()).b & 16384) != 0) {
                        return;
                    }
                }
            }
            CarInfo carInfo = carInfoInternal.a;
            ((ype) a.l().ai((char) 2480)).y("Override car provided position to RHD: carInfoPosition=%s", xje.b(carInfo.h));
            carInfo.h = 1;
            ima imaVar = this.f;
            imaVar.O.b(rrc.h(yxy.CAR_SERVICE, yzz.CAR_SERVICE, yzy.Cm).l());
        }
    }

    public final void l(int i) {
        jkz jkzVar = new jkz();
        jkzVar.a = this.d;
        jkzVar.b = i;
        jkzVar.c = new Intent();
        jkzVar.a(this.b);
        a(xhv.NOT_CURRENTLY_SUPPORTED);
    }

    public final void m(yze yzeVar, yzf yzfVar) {
        c();
        e();
        ((ype) ((ype) a.f()).ai((char) 2500)).u("Tearing down");
        this.r = xob.a;
        this.t.clear();
        imd.a.a = false;
        c();
        List list = this.g;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((rwy) it.next()).asBinder().unlinkToDeath(this, 0);
        }
        list.clear();
        if (this.z.compareAndSet(false, true)) {
            this.f.a(CriticalError.a(yzeVar, yzfVar));
        }
        this.l.e();
        this.l.b();
        this.f.ag = null;
        jot jotVar = this.x;
        jotVar.c.d.post(new joo(jotVar, 2));
        this.v = true;
    }

    public final boolean n(rwy rwyVar) throws RemoteException {
        c();
        try {
            rwyVar.asBinder().linkToDeath(this, 0);
            this.g.add(rwyVar);
            return true;
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 2487)).u("Failed to register startup callback.");
            return false;
        }
    }
}
