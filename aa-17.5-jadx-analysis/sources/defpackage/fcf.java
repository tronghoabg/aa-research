package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
final class fcf extends fcg {
    private final int a;

    public fcf(fbl fblVar, String str, int i) {
        super(fblVar, str);
        this.a = i;
    }

    @Override // defpackage.fbk
    public final int a() {
        n();
        return 0;
    }

    @Override // defpackage.fbk
    public final long b(int i) {
        n();
        dan.k(21, "no row");
        throw new aezp();
    }

    @Override // defpackage.fbk
    public final String c(int i) {
        n();
        dan.k(21, "no row");
        throw new aezp();
    }

    @Override // defpackage.fbk, java.lang.AutoCloseable
    public final void close() {
        o();
    }

    @Override // defpackage.fbk
    public final String d(int i) {
        n();
        dan.k(21, "no row");
        throw new aezp();
    }

    @Override // defpackage.fbk
    public final void e(int i, byte[] bArr) {
        bArr.getClass();
        n();
        dan.k(25, "column index out of range");
        throw new aezp();
    }

    @Override // defpackage.fbk
    public final void f(int i, long j) {
        n();
        dan.k(25, "column index out of range");
        throw new aezp();
    }

    @Override // defpackage.fbk
    public final void g(int i) {
        n();
        dan.k(25, "column index out of range");
        throw new aezp();
    }

    @Override // defpackage.fbk
    public final void h(int i, String str) {
        str.getClass();
        n();
        dan.k(25, "column index out of range");
        throw new aezp();
    }

    @Override // defpackage.fbk
    public final void i() {
        n();
    }

    @Override // defpackage.fbk
    public final boolean j(int i) {
        n();
        dan.k(21, "no row");
        throw new aezp();
    }

    @Override // defpackage.fbk
    public final boolean k() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = this.a - 1;
        if (i == 0) {
            fbl fblVar = this.f;
            fblVar.f();
            fblVar.d();
        } else if (i == 1) {
            this.f.d();
        } else if (i == 2) {
            this.f.b();
        } else if (i != 3) {
            fbl fblVar2 = this.f;
            if (dsq.e() == null || dsq.f() == null) {
                ((fbs) fblVar2).b();
            } else {
                Method methodE = dsq.e();
                methodE.getClass();
                Method methodF = dsq.f();
                methodF.getClass();
                Object objInvoke = methodF.invoke(((fbs) fblVar2).e, null);
                if (objInvoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                methodE.invoke(objInvoke, 0, null, 0, null);
            }
        } else {
            this.f.c();
        }
        return false;
    }

    @Override // defpackage.fbk
    public final byte[] l(int i) {
        n();
        dan.k(21, "no row");
        throw new aezp();
    }
}
