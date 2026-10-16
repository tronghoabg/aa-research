package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class taa implements defpackage.aeep {
    @Override // defpackage.aeep
    public final void a() {
        ((defpackage.yqj) defpackage.taf.a.e()).u("Sent Gearhead Signal");
    }

    @Override // defpackage.aeep
    public final void b(java.lang.Throwable th) {
        ((defpackage.yqj) ((defpackage.yqj) defpackage.taf.a.g()).p(th)).u("Error sending Gearhead Signal");
        defpackage.kpu.b(defpackage.yxo.SEND_GEARHEAD_EVENT_REMOTE_EXCEPTION);
    }

    @Override // defpackage.aeep
    public final /* synthetic */ void c(java.lang.Object obj) {
        ((tax) obj).getClass();
    }
}
