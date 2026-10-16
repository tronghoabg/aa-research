package defpackage;

import j$.util.Map;

/* loaded from: classes.dex */
public final class ccx extends cbu implements Map, cbg {
    public static final ccx d = new ccx(cce.a, 0);

    @Override // defpackage.cbu, defpackage.afas, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof bvf) {
            return super.containsKey((bvf) obj);
        }
        return false;
    }

    @Override // defpackage.afas, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof byr) {
            return super.containsValue((byr) obj);
        }
        return false;
    }

    public final Object f(bvf bvfVar) {
        return czz.al(this, bvfVar);
    }

    public final ccx g(bvf bvfVar, byr byrVar) {
        ccd ccdVarD = this.b.d(bvfVar.hashCode(), bvfVar, byrVar, 0);
        if (ccdVarD == null) {
            return this;
        }
        return new ccx(ccdVarD.a, this.c + ccdVarD.b);
    }

    @Override // defpackage.cbu, defpackage.afas, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof bvf) {
            return (byr) super.get((bvf) obj);
        }
        return null;
    }

    @Override // defpackage.afas, java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof bvf) ? obj2 : (byr) Map.CC.$default$getOrDefault(this, (bvf) obj, (byr) obj2);
    }
}
