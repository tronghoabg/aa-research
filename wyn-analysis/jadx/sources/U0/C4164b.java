package u0;

import java.text.BreakIterator;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4164b extends J4.d {

    /* renamed from: f, reason: collision with root package name */
    public static C4164b f46194f;

    /* renamed from: g, reason: collision with root package name */
    public static C4164b f46195g;

    /* renamed from: h, reason: collision with root package name */
    public static C4164b f46196h;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f46197d;

    /* renamed from: e, reason: collision with root package name */
    public Object f46198e;

    @Override // J4.d
    public final int[] f(int i5) {
        int iB;
        switch (this.f46197d) {
            case 0:
                int length = j().length();
                if (length <= 0 || i5 >= length) {
                    return null;
                }
                if (i5 < 0) {
                    i5 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f46198e;
                    if (breakIterator == null) {
                        AbstractC3340k.m("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i5)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f46198e;
                        if (breakIterator2 == null) {
                            AbstractC3340k.m("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i5);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return i(i5, iFollowing);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f46198e;
                    if (breakIterator3 == null) {
                        AbstractC3340k.m("impl");
                        throw null;
                    }
                    i5 = breakIterator3.following(i5);
                } while (i5 != -1);
                return null;
            case 1:
                if (j().length() <= 0 || i5 >= j().length()) {
                    return null;
                }
                if (i5 < 0) {
                    i5 = 0;
                }
                while (!r(i5) && (!r(i5) || (i5 != 0 && r(i5 - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f46198e;
                    if (breakIterator4 == null) {
                        AbstractC3340k.m("impl");
                        throw null;
                    }
                    i5 = breakIterator4.following(i5);
                    if (i5 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f46198e;
                if (breakIterator5 == null) {
                    AbstractC3340k.m("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i5);
                if (iFollowing2 == -1 || !q(iFollowing2)) {
                    return null;
                }
                return i(i5, iFollowing2);
            default:
                if (j().length() <= 0 || i5 >= j().length()) {
                    return null;
                }
                if (i5 < 0) {
                    z0.n nVar = (z0.n) this.f46198e;
                    if (nVar == null) {
                        AbstractC3340k.m("layoutResult");
                        throw null;
                    }
                    iB = nVar.b(0);
                } else {
                    z0.n nVar2 = (z0.n) this.f46198e;
                    if (nVar2 == null) {
                        AbstractC3340k.m("layoutResult");
                        throw null;
                    }
                    int iB2 = nVar2.b(i5);
                    iB = o(iB2, 2) == i5 ? iB2 : iB2 + 1;
                }
                z0.n nVar3 = (z0.n) this.f46198e;
                if (nVar3 == null) {
                    AbstractC3340k.m("layoutResult");
                    throw null;
                }
                if (iB >= nVar3.f48329b.f48279f) {
                    return null;
                }
                return i(o(iB, 2), o(iB, 1) + 1);
        }
    }

    @Override // J4.d
    public final int[] m(int i5) {
        int iB;
        switch (this.f46197d) {
            case 0:
                int length = j().length();
                if (length <= 0 || i5 <= 0) {
                    return null;
                }
                if (i5 > length) {
                    i5 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f46198e;
                    if (breakIterator == null) {
                        AbstractC3340k.m("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i5)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f46198e;
                        if (breakIterator2 == null) {
                            AbstractC3340k.m("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i5);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return i(iPreceding, i5);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f46198e;
                    if (breakIterator3 == null) {
                        AbstractC3340k.m("impl");
                        throw null;
                    }
                    i5 = breakIterator3.preceding(i5);
                } while (i5 != -1);
                return null;
            case 1:
                int length2 = j().length();
                if (length2 <= 0 || i5 <= 0) {
                    return null;
                }
                if (i5 > length2) {
                    i5 = length2;
                }
                while (i5 > 0 && !r(i5 - 1) && !q(i5)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f46198e;
                    if (breakIterator4 == null) {
                        AbstractC3340k.m("impl");
                        throw null;
                    }
                    i5 = breakIterator4.preceding(i5);
                    if (i5 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f46198e;
                if (breakIterator5 == null) {
                    AbstractC3340k.m("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i5);
                if (iPreceding2 == -1 || !r(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !r(iPreceding2 - 1)) {
                    return i(iPreceding2, i5);
                }
                return null;
            default:
                if (j().length() <= 0 || i5 <= 0) {
                    return null;
                }
                if (i5 > j().length()) {
                    z0.n nVar = (z0.n) this.f46198e;
                    if (nVar == null) {
                        AbstractC3340k.m("layoutResult");
                        throw null;
                    }
                    iB = nVar.b(j().length());
                } else {
                    z0.n nVar2 = (z0.n) this.f46198e;
                    if (nVar2 == null) {
                        AbstractC3340k.m("layoutResult");
                        throw null;
                    }
                    int iB2 = nVar2.b(i5);
                    iB = o(iB2, 1) + 1 == i5 ? iB2 : iB2 - 1;
                }
                if (iB < 0) {
                    return null;
                }
                return i(o(iB, 2), o(iB, 1) + 1);
        }
    }

    public int o(int i5, int i10) {
        z0.n nVar = (z0.n) this.f46198e;
        if (nVar == null) {
            AbstractC3340k.m("layoutResult");
            throw null;
        }
        int iD = nVar.d(i5);
        z0.n nVar2 = (z0.n) this.f46198e;
        if (nVar2 == null) {
            AbstractC3340k.m("layoutResult");
            throw null;
        }
        if (i10 != nVar2.f(iD)) {
            z0.n nVar3 = (z0.n) this.f46198e;
            if (nVar3 != null) {
                return nVar3.d(i5);
            }
            AbstractC3340k.m("layoutResult");
            throw null;
        }
        if (((z0.n) this.f46198e) != null) {
            return z0.n.a(r6, i5) - 1;
        }
        AbstractC3340k.m("layoutResult");
        throw null;
    }

    public void p(String text) {
        switch (this.f46197d) {
            case 0:
                AbstractC3340k.e(text, "text");
                this.f5598b = text;
                BreakIterator breakIterator = (BreakIterator) this.f46198e;
                if (breakIterator != null) {
                    breakIterator.setText(text);
                    return;
                } else {
                    AbstractC3340k.m("impl");
                    throw null;
                }
            default:
                AbstractC3340k.e(text, "text");
                this.f5598b = text;
                BreakIterator breakIterator2 = (BreakIterator) this.f46198e;
                if (breakIterator2 != null) {
                    breakIterator2.setText(text);
                    return;
                } else {
                    AbstractC3340k.m("impl");
                    throw null;
                }
        }
    }

    public boolean q(int i5) {
        if (i5 <= 0 || !r(i5 - 1)) {
            return false;
        }
        return i5 == j().length() || !r(i5);
    }

    public boolean r(int i5) {
        if (i5 < 0 || i5 >= j().length()) {
            return false;
        }
        return Character.isLetterOrDigit(j().codePointAt(i5));
    }
}
