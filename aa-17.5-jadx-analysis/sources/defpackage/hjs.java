package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hjs {
    public static final hjs a = new hjs();
    private static final Map b = new LinkedHashMap();

    public static final void b(afhe afheVar, afei afeiVar) {
        afheVar.getClass();
        b.put(afheVar, new cct(-2138582647, true, new dxm(afeiVar, 3)));
    }

    public final void a(hju hjuVar, cfy cfyVar, bux buxVar, int i, int i2) {
        int i3;
        hjuVar.getClass();
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-217446702);
        if (i4 == 0) {
            i3 = (true != ((i & 8) == 0 ? buxVarC.C(hjuVar) : buxVarC.E(hjuVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.C(this) ? 128 : 256;
        }
        if (buxVarC.I((i3 & 147) != 146, i3 & 1)) {
            if (i5 != 0) {
                cfyVar = cfy.e;
            }
            afei afeiVar = (afei) b.get(affw.b(hjuVar.getClass()));
            if (afeiVar == null) {
                Class<?> cls = hjuVar.getClass();
                Objects.toString(cls);
                throw new NullPointerException("No registered composable for ".concat(String.valueOf(cls)));
            }
            afeiVar.invoke(hjuVar, cfyVar, buxVarC, Integer.valueOf(i3 & 126));
        } else {
            buxVarC.s();
        }
        cfy cfyVar2 = cfyVar;
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new dmi(this, hjuVar, cfyVar2, i, i2, 4);
        }
    }
}
