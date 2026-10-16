package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class flt extends defpackage.faq {
    public flt() {
        super(23, 24);
    }

    @Override // defpackage.faq
    public final void b(defpackage.fch fchVar) {
        defpackage.csc.k(fchVar, "ALTER TABLE `WorkSpec` ADD COLUMN `backoff_on_system_interruptions` INTEGER DEFAULT NULL");
    }
}
