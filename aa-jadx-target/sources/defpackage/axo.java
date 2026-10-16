package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class axo implements defpackage.ctz {
    public final defpackage.axp a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final aiuw f;
    public final defpackage.dlo g;
    public final long h;
    public final int i;
    public final java.util.List j;
    public final int k;
    public final int l;
    public final int m;
    public final defpackage.apn n;
    public final int o;
    public final int p;
    private final defpackage.ctz q;
    private final boolean r;

    public axo(defpackage.axp axpVar, int i, boolean z, float f, defpackage.ctz ctzVar, float f2, boolean z2, aiuw aiuwVar, defpackage.dlo dloVar, long j, int i2, java.util.List list, int i3, int i4, int i5, defpackage.apn apnVar, int i6, int i7) {
        this.a = axpVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.q = ctzVar;
        this.e = f2;
        this.r = z2;
        this.f = aiuwVar;
        this.g = dloVar;
        this.h = j;
        this.i = i2;
        this.j = list;
        this.k = i3;
        this.l = i4;
        this.m = i5;
        this.n = apnVar;
        this.o = i6;
        this.p = i7;
    }

    public final int a() {
        return -this.k;
    }

    @Override // defpackage.ctz
    public final int b() {
        return this.q.b();
    }

    @Override // defpackage.ctz
    public final int c() {
        return this.q.c();
    }

    public final long d() {
        return (((long) c()) << 32) | (((long) b()) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    public final defpackage.axo e(int i, boolean z) {
        defpackage.axp axpVar;
        if (!this.r) {
            java.util.List list = this.j;
            if (!list.isEmpty() && (axpVar = this.a) != null) {
                int i2 = this.b - i;
                int iA = axpVar.a();
                if (i2 >= 0 && i2 < iA) {
                    defpackage.axp axpVar2 = (defpackage.axp) defpackage.afga.az(list);
                    defpackage.axp axpVar3 = (defpackage.axp) defpackage.afga.aE(list);
                    if (!axpVar2.o && !axpVar3.o) {
                        if (i < 0) {
                            if (java.lang.Math.min((axpVar2.h + axpVar2.a()) - this.k, (axpVar3.h + axpVar3.a()) - this.l) <= (-i)) {
                                return null;
                            }
                        } else if (java.lang.Math.min(this.k - axpVar2.h, this.l - axpVar3.h) <= i) {
                            return null;
                        }
                        int size = list.size();
                        int i3 = 0;
                        while (i3 < size) {
                            defpackage.axp axpVar4 = (defpackage.axp) list.get(i3);
                            if (!axpVar4.o) {
                                axpVar4.h += i;
                                int[] iArr = axpVar4.r;
                                int length = iArr.length;
                                for (int i4 = 0; i4 < length; i4++) {
                                    int i5 = i4 & 1;
                                    boolean z2 = axpVar4.c;
                                    if (z2) {
                                        if (i5 == 0) {
                                            i5 = 0;
                                            if (z2) {
                                            }
                                        } else {
                                            iArr[i4] = iArr[i4] + i;
                                        }
                                    } else if (z2 && i5 == 0) {
                                        iArr[i4] = iArr[i4] + i;
                                    }
                                }
                                if (z) {
                                    int size2 = axpVar4.b.size();
                                    int i6 = 0;
                                    while (i6 < size2) {
                                        defpackage.azf azfVarB = axpVar4.f.b(axpVar4.e, i6);
                                        if (azfVarB != null) {
                                            long j = azfVarB.h;
                                            int iIntValue = (int) (j & 4294967295L);
                                            int iIntValue2 = (int) (j >> 32);
                                            if (axpVar4.c) {
                                                iIntValue = java.lang.Integer.valueOf(iIntValue + i).intValue();
                                            } else {
                                                iIntValue2 = java.lang.Integer.valueOf(iIntValue2 + i).intValue();
                                            }
                                            azfVarB.h = (((long) iIntValue) & 4294967295L) | (((long) iIntValue2) << 32);
                                        }
                                        i6++;
                                        axpVar = axpVar;
                                    }
                                }
                            }
                            i3++;
                            axpVar = axpVar;
                        }
                        return new defpackage.axo(axpVar, i2, this.c || i > 0, i, this.q, this.e, false, this.f, this.g, this.h, this.i, list, this.k, this.l, this.m, this.n, this.o, this.p);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.ctz
    public final java.util.Map f() {
        return this.q.f();
    }

    @Override // defpackage.ctz
    public final defpackage.affc g() {
        return this.q.g();
    }

    @Override // defpackage.ctz
    public final void h() {
        this.q.h();
    }

    @Override // defpackage.ctz
    public final void i() {
        this.q.i();
    }

    @Override // defpackage.ctz
    public final void j() {
        this.q.j();
    }
}
