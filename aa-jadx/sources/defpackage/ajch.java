package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ajch extends defpackage.ajao implements defpackage.ajay {
    public ajch(int i) {
        super(1, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 2);
        c(java.lang.Integer.valueOf(i));
    }

    @Override // defpackage.ajay
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        java.lang.Integer numValueOf;
        synchronized (this) {
            numValueOf = java.lang.Integer.valueOf(((java.lang.Number) h()).intValue());
        }
        return numValueOf;
    }

    public final void p(int i) {
        synchronized (this) {
            c(java.lang.Integer.valueOf(((java.lang.Number) h()).intValue() + i));
        }
    }
}
