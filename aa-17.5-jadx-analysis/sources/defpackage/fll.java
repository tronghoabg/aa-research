package defpackage;

/* loaded from: classes2.dex */
public final class fll extends fak {
    public fll() {
        super(23, 24);
    }

    @Override // defpackage.fak
    public final void b(fca fcaVar) {
        dan.j(fcaVar, "ALTER TABLE `WorkSpec` ADD COLUMN `backoff_on_system_interruptions` INTEGER DEFAULT NULL");
    }
}
