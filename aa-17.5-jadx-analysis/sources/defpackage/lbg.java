package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.auto.components.externalkeyboard.phone.PhoneKeyboardActivity;
import com.google.android.gearhead.appdecor.CarUiEntry;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class lbg implements ServiceConnection {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public lbg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i = this.b;
        if (i == 0) {
            xcv xcvVar = (xcv) iBinder;
            PhoneKeyboardActivity phoneKeyboardActivity = (PhoneKeyboardActivity) this.a;
            if (!xcvVar.a(phoneKeyboardActivity.v)) {
                ((ype) ((ype) PhoneKeyboardActivity.m.g()).ai((char) 3730)).u("CarWindowInputMethodService is not initialized");
                phoneKeyboardActivity.finish();
                return;
            }
            phoneKeyboardActivity.u = new lbd(xcvVar, phoneKeyboardActivity.v);
            phoneKeyboardActivity.u.b(phoneKeyboardActivity.z);
            phoneKeyboardActivity.A();
            if (phoneKeyboardActivity.r.requestFocus()) {
                ((InputMethodManager) phoneKeyboardActivity.getSystemService("input_method")).showSoftInput(phoneKeyboardActivity.r, 1);
                return;
            }
            return;
        }
        qtx qtvVar = null;
        xqh xqfVar = null;
        qtx qtvVar2 = null;
        if (i == 1) {
            ((ype) ioq.E.l().ai((char) 825)).y("onServiceConnected component: %s", componentName);
            if (iBinder != null) {
                try {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.IAppDecorServiceProvider");
                    qtvVar = iInterfaceQueryLocalInterface instanceof qtx ? (qtx) iInterfaceQueryLocalInterface : new qtv(iBinder);
                } catch (RemoteException unused) {
                    ((ype) ioq.E.l().ai((char) 826)).u("Failed to register app decor service ready callback");
                    return;
                }
            }
            qtvVar.h(new ion((ioq) this.a));
            return;
        }
        if (i == 2) {
            ((ype) CarUiEntry.logger.l().ai((char) 7052)).y("onServiceConnected %s", componentName);
            if (iBinder != null) {
                try {
                    IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.car.IAppDecorServiceProvider");
                    qtvVar2 = iInterfaceQueryLocalInterface2 instanceof qtx ? (qtx) iInterfaceQueryLocalInterface2 : new qtv(iBinder);
                } catch (RemoteException unused2) {
                    ((ype) ((ype) CarUiEntry.logger.g()).ai((char) 7053)).u("Error registering for onReady callback for AppDecorService");
                    return;
                }
            }
            qtvVar2.h(new qfo((CarUiEntry) this.a));
            return;
        }
        if (i != 3) {
            Object obj = this.a;
            synchronized (((zsj) obj).j) {
                String str = zsj.d;
                if (zrn.e(str, 3)) {
                    Log.d(str, a.bY(componentName, "Connected to service: "));
                }
                IInterface iInterfaceA = ((zsj) obj).a(iBinder);
                zkt.m(iInterfaceA);
                ((zsj) obj).k = iInterfaceA;
                ((zsj) obj).l = 3;
                while (true) {
                    Queue queue = ((zsj) obj).g;
                    if (!queue.isEmpty()) {
                        Executor executor = ((zsj) obj).f;
                        zkt.m(executor);
                        Runnable runnable = (Runnable) queue.poll();
                        zkt.m(runnable);
                        executor.execute(runnable);
                    }
                }
            }
            return;
        }
        if (Log.isLoggable("GH.DemandClient", 3)) {
            Log.d("GH.DemandClient", "demand service connected");
        }
        Object obj2 = this.a;
        synchronized (((xqb) obj2).a) {
            if (iBinder == null) {
                ((xqb) obj2).c = xqfVar;
                try {
                    ((xqb) obj2).c.f(((xqb) obj2).d);
                    ((xqb) obj2).e.a();
                } catch (RemoteException unused3) {
                    if (Log.isLoggable("GH.DemandClient", 3)) {
                        Log.d("GH.DemandClient", "failed to register callback with demand service");
                    }
                }
            } else {
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.projection.sdk.demand.IDemandSpace");
                xqfVar = iInterfaceQueryLocalInterface3 instanceof xqh ? (xqh) iInterfaceQueryLocalInterface3 : new xqf(iBinder);
                ((xqb) obj2).c = xqfVar;
                ((xqb) obj2).c.f(((xqb) obj2).d);
                ((xqb) obj2).e.a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = this.b;
        if (i == 0) {
            ((PhoneKeyboardActivity) this.a).r.setEnabled(false);
            return;
        }
        if (i == 1) {
            ((ype) ((ype) ioq.E.h()).ai((char) 827)).y("onServiceDisconnected, component name: %s", componentName);
            ((ioq) this.a).I = null;
            return;
        }
        if (i == 2) {
            ((ype) CarUiEntry.logger.l().ai((char) 7054)).y("onServiceDisconnected %s", componentName);
            ((CarUiEntry) this.a).cleanupAppDecorService();
            return;
        }
        if (i == 3) {
            if (Log.isLoggable("GH.DemandClient", 3)) {
                Log.d("GH.DemandClient", "demand service disconnected");
            }
            Object obj = this.a;
            synchronized (((xqb) obj).a) {
                ((xqb) obj).c = null;
            }
            return;
        }
        Object obj2 = this.a;
        synchronized (((zsj) obj2).j) {
            String str = zsj.d;
            if (zrn.e(str, 3)) {
                Log.d(str, a.bY(componentName, "Disconnected from service: "));
            }
            ((zsj) obj2).k = null;
            ((zsj) obj2).l = 2;
        }
    }
}
