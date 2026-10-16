package T5;

import E5.S;
import E5.T;
import N1.C0764m;
import Va.M6;
import java.util.Collections;
import java.util.List;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class e implements f, Y2.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11527a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11528b;

    /* renamed from: c, reason: collision with root package name */
    public long f11529c;

    /* renamed from: d, reason: collision with root package name */
    public int f11530d;

    /* renamed from: e, reason: collision with root package name */
    public int f11531e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f11532f;

    /* renamed from: g, reason: collision with root package name */
    public Object f11533g;

    public e(int i5, List list) {
        this.f11527a = i5;
        switch (i5) {
            case 2:
                this.f11532f = list;
                this.f11533g = new s2.C[list.size()];
                this.f11529c = -9223372036854775807L;
                break;
            default:
                this.f11532f = list;
                this.f11533g = new J5.w[list.size()];
                this.f11529c = -9223372036854775807L;
                break;
        }
    }

    @Override // T5.f
    public final void a() {
        switch (this.f11527a) {
            case 0:
                this.f11528b = false;
                this.f11529c = -9223372036854775807L;
                break;
            case 1:
                this.f11528b = false;
                this.f11529c = -9223372036854775807L;
                break;
            case 2:
                this.f11528b = false;
                this.f11529c = -9223372036854775807L;
                break;
            default:
                this.f11528b = false;
                this.f11529c = -9223372036854775807L;
                break;
        }
    }

    @Override // T5.f
    public void c(Y4.b bVar) {
        boolean z2;
        boolean z10;
        switch (this.f11527a) {
            case 0:
                if (this.f11528b) {
                    if (this.f11530d == 2) {
                        if (bVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (bVar.q() != 32) {
                                this.f11528b = false;
                            }
                            this.f11530d--;
                            z10 = this.f11528b;
                        }
                        if (!z10) {
                        }
                    }
                    if (this.f11530d == 1) {
                        if (bVar.a() == 0) {
                            z2 = false;
                        } else {
                            if (bVar.q() != 0) {
                                this.f11528b = false;
                            }
                            this.f11530d--;
                            z2 = this.f11528b;
                        }
                        if (!z2) {
                        }
                    }
                    int i5 = bVar.f16680b;
                    int iA = bVar.a();
                    for (J5.w wVar : (J5.w[]) this.f11533g) {
                        bVar.A(i5);
                        wVar.c(iA, bVar);
                    }
                    this.f11531e += iA;
                    break;
                }
                break;
            default:
                AbstractC4256a.j((J5.w) this.f11533g);
                if (this.f11528b) {
                    int iA2 = bVar.a();
                    int i10 = this.f11531e;
                    if (i10 < 10) {
                        int iMin = Math.min(iA2, 10 - i10);
                        byte[] bArr = bVar.f16679a;
                        int i11 = bVar.f16680b;
                        Y4.b bVar2 = (Y4.b) this.f11532f;
                        System.arraycopy(bArr, i11, bVar2.f16679a, this.f11531e, iMin);
                        if (this.f11531e + iMin == 10) {
                            bVar2.A(0);
                            if (73 != bVar2.q() || 68 != bVar2.q() || 51 != bVar2.q()) {
                                AbstractC4256a.E("Id3Reader", "Discarding invalid ID3 tag");
                                this.f11528b = false;
                                break;
                            } else {
                                bVar2.B(3);
                                this.f11530d = bVar2.p() + 10;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.f11530d - this.f11531e);
                    ((J5.w) this.f11533g).c(iMin2, bVar);
                    this.f11531e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // T5.f
    public final void d(int i5, long j8) {
        switch (this.f11527a) {
            case 0:
                if ((i5 & 4) != 0) {
                    this.f11528b = true;
                    if (j8 != -9223372036854775807L) {
                        this.f11529c = j8;
                    }
                    this.f11531e = 0;
                    this.f11530d = 2;
                    break;
                }
                break;
            case 1:
                if ((i5 & 4) != 0) {
                    this.f11528b = true;
                    if (j8 != -9223372036854775807L) {
                        this.f11529c = j8;
                    }
                    this.f11530d = 0;
                    this.f11531e = 0;
                    break;
                }
                break;
            case 2:
                if ((i5 & 4) != 0) {
                    this.f11528b = true;
                    this.f11529c = j8;
                    this.f11531e = 0;
                    this.f11530d = 2;
                    break;
                }
                break;
            default:
                if ((i5 & 4) != 0) {
                    this.f11528b = true;
                    this.f11529c = j8;
                    this.f11530d = 0;
                    this.f11531e = 0;
                    break;
                }
                break;
        }
    }

    @Override // Y2.h
    public void e(Q1.o oVar) {
        boolean z2;
        boolean z10;
        switch (this.f11527a) {
            case 2:
                if (this.f11528b) {
                    if (this.f11530d == 2) {
                        if (oVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (oVar.u() != 32) {
                                this.f11528b = false;
                            }
                            this.f11530d--;
                            z10 = this.f11528b;
                        }
                        if (!z10) {
                        }
                    }
                    if (this.f11530d == 1) {
                        if (oVar.a() == 0) {
                            z2 = false;
                        } else {
                            if (oVar.u() != 0) {
                                this.f11528b = false;
                            }
                            this.f11530d--;
                            z2 = this.f11528b;
                        }
                        if (!z2) {
                        }
                    }
                    int i5 = oVar.f9703b;
                    int iA = oVar.a();
                    for (s2.C c10 : (s2.C[]) this.f11533g) {
                        oVar.G(i5);
                        c10.e(iA, oVar);
                    }
                    this.f11531e += iA;
                    break;
                }
                break;
            default:
                Q1.k.h((s2.C) this.f11533g);
                if (this.f11528b) {
                    int iA2 = oVar.a();
                    int i10 = this.f11531e;
                    if (i10 < 10) {
                        int iMin = Math.min(iA2, 10 - i10);
                        byte[] bArr = oVar.f9702a;
                        int i11 = oVar.f9703b;
                        Q1.o oVar2 = (Q1.o) this.f11532f;
                        System.arraycopy(bArr, i11, oVar2.f9702a, this.f11531e, iMin);
                        if (this.f11531e + iMin == 10) {
                            oVar2.G(0);
                            if (73 != oVar2.u() || 68 != oVar2.u() || 51 != oVar2.u()) {
                                Q1.k.w("Id3Reader", "Discarding invalid ID3 tag");
                                this.f11528b = false;
                                break;
                            } else {
                                oVar2.H(3);
                                this.f11530d = oVar2.t() + 10;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.f11530d - this.f11531e);
                    ((s2.C) this.f11533g).e(iMin2, oVar);
                    this.f11531e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // Y2.h
    public void f(s2.o oVar, B b5) {
        switch (this.f11527a) {
            case 2:
                int i5 = 0;
                while (true) {
                    s2.C[] cArr = (s2.C[]) this.f11533g;
                    if (i5 >= cArr.length) {
                        break;
                    } else {
                        Y2.z zVar = (Y2.z) ((List) this.f11532f).get(i5);
                        b5.a();
                        b5.b();
                        s2.C cMo0m = oVar.mo0m(b5.f11473e, 3);
                        C0764m c0764m = new C0764m();
                        b5.b();
                        c0764m.f8183a = b5.f11474f;
                        c0764m.f8194m = N1.C.m("application/dvbsubs");
                        c0764m.f8197p = Collections.singletonList(zVar.f16629b);
                        c0764m.f8186d = zVar.f16628a;
                        M6.y(c0764m, cMo0m);
                        cArr[i5] = cMo0m;
                        i5++;
                    }
                }
            default:
                b5.a();
                b5.b();
                s2.C cMo0m2 = oVar.mo0m(b5.f11473e, 5);
                this.f11533g = cMo0m2;
                C0764m c0764m2 = new C0764m();
                b5.b();
                c0764m2.f8183a = b5.f11474f;
                c0764m2.f8194m = N1.C.m("application/id3");
                M6.y(c0764m2, cMo0m2);
                break;
        }
    }

    @Override // T5.f
    public void g(J5.m mVar, B b5) {
        switch (this.f11527a) {
            case 0:
                int i5 = 0;
                while (true) {
                    J5.w[] wVarArr = (J5.w[]) this.f11533g;
                    if (i5 >= wVarArr.length) {
                        break;
                    } else {
                        A a5 = (A) ((List) this.f11532f).get(i5);
                        b5.a();
                        b5.b();
                        J5.w wVarM = mVar.m(b5.f11473e, 3);
                        S s10 = new S();
                        b5.b();
                        s10.f3195a = b5.f11474f;
                        s10.k = "application/dvbsubs";
                        s10.f3206m = Collections.singletonList(a5.f11468b);
                        s10.f3197c = a5.f11467a;
                        wVarM.a(new T(s10));
                        wVarArr[i5] = wVarM;
                        i5++;
                    }
                }
            default:
                b5.a();
                b5.b();
                J5.w wVarM2 = mVar.m(b5.f11473e, 5);
                this.f11533g = wVarM2;
                S s11 = new S();
                b5.b();
                s11.f3195a = b5.f11474f;
                s11.k = "application/id3";
                wVarM2.a(new T(s11));
                break;
        }
    }

    @Override // Y2.h
    public void h(boolean z2) {
        int i5;
        switch (this.f11527a) {
            case 2:
                if (this.f11528b) {
                    Q1.k.g(this.f11529c != -9223372036854775807L);
                    for (s2.C c10 : (s2.C[]) this.f11533g) {
                        c10.a(this.f11529c, 1, this.f11531e, 0, null);
                    }
                    this.f11528b = false;
                    break;
                }
                break;
            default:
                Q1.k.h((s2.C) this.f11533g);
                if (this.f11528b && (i5 = this.f11530d) != 0 && this.f11531e == i5) {
                    Q1.k.g(this.f11529c != -9223372036854775807L);
                    ((s2.C) this.f11533g).a(this.f11529c, 1, this.f11530d, 0, null);
                    this.f11528b = false;
                    break;
                }
                break;
        }
    }

    @Override // T5.f
    public void i() {
        int i5;
        switch (this.f11527a) {
            case 0:
                if (this.f11528b) {
                    if (this.f11529c != -9223372036854775807L) {
                        for (J5.w wVar : (J5.w[]) this.f11533g) {
                            wVar.b(this.f11529c, 1, this.f11531e, 0, null);
                        }
                    }
                    this.f11528b = false;
                    break;
                }
                break;
            default:
                AbstractC4256a.j((J5.w) this.f11533g);
                if (this.f11528b && (i5 = this.f11530d) != 0 && this.f11531e == i5) {
                    long j8 = this.f11529c;
                    if (j8 != -9223372036854775807L) {
                        ((J5.w) this.f11533g).b(j8, 1, i5, 0, null);
                    }
                    this.f11528b = false;
                    break;
                }
                break;
        }
    }

    public e(int i5) {
        this.f11527a = i5;
        switch (i5) {
            case 3:
                this.f11532f = new Q1.o(10);
                this.f11529c = -9223372036854775807L;
                break;
            default:
                this.f11532f = new Y4.b(10);
                this.f11529c = -9223372036854775807L;
                break;
        }
    }
}
