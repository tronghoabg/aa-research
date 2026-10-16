package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class axj implements ctq {
    public final axk a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final aitx f;
    public final dlg g;
    public final long h;
    public final int i;
    public final List j;
    public final int k;
    public final int l;
    public final int m;
    public final api n;
    public final int o;
    public final int p;
    private final ctq q;
    private final boolean r;

    public axj(axk axkVar, int i, boolean z, float f, ctq ctqVar, float f2, boolean z2, aitx aitxVar, dlg dlgVar, long j, int i2, List list, int i3, int i4, int i5, api apiVar, int i6, int i7) {
        this.a = axkVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.q = ctqVar;
        this.e = f2;
        this.r = z2;
        this.f = aitxVar;
        this.g = dlgVar;
        this.h = j;
        this.i = i2;
        this.j = list;
        this.k = i3;
        this.l = i4;
        this.m = i5;
        this.n = apiVar;
        this.o = i6;
        this.p = i7;
    }

    public final int a() {
        return -this.k;
    }

    @Override // defpackage.ctq
    public final int b() {
        return this.q.b();
    }

    @Override // defpackage.ctq
    public final int c() {
        return this.q.c();
    }

    public final long d() {
        return (c() << 32) | (b() & 4294967295L);
    }

    public final axj e(int i, boolean z) {
        axk axkVar;
        axk axkVar2;
        if (!this.r) {
            List list = this.j;
            if (!list.isEmpty() && (axkVar = this.a) != null) {
                int i2 = this.b - i;
                int iA = axkVar.a();
                if (i2 >= 0 && i2 < iA) {
                    axk axkVar3 = (axk) woy.bF(list);
                    axk axkVar4 = (axk) woy.bK(list);
                    if (!axkVar3.o && !axkVar4.o) {
                        if (i < 0) {
                            if (Math.min((axkVar3.h + axkVar3.a()) - this.k, (axkVar4.h + axkVar4.a()) - this.l) <= (-i)) {
                                return null;
                            }
                        } else if (Math.min(this.k - axkVar3.h, this.l - axkVar4.h) <= i) {
                            return null;
                        }
                        int size = list.size();
                        int i3 = 0;
                        while (i3 < size) {
                            axk axkVar5 = (axk) list.get(i3);
                            if (!axkVar5.o) {
                                axkVar5.h += i;
                                int[] iArr = axkVar5.r;
                                int length = iArr.length;
                                for (int i4 = 0; i4 < length; i4++) {
                                    int i5 = i4 & 1;
                                    boolean z2 = axkVar5.c;
                                    if (z2) {
                                        if (i5 == 0) {
                                            i5 = 0;
                                            if (z2) {
                                            }
                                        }
                                        iArr[i4] = iArr[i4] + i;
                                    } else if (z2 && i5 == 0) {
                                        iArr[i4] = iArr[i4] + i;
                                    }
                                }
                                if (z) {
                                    int size2 = axkVar5.b.size();
                                    int i6 = 0;
                                    while (i6 < size2) {
                                        aza azaVarB = axkVar5.f.b(axkVar5.e, i6);
                                        if (azaVarB != null) {
                                            long j = azaVarB.h;
                                            axkVar2 = axkVar;
                                            int iIntValue = (int) (j & 4294967295L);
                                            int iIntValue2 = (int) (j >> 32);
                                            if (axkVar5.c) {
                                                iIntValue = Integer.valueOf(iIntValue + i).intValue();
                                            } else {
                                                iIntValue2 = Integer.valueOf(iIntValue2 + i).intValue();
                                            }
                                            azaVarB.h = (iIntValue & 4294967295L) | (iIntValue2 << 32);
                                        } else {
                                            axkVar2 = axkVar;
                                        }
                                        i6++;
                                        axkVar = axkVar2;
                                    }
                                }
                            }
                            i3++;
                            axkVar = axkVar;
                        }
                        return new axj(axkVar, i2, this.c || i > 0, i, this.q, this.e, false, this.f, this.g, this.h, this.i, list, this.k, this.l, this.m, this.n, this.o, this.p);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.ctq
    public final Map f() {
        return this.q.f();
    }

    @Override // defpackage.ctq
    public final afec g() {
        return this.q.g();
    }

    @Override // defpackage.ctq
    public final void h() {
        this.q.h();
    }

    @Override // defpackage.ctq
    public final void i() {
        this.q.i();
    }

    @Override // defpackage.ctq
    public final void j() {
        this.q.j();
    }
}
