package defpackage;

import android.database.SQLException;

/* loaded from: classes2.dex */
public final class fkg extends fak {
    public static final fkg c = new fkg();

    private fkg() {
        super(1, 2);
    }

    @Override // defpackage.fak
    public final void a(fbl fblVar) throws SQLException {
        fblVar.e("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        fblVar.e("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        fblVar.e("DROP TABLE IF EXISTS alarmInfo");
        fblVar.e("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
