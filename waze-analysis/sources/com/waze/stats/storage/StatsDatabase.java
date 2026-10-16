package com.waze.stats.storage;

import androidx.room.RoomDatabase;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class StatsDatabase extends RoomDatabase {
    public static final h Companion = new h();
    public static final String DB_NAME = "stats_db";

    public abstract a eventDao();
}
