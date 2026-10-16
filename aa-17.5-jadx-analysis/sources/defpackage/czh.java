package defpackage;

import android.graphics.Rect;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class czh extends cze {
    public static czh b;
    public dft c;
    public ddu d;

    public czh() {
        new Rect();
    }

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
        int iE;
        dft dftVar = null;
        if (a().length() > 0 && i < a().length()) {
            try {
                ddu dduVar = this.d;
                if (dduVar == null) {
                    affa.d("node");
                    dduVar = null;
                }
                cjb cjbVarB = dduVar.b();
                int iRound = Math.round(cjbVarB.e - cjbVarB.c);
                int iE2 = afpt.e(0, i);
                dft dftVar2 = this.c;
                if (dftVar2 == null) {
                    affa.d("layoutResult");
                    dftVar2 = null;
                }
                int iG = dftVar2.g(iE2);
                dft dftVar3 = this.c;
                if (dftVar3 == null) {
                    affa.d("layoutResult");
                    dftVar3 = null;
                }
                float fD = dftVar3.d(iG) + iRound;
                dft dftVar4 = this.c;
                if (dftVar4 == null) {
                    affa.d("layoutResult");
                    dftVar4 = null;
                }
                dft dftVar5 = this.c;
                if (dftVar5 == null) {
                    affa.d("layoutResult");
                    dftVar5 = null;
                }
                float fD2 = dftVar4.d(dftVar5.e() - 1);
                dft dftVar6 = this.c;
                if (fD < fD2) {
                    if (dftVar6 == null) {
                        affa.d("layoutResult");
                    } else {
                        dftVar = dftVar6;
                    }
                    iE = dftVar.h(fD);
                } else {
                    if (dftVar6 == null) {
                        affa.d("layoutResult");
                    } else {
                        dftVar = dftVar6;
                    }
                    iE = dftVar.e();
                }
                return b(iE2, e(iE - 1, 1) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.czj
    public final int[] d(int i) {
        int iH;
        dft dftVar = null;
        if (a().length() > 0 && i > 0) {
            try {
                ddu dduVar = this.d;
                if (dduVar == null) {
                    affa.d("node");
                    dduVar = null;
                }
                cjb cjbVarB = dduVar.b();
                int iRound = Math.round(cjbVarB.e - cjbVarB.c);
                int iF = afpt.f(a().length(), i);
                dft dftVar2 = this.c;
                if (dftVar2 == null) {
                    affa.d("layoutResult");
                    dftVar2 = null;
                }
                int iG = dftVar2.g(iF);
                dft dftVar3 = this.c;
                if (dftVar3 == null) {
                    affa.d("layoutResult");
                    dftVar3 = null;
                }
                float fD = dftVar3.d(iG) - iRound;
                if (fD > BitmapDescriptorFactory.HUE_RED) {
                    dft dftVar4 = this.c;
                    if (dftVar4 == null) {
                        affa.d("layoutResult");
                    } else {
                        dftVar = dftVar4;
                    }
                    iH = dftVar.h(fD);
                } else {
                    iH = 0;
                }
                if (iF == a().length() && iH < iG) {
                    iH++;
                }
                return b(e(iH, 2), iF);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }
}
