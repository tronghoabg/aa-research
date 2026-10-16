package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class sce extends defpackage.rip {
    final /* synthetic */ defpackage.sci a;

    public sce(defpackage.sci sciVar) {
        this.a = sciVar;
    }

    @Override // defpackage.rip
    public final void a(android.content.Intent intent) {
        android.net.NetworkInfo networkInfo = (android.net.NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo == null || networkInfo.getState() != android.net.NetworkInfo.State.DISCONNECTED) {
            return;
        }
        defpackage.sci sciVar = this.a;
        sciVar.d.e(defpackage.zaj.PROTOCOL_IO_ERROR, defpackage.zak.WIFI_NETWORK_DISCONNECTED, "Wifi network no longer connected");
        sciVar.m.f(2, null, null, 304, null);
    }
}
