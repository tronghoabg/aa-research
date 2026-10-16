package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class qip extends defpackage.omf {
    final /* synthetic */ defpackage.qit a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qip(defpackage.qit qitVar) {
        super(null);
        this.a = qitVar;
    }

    private final void p() {
        boolean zE = defpackage.oeh.a().E();
        defpackage.qit qitVar = this.a;
        qitVar.h = zE;
        if (zE && qitVar.r()) {
            qitVar.j(defpackage.yxp.INTERRUPTED);
        }
        qitVar.p();
    }

    @Override // defpackage.omf
    public final void a(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        p();
    }

    @Override // defpackage.omf
    public final void b(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        if (this.a.s()) {
            return;
        }
        p();
    }

    @Override // defpackage.omf
    public final void c(com.google.android.apps.auto.components.telecom.call.CarCall carCall, int i) {
        p();
    }

    @Override // defpackage.omf
    public final void f(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        if (this.a.s()) {
            p();
        }
    }
}
