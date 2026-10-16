package R0;

/* loaded from: classes.dex */
public final class k extends o {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i5, int i10, int i11, int i12, float f10, int i13) {
        int i14 = i10 - i5;
        int i15 = i12 - i11;
        if (i13 != -1) {
            if (i13 == 0) {
                iArr[0] = (int) ((i15 * f10) + 0.5f);
                iArr[1] = i15;
                return;
            } else {
                if (i13 != 1) {
                    return;
                }
                iArr[0] = i14;
                iArr[1] = (int) ((i14 * f10) + 0.5f);
                return;
            }
        }
        int i16 = (int) ((i15 * f10) + 0.5f);
        int i17 = (int) ((i14 / f10) + 0.5f);
        if (i16 <= i14) {
            iArr[0] = i16;
            iArr[1] = i15;
        } else if (i17 <= i15) {
            iArr[0] = i14;
            iArr[1] = i17;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // R0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(R0.d r24) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.k.a(R0.d):void");
    }

    @Override // R0.o
    public final void d() {
        Q0.d dVar;
        Q0.d dVar2;
        int i5;
        Q0.d dVar3;
        Q0.d dVar4;
        int i10;
        Q0.d dVar5 = this.f10081b;
        boolean z2 = dVar5.f9540a;
        g gVar = this.f10084e;
        if (z2) {
            gVar.d(dVar5.q());
        }
        boolean z10 = gVar.f10067j;
        f fVar = this.f10088i;
        f fVar2 = this.f10087h;
        if (!z10) {
            Q0.d dVar6 = this.f10081b;
            int i11 = dVar6.f9570p0[0];
            this.f10083d = i11;
            if (i11 != 3) {
                if (i11 == 4 && (dVar4 = dVar6.f9533T) != null && ((i10 = dVar4.f9570p0[0]) == 1 || i10 == 4)) {
                    int iQ = (dVar4.q() - this.f10081b.f9523I.e()) - this.f10081b.f9525K.e();
                    o.b(fVar2, dVar4.f9546d.f10087h, this.f10081b.f9523I.e());
                    o.b(fVar, dVar4.f9546d.f10088i, -this.f10081b.f9525K.e());
                    gVar.d(iQ);
                    return;
                }
                if (i11 == 1) {
                    gVar.d(dVar6.q());
                }
            }
        } else if (this.f10083d == 4 && (dVar2 = (dVar = this.f10081b).f9533T) != null && ((i5 = dVar2.f9570p0[0]) == 1 || i5 == 4)) {
            o.b(fVar2, dVar2.f9546d.f10087h, dVar.f9523I.e());
            o.b(fVar, dVar2.f9546d.f10088i, -this.f10081b.f9525K.e());
            return;
        }
        if (gVar.f10067j) {
            Q0.d dVar7 = this.f10081b;
            if (dVar7.f9540a) {
                Q0.c[] cVarArr = dVar7.f9530Q;
                Q0.c cVar = cVarArr[0];
                Q0.c cVar2 = cVar.f9511f;
                if (cVar2 != null && cVarArr[1].f9511f != null) {
                    if (dVar7.x()) {
                        fVar2.f10063f = this.f10081b.f9530Q[0].e();
                        fVar.f10063f = -this.f10081b.f9530Q[1].e();
                        return;
                    }
                    f fVarH = o.h(this.f10081b.f9530Q[0]);
                    if (fVarH != null) {
                        o.b(fVar2, fVarH, this.f10081b.f9530Q[0].e());
                    }
                    f fVarH2 = o.h(this.f10081b.f9530Q[1]);
                    if (fVarH2 != null) {
                        o.b(fVar, fVarH2, -this.f10081b.f9530Q[1].e());
                    }
                    fVar2.f10059b = true;
                    fVar.f10059b = true;
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = o.h(cVar);
                    if (fVarH3 != null) {
                        o.b(fVar2, fVarH3, this.f10081b.f9530Q[0].e());
                        o.b(fVar, fVar2, gVar.f10064g);
                        return;
                    }
                    return;
                }
                Q0.c cVar3 = cVarArr[1];
                if (cVar3.f9511f != null) {
                    f fVarH4 = o.h(cVar3);
                    if (fVarH4 != null) {
                        o.b(fVar, fVarH4, -this.f10081b.f9530Q[1].e());
                        o.b(fVar2, fVar, -gVar.f10064g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof Q0.i) || dVar7.f9533T == null || dVar7.i(7).f9511f != null) {
                    return;
                }
                Q0.d dVar8 = this.f10081b;
                o.b(fVar2, dVar8.f9533T.f9546d.f10087h, dVar8.r());
                o.b(fVar, fVar2, gVar.f10064g);
                return;
            }
        }
        if (this.f10083d == 3) {
            Q0.d dVar9 = this.f10081b;
            int i12 = dVar9.f9572r;
            if (i12 == 2) {
                Q0.d dVar10 = dVar9.f9533T;
                if (dVar10 != null) {
                    g gVar2 = dVar10.f9548e.f10084e;
                    gVar.f10068l.add(gVar2);
                    gVar2.k.add(gVar);
                    gVar.f10059b = true;
                    gVar.k.add(fVar2);
                    gVar.k.add(fVar);
                }
            } else if (i12 == 3) {
                if (dVar9.f9573s == 3) {
                    fVar2.f10058a = this;
                    fVar.f10058a = this;
                    m mVar = dVar9.f9548e;
                    mVar.f10087h.f10058a = this;
                    mVar.f10088i.f10058a = this;
                    gVar.f10058a = this;
                    if (dVar9.y()) {
                        gVar.f10068l.add(this.f10081b.f9548e.f10084e);
                        this.f10081b.f9548e.f10084e.k.add(gVar);
                        m mVar2 = this.f10081b.f9548e;
                        mVar2.f10084e.f10058a = this;
                        gVar.f10068l.add(mVar2.f10087h);
                        gVar.f10068l.add(this.f10081b.f9548e.f10088i);
                        this.f10081b.f9548e.f10087h.k.add(gVar);
                        this.f10081b.f9548e.f10088i.k.add(gVar);
                    } else if (this.f10081b.x()) {
                        this.f10081b.f9548e.f10084e.f10068l.add(gVar);
                        gVar.k.add(this.f10081b.f9548e.f10084e);
                    } else {
                        this.f10081b.f9548e.f10084e.f10068l.add(gVar);
                    }
                } else {
                    g gVar3 = dVar9.f9548e.f10084e;
                    gVar.f10068l.add(gVar3);
                    gVar3.k.add(gVar);
                    this.f10081b.f9548e.f10087h.k.add(gVar);
                    this.f10081b.f9548e.f10088i.k.add(gVar);
                    gVar.f10059b = true;
                    gVar.k.add(fVar2);
                    gVar.k.add(fVar);
                    fVar2.f10068l.add(gVar);
                    fVar.f10068l.add(gVar);
                }
            }
        }
        Q0.d dVar11 = this.f10081b;
        Q0.c[] cVarArr2 = dVar11.f9530Q;
        Q0.c cVar4 = cVarArr2[0];
        Q0.c cVar5 = cVar4.f9511f;
        if (cVar5 != null && cVarArr2[1].f9511f != null) {
            if (dVar11.x()) {
                fVar2.f10063f = this.f10081b.f9530Q[0].e();
                fVar.f10063f = -this.f10081b.f9530Q[1].e();
                return;
            }
            f fVarH5 = o.h(this.f10081b.f9530Q[0]);
            f fVarH6 = o.h(this.f10081b.f9530Q[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f10089j = 4;
            return;
        }
        if (cVar5 != null) {
            f fVarH7 = o.h(cVar4);
            if (fVarH7 != null) {
                o.b(fVar2, fVarH7, this.f10081b.f9530Q[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        Q0.c cVar6 = cVarArr2[1];
        if (cVar6.f9511f != null) {
            f fVarH8 = o.h(cVar6);
            if (fVarH8 != null) {
                o.b(fVar, fVarH8, -this.f10081b.f9530Q[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof Q0.i) || (dVar3 = dVar11.f9533T) == null) {
            return;
        }
        o.b(fVar2, dVar3.f9546d.f10087h, dVar11.r());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // R0.o
    public final void e() {
        f fVar = this.f10087h;
        if (fVar.f10067j) {
            this.f10081b.f9538Y = fVar.f10064g;
        }
    }

    @Override // R0.o
    public final void f() {
        this.f10082c = null;
        this.f10087h.c();
        this.f10088i.c();
        this.f10084e.c();
        this.f10086g = false;
    }

    @Override // R0.o
    public final boolean k() {
        return this.f10083d != 3 || this.f10081b.f9572r == 0;
    }

    public final void n() {
        this.f10086g = false;
        f fVar = this.f10087h;
        fVar.c();
        fVar.f10067j = false;
        f fVar2 = this.f10088i;
        fVar2.c();
        fVar2.f10067j = false;
        this.f10084e.f10067j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f10081b.f9555h0;
    }
}
