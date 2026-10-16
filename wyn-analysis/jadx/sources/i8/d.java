package i8;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import ea.S;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: o, reason: collision with root package name */
    public static final HashMap f36891o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f36892a;

    /* renamed from: b, reason: collision with root package name */
    public final y f36893b;

    /* renamed from: c, reason: collision with root package name */
    public final String f36894c;

    /* renamed from: g, reason: collision with root package name */
    public boolean f36898g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f36899h;

    /* renamed from: i, reason: collision with root package name */
    public final C f36900i;

    /* renamed from: m, reason: collision with root package name */
    public S f36903m;

    /* renamed from: n, reason: collision with root package name */
    public IInterface f36904n;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f36895d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f36896e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f36897f = new Object();
    public final C2854A k = new IBinder.DeathRecipient() { // from class: i8.A
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            d dVar = this.f36881a;
            dVar.f36893b.b("reportBinderDeath", new Object[0]);
            if (dVar.f36901j.get() != null) {
                throw new ClassCastException();
            }
            dVar.f36893b.b("%s : Binder has died.", dVar.f36894c);
            Iterator it = dVar.f36895d.iterator();
            while (it.hasNext()) {
                ((z) it.next()).a(new RemoteException(String.valueOf(dVar.f36894c).concat(" : Binder has died.")));
            }
            dVar.f36895d.clear();
            synchronized (dVar.f36897f) {
                dVar.e();
            }
        }
    };

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f36902l = new AtomicInteger(0);

    /* renamed from: j, reason: collision with root package name */
    public final WeakReference f36901j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [i8.A] */
    public d(Context context, y yVar, String str, Intent intent, C c10) {
        this.f36892a = context;
        this.f36893b = yVar;
        this.f36894c = str;
        this.f36899h = intent;
        this.f36900i = c10;
    }

    public static void b(d dVar, z zVar) {
        IInterface iInterface = dVar.f36904n;
        ArrayList arrayList = dVar.f36895d;
        y yVar = dVar.f36893b;
        if (iInterface != null || dVar.f36898g) {
            if (!dVar.f36898g) {
                zVar.run();
                return;
            } else {
                yVar.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(zVar);
                return;
            }
        }
        yVar.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(zVar);
        S s10 = new S(dVar, 1);
        dVar.f36903m = s10;
        dVar.f36898g = true;
        if (dVar.f36892a.bindService(dVar.f36899h, s10, 1)) {
            return;
        }
        yVar.b("Failed to bind to the service.", new Object[0]);
        dVar.f36898g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((z) it.next()).a(new e("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f36891o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f36894c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f36894c, 10);
                    handlerThread.start();
                    map.put(this.f36894c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f36894c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(z zVar, TaskCompletionSource taskCompletionSource) {
        a().post(new C2855B(this, zVar.c(), taskCompletionSource, zVar));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f36897f) {
            this.f36896e.remove(taskCompletionSource);
        }
        a().post(new C2858c(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.f36896e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f36894c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
