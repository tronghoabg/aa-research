package a4;

import A7.C0237b0;
import B.F;
import Bf.k;
import Bf.r;
import Ef.H;
import cg.AbstractC1613b;
import cg.C1609A;
import cg.C1614c;
import cg.J;
import cg.u;
import cg.w;
import cg.y;
import com.unity3d.services.UnityAdsConstants;
import ef.C2515C;
import ff.AbstractC2641B;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class f implements Closeable, Flushable {

    /* renamed from: q, reason: collision with root package name */
    public static final Bf.i f17356q = new Bf.i("[a-z0-9_-]{1,120}");

    /* renamed from: a, reason: collision with root package name */
    public final y f17357a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17358b;

    /* renamed from: c, reason: collision with root package name */
    public final y f17359c;

    /* renamed from: d, reason: collision with root package name */
    public final y f17360d;

    /* renamed from: e, reason: collision with root package name */
    public final y f17361e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f17362f;

    /* renamed from: g, reason: collision with root package name */
    public final Kd.a f17363g;

    /* renamed from: h, reason: collision with root package name */
    public long f17364h;

    /* renamed from: i, reason: collision with root package name */
    public int f17365i;

    /* renamed from: j, reason: collision with root package name */
    public C1609A f17366j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17367l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17368m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f17369n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17370o;

    /* renamed from: p, reason: collision with root package name */
    public final C1331d f17371p;

    public f(long j8, Lf.d dVar, u uVar, y yVar) {
        this.f17357a = yVar;
        this.f17358b = j8;
        if (j8 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f17359c = yVar.d("journal");
        this.f17360d = yVar.d("journal.tmp");
        this.f17361e = yVar.d("journal.bkp");
        this.f17362f = new LinkedHashMap(0, 0.75f, true);
        this.f17363g = H.c(Fe.c.B(H.f(), dVar.y(1)));
        this.f17371p = new C1331d(uVar);
    }

    public static void J(String str) {
        if (!f17356q.b(str)) {
            throw new IllegalArgumentException(AbstractC3256n.f('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x011b A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:15:0x0030, B:23:0x003e, B:25:0x0056, B:29:0x0073, B:31:0x0083, B:33:0x008a, B:26:0x005c, B:28:0x006c, B:37:0x00aa, B:39:0x00b1, B:42:0x00b6, B:44:0x00c7, B:47:0x00cc, B:52:0x0107, B:54:0x0112, B:58:0x011b, B:48:0x00e4, B:50:0x00f9, B:51:0x0104, B:36:0x009a, B:61:0x0120, B:62:0x0127), top: B:65:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(a4.f r9, A7.C0237b0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.f.a(a4.f, A7.b0, boolean):void");
    }

    public final void B(C1329b c1329b) {
        C1609A c1609a;
        int i5 = c1329b.f17349h;
        String str = c1329b.f17342a;
        if (i5 > 0 && (c1609a = this.f17366j) != null) {
            c1609a.writeUtf8("DIRTY");
            c1609a.writeByte(32);
            c1609a.writeUtf8(str);
            c1609a.writeByte(10);
            c1609a.flush();
        }
        if (c1329b.f17349h > 0 || c1329b.f17348g != null) {
            c1329b.f17347f = true;
            return;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.f17371p.b((y) c1329b.f17344c.get(i10));
            long j8 = this.f17364h;
            long[] jArr = c1329b.f17343b;
            this.f17364h = j8 - jArr[i10];
            jArr[i10] = 0;
        }
        this.f17365i++;
        C1609A c1609a2 = this.f17366j;
        if (c1609a2 != null) {
            c1609a2.writeUtf8("REMOVE");
            c1609a2.writeByte(32);
            c1609a2.writeUtf8(str);
            c1609a2.writeByte(10);
        }
        this.f17362f.remove(str);
        if (this.f17365i >= 2000) {
            i();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        B(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f17364h
            long r2 = r4.f17358b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f17362f
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            a4.b r1 = (a4.C1329b) r1
            boolean r2 = r1.f17347f
            if (r2 != 0) goto L12
            r4.B(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f17369n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.f.D():void");
    }

    public final synchronized void P() {
        C2515C c2515c;
        try {
            C1609A c1609a = this.f17366j;
            if (c1609a != null) {
                c1609a.close();
            }
            C1609A c1609aC = AbstractC1613b.c(this.f17371p.h(this.f17360d));
            Throwable th = null;
            try {
                c1609aC.writeUtf8("libcore.io.DiskLruCache");
                c1609aC.writeByte(10);
                c1609aC.writeUtf8(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                c1609aC.writeByte(10);
                c1609aC.writeDecimalLong(1);
                c1609aC.writeByte(10);
                c1609aC.writeDecimalLong(2);
                c1609aC.writeByte(10);
                c1609aC.writeByte(10);
                for (C1329b c1329b : this.f17362f.values()) {
                    if (c1329b.f17348g != null) {
                        c1609aC.writeUtf8("DIRTY");
                        c1609aC.writeByte(32);
                        c1609aC.writeUtf8(c1329b.f17342a);
                        c1609aC.writeByte(10);
                    } else {
                        c1609aC.writeUtf8("CLEAN");
                        c1609aC.writeByte(32);
                        c1609aC.writeUtf8(c1329b.f17342a);
                        for (long j8 : c1329b.f17343b) {
                            c1609aC.writeByte(32);
                            c1609aC.writeDecimalLong(j8);
                        }
                        c1609aC.writeByte(10);
                    }
                }
                c2515c = C2515C.f34653a;
            } catch (Throwable th2) {
                c2515c = null;
                th = th2;
            }
            try {
                c1609aC.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                } else {
                    Fe.b.d(th, th3);
                }
            }
            if (th != null) {
                throw th;
            }
            AbstractC3340k.b(c2515c);
            if (this.f17371p.c(this.f17359c)) {
                this.f17371p.j(this.f17359c, this.f17361e);
                this.f17371p.j(this.f17360d, this.f17359c);
                this.f17371p.b(this.f17361e);
            } else {
                this.f17371p.j(this.f17360d, this.f17359c);
            }
            this.f17366j = o();
            this.f17365i = 0;
            this.k = false;
            this.f17370o = false;
        } finally {
        }
    }

    public final synchronized C0237b0 b(String str) {
        try {
            if (this.f17368m) {
                throw new IllegalStateException("cache is closed");
            }
            J(str);
            h();
            C1329b c1329b = (C1329b) this.f17362f.get(str);
            if ((c1329b != null ? c1329b.f17348g : null) != null) {
                return null;
            }
            if (c1329b != null && c1329b.f17349h != 0) {
                return null;
            }
            if (!this.f17369n && !this.f17370o) {
                C1609A c1609a = this.f17366j;
                AbstractC3340k.b(c1609a);
                c1609a.writeUtf8("DIRTY");
                c1609a.writeByte(32);
                c1609a.writeUtf8(str);
                c1609a.writeByte(10);
                c1609a.flush();
                if (this.k) {
                    return null;
                }
                if (c1329b == null) {
                    c1329b = new C1329b(this, str);
                    this.f17362f.put(str, c1329b);
                }
                C0237b0 c0237b0 = new C0237b0(this, c1329b);
                c1329b.f17348g = c0237b0;
                return c0237b0;
            }
            i();
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f17367l && !this.f17368m) {
                Object[] array = this.f17362f.values().toArray(new C1329b[0]);
                AbstractC3340k.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                for (C1329b c1329b : (C1329b[]) array) {
                    C0237b0 c0237b0 = c1329b.f17348g;
                    if (c0237b0 != null) {
                        C1329b c1329b2 = (C1329b) c0237b0.f813c;
                        if (AbstractC3340k.a(c1329b2.f17348g, c0237b0)) {
                            c1329b2.f17347f = true;
                        }
                    }
                }
                D();
                H.j(this.f17363g, null);
                C1609A c1609a = this.f17366j;
                AbstractC3340k.b(c1609a);
                c1609a.close();
                this.f17366j = null;
                this.f17368m = true;
                return;
            }
            this.f17368m = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized C1330c d(String str) {
        C1330c c1330cA;
        if (this.f17368m) {
            throw new IllegalStateException("cache is closed");
        }
        J(str);
        h();
        C1329b c1329b = (C1329b) this.f17362f.get(str);
        if (c1329b != null && (c1330cA = c1329b.a()) != null) {
            boolean z2 = true;
            this.f17365i++;
            C1609A c1609a = this.f17366j;
            AbstractC3340k.b(c1609a);
            c1609a.writeUtf8("READ");
            c1609a.writeByte(32);
            c1609a.writeUtf8(str);
            c1609a.writeByte(10);
            if (this.f17365i < 2000) {
                z2 = false;
            }
            if (z2) {
                i();
            }
            return c1330cA;
        }
        return null;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f17367l) {
            if (this.f17368m) {
                throw new IllegalStateException("cache is closed");
            }
            D();
            C1609A c1609a = this.f17366j;
            AbstractC3340k.b(c1609a);
            c1609a.flush();
        }
    }

    public final synchronized void h() {
        try {
            if (this.f17367l) {
                return;
            }
            this.f17371p.b(this.f17360d);
            if (this.f17371p.c(this.f17361e)) {
                if (this.f17371p.c(this.f17359c)) {
                    this.f17371p.b(this.f17361e);
                } else {
                    this.f17371p.j(this.f17361e, this.f17359c);
                }
            }
            if (this.f17371p.c(this.f17359c)) {
                try {
                    y();
                    w();
                    this.f17367l = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        AbstractC2641B.q(this.f17371p, this.f17357a);
                        this.f17368m = false;
                    } catch (Throwable th) {
                        this.f17368m = false;
                        throw th;
                    }
                }
            }
            P();
            this.f17367l = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void i() {
        H.D(this.f17363g, null, new e(this, null), 3);
    }

    public final C1609A o() {
        C1331d c1331d = this.f17371p;
        c1331d.getClass();
        y file = this.f17359c;
        AbstractC3340k.e(file, "file");
        c1331d.getClass();
        AbstractC3340k.e(file, "file");
        c1331d.f17354b.getClass();
        File fileE = file.e();
        Logger logger = w.f19934a;
        return AbstractC1613b.c(new g(new C1614c(1, new FileOutputStream(fileE, true), new J()), new F(this, 11)));
    }

    public final void w() {
        Iterator it = this.f17362f.values().iterator();
        long j8 = 0;
        while (it.hasNext()) {
            C1329b c1329b = (C1329b) it.next();
            int i5 = 0;
            if (c1329b.f17348g == null) {
                while (i5 < 2) {
                    j8 += c1329b.f17343b[i5];
                    i5++;
                }
            } else {
                c1329b.f17348g = null;
                while (i5 < 2) {
                    y yVar = (y) c1329b.f17344c.get(i5);
                    C1331d c1331d = this.f17371p;
                    c1331d.b(yVar);
                    c1331d.b((y) c1329b.f17345d.get(i5));
                    i5++;
                }
                it.remove();
            }
        }
        this.f17364h = j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            a4.d r2 = r13.f17371p
            cg.y r3 = r13.f17359c
            cg.H r2 = r2.i(r3)
            cg.B r2 = cg.AbstractC1613b.d(r2)
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = 0
            java.lang.String r6 = r2.readUtf8LineStrict(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r7 = r2.readUtf8LineStrict(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r8 = r2.readUtf8LineStrict(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r9 = r2.readUtf8LineStrict(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r10 = r2.readUtf8LineStrict(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r11 = "libcore.io.DiskLruCache"
            boolean r11 = r11.equals(r6)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L7f
            java.lang.String r11 = "1"
            boolean r11 = r11.equals(r7)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L7f
            r11 = 1
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L61
            boolean r11 = kotlin.jvm.internal.AbstractC3340k.a(r11, r8)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L7f
            r11 = 2
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L61
            boolean r11 = kotlin.jvm.internal.AbstractC3340k.a(r11, r9)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L7f
            int r11 = r10.length()     // Catch: java.lang.Throwable -> L61
            if (r11 > 0) goto L7f
            r0 = 0
        L57:
            java.lang.String r1 = r2.readUtf8LineStrict(r3)     // Catch: java.lang.Throwable -> L61 java.io.EOFException -> L63
            r13.z(r1)     // Catch: java.lang.Throwable -> L61 java.io.EOFException -> L63
            int r0 = r0 + 1
            goto L57
        L61:
            r0 = move-exception
            goto Lae
        L63:
            java.util.LinkedHashMap r1 = r13.f17362f     // Catch: java.lang.Throwable -> L61
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L61
            int r0 = r0 - r1
            r13.f17365i = r0     // Catch: java.lang.Throwable -> L61
            boolean r0 = r2.exhausted()     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L76
            r13.P()     // Catch: java.lang.Throwable -> L61
            goto L7c
        L76:
            cg.A r0 = r13.o()     // Catch: java.lang.Throwable -> L61
            r13.f17366j = r0     // Catch: java.lang.Throwable -> L61
        L7c:
            ef.C r0 = ef.C2515C.f34653a     // Catch: java.lang.Throwable -> L61
            goto Lb1
        L7f:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L61
            r4.append(r6)     // Catch: java.lang.Throwable -> L61
            r4.append(r0)     // Catch: java.lang.Throwable -> L61
            r4.append(r7)     // Catch: java.lang.Throwable -> L61
            r4.append(r0)     // Catch: java.lang.Throwable -> L61
            r4.append(r8)     // Catch: java.lang.Throwable -> L61
            r4.append(r0)     // Catch: java.lang.Throwable -> L61
            r4.append(r9)     // Catch: java.lang.Throwable -> L61
            r4.append(r0)     // Catch: java.lang.Throwable -> L61
            r4.append(r10)     // Catch: java.lang.Throwable -> L61
            r0 = 93
            r4.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L61
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L61
            throw r3     // Catch: java.lang.Throwable -> L61
        Lae:
            r12 = r5
            r5 = r0
            r0 = r12
        Lb1:
            r2.close()     // Catch: java.lang.Throwable -> Lb5
            goto Lbd
        Lb5:
            r1 = move-exception
            if (r5 != 0) goto Lba
            r5 = r1
            goto Lbd
        Lba:
            Fe.b.d(r5, r1)
        Lbd:
            if (r5 != 0) goto Lc3
            kotlin.jvm.internal.AbstractC3340k.b(r0)
            return
        Lc3:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.f.y():void");
    }

    public final void z(String str) throws IOException {
        String strSubstring;
        int iV0 = k.v0(str, ' ', 0, 6);
        if (iV0 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i5 = iV0 + 1;
        int iV02 = k.v0(str, ' ', i5, 4);
        LinkedHashMap linkedHashMap = this.f17362f;
        if (iV02 == -1) {
            strSubstring = str.substring(i5);
            AbstractC3340k.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (iV0 == 6 && r.k0(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i5, iV02);
            AbstractC3340k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Object c1329b = linkedHashMap.get(strSubstring);
        if (c1329b == null) {
            c1329b = new C1329b(this, strSubstring);
            linkedHashMap.put(strSubstring, c1329b);
        }
        C1329b c1329b2 = (C1329b) c1329b;
        if (iV02 == -1 || iV0 != 5 || !r.k0(str, "CLEAN", false)) {
            if (iV02 == -1 && iV0 == 5 && r.k0(str, "DIRTY", false)) {
                c1329b2.f17348g = new C0237b0(this, c1329b2);
                return;
            } else {
                if (iV02 != -1 || iV0 != 4 || !r.k0(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String strSubstring2 = str.substring(iV02 + 1);
        AbstractC3340k.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
        List listH0 = k.H0(strSubstring2, new char[]{' '});
        c1329b2.f17346e = true;
        c1329b2.f17348g = null;
        int size = listH0.size();
        c1329b2.f17350i.getClass();
        if (size != 2) {
            throw new IOException("unexpected journal line: " + listH0);
        }
        try {
            int size2 = listH0.size();
            for (int i10 = 0; i10 < size2; i10++) {
                c1329b2.f17343b[i10] = Long.parseLong((String) listH0.get(i10));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listH0);
        }
    }
}
