package defpackage;

import android.database.SQLException;

/* loaded from: classes2.dex */
public final class fkk extends fak {
    public static final fkk c = new fkk();

    private fkk() {
        super(7, 8);
    }

    @Override // defpackage.fak
    public final void a(fbl fblVar) throws SQLException {
        fblVar.e("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
