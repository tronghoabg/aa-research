package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class ainx<K, V, T extends V> {
    private final int id;

    public ainx(int i) {
        this.id = i;
    }

    protected final T extractValue(defpackage.ainy<K, V> ainyVar) {
        ainyVar.getClass();
        return ainyVar.getArrayMap().get(this.id);
    }
}
