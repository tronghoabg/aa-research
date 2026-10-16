package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aeas implements defpackage.adxu {
    private final /* synthetic */ int a;
    private final java.lang.Object b;

    public aeas(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aeaq, java.lang.Object] */
    @Override // defpackage.adxu
    public final java.lang.Object a() {
        int i = this.a;
        ?? r1 = this.b;
        return i != 0 ? r1 : defpackage.aear.a(r1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aeaq, java.lang.Object] */
    @Override // defpackage.adxu
    public final void b(java.lang.Object obj) throws java.lang.Throwable {
        if (this.a != 0) {
            return;
        }
        defpackage.aear.c(this.b, obj);
    }
}
