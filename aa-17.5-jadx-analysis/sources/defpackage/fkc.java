package defpackage;

import android.database.SQLException;

/* loaded from: classes2.dex */
public final class fkc extends fak {
    public static final fkc c = new fkc();

    private fkc() {
        super(11, 12);
    }

    @Override // defpackage.fak
    public final void a(fbl fblVar) throws SQLException {
        fblVar.e("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
