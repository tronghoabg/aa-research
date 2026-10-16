package e.a.d;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class jt {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f47255a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final e.a.dw[] f47256b;

    static {
        new jt(new e.a.dw[0]);
    }

    jt(e.a.dw[] dwVarArr) {
        this.f47256b = dwVarArr;
    }

    public static jt i(e.a.p[] pVarArr) {
        jt jtVar = new jt(pVarArr);
        for (e.a.p pVar : pVarArr) {
        }
        return jtVar;
    }

    private static /* synthetic */ void n(jt jtVar) {
        int i2 = 0;
        while (true) {
            e.a.dw[] dwVarArr = jtVar.f47256b;
            if (i2 >= dwVarArr.length) {
                return;
            }
            i2++;
        }
    }

    private static /* synthetic */ void o(jt jtVar) {
        int i2 = 0;
        while (true) {
            e.a.dw[] dwVarArr = jtVar.f47256b;
            if (i2 >= dwVarArr.length) {
                return;
            }
            e.a.dw dwVar = dwVarArr[i2];
            i2++;
        }
    }

    public final void a() {
        n(this);
    }

    public final void b(long j2) {
        int i2 = 0;
        while (true) {
            e.a.dw[] dwVarArr = this.f47256b;
            if (i2 >= dwVarArr.length) {
                return;
            }
            dwVarArr[i2].d(j2);
            i2++;
        }
    }

    public final void c() {
        n(this);
    }

    public final void d() {
        n(this);
    }

    public final void e() {
        o(this);
    }

    public final void f() {
        o(this);
    }

    public final void g() {
        o(this);
    }

    public final void h() {
        o(this);
    }

    public final void j() {
        o(this);
    }

    public final void k() {
        o(this);
    }

    public final void l() {
        o(this);
    }

    public final void m() {
        if (this.f47255a.compareAndSet(false, true)) {
            for (e.a.dw dwVar : this.f47256b) {
            }
        }
    }
}
