package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ree extends defpackage.qwy {
    final /* synthetic */ defpackage.zif a;

    public ree(defpackage.zif zifVar) {
        this.a = zifVar;
    }

    @Override // defpackage.qwz
    public final void e(com.google.android.gms.common.data.BitmapTeleporter bitmapTeleporter) {
        defpackage.zif zifVar = this.a;
        if (bitmapTeleporter == null) {
            zifVar.o(new defpackage.rcf(null, com.google.android.gms.common.api.Status.c));
        } else {
            zifVar.o(new defpackage.rcf(bitmapTeleporter.a(), com.google.android.gms.common.api.Status.a));
        }
    }
}
