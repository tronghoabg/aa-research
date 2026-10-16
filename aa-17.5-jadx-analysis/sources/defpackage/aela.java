package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes3.dex */
public abstract class aela<V> extends aekz<V> implements Map<Long, V>, aenv {
    private static final long serialVersionUID = -1773560792952436569L;

    protected aela() {
    }

    @Override // java.util.SortedMap
    public /* bridge */ /* synthetic */ Comparator<? super Long> comparator() {
        return null;
    }

    @Override // defpackage.aekz, java.util.Map
    public final /* synthetic */ Set entrySet() {
        return m();
    }

    @Override // defpackage.aekz, defpackage.aens
    public final /* synthetic */ aeum f() {
        return m();
    }

    @Override // java.util.SortedMap
    public final /* synthetic */ Long firstKey() {
        return n();
    }

    @Override // defpackage.aenv
    public final /* synthetic */ aenv h(Long l) {
        l.longValue();
        return C();
    }

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap headMap(Long l) {
        return h(l);
    }

    @Override // defpackage.aenv
    public final /* synthetic */ aenv i(Long l, Long l2) {
        l.longValue();
        l2.longValue();
        return D();
    }

    @Override // defpackage.aenv
    public final /* synthetic */ aenv j(Long l) {
        l.longValue();
        return E();
    }

    @Override // defpackage.aekz, java.util.Map
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public aeqb keySet() {
        throw null;
    }

    @Override // defpackage.aens
    /* renamed from: l */
    public /* bridge */ /* synthetic */ aeum t() {
        throw null;
    }

    @Override // java.util.SortedMap
    public final /* synthetic */ Long lastKey() {
        return o();
    }

    @Override // defpackage.aenv
    public final /* synthetic */ aeur m() {
        return t();
    }

    @Override // defpackage.aenv
    public final /* synthetic */ Long n() {
        return Long.valueOf(q());
    }

    @Override // defpackage.aenv
    public final /* synthetic */ Long o() {
        return Long.valueOf(r());
    }

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Long l, Long l2) {
        return i(l, l2);
    }

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Long l) {
        return j(l);
    }

    @Override // defpackage.aekz, java.util.Map
    public /* bridge */ /* synthetic */ Collection values() {
        return values();
    }
}
