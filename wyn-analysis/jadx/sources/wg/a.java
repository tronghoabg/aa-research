package wg;

import java.io.Serializable;
import java.util.concurrent.LinkedBlockingQueue;
import pd.f;
import xg.e;

/* loaded from: classes5.dex */
public final class a implements vg.b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public String f47484a;

    /* renamed from: b, reason: collision with root package name */
    public e f47485b;

    /* renamed from: c, reason: collision with root package name */
    public LinkedBlockingQueue f47486c;

    @Override // vg.b
    public final boolean a() {
        return true;
    }

    @Override // vg.b
    public final boolean b() {
        return true;
    }

    @Override // vg.b
    public final void c(String str, Object... objArr) {
        x(2, str, objArr);
    }

    @Override // vg.b
    public final boolean d() {
        return true;
    }

    @Override // vg.b
    public final void debug(String str) {
        y(4, null);
    }

    @Override // vg.b
    public final boolean e() {
        return true;
    }

    @Override // vg.b
    public final void error(String str, Throwable th) {
        y(1, null);
    }

    @Override // vg.b
    public final void f(String str, Object obj, Serializable serializable) {
        w(5, str, obj, serializable);
    }

    @Override // vg.b
    public final void g(String str, Object... objArr) {
        x(4, str, objArr);
    }

    @Override // vg.b
    public final String getName() {
        return this.f47484a;
    }

    @Override // vg.b
    public final void h(String str, Throwable th) {
        y(2, null);
    }

    @Override // vg.b
    public final void i(Object obj, String str) {
        w(1, "Error assigning value '{}' to '{}'", obj, str);
    }

    @Override // vg.b
    public final void info(String str) {
        y(3, null);
    }

    @Override // vg.b
    public final void j(Object obj, String str, Object obj2) {
        w(2, str, obj, obj2);
    }

    @Override // vg.b
    public final void k(Integer num, String str) {
        y(3, new Object[]{num});
    }

    @Override // vg.b
    public final void l(String str, Serializable serializable) {
        y(5, new Object[]{serializable});
    }

    @Override // vg.b
    public final void m(String str, Object obj, Serializable serializable) {
        w(3, str, obj, serializable);
    }

    @Override // vg.b
    public final boolean n() {
        return true;
    }

    @Override // vg.b
    public final void o(String str, Object obj) {
        y(1, new Object[]{obj});
    }

    @Override // vg.b
    public final void p(Object... objArr) {
        x(1, "pipesClientId={} didn't receive ready byte from server within StartupTimeoutMillis {}; ms elapsed {}; did read >{}<", objArr);
    }

    @Override // vg.b
    public final void q(Integer num, String str) {
        y(2, new Object[]{num});
    }

    @Override // vg.b
    public final void r(String str, Throwable th) {
        y(4, null);
    }

    @Override // vg.b
    public final void s(String str) {
        y(5, null);
    }

    @Override // vg.b
    public final /* synthetic */ boolean t(int i5) {
        return f.a(this, i5);
    }

    @Override // vg.b
    public final void u(Object obj, String str) {
        y(4, new Object[]{obj});
    }

    @Override // vg.b
    public final void v(String str, Object obj, Serializable serializable) {
        w(4, str, obj, serializable);
    }

    public final void w(int i5, String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            y(i5, new Object[]{obj});
        } else {
            y(i5, new Object[]{obj, obj2});
        }
    }

    @Override // vg.b
    public final void warn(String str) {
        y(2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(int r3, java.lang.String r4, java.lang.Object[] r5) {
        /*
            r2 = this;
            int r4 = r5.length
            if (r4 != 0) goto L4
            goto L10
        L4:
            int r4 = r5.length
            int r4 = r4 + (-1)
            r4 = r5[r4]
            boolean r0 = r4 instanceof java.lang.Throwable
            if (r0 == 0) goto L10
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            goto L11
        L10:
            r4 = 0
        L11:
            if (r4 == 0) goto L2d
            int r4 = r5.length
            if (r4 == 0) goto L25
            int r4 = r5.length
            int r4 = r4 + (-1)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            if (r4 <= 0) goto L21
            r1 = 0
            java.lang.System.arraycopy(r5, r1, r0, r1, r4)
        L21:
            r2.y(r3, r0)
            return
        L25:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "non-sensical empty or null argument array"
            r3.<init>(r4)
            throw r3
        L2d:
            r2.y(r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.a.x(int, java.lang.String, java.lang.Object[]):void");
    }

    public final void y(int i5, Object[] objArr) {
        c cVar = new c();
        System.currentTimeMillis();
        cVar.f47487a = i5;
        cVar.f47488b = this.f47485b;
        Thread.currentThread().getName();
        cVar.f47489c = objArr;
        this.f47486c.add(cVar);
    }
}
