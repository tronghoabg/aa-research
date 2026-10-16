package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bzr {
    public boolean a;
    public int c;
    public int d;
    public int i;
    public defpackage.khb k;
    private final defpackage.bwc l;
    public final defpackage.vuj j = new defpackage.vuj((char[]) null);
    public boolean b = true;
    public final java.util.ArrayList e = new java.util.ArrayList();
    public int f = -1;
    public int g = -1;
    public int h = -1;

    public bzr(defpackage.bwc bwcVar, defpackage.khb khbVar) {
        this.l = bwcVar;
        this.k = khbVar;
    }

    public final defpackage.bzl a() {
        return this.l.m;
    }

    public final void b() {
        if (this.a) {
            i(false);
            i(false);
            this.k.j();
            this.a = false;
        }
    }

    public final void c(java.lang.Object obj) {
        h();
        this.e.add(obj);
    }

    public final void d(int i) {
        this.c += i - a().f;
    }

    public final void e() {
        h();
        java.util.ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            this.d++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void f() {
        int i = this.d;
        if (i > 0) {
            defpackage.cbi cbiVar = (defpackage.cbi) this.k.a;
            cbiVar.b(defpackage.cbb.a);
            cbiVar.c[cbiVar.d - cbiVar.a[cbiVar.b - 1].b] = i;
            this.d = 0;
        }
        java.util.ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        defpackage.khb khbVar = this.k;
        int size = arrayList.size();
        java.lang.Object[] objArr = new java.lang.Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        if (size != 0) {
            defpackage.cbi cbiVar2 = (defpackage.cbi) khbVar.a;
            cbiVar2.b(defpackage.caa.a);
            defpackage.cbh.a(cbiVar2, 0, objArr);
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
                defpackage.cbi cbiVar = (defpackage.cbi) this.k.a;
                cbiVar.b(defpackage.car.a);
                int i3 = cbiVar.d - cbiVar.a[cbiVar.b - 1].b;
                int[] iArr = cbiVar.c;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.f = -1;
            } else {
                int i4 = this.h;
                int i5 = this.g;
                f();
                defpackage.cbi cbiVar2 = (defpackage.cbi) this.k.a;
                cbiVar2.b(defpackage.cal.a);
                int i6 = cbiVar2.d - cbiVar2.a[cbiVar2.b - 1].b;
                int[] iArr2 = cbiVar2.c;
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
            defpackage.bvg.b("Tried to seek backward");
        }
        if (i2 > 0) {
            defpackage.cbi cbiVar = (defpackage.cbi) this.k.a;
            cbiVar.b(defpackage.bzt.a);
            cbiVar.c[cbiVar.d - cbiVar.a[cbiVar.b - 1].b] = i2;
            this.c = i;
        }
    }

    public final void j() {
        if (a().c > 0) {
            defpackage.bzl bzlVarA = a();
            int i = bzlVarA.h;
            defpackage.vuj vujVar = this.j;
            if (vujVar.b(-2) != i) {
                if (!this.a && this.b) {
                    i(false);
                    ((defpackage.cbi) this.k.a).b(defpackage.cag.a);
                    this.a = true;
                }
                if (i > 0) {
                    defpackage.bzh bzhVarG = bzlVarA.g(i);
                    vujVar.e(i);
                    i(false);
                    defpackage.cbi cbiVar = (defpackage.cbi) this.k.a;
                    cbiVar.b(defpackage.caf.a);
                    defpackage.cbh.a(cbiVar, 0, bzhVarG);
                    this.a = true;
                }
            }
        }
    }

    public final void k(int i, int i2) {
        if (i2 > 0) {
            if (i < 0) {
                defpackage.bvg.b(defpackage.a.bo(i, "Invalid remove index "));
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
        ((defpackage.cbi) this.k.a).b(defpackage.cau.a);
    }

    public final void m(defpackage.khb khbVar, defpackage.cda cdaVar) {
        defpackage.khb khbVar2 = this.k;
        if (khbVar.h()) {
            defpackage.cbi cbiVar = (defpackage.cbi) khbVar2.a;
            cbiVar.b(defpackage.bzv.a);
            defpackage.cbh.b(cbiVar, 0, khbVar, 1, cdaVar);
        }
    }
}
