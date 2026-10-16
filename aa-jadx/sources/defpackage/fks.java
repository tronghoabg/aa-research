package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fks extends defpackage.faq {
    public static final defpackage.fks c = new defpackage.fks();

    private fks() {
        super(7, 8);
    }

    @Override // defpackage.faq
    public final void a(defpackage.fbs fbsVar) {
        fbsVar.e("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
