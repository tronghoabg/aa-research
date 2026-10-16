package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface aexp<K, V> extends java.util.Map<K, V>, defpackage.aexl {
    defpackage.aevm a();

    @Override // java.util.Map, defpackage.aefe
    boolean containsKey(java.lang.Object obj);

    defpackage.aevm d();

    @Override // java.util.Map
    V put(K k, V v);

    @Override // java.util.Map
    V remove(java.lang.Object obj);
}
