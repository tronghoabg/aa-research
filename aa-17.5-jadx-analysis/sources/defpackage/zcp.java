package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zcp<K, V> extends yec<Map.Entry<K, V>> {
    final Collection a;

    public zcp(Collection collection) {
        this.a = collection;
    }

    @Override // defpackage.yec
    protected final Collection a() {
        return this.a;
    }

    @Override // defpackage.yel
    protected final /* synthetic */ Object d() {
        return this.a;
    }

    @Override // defpackage.yec, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return yrm.ab(this.a.iterator(), new ykz(3));
    }

    @Override // defpackage.yec, java.util.Collection
    public final Object[] toArray() {
        return f();
    }

    @Override // defpackage.yec, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) yrm.z(this, tArr);
    }
}
