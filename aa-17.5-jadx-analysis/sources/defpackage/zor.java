package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zor extends LinkedHashMap {
    final /* synthetic */ acjs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zor(acjs acjsVar, int i) {
        super(i, 0.75f, true);
        this.a = acjsVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.a.a;
    }
}
