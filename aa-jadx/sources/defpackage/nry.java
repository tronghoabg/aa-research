package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nry extends defpackage.mpb {
    public static final defpackage.nry a = new defpackage.nry();

    private nry() {
        super("Phone");
    }

    @Override // defpackage.mpb
    protected final boolean d(android.content.Intent intent, defpackage.qrh qrhVar) {
        android.content.ComponentName component = intent.getComponent();
        return (component == null) & ("android.intent.action.CALL".equals(intent.getAction()) || "android.intent.action.DIAL".equals(intent.getAction()));
    }

    @Override // defpackage.mpb
    protected final void i(android.content.Intent intent, defpackage.qrh qrhVar) {
        defpackage.mpr.b(defpackage.mkt.b).d(intent);
    }
}
