package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ajjm implements Cloneable {
    public final ajia a;
    public final ajid b;
    public final ajjp c;
    public final ajjl d;
    public final AtomicBoolean e;
    public ajjn f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public volatile boolean m;
    public final CopyOnWriteArrayList n;
    public ajji o;
    public scz p;
    public volatile scz q;
    private Object r;

    public ajjm(ajia ajiaVar, ajid ajidVar) {
        this.a = ajiaVar;
        this.b = ajidVar;
        this.c = (ajjp) ajiaVar.s.a;
        TimeZone timeZone = ajis.a;
        ajjl ajjlVar = new ajjl(this);
        ajjlVar.k(0L, TimeUnit.MILLISECONDS);
        this.d = ajjlVar;
        this.e = new AtomicBoolean();
        this.l = true;
        this.n = new CopyOnWriteArrayList();
        new AtomicReference(ajidVar.d);
    }

    private final IOException j(IOException iOException) throws IOException {
        IOException iOException2;
        Socket socketC;
        TimeZone timeZone = ajis.a;
        ajjn ajjnVar = this.f;
        if (ajjnVar != null) {
            synchronized (ajjnVar) {
                socketC = c();
            }
            if (this.f == null) {
                if (socketC != null) {
                    ajis.g(socketC);
                }
            } else if (socketC != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.g && this.d.e()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            iOException2 = interruptedIOException;
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
                iOException2 = interruptedIOException;
            }
        } else {
            iOException2 = iOException;
        }
        if (iOException != null) {
            iOException2.getClass();
        }
        return iOException2;
    }

    public final IOException a(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.l) {
                this.l = false;
                if (!this.h && !this.i && !this.j) {
                    if (!this.k) {
                        z = true;
                    }
                }
            }
        }
        return z ? j(iOException) : iOException;
    }

    public final String b() {
        return this.b.a.e();
    }

    public final Socket c() {
        ajjn ajjnVar = this.f;
        ajjnVar.getClass();
        TimeZone timeZone = ajis.a;
        List list = ajjnVar.l;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (affa.f(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        list.remove(i);
        this.f = null;
        if (list.isEmpty()) {
            ajjnVar.m = System.nanoTime();
            ajjp ajjpVar = this.c;
            if (ajjnVar.g) {
                ajjnVar.f();
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) ajjpVar.d;
                concurrentLinkedQueue.remove(ajjnVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    ((ajiw) ajjpVar.c).a();
                }
                return ajjnVar.c;
            }
            ajjpVar.a();
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new ajjm(this.a, this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ajif d() throws java.lang.Throwable {
        /*
            r6 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            ajia r0 = r6.a
            java.util.List r1 = r0.d
            defpackage.woy.cq(r2, r1)
            ajkg r1 = new ajkg
            r1.<init>()
            r2.add(r1)
            ajjw r1 = new ajjw
            ajhp r3 = r0.f
            r1.<init>(r3)
            r2.add(r1)
            ajit r1 = new ajit
            r1.<init>()
            r2.add(r1)
            ajiz r1 = defpackage.ajiz.a
            r2.add(r1)
            java.util.List r0 = r0.e
            defpackage.woy.cq(r2, r0)
            ajjy r0 = defpackage.ajjy.a
            r2.add(r0)
            ajke r0 = new ajke
            ajid r5 = r6.b
            r3 = 0
            r4 = 0
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r6 = 0
            ajif r0 = r0.a(r5)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            boolean r2 = r1.m     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            if (r2 != 0) goto L4c
            r1.a(r6)
            return r0
        L4c:
            int r2 = defpackage.ajiq.a     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            defpackage.a.e(r0)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            throw r0     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
        L59:
            r0 = move-exception
            r2 = 0
            goto L67
        L5c:
            r0 = move-exception
            java.io.IOException r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L65
            r0.getClass()     // Catch: java.lang.Throwable -> L65
            throw r0     // Catch: java.lang.Throwable -> L65
        L65:
            r0 = move-exception
            r2 = 1
        L67:
            if (r2 != 0) goto L6c
            r1.a(r6)
        L6c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajjm.d():ajif");
    }

    public final void e(ajjn ajjnVar) {
        TimeZone timeZone = ajis.a;
        if (this.f != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f = ajjnVar;
        ajjnVar.l.add(new ajjk(this, this.r));
    }

    public final void f() {
        this.r = ajly.c.g();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ajkc, java.lang.Object] */
    public final void g() {
        if (this.m) {
            return;
        }
        this.m = true;
        scz sczVar = this.q;
        if (sczVar != null) {
            sczVar.c.e();
        }
        Iterator it = this.n.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((ajjt) it.next()).g();
        }
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [ajkc, java.lang.Object] */
    public final void h(boolean z) {
        scz sczVar;
        synchronized (this) {
            if (!this.l) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (sczVar = this.q) != null) {
            sczVar.c.e();
            ((ajjm) sczVar.e).i(sczVar, true, true, true, true, null);
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0024 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:8:0x000f, B:24:0x002b, B:26:0x002f, B:28:0x0033, B:30:0x0037, B:31:0x0039, B:33:0x003d, B:35:0x0041, B:37:0x0045, B:42:0x004e, B:14:0x0018, B:17:0x001e, B:20:0x0024), top: B:64:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.IOException i(defpackage.scz r4, boolean r5, boolean r6, boolean r7, boolean r8, java.io.IOException r9) {
        /*
            r3 = this;
            scz r0 = r3.q
            boolean r4 = defpackage.affa.f(r4, r0)
            if (r4 != 0) goto La
            goto L78
        La:
            monitor-enter(r3)
            r4 = 1
            r0 = 0
            if (r5 == 0) goto L16
            boolean r1 = r3.h     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L29
            goto L16
        L14:
            r4 = move-exception
            goto L59
        L16:
            if (r6 == 0) goto L1c
            boolean r1 = r3.i     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L29
        L1c:
            if (r8 == 0) goto L22
            boolean r1 = r3.j     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L29
        L22:
            if (r7 == 0) goto L5b
            boolean r7 = r3.k     // Catch: java.lang.Throwable -> L14
            if (r7 == 0) goto L5b
            r7 = r4
        L29:
            if (r5 == 0) goto L2d
            r3.h = r0     // Catch: java.lang.Throwable -> L14
        L2d:
            if (r6 == 0) goto L31
            r3.i = r0     // Catch: java.lang.Throwable -> L14
        L31:
            if (r8 == 0) goto L35
            r3.j = r0     // Catch: java.lang.Throwable -> L14
        L35:
            if (r7 == 0) goto L39
            r3.k = r0     // Catch: java.lang.Throwable -> L14
        L39:
            boolean r5 = r3.h     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L4b
            boolean r5 = r3.i     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L4b
            boolean r5 = r3.j     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L4b
            boolean r5 = r3.k     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L4b
            r5 = r4
            goto L4c
        L4b:
            r5 = r0
        L4c:
            if (r5 == 0) goto L55
            boolean r6 = r3.l     // Catch: java.lang.Throwable -> L14
            if (r6 != 0) goto L55
            r0 = r5
            r5 = r4
            goto L5c
        L55:
            r2 = r0
            r0 = r5
            r5 = r2
            goto L5c
        L59:
            monitor-exit(r3)
            throw r4
        L5b:
            r5 = r0
        L5c:
            monitor-exit(r3)
            if (r0 == 0) goto L71
            r6 = 0
            r3.q = r6
            ajjn r6 = r3.f
            if (r6 == 0) goto L71
            monitor-enter(r6)
            int r7 = r6.j     // Catch: java.lang.Throwable -> L6e
            int r7 = r7 + r4
            r6.j = r7     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r6)
            goto L71
        L6e:
            r3 = move-exception
            monitor-exit(r6)
            throw r3
        L71:
            if (r5 == 0) goto L78
            java.io.IOException r3 = r3.j(r9)
            return r3
        L78:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajjm.i(scz, boolean, boolean, boolean, boolean, java.io.IOException):java.io.IOException");
    }
}
