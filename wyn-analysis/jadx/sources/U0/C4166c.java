package u0;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.AbstractC3340k;
import vf.AbstractC4345a;
import x0.C4441k;

/* renamed from: u0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4166c extends J4.d {

    /* renamed from: f, reason: collision with root package name */
    public static C4166c f46200f;

    /* renamed from: d, reason: collision with root package name */
    public z0.n f46201d;

    /* renamed from: e, reason: collision with root package name */
    public C4441k f46202e;

    @Override // J4.d
    public final int[] f(int i5) {
        int iC;
        if (j().length() > 0 && i5 < j().length()) {
            try {
                C4441k c4441k = this.f46202e;
                if (c4441k == null) {
                    AbstractC3340k.m("node");
                    throw null;
                }
                int iH = AbstractC4345a.H(c4441k.d().b());
                if (i5 <= 0) {
                    i5 = 0;
                }
                z0.n nVar = this.f46201d;
                if (nVar == null) {
                    AbstractC3340k.m("layoutResult");
                    throw null;
                }
                int iB = nVar.b(i5);
                z0.n nVar2 = this.f46201d;
                if (nVar2 == null) {
                    AbstractC3340k.m("layoutResult");
                    throw null;
                }
                float fE = nVar2.e(iB) + iH;
                z0.n nVar3 = this.f46201d;
                if (nVar3 == null) {
                    AbstractC3340k.m("layoutResult");
                    throw null;
                }
                if (fE < nVar3.e(nVar3.f48329b.f48279f - 1)) {
                    z0.n nVar4 = this.f46201d;
                    if (nVar4 == null) {
                        AbstractC3340k.m("layoutResult");
                        throw null;
                    }
                    iC = nVar4.c(fE);
                } else {
                    z0.n nVar5 = this.f46201d;
                    if (nVar5 == null) {
                        AbstractC3340k.m("layoutResult");
                        throw null;
                    }
                    iC = nVar5.f48329b.f48279f;
                }
                return i(i5, o(iC - 1, 1) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // J4.d
    public final int[] m(int i5) {
        int iC;
        if (j().length() > 0 && i5 > 0) {
            try {
                C4441k c4441k = this.f46202e;
                if (c4441k == null) {
                    AbstractC3340k.m("node");
                    throw null;
                }
                int iH = AbstractC4345a.H(c4441k.d().b());
                int length = j().length();
                if (length <= i5) {
                    i5 = length;
                }
                z0.n nVar = this.f46201d;
                if (nVar == null) {
                    AbstractC3340k.m("layoutResult");
                    throw null;
                }
                int iB = nVar.b(i5);
                z0.n nVar2 = this.f46201d;
                if (nVar2 == null) {
                    AbstractC3340k.m("layoutResult");
                    throw null;
                }
                float fE = nVar2.e(iB) - iH;
                if (fE > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    z0.n nVar3 = this.f46201d;
                    if (nVar3 == null) {
                        AbstractC3340k.m("layoutResult");
                        throw null;
                    }
                    iC = nVar3.c(fE);
                } else {
                    iC = 0;
                }
                if (i5 == j().length() && iC < iB) {
                    iC++;
                }
                return i(o(iC, 2), i5);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int o(int i5, int i10) {
        z0.n nVar = this.f46201d;
        if (nVar == null) {
            AbstractC3340k.m("layoutResult");
            throw null;
        }
        int iD = nVar.d(i5);
        z0.n nVar2 = this.f46201d;
        if (nVar2 == null) {
            AbstractC3340k.m("layoutResult");
            throw null;
        }
        if (i10 != nVar2.f(iD)) {
            z0.n nVar3 = this.f46201d;
            if (nVar3 != null) {
                return nVar3.d(i5);
            }
            AbstractC3340k.m("layoutResult");
            throw null;
        }
        if (this.f46201d != null) {
            return z0.n.a(r6, i5) - 1;
        }
        AbstractC3340k.m("layoutResult");
        throw null;
    }
}
