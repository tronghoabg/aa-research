package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class sqy implements defpackage.srd {
    final /* synthetic */ android.app.Activity a;
    final /* synthetic */ android.os.Bundle b;
    final /* synthetic */ android.os.Bundle c;
    final /* synthetic */ defpackage.sre d;

    public sqy(defpackage.sre sreVar, android.app.Activity activity, android.os.Bundle bundle, android.os.Bundle bundle2) {
        this.a = activity;
        this.b = bundle;
        this.c = bundle2;
        this.d = sreVar;
    }

    @Override // defpackage.srd
    public final int a() {
        return 0;
    }

    @Override // defpackage.srd
    public final void b() {
        this.d.a.onInflate(this.a, this.b, this.c);
    }
}
