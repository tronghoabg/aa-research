package com.waze.stats.storage;

import androidx.room.EntityInsertAdapter;
import androidx.sqlite.SQLiteStatement;
import com.waze.stats.StatsContract$StatContainer;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e extends EntityInsertAdapter {
    e(g gVar) {
        Objects.requireNonNull(gVar);
    }

    @Override // androidx.room.EntityInsertAdapter
    protected final /* bridge */ /* synthetic */ void bind(SQLiteStatement sQLiteStatement, Object obj) {
        StatsContract$StatContainer statsContract$StatContainer = (StatsContract$StatContainer) obj;
        sQLiteStatement.mo13246bindLong(1, statsContract$StatContainer.getIdentifier());
        sQLiteStatement.mo13244bindBlob(2, statsContract$StatContainer.getStatByteArray());
        sQLiteStatement.mo13246bindLong(3, statsContract$StatContainer.getCreatedDateMillis());
        sQLiteStatement.mo13248bindText(4, g.r(statsContract$StatContainer.getType()));
    }

    @Override // androidx.room.EntityInsertAdapter
    protected final String createQuery() {
        return "INSERT OR ABORT INTO `stat_container` (`identifier`,`stat`,`created_date_millis`,`stat_type`) VALUES (nullif(?, 0),?,?,?)";
    }
}
