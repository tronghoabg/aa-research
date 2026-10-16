package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
final class cbt<K, V> extends cbs<K, V> implements Map.Entry<K, V>, afgf {
    private final cby b;
    private Object c;

    public cbt(cby cbyVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.b = cbyVar;
        this.c = obj2;
    }

    @Override // defpackage.cbs, java.util.Map.Entry
    public final V getValue() {
        return (V) this.c;
    }

    @Override // defpackage.cbs, java.util.Map.Entry
    public final V setValue(V v) {
        V v2 = (V) this.c;
        this.c = v;
        cbx cbxVar = this.b.a;
        cbw cbwVar = cbxVar.d;
        Object obj = this.a;
        if (cbwVar.containsKey(obj)) {
            if (cbxVar.c) {
                Object objA = cbxVar.a();
                cbwVar.put(obj, v);
                cbxVar.b(objA != null ? objA.hashCode() : 0, cbwVar.a, objA, 0);
            } else {
                cbwVar.put(obj, v);
            }
            cbxVar.e = cbwVar.c;
        }
        return v2;
    }
}
