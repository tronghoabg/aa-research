package O;

import N.C0716c;
import N.C0718d;
import N.C0729i0;
import N.r0;
import N.y0;
import java.util.ArrayList;
import q.s1;

/* loaded from: classes.dex */
public final class l extends A {

    /* renamed from: e, reason: collision with root package name */
    public static final l f8731e;

    /* renamed from: g, reason: collision with root package name */
    public static final l f8733g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8734c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f8730d = new l(1, 2, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final l f8732f = new l(1, 2, 2);

    static {
        int i5 = 1;
        f8731e = new l(i5, i5, 1);
        int i10 = 1;
        f8733g = new l(i10, i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i5, int i10, int i11) {
        super(i5, i10);
        this.f8734c = i11;
    }

    @Override // O.A
    public final void a(G4.f fVar, E9.c cVar, y0 y0Var, s1 s1Var) {
        int iC;
        int iO;
        switch (this.f8734c) {
            case 0:
                Object objInvoke = ((tf.a) fVar.f(0)).invoke();
                C0716c c0716c = (C0716c) fVar.f(1);
                int iE = fVar.e(0);
                c0716c.getClass();
                y0Var.J(y0Var.c(c0716c), objInvoke);
                cVar.m(iE, objInvoke);
                cVar.e(objInvoke);
                break;
            case 1:
                C0716c c0716c2 = (C0716c) fVar.f(0);
                int iE2 = fVar.e(0);
                cVar.u();
                c0716c2.getClass();
                int iP = y0Var.p(y0Var.c(c0716c2));
                cVar.l(iE2, C0718d.m(iP, y0Var.f7967b) ? y0Var.f7968c[y0Var.g(y0Var.f(iP, y0Var.f7967b))] : null);
                break;
            case 2:
                Object objF = fVar.f(0);
                C0716c c0716c3 = (C0716c) fVar.f(1);
                int iE3 = fVar.e(0);
                if (objF instanceof r0) {
                    ((ArrayList) s1Var.f43897b).add(((r0) objF).f7902a);
                }
                int iC2 = y0Var.c(c0716c3);
                int iG = y0Var.g(y0Var.D(iC2, iE3));
                Object[] objArr = y0Var.f7968c;
                Object obj = objArr[iG];
                objArr[iG] = objF;
                if (!(obj instanceof r0)) {
                    if (obj instanceof C0729i0) {
                        ((C0729i0) obj).d();
                        break;
                    }
                } else {
                    int iO2 = y0Var.o() - y0Var.D(iC2, iE3);
                    r0 r0Var = (r0) obj;
                    C0716c c0716c4 = r0Var.f7903b;
                    if (c0716c4 == null || !c0716c4.a()) {
                        iC = -1;
                        iO = -1;
                    } else {
                        iC = y0Var.c(c0716c4);
                        iO = y0Var.o() - y0Var.f(y0Var.p(y0Var.q(iC) + iC), y0Var.f7967b);
                    }
                    s1Var.l(r0Var.f7902a, iO2, iC, iO);
                    break;
                }
                break;
            default:
                Object objF2 = fVar.f(0);
                int iE4 = fVar.e(0);
                if (objF2 instanceof r0) {
                    ((ArrayList) s1Var.f43897b).add(((r0) objF2).f7902a);
                }
                int iG2 = y0Var.g(y0Var.D(y0Var.f7983s, iE4));
                Object[] objArr2 = y0Var.f7968c;
                Object obj2 = objArr2[iG2];
                objArr2[iG2] = objF2;
                if (!(obj2 instanceof r0)) {
                    if (obj2 instanceof C0729i0) {
                        ((C0729i0) obj2).d();
                        break;
                    }
                } else {
                    s1Var.l(((r0) obj2).f7902a, y0Var.o() - y0Var.D(y0Var.f7983s, iE4), -1, -1);
                    break;
                }
                break;
        }
    }

    @Override // O.A
    public final String b(int i5) {
        switch (this.f8734c) {
            case 0:
                if (i5 != 0) {
                    break;
                }
                break;
            case 1:
                if (i5 != 0) {
                    break;
                }
                break;
            case 2:
                if (i5 != 0) {
                    break;
                }
                break;
            default:
                if (i5 != 0) {
                    break;
                }
                break;
        }
        return super.b(i5);
    }

    @Override // O.A
    public final String c(int i5) {
        switch (this.f8734c) {
            case 0:
                if (i5 != 0) {
                    if (i5 != 1) {
                        break;
                    }
                }
                break;
            case 1:
                if (i5 != 0) {
                    break;
                }
                break;
            case 2:
                if (i5 != 0) {
                    if (i5 != 1) {
                        break;
                    }
                }
                break;
            default:
                if (i5 != 0) {
                    break;
                }
                break;
        }
        return super.c(i5);
    }
}
