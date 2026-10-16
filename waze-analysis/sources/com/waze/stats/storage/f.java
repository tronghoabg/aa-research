package com.waze.stats.storage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.sqlite.SQLiteStatement;
import com.waze.stats.StatsContract$StatContainer;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends EntityDeleteOrUpdateAdapter {
    f(g gVar) {
        Objects.requireNonNull(gVar);
    }

    @Override // androidx.room.EntityDeleteOrUpdateAdapter
    protected final /* bridge */ /* synthetic */ void bind(SQLiteStatement sQLiteStatement, Object obj) {
        sQLiteStatement.mo13246bindLong(1, ((StatsContract$StatContainer) obj).getIdentifier());
    }

    @Override // androidx.room.EntityDeleteOrUpdateAdapter
    protected final String createQuery() {
        return "DELETE FROM `stat_container` WHERE `identifier` = ?";
    }
}
