package com.waze.stats.storage;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class StatsDatabase_Impl extends StatsDatabase {
    private volatile a _roomStorage;

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "stat_container");
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "stat_container");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public RoomOpenDelegate createOpenDelegate() {
        return new j(this);
    }

    @Override // com.waze.stats.storage.StatsDatabase
    public a eventDao() {
        a aVar;
        if (this._roomStorage != null) {
            return this._roomStorage;
        }
        synchronized (this) {
            if (this._roomStorage == null) {
                this._roomStorage = new g(this);
            }
            aVar = this._roomStorage;
        }
        return aVar;
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i());
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(a.class, Collections.EMPTY_LIST);
        return map;
    }
}
