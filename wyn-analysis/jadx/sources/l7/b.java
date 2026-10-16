package L7;

import A7.C0237b0;
import Fe.c;
import G9.e;
import M8.j;
import S3.p;
import T3.m;
import Y2.B;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import c7.C1575k;
import c7.RunnableC1573i;
import c7.ServiceConnectionC1574j;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6980a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6981b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6982c;

    public /* synthetic */ b(int i5, Object obj, Object obj2) {
        this.f6980a = i5;
        this.f6981b = obj;
        this.f6982c = obj2;
    }

    private final void a() {
        p pVarB = ((R3.a) this.f6982c).f10214b.f6506f.b((String) this.f6981b);
        if (pVarB == null || !pVarB.b()) {
            return;
        }
        synchronized (((R3.a) this.f6982c).f10216d) {
            ((R3.a) this.f6982c).f10219g.put(c.s(pVarB), pVarB);
            ((R3.a) this.f6982c).f10220h.add(pVarB);
            R3.a aVar = (R3.a) this.f6982c;
            aVar.f10221i.F(aVar.f10220h);
        }
    }

    private final void b() {
        try {
            ((Runnable) this.f6982c).run();
            synchronized (((m) this.f6981b).f11422b) {
                ((m) this.f6981b).e();
            }
        } catch (Throwable th) {
            synchronized (((m) this.f6981b).f11422b) {
                ((m) this.f6981b).e();
                throw th;
            }
        }
    }

    private final void c() {
        ServiceConnectionC1574j serviceConnectionC1574j = (ServiceConnectionC1574j) this.f6981b;
        IBinder iBinder = (IBinder) this.f6982c;
        synchronized (serviceConnectionC1574j) {
            if (iBinder == null) {
                serviceConnectionC1574j.a("Null service connection");
                return;
            }
            try {
                serviceConnectionC1574j.f19695c = new B(iBinder);
                serviceConnectionC1574j.f19693a = 2;
                ((ScheduledExecutorService) serviceConnectionC1574j.f19698f.f19707c).execute(new RunnableC1573i(serviceConnectionC1574j, 0));
            } catch (RemoteException e7) {
                serviceConnectionC1574j.a(e7.getMessage());
            }
        }
    }

    private final void d() {
        ServiceConnectionC1574j serviceConnectionC1574j = (ServiceConnectionC1574j) this.f6981b;
        int i5 = ((C1575k) this.f6982c).f19699a;
        synchronized (serviceConnectionC1574j) {
            C1575k c1575k = (C1575k) serviceConnectionC1574j.f19697e.get(i5);
            if (c1575k != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i5);
                serviceConnectionC1574j.f19697e.remove(i5);
                c1575k.b(new Ya.a("Timed out waiting for response", null));
                serviceConnectionC1574j.c();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f6981b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        M8.j.f7558f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f6981b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.f6981b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f6982c     // Catch: java.lang.Throwable -> L58
            M8.j r2 = (M8.j) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f7560b     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f6982c     // Catch: java.lang.Throwable -> L20
            M8.j r0 = (M8.j) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f7561c     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L7d
        L22:
            long r6 = r0.f7562d     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f7562d = r6     // Catch: java.lang.Throwable -> L20
            r0.f7561c = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f6982c     // Catch: java.lang.Throwable -> L20
            M8.j r4 = (M8.j) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f7560b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f6981b = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.f6982c     // Catch: java.lang.Throwable -> L20
            M8.j r0 = (M8.j) r0     // Catch: java.lang.Throwable -> L20
            r0.f7561c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f6981b     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.f6981b = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = M8.j.f7558f     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f6981b     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.f6981b = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.b.e():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.b.run():void");
    }

    public String toString() {
        switch (this.f6980a) {
            case 2:
                Runnable runnable = (Runnable) this.f6981b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i5 = ((j) this.f6982c).f7561c;
                sb2.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb2.append("}");
                return sb2.toString();
            case 24:
                C0237b0 c0237b0S = Ba.c.S(this);
                e eVar = new e(28);
                ((e) c0237b0S.f815e).f4687d = eVar;
                c0237b0S.f815e = eVar;
                eVar.f4686c = (S3.e) this.f6982c;
                return c0237b0S.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(Object obj, int i5) {
        this.f6980a = i5;
        this.f6982c = obj;
    }

    public /* synthetic */ b(Object obj, boolean z2, Object obj2, int i5) {
        this.f6980a = i5;
        this.f6982c = obj;
        this.f6981b = obj2;
    }

    public b(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f6980a = 0;
        this.f6982c = swipeDismissBehavior;
        this.f6981b = view;
    }
}
