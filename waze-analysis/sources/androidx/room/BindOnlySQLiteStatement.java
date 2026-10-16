package androidx.room;

import androidx.sqlite.SQLiteStatement;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class BindOnlySQLiteStatement implements SQLiteStatement {
    public static final Companion Companion = new Companion(null);
    private static final String ONLY_BIND_CALLS_ALLOWED_ERROR = "Only bind*() calls are allowed on the RoomRawQuery received statement.";
    private final /* synthetic */ SQLiteStatement $$delegate_0;

    public BindOnlySQLiteStatement(SQLiteStatement sQLiteStatement) {
        x.f(sQLiteStatement, "delegate");
        this.$$delegate_0 = sQLiteStatement;
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindBlob */
    public void mo13244bindBlob(int i2, byte[] bArr) {
        x.f(bArr, "value");
        this.$$delegate_0.mo13244bindBlob(i2, bArr);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindBoolean(int i2, boolean z) {
        this.$$delegate_0.bindBoolean(i2, z);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindDouble */
    public void mo13245bindDouble(int i2, double d2) {
        this.$$delegate_0.mo13245bindDouble(i2, d2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindFloat(int i2, float f2) {
        this.$$delegate_0.bindFloat(i2, f2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindInt(int i2, int i3) {
        this.$$delegate_0.bindInt(i2, i3);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindLong */
    public void mo13246bindLong(int i2, long j2) {
        this.$$delegate_0.mo13246bindLong(i2, j2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindNull */
    public void mo13247bindNull(int i2) {
        this.$$delegate_0.mo13247bindNull(i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindText */
    public void mo13248bindText(int i2, String str) {
        x.f(str, "value");
        this.$$delegate_0.mo13248bindText(i2, str);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: clearBindings */
    public void mo13249clearBindings() {
        this.$$delegate_0.mo13249clearBindings();
    }

    @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public byte[] getBlob(int i2) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean getBoolean(int i2) {
        return this.$$delegate_0.getBoolean(i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnCount() {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getColumnName(int i2) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public List<String> getColumnNames() {
        return this.$$delegate_0.getColumnNames();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnType(int i2) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public double getDouble(int i2) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public float getFloat(int i2) {
        return this.$$delegate_0.getFloat(i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getInt(int i2) {
        return this.$$delegate_0.getInt(i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public long getLong(int i2) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getText(int i2) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean isNull(int i2) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean step() {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
