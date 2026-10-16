package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class flr extends defpackage.faq {
    public flr() {
        super(20, 21);
    }

    @Override // defpackage.faq
    public final void b(defpackage.fch fchVar) {
        defpackage.csc.k(fchVar, "ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
