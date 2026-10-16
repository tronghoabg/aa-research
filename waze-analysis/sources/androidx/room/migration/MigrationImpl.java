package androidx.room.migration;

import androidx.sqlite.db.SupportSQLiteDatabase;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class MigrationImpl extends Migration {
    private final l<SupportSQLiteDatabase, ab> migrateCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MigrationImpl(int i2, int i3, l<? super SupportSQLiteDatabase, ab> lVar) {
        super(i2, i3);
        x.f(lVar, "migrateCallback");
        this.migrateCallback = lVar;
    }

    public final l<SupportSQLiteDatabase, ab> getMigrateCallback() {
        return this.migrateCallback;
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        x.f(supportSQLiteDatabase, "db");
        this.migrateCallback.invoke(supportSQLiteDatabase);
    }
}
