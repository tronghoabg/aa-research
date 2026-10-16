package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes3.dex */
public abstract class aeqp<K, V> extends aeqo<K, V> implements Map<K, V>, aetm {
    private static final long serialVersionUID = -1773560792952436569L;

    protected aeqp() {
    }

    @Override // defpackage.aeqo, defpackage.aesy
    public final /* synthetic */ aeum b() {
        return e();
    }

    @Override // defpackage.aesy
    /* renamed from: d */
    public /* bridge */ /* synthetic */ aeum h() {
        throw null;
    }

    @Override // defpackage.aetm
    public final /* synthetic */ aeur e() {
        return h();
    }

    @Override // defpackage.aeqo, java.util.Map
    public final /* synthetic */ Set entrySet() {
        return e();
    }

    @Override // defpackage.aeqo, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public aeur keySet() {
        throw null;
    }

    @Override // java.util.SortedMap
    public /* synthetic */ SortedMap headMap(Object obj) {
        return q();
    }

    @Override // java.util.SortedMap
    public /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return r();
    }

    @Override // java.util.SortedMap
    public /* synthetic */ SortedMap tailMap(Object obj) {
        return s();
    }

    @Override // defpackage.aeqo, java.util.Map
    public /* bridge */ /* synthetic */ Collection values() {
        return values();
    }
}
