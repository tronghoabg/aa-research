package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class yhb extends defpackage.yhg {
    final /* synthetic */ defpackage.yhc a;

    public yhb(defpackage.yhc yhcVar) {
        this.a = yhcVar;
    }

    @Override // defpackage.yhx, defpackage.ygm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public final defpackage.yot iterator() {
        return this.a.e();
    }

    @Override // defpackage.yhg
    public final defpackage.yhe h() {
        return this.a;
    }

    @Override // defpackage.yhg, defpackage.yhx, defpackage.ygm
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
