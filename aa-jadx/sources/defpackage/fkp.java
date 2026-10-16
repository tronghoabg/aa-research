package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fkp extends defpackage.faq {
    public static final defpackage.fkp c = new defpackage.fkp();

    private fkp() {
        super(3, 4);
    }

    @Override // defpackage.faq
    public final void a(defpackage.fbs fbsVar) {
        fbsVar.e("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
