package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class drr implements defpackage.drh {
    public int c;
    public defpackage.dqv d;
    protected int j;
    defpackage.ss l;
    public final defpackage.drk e = new defpackage.drk(this);
    public int f = 0;
    public boolean g = false;
    public final defpackage.drj h = new defpackage.drj(this);
    public final defpackage.drj i = new defpackage.drj(this);
    protected int k = 1;

    public drr(defpackage.dqv dqvVar) {
        this.d = dqvVar;
    }

    protected static final void j(defpackage.drj drjVar, defpackage.drj drjVar2, int i) {
        drjVar.k.add(drjVar2);
        drjVar.e = i;
        drjVar2.j.add(drjVar);
    }

    protected static final defpackage.drj k(defpackage.dqu dquVar) {
        defpackage.dqu dquVar2 = dquVar.e;
        if (dquVar2 == null) {
            return null;
        }
        int i = dquVar2.i;
        defpackage.dqv dqvVar = dquVar2.d;
        int i2 = i - 1;
        if (i2 == 1) {
            return dqvVar.o.h;
        }
        if (i2 == 2) {
            return dqvVar.p.h;
        }
        if (i2 == 3) {
            return dqvVar.o.i;
        }
        if (i2 == 4) {
            return dqvVar.p.i;
        }
        if (i2 != 5) {
            return null;
        }
        return dqvVar.p.a;
    }

    protected static final defpackage.drj l(defpackage.dqu dquVar, int i) {
        defpackage.dqu dquVar2 = dquVar.e;
        if (dquVar2 == null) {
            return null;
        }
        defpackage.dqv dqvVar = dquVar2.d;
        defpackage.drr drrVar = i == 0 ? dqvVar.o : dqvVar.p;
        int i2 = dquVar2.i - 1;
        if (i2 == 1 || i2 == 2) {
            return drrVar.h;
        }
        if (i2 == 3 || i2 == 4) {
            return drrVar.i;
        }
        return null;
    }

    public long a() {
        defpackage.drk drkVar = this.e;
        if (drkVar.i) {
            return drkVar.f;
        }
        return 0L;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean e();

    @Override // defpackage.drh
    public void f() {
        throw null;
    }

    protected final int h(int i, int i2) {
        defpackage.dqv dqvVar = this.d;
        if (i2 == 0) {
            int i3 = dqvVar.G;
            int iMax = java.lang.Math.max(dqvVar.F, i);
            if (i3 > 0) {
                iMax = java.lang.Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = dqvVar.J;
            int iMax2 = java.lang.Math.max(dqvVar.I, i);
            if (i4 > 0) {
                iMax2 = java.lang.Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    protected final void i(defpackage.drj drjVar, defpackage.drj drjVar2, int i, defpackage.drk drkVar) {
        java.util.List list = drjVar.k;
        list.add(drjVar2);
        list.add(this.e);
        drjVar.g = i;
        drjVar.h = drkVar;
        drjVar2.j.add(drjVar);
        drkVar.j.add(drjVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    protected final void m(defpackage.dqu dquVar, defpackage.dqu dquVar2, int i) {
        defpackage.drr drrVar;
        defpackage.drr drrVar2;
        defpackage.drk drkVar;
        float f;
        int i2;
        defpackage.drj drjVarK = k(dquVar);
        defpackage.drj drjVarK2 = k(dquVar2);
        if (drjVarK.i && drjVarK2.i) {
            int iB = drjVarK.f + dquVar.b();
            int iB2 = drjVarK2.f - dquVar2.b();
            defpackage.drk drkVar2 = this.e;
            int i3 = iB2 - iB;
            if (!drkVar2.i && this.j == 3) {
                int i4 = this.c;
                if (i4 != 0) {
                    int i5 = 1;
                    if (i4 != 1) {
                        int i6 = 0;
                        if (i4 == 2) {
                            defpackage.dqv dqvVar = this.d;
                            defpackage.dqv dqvVar2 = dqvVar.ae;
                            if (dqvVar2 != null) {
                                if (i == 0) {
                                    drrVar = dqvVar2.o;
                                    i5 = 0;
                                } else {
                                    drrVar = dqvVar2.p;
                                    i6 = 1;
                                }
                                defpackage.drk drkVar3 = drrVar.e;
                                if (drkVar3.i) {
                                    drkVar2.c(h((int) ((drkVar3.f * (i5 == 0 ? dqvVar.H : dqvVar.K)) + 0.5f), i5));
                                    i = i5;
                                } else {
                                    i = i6;
                                }
                            }
                        } else if (i4 == 3) {
                            defpackage.dqv dqvVar3 = this.d;
                            defpackage.dro droVar = dqvVar3.o;
                            if (droVar.j == 3 && droVar.c == 3) {
                                defpackage.drp drpVar = dqvVar3.p;
                                if (drpVar.j != 3 || drpVar.c != 3) {
                                    if (i == 0) {
                                        i = 0;
                                        drrVar2 = dqvVar3.p;
                                    } else {
                                        i = 1;
                                        i6 = 1;
                                        drrVar2 = droVar;
                                    }
                                    drkVar = drrVar2.e;
                                    if (drkVar.i) {
                                        f = dqvVar3.ah;
                                        if (i6 == 1) {
                                            i2 = (int) ((drkVar.f / f) + 0.5f);
                                        } else {
                                            i2 = (int) ((f * drkVar.f) + 0.5f);
                                        }
                                        drkVar2.c(i2);
                                    }
                                }
                            } else {
                                if (i == 0) {
                                    i = 0;
                                    drrVar2 = dqvVar3.p;
                                } else {
                                    i = 1;
                                    i6 = 1;
                                    drrVar2 = droVar;
                                }
                                drkVar = drrVar2.e;
                                if (drkVar.i) {
                                    f = dqvVar3.ah;
                                    if (i6 == 1) {
                                        i2 = (int) ((drkVar.f / f) + 0.5f);
                                    } else {
                                        i2 = (int) ((f * drkVar.f) + 0.5f);
                                    }
                                    drkVar2.c(i2);
                                }
                            }
                        }
                    } else {
                        drkVar2.c(java.lang.Math.min(h(drkVar2.m, i), i3));
                    }
                } else {
                    drkVar2.c(h(i3, i));
                }
            }
            if (drkVar2.i) {
                int i7 = drkVar2.f;
                if (i7 == i3) {
                    this.h.c(iB);
                    this.i.c(iB2);
                    return;
                }
                defpackage.dqv dqvVar4 = this.d;
                float f2 = i == 0 ? dqvVar4.ao : dqvVar4.ap;
                if (drjVarK == drjVarK2) {
                    iB = drjVarK.f;
                    iB2 = drjVarK2.f;
                    f2 = 0.5f;
                }
                defpackage.drj drjVar = this.h;
                drjVar.c((int) (iB + 0.5f + (((iB2 - iB) - i7) * f2)));
                this.i.c(drjVar.f + drkVar2.f);
            }
        }
    }
}
