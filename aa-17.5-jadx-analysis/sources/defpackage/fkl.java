package defpackage;

import android.database.SQLException;

/* loaded from: classes2.dex */
public final class fkl extends fak {
    public static final fkl c = new fkl();

    private fkl() {
        super(8, 9);
    }

    @Override // defpackage.fak
    public final void a(fbl fblVar) throws SQLException {
        fblVar.e("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
