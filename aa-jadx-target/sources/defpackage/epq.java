package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class epq {
    public java.lang.Object a;
    public java.lang.Object b;
    public final java.lang.Object c;

    public epq(byte[] bArr) {
        long[] jArr = defpackage.aav.a;
        this.c = new defpackage.aau(6);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map$Entry] */
    public final java.util.Map.Entry a() {
        ?? r1 = this.a;
        if (r1 != 0) {
            return r1;
        }
        throw new java.util.NoSuchElementException("Collection is empty.");
    }

    public final boolean b(java.lang.Object obj) {
        obj.getClass();
        return defpackage.aau.f((defpackage.aau) this.c, obj);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    public final boolean c(int i) throws afbj {
        java.lang.Object obj;
        if (i == 7 || i == 2 || i == 6 || i == 5 || i == 3 || i == 4) {
            e();
        } else if (i != 1 && i != 0) {
            throw new java.lang.IllegalStateException("invalid ImeAction");
        }
        if (i == 6) {
            d().i(1, true);
            return true;
        }
        if (i == 5) {
            d().i(2, true);
            return true;
        }
        if (i != 7 || (obj = this.c) == null) {
            return false;
        }
        ((defpackage.sr) obj).q();
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    public final defpackage.cik d() throws afbj {
        java.lang.Object obj = this.a;
        if (obj != null) {
            return (defpackage.cik) obj;
        }
        defpackage.afga.d("focusManager");
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    public final void e() throws afbj {
        if (this.b != null) {
            return;
        }
        defpackage.afga.d("keyboardActions");
    }

    public final int f() {
        if (i().a.isEmpty()) {
            return -1;
        }
        return (int) defpackage.afqt.h(((long) ((defpackage.bba) defpackage.afga.az(i().a)).a) - ((long) i().h), 0L);
    }

    public final int g() {
        if (i().a.isEmpty()) {
            return -1;
        }
        return (int) defpackage.afqt.i(((long) ((defpackage.bba) defpackage.afga.aE(i().a)).a) + ((long) i().h), ((long) h()) - 1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [afer, java.lang.Object] */
    public final int h() {
        return ((java.lang.Number) this.c.invoke()).intValue();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    public final defpackage.bbo i() throws afbj {
        java.lang.Object obj = this.a;
        if (obj != null) {
            return (defpackage.bbo) obj;
        }
        defpackage.afga.d("layoutInfo");
        return null;
    }

    public final void j(int[] iArr) {
        iArr[0] = f();
    }

    public final void k(int[] iArr) {
        iArr[0] = g();
    }

    public final void l(int[] iArr) {
        if (i().a.isEmpty()) {
            iArr[0] = 0;
        } else {
            iArr[0] = java.lang.Math.abs(((((defpackage.bba) defpackage.afga.aE(i().a)).h + i().b) + i().c) - i().g);
        }
    }

    public final void m(int[] iArr) {
        if (i().a.isEmpty()) {
            iArr[0] = 0;
        } else {
            iArr[0] = java.lang.Math.abs(defpackage.afqt.f(((defpackage.bba) defpackage.afga.az(i().a)).h + (-i().f), 0));
        }
    }

    public final boolean n() {
        return !i().a.isEmpty();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    public final java.util.List o(int i, defpackage.affc affcVar) throws afbj {
        long j = i().s;
        java.lang.Object obj = this.b;
        if (obj == null) {
            defpackage.afga.d("state");
            obj = null;
        }
        return defpackage.afga.aa(((defpackage.azy) obj).a(i, j, true, new defpackage.ajy(affcVar, this, 17)));
    }

    public final void p() {
        defpackage.dlo dloVar = i().r;
    }

    public final void q() {
        defpackage.afw.V(i());
    }

    public epq() {
        this.c = new defpackage.aau(6);
    }

    public epq(java.lang.Object obj) {
        this.c = obj;
    }
}
