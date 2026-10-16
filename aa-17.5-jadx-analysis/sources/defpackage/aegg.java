package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes3.dex */
public abstract class aegg<V> extends aegf<V> implements Map<Integer, V>, aehz {
    private static final long serialVersionUID = -1773560792952436569L;

    protected aegg() {
    }

    @Override // java.util.SortedMap
    public /* bridge */ /* synthetic */ Comparator<? super Integer> comparator() {
        return null;
    }

    @Override // defpackage.aegf, defpackage.aehj
    /* renamed from: e */
    public aetv values() {
        throw null;
    }

    @Override // defpackage.aegf, java.util.Map
    public final /* synthetic */ Set entrySet() {
        return m();
    }

    @Override // defpackage.aegf, defpackage.aehj
    public final /* synthetic */ aeum f() {
        return m();
    }

    @Override // java.util.SortedMap
    public final /* synthetic */ Integer firstKey() {
        return n();
    }

    @Override // defpackage.aehz
    public final /* synthetic */ aehz h(Integer num) {
        num.intValue();
        return A();
    }

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap headMap(Integer num) {
        return h(num);
    }

    @Override // defpackage.aehz
    public final /* synthetic */ aehz i(Integer num, Integer num2) {
        num.intValue();
        num2.intValue();
        return B();
    }

    @Override // defpackage.aehz
    public final /* synthetic */ aehz j(Integer num) {
        num.intValue();
        return C();
    }

    @Override // defpackage.aegf, java.util.Map
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public aekk keySet() {
        throw null;
    }

    @Override // defpackage.aehj
    /* renamed from: l */
    public /* bridge */ /* synthetic */ aeum t() {
        throw null;
    }

    @Override // java.util.SortedMap
    public final /* synthetic */ Integer lastKey() {
        return o();
    }

    @Override // defpackage.aehz
    public final /* synthetic */ aeur m() {
        return t();
    }

    @Override // defpackage.aehz
    public final /* synthetic */ Integer n() {
        return Integer.valueOf(q());
    }

    @Override // defpackage.aehz
    public final /* synthetic */ Integer o() {
        return Integer.valueOf(r());
    }

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Integer num, Integer num2) {
        return i(num, num2);
    }

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Integer num) {
        return j(num);
    }

    @Override // defpackage.aegf, java.util.Map
    public /* bridge */ /* synthetic */ Collection values() {
        return values();
    }
}
