package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class flo extends defpackage.faq {
    public flo() {
        super(17, 18);
    }

    @Override // defpackage.faq
    public final void b(defpackage.fch fchVar) {
        defpackage.csc.k(fchVar, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        defpackage.csc.k(fchVar, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
