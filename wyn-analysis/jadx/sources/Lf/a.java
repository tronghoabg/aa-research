package Lf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class a extends Thread {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7095i = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final m f7096a;

    /* renamed from: b, reason: collision with root package name */
    public final G f7097b;

    /* renamed from: c, reason: collision with root package name */
    public b f7098c;

    /* renamed from: d, reason: collision with root package name */
    public long f7099d;

    /* renamed from: e, reason: collision with root package name */
    public long f7100e;

    /* renamed from: f, reason: collision with root package name */
    public int f7101f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7102g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f7103h;
    private volatile int indexInArray;

    @Nullable
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i5) {
        this.f7103h = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        this.f7096a = new m();
        this.f7097b = new G();
        this.f7098c = b.f7107d;
        this.nextParkedWorker = c.k;
        int iNanoTime = (int) System.nanoTime();
        this.f7101f = iNanoTime == 0 ? 42 : iNanoTime;
        f(i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r13 = Lf.m.f7137d.get(r3);
        r0 = Lf.m.f7136c.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r13 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (Lf.m.f7138e.get(r3) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r0 = r0 - 1;
        r1 = r3.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r2 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Lf.i a(boolean r13) {
        /*
            r12 = this;
            Lf.b r0 = r12.f7098c
            Lf.b r1 = Lf.b.f7104a
            r2 = 0
            Lf.m r3 = r12.f7096a
            r4 = 1
            Lf.c r5 = r12.f7103h
            if (r0 != r1) goto Le
            goto L88
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = Lf.c.f7111i
        L10:
            Lf.c r7 = r12.f7103h
            long r8 = r0.get(r7)
            r10 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r10 = r10 & r8
            r1 = 42
            long r10 = r10 >> r1
            int r1 = (int) r10
            if (r1 != 0) goto L75
            r3.getClass()
        L25:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = Lf.m.f7135b
            java.lang.Object r0 = r13.get(r3)
            Lf.i r0 = (Lf.i) r0
            if (r0 != 0) goto L30
            goto L43
        L30:
            boolean r1 = r0.f7126b
            if (r1 != r4) goto L43
        L34:
            boolean r1 = r13.compareAndSet(r3, r0, r2)
            if (r1 == 0) goto L3c
            r2 = r0
            goto L63
        L3c:
            java.lang.Object r1 = r13.get(r3)
            if (r1 == r0) goto L34
            goto L25
        L43:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = Lf.m.f7137d
            int r13 = r13.get(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Lf.m.f7136c
            int r0 = r0.get(r3)
        L4f:
            if (r13 == r0) goto L63
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = Lf.m.f7138e
            int r1 = r1.get(r3)
            if (r1 != 0) goto L5a
            goto L63
        L5a:
            int r0 = r0 + (-1)
            Lf.i r1 = r3.c(r0, r4)
            if (r1 == 0) goto L4f
            r2 = r1
        L63:
            if (r2 != 0) goto L74
            Lf.f r13 = r5.f7118f
            java.lang.Object r13 = r13.d()
            Lf.i r13 = (Lf.i) r13
            if (r13 != 0) goto L73
            Lf.i r13 = r12.i(r4)
        L73:
            return r13
        L74:
            return r2
        L75:
            r10 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r10 = r8 - r10
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = Lf.c.f7111i
            boolean r1 = r6.compareAndSet(r7, r8, r10)
            if (r1 == 0) goto L10
            Lf.b r0 = Lf.b.f7104a
            r12.f7098c = r0
        L88:
            if (r13 == 0) goto Lbc
            int r13 = r5.f7113a
            int r13 = r13 * 2
            int r13 = r12.d(r13)
            if (r13 != 0) goto L95
            goto L96
        L95:
            r4 = 0
        L96:
            if (r4 == 0) goto L9f
            Lf.i r13 = r12.e()
            if (r13 == 0) goto L9f
            return r13
        L9f:
            r3.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = Lf.m.f7135b
            java.lang.Object r13 = r13.getAndSet(r3, r2)
            Lf.i r13 = (Lf.i) r13
            if (r13 != 0) goto Lb0
            Lf.i r13 = r3.b()
        Lb0:
            if (r13 == 0) goto Lb3
            return r13
        Lb3:
            if (r4 != 0) goto Lc3
            Lf.i r13 = r12.e()
            if (r13 == 0) goto Lc3
            return r13
        Lbc:
            Lf.i r13 = r12.e()
            if (r13 == 0) goto Lc3
            return r13
        Lc3:
            r13 = 3
            Lf.i r13 = r12.i(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Lf.a.a(boolean):Lf.i");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i5) {
        int i10 = this.f7101f;
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >> 17);
        int i13 = i12 ^ (i12 << 5);
        this.f7101f = i13;
        int i14 = i5 - 1;
        return (i14 & i5) == 0 ? i13 & i14 : (i13 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) % i5;
    }

    public final i e() {
        int iD = d(2);
        c cVar = this.f7103h;
        if (iD == 0) {
            i iVar = (i) cVar.f7117e.d();
            return iVar != null ? iVar : (i) cVar.f7118f.d();
        }
        i iVar2 = (i) cVar.f7118f.d();
        return iVar2 != null ? iVar2 : (i) cVar.f7117e.d();
    }

    public final void f(int i5) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7103h.f7116d);
        sb2.append("-worker-");
        sb2.append(i5 == 0 ? "TERMINATED" : String.valueOf(i5));
        setName(sb2.toString());
        this.indexInArray = i5;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f7098c;
        boolean z2 = bVar2 == b.f7104a;
        if (z2) {
            c.f7111i.addAndGet(this.f7103h, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f7098c = bVar;
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        r7 = -2;
        r23 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Lf.i i(int r26) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lf.a.i(int):Lf.i");
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lf.a.run():void");
    }
}
