package S;

import java.util.NoSuchElementException;
import uf.InterfaceC4294d;

/* loaded from: classes.dex */
public final class b extends a implements InterfaceC4294d {

    /* renamed from: c, reason: collision with root package name */
    public final h f10797c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10798d;

    public b(h hVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.f10797c = hVar;
        this.f10798d = obj2;
    }

    @Override // S.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f10798d;
    }

    @Override // S.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f10798d;
        this.f10798d = obj;
        f fVar = (f) this.f10797c.f10818b;
        e eVar = fVar.f10811d;
        Object obj3 = this.f10795a;
        if (!eVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z2 = fVar.f10804c;
        if (!z2) {
            eVar.put(obj3, obj);
        } else {
            if (!z2) {
                throw new NoSuchElementException();
            }
            o oVar = fVar.f10802a[fVar.f10803b];
            Object obj4 = oVar.f10829a[oVar.f10831c];
            eVar.put(obj3, obj);
            fVar.d(obj4 != null ? obj4.hashCode() : 0, eVar.f10807c, obj4, 0);
        }
        fVar.f10814g = eVar.f10809e;
        return obj2;
    }
}
