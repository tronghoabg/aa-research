package V;

import N.AbstractC0723f0;
import N.N0;
import S.n;
import j$.util.Map;

/* loaded from: classes.dex */
public final class g extends S.e {

    /* renamed from: g, reason: collision with root package name */
    public h f12863g;

    @Override // S.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0723f0) {
            return super.containsKey((AbstractC0723f0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof N0) {
            return super.containsValue((N0) obj);
        }
        return false;
    }

    @Override // S.e, Q.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final h build() {
        n nVar = this.f10807c;
        h hVar = this.f12863g;
        if (nVar != hVar.f10800a) {
            this.f10806b = new U.b();
            hVar = new h(this.f10807c, this.f10810f);
        }
        this.f12863g = hVar;
        return hVar;
    }

    @Override // S.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0723f0) {
            return (N0) super.get((AbstractC0723f0) obj);
        }
        return null;
    }

    @Override // S.e, java.util.Map, j$.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0723f0) ? obj2 : (N0) Map.CC.$default$getOrDefault(this, (AbstractC0723f0) obj, (N0) obj2);
    }

    @Override // S.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC0723f0) {
            return (N0) super.remove((AbstractC0723f0) obj);
        }
        return null;
    }
}
