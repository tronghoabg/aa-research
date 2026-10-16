package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bzl {
    public boolean a;
    public int c;
    public int d;
    public int i;
    public kgx k;
    private final bvv l;
    public final vtn j = new vtn((char[]) null);
    public boolean b = true;
    public final ArrayList e = new ArrayList();
    public int f = -1;
    public int g = -1;
    public int h = -1;

    public bzl(bvv bvvVar, kgx kgxVar) {
        this.l = bvvVar;
        this.k = kgxVar;
    }

    public final bzf a() {
        return this.l.m;
    }

    public final void b() {
        if (this.a) {
            i(false);
            i(false);
            this.k.n();
            this.a = false;
        }
    }

    public final void c(Object obj) {
        h();
        this.e.add(obj);
    }

    public final void d(int i) {
        this.c += i - a().f;
    }

    public final void e() {
        h();
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            this.d++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void f() {
        int i = this.d;
        if (i > 0) {
            cbc cbcVar = (cbc) this.k.a;
            cbcVar.b(cav.a);
            cbcVar.c[cbcVar.d - cbcVar.a[cbcVar.b - 1].b] = i;
            this.d = 0;
        }
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        kgx kgxVar = this.k;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        if (size != 0) {
            cbc cbcVar2 = (cbc) kgxVar.a;
            cbcVar2.b(bzu.a);
            cbb.a(cbcVar2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void g() {
        i(false);
        j();
    }

    public final void h() {
        int i = this.i;
        if (i > 0) {
            int i2 = this.f;
            if (i2 >= 0) {
                f();
                cbc cbcVar = (cbc) this.k.a;
                cbcVar.b(cal.a);
                int i3 = cbcVar.d - cbcVar.a[cbcVar.b - 1].b;
                int[] iArr = cbcVar.c;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.f = -1;
            } else {
                int i4 = this.h;
                int i5 = this.g;
                f();
                cbc cbcVar2 = (cbc) this.k.a;
                cbcVar2.b(caf.a);
                int i6 = cbcVar2.d - cbcVar2.a[cbcVar2.b - 1].b;
                int[] iArr2 = cbcVar2.c;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.g = -1;
                this.h = -1;
            }
            this.i = 0;
        }
    }

    public final void i(boolean z) {
        int i = z ? a().h : a().f;
        int i2 = i - this.c;
        if (i2 < 0) {
            buz.b("Tried to seek backward");
        }
        if (i2 > 0) {
            cbc cbcVar = (cbc) this.k.a;
            cbcVar.b(bzn.a);
            cbcVar.c[cbcVar.d - cbcVar.a[cbcVar.b - 1].b] = i2;
            this.c = i;
        }
    }

    public final void j() {
        if (a().c > 0) {
            bzf bzfVarA = a();
            int i = bzfVarA.h;
            vtn vtnVar = this.j;
            if (vtnVar.b(-2) != i) {
                if (!this.a && this.b) {
                    i(false);
                    ((cbc) this.k.a).b(caa.a);
                    this.a = true;
                }
                if (i > 0) {
                    bzb bzbVarG = bzfVarA.g(i);
                    vtnVar.e(i);
                    i(false);
                    cbc cbcVar = (cbc) this.k.a;
                    cbcVar.b(bzz.a);
                    cbb.a(cbcVar, 0, bzbVarG);
                    this.a = true;
                }
            }
        }
    }

    public final void k(int i, int i2) {
        if (i2 > 0) {
            if (i < 0) {
                buz.b(a.bp(i, "Invalid remove index "));
            }
            if (this.f == i) {
                this.i += i2;
                return;
            }
            h();
            this.f = i;
            this.i = i2;
        }
    }

    public final void l() {
        ((cbc) this.k.a).b(cao.a);
    }

    public final void m(kgx kgxVar, ccu ccuVar) {
        kgx kgxVar2 = this.k;
        if (kgxVar.l()) {
            cbc cbcVar = (cbc) kgxVar2.a;
            cbcVar.b(bzp.a);
            cbb.b(cbcVar, 0, kgxVar, 1, ccuVar);
        }
    }
}
