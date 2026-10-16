package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class sqz implements defpackage.srd {
    final /* synthetic */ android.os.Bundle a;
    final /* synthetic */ defpackage.sre b;

    public sqz(defpackage.sre sreVar, android.os.Bundle bundle) {
        this.a = bundle;
        this.b = sreVar;
    }

    @Override // defpackage.srd
    public final int a() {
        return 1;
    }

    @Override // defpackage.srd
    public final void b() {
        this.b.a.onCreate(this.a);
    }
}
