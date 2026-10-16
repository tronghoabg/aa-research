package androidx.room.paging;

import android.database.Cursor;
import androidx.sqlite.SQLiteStatement;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class CursorSQLiteStatement implements SQLiteStatement {
    public static final Companion Companion = new Companion(null);
    private final Cursor cursor;

    public CursorSQLiteStatement(Cursor cursor) {
        x.f(cursor, "cursor");
        this.cursor = cursor;
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindBlob, reason: merged with bridge method [inline-methods] */
    public Void mo13244bindBlob(int i2, byte[] bArr) {
        x.f(bArr, "value");
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    /* JADX WARN: Failed to inline method: androidx.sqlite.SQLiteStatement.-CC.$default$bindBoolean(androidx.sqlite.SQLiteStatement, int, boolean):void */
    /* JADX WARN: Not passed register '(r0v0 'this' androidx.sqlite.driver.SupportSQLiteStatement A[IMMUTABLE_TYPE, THIS])' in method call: androidx.sqlite.SQLiteStatement.-CC.$default$bindBoolean(androidx.sqlite.SQLiteStatement, int, boolean):void */
    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ void bindBoolean(int i2, boolean z) {
        SQLiteStatement.CC.$default$bindBoolean(this, i2, z);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindDouble, reason: merged with bridge method [inline-methods] */
    public Void mo13245bindDouble(int i2, double d2) {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ void bindFloat(int i2, float f2) {
        mo13245bindDouble(i2, (double) f2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ void bindInt(int i2, int i3) {
        mo13246bindLong(i2, (long) i3);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindLong, reason: merged with bridge method [inline-methods] */
    public Void mo13246bindLong(int i2, long j2) {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindNull, reason: merged with bridge method [inline-methods] */
    public Void mo13247bindNull(int i2) {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindText, reason: merged with bridge method [inline-methods] */
    public Void mo13248bindText(int i2, String str) {
        x.f(str, "value");
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: clearBindings, reason: merged with bridge method [inline-methods] */
    public Void mo13249clearBindings() {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
    public void close() {
        this.cursor.close();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public byte[] getBlob(int i2) {
        byte[] blob = this.cursor.getBlob(i2);
        x.e(blob, "getBlob(...)");
        return blob;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ boolean getBoolean(int i2) {
        return SQLiteStatement.CC.$default$getBoolean(this, i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnCount() {
        return this.cursor.getColumnCount();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getColumnName(int i2) {
        String columnName = this.cursor.getColumnName(i2);
        x.e(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ List getColumnNames() {
        return SQLiteStatement.CC.$default$getColumnNames(this);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnType(int i2) {
        return Companion.getDataType(this.cursor, i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public double getDouble(int i2) {
        return this.cursor.getDouble(i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ float getFloat(int i2) {
        return SQLiteStatement.CC.$default$getFloat(this, i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ int getInt(int i2) {
        return SQLiteStatement.CC.$default$getInt(this, i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public long getLong(int i2) {
        return this.cursor.getLong(i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getText(int i2) {
        String string = this.cursor.getString(i2);
        x.e(string, "getString(...)");
        return string;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean isNull(int i2) {
        return this.cursor.isNull(i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
        this.cursor.moveToPosition(-1);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean step() {
        return this.cursor.moveToNext();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getDataType(Cursor cursor, int i2) {
            int type = cursor.getType(i2);
            int type2 = cursor.getType(i2);
            if (type2 == 0) {
                return 5;
            }
            int i3 = 1;
            if (type2 != 1) {
                i3 = 2;
                if (type2 != 2) {
                    i3 = 3;
                    if (type2 != 3) {
                        if (type2 == 4) {
                            return 4;
                        }
                        throw new IllegalStateException("Unknown field type: " + type);
                    }
                }
            }
            return i3;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
