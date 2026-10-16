package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aioy<K, V, T extends V> extends defpackage.ainx<K, V, T> implements defpackage.afhl<defpackage.ainy<K, V>, V> {
    public aioy(int i) {
        super(i);
    }

    public T getValue(defpackage.ainy<K, V> ainyVar, defpackage.afja<?> afjaVar) {
        ainyVar.getClass();
        afjaVar.getClass();
        return extractValue(ainyVar);
    }

    @Override // defpackage.afhl
    public /* bridge */ /* synthetic */ java.lang.Object getValue(java.lang.Object obj, defpackage.afja afjaVar) {
        return getValue((defpackage.ainy) obj, (defpackage.afja<?>) afjaVar);
    }
}
