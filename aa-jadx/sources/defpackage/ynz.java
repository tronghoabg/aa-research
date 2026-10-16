package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ynz extends defpackage.yfp {
    final /* synthetic */ java.util.Map.Entry a;
    final /* synthetic */ defpackage.yoa b;

    public ynz(defpackage.yoa yoaVar, java.util.Map.Entry entry) {
        this.a = entry;
        this.b = yoaVar;
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
        return defpackage.ysr.k((java.util.Collection) this.a.getValue(), this.b.a.g);
    }
}
