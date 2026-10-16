package defpackage;

import android.database.SQLException;

/* loaded from: classes2.dex */
public final class fki extends fak {
    public static final fki c = new fki();

    private fki() {
        super(4, 5);
    }

    @Override // defpackage.fak
    public final void a(fbl fblVar) throws SQLException {
        fblVar.e("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        fblVar.e("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
