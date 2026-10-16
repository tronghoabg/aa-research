package defpackage;

/* loaded from: classes2.dex */
public final class flk extends fak {
    public flk() {
        super(22, 23);
    }

    @Override // defpackage.fak
    public final void b(fca fcaVar) {
        dan.j(fcaVar, "ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
