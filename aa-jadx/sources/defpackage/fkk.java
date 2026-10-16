package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fkk extends defpackage.faq {
    public static final defpackage.fkk c = new defpackage.fkk();

    private fkk() {
        super(11, 12);
    }

    @Override // defpackage.faq
    public final void a(defpackage.fbs fbsVar) {
        fbsVar.e("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
