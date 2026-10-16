package h.i;

import h.g.b.x;
import h.l.r;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class a<V> implements d<Object, V> {
    private V value;

    public a(V v) {
        this.value = v;
    }

    protected void afterChange(r<?> rVar, V v, V v2) {
        x.f(rVar, "property");
    }

    protected boolean beforeChange(r<?> rVar, V v, V v2) {
        x.f(rVar, "property");
        return true;
    }

    @Override // h.i.d, h.i.c
    public V getValue(Object obj, r<?> rVar) {
        x.f(rVar, "property");
        return this.value;
    }

    @Override // h.i.d
    public void setValue(Object obj, r<?> rVar, V v) {
        x.f(rVar, "property");
        V v2 = this.value;
        if (beforeChange(rVar, v2, v)) {
            this.value = v;
            afterChange(rVar, v2, v);
        }
    }

    public String toString() {
        return "ObservableProperty(value=" + this.value + ")";
    }
}
