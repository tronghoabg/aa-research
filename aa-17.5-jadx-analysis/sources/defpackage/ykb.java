package defpackage;

import java.util.AbstractMap;

/* loaded from: classes3.dex */
final class ykb extends AbstractMap.SimpleEntry {
    final /* synthetic */ ykc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ykb(ykc ykcVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.a = ykcVar;
    }

    @Override // java.util.AbstractMap.SimpleEntry, java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.a.put(getKey(), obj);
        return super.setValue(obj);
    }
}
