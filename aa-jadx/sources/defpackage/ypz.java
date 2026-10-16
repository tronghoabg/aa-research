package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ypz extends defpackage.yqc {
    final /* synthetic */ defpackage.yqc a;
    final /* synthetic */ defpackage.yqc b;

    public ypz(defpackage.yqc yqcVar, defpackage.yqc yqcVar2) {
        this.a = yqcVar;
        this.b = yqcVar2;
    }

    @Override // defpackage.yqc
    public final void a() {
        try {
            this.a.a();
        } finally {
            this.b.a();
        }
    }
}
