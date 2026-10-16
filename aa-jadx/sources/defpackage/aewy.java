package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface aewy<K, V> extends java.util.Map<K, V>, defpackage.aewu {
    defpackage.aevm b();

    @Override // java.util.Map, defpackage.aefe
    boolean containsKey(java.lang.Object obj);

    defpackage.aevm d();

    @Override // java.util.Map
    V put(K k, V v);

    @Override // java.util.Map
    V remove(java.lang.Object obj);
}
