package defpackage;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class unq {
    public final yfy a;
    public final String b;
    public final zdg c;
    public final yfy d;
    public final int e;
    public final abft f;
    public Map g = new HashMap();
    public final String h;

    /* JADX WARN: Multi-variable type inference failed */
    public unq(abfu abfuVar, String str) {
        abft abftVarB = abft.b(abfuVar.d);
        this.f = abftVarB == null ? abft.MULTIZOOM_STYLE_TABLE : abftVarB;
        EnumMap enumMap = new EnumMap(ujk.class);
        for (int i = 0; i < abfuVar.c.size(); i++) {
            abgy abgyVar = (abgy) abfuVar.c.get(i);
            abgx abgxVarB = abgx.b(abgyVar.c);
            int i2 = (abgxVarB == null ? abgx.UNKNOWN : abgxVarB).aj;
            ujk[] ujkVarArr = uns.b;
            int length = ujkVarArr.length;
            ujk ujkVar = ujkVarArr[i2];
            if (ujkVar != null && (abgyVar.b & 2) != 0) {
                enumMap.put((EnumMap) ujkVar, (ujk) abgyVar.d);
            }
        }
        this.a = yrm.F(enumMap);
        this.h = str;
        this.b = abfuVar.e;
        abfy abfyVar = abfuVar.f;
        abod abodVar = (abfyVar == null ? abfy.a : abfyVar).b;
        zdg zdgVar = zdg.a;
        this.c = abodVar.isEmpty() ? zdg.a : new zdg(wub.ay(abodVar));
        this.e = abfuVar.hashCode();
        yfu yfuVar = new yfu(4);
        abfy abfyVar2 = abfuVar.f;
        for (abfx abfxVar : (abfyVar2 == null ? abfy.a : abfyVar2).c) {
            yfuVar.e(Integer.valueOf(abfxVar.c), Integer.valueOf(abfxVar.d));
        }
        this.d = yfuVar.d(true);
    }
}
