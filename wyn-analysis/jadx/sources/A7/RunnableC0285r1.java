package A7;

import Va.Y7;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzdo;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: A7.r1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0285r1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1040c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1043f;

    public /* synthetic */ RunnableC0285r1(E9.c cVar, CancellationToken cancellationToken, CancellationTokenSource cancellationTokenSource, Callable callable, TaskCompletionSource taskCompletionSource) {
        this.f1038a = 4;
        this.f1043f = cVar;
        this.f1039b = cancellationToken;
        this.f1040c = cancellationTokenSource;
        this.f1041d = callable;
        this.f1042e = taskCompletionSource;
    }

    private final void a() {
        C0271m1 c0271m1;
        F f10;
        synchronized (((AtomicReference) this.f1043f)) {
            try {
                try {
                    c0271m1 = (C0271m1) this.f1042e;
                    f10 = c0271m1.f954d;
                } catch (RemoteException e7) {
                    ((C0271m1) this.f1042e).zzj().f605f.a(null, (String) this.f1039b, e7, "(legacy) Failed to get conditional properties; remote exception");
                    ((AtomicReference) this.f1043f).set(Collections.EMPTY_LIST);
                }
                if (f10 == null) {
                    c0271m1.zzj().f605f.a(null, (String) this.f1039b, (String) this.f1040c, "(legacy) Failed to get conditional properties; not connected to service");
                    ((AtomicReference) this.f1043f).set(Collections.EMPTY_LIST);
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    ((AtomicReference) this.f1043f).set(f10.E((String) this.f1039b, (String) this.f1040c, (N1) this.f1041d));
                } else {
                    ((AtomicReference) this.f1043f).set(f10.i(null, (String) this.f1039b, (String) this.f1040c));
                }
                ((C0271m1) this.f1042e).v0();
                ((AtomicReference) this.f1043f).notify();
            } finally {
                ((AtomicReference) this.f1043f).notify();
            }
        }
    }

    private final void b() {
        md.k0 k0Var;
        for (od.G1 g12 : (Collection) this.f1043f) {
            if (g12 != ((od.G1) this.f1039b)) {
                g12.f41564a.g(od.B0.f41489G);
            }
        }
        Future future = (Future) this.f1040c;
        if (future != null) {
            future.cancel(false);
        }
        Future future2 = (Future) this.f1041d;
        if (future2 != null) {
            future2.cancel(false);
        }
        od.B0 b02 = (od.B0) this.f1042e;
        Y7 y72 = ((od.M0) b02.f41494D.f34137a).f41658F;
        synchronized (y72.f13867a) {
            try {
                ((HashSet) y72.f13868b).remove(b02);
                if (((HashSet) y72.f13868b).isEmpty()) {
                    k0Var = (md.k0) y72.f13869c;
                    y72.f13868b = new HashSet();
                } else {
                    k0Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (k0Var != null) {
            ((od.M0) y72.f13870d).f41657E.d(k0Var);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0138 -> B:73:0x013f). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.f1038a) {
            case 0:
                a();
                return;
            case 1:
                N1 n12 = (N1) this.f1041d;
                String str = (String) this.f1040c;
                String str2 = (String) this.f1039b;
                zzdo zzdoVar = (zzdo) this.f1043f;
                C0271m1 c0271m1 = (C0271m1) this.f1042e;
                ArrayList arrayList = new ArrayList();
                try {
                    F f10 = c0271m1.f954d;
                    if (f10 == null) {
                        c0271m1.zzj().f605f.b(str2, "Failed to get conditional properties; not connected to service", str);
                    } else {
                        arrayList = U1.Y0(f10.E(str2, str, n12));
                        c0271m1.v0();
                        c0271m1.b0().B0(zzdoVar, arrayList);
                    }
                } catch (RemoteException e7) {
                    c0271m1.zzj().f605f.a(str2, str, e7, "Failed to get conditional properties; remote exception");
                } finally {
                    c0271m1.b0().B0(zzdoVar, arrayList);
                }
                return;
            case 2:
                try {
                    if (!(((U3.j) this.f1043f).f12264a instanceof U3.a)) {
                        String string = ((UUID) this.f1039b).toString();
                        S3.p pVarH = ((T3.t) this.f1042e).f11446c.h(string);
                        if (pVarH == null || AbstractC0279p0.d(pVarH.f10978b)) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((T3.t) this.f1042e).f11445b.i(string, (J3.j) this.f1040c);
                        ((Context) this.f1041d).startService(R3.a.a((Context) this.f1041d, Fe.c.s(pVarH), (J3.j) this.f1040c));
                    }
                    ((U3.j) this.f1043f).i(null);
                    return;
                } catch (Throwable th) {
                    ((U3.j) this.f1043f).j(th);
                    return;
                }
            case 3:
                b();
                return;
            default:
                E9.c cVar = (E9.c) this.f1043f;
                CancellationToken cancellationToken = (CancellationToken) this.f1039b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.f1040c;
                Callable callable = (Callable) this.f1041d;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1042e;
                cVar.getClass();
                try {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                        return;
                    }
                    try {
                        if (!((AtomicBoolean) cVar.f3603c).get()) {
                            Ea.a aVar = (Ea.a) cVar;
                            synchronized (aVar) {
                                aVar.f3632d.zzb();
                            }
                            ((AtomicBoolean) cVar.f3603c).set(true);
                        }
                        if (cancellationToken.isCancellationRequested()) {
                            cancellationTokenSource.cancel();
                            return;
                        }
                        Object objCall = callable.call();
                        if (cancellationToken.isCancellationRequested()) {
                            cancellationTokenSource.cancel();
                            return;
                        } else {
                            taskCompletionSource.setResult(objCall);
                            return;
                        }
                    } catch (RuntimeException e10) {
                        throw new ua.a("Internal error has occurred when executing ML Kit tasks", e10);
                    }
                } catch (Exception e11) {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                        return;
                    } else {
                        taskCompletionSource.setException(e11);
                        return;
                    }
                }
        }
    }

    public /* synthetic */ RunnableC0285r1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i5) {
        this.f1038a = i5;
        this.f1043f = obj2;
        this.f1039b = obj3;
        this.f1040c = obj4;
        this.f1041d = obj5;
        this.f1042e = obj;
    }

    public RunnableC0285r1(C0271m1 c0271m1, String str, String str2, N1 n12, zzdo zzdoVar) {
        this.f1038a = 1;
        this.f1039b = str;
        this.f1040c = str2;
        this.f1041d = n12;
        this.f1043f = zzdoVar;
        this.f1042e = c0271m1;
    }
}
