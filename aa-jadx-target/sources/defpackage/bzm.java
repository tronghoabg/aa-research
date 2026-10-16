package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bzm extends defpackage.bye implements java.lang.Iterable, defpackage.cfk, defpackage.afhc {
    public int b;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public java.util.HashMap i;
    public defpackage.zo j;
    public int[] a = new int[0];
    public java.lang.Object[] c = new java.lang.Object[0];
    public java.util.ArrayList h = new java.util.ArrayList();

    public static final void g(defpackage.bzp bzpVar, int i) {
        while (bzpVar.q >= 0 && bzpVar.p <= i) {
            bzpVar.I();
            bzpVar.V();
        }
    }

    @Override // defpackage.bye
    public final void a() {
        this.j = new defpackage.zo(6);
    }

    @Override // defpackage.bye
    public final void b() {
        this.i = new java.util.HashMap();
    }

    @Override // defpackage.bye
    public final boolean c() {
        return this.b == 0;
    }

    public final int d(defpackage.bzh bzhVar) {
        if (this.f) {
            defpackage.bvg.b("Use active SlotWriter to determine anchor location instead");
        }
        if (!bzhVar.a()) {
            defpackage.bxi.a("Anchor refers to a group that was removed");
        }
        return bzhVar.a;
    }

    public final defpackage.bzl e() {
        if (this.f) {
            throw new java.lang.IllegalStateException("Cannot read while a writer is pending");
        }
        this.e++;
        return new defpackage.bzl(this);
    }

    public final defpackage.bzp f() {
        if (this.f) {
            defpackage.bvg.b("Cannot start a writer when another writer is pending");
        }
        if (this.e > 0) {
            defpackage.bvg.b("Cannot start a writer when a reader is pending");
        }
        this.f = true;
        this.g++;
        return new defpackage.bzp(this);
    }

    public final boolean h(defpackage.bzh bzhVar) {
        int iC;
        return bzhVar.a() && (iC = defpackage.bzo.c(this.h, bzhVar.a, this.b)) >= 0 && defpackage.afga.f(this.h.get(iC), bzhVar);
    }

    public final void i(int[] iArr, int i, java.lang.Object[] objArr, int i2, java.util.ArrayList arrayList, java.util.HashMap map, defpackage.zo zoVar) {
        this.a = iArr;
        this.b = i;
        this.c = objArr;
        this.d = i2;
        this.h = arrayList;
        this.i = map;
        this.j = zoVar;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.bzi(this, 0, this.b);
    }

    public final defpackage.bzd j(int i) {
        int i2;
        java.util.HashMap map = this.i;
        if (map != null) {
            if (this.f) {
                defpackage.bvg.b("use active SlotWriter to crate an anchor for location instead");
            }
            defpackage.bzh bzhVarE = (i < 0 || i >= (i2 = this.b)) ? null : defpackage.bzo.e(this.h, i, i2);
            if (bzhVarE != null) {
                return (defpackage.bzd) map.get(bzhVarE);
            }
        }
        return null;
    }
}
