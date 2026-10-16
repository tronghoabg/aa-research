package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class ykj extends ybr {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ ykd b;

    public ykj(Map.Entry entry, ykd ykdVar) {
        this.a = entry;
        this.b = ykdVar;
    }

    @Override // defpackage.ybr, java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // defpackage.ybr, java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.a;
        entry.getKey();
        return this.b.a(entry.getValue());
    }
}
