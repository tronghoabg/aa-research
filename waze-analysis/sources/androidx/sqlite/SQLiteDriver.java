package androidx.sqlite;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface SQLiteDriver {

    /* compiled from: WazeSource */
    /* renamed from: androidx.sqlite.SQLiteDriver$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$hasConnectionPool(SQLiteDriver sQLiteDriver) {
            return false;
        }

        public static /* synthetic */ void hasConnectionPool$annotations() {
        }
    }

    boolean hasConnectionPool();

    SQLiteConnection open(String str);
}
