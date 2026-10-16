package androidx.room.util;

import androidx.autofill.HintConstants;
import androidx.sqlite.SQLiteStatement;
import h.a.r;
import h.g.b.x;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class MappedColumnsSQLiteStatementWrapper implements SQLiteStatement {
    private final Map<String, Integer> columnNameToIndexMap;
    private final String[] columnNames;
    private final SQLiteStatement delegate;
    private final int[] mapping;

    public MappedColumnsSQLiteStatementWrapper(SQLiteStatement sQLiteStatement, String[] strArr, int[] iArr) {
        x.f(sQLiteStatement, "delegate");
        x.f(strArr, "columnNames");
        x.f(iArr, "mapping");
        this.delegate = sQLiteStatement;
        this.columnNames = strArr;
        this.mapping = iArr;
        if (strArr.length != iArr.length) {
            throw new IllegalArgumentException("Expected columnNames.size == mapping.size");
        }
        Map mapC = r.c();
        int length = strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            mapC.put(strArr[i2], Integer.valueOf(this.mapping[i3]));
            i2++;
            i3++;
        }
        int columnCount = getColumnCount();
        for (int i4 = 0; i4 < columnCount; i4++) {
            if (!mapC.containsKey(getColumnName(i4))) {
                mapC.put(getColumnName(i4), Integer.valueOf(i4));
            }
        }
        this.columnNameToIndexMap = r.b(mapC);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindBlob */
    public void mo13244bindBlob(int i2, byte[] bArr) {
        x.f(bArr, "value");
        this.delegate.mo13244bindBlob(i2, bArr);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindBoolean(int i2, boolean z) {
        this.delegate.bindBoolean(i2, z);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindDouble */
    public void mo13245bindDouble(int i2, double d2) {
        this.delegate.mo13245bindDouble(i2, d2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindFloat(int i2, float f2) {
        this.delegate.bindFloat(i2, f2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindInt(int i2, int i3) {
        this.delegate.bindInt(i2, i3);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindLong */
    public void mo13246bindLong(int i2, long j2) {
        this.delegate.mo13246bindLong(i2, j2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindNull */
    public void mo13247bindNull(int i2) {
        this.delegate.mo13247bindNull(i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindText */
    public void mo13248bindText(int i2, String str) {
        x.f(str, "value");
        this.delegate.mo13248bindText(i2, str);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: clearBindings */
    public void mo13249clearBindings() {
        this.delegate.mo13249clearBindings();
    }

    @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public byte[] getBlob(int i2) {
        return this.delegate.getBlob(i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean getBoolean(int i2) {
        return this.delegate.getBoolean(i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnCount() {
        return this.delegate.getColumnCount();
    }

    public final int getColumnIndex(String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        Integer num = this.columnNameToIndexMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getColumnName(int i2) {
        return this.delegate.getColumnName(i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public List<String> getColumnNames() {
        return this.delegate.getColumnNames();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnType(int i2) {
        return this.delegate.getColumnType(i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public double getDouble(int i2) {
        return this.delegate.getDouble(i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public float getFloat(int i2) {
        return this.delegate.getFloat(i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getInt(int i2) {
        return this.delegate.getInt(i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public long getLong(int i2) {
        return this.delegate.getLong(i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getText(int i2) {
        return this.delegate.getText(i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean isNull(int i2) {
        return this.delegate.isNull(i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
        this.delegate.reset();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean step() {
        return this.delegate.step();
    }
}
