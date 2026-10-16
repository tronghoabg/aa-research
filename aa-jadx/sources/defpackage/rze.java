package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rze extends defpackage.sts {
    final /* synthetic */ defpackage.rzf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rze(defpackage.rzf rzfVar) {
        super(null);
        this.a = rzfVar;
    }

    @Override // defpackage.sts
    public final void a(android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (action == null) {
            return;
        }
        if (!"com.google.android.gms.car.CONNECTIVITY_EVENT".equals(action)) {
            this.a.a(action, defpackage.xxe.a);
            return;
        }
        int intExtra = intent.getIntExtra("event_type", -1);
        if (intExtra != -1) {
            this.a.a(action, defpackage.xyn.h(defpackage.yyn.b(intExtra)));
        }
    }
}
