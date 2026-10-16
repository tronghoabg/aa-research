package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
class ybd extends yaw implements SortedMap {
    SortedSet d;
    final /* synthetic */ ybm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybd(ybm ybmVar, SortedMap sortedMap) {
        super(ybmVar, sortedMap);
        this.e = ybmVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return h().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return h().firstKey();
    }

    public SortedMap h() {
        return (SortedMap) this.a;
    }

    public SortedMap headMap(Object obj) {
        return new ybd(this.e, h().headMap(obj));
    }

    @Override // defpackage.ykr
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public SortedSet g() {
        return new ybe(this.e, h());
    }

    @Override // defpackage.yaw, defpackage.ykr, java.util.AbstractMap, java.util.Map
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.d;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetG = g();
        this.d = sortedSetG;
        return sortedSetG;
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return h().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new ybd(this.e, h().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new ybd(this.e, h().tailMap(obj));
    }
}
