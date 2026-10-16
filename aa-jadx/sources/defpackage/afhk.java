package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class afhk<V> implements defpackage.afhm<java.lang.Object, V> {
    private V value;

    public afhk(V v) {
        this.value = v;
    }

    protected void afterChange(defpackage.afja<?> afjaVar, V v, V v2) {
        afjaVar.getClass();
    }

    protected boolean beforeChange(defpackage.afja<?> afjaVar, V v, V v2) {
        afjaVar.getClass();
        return true;
    }

    @Override // defpackage.afhm, defpackage.afhl
    public V getValue(java.lang.Object obj, defpackage.afja<?> afjaVar) {
        afjaVar.getClass();
        return this.value;
    }

    @Override // defpackage.afhm
    public void setValue(java.lang.Object obj, defpackage.afja<?> afjaVar, V v) {
        afjaVar.getClass();
        V v2 = this.value;
        if (beforeChange(afjaVar, v2, v)) {
            this.value = v;
            afterChange(afjaVar, v2, v);
        }
    }

    public java.lang.String toString() {
        return "ObservableProperty(value=" + this.value + ")";
    }
}
