package androidx.room;

import h.c.e;
import h.g.a.l;
import h.g.a.p;
import java.util.Set;
import kotlinx.coroutines.b.k;

/* loaded from: classes4.dex */
public final class RoomDatabaseKt {
    public static final <R> Object compatTransactionCoroutineExecute(RoomDatabase roomDatabase, l<? super e<? super R>, ? extends Object> lVar, e<? super R> eVar) {
        return RoomDatabaseKt__RoomDatabase_androidKt.compatTransactionCoroutineExecute(roomDatabase, lVar, eVar);
    }

    public static final k<Set<String>> invalidationTrackerFlow(RoomDatabase roomDatabase, String[] strArr, boolean z) {
        return RoomDatabaseKt__RoomDatabase_androidKt.invalidationTrackerFlow(roomDatabase, strArr, z);
    }

    public static final <R> Object useReaderConnection(RoomDatabase roomDatabase, p<? super Transactor, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar) {
        return RoomDatabaseKt__RoomDatabaseKt.useReaderConnection(roomDatabase, pVar, eVar);
    }

    public static final <R> Object useWriterConnection(RoomDatabase roomDatabase, p<? super Transactor, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar) {
        return RoomDatabaseKt__RoomDatabaseKt.useWriterConnection(roomDatabase, pVar, eVar);
    }

    public static final void validateAutoMigrations(RoomDatabase roomDatabase, DatabaseConfiguration databaseConfiguration) {
        RoomDatabaseKt__RoomDatabaseKt.validateAutoMigrations(roomDatabase, databaseConfiguration);
    }

    public static final void validateMigrationsNotRequired(Set<Integer> set, Set<Integer> set2) {
        RoomDatabaseKt__RoomDatabaseKt.validateMigrationsNotRequired(set, set2);
    }

    public static final void validateTypeConverters(RoomDatabase roomDatabase, DatabaseConfiguration databaseConfiguration) {
        RoomDatabaseKt__RoomDatabaseKt.validateTypeConverters(roomDatabase, databaseConfiguration);
    }

    public static final <R> Object withTransaction(RoomDatabase roomDatabase, l<? super e<? super R>, ? extends Object> lVar, e<? super R> eVar) {
        return RoomDatabaseKt__RoomDatabase_androidKt.withTransaction(roomDatabase, lVar, eVar);
    }

    public static final <R> Object withTransactionContext(RoomDatabase roomDatabase, l<? super e<? super R>, ? extends Object> lVar, e<? super R> eVar) {
        return RoomDatabaseKt__RoomDatabase_androidKt.withTransactionContext(roomDatabase, lVar, eVar);
    }
}
