package l8;

import java.util.Map;

/* loaded from: classes4.dex */
public final class g0 extends AbstractC3414P {

    /* renamed from: d, reason: collision with root package name */
    public final transient j0 f40108d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f40109e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f40110f;

    public g0(j0 j0Var, Object[] objArr, int i5) {
        this.f40108d = j0Var;
        this.f40109e = objArr;
        this.f40110f = i5;
    }

    @Override // l8.AbstractC3404F
    public final int b(int i5, Object[] objArr) {
        return a().b(i5, objArr);
    }

    @Override // l8.AbstractC3404F, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f40108d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // l8.AbstractC3404F
    public final boolean f() {
        return true;
    }

    @Override // l8.AbstractC3404F
    /* renamed from: g */
    public final t0 iterator() {
        return a().listIterator(0);
    }

    @Override // l8.AbstractC3414P
    public final AbstractC3409K k() {
        return new f0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f40110f;
    }
}
