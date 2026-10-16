package defpackage;

/* loaded from: classes2.dex */
public final class flg extends fak {
    public flg() {
        super(17, 18);
    }

    @Override // defpackage.fak
    public final void b(fca fcaVar) {
        dan.j(fcaVar, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        dan.j(fcaVar, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
