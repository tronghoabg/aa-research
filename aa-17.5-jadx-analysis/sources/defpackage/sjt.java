package defpackage;

import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class sjt implements svy {
    private final /* synthetic */ int a;

    public /* synthetic */ sjt(int i) {
        this.a = i;
    }

    @Override // defpackage.svy
    public final svz a(Object obj) {
        zho zhoVar = null;
        if (this.a == 0) {
            sjv sjvVar = sjv.a;
            return spu.az(null);
        }
        ExperimentTokens experimentTokens = (ExperimentTokens) obj;
        yph yphVar = ldw.a;
        if (!experimentTokens.equals(ExperimentTokens.b) && experimentTokens != null) {
            abnp abnpVarN = zho.a.n();
            int[] iArr = experimentTokens.i;
            if (!uqw.K(iArr) || !uqw.K(null)) {
                abnp abnpVarN2 = zhn.a.n();
                if (iArr != null) {
                    for (int i : iArr) {
                        abnpVarN2.t();
                        zhn zhnVar = (zhn) abnpVarN2.b;
                        abod abodVar = zhnVar.b;
                        if (!abodVar.c()) {
                            zhnVar.b = abnv.G(abodVar);
                        }
                        zhnVar.b.g(i);
                    }
                }
                abms abmsVarF = ((zhn) abnpVarN2.q()).f();
                abnpVarN.t();
                zho zhoVar2 = (zho) abnpVarN.b;
                zhoVar2.b |= 1;
                zhoVar2.c = abmsVarF;
            }
            byte[] bArr = experimentTokens.d;
            if (bArr != null && bArr.length != 0) {
                abnpVarN.R(abms.v(bArr));
            }
            byte[][] bArr2 = experimentTokens.j;
            if (bArr2 != null) {
                for (byte[] bArr3 : bArr2) {
                    if (bArr3 != null && bArr3.length != 0) {
                        abnpVarN.R(abms.v(bArr3));
                    }
                }
            }
            byte[][] bArr4 = experimentTokens.l;
            if (bArr4 != null) {
                for (byte[] bArr5 : bArr4) {
                    if (bArr5 != null && bArr5.length != 0) {
                        abnpVarN.R(abms.v(bArr5));
                    }
                }
            }
            abnpVarN.t();
            zho zhoVar3 = (zho) abnpVarN.b;
            zhoVar3.b |= 4;
            zhoVar3.e = false;
            byte[][][] bArr6 = {experimentTokens.f, experimentTokens.g, experimentTokens.h};
            for (int i2 = 0; i2 < 3; i2++) {
                byte[][] bArr7 = bArr6[i2];
                if (bArr7 != null) {
                    List listAsList = Arrays.asList(bArr7);
                    xws xwsVar = abqg.a;
                    xws xwrVar = xwsVar.b;
                    if (xwrVar == null) {
                        xwrVar = new xwr(xwsVar);
                        xwsVar.b = xwrVar;
                    }
                    abnpVarN.Q(yrm.V(listAsList, xwrVar));
                }
            }
            zhoVar = (zho) abnpVarN.q();
        }
        return spu.az(zhoVar);
    }
}
