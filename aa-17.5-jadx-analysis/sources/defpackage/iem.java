package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class iem implements ief, ieu, iel {
    private static final boolean a = Log.isLoggable("GlideRequest", 2);
    private RuntimeException A;
    private int B;
    private final sro C;
    private final String b;
    private final Object c;
    private final iej d;
    private final ieh e;
    private final Context f;
    private final hsf g;
    private final Object h;
    private final Class i;
    private final iec j;
    private final int k;
    private final int l;
    private final hsh m;
    private final iev n;
    private final List o;
    private final iff p;
    private final Executor q;
    private hwx r;
    private hwi s;
    private long t;
    private volatile hwj u;
    private Drawable v;
    private Drawable w;
    private int x;
    private int y;
    private boolean z;

    public iem(Context context, hsf hsfVar, Object obj, Object obj2, Class cls, iec iecVar, int i, int i2, hsh hshVar, iev ievVar, iej iejVar, List list, ieh iehVar, hwj hwjVar, iff iffVar, Executor executor) {
        this.b = a ? String.valueOf(System.identityHashCode(this)) : null;
        this.C = new sro();
        this.c = obj;
        this.f = context;
        this.g = hsfVar;
        this.h = obj2;
        this.i = cls;
        this.j = iecVar;
        this.k = i;
        this.l = i2;
        this.m = hshVar;
        this.n = ievVar;
        this.d = iejVar;
        this.o = list;
        this.e = iehVar;
        this.u = hwjVar;
        this.p = iffVar;
        this.q = executor;
        this.B = 1;
        if (this.A == null && hsfVar.g.a(hrx.class)) {
            this.A = new RuntimeException("Glide request origin trace");
        }
    }

    private static int h(int i, float f) {
        if (i == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return Math.round(f * i);
    }

    private final Drawable i() {
        int i;
        if (this.w == null) {
            iec iecVar = this.j;
            Drawable drawable = iecVar.g;
            this.w = drawable;
            if (drawable == null && (i = iecVar.h) > 0) {
                this.w = o(i);
            }
        }
        return this.w;
    }

    private final Drawable o(int i) {
        Resources.Theme theme = this.j.r;
        if (theme == null) {
            theme = this.f.getTheme();
        }
        Context context = this.f;
        return ice.a(context, context, i, theme);
    }

    private final void p() {
        if (this.z) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private final void q(String str) {
        Log.v("GlideRequest", str + " this: " + this.b);
    }

    private final boolean r() {
        ieh iehVar = this.e;
        return iehVar == null || iehVar.h(this);
    }

    private final void s() {
        ieh iehVar = this.e;
        if (iehVar != null) {
            iehVar.a().j();
        }
    }

    @Override // defpackage.iel
    public final Object a() {
        this.C.a();
        return this.c;
    }

    @Override // defpackage.ief
    public final void b() {
        synchronized (this.c) {
            p();
            this.C.a();
            int i = ift.a;
            this.t = SystemClock.elapsedRealtimeNanos();
            if (this.h == null) {
                int i2 = this.k;
                int i3 = this.l;
                if (ify.j(i2, i3)) {
                    this.x = i2;
                    this.y = i3;
                }
                g(new hwt("Received null model"));
                return;
            }
            int i4 = this.B;
            if (i4 == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (i4 == 4) {
                d(this.r, 5);
                return;
            }
            List<iej> list = this.o;
            if (list != null) {
                for (iej iejVar : list) {
                    if (iejVar instanceof iee) {
                        throw null;
                    }
                }
            }
            this.B = 3;
            int i5 = this.k;
            int i6 = this.l;
            if (ify.j(i5, i6)) {
                e(i5, i6);
            } else {
                this.n.e(this);
            }
            int i7 = this.B;
            if ((i7 == 2 || i7 == 3) && r()) {
                this.n.f(i());
            }
            if (a) {
                q("finished run method in " + ift.a(this.t));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [iel, java.lang.Object] */
    @Override // defpackage.ief
    public final void c() {
        synchronized (this.c) {
            p();
            sro sroVar = this.C;
            sroVar.a();
            if (this.B == 6) {
                return;
            }
            p();
            sroVar.a();
            this.n.g(this);
            hwi hwiVar = this.s;
            hwx hwxVar = null;
            if (hwiVar != null) {
                synchronized (hwiVar.c) {
                    ((hwn) hwiVar.a).g(hwiVar.b);
                }
                this.s = null;
            }
            hwx hwxVar2 = this.r;
            if (hwxVar2 != null) {
                this.r = null;
                hwxVar = hwxVar2;
            }
            ieh iehVar = this.e;
            if (iehVar == null || iehVar.g(this)) {
                this.n.a(i());
            }
            this.B = 6;
            if (hwxVar != null) {
                ((hwr) hwxVar).f();
            }
        }
    }

    @Override // defpackage.iel
    public final void d(hwx hwxVar, int i) throws Throwable {
        boolean zFi;
        this.C.a();
        hwx hwxVar2 = null;
        try {
            try {
                synchronized (this.c) {
                    try {
                        this.s = null;
                        if (hwxVar == null) {
                            g(new hwt("Expected to receive a Resource<R> with an object of " + String.valueOf(this.i) + " inside, but instead got null."));
                            return;
                        }
                        Object objC = hwxVar.c();
                        if (objC == null || !this.i.isAssignableFrom(objC.getClass())) {
                            this.r = null;
                            g(new hwt("Expected to receive an object of " + String.valueOf(this.i) + " but instead got " + String.valueOf(objC != null ? objC.getClass() : "") + "{" + String.valueOf(objC) + "} inside Resource{" + hwxVar.toString() + "}." + (objC != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.")));
                        } else {
                            ieh iehVar = this.e;
                            if (iehVar == null || iehVar.i(this)) {
                                s();
                                this.B = 4;
                                this.r = hwxVar;
                                if (this.g.e <= 3) {
                                    Log.d("Glide", "Finished loading " + objC.getClass().getSimpleName() + " from " + hdt.r(i) + " for " + String.valueOf(this.h) + " with size [" + this.x + "x" + this.y + "] in " + ift.a(this.t) + " ms");
                                }
                                if (iehVar != null) {
                                    iehVar.e(this);
                                }
                                boolean z = true;
                                this.z = true;
                                try {
                                    List<iej> list = this.o;
                                    if (list != null) {
                                        zFi = false;
                                        for (iej iejVar : list) {
                                            zFi |= iejVar.fi(objC, this.h, this.n, i);
                                            if (iejVar instanceof iee) {
                                                zFi |= ((iee) iejVar).c();
                                            }
                                        }
                                    } else {
                                        zFi = false;
                                    }
                                    iej iejVar2 = this.d;
                                    if (iejVar2 == null || !iejVar2.fi(objC, this.h, this.n, i)) {
                                        z = false;
                                    }
                                    if (!(z | zFi)) {
                                        this.n.c(objC, this.p.a(i));
                                    }
                                    return;
                                } finally {
                                    this.z = false;
                                }
                            }
                            this.r = null;
                            this.B = 4;
                        }
                        ((hwr) hwxVar).f();
                    } catch (Throwable th) {
                        th = th;
                        hwxVar = null;
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            hwxVar2 = hwxVar;
                            if (hwxVar2 != null) {
                                ((hwr) hwxVar2).f();
                            }
                            throw th;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0134 A[Catch: all -> 0x0215, TryCatch #0 {, blocks: (B:54:0x0134, B:56:0x0140, B:58:0x0145, B:59:0x014a, B:64:0x01e8, B:60:0x0151, B:62:0x01dc, B:63:0x01e3, B:66:0x01ea, B:25:0x00be, B:27:0x00c8, B:30:0x00cf, B:32:0x00d9, B:34:0x00e4, B:36:0x00ee, B:44:0x0110, B:47:0x011a, B:49:0x0122, B:51:0x012b, B:39:0x00fc, B:41:0x0100, B:42:0x0105), top: B:82:0x00be, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ea A[Catch: all -> 0x0215, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {, blocks: (B:54:0x0134, B:56:0x0140, B:58:0x0145, B:59:0x014a, B:64:0x01e8, B:60:0x0151, B:62:0x01dc, B:63:0x01e3, B:66:0x01ea, B:25:0x00be, B:27:0x00c8, B:30:0x00cf, B:32:0x00d9, B:34:0x00e4, B:36:0x00ee, B:44:0x0110, B:47:0x011a, B:49:0x0122, B:51:0x012b, B:39:0x00fc, B:41:0x0100, B:42:0x0105), top: B:82:0x00be, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r11v15, types: [dzk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [dzk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ieu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iem.e(int, int):void");
    }

    @Override // defpackage.ief
    public final void f() {
        synchronized (this.c) {
            if (n()) {
                c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.hwt r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Load failed for ["
            sro r1 = r8.C
            r1.a()
            java.lang.Object r1 = r8.c
            monitor-enter(r1)
            hsf r2 = r8.g     // Catch: java.lang.Throwable -> Lbb
            int r2 = r2.e     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r2 = "Glide"
            java.lang.Object r3 = r8.h     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Lbb
            int r5 = r8.x     // Catch: java.lang.Throwable -> Lbb
            int r6 = r8.y     // Catch: java.lang.Throwable -> Lbb
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbb
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Lbb
            r7.append(r4)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = "] with dimensions ["
            r7.append(r0)     // Catch: java.lang.Throwable -> Lbb
            r7.append(r5)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = "x"
            r7.append(r0)     // Catch: java.lang.Throwable -> Lbb
            r7.append(r6)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> Lbb
            android.util.Log.w(r2, r0, r9)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = "Glide"
            r9.b(r0)     // Catch: java.lang.Throwable -> Lbb
            r0 = 0
            r8.s = r0     // Catch: java.lang.Throwable -> Lbb
            r0 = 5
            r8.B = r0     // Catch: java.lang.Throwable -> Lbb
            ieh r0 = r8.e     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto L50
            r0.d(r8)     // Catch: java.lang.Throwable -> Lbb
        L50:
            r0 = 1
            r8.z = r0     // Catch: java.lang.Throwable -> Lbb
            r2 = 0
            java.util.List r4 = r8.o     // Catch: java.lang.Throwable -> Lb7
            if (r4 == 0) goto L74
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Lb7
            r5 = r2
        L5d:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> Lb7
            if (r6 == 0) goto L75
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> Lb7
            iej r6 = (defpackage.iej) r6     // Catch: java.lang.Throwable -> Lb7
            iev r7 = r8.n     // Catch: java.lang.Throwable -> Lb7
            r8.s()     // Catch: java.lang.Throwable -> Lb7
            boolean r6 = r6.fh(r9, r3, r7)     // Catch: java.lang.Throwable -> Lb7
            r5 = r5 | r6
            goto L5d
        L74:
            r5 = r2
        L75:
            iej r4 = r8.d     // Catch: java.lang.Throwable -> Lb7
            if (r4 == 0) goto L85
            iev r6 = r8.n     // Catch: java.lang.Throwable -> Lb7
            r8.s()     // Catch: java.lang.Throwable -> Lb7
            boolean r9 = r4.fh(r9, r3, r6)     // Catch: java.lang.Throwable -> Lb7
            if (r9 == 0) goto L85
            goto L86
        L85:
            r0 = r2
        L86:
            r9 = r5 | r0
            if (r9 != 0) goto Lb3
            boolean r9 = r8.r()     // Catch: java.lang.Throwable -> Lb7
            if (r9 == 0) goto Lb3
            android.graphics.drawable.Drawable r9 = r8.v     // Catch: java.lang.Throwable -> Lb7
            if (r9 != 0) goto La6
            iec r9 = r8.j     // Catch: java.lang.Throwable -> Lb7
            android.graphics.drawable.Drawable r0 = r9.e     // Catch: java.lang.Throwable -> Lb7
            r8.v = r0     // Catch: java.lang.Throwable -> Lb7
            if (r0 != 0) goto La6
            int r9 = r9.f     // Catch: java.lang.Throwable -> Lb7
            if (r9 <= 0) goto La6
            android.graphics.drawable.Drawable r9 = r8.o(r9)     // Catch: java.lang.Throwable -> Lb7
            r8.v = r9     // Catch: java.lang.Throwable -> Lb7
        La6:
            android.graphics.drawable.Drawable r9 = r8.v     // Catch: java.lang.Throwable -> Lb7
            if (r9 != 0) goto Lae
            android.graphics.drawable.Drawable r9 = r8.i()     // Catch: java.lang.Throwable -> Lb7
        Lae:
            iev r0 = r8.n     // Catch: java.lang.Throwable -> Lb7
            r0.b(r9)     // Catch: java.lang.Throwable -> Lb7
        Lb3:
            r8.z = r2     // Catch: java.lang.Throwable -> Lbb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lbb
            return
        Lb7:
            r9 = move-exception
            r8.z = r2     // Catch: java.lang.Throwable -> Lbb
            throw r9     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r8 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lbb
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iem.g(hwt):void");
    }

    @Override // defpackage.ief
    public final boolean j() {
        boolean z;
        synchronized (this.c) {
            z = this.B == 4;
        }
        return z;
    }

    @Override // defpackage.ief
    public final boolean k() {
        boolean z;
        synchronized (this.c) {
            z = this.B == 6;
        }
        return z;
    }

    @Override // defpackage.ief
    public final boolean l() {
        boolean z;
        synchronized (this.c) {
            z = this.B == 4;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    @Override // defpackage.ief
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(defpackage.ief r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof defpackage.iem
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r0 = r14.c
            monitor-enter(r0)
            int r2 = r14.k     // Catch: java.lang.Throwable -> L74
            int r3 = r14.l     // Catch: java.lang.Throwable -> L74
            java.lang.Object r4 = r14.h     // Catch: java.lang.Throwable -> L74
            java.lang.Class r5 = r14.i     // Catch: java.lang.Throwable -> L74
            iec r6 = r14.j     // Catch: java.lang.Throwable -> L74
            hsh r7 = r14.m     // Catch: java.lang.Throwable -> L74
            java.util.List r14 = r14.o     // Catch: java.lang.Throwable -> L74
            if (r14 == 0) goto L1e
            int r14 = r14.size()     // Catch: java.lang.Throwable -> L74
            goto L1f
        L1e:
            r14 = r1
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L74
            iem r15 = (defpackage.iem) r15
            java.lang.Object r8 = r15.c
            monitor-enter(r8)
            int r0 = r15.k     // Catch: java.lang.Throwable -> L71
            int r9 = r15.l     // Catch: java.lang.Throwable -> L71
            java.lang.Object r10 = r15.h     // Catch: java.lang.Throwable -> L71
            java.lang.Class r11 = r15.i     // Catch: java.lang.Throwable -> L71
            iec r12 = r15.j     // Catch: java.lang.Throwable -> L71
            hsh r13 = r15.m     // Catch: java.lang.Throwable -> L71
            java.util.List r15 = r15.o     // Catch: java.lang.Throwable -> L71
            if (r15 == 0) goto L3a
            int r15 = r15.size()     // Catch: java.lang.Throwable -> L71
            goto L3b
        L3a:
            r15 = r1
        L3b:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L71
            if (r2 != r0) goto L70
            if (r3 != r9) goto L70
            char[] r0 = defpackage.ify.a
            if (r4 != 0) goto L47
            if (r10 != 0) goto L70
            goto L58
        L47:
            boolean r0 = r4 instanceof defpackage.hze
            if (r0 == 0) goto L52
            hze r4 = (defpackage.hze) r4
            boolean r0 = r4.a()
            goto L56
        L52:
            boolean r0 = r4.equals(r10)
        L56:
            if (r0 == 0) goto L70
        L58:
            boolean r0 = r5.equals(r11)
            if (r0 == 0) goto L70
            if (r6 != 0) goto L63
            if (r12 != 0) goto L70
            goto L6a
        L63:
            boolean r0 = r6.S(r12)
            if (r0 != 0) goto L6a
            goto L70
        L6a:
            if (r7 != r13) goto L70
            if (r14 != r15) goto L70
            r14 = 1
            return r14
        L70:
            return r1
        L71:
            r14 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L71
            throw r14
        L74:
            r14 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L74
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iem.m(ief):boolean");
    }

    @Override // defpackage.ief
    public final boolean n() {
        boolean z;
        synchronized (this.c) {
            int i = this.B;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.c) {
            obj = this.h;
            cls = this.i;
        }
        return super.toString() + "[model=" + String.valueOf(obj) + ", transcodeClass=" + String.valueOf(cls) + "]";
    }
}
