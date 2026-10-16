package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class etr implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public etr(ajmd ajmdVar, erb erbVar, String str, Bundle bundle, ResultReceiver resultReceiver, int i) {
        this.f = i;
        this.d = ajmdVar;
        this.e = erbVar;
        this.a = str;
        this.b = bundle;
        this.c = resultReceiver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [android.view.WindowManager, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        byte[] bArr = null;
        if (i == 0) {
            etg etgVar = (etg) ((ett) ((ajmd) this.d).a).c.get(((erb) this.e).G());
            Object obj = this.a;
            if (etgVar == null) {
                Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + ((String) obj) + ", extras=" + this.b);
                return;
            }
            Object obj2 = this.b;
            Object obj3 = this.c;
            etp etpVar = new etp(obj);
            if (etpVar.f || etpVar.g) {
                Object obj4 = etpVar.e;
                Objects.toString(obj4);
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: ".concat(String.valueOf(obj4)));
            }
            etpVar.g = true;
            ((ResultReceiver) obj3).b(-1, null);
            if (!etpVar.c()) {
                throw new IllegalStateException(a.by(obj2, (String) obj, "onCustomAction must call detach() or sendResult() or sendError() before returning for action=", " extras="));
            }
            return;
        }
        if (i == 1) {
            IBinder iBinderG = ((erb) this.e).G();
            ett ettVar = (ett) ((ajmd) this.d).a;
            etg etgVar2 = (etg) ettVar.c.get(iBinderG);
            Object obj5 = this.a;
            if (etgVar2 == null) {
                Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=".concat(String.valueOf(obj5)));
                return;
            }
            Object obj6 = this.c;
            Object obj7 = this.b;
            HashMap map = etgVar2.d;
            List<dzi> arrayList = (List) map.get(obj5);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (dzi dziVar : arrayList) {
                if (obj6 == dziVar.a) {
                    if (ebc.c((Bundle) obj7, (Bundle) dziVar.b)) {
                        return;
                    }
                }
            }
            arrayList.add(new dzi(obj6, obj7));
            map.put(obj5, arrayList);
            ettVar.h((String) obj5, etgVar2, (Bundle) obj7);
            return;
        }
        if (i == 2) {
            SurfaceView surfaceView = new SurfaceView(((ilj) this.d).e);
            AtomicReference atomicReference = (AtomicReference) this.a;
            atomicReference.set(surfaceView);
            ((SurfaceView) atomicReference.get()).getHolder().addCallback(new ili(this.e, 0));
            this.c.addView((View) atomicReference.get(), (ViewGroup.LayoutParams) this.b);
            return;
        }
        Object obj8 = this.d;
        if (i != 3) {
            Object obj9 = this.b;
            ?? r2 = this.a;
            wub.ah(((oyr) this.e).d(r2, (BluetoothDevice) obj9, (oyp) obj8), new ikn(this.c, 13), r2);
            return;
        }
        knv knvVar = (knv) obj8;
        knvVar.d = true;
        Object obj10 = this.b;
        Context context = (Context) obj10;
        ols.M(context, yxi.USB_ISSUE_MENDEL_EVENT_TIMEOUT_OCCURRED);
        Object obj11 = this.e;
        rrj rrjVar = (rrj) obj11;
        if ((rrjVar.b & 16) != 0) {
            yxi yxiVarB = yxi.b(rrjVar.h);
            if (yxiVarB == null) {
                yxiVarB = yxi.UNKNOWN;
            }
            ols.M(context, yxiVarB);
        }
        Object obj12 = this.c;
        gms gmsVar = new gms((Object) yfq.o(rrjVar.j), (byte[]) null);
        boolean z = rrjVar.k;
        String str = rrjVar.c;
        jlh jlhVar = new jlh(obj12, obj11, 19, bArr);
        yph yphVar = knv.a;
        ((ype) yphVar.l().ai(3261)).R("For rule %s, car config: %s, check bluetooth: %s", str, Boolean.valueOf(gmsVar.c()), Boolean.valueOf(z));
        if (!gmsVar.c() && !z) {
            jlhVar.run();
            return;
        }
        ?? r12 = this.a;
        ((ype) yphVar.l().ai((char) 3262)).y("For rule %s, fetching bluetooth device to find car info", str);
        jud judVar = new jud(obj10, 4);
        ypf ypfVar = sfb.a;
        wub.ah(dsg.w(new sez(context, judVar, r12)), new ptx(knvVar, context, str, gmsVar, jlhVar, 1), r12);
    }

    public etr(ajmd ajmdVar, erb erbVar, String str, IBinder iBinder, Bundle bundle, int i) {
        this.f = i;
        this.d = ajmdVar;
        this.e = erbVar;
        this.a = str;
        this.c = iBinder;
        this.b = bundle;
    }

    public etr(ilj iljVar, AtomicReference atomicReference, Semaphore semaphore, WindowManager windowManager, WindowManager.LayoutParams layoutParams, int i) {
        this.f = i;
        this.a = atomicReference;
        this.e = semaphore;
        this.c = windowManager;
        this.b = layoutParams;
        this.d = iljVar;
    }

    public /* synthetic */ etr(knv knvVar, Context context, rrj rrjVar, ScheduledExecutorService scheduledExecutorService, knu knuVar, int i) {
        this.f = i;
        this.d = knvVar;
        this.b = context;
        this.e = rrjVar;
        this.a = scheduledExecutorService;
        this.c = knuVar;
    }

    public /* synthetic */ etr(oyr oyrVar, Executor executor, BluetoothDevice bluetoothDevice, oyp oypVar, dnw dnwVar, int i) {
        this.f = i;
        this.e = oyrVar;
        this.a = executor;
        this.b = bluetoothDevice;
        this.d = oypVar;
        this.c = dnwVar;
    }
}
