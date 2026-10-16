package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class cdo implements cdm {
    public static final cdt d = new cdt(new abp(11), new bwr(3));
    public final Map a;
    public cdp b;
    public final aan c;
    private final afec e;

    public cdo(Map map) {
        this.a = map;
        long[] jArr = aao.a;
        this.c = new aan(6);
        this.e = new bji(this, 19);
    }

    @Override // defpackage.cdm
    public final void c(Object obj, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(533563200);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(obj) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(this) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            buxVarC.L(obj);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj2 = buw.a;
            if (objS == obj2) {
                afec afecVar = this.e;
                if (!((Boolean) afecVar.invoke(obj)).booleanValue()) {
                    throw new IllegalArgumentException(a.bm(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle."));
                }
                cds cdsVar = new cds(new cdq((Map) this.a.get(obj), afecVar));
                bvvVar.ad(cdsVar);
                objS = cdsVar;
            }
            cds cdsVar2 = (cds) objS;
            czz.an(new bxe[]{cdr.a.b(cdsVar2), fbi.a.b(cdsVar2)}, afegVar, buxVarC, (i2 & 112) | 8);
            afak afakVar = afak.a;
            boolean zE = buxVarC.E(this) | buxVarC.E(obj) | buxVarC.E(cdsVar2);
            Object objS2 = bvvVar.S();
            if (zE || objS2 == obj2) {
                acg acgVar = new acg((Object) this, obj, (Object) cdsVar2, 13, (char[]) null);
                bvvVar.ad(acgVar);
                objS2 = acgVar;
            }
            bvq.c(afakVar, (afec) objS2, buxVarC);
            buxVarC.q();
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new alu(this, obj, afegVar, i, 8, null);
        }
    }

    public cdo() {
        this((byte[]) null);
    }

    public /* synthetic */ cdo(byte[] bArr) {
        this(new LinkedHashMap());
    }
}
