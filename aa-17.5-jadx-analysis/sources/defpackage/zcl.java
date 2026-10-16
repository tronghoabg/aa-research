package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class zcl<K, V> extends yen<Map.Entry<K, Collection<V>>> {
    private final Set a;

    public zcl(Set set) {
        this.a = set;
    }

    @Override // defpackage.yen, defpackage.yec
    /* renamed from: a */
    protected final /* synthetic */ Collection d() {
        return this.a;
    }

    @Override // defpackage.yen
    /* renamed from: c */
    protected final Set a() {
        return this.a;
    }

    @Override // defpackage.yel
    protected final /* synthetic */ Object d() {
        return this.a;
    }

    @Override // defpackage.yec, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
        return yrm.ab(this.a.iterator(), new ykz(2));
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
