package androidx.sqlite;

import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface SQLiteStatement extends AutoCloseable {

    /* compiled from: WazeSource */
    /* renamed from: androidx.sqlite.SQLiteStatement$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$getBoolean(SQLiteStatement sQLiteStatement, int i2) {
            return sQLiteStatement.getLong(i2) != 0;
        }

        public static List $default$getColumnNames(SQLiteStatement sQLiteStatement) {
            int columnCount = sQLiteStatement.getColumnCount();
            ArrayList arrayList = new ArrayList(columnCount);
            for (int i2 = 0; i2 < columnCount; i2++) {
                arrayList.add(sQLiteStatement.getColumnName(i2));
            }
            return arrayList;
        }

        public static float $default$getFloat(SQLiteStatement sQLiteStatement, int i2) {
            return (float) sQLiteStatement.getDouble(i2);
        }

        public static int $default$getInt(SQLiteStatement sQLiteStatement, int i2) {
            return (int) sQLiteStatement.getLong(i2);
        }
    }

    /* renamed from: bindBlob */
    void mo13244bindBlob(int i2, byte[] bArr);

    void bindBoolean(int i2, boolean z);

    /* renamed from: bindDouble */
    void mo13245bindDouble(int i2, double d2);

    void bindFloat(int i2, float f2);

    void bindInt(int i2, int i3);

    /* renamed from: bindLong */
    void mo13246bindLong(int i2, long j2);

    /* renamed from: bindNull */
    void mo13247bindNull(int i2);

    /* renamed from: bindText */
    void mo13248bindText(int i2, String str);

    /* renamed from: clearBindings */
    void mo13249clearBindings();

    @Override // java.lang.AutoCloseable
    void close();

    byte[] getBlob(int i2);

    boolean getBoolean(int i2);

    int getColumnCount();

    String getColumnName(int i2);

    List<String> getColumnNames();

    int getColumnType(int i2);

    double getDouble(int i2);

    float getFloat(int i2);

    int getInt(int i2);

    long getLong(int i2);

    String getText(int i2);

    boolean isNull(int i2);

    void reset();

    boolean step();
}
