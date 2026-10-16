package defpackage;

/* loaded from: classes2.dex */
public final class czg extends cze {
    public static czg b;
    public dft c;

    private final int e(int i, int i2) {
        dft dftVar = this.c;
        dft dftVar2 = null;
        if (dftVar == null) {
            affa.d("layoutResult");
            dftVar = null;
        }
        int i3 = dftVar.i(i);
        dft dftVar3 = this.c;
        if (dftVar3 == null) {
            affa.d("layoutResult");
            dftVar3 = null;
        }
        int iQ = dftVar3.q(i3);
        dft dftVar4 = this.c;
        if (i2 != iQ) {
            if (dftVar4 == null) {
                affa.d("layoutResult");
            } else {
                dftVar2 = dftVar4;
            }
            return dftVar2.i(i);
        }
        if (dftVar4 == null) {
            affa.d("layoutResult");
        } else {
            dftVar2 = dftVar4;
        }
        return dftVar2.f(i, false) - 1;
    }

    @Override // defpackage.czj
    public final int[] c(int i) {
        int iG;
        if (a().length() > 0 && i < a().length()) {
            dft dftVar = this.c;
            if (i < 0) {
                if (dftVar == null) {
                    affa.d("layoutResult");
                    dftVar = null;
                }
                iG = dftVar.g(0);
            } else {
                if (dftVar == null) {
                    affa.d("layoutResult");
                    dftVar = null;
                }
                int iG2 = dftVar.g(i);
                iG = e(iG2, 2) == i ? iG2 : iG2 + 1;
            }
            dft dftVar2 = this.c;
            if (dftVar2 == null) {
                affa.d("layoutResult");
                dftVar2 = null;
            }
            if (iG < dftVar2.e()) {
                return b(e(iG, 2), e(iG, 1) + 1);
            }
        }
        return null;
    }

    @Override // defpackage.czj
    public final int[] d(int i) {
        int iG;
        if (a().length() > 0 && i > 0) {
            int length = a().length();
            dft dftVar = this.c;
            if (i > length) {
                if (dftVar == null) {
                    affa.d("layoutResult");
                    dftVar = null;
                }
                iG = dftVar.g(a().length());
            } else {
                if (dftVar == null) {
                    affa.d("layoutResult");
                    dftVar = null;
                }
                int iG2 = dftVar.g(i);
                iG = e(iG2, 1) + 1 == i ? iG2 : iG2 - 1;
            }
            if (iG >= 0) {
                return b(e(iG, 2), e(iG, 1) + 1);
            }
        }
        return null;
    }
}
