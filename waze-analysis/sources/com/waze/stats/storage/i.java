package com.waze.stats.storage;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i extends Migration {
    public i() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) throws Exception {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `stat_container` ADD COLUMN `stat_type` TEXT NOT NULL DEFAULT 'AUTHENTICATED'");
    }
}
