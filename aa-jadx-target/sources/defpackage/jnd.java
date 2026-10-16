package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jnd extends android.content.BroadcastReceiver {
    final /* synthetic */ com.google.android.apps.auto.carservice.gmscorecompat.CarChimeraService a;

    public jnd(com.google.android.apps.auto.carservice.gmscorecompat.CarChimeraService carChimeraService) {
        this.a = carChimeraService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        this.a.f();
    }
}
