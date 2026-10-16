package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class shi implements sgy {
    public static final ypf a = ols.R("CAR.STARTUP");
    public final Context b;
    public final long c;
    public final boolean d;
    public final Handler e;
    public final List f;
    public final int g;
    public final ServiceConnection h;
    public final shh i;
    public final sat j;
    private final Executor k;

    public shi(Context context, long j, sat satVar, Handler handler, List list, int i) {
        rhx rhxVar = rhx.c;
        this.h = new shc(this);
        this.i = new shh(this);
        this.b = context;
        this.c = j;
        this.d = true;
        this.j = satVar;
        this.e = handler;
        this.k = new tde(handler, 1);
        this.f = list;
        this.g = i;
    }

    public static void g(Bundle bundle, SharedPreferences.Editor editor, String str) {
        if (bundle.containsKey(str)) {
            editor.putBoolean(str, bundle.getBoolean(str));
        }
    }

    public static void h(Bundle bundle, SharedPreferences.Editor editor, String str) {
        String string = bundle.getString(str);
        if (string != null) {
            editor.putString(str, string);
        }
    }

    private final boolean j() {
        return this.e.getLooper() == Looper.myLooper();
    }

    private final boolean k(String str) {
        return skn.a(this.b).b(str);
    }

    @Override // defpackage.sgy
    public final zgp a(final long j, final Bundle bundle) {
        Callable callable = new Callable() { // from class: shb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                rwv rwvVar;
                long j2 = j;
                Bundle bundle2 = bundle;
                shh shhVar = this.a.i;
                boolean z = false;
                if (!shhVar.a || (rwvVar = shhVar.f) == null) {
                    shi.a.h().ai(8952).u("HandoffState is invalid to do a transferForHandoff.");
                } else {
                    try {
                        rwvVar.n(j2, bundle2);
                        z = true;
                    } catch (RemoteException e) {
                        shi.a.h().p(e).ai(8953).u("Cannot transfer for handoff");
                    }
                }
                return Boolean.valueOf(z);
            }
        };
        Executor executorD = d();
        zhk zhkVar = new zhk(callable);
        executorD.execute(zhkVar);
        return zhkVar;
    }

    @Override // defpackage.sgy
    public final void b() {
        this.e.post(new rsv(this, 19));
    }

    @Override // defpackage.sgy
    public final boolean c(final boolean z, final boolean z2) {
        try {
            return ((Boolean) ((zeu) wub.ac(new Callable() { // from class: sgz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    boolean z3;
                    rwv rwvVar = this.a.i.f;
                    rwvVar.getClass();
                    try {
                        rwvVar.o(z, z2);
                        z3 = true;
                    } catch (RemoteException unused) {
                        z3 = false;
                    }
                    return Boolean.valueOf(z3);
                }
            }, d())).t(5000L, TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            a.h().p(e).ai(8974).u("Did not complete authorization. FRX may be run.");
            return false;
        }
    }

    public final Executor d() {
        return j() ? zfq.a : this.k;
    }

    public final void e() {
        if (!j()) {
            throw new IllegalStateException();
        }
    }

    public final void f() {
        e();
        while (true) {
            shh shhVar = this.i;
            ArrayDeque arrayDeque = shhVar.b;
            if (arrayDeque.isEmpty()) {
                shhVar.a();
                this.j.c(null, false);
                return;
            }
            ComponentName componentName = (ComponentName) arrayDeque.removeFirst();
            String packageName = componentName.getPackageName();
            if (i(packageName)) {
                Intent intent = new Intent();
                intent.setComponent(componentName);
                ypf ypfVar = a;
                yop yopVarAi = ypfVar.f().ai(8954);
                String strFlattenToString = componentName.flattenToString();
                zjc zjcVar = zjc.a;
                yopVarAi.y("Checking handoff interest for component %s", new zjd(zjcVar, strFlattenToString));
                boolean zBindService = this.b.bindService(intent, this.h, true != spu.c() ? 65 : 4161);
                shhVar.a = zBindService;
                if (zBindService) {
                    ypfVar.f().ai(8956).y("Successfully bound to component %s", new zjd(zjcVar, componentName.flattenToString()));
                    shhVar.e = componentName;
                    return;
                } else {
                    ypfVar.f().ai(8955).y("Failed to bind to component %s", new zjd(zjcVar, componentName.flattenToString()));
                    shhVar.e = null;
                    this.j.c(componentName, false);
                    return;
                }
            }
            if ("com.google.android.projection.gearhead".equals(packageName)) {
                a.h().ai(8958).u("Can't handoff to Gearhead, untrusted signature!");
            } else {
                a.h().ai(8957).y("Skipping %s (not Gearhead): untrusted signature.", packageName);
            }
        }
    }

    public final boolean i(String str) {
        if (Build.VERSION.SDK_INT < 30) {
            return k(str);
        }
        String[] packagesForUid = this.b.getPackageManager().getPackagesForUid(Process.myUid());
        if (packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return k(str);
    }
}
