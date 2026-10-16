package h6;

import com.applovin.shadow.okio.Segment;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import u6.AbstractC4256a;

/* renamed from: h6.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2786e implements InterfaceC2788g, H5.d {

    /* renamed from: a, reason: collision with root package name */
    public final H4.a f36191a;

    /* renamed from: f, reason: collision with root package name */
    public final C2785d[] f36196f;

    /* renamed from: h, reason: collision with root package name */
    public int f36198h;

    /* renamed from: i, reason: collision with root package name */
    public H5.h f36199i;

    /* renamed from: j, reason: collision with root package name */
    public C2789h f36200j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f36201l;

    /* renamed from: b, reason: collision with root package name */
    public final Object f36192b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f36193c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f36194d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final H5.h[] f36195e = new C2791j[2];

    /* renamed from: g, reason: collision with root package name */
    public int f36197g = 2;

    public AbstractC2786e() {
        C2785d[] c2785dArr = new C2785d[2];
        int i5 = 0;
        while (true) {
            if (i5 >= this.f36197g) {
                break;
            }
            this.f36195e[i5] = new C2791j(1);
            i5++;
        }
        this.f36196f = c2785dArr;
        this.f36198h = 2;
        for (int i10 = 0; i10 < this.f36198h; i10++) {
            this.f36196f[i10] = new C2785d(this, 1);
        }
        H4.a aVar = new H4.a(this, 1);
        this.f36191a = aVar;
        aVar.start();
        int i11 = this.f36197g;
        H5.h[] hVarArr = this.f36195e;
        AbstractC4256a.i(i11 == hVarArr.length);
        for (H5.h hVar : hVarArr) {
            hVar.r(Segment.SHARE_MINIMUM);
        }
    }

    @Override // H5.d
    public final Object b() {
        synchronized (this.f36192b) {
            try {
                C2789h c2789h = this.f36200j;
                if (c2789h != null) {
                    throw c2789h;
                }
                if (this.f36194d.isEmpty()) {
                    return null;
                }
                return (C2785d) this.f36194d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H5.d
    public final Object c() {
        H5.h hVar;
        synchronized (this.f36192b) {
            try {
                C2789h c2789h = this.f36200j;
                if (c2789h != null) {
                    throw c2789h;
                }
                AbstractC4256a.i(this.f36199i == null);
                int i5 = this.f36197g;
                if (i5 == 0) {
                    hVar = null;
                } else {
                    H5.h[] hVarArr = this.f36195e;
                    int i10 = i5 - 1;
                    this.f36197g = i10;
                    hVar = hVarArr[i10];
                }
                this.f36199i = hVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // H5.d
    public final void d(C2791j c2791j) {
        synchronized (this.f36192b) {
            try {
                C2789h c2789h = this.f36200j;
                if (c2789h != null) {
                    throw c2789h;
                }
                AbstractC4256a.e(c2791j == this.f36199i);
                this.f36193c.addLast(c2791j);
                if (!this.f36193c.isEmpty() && this.f36198h > 0) {
                    this.f36192b.notify();
                }
                this.f36199i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract InterfaceC2787f e(byte[] bArr, int i5, boolean z2);

    public final C2789h f(H5.h hVar, C2785d c2785d, boolean z2) {
        C2791j c2791j = (C2791j) hVar;
        try {
            ByteBuffer byteBuffer = c2791j.f4917d;
            byteBuffer.getClass();
            c2785d.q(c2791j.f4919f, e(byteBuffer.array(), byteBuffer.limit(), z2), c2791j.f36203i);
            c2785d.f4893b &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            return null;
        } catch (C2789h e7) {
            return e7;
        }
    }

    @Override // H5.d
    public final void flush() {
        synchronized (this.f36192b) {
            try {
                this.k = true;
                H5.h hVar = this.f36199i;
                if (hVar != null) {
                    hVar.o();
                    int i5 = this.f36197g;
                    this.f36197g = i5 + 1;
                    this.f36195e[i5] = hVar;
                    this.f36199i = null;
                }
                while (!this.f36193c.isEmpty()) {
                    H5.h hVar2 = (H5.h) this.f36193c.removeFirst();
                    hVar2.o();
                    int i10 = this.f36197g;
                    this.f36197g = i10 + 1;
                    this.f36195e[i10] = hVar2;
                }
                while (!this.f36194d.isEmpty()) {
                    ((C2785d) this.f36194d.removeFirst()).o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f36192b
            monitor-enter(r0)
        L3:
            boolean r1 = r8.f36201l     // Catch: java.lang.Throwable -> L20
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L23
            java.util.ArrayDeque r1 = r8.f36193c     // Catch: java.lang.Throwable -> L20
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L17
            int r1 = r8.f36198h     // Catch: java.lang.Throwable -> L20
            if (r1 <= 0) goto L17
            r1 = r3
            goto L18
        L17:
            r1 = r2
        L18:
            if (r1 != 0) goto L23
            java.lang.Object r1 = r8.f36192b     // Catch: java.lang.Throwable -> L20
            r1.wait()     // Catch: java.lang.Throwable -> L20
            goto L3
        L20:
            r1 = move-exception
            goto Lb1
        L23:
            boolean r1 = r8.f36201l     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r2
        L29:
            java.util.ArrayDeque r1 = r8.f36193c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L20
            H5.h r1 = (H5.h) r1     // Catch: java.lang.Throwable -> L20
            h6.d[] r4 = r8.f36196f     // Catch: java.lang.Throwable -> L20
            int r5 = r8.f36198h     // Catch: java.lang.Throwable -> L20
            int r5 = r5 - r3
            r8.f36198h = r5     // Catch: java.lang.Throwable -> L20
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L20
            boolean r5 = r8.k     // Catch: java.lang.Throwable -> L20
            r8.k = r2     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            r0 = 4
            boolean r6 = r1.h(r0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == 0) goto L4c
            r4.b(r0)
            goto L84
        L4c:
            boolean r0 = r1.h(r7)
            if (r0 == 0) goto L55
            r4.b(r7)
        L55:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            boolean r6 = r1.h(r0)
            if (r6 == 0) goto L60
            r4.b(r0)
        L60:
            h6.h r0 = r8.f(r1, r4, r5)     // Catch: java.lang.OutOfMemoryError -> L65 java.lang.RuntimeException -> L6f
            goto L78
        L65:
            r0 = move-exception
            h6.h r5 = new h6.h
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
        L6d:
            r0 = r5
            goto L78
        L6f:
            r0 = move-exception
            h6.h r5 = new h6.h
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
            goto L6d
        L78:
            if (r0 == 0) goto L84
            java.lang.Object r5 = r8.f36192b
            monitor-enter(r5)
            r8.f36200j = r0     // Catch: java.lang.Throwable -> L81
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L81
            return r2
        L81:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L81
            throw r0
        L84:
            java.lang.Object r2 = r8.f36192b
            monitor-enter(r2)
            boolean r0 = r8.k     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L91
            r4.o()     // Catch: java.lang.Throwable -> L8f
            goto La0
        L8f:
            r0 = move-exception
            goto Laf
        L91:
            boolean r0 = r4.h(r7)     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L9b
            r4.o()     // Catch: java.lang.Throwable -> L8f
            goto La0
        L9b:
            java.util.ArrayDeque r0 = r8.f36194d     // Catch: java.lang.Throwable -> L8f
            r0.addLast(r4)     // Catch: java.lang.Throwable -> L8f
        La0:
            r1.o()     // Catch: java.lang.Throwable -> L8f
            int r0 = r8.f36197g     // Catch: java.lang.Throwable -> L8f
            int r4 = r0 + 1
            r8.f36197g = r4     // Catch: java.lang.Throwable -> L8f
            H5.h[] r4 = r8.f36195e     // Catch: java.lang.Throwable -> L8f
            r4[r0] = r1     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8f
            return r3
        Laf:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8f
            throw r0
        Lb1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.AbstractC2786e.g():boolean");
    }

    @Override // H5.d
    public final void release() throws InterruptedException {
        synchronized (this.f36192b) {
            this.f36201l = true;
            this.f36192b.notify();
        }
        try {
            this.f36191a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // h6.InterfaceC2788g
    public final void a(long j8) {
    }
}
