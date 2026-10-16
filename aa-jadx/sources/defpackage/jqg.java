package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class jqg implements java.lang.Runnable {
    final /* synthetic */ defpackage.jld a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ int c;
    final /* synthetic */ android.net.wifi.WifiInfo d;
    final /* synthetic */ android.net.Network e;
    final /* synthetic */ boolean f;

    public jqg(defpackage.jld jldVar, java.lang.String str, int i, android.net.wifi.WifiInfo wifiInfo, android.net.Network network, boolean z) {
        this.a = jldVar;
        this.b = str;
        this.c = i;
        this.d = wifiInfo;
        this.e = network;
        this.f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this.b, this.c, this.d, this.e, this.f);
    }
}
