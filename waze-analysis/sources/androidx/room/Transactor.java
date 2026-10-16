package androidx.room;

import h.c.e;
import h.d.a;
import h.d.b;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface Transactor extends PooledConnection {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    public final class SQLiteTransactionType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SQLiteTransactionType[] $VALUES;
        public static final SQLiteTransactionType DEFERRED = new SQLiteTransactionType("DEFERRED", 0);
        public static final SQLiteTransactionType IMMEDIATE = new SQLiteTransactionType("IMMEDIATE", 1);
        public static final SQLiteTransactionType EXCLUSIVE = new SQLiteTransactionType("EXCLUSIVE", 2);

        private static final /* synthetic */ SQLiteTransactionType[] $values() {
            return new SQLiteTransactionType[]{DEFERRED, IMMEDIATE, EXCLUSIVE};
        }

        static {
            SQLiteTransactionType[] sQLiteTransactionTypeArr$values = $values();
            $VALUES = sQLiteTransactionTypeArr$values;
            $ENTRIES = b.a(sQLiteTransactionTypeArr$values);
        }

        private SQLiteTransactionType(String str, int i2) {
        }

        public static a<SQLiteTransactionType> getEntries() {
            return $ENTRIES;
        }

        public static SQLiteTransactionType valueOf(String str) {
            return (SQLiteTransactionType) Enum.valueOf(SQLiteTransactionType.class, str);
        }

        public static SQLiteTransactionType[] values() {
            return (SQLiteTransactionType[]) $VALUES.clone();
        }
    }

    Object inTransaction(e<? super Boolean> eVar);

    <R> Object withTransaction(SQLiteTransactionType sQLiteTransactionType, p<? super TransactionScope<R>, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar);
}
