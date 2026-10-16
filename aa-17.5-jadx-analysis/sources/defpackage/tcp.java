package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class tcp implements Map.Entry, afgf, afgc {
    public final Map.Entry a;
    final /* synthetic */ tcs b;

    public tcp(tcs tcsVar, Map.Entry entry) {
        entry.getClass();
        this.b = tcsVar;
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        tcs tcsVar = this.b;
        Object value = this.a.setValue(obj);
        tcsVar.b();
        return value;
    }
}
