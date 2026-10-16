package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dbx implements defpackage.dcn {
    public defpackage.bwx a;
    private defpackage.afer b;
    private final defpackage.bwx c = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);

    @Override // defpackage.dcn
    public final long a() {
        if (this.a == null) {
            defpackage.afer aferVar = this.b;
            this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(aferVar != null ? aferVar.invoke() : defpackage.dbm.a, defpackage.bxv.c);
            this.b = null;
        }
        defpackage.bwx bwxVar = this.a;
        bwxVar.getClass();
        return ((defpackage.dbm) bwxVar.a()).b;
    }

    public final void b(defpackage.afer aferVar) {
        if (this.a == null) {
            this.b = aferVar;
        }
    }

    public final void c(boolean z) {
        this.c.b(java.lang.Boolean.valueOf(z));
    }

    @Override // defpackage.dcn
    public final boolean d() {
        return ((java.lang.Boolean) this.c.a()).booleanValue();
    }
}
