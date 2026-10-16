package defpackage;

/* loaded from: classes2.dex */
public final class flh extends fak {
    public flh() {
        super(18, 19);
    }

    @Override // defpackage.fak
    public final void b(fca fcaVar) {
        dan.j(fcaVar, "ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
