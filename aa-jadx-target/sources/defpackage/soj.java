package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class soj extends defpackage.soc {
    final /* synthetic */ defpackage.sok g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public soj(defpackage.sok sokVar, int i, android.os.Bundle bundle) {
        super(sokVar, i, bundle);
        this.g = sokVar;
    }

    @Override // defpackage.soc
    protected final void a(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.g.f.a(connectionResult);
        java.lang.System.currentTimeMillis();
    }

    @Override // defpackage.soc
    protected final boolean b() {
        this.g.f.a(com.google.android.gms.common.ConnectionResult.a);
        return true;
    }
}
