package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class drh extends drj {
    public final drb a;
    drc b;

    public drh(dqn dqnVar) {
        super(dqnVar);
        drb drbVar = new drb(this);
        this.a = drbVar;
        this.b = null;
        this.h.l = 6;
        this.i.l = 7;
        drbVar.l = 8;
        this.f = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.drj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drh.b():void");
    }

    @Override // defpackage.drj
    public final void c() {
        drb drbVar = this.h;
        if (drbVar.i) {
            this.d.ak = drbVar.f;
        }
    }

    @Override // defpackage.drj
    public final void d() {
        this.l = null;
        this.h.b();
        this.i.b();
        this.a.b();
        this.e.b();
        this.g = false;
    }

    @Override // defpackage.drj
    public final boolean e() {
        return this.j != 3 || this.d.D == 0;
    }

    @Override // defpackage.drj, defpackage.dqz
    public final void f() {
        float f;
        int i = this.k;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 3) {
            dqn dqnVar = this.d;
            m(dqnVar.U, dqnVar.W, 1);
            return;
        }
        drc drcVar = this.e;
        if (drcVar.c && !drcVar.i && this.j == 3) {
            dqn dqnVar2 = this.d;
            int i3 = dqnVar2.D;
            if (i3 == 2) {
                dqn dqnVar3 = dqnVar2.ae;
                if (dqnVar3 != null) {
                    if (dqnVar3.p.e.i) {
                        drcVar.c((int) ((r5.f * dqnVar2.K) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                drc drcVar2 = dqnVar2.o.e;
                if (drcVar2.i) {
                    int i4 = dqnVar2.ai;
                    if (i4 == -1 || i4 != 0) {
                        float f2 = drcVar2.f;
                        float f3 = dqnVar2.ah;
                        f = f2 / f3;
                        drcVar.c((int) (f + 0.5f));
                    } else {
                        f = drcVar2.f * dqnVar2.ah;
                        drcVar.c((int) (f + 0.5f));
                    }
                }
            }
        }
        drb drbVar = this.h;
        if (drbVar.c) {
            drb drbVar2 = this.i;
            if (drbVar2.c) {
                if (drbVar.i && drbVar2.i && drcVar.i) {
                    return;
                }
                if (!drcVar.i && this.j == 3) {
                    dqn dqnVar4 = this.d;
                    if (dqnVar4.C == 0 && !dqnVar4.S()) {
                        drb drbVar3 = (drb) drbVar.k.get(0);
                        drb drbVar4 = (drb) drbVar2.k.get(0);
                        int i5 = drbVar3.f + drbVar.e;
                        int i6 = drbVar4.f + drbVar2.e;
                        drbVar.c(i5);
                        drbVar2.c(i6);
                        drcVar.c(i6 - i5);
                        return;
                    }
                }
                if (!drcVar.i && this.j == 3 && this.c == 1) {
                    List list = drbVar.k;
                    if (list.size() > 0) {
                        List list2 = drbVar2.k;
                        if (list2.size() > 0) {
                            drb drbVar5 = (drb) list.get(0);
                            drb drbVar6 = (drb) list2.get(0);
                            int i7 = drbVar5.f + drbVar.e;
                            int i8 = drbVar6.f + drbVar2.e;
                            int i9 = drcVar.m;
                            int i10 = i8 - i7;
                            if (i10 < i9) {
                                drcVar.c(i10);
                            } else {
                                drcVar.c(i9);
                            }
                        }
                    }
                }
                if (drcVar.i) {
                    List list3 = drbVar.k;
                    if (list3.size() > 0) {
                        List list4 = drbVar2.k;
                        if (list4.size() > 0) {
                            drb drbVar7 = (drb) list3.get(0);
                            drb drbVar8 = (drb) list4.get(0);
                            int i11 = drbVar7.f;
                            int i12 = drbVar.e + i11;
                            int i13 = drbVar8.f;
                            int i14 = drbVar2.e + i13;
                            float f4 = this.d.ap;
                            if (drbVar7 == drbVar8) {
                                f4 = 0.5f;
                            }
                            if (drbVar7 != drbVar8) {
                                i13 = i14;
                            }
                            if (drbVar7 != drbVar8) {
                                i11 = i12;
                            }
                            drbVar.c((int) (i11 + 0.5f + (((i13 - i11) - drcVar.f) * f4)));
                            drbVar2.c(drbVar.f + drcVar.f);
                        }
                    }
                }
            }
        }
    }

    public final void g() {
        this.g = false;
        drb drbVar = this.h;
        drbVar.b();
        drbVar.i = false;
        drb drbVar2 = this.i;
        drbVar2.b();
        drbVar2.i = false;
        drb drbVar3 = this.a;
        drbVar3.b();
        drbVar3.i = false;
        this.e.i = false;
    }

    public final String toString() {
        return "VerticalRun ".concat(String.valueOf(this.d.as));
    }
}
