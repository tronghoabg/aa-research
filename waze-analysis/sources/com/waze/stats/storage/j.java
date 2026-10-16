package com.waze.stats.storage;

import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends RoomOpenDelegate {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ StatsDatabase_Impl f40614a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(StatsDatabase_Impl statsDatabase_Impl) {
        super(3, "eb68ee686fb93f16de23f9a5920ef86d", "6cf7c740ddfc7e1aad24f4a592252e46");
        Objects.requireNonNull(statsDatabase_Impl);
        this.f40614a = statsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) throws Exception {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `stat_container` (`identifier` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `stat` BLOB NOT NULL, `created_date_millis` INTEGER NOT NULL, `stat_type` TEXT NOT NULL DEFAULT 'AUTHENTICATED')");
        SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'eb68ee686fb93f16de23f9a5920ef86d')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) throws Exception {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `stat_container`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        this.f40614a.internalInitInvalidationTracker(sQLiteConnection);
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onPostMigrate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onPreMigrate(SQLiteConnection sQLiteConnection) {
        DBUtil.dropFtsSyncTriggers(sQLiteConnection);
    }

    @Override // androidx.room.RoomOpenDelegate
    public final RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection sQLiteConnection) {
        HashMap map = new HashMap(4);
        map.put("identifier", new TableInfo.Column("identifier", "INTEGER", true, 1, null, 1));
        map.put("stat", new TableInfo.Column("stat", "BLOB", true, 0, null, 1));
        map.put("created_date_millis", new TableInfo.Column("created_date_millis", "INTEGER", true, 0, null, 1));
        map.put("stat_type", new TableInfo.Column("stat_type", "TEXT", true, 0, "'AUTHENTICATED'", 1));
        TableInfo tableInfo = new TableInfo("stat_container", map, new HashSet(0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "stat_container");
        if (tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(true, null);
        }
        return new RoomOpenDelegate.ValidationResult(false, "stat_container(com.waze.stats.StatsContract.StatContainer).\n Expected:\n" + tableInfo.toString() + "\n Found:\n" + tableInfo2.toString());
    }
}
