package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zck extends yej {
    final /* synthetic */ Map.Entry a;

    public zck(Map.Entry entry) {
        this.a = entry;
    }

    @Override // defpackage.yej
    protected final Map.Entry a() {
        return this.a;
    }

    @Override // defpackage.yel
    protected final /* synthetic */ Object d() {
        return this.a;
    }

    @Override // defpackage.yej, java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getValue() {
        return new zcq((List) this.a.getValue());
    }
}
