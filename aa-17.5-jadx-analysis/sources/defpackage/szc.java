package defpackage;

/* loaded from: classes.dex */
final class szc implements aedp {
    @Override // defpackage.aedp
    public final void a() {
        ((ype) szh.a.e()).u("Sent Gearhead Signal");
    }

    @Override // defpackage.aedp
    public final void b(Throwable th) {
        ((ype) ((ype) szh.a.g()).p(th)).u("Error sending Gearhead Signal");
        lau.b(ywj.SEND_GEARHEAD_EVENT_REMOTE_EXCEPTION);
    }

    @Override // defpackage.aedp
    public final /* synthetic */ void c(Object obj) {
        ((szz) obj).getClass();
    }
}
