package defpackage;

import j$.util.Map;

/* loaded from: classes.dex */
public final class ccw extends cbw implements Map, java.util.Map, afgg {
    private ccx f;

    public ccw(ccx ccxVar) {
        super(ccxVar);
        this.f = ccxVar;
    }

    @Override // defpackage.cbw, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof bvf) {
            return super.containsKey((bvf) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof byr) {
            return super.containsValue((byr) obj);
        }
        return false;
    }

    @Override // defpackage.cbw
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final ccx b() {
        cce cceVar = this.a;
        ccx ccxVar = this.f;
        if (cceVar != ccxVar.b) {
            this.e = new czz();
            ccxVar = new ccx(cceVar, this.d);
        }
        this.f = ccxVar;
        return ccxVar;
    }

    @Override // defpackage.cbw, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof bvf) {
            return (byr) super.get((bvf) obj);
        }
        return null;
    }

    @Override // defpackage.cbw, java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof bvf) ? obj2 : (byr) Map.CC.$default$getOrDefault(this, (bvf) obj, (byr) obj2);
    }

    @Override // defpackage.cbw, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof bvf) {
            return (byr) super.remove((bvf) obj);
        }
        return null;
    }
}
