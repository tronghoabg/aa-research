package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class uyl implements defpackage.uyo {
    private final defpackage.afak a;
    private final defpackage.xyn b;

    static {
        new android.accounts.Account("signedout@", "com.google.android.apps.maps");
    }

    public uyl(defpackage.afak afakVar, defpackage.xyn xynVar) {
        this.a = afakVar;
        this.b = xynVar;
    }

    @Override // defpackage.uyo
    public final android.accounts.Account a() {
        return (android.accounts.Account) ((defpackage.xys) ((defpackage.uzm) this.a).b()).a;
    }

    @Override // defpackage.uyo
    public final defpackage.zhs b() {
        return ((defpackage.uyn) this.b.d(new defpackage.uyk())).a();
    }
}
