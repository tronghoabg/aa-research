package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class flp extends defpackage.faq {
    public flp() {
        super(18, 19);
    }

    @Override // defpackage.faq
    public final void b(defpackage.fch fchVar) {
        defpackage.csc.k(fchVar, "ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
