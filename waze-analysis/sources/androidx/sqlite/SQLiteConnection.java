package androidx.sqlite;

import h.j;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface SQLiteConnection extends AutoCloseable {

    /* compiled from: WazeSource */
    /* renamed from: androidx.sqlite.SQLiteConnection$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$inTransaction(SQLiteConnection sQLiteConnection) {
            Objects.toString(sQLiteConnection);
            throw new j(String.valueOf(sQLiteConnection).concat(" does not implement inTransaction()."));
        }
    }

    @Override // java.lang.AutoCloseable
    void close();

    boolean inTransaction();

    SQLiteStatement prepare(String str);
}
