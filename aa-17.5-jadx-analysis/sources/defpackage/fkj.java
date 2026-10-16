package defpackage;

import android.database.SQLException;

/* loaded from: classes2.dex */
public final class fkj extends fak {
    public static final fkj c = new fkj();

    private fkj() {
        super(6, 7);
    }

    @Override // defpackage.fak
    public final void a(fbl fblVar) throws SQLException {
        fblVar.e("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
