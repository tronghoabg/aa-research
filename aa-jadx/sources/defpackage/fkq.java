package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fkq extends defpackage.faq {
    public static final defpackage.fkq c = new defpackage.fkq();

    private fkq() {
        super(4, 5);
    }

    @Override // defpackage.faq
    public final void a(defpackage.fbs fbsVar) {
        fbsVar.e("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        fbsVar.e("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
