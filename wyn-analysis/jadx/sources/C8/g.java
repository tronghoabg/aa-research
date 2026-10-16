package C8;

import A.e0;
import A7.AbstractC0279p0;
import A7.C0237b0;
import E5.E0;
import J3.q;
import J3.r;
import J9.C0657p;
import K8.H;
import S3.p;
import W1.t;
import W1.v;
import W9.F;
import X0.AbstractC1276d;
import X0.C1275c;
import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1459x;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.J;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.vungle.ads.internal.ui.z;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import uc.C4271h;

/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1931a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1932b;

    public /* synthetic */ g(Object obj, int i5) {
        this.f1931a = i5;
        this.f1932b = obj;
    }

    private final void a() {
        C0237b0 c0237b0 = (C0237b0) this.f1932b;
        Map mapA = null;
        ((AtomicReference) c0237b0.f814d).set(null);
        synchronized (c0237b0) {
            try {
                if (((AtomicMarkableReference) c0237b0.f813c).isMarked()) {
                    mapA = ((T8.d) ((AtomicMarkableReference) c0237b0.f813c).getReference()).a();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) c0237b0.f813c;
                    atomicMarkableReference.set((T8.d) atomicMarkableReference.getReference(), false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mapA != null) {
            X8.c cVar = (X8.c) c0237b0.f815e;
            ((T8.g) cVar.f16185b).h((String) cVar.f16184a, mapA, c0237b0.f812b);
        }
    }

    private final void b() {
        V5.f fVar = (V5.f) this.f1932b;
        synchronized (fVar.f13038a) {
            try {
                if (fVar.f13048l) {
                    return;
                }
                long j8 = fVar.k - 1;
                fVar.k = j8;
                if (j8 > 0) {
                    return;
                }
                if (j8 < 0) {
                    fVar.b(new IllegalStateException());
                } else {
                    fVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        ConstraintTrackingWorker this$0 = (ConstraintTrackingWorker) this.f1932b;
        AbstractC3340k.e(this$0, "this$0");
        if (this$0.f19093d.f12264a instanceof U3.a) {
            return;
        }
        String strB = this$0.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        r rVarD = r.d();
        AbstractC3340k.d(rVarD, "get()");
        if (strB == null || strB.length() == 0) {
            rVarD.b(W3.a.f15146a, "No worker to delegate to.");
            U3.j future = this$0.f19093d;
            AbstractC3340k.d(future, "future");
            future.i(new J3.m());
            return;
        }
        q qVarA = this$0.getWorkerFactory().a(this$0.getApplicationContext(), strB, this$0.f19090a);
        this$0.f19094e = qVarA;
        if (qVarA == null) {
            rVarD.a(W3.a.f15146a, "No worker to delegate to.");
            U3.j future2 = this$0.f19093d;
            AbstractC3340k.d(future2, "future");
            future2.i(new J3.m());
            return;
        }
        K3.q qVarC = K3.q.c(this$0.getApplicationContext());
        S3.q qVarU = qVarC.f6503c.u();
        String string = this$0.getId().toString();
        AbstractC3340k.d(string, "id.toString()");
        p pVarH = qVarU.h(string);
        if (pVarH == null) {
            U3.j future3 = this$0.f19093d;
            AbstractC3340k.d(future3, "future");
            String str = W3.a.f15146a;
            future3.i(new J3.m());
            return;
        }
        S3.n nVar = qVarC.f6510j;
        AbstractC3340k.d(nVar, "workManagerImpl.trackers");
        b7.k kVar = new b7.k(nVar, this$0);
        kVar.F(AbstractC3935e.C(pVarH));
        String string2 = this$0.getId().toString();
        AbstractC3340k.d(string2, "id.toString()");
        if (!kVar.m(string2)) {
            rVarD.a(W3.a.f15146a, "Constraints not met for delegate " + strB + ". Requesting retry.");
            U3.j future4 = this$0.f19093d;
            AbstractC3340k.d(future4, "future");
            future4.i(new J3.n());
            return;
        }
        rVarD.a(W3.a.f15146a, "Constraints met for delegate ".concat(strB));
        try {
            q qVar = this$0.f19094e;
            AbstractC3340k.b(qVar);
            p8.p pVarStartWork = qVar.startWork();
            AbstractC3340k.d(pVarStartWork, "delegate!!.startWork()");
            pVarStartWork.addListener(new T3.r(15, this$0, pVarStartWork), this$0.getBackgroundExecutor());
        } catch (Throwable th) {
            String str2 = W3.a.f15146a;
            String strL = AbstractC0279p0.l("Delegated worker ", strB, " threw exception in startWork.");
            if (rVarD.f5584a <= 3) {
                Log.d(str2, strL, th);
            }
            synchronized (this$0.f19091b) {
                try {
                    if (!this$0.f19092c) {
                        U3.j future5 = this$0.f19093d;
                        AbstractC3340k.d(future5, "future");
                        future5.i(new J3.m());
                    } else {
                        rVarD.a(str2, "Constraints were unmet, Retrying.");
                        U3.j future6 = this$0.f19093d;
                        AbstractC3340k.d(future6, "future");
                        future6.i(new J3.n());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private final void d() {
        i iVar = (i) this.f1932b;
        synchronized (((ArrayDeque) iVar.f1942e)) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) iVar.f1939b).edit();
            String str = (String) iVar.f1940c;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = ((ArrayDeque) iVar.f1942e).iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append((String) iVar.f1941d);
            }
            editorEdit.putString(str, sb2.toString()).commit();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        Object obj;
        int i5 = 10;
        int i10 = 9;
        String str = null;
        switch (this.f1931a) {
            case 0:
                h hVar = (h) this.f1932b;
                f fVar = hVar.f1933a;
                fVar.f1928l.getToken().onSuccessTask(fVar.f1924g, new B8.b(fVar, 2)).addOnFailureListener(hVar.f1934b, new B8.b(hVar, 3));
                return;
            case 1:
                com.vungle.ads.internal.load.g.h((com.vungle.ads.internal.load.g) this.f1932b);
                return;
            case 2:
                ((E0) this.f1932b).b();
                return;
            case 3:
                com.vungle.ads.internal.omsdk.c.a((com.vungle.ads.internal.omsdk.c) this.f1932b);
                return;
            case 4:
                F5.f fVar2 = (F5.f) this.f1932b;
                fVar2.O(fVar2.J(), 1028, new F5.b(29));
                H h10 = fVar2.f3896f;
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) h10.f6586e;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    u6.i iVar = (u6.i) it.next();
                    iVar.f46681d = true;
                    if (iVar.f46680c) {
                        iVar.f46680c = false;
                        ((u6.h) h10.f6585d).a(iVar.f46678a, iVar.f46679b.c());
                    }
                }
                copyOnWriteArraySet.clear();
                h10.f6582a = true;
                return;
            case 5:
                com.vungle.ads.internal.session.b.b((com.vungle.ads.internal.session.b) this.f1932b);
                return;
            case 6:
                CoroutineWorker.a((CoroutineWorker) this.f1932b);
                return;
            case 7:
                C0657p c0657p = (C0657p) this.f1932b;
                boolean z10 = c0657p.f5972b;
                c0657p.f5972b = !(z10 && c0657p.f5973c) && z10;
                return;
            case 8:
                z.a(true, (z) this.f1932b);
                return;
            case 9:
                com.vungle.ads.internal.ui.view.g.a((com.vungle.ads.internal.ui.view.g) this.f1932b);
                return;
            case 10:
                M.r.m4setRippleState$lambda2((M.r) this.f1932b);
                return;
            case 11:
                M0.f tmp0 = (M0.f) this.f1932b;
                AbstractC3340k.e(tmp0, "$tmp0");
                tmp0.invoke();
                return;
            case 12:
                X8.c cVar = (X8.c) this.f1932b;
                synchronized (((AtomicMarkableReference) cVar.f16190g)) {
                    try {
                        if (((AtomicMarkableReference) cVar.f16190g).isMarked()) {
                            str = (String) ((AtomicMarkableReference) cVar.f16190g).getReference();
                            ((AtomicMarkableReference) cVar.f16190g).set(str, false);
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } finally {
                    }
                }
                if (z2) {
                    ((T8.g) cVar.f16185b).j((String) cVar.f16184a, str);
                    return;
                }
                return;
            case 13:
                a();
                return;
            case 14:
                V1.d dVar = (V1.d) this.f1932b;
                dVar.L(dVar.G(), 1028, new V1.b(18));
                dVar.f12904f.d();
                return;
            case 15:
                b();
                return;
            case 16:
                ((C4271h) this.f1932b).a(null);
                return;
            case 17:
                t tVar = (t) this.f1932b;
                if (tVar.f15079h0 >= 300000) {
                    ((v) tVar.f15089r.f47873b).f15112O0 = true;
                    tVar.f15079h0 = 0L;
                    return;
                }
                return;
            case 18:
                c();
                return;
            case 19:
                d();
                return;
            case 20:
                StringBuilder sb2 = new StringBuilder("Service took too long to process intent: ");
                F f10 = (F) this.f1932b;
                sb2.append(f10.f15303a.getAction());
                sb2.append(" finishing.");
                Log.w("FirebaseMessaging", sb2.toString());
                f10.f15304b.trySetResult(null);
                return;
            case 21:
                ((Wa.h) this.f1932b).f15449c.c();
                return;
            case 22:
                Wb.a aVar = (Wb.a) this.f1932b;
                C4271h c4271h = aVar.f15452c;
                ConnectivityManager connectivityManager = (ConnectivityManager) aVar.f15451b.f47873b;
                c4271h.a(xa.d.m(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
                return;
            case 23:
                Activity activity = (Activity) this.f1932b;
                if (activity.isFinishing()) {
                    return;
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 28) {
                    Class cls = AbstractC1276d.f15831a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC1276d.f15831a;
                boolean z11 = i11 == 26 || i11 == 27;
                Method method = AbstractC1276d.f15836f;
                if ((!z11 || method != null) && (AbstractC1276d.f15835e != null || AbstractC1276d.f15834d != null)) {
                    try {
                        Object obj2 = AbstractC1276d.f15833c.get(activity);
                        if (obj2 != null && (obj = AbstractC1276d.f15832b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C1275c c1275c = new C1275c(activity);
                            application.registerActivityLifecycleCallbacks(c1275c);
                            Handler handler = AbstractC1276d.f15837g;
                            handler.post(new L7.b(i10, c1275c, obj2));
                            try {
                                if (i11 == 26 || i11 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new L7.b(i5, application, c1275c));
                                return;
                            } catch (Throwable th) {
                                handler.post(new L7.b(i5, application, c1275c));
                                throw th;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 24:
                ((e0) this.f1932b).u();
                return;
            case 25:
                ((ComponentActivity) this.f1932b).invalidateMenu();
                return;
            case 26:
                androidx.activity.l lVar = (androidx.activity.l) this.f1932b;
                Runnable runnable = lVar.f17715b;
                if (runnable != null) {
                    runnable.run();
                    lVar.f17715b = null;
                    return;
                }
                return;
            case 27:
                androidx.activity.m.a((androidx.activity.m) this.f1932b);
                return;
            default:
                J this$0 = (J) this.f1932b;
                AbstractC3340k.e(this$0, "this$0");
                int i12 = this$0.f18591b;
                C1459x c1459x = this$0.f18595f;
                if (i12 == 0) {
                    this$0.f18592c = true;
                    c1459x.f(EnumC1449m.ON_PAUSE);
                }
                if (this$0.f18590a == 0 && this$0.f18592c) {
                    c1459x.f(EnumC1449m.ON_STOP);
                    this$0.f18593d = true;
                    return;
                }
                return;
        }
    }
}
