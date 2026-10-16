package defpackage;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes3.dex */
final class ymu extends yej {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ ymv b;

    public ymu(ymv ymvVar, Map.Entry entry) {
        this.a = entry;
        this.b = ymvVar;
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
        return yrm.k((Collection) this.a.getValue(), this.b.a.g);
    }
}
