package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class zc extends defpackage.zi {
    final /* synthetic */ defpackage.zd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(defpackage.zd zdVar) {
        super(zdVar.d);
        this.a = zdVar;
    }

    @Override // defpackage.zi
    protected final java.lang.Object a(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.zi
    protected final void b(int i) {
        this.a.e(i);
    }
}
