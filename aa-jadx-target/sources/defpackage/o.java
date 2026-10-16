package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class o {
    final defpackage.p a;
    defpackage.o b;
    public defpackage.n f;
    final int g;
    public int c = 0;
    int d = -1;
    public int h = 1;
    public int i = 1;
    public int e = 0;

    public o(defpackage.p pVar, int i) {
        this.a = pVar;
        this.g = i;
    }

    private final java.lang.String f(java.util.HashSet hashSet) {
        if (!hashSet.add(this)) {
            return "<-";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("null:");
        sb.append(defpackage.a.R(this.g));
        defpackage.o oVar = this.b;
        sb.append(oVar != null ? " connected to ".concat(oVar.f(hashSet)) : "");
        return sb.toString();
    }

    public final int a() {
        defpackage.o oVar;
        if (this.a.K == 8) {
            return 0;
        }
        int i = this.d;
        return (i < 0 || (oVar = this.b) == null || oVar.a.K != 8) ? this.c : i;
    }

    public final void b() {
        this.b = null;
        this.c = 0;
        this.d = -1;
        this.h = 2;
        this.e = 0;
        this.i = 1;
    }

    public final boolean c() {
        return this.b != null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0068  */
    /* JADX WARN: Code duplicated, block: B:45:0x006b  */
    /* JADX WARN: Code duplicated, block: B:46:0x006d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0074  */
    /* JADX WARN: Code duplicated, block: B:52:0x0079  */
    /* JADX WARN: Code duplicated, block: B:53:0x007b  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public final void d(defpackage.o oVar, int i, int i2, int i3, int i4, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (oVar == null) {
            this.b = null;
            this.c = 0;
            this.d = -1;
            this.h = 1;
            this.e = 2;
            return;
        }
        if (!z) {
            int i5 = oVar.g;
            int i6 = this.g;
            if (i5 != i6) {
                int i7 = i6 - 1;
                if (i7 == 1) {
                    if (i5 != 2) {
                        z2 = true;
                    } else if (i5 == 4) {
                        z2 = true;
                        i5 = 4;
                    } else {
                        z2 = false;
                    }
                    if (oVar.a instanceof defpackage.r) {
                        z4 = z2;
                    } else if (!z2 && i5 != 8) {
                        z4 = false;
                    }
                    if (!z4) {
                        return;
                    }
                } else {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (i5 != 2) {
                                z2 = true;
                            } else if (i5 == 4) {
                                z2 = true;
                                i5 = 4;
                            } else {
                                z2 = false;
                            }
                            if (oVar.a instanceof defpackage.r) {
                                z4 = z2;
                            } else if (!z2) {
                                z4 = false;
                            }
                            if (!z4) {
                                return;
                            }
                        } else if (i7 != 4) {
                            if (i7 != 6 || i5 == 6 || i5 == 8 || i5 == 9) {
                                return;
                            }
                        }
                    }
                    if (i5 == 3) {
                        z3 = true;
                    } else if (i5 == 5) {
                        i5 = 5;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!(oVar.a instanceof defpackage.r)) {
                        z4 = z3;
                    } else if (!z3 && i5 != 9) {
                        z4 = false;
                    }
                    if (!z4) {
                        return;
                    }
                }
            } else {
                if (i6 == 7) {
                    return;
                }
                if (i6 == 6 && (!oVar.a.r() || !this.a.r())) {
                    return;
                }
            }
        }
        this.b = oVar;
        if (i > 0) {
            this.c = i;
        } else {
            this.c = 0;
        }
        this.d = i2;
        this.h = i3;
        this.e = i4;
    }

    public final void e() {
        defpackage.n nVar = this.f;
        if (nVar == null) {
            this.f = new defpackage.n(1);
        } else {
            nVar.b();
        }
    }

    public final java.lang.String toString() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("null:");
        sb.append(defpackage.a.R(this.g));
        defpackage.o oVar = this.b;
        sb.append(oVar != null ? " connected to ".concat(oVar.f(hashSet)) : "");
        return sb.toString();
    }
}
