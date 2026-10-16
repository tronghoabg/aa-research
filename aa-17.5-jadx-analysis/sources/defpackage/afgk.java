package defpackage;

/* loaded from: classes3.dex */
public class afgk<V> implements afgm<Object, V> {
    private V value;

    public afgk(V v) {
        this.value = v;
    }

    protected void afterChange(afia<?> afiaVar, V v, V v2) {
        afiaVar.getClass();
    }

    protected boolean beforeChange(afia<?> afiaVar, V v, V v2) {
        afiaVar.getClass();
        return true;
    }

    @Override // defpackage.afgm, defpackage.afgl
    public V getValue(Object obj, afia<?> afiaVar) {
        afiaVar.getClass();
        return this.value;
    }

    @Override // defpackage.afgm
    public void setValue(Object obj, afia<?> afiaVar, V v) {
        afiaVar.getClass();
        V v2 = this.value;
        if (beforeChange(afiaVar, v2, v)) {
            this.value = v;
            afterChange(afiaVar, v2, v);
        }
    }

    public String toString() {
        return "ObservableProperty(value=" + this.value + ")";
    }
}
