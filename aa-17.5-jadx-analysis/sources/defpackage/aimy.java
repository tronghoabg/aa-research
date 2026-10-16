package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class aimy<K, V> implements Iterable<V>, afgc {
    protected abstract aina<V> getArrayMap();

    protected abstract aioo<K, V> getTypeRegistry();

    public final boolean isEmpty() {
        return getArrayMap().getSize() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return getArrayMap().iterator();
    }

    protected final void registerComponent(afhe<? extends K> afheVar, V v) {
        afheVar.getClass();
        v.getClass();
        String qualifiedName = afheVar.getQualifiedName();
        qualifiedName.getClass();
        registerComponent(qualifiedName, (String) v);
    }

    protected abstract void registerComponent(String str, V v);
}
