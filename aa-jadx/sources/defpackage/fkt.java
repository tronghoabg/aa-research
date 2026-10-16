package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fkt extends defpackage.faq {
    public static final defpackage.fkt c = new defpackage.fkt();

    private fkt() {
        super(8, 9);
    }

    @Override // defpackage.faq
    public final void a(defpackage.fbs fbsVar) {
        fbsVar.e("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
