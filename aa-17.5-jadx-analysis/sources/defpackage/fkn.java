package defpackage;

import android.content.Context;
import android.database.SQLException;

/* loaded from: classes2.dex */
public final class fkn extends fak {
    private final Context c;

    public fkn(Context context, int i, int i2) {
        super(i, i2);
        this.c = context;
    }

    @Override // defpackage.fak
    public final void a(fbl fblVar) throws SQLException {
        if (this.b >= 10) {
            fblVar.j(new Object[]{"reschedule_needed", 1});
        } else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
