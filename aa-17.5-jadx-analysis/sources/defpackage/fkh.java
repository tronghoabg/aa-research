package defpackage;

import android.database.SQLException;

/* loaded from: classes2.dex */
public final class fkh extends fak {
    public static final fkh c = new fkh();

    private fkh() {
        super(3, 4);
    }

    @Override // defpackage.fak
    public final void a(fbl fblVar) throws SQLException {
        fblVar.e("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
