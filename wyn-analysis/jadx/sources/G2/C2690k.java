package g2;

import Va.X7;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.util.TreeSet;
import od.a2;
import uc.C4288y;

/* renamed from: g2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2690k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f35615a;

    /* renamed from: b, reason: collision with root package name */
    public int f35616b;

    /* renamed from: c, reason: collision with root package name */
    public int f35617c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f35618d;

    public C2690k(mc.b bVar) {
        X7 x72 = new X7(bVar, C4288y.f46771b, (Object) null, "flutter/lifecycle");
        this.f35616b = 0;
        this.f35617c = 0;
        this.f35615a = true;
        this.f35618d = x72;
    }

    public static int b(int i5, int i10) {
        int iMin;
        int i11 = i5 - i10;
        return (Math.abs(i11) <= 1000 || (iMin = (Math.min(i5, i10) - Math.max(i5, i10)) + Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 1000) ? i11 : i5 < i10 ? iMin : -iMin;
    }

    public synchronized void a(C2689j c2689j) {
        this.f35616b = c2689j.f35613a.f35609c;
        ((TreeSet) this.f35618d).add(c2689j);
    }

    public synchronized void c(C2688i c2688i, long j8) {
        if (((TreeSet) this.f35618d).size() >= 5000) {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
        int i5 = c2688i.f35609c;
        if (!this.f35615a) {
            e();
            this.f35617c = A6.c.I(i5 - 1);
            this.f35615a = true;
            a(new C2689j(c2688i, j8));
            return;
        }
        if (Math.abs(b(i5, C2688i.a(this.f35616b))) < 1000) {
            if (b(i5, this.f35617c) > 0) {
                a(new C2689j(c2688i, j8));
            }
        } else {
            this.f35617c = A6.c.I(i5 - 1);
            ((TreeSet) this.f35618d).clear();
            a(new C2689j(c2688i, j8));
        }
    }

    public synchronized C2688i d(long j8) {
        if (((TreeSet) this.f35618d).isEmpty()) {
            return null;
        }
        C2689j c2689j = (C2689j) ((TreeSet) this.f35618d).first();
        int i5 = c2689j.f35613a.f35609c;
        if (i5 != C2688i.a(this.f35617c) && j8 < c2689j.f35614b) {
            return null;
        }
        ((TreeSet) this.f35618d).pollFirst();
        this.f35617c = i5;
        return c2689j.f35613a;
    }

    public synchronized void e() {
        ((TreeSet) this.f35618d).clear();
        this.f35615a = false;
        this.f35617c = -1;
        this.f35616b = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(int r5, boolean r6) {
        /*
            r4 = this;
            int r0 = r4.f35616b
            if (r0 != r5) goto L9
            boolean r1 = r4.f35615a
            if (r6 != r1) goto L9
            goto L32
        L9:
            if (r5 != 0) goto L10
            if (r0 != 0) goto L10
            r4.f35615a = r6
            return
        L10:
            int r0 = A.AbstractC0213f.f(r5)
            if (r0 == 0) goto L29
            r1 = 1
            r2 = 3
            r3 = 2
            if (r0 == r1) goto L24
            if (r0 == r3) goto L29
            if (r0 == r2) goto L29
            r1 = 4
            if (r0 == r1) goto L29
            r0 = 0
            goto L2a
        L24:
            if (r6 == 0) goto L27
            r2 = r3
        L27:
            r0 = r2
            goto L2a
        L29:
            r0 = r5
        L2a:
            r4.f35616b = r5
            r4.f35615a = r6
            int r5 = r4.f35617c
            if (r0 != r5) goto L33
        L32:
            return
        L33:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "AppLifecycleState."
            r5.<init>(r6)
            r6 = 1
            if (r0 == r6) goto L57
            r6 = 2
            if (r0 == r6) goto L54
            r6 = 3
            if (r0 == r6) goto L51
            r6 = 4
            if (r0 == r6) goto L4e
            r6 = 5
            if (r0 != r6) goto L4c
            java.lang.String r6 = "PAUSED"
            goto L59
        L4c:
            r5 = 0
            throw r5
        L4e:
            java.lang.String r6 = "HIDDEN"
            goto L59
        L51:
            java.lang.String r6 = "INACTIVE"
            goto L59
        L54:
            java.lang.String r6 = "RESUMED"
            goto L59
        L57:
            java.lang.String r6 = "DETACHED"
        L59:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r1)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r6 = r4.f35618d
            Va.X7 r6 = (Va.X7) r6
            r1 = 0
            r6.m(r5, r1)
            r4.f35617c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.C2690k.f(int, boolean):void");
    }

    public C2690k() {
        this.f35618d = new TreeSet(new A0.f(14));
        e();
    }

    public C2690k(boolean z2, int i5, int i10, a2 a2Var) {
        this.f35615a = z2;
        this.f35616b = i5;
        this.f35617c = i10;
        this.f35618d = a2Var;
    }
}
