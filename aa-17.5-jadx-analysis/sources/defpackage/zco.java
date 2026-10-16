package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class zco extends yej {
    final /* synthetic */ Map.Entry a;

    public zco(Map.Entry entry) {
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
    public final Object setValue(Object obj) {
        getKey();
        obj.getClass();
        return this.a.setValue(obj);
    }
}
