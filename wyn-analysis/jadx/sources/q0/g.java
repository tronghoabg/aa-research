package Q0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f9618A0;
    public R0.b B0;

    /* renamed from: C0, reason: collision with root package name */
    public T0.e f9619C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f9620D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f9621E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f9622F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f9623G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f9624H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f9625I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f9626J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f9627K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f9628L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f9629M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f9630N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f9631O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f9632P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f9633Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f9634R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f9635S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f9636T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f9637U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f9638V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f9639W0;

    /* renamed from: X0, reason: collision with root package name */
    public d[] f9640X0;

    /* renamed from: Y0, reason: collision with root package name */
    public d[] f9641Y0;
    public int[] Z0;

    /* renamed from: a1, reason: collision with root package name */
    public d[] f9642a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f9643b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f9644s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f9645t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f9646u0;
    public int v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f9647w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f9648x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f9649y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f9650z0;

    @Override // Q0.i
    public final void S() {
        for (int i5 = 0; i5 < this.f9657r0; i5++) {
            d dVar = this.f9656q0[i5];
            if (dVar != null) {
                dVar.f9520F = true;
            }
        }
    }

    public final int T(d dVar, int i5) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f9570p0;
            if (iArr[1] == 3) {
                int i10 = dVar.f9573s;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int i11 = (int) (dVar.f9580z * i5);
                        if (i11 != dVar.k()) {
                            dVar.f9552g = true;
                            V(iArr[0], dVar.q(), 1, i11, dVar);
                        }
                        return i11;
                    }
                    dVar2 = dVar;
                    if (i10 == 1) {
                        return dVar2.k();
                    }
                    if (i10 == 3) {
                        return (int) ((dVar2.q() * dVar2.f9536W) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.k();
        }
        return 0;
    }

    public final int U(d dVar, int i5) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f9570p0;
            if (iArr[0] == 3) {
                int i10 = dVar.f9572r;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int i11 = (int) (dVar.f9577w * i5);
                        if (i11 != dVar.q()) {
                            dVar.f9552g = true;
                            V(1, i11, iArr[1], dVar.k(), dVar);
                        }
                        return i11;
                    }
                    dVar2 = dVar;
                    if (i10 == 1) {
                        return dVar2.q();
                    }
                    if (i10 == 3) {
                        return (int) ((dVar2.k() * dVar2.f9536W) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.q();
        }
        return 0;
    }

    public final void V(int i5, int i10, int i11, int i12, d dVar) {
        T0.e eVar;
        d dVar2;
        while (true) {
            eVar = this.f9619C0;
            if (eVar != null || (dVar2 = this.f9533T) == null) {
                break;
            } else {
                this.f9619C0 = ((e) dVar2).f9596u0;
            }
        }
        R0.b bVar = this.B0;
        bVar.f10038a = i5;
        bVar.f10039b = i11;
        bVar.f10040c = i10;
        bVar.f10041d = i12;
        eVar.b(dVar, bVar);
        dVar.O(bVar.f10042e);
        dVar.L(bVar.f10043f);
        dVar.f9519E = bVar.f10045h;
        dVar.I(bVar.f10044g);
    }

    @Override // Q0.d
    public final void b(O0.c cVar, boolean z2) {
        d dVar;
        float f10;
        int i5;
        super.b(cVar, z2);
        d dVar2 = this.f9533T;
        boolean z10 = dVar2 != null && ((e) dVar2).v0;
        int i10 = this.f9636T0;
        ArrayList arrayList = this.f9639W0;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    ((f) arrayList.get(i11)).b(i11, z10, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        ((f) arrayList.get(i12)).b(i12, z10, i12 == size2 + (-1));
                        i12++;
                    }
                }
            } else if (this.Z0 != null && this.f9641Y0 != null && this.f9640X0 != null) {
                for (int i13 = 0; i13 < this.f9643b1; i13++) {
                    this.f9642a1[i13].D();
                }
                int[] iArr = this.Z0;
                int i14 = iArr[0];
                int i15 = iArr[1];
                float f11 = this.f9626J0;
                d dVar3 = null;
                int i16 = 0;
                while (i16 < i14) {
                    if (z10) {
                        i5 = (i14 - i16) - 1;
                        f10 = 1.0f - this.f9626J0;
                    } else {
                        f10 = f11;
                        i5 = i16;
                    }
                    d dVar4 = this.f9641Y0[i5];
                    if (dVar4 != null && dVar4.f9553g0 != 8) {
                        c cVar2 = dVar4.f9523I;
                        if (i16 == 0) {
                            dVar4.f(cVar2, this.f9523I, this.f9647w0);
                            dVar4.f9557i0 = this.f9620D0;
                            dVar4.f9547d0 = f10;
                        }
                        if (i16 == i14 - 1) {
                            dVar4.f(dVar4.f9525K, this.f9525K, this.f9648x0);
                        }
                        if (i16 > 0 && dVar3 != null) {
                            int i17 = this.f9632P0;
                            c cVar3 = dVar3.f9525K;
                            dVar4.f(cVar2, cVar3, i17);
                            dVar3.f(cVar3, cVar2, 0);
                        }
                        dVar3 = dVar4;
                    }
                    i16++;
                    f11 = f10;
                }
                for (int i18 = 0; i18 < i15; i18++) {
                    d dVar5 = this.f9640X0[i18];
                    if (dVar5 != null && dVar5.f9553g0 != 8) {
                        c cVar4 = dVar5.f9524J;
                        if (i18 == 0) {
                            dVar5.f(cVar4, this.f9524J, this.f9644s0);
                            dVar5.f9559j0 = this.f9621E0;
                            dVar5.f9549e0 = this.f9627K0;
                        }
                        if (i18 == i15 - 1) {
                            dVar5.f(dVar5.L, this.L, this.f9645t0);
                        }
                        if (i18 > 0 && dVar3 != null) {
                            int i19 = this.f9633Q0;
                            c cVar5 = dVar3.L;
                            dVar5.f(cVar4, cVar5, i19);
                            dVar3.f(cVar5, cVar4, 0);
                        }
                        dVar3 = dVar5;
                    }
                }
                for (int i20 = 0; i20 < i14; i20++) {
                    for (int i21 = 0; i21 < i15; i21++) {
                        int i22 = (i21 * i14) + i20;
                        if (this.f9638V0 == 1) {
                            i22 = (i20 * i15) + i21;
                        }
                        d[] dVarArr = this.f9642a1;
                        if (i22 < dVarArr.length && (dVar = dVarArr[i22]) != null && dVar.f9553g0 != 8) {
                            d dVar6 = this.f9641Y0[i20];
                            d dVar7 = this.f9640X0[i21];
                            if (dVar != dVar6) {
                                dVar.f(dVar.f9523I, dVar6.f9523I, 0);
                                dVar.f(dVar.f9525K, dVar6.f9525K, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.f(dVar.f9524J, dVar7.f9524J, 0);
                                dVar.f(dVar.L, dVar7.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z10, true);
        }
        this.f9649y0 = false;
    }
}
