package F5;

import E5.C0467q;
import E5.H0;
import E5.I0;
import E5.J0;
import f6.C2613z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: g, reason: collision with root package name */
    public static final C0467q f3907g = new C0467q(1);

    /* renamed from: h, reason: collision with root package name */
    public static final Random f3908h = new Random();

    /* renamed from: d, reason: collision with root package name */
    public j f3912d;

    /* renamed from: f, reason: collision with root package name */
    public String f3914f;

    /* renamed from: a, reason: collision with root package name */
    public final I0 f3909a = new I0();

    /* renamed from: b, reason: collision with root package name */
    public final H0 f3910b = new H0();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3911c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public J0 f3913e = J0.f3127a;

    public final synchronized void a(a aVar) {
        j jVar;
        this.f3914f = null;
        Iterator it = this.f3911c.values().iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            it.remove();
            if (gVar.f3904e && (jVar = this.f3912d) != null) {
                jVar.d(aVar, gVar.f3900a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final F5.g b(int r18, f6.C2613z r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.util.HashMap r3 = r0.f3911c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L7d
            java.lang.Object r8 = r4.next()
            F5.g r8 = (F5.g) r8
            long r9 = r8.f3902c
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L34
            int r9 = r8.f3901b
            if (r1 != r9) goto L34
            if (r2 == 0) goto L34
            long r9 = r2.f35115d
            r8.f3902c = r9
        L34:
            f6.z r9 = r8.f3903d
            if (r2 != 0) goto L3e
            int r10 = r8.f3901b
            if (r1 != r10) goto L16
            r15 = r11
            goto L63
        L3e:
            long r13 = r2.f35115d
            if (r9 != 0) goto L50
            boolean r10 = r2.a()
            if (r10 != 0) goto L16
            r15 = r11
            long r11 = r8.f3902c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L16
            goto L63
        L50:
            r15 = r11
            long r10 = r9.f35115d
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 != 0) goto L16
            int r10 = r2.f35113b
            int r11 = r9.f35113b
            if (r10 != r11) goto L16
            int r10 = r2.f35114c
            int r11 = r9.f35114c
            if (r10 != r11) goto L16
        L63:
            long r10 = r8.f3902c
            int r12 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r12 == 0) goto L7a
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L6e
            goto L7a
        L6e:
            if (r12 != 0) goto L16
            int r10 = u6.v.f46721a
            f6.z r10 = r5.f3903d
            if (r10 == 0) goto L16
            if (r9 == 0) goto L16
            r5 = r8
            goto L16
        L7a:
            r5 = r8
            r6 = r10
            goto L16
        L7d:
            if (r5 != 0) goto L8f
            E5.q r4 = F5.h.f3907g
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            F5.g r5 = new F5.g
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
        L8f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.h.b(int, f6.z):F5.g");
    }

    public final synchronized String c(J0 j02, C2613z c2613z) {
        return b(j02.g(c2613z.f35112a, this.f3910b).f3041c, c2613z).f3900a;
    }

    public final void d(a aVar) {
        C2613z c2613z;
        if (aVar.f3874b.p()) {
            this.f3914f = null;
            return;
        }
        g gVar = (g) this.f3911c.get(this.f3914f);
        int i5 = aVar.f3875c;
        C2613z c2613z2 = aVar.f3876d;
        this.f3914f = b(i5, c2613z2).f3900a;
        e(aVar);
        if (c2613z2 == null || !c2613z2.a()) {
            return;
        }
        long j8 = c2613z2.f35115d;
        if (gVar != null && gVar.f3902c == j8 && (c2613z = gVar.f3903d) != null && c2613z.f35113b == c2613z2.f35113b && c2613z.f35114c == c2613z2.f35114c) {
            return;
        }
        b(i5, new C2613z(c2613z2.f35112a, j8));
        this.f3912d.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r1.f35115d < r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(F5.a r8) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.h.e(F5.a):void");
    }

    public final synchronized void f(a aVar, int i5) {
        try {
            this.f3912d.getClass();
            boolean z2 = i5 == 0;
            Iterator it = this.f3911c.values().iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar.a(aVar)) {
                    it.remove();
                    if (gVar.f3904e) {
                        boolean zEquals = gVar.f3900a.equals(this.f3914f);
                        if (z2 && zEquals) {
                            boolean z10 = gVar.f3905f;
                        }
                        if (zEquals) {
                            this.f3914f = null;
                        }
                        this.f3912d.d(aVar, gVar.f3900a);
                    }
                }
            }
            d(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
