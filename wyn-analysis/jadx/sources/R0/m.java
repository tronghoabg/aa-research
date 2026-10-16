package R0;

import A.AbstractC0213f;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public final class m extends o {
    public f k;

    /* renamed from: l, reason: collision with root package name */
    public a f10073l;

    @Override // R0.d
    public final void a(d dVar) {
        float f10;
        float f11;
        float f12;
        int i5;
        if (AbstractC0213f.f(this.f10089j) == 3) {
            Q0.d dVar2 = this.f10081b;
            l(dVar2.f9524J, dVar2.L, 1);
            return;
        }
        g gVar = this.f10084e;
        if (gVar.f10060c && !gVar.f10067j && this.f10083d == 3) {
            Q0.d dVar3 = this.f10081b;
            int i10 = dVar3.f9573s;
            if (i10 == 2) {
                Q0.d dVar4 = dVar3.f9533T;
                if (dVar4 != null) {
                    if (dVar4.f9548e.f10084e.f10067j) {
                        gVar.d((int) ((r5.f10064g * dVar3.f9580z) + 0.5f));
                    }
                }
            } else if (i10 == 3) {
                g gVar2 = dVar3.f9546d.f10084e;
                if (gVar2.f10067j) {
                    int i11 = dVar3.f9537X;
                    if (i11 == -1) {
                        f10 = gVar2.f10064g;
                        f11 = dVar3.f9536W;
                    } else if (i11 == 0) {
                        f12 = gVar2.f10064g * dVar3.f9536W;
                        i5 = (int) (f12 + 0.5f);
                        gVar.d(i5);
                    } else if (i11 != 1) {
                        i5 = 0;
                        gVar.d(i5);
                    } else {
                        f10 = gVar2.f10064g;
                        f11 = dVar3.f9536W;
                    }
                    f12 = f10 / f11;
                    i5 = (int) (f12 + 0.5f);
                    gVar.d(i5);
                }
            }
        }
        f fVar = this.f10087h;
        if (fVar.f10060c) {
            f fVar2 = this.f10088i;
            if (fVar2.f10060c) {
                if (fVar.f10067j && fVar2.f10067j && gVar.f10067j) {
                    return;
                }
                if (!gVar.f10067j && this.f10083d == 3) {
                    Q0.d dVar5 = this.f10081b;
                    if (dVar5.f9572r == 0 && !dVar5.y()) {
                        f fVar3 = (f) fVar.f10068l.get(0);
                        f fVar4 = (f) fVar2.f10068l.get(0);
                        int i12 = fVar3.f10064g + fVar.f10063f;
                        int i13 = fVar4.f10064g + fVar2.f10063f;
                        fVar.d(i12);
                        fVar2.d(i13);
                        gVar.d(i13 - i12);
                        return;
                    }
                }
                if (!gVar.f10067j && this.f10083d == 3 && this.f10080a == 1 && fVar.f10068l.size() > 0 && fVar2.f10068l.size() > 0) {
                    f fVar5 = (f) fVar.f10068l.get(0);
                    int i14 = (((f) fVar2.f10068l.get(0)).f10064g + fVar2.f10063f) - (fVar5.f10064g + fVar.f10063f);
                    int i15 = gVar.f10069m;
                    if (i14 < i15) {
                        gVar.d(i14);
                    } else {
                        gVar.d(i15);
                    }
                }
                if (gVar.f10067j && fVar.f10068l.size() > 0 && fVar2.f10068l.size() > 0) {
                    f fVar6 = (f) fVar.f10068l.get(0);
                    f fVar7 = (f) fVar2.f10068l.get(0);
                    int i16 = fVar6.f10064g;
                    int i17 = fVar.f10063f + i16;
                    int i18 = fVar7.f10064g;
                    int i19 = fVar2.f10063f + i18;
                    float f13 = this.f10081b.f9549e0;
                    if (fVar6 == fVar7) {
                        f13 = 0.5f;
                    } else {
                        i16 = i17;
                        i18 = i19;
                    }
                    fVar.d((int) ((((i18 - i16) - gVar.f10064g) * f13) + i16 + 0.5f));
                    fVar2.d(fVar.f10064g + gVar.f10064g);
                }
            }
        }
    }

    @Override // R0.o
    public final void d() {
        Q0.d dVar;
        Q0.d dVar2;
        Q0.d dVar3;
        Q0.d dVar4;
        Q0.d dVar5 = this.f10081b;
        boolean z2 = dVar5.f9540a;
        g gVar = this.f10084e;
        if (z2) {
            gVar.d(dVar5.k());
        }
        boolean z10 = gVar.f10067j;
        f fVar = this.f10088i;
        f fVar2 = this.f10087h;
        if (!z10) {
            Q0.d dVar6 = this.f10081b;
            this.f10083d = dVar6.f9570p0[1];
            if (dVar6.f9519E) {
                this.f10073l = new a(this);
            }
            int i5 = this.f10083d;
            if (i5 != 3) {
                if (i5 == 4 && (dVar4 = this.f10081b.f9533T) != null && dVar4.f9570p0[1] == 1) {
                    int iK = (dVar4.k() - this.f10081b.f9524J.e()) - this.f10081b.L.e();
                    o.b(fVar2, dVar4.f9548e.f10087h, this.f10081b.f9524J.e());
                    o.b(fVar, dVar4.f9548e.f10088i, -this.f10081b.L.e());
                    gVar.d(iK);
                    return;
                }
                if (i5 == 1) {
                    gVar.d(this.f10081b.k());
                }
            }
        } else if (this.f10083d == 4 && (dVar2 = (dVar = this.f10081b).f9533T) != null && dVar2.f9570p0[1] == 1) {
            o.b(fVar2, dVar2.f9548e.f10087h, dVar.f9524J.e());
            o.b(fVar, dVar2.f9548e.f10088i, -this.f10081b.L.e());
            return;
        }
        boolean z11 = gVar.f10067j;
        f fVar3 = this.k;
        if (z11) {
            Q0.d dVar7 = this.f10081b;
            if (dVar7.f9540a) {
                Q0.c[] cVarArr = dVar7.f9530Q;
                Q0.c cVar = cVarArr[2];
                Q0.c cVar2 = cVar.f9511f;
                if (cVar2 != null && cVarArr[3].f9511f != null) {
                    if (dVar7.y()) {
                        fVar2.f10063f = this.f10081b.f9530Q[2].e();
                        fVar.f10063f = -this.f10081b.f9530Q[3].e();
                    } else {
                        f fVarH = o.h(this.f10081b.f9530Q[2]);
                        if (fVarH != null) {
                            o.b(fVar2, fVarH, this.f10081b.f9530Q[2].e());
                        }
                        f fVarH2 = o.h(this.f10081b.f9530Q[3]);
                        if (fVarH2 != null) {
                            o.b(fVar, fVarH2, -this.f10081b.f9530Q[3].e());
                        }
                        fVar2.f10059b = true;
                        fVar.f10059b = true;
                    }
                    Q0.d dVar8 = this.f10081b;
                    if (dVar8.f9519E) {
                        o.b(fVar3, fVar2, dVar8.f9541a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = o.h(cVar);
                    if (fVarH3 != null) {
                        o.b(fVar2, fVarH3, this.f10081b.f9530Q[2].e());
                        o.b(fVar, fVar2, gVar.f10064g);
                        Q0.d dVar9 = this.f10081b;
                        if (dVar9.f9519E) {
                            o.b(fVar3, fVar2, dVar9.f9541a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Q0.c cVar3 = cVarArr[3];
                if (cVar3.f9511f != null) {
                    f fVarH4 = o.h(cVar3);
                    if (fVarH4 != null) {
                        o.b(fVar, fVarH4, -this.f10081b.f9530Q[3].e());
                        o.b(fVar2, fVar, -gVar.f10064g);
                    }
                    Q0.d dVar10 = this.f10081b;
                    if (dVar10.f9519E) {
                        o.b(fVar3, fVar2, dVar10.f9541a0);
                        return;
                    }
                    return;
                }
                Q0.c cVar4 = cVarArr[4];
                if (cVar4.f9511f != null) {
                    f fVarH5 = o.h(cVar4);
                    if (fVarH5 != null) {
                        o.b(fVar3, fVarH5, 0);
                        o.b(fVar2, fVar3, -this.f10081b.f9541a0);
                        o.b(fVar, fVar2, gVar.f10064g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof Q0.i) || dVar7.f9533T == null || dVar7.i(7).f9511f != null) {
                    return;
                }
                Q0.d dVar11 = this.f10081b;
                o.b(fVar2, dVar11.f9533T.f9548e.f10087h, dVar11.s());
                o.b(fVar, fVar2, gVar.f10064g);
                Q0.d dVar12 = this.f10081b;
                if (dVar12.f9519E) {
                    o.b(fVar3, fVar2, dVar12.f9541a0);
                    return;
                }
                return;
            }
        }
        if (z11 || this.f10083d != 3) {
            gVar.b(this);
        } else {
            Q0.d dVar13 = this.f10081b;
            int i10 = dVar13.f9573s;
            if (i10 == 2) {
                Q0.d dVar14 = dVar13.f9533T;
                if (dVar14 != null) {
                    g gVar2 = dVar14.f9548e.f10084e;
                    gVar.f10068l.add(gVar2);
                    gVar2.k.add(gVar);
                    gVar.f10059b = true;
                    gVar.k.add(fVar2);
                    gVar.k.add(fVar);
                }
            } else if (i10 == 3 && !dVar13.y()) {
                Q0.d dVar15 = this.f10081b;
                if (dVar15.f9572r != 3) {
                    g gVar3 = dVar15.f9546d.f10084e;
                    gVar.f10068l.add(gVar3);
                    gVar3.k.add(gVar);
                    gVar.f10059b = true;
                    gVar.k.add(fVar2);
                    gVar.k.add(fVar);
                }
            }
        }
        Q0.d dVar16 = this.f10081b;
        Q0.c[] cVarArr2 = dVar16.f9530Q;
        Q0.c cVar5 = cVarArr2[2];
        Q0.c cVar6 = cVar5.f9511f;
        if (cVar6 != null && cVarArr2[3].f9511f != null) {
            if (dVar16.y()) {
                fVar2.f10063f = this.f10081b.f9530Q[2].e();
                fVar.f10063f = -this.f10081b.f9530Q[3].e();
            } else {
                f fVarH6 = o.h(this.f10081b.f9530Q[2]);
                f fVarH7 = o.h(this.f10081b.f9530Q[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f10089j = 4;
            }
            if (this.f10081b.f9519E) {
                c(fVar3, fVar2, 1, this.f10073l);
            }
        } else if (cVar6 != null) {
            f fVarH8 = o.h(cVar5);
            if (fVarH8 != null) {
                o.b(fVar2, fVarH8, this.f10081b.f9530Q[2].e());
                c(fVar, fVar2, 1, gVar);
                if (this.f10081b.f9519E) {
                    c(fVar3, fVar2, 1, this.f10073l);
                }
                if (this.f10083d == 3) {
                    Q0.d dVar17 = this.f10081b;
                    if (dVar17.f9536W > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        k kVar = dVar17.f9546d;
                        if (kVar.f10083d == 3) {
                            kVar.f10084e.k.add(gVar);
                            gVar.f10068l.add(this.f10081b.f9546d.f10084e);
                            gVar.f10058a = this;
                        }
                    }
                }
            }
        } else {
            Q0.c cVar7 = cVarArr2[3];
            if (cVar7.f9511f != null) {
                f fVarH9 = o.h(cVar7);
                if (fVarH9 != null) {
                    o.b(fVar, fVarH9, -this.f10081b.f9530Q[3].e());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f10081b.f9519E) {
                        c(fVar3, fVar2, 1, this.f10073l);
                    }
                }
            } else {
                Q0.c cVar8 = cVarArr2[4];
                if (cVar8.f9511f != null) {
                    f fVarH10 = o.h(cVar8);
                    if (fVarH10 != null) {
                        o.b(fVar3, fVarH10, 0);
                        c(fVar2, fVar3, -1, this.f10073l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(dVar16 instanceof Q0.i) && (dVar3 = dVar16.f9533T) != null) {
                    o.b(fVar2, dVar3.f9548e.f10087h, dVar16.s());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f10081b.f9519E) {
                        c(fVar3, fVar2, 1, this.f10073l);
                    }
                    if (this.f10083d == 3) {
                        Q0.d dVar18 = this.f10081b;
                        if (dVar18.f9536W > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            k kVar2 = dVar18.f9546d;
                            if (kVar2.f10083d == 3) {
                                kVar2.f10084e.k.add(gVar);
                                gVar.f10068l.add(this.f10081b.f9546d.f10084e);
                                gVar.f10058a = this;
                            }
                        }
                    }
                }
            }
        }
        if (gVar.f10068l.size() == 0) {
            gVar.f10060c = true;
        }
    }

    @Override // R0.o
    public final void e() {
        f fVar = this.f10087h;
        if (fVar.f10067j) {
            this.f10081b.f9539Z = fVar.f10064g;
        }
    }

    @Override // R0.o
    public final void f() {
        this.f10082c = null;
        this.f10087h.c();
        this.f10088i.c();
        this.k.c();
        this.f10084e.c();
        this.f10086g = false;
    }

    @Override // R0.o
    public final boolean k() {
        return this.f10083d != 3 || this.f10081b.f9573s == 0;
    }

    public final void m() {
        this.f10086g = false;
        f fVar = this.f10087h;
        fVar.c();
        fVar.f10067j = false;
        f fVar2 = this.f10088i;
        fVar2.c();
        fVar2.f10067j = false;
        f fVar3 = this.k;
        fVar3.c();
        fVar3.f10067j = false;
        this.f10084e.f10067j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f10081b.f9555h0;
    }
}
