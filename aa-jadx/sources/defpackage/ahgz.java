package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahgz {
    private ahgz() {
    }

    public final defpackage.ahha getById(int i) {
        defpackage.ahha ahhaVar = (defpackage.ahha) defpackage.ahha.entryById.get(java.lang.Integer.valueOf(i));
        return ahhaVar == null ? defpackage.ahha.UNKNOWN : ahhaVar;
    }

    public /* synthetic */ ahgz(defpackage.affu affuVar) {
        this();
    }
}
