package defpackage;

import android.database.SQLException;

/* loaded from: classes2.dex */
public final class fkd extends fak {
    public static final fkd c = new fkd();

    private fkd() {
        super(12, 13);
    }

    @Override // defpackage.fak
    public final void a(fbl fblVar) throws SQLException {
        fblVar.e("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        fblVar.e("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
