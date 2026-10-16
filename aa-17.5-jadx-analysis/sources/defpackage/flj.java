package defpackage;

/* loaded from: classes2.dex */
public final class flj extends fak {
    public flj() {
        super(20, 21);
    }

    @Override // defpackage.fak
    public final void b(fca fcaVar) {
        dan.j(fcaVar, "ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
