package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class cut extends cxa {
    public static final cut a = new cut();

    private cut() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // defpackage.ctp
    public final ctq e(cts ctsVar, List list, long j) {
        int size = list.size();
        if (size == 0) {
            return ctsVar.eK(dle.d(j), dle.c(j), afbf.a, new cmj(4));
        }
        if (size == 1) {
            cuo cuoVarV = ((cto) list.get(0)).v(j);
            int i = cuoVarV.a;
            int iD = dle.d(j);
            int iB = dle.b(j);
            if (i < iD) {
                i = iD;
            }
            if (i <= iB) {
                iB = i;
            }
            int i2 = cuoVarV.b;
            int iC = dle.c(j);
            int iA = dle.a(j);
            if (i2 < iC) {
                i2 = iC;
            }
            if (i2 <= iA) {
                iA = i2;
            }
            return ctsVar.eK(iB, iA, afbf.a, new cep(cuoVarV, 11));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            cuo cuoVarV2 = ((cto) list.get(i3)).v(j);
            iMax = Math.max(cuoVarV2.a, iMax);
            iMax2 = Math.max(cuoVarV2.b, iMax2);
            arrayList.add(cuoVarV2);
        }
        int iD2 = dle.d(j);
        int iB2 = dle.b(j);
        if (iMax < iD2) {
            iMax = iD2;
        }
        if (iMax <= iB2) {
            iB2 = iMax;
        }
        int iC2 = dle.c(j);
        int iA2 = dle.a(j);
        if (iMax2 < iC2) {
            iMax2 = iC2;
        }
        if (iMax2 <= iA2) {
            iA2 = iMax2;
        }
        return ctsVar.eK(iB2, iA2, afbf.a, new chk(arrayList, 12));
    }
}
