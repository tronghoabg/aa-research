package A7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import ba.C1521a;
import c7.C1565a;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import f7.AbstractC2614a;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import od.C3728u0;
import rd.C3973h;
import rd.EnumC3966a;

/* renamed from: A7.p1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0280p1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1020a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1021b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1022c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1023d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1024e;

    public /* synthetic */ RunnableC0280p1(C0271m1 c0271m1, N1 n12, boolean z2, AbstractC2614a abstractC2614a, int i5) {
        this.f1020a = i5;
        this.f1021b = n12;
        this.f1022c = z2;
        this.f1024e = abstractC2614a;
        this.f1023d = c0271m1;
    }

    private final void a() {
        Executor executor;
        int iA;
        Intent intent = (Intent) this.f1021b;
        Context context = (Context) this.f1024e;
        boolean z2 = this.f1022c;
        BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f1023d;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                iA = FirebaseInstanceIdReceiver.a(intent2);
            } else {
                int iIntValue = 500;
                if (intent.getExtras() != null) {
                    Executor executorUnconfigurableExecutorService = null;
                    C1565a c1565a = new C1565a(intent);
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    synchronized (FirebaseInstanceIdReceiver.class) {
                        try {
                            SoftReference softReference = FirebaseInstanceIdReceiver.f27335b;
                            if (softReference != null) {
                                executorUnconfigurableExecutorService = (Executor) softReference.get();
                            }
                            if (executorUnconfigurableExecutorService == null) {
                                zze.zza();
                                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new H6.b("pscm-ack-executor", 2));
                                threadPoolExecutor.allowCoreThreadTimeOut(true);
                                executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                FirebaseInstanceIdReceiver.f27335b = new SoftReference(executorUnconfigurableExecutorService);
                            }
                            executor = executorUnconfigurableExecutorService;
                        } finally {
                        }
                    }
                    executor.execute(new RunnableC0299w0(20, context, c1565a, countDownLatch, false));
                    try {
                        iIntValue = ((Integer) Tasks.await(new W9.i(context).b(intent))).intValue();
                    } catch (InterruptedException | ExecutionException e7) {
                        Log.e("FirebaseMessaging", "Failed to send message to service.", e7);
                    }
                    try {
                        if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                            Log.w("CloudMessagingReceiver", "Message ack timed out");
                        }
                    } catch (InterruptedException e10) {
                        Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e10.toString()));
                    }
                }
                iA = iIntValue;
            }
            if (z2 && pendingResult != null) {
                pendingResult.setResultCode(iA);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        pd.m mVar;
        md.k0 k0VarH;
        switch (this.f1020a) {
            case 0:
                C0271m1 c0271m1 = (C0271m1) this.f1023d;
                F f10 = c0271m1.f954d;
                if (f10 == null) {
                    c0271m1.zzj().f605f.c("Discarding data. Failed to set user property");
                    return;
                } else {
                    c0271m1.l0(f10, this.f1022c ? null : (R1) this.f1024e, (N1) this.f1021b);
                    c0271m1.v0();
                    return;
                }
            case 1:
                C0271m1 c0271m12 = (C0271m1) this.f1023d;
                F f11 = c0271m12.f954d;
                if (f11 == null) {
                    c0271m12.zzj().f605f.c("Discarding data. Failed to send event to service");
                    return;
                } else {
                    c0271m12.l0(f11, this.f1022c ? null : (C0301x) this.f1024e, (N1) this.f1021b);
                    c0271m12.v0();
                    return;
                }
            case 2:
                C0271m1 c0271m13 = (C0271m1) this.f1023d;
                F f12 = c0271m13.f954d;
                if (f12 == null) {
                    c0271m13.zzj().f605f.c("Discarding data. Failed to send conditional user property to service");
                    return;
                }
                c0271m13.l0(f12, this.f1022c ? null : (C0242d) this.f1024e, (N1) this.f1021b);
                c0271m13.v0();
                return;
            case 3:
                a();
                return;
            default:
                String name = Thread.currentThread().getName();
                Thread.currentThread().setName("OkHttpClientTransport");
                while (((C3973h) this.f1024e).a(this)) {
                    try {
                        C3728u0 c3728u0 = ((pd.m) this.f1023d).f43547F;
                        if (c3728u0 != null) {
                            c3728u0.a();
                        }
                    } catch (Throwable th) {
                        try {
                            pd.m mVar2 = (pd.m) this.f1023d;
                            EnumC3966a enumC3966a = EnumC3966a.PROTOCOL_ERROR;
                            md.k0 k0VarG = md.k0.f40681m.h("error in frame handler").g(th);
                            Map map = pd.m.f43540P;
                            mVar2.u(0, enumC3966a, k0VarG);
                            try {
                                ((C3973h) this.f1024e).close();
                            } catch (IOException e7) {
                                pd.m.f43541Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e7);
                            } catch (RuntimeException e10) {
                                if (!"bio == null".equals(e10.getMessage())) {
                                    throw e10;
                                }
                            }
                            mVar = (pd.m) this.f1023d;
                        } catch (Throwable th2) {
                            try {
                                ((C3973h) this.f1024e).close();
                            } catch (IOException e11) {
                                pd.m.f43541Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e11);
                            } catch (RuntimeException e12) {
                                if (!"bio == null".equals(e12.getMessage())) {
                                    throw e12;
                                }
                            }
                            ((pd.m) this.f1023d).f43563h.p();
                            Thread.currentThread().setName(name);
                            throw th2;
                        }
                    }
                }
                synchronized (((pd.m) this.f1023d).k) {
                    k0VarH = ((pd.m) this.f1023d).f43576v;
                }
                if (k0VarH == null) {
                    k0VarH = md.k0.f40682n.h("End of stream or IOException");
                }
                ((pd.m) this.f1023d).u(0, EnumC3966a.INTERNAL_ERROR, k0VarH);
                try {
                    ((C3973h) this.f1024e).close();
                } catch (IOException e13) {
                    pd.m.f43541Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e13);
                } catch (RuntimeException e14) {
                    if (!"bio == null".equals(e14.getMessage())) {
                        throw e14;
                    }
                }
                mVar = (pd.m) this.f1023d;
                mVar.f43563h.p();
                Thread.currentThread().setName(name);
                return;
        }
    }

    public /* synthetic */ RunnableC0280p1(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z2, BroadcastReceiver.PendingResult pendingResult) {
        this.f1020a = 3;
        this.f1021b = intent;
        this.f1024e = context;
        this.f1022c = z2;
        this.f1023d = pendingResult;
    }

    public RunnableC0280p1(C0271m1 c0271m1, N1 n12, boolean z2, C0242d c0242d, C0242d c0242d2) {
        this.f1020a = 2;
        this.f1021b = n12;
        this.f1022c = z2;
        this.f1024e = c0242d;
        this.f1023d = c0271m1;
    }

    public RunnableC0280p1(pd.m mVar, C3973h c3973h) {
        this.f1020a = 4;
        this.f1023d = mVar;
        Level level = Level.FINE;
        this.f1021b = new C1521a(19);
        this.f1022c = true;
        this.f1024e = c3973h;
    }
}
