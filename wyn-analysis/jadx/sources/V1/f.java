package V1;

import E5.C0467q;
import N1.L;
import N1.M;
import N1.N;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import k2.H;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: h, reason: collision with root package name */
    public static final C0467q f12915h = new C0467q(3);

    /* renamed from: i, reason: collision with root package name */
    public static final Random f12916i = new Random();

    /* renamed from: d, reason: collision with root package name */
    public i f12920d;

    /* renamed from: f, reason: collision with root package name */
    public String f12922f;

    /* renamed from: a, reason: collision with root package name */
    public final M f12917a = new M();

    /* renamed from: b, reason: collision with root package name */
    public final L f12918b = new L();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f12919c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public N f12921e = N.f8072a;

    /* renamed from: g, reason: collision with root package name */
    public long f12923g = -1;

    public final void a(e eVar) {
        long j8 = eVar.f12910c;
        if (j8 != -1) {
            this.f12923g = j8;
        }
        this.f12922f = null;
    }

    public final synchronized void b(a aVar) {
        i iVar;
        try {
            String str = this.f12922f;
            if (str != null) {
                e eVar = (e) this.f12919c.get(str);
                eVar.getClass();
                a(eVar);
            }
            Iterator it = this.f12919c.values().iterator();
            while (it.hasNext()) {
                e eVar2 = (e) it.next();
                it.remove();
                if (eVar2.f12912e && (iVar = this.f12920d) != null) {
                    iVar.d(aVar, eVar2.f12908a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V1.e c(int r18, k2.H r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.util.HashMap r3 = r0.f12919c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9d
            java.lang.Object r8 = r4.next()
            V1.e r8 = (V1.e) r8
            long r9 = r8.f12910c
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L52
            int r9 = r8.f12909b
            if (r1 != r9) goto L52
            if (r2 == 0) goto L52
            V1.f r9 = r8.f12914g
            java.util.HashMap r10 = r9.f12919c
            java.lang.String r13 = r9.f12922f
            java.lang.Object r10 = r10.get(r13)
            V1.e r10 = (V1.e) r10
            if (r10 == 0) goto L45
            long r13 = r10.f12910c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L45
            goto L4a
        L45:
            long r9 = r9.f12923g
            r13 = 1
            long r13 = r13 + r9
        L4a:
            long r9 = r2.f38906d
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 < 0) goto L52
            r8.f12910c = r9
        L52:
            k2.H r9 = r8.f12911d
            if (r2 != 0) goto L5c
            int r10 = r8.f12909b
            if (r1 != r10) goto L16
            r15 = r11
            goto L81
        L5c:
            long r13 = r2.f38906d
            if (r9 != 0) goto L6e
            boolean r10 = r2.b()
            if (r10 != 0) goto L16
            r15 = r11
            long r11 = r8.f12910c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L16
            goto L81
        L6e:
            r15 = r11
            long r10 = r9.f38906d
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 != 0) goto L16
            int r10 = r2.f38904b
            int r11 = r9.f38904b
            if (r10 != r11) goto L16
            int r10 = r2.f38905c
            int r11 = r9.f38905c
            if (r10 != r11) goto L16
        L81:
            long r10 = r8.f12910c
            int r12 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r12 == 0) goto L99
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L8c
            goto L99
        L8c:
            if (r12 != 0) goto L16
            int r10 = Q1.x.f9724a
            k2.H r10 = r5.f12911d
            if (r10 == 0) goto L16
            if (r9 == 0) goto L16
            r5 = r8
            goto L16
        L99:
            r5 = r8
            r6 = r10
            goto L16
        L9d:
            if (r5 != 0) goto Laf
            E5.q r4 = V1.f.f12915h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            V1.e r5 = new V1.e
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
        Laf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.f.c(int, k2.H):V1.e");
    }

    public final synchronized String d(N n10, H h10) {
        return c(n10.g(h10.f38903a, this.f12918b).f8050c, h10).f12908a;
    }

    public final void e(a aVar) {
        H h10;
        boolean zP = aVar.f12888b.p();
        HashMap map = this.f12919c;
        if (zP) {
            String str = this.f12922f;
            if (str != null) {
                e eVar = (e) map.get(str);
                eVar.getClass();
                a(eVar);
                return;
            }
            return;
        }
        e eVar2 = (e) map.get(this.f12922f);
        int i5 = aVar.f12889c;
        H h11 = aVar.f12890d;
        this.f12922f = c(i5, h11).f12908a;
        f(aVar);
        if (h11 == null || !h11.b()) {
            return;
        }
        long j8 = h11.f38906d;
        if (eVar2 != null && eVar2.f12910c == j8 && (h10 = eVar2.f12911d) != null && h10.f38904b == h11.f38904b && h10.f38905c == h11.f38905c) {
            return;
        }
        c(i5, new H(h11.f38903a, j8));
        this.f12920d.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b2, B:42:0x00b6, B:43:0x00bd, B:45:0x00c7, B:47:0x00cb, B:49:0x00d8, B:52:0x00df), top: B:57:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f(V1.a r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.f.f(V1.a):void");
    }

    public final synchronized void g(a aVar, int i5) {
        try {
            this.f12920d.getClass();
            boolean z2 = i5 == 0;
            Iterator it = this.f12919c.values().iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (eVar.a(aVar)) {
                    it.remove();
                    if (eVar.f12912e) {
                        boolean zEquals = eVar.f12908a.equals(this.f12922f);
                        if (z2 && zEquals) {
                            boolean z10 = eVar.f12913f;
                        }
                        if (zEquals) {
                            a(eVar);
                        }
                        this.f12920d.d(aVar, eVar.f12908a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
