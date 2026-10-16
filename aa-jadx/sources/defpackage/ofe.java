package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ofe implements defpackage.off {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ofe(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.off
    public final void a(defpackage.omf omfVar) {
        int i = this.b;
        if (i == 0) {
            omfVar.b((com.google.android.apps.auto.components.telecom.call.CarCall) this.a);
            return;
        }
        if (i == 1) {
            omfVar.f((com.google.android.apps.auto.components.telecom.call.CarCall) this.a);
            return;
        }
        java.lang.Object obj = this.a;
        if (i != 2) {
            omfVar.a((com.google.android.apps.auto.components.telecom.call.CarCall) obj);
        } else {
            omfVar.eS((android.view.KeyEvent) obj);
        }
    }
}
