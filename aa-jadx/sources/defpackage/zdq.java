package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zdq extends defpackage.yfp {
    final /* synthetic */ java.util.Map.Entry a;

    public zdq(java.util.Map.Entry entry) {
        this.a = entry;
    }

    @Override // defpackage.yfp
    protected final java.util.Map.Entry a() {
        return this.a;
    }

    @Override // defpackage.yfr
    protected final /* synthetic */ java.lang.Object d() {
        return this.a;
    }

    @Override // defpackage.yfp, java.util.Map.Entry
    public final /* bridge */ /* synthetic */ java.lang.Object getValue() {
        return new defpackage.zdw((java.util.List) this.a.getValue());
    }
}
