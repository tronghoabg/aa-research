package S;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends ff.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10815a;

    /* renamed from: b, reason: collision with root package name */
    public final e f10816b;

    public /* synthetic */ g(int i5, e eVar) {
        this.f10815a = i5;
        this.f10816b = eVar;
    }

    @Override // ff.i
    public final int a() {
        switch (this.f10815a) {
            case 0:
                e eVar = this.f10816b;
                eVar.getClass();
                return eVar.f10810f;
            default:
                e eVar2 = this.f10816b;
                eVar2.getClass();
                return eVar2.f10810f;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f10815a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f10815a) {
            case 0:
                this.f10816b.clear();
                break;
            default:
                this.f10816b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f10815a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!((entry instanceof Object ? entry : null) instanceof Map.Entry)) {
                    return false;
                }
                Object key = entry.getKey();
                e eVar = this.f10816b;
                Object obj2 = eVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && eVar.containsKey(entry.getKey());
            default:
                return this.f10816b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f10815a) {
            case 0:
                return new h(this.f10816b);
            default:
                o[] oVarArr = new o[8];
                for (int i5 = 0; i5 < 8; i5++) {
                    oVarArr[i5] = new p(1);
                }
                return new i(this.f10816b, oVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f10815a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry instanceof Object ? entry : null) instanceof Map.Entry) {
                    return this.f10816b.remove(entry.getKey(), entry.getValue());
                }
                return false;
            default:
                e eVar = this.f10816b;
                if (!eVar.containsKey(obj)) {
                    return false;
                }
                eVar.remove(obj);
                return true;
        }
    }
}
