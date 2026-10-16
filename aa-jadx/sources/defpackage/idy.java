package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class idy implements defpackage.iga {
    final /* synthetic */ android.content.Context a;

    public idy(android.content.Context context) {
        this.a = context;
    }

    @Override // defpackage.iga
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        return (android.net.ConnectivityManager) this.a.getSystemService("connectivity");
    }
}
