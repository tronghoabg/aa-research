package androidx.sqlite.driver;

import android.database.Cursor;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.util.SQLStatementParserKt;
import h.d.a;
import h.d.b;
import h.e;
import h.g.b.x;
import h.i;
import h.n.o;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class SupportSQLiteStatement implements SQLiteStatement {
    public static final Companion Companion = new Companion(null);
    private final SupportSQLiteDatabase db;
    private boolean isClosed;
    private final String sql;

    /* compiled from: WazeSource */
    final class JournalModeSetStatement extends SupportSQLiteStatement implements SQLiteStatement {
        private final SupportSQLiteStatement delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JournalModeSetStatement(SupportSQLiteDatabase supportSQLiteDatabase, String str, SupportSQLiteStatement supportSQLiteStatement) {
            super(supportSQLiteDatabase, str, null);
            x.f(supportSQLiteDatabase, "db");
            x.f(str, "sql");
            x.f(supportSQLiteStatement, "delegate");
            this.delegate = supportSQLiteStatement;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindBlob */
        public void mo13244bindBlob(int i2, byte[] bArr) {
            x.f(bArr, "value");
            this.delegate.mo13244bindBlob(i2, bArr);
        }

        @Override // androidx.sqlite.driver.SupportSQLiteStatement, androidx.sqlite.SQLiteStatement
        public void bindBoolean(int i2, boolean z) {
            this.delegate.bindBoolean(i2, z);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindDouble */
        public void mo13245bindDouble(int i2, double d2) {
            this.delegate.mo13245bindDouble(i2, d2);
        }

        @Override // androidx.sqlite.driver.SupportSQLiteStatement, androidx.sqlite.SQLiteStatement
        public void bindFloat(int i2, float f2) {
            this.delegate.bindFloat(i2, f2);
        }

        @Override // androidx.sqlite.driver.SupportSQLiteStatement, androidx.sqlite.SQLiteStatement
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

        @Override // androidx.sqlite.driver.SupportSQLiteStatement, androidx.sqlite.SQLiteStatement
        public boolean getBoolean(int i2) {
            return this.delegate.getBoolean(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String getColumnName(int i2) {
            return this.delegate.getColumnName(i2);
        }

        @Override // androidx.sqlite.driver.SupportSQLiteStatement, androidx.sqlite.SQLiteStatement
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

        @Override // androidx.sqlite.driver.SupportSQLiteStatement, androidx.sqlite.SQLiteStatement
        public float getFloat(int i2) {
            return this.delegate.getFloat(i2);
        }

        @Override // androidx.sqlite.driver.SupportSQLiteStatement, androidx.sqlite.SQLiteStatement
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
            boolean zStep = this.delegate.step();
            if (o.m(getText(0), "wal", true)) {
                getDb().enableWriteAheadLogging();
                return zStep;
            }
            getDb().disableWriteAheadLogging();
            return zStep;
        }
    }

    /* compiled from: WazeSource */
    final class OtherSQLiteStatement extends SupportSQLiteStatement {
        private final androidx.sqlite.db.SupportSQLiteStatement delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtherSQLiteStatement(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
            super(supportSQLiteDatabase, str, null);
            x.f(supportSQLiteDatabase, "db");
            x.f(str, "sql");
            this.delegate = supportSQLiteDatabase.compileStatement(str);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindBlob */
        public void mo13244bindBlob(int i2, byte[] bArr) {
            x.f(bArr, "value");
            throwIfClosed();
            this.delegate.bindBlob(i2, bArr);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindDouble */
        public void mo13245bindDouble(int i2, double d2) {
            throwIfClosed();
            this.delegate.bindDouble(i2, d2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindLong */
        public void mo13246bindLong(int i2, long j2) {
            throwIfClosed();
            this.delegate.bindLong(i2, j2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindNull */
        public void mo13247bindNull(int i2) {
            throwIfClosed();
            this.delegate.bindNull(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindText */
        public void mo13248bindText(int i2, String str) {
            x.f(str, "value");
            throwIfClosed();
            this.delegate.bindString(i2, str);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: clearBindings */
        public void mo13249clearBindings() {
            throwIfClosed();
            this.delegate.clearBindings();
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
            setClosed(true);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public byte[] getBlob(int i2) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
            throwIfClosed();
            return 0;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String getColumnName(int i2) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnType(int i2) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public double getDouble(int i2) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(int i2) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String getText(int i2) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(int i2) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
            throwIfClosed();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean step() {
            throwIfClosed();
            this.delegate.execute();
            return false;
        }
    }

    /* compiled from: WazeSource */
    final class TransactionSQLiteStatement extends SupportSQLiteStatement {
        private final Companion.TransactionOperation operation;

        /* compiled from: WazeSource */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Companion.TransactionOperation.values().length];
                try {
                    iArr[Companion.TransactionOperation.END.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Companion.TransactionOperation.ROLLBACK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Companion.TransactionOperation.BEGIN_EXCLUSIVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Companion.TransactionOperation.BEGIN_IMMEDIATE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Companion.TransactionOperation.BEGIN_DEFERRED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionSQLiteStatement(SupportSQLiteDatabase supportSQLiteDatabase, String str, Companion.TransactionOperation transactionOperation) {
            super(supportSQLiteDatabase, str, null);
            x.f(supportSQLiteDatabase, "db");
            x.f(str, "sql");
            x.f(transactionOperation, "operation");
            this.operation = transactionOperation;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindBlob */
        public void mo13244bindBlob(int i2, byte[] bArr) {
            x.f(bArr, "value");
            throwIfClosed();
            SQLite.throwSQLiteException(25, "column index out of range");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindDouble */
        public void mo13245bindDouble(int i2, double d2) {
            throwIfClosed();
            SQLite.throwSQLiteException(25, "column index out of range");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindLong */
        public void mo13246bindLong(int i2, long j2) {
            throwIfClosed();
            SQLite.throwSQLiteException(25, "column index out of range");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindNull */
        public void mo13247bindNull(int i2) {
            throwIfClosed();
            SQLite.throwSQLiteException(25, "column index out of range");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindText */
        public void mo13248bindText(int i2, String str) {
            x.f(str, "value");
            throwIfClosed();
            SQLite.throwSQLiteException(25, "column index out of range");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: clearBindings */
        public void mo13249clearBindings() {
            throwIfClosed();
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
            setClosed(true);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public byte[] getBlob(int i2) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
            throwIfClosed();
            return 0;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String getColumnName(int i2) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnType(int i2) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public double getDouble(int i2) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(int i2) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new e();
        }

        public final Companion.TransactionOperation getOperation() {
            return this.operation;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String getText(int i2) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(int i2) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
            throwIfClosed();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean step() {
            Companion.TransactionOperation transactionOperation = Companion.TransactionOperation.END;
            int iOrdinal = this.operation.ordinal();
            if (iOrdinal == 0) {
                getDb().setTransactionSuccessful();
                getDb().endTransaction();
                return false;
            }
            if (iOrdinal == 1) {
                getDb().endTransaction();
                return false;
            }
            if (iOrdinal == 2) {
                getDb().beginTransaction();
                return false;
            }
            if (iOrdinal == 3) {
                getDb().beginTransactionNonExclusive();
                return false;
            }
            if (iOrdinal != 4) {
                throw new i();
            }
            getDb().beginTransactionReadOnly();
            return false;
        }
    }

    private SupportSQLiteStatement(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        this.db = supportSQLiteDatabase;
        this.sql = str;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ void bindBoolean(int i2, boolean z) {
        mo13246bindLong(i2, true != this ? 0L : 1L);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ void bindFloat(int i2, float f2) {
        mo13245bindDouble(i2, f2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ void bindInt(int i2, int i3) {
        mo13246bindLong(i2, i3);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ boolean getBoolean(int i2) {
        return SQLiteStatement.CC.$default$getBoolean(this, i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ List getColumnNames() {
        return SQLiteStatement.CC.$default$getColumnNames(this);
    }

    protected final SupportSQLiteDatabase getDb() {
        return this.db;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ float getFloat(int i2) {
        return SQLiteStatement.CC.$default$getFloat(this, i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ int getInt(int i2) {
        return SQLiteStatement.CC.$default$getInt(this, i2);
    }

    protected final String getSql() {
        return this.sql;
    }

    protected final boolean isClosed() {
        return this.isClosed;
    }

    protected final void setClosed(boolean z) {
        this.isClosed = z;
    }

    protected final void throwIfClosed() {
        if (this.isClosed) {
            SQLite.throwSQLiteException(21, "statement is closed");
            throw new e();
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WazeSource */
        final class TransactionOperation {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ TransactionOperation[] $VALUES;
            public static final TransactionOperation END = new TransactionOperation("END", 0);
            public static final TransactionOperation ROLLBACK = new TransactionOperation("ROLLBACK", 1);
            public static final TransactionOperation BEGIN_EXCLUSIVE = new TransactionOperation("BEGIN_EXCLUSIVE", 2);
            public static final TransactionOperation BEGIN_IMMEDIATE = new TransactionOperation("BEGIN_IMMEDIATE", 3);
            public static final TransactionOperation BEGIN_DEFERRED = new TransactionOperation("BEGIN_DEFERRED", 4);

            private static final /* synthetic */ TransactionOperation[] $values() {
                return new TransactionOperation[]{END, ROLLBACK, BEGIN_EXCLUSIVE, BEGIN_IMMEDIATE, BEGIN_DEFERRED};
            }

            static {
                TransactionOperation[] transactionOperationArr$values = $values();
                $VALUES = transactionOperationArr$values;
                $ENTRIES = b.a(transactionOperationArr$values);
            }

            private TransactionOperation(String str, int i2) {
            }

            public static a<TransactionOperation> getEntries() {
                return $ENTRIES;
            }

            public static TransactionOperation valueOf(String str) {
                return (TransactionOperation) Enum.valueOf(TransactionOperation.class, str);
            }

            public static TransactionOperation[] values() {
                return (TransactionOperation[]) $VALUES.clone();
            }
        }

        private Companion() {
        }

        private final SpecialOperation getSpecialOperation(String str, String str2) {
            if (!o.m("PRA", str, true)) {
                return null;
            }
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            x.e(lowerCase, "toLowerCase(...)");
            return o.F(o.B(lowerCase, "journal_mode", ""), "=", false) ? SpecialOperation.JournalModeOperation.INSTANCE : null;
        }

        private final TransactionOperation getTransactionOperation(String str, String str2) {
            if (o.m("END", str, true) || o.m("COM", str, true)) {
                return TransactionOperation.END;
            }
            if (o.m("ROL", str, true)) {
                if (o.F(str2, " TO ", true)) {
                    return null;
                }
                return TransactionOperation.ROLLBACK;
            }
            if (!o.m("BEG", str, true)) {
                return null;
            }
            String str3 = str2;
            return o.F(str3, "EXCLUSIVE", true) ? TransactionOperation.BEGIN_EXCLUSIVE : o.F(str3, "IMMEDIATE", true) ? TransactionOperation.BEGIN_IMMEDIATE : TransactionOperation.BEGIN_DEFERRED;
        }

        private final boolean isRowStatement(String str) {
            return o.m("SEL", str, true) || o.m("PRA", str, true) || o.m("WIT", str, true);
        }

        public final SupportSQLiteStatement create(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
            x.f(supportSQLiteDatabase, "db");
            x.f(str, "sql");
            String string = o.v(str).toString();
            String statementPrefix = SQLStatementParserKt.getStatementPrefix(string);
            if (statementPrefix == null) {
                return new OtherSQLiteStatement(supportSQLiteDatabase, str);
            }
            TransactionOperation transactionOperation = getTransactionOperation(statementPrefix, string);
            return transactionOperation != null ? new TransactionSQLiteStatement(supportSQLiteDatabase, str, transactionOperation) : getSpecialOperation(statementPrefix, string) instanceof SpecialOperation.JournalModeOperation ? new JournalModeSetStatement(supportSQLiteDatabase, str, new RowSQLiteStatement(supportSQLiteDatabase, str)) : isRowStatement(statementPrefix) ? new RowSQLiteStatement(supportSQLiteDatabase, str) : new OtherSQLiteStatement(supportSQLiteDatabase, str);
        }

        /* compiled from: WazeSource */
        abstract class SpecialOperation {

            /* compiled from: WazeSource */
            public final class JournalModeOperation extends SpecialOperation {
                public static final JournalModeOperation INSTANCE = new JournalModeOperation();

                private JournalModeOperation() {
                    super(null);
                }
            }

            private SpecialOperation() {
            }

            public /* synthetic */ SpecialOperation(h.g.b.o oVar) {
                this();
            }
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    final class RowSQLiteStatement extends SupportSQLiteStatement {
        public static final Companion Companion = new Companion(null);
        private int[] bindingTypes;
        private byte[][] blobBindings;
        private Cursor cursor;
        private double[] doubleBindings;
        private long[] longBindings;
        private String[] stringBindings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RowSQLiteStatement(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
            super(supportSQLiteDatabase, str, null);
            x.f(supportSQLiteDatabase, "db");
            x.f(str, "sql");
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        private final void ensureCapacity(int i2, int i3) {
            int[] iArr = this.bindingTypes;
            int i4 = i3 + 1;
            if (iArr.length < i4) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
                x.e(iArrCopyOf, "copyOf(...)");
                this.bindingTypes = iArrCopyOf;
            }
            if (i2 == 1) {
                long[] jArr = this.longBindings;
                if (jArr.length < i4) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i4);
                    x.e(jArrCopyOf, "copyOf(...)");
                    this.longBindings = jArrCopyOf;
                    return;
                }
                return;
            }
            if (i2 == 2) {
                double[] dArr = this.doubleBindings;
                if (dArr.length < i4) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i4);
                    x.e(dArrCopyOf, "copyOf(...)");
                    this.doubleBindings = dArrCopyOf;
                    return;
                }
                return;
            }
            if (i2 == 3) {
                String[] strArr = this.stringBindings;
                if (strArr.length < i4) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i4);
                    x.e(objArrCopyOf, "copyOf(...)");
                    this.stringBindings = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (i2 != 4) {
                return;
            }
            byte[][] bArr = this.blobBindings;
            if (bArr.length < i4) {
                Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i4);
                x.e(objArrCopyOf2, "copyOf(...)");
                this.blobBindings = (byte[][]) objArrCopyOf2;
            }
        }

        private final void ensureCursor() {
            if (this.cursor == null) {
                this.cursor = getDb().query(new SupportSQLiteQuery() { // from class: androidx.sqlite.driver.SupportSQLiteStatement$RowSQLiteStatement$ensureCursor$1
                    @Override // androidx.sqlite.db.SupportSQLiteQuery
                    public void bindTo(SupportSQLiteProgram supportSQLiteProgram) {
                        x.f(supportSQLiteProgram, "statement");
                        int length = this.this$0.bindingTypes.length;
                        for (int i2 = 1; i2 < length; i2++) {
                            int i3 = this.this$0.bindingTypes[i2];
                            if (i3 == 1) {
                                supportSQLiteProgram.bindLong(i2, this.this$0.longBindings[i2]);
                            } else if (i3 == 2) {
                                supportSQLiteProgram.bindDouble(i2, this.this$0.doubleBindings[i2]);
                            } else if (i3 == 3) {
                                String str = this.this$0.stringBindings[i2];
                                x.c(str);
                                supportSQLiteProgram.bindString(i2, str);
                            } else if (i3 == 4) {
                                byte[] bArr = this.this$0.blobBindings[i2];
                                x.c(bArr);
                                supportSQLiteProgram.bindBlob(i2, bArr);
                            } else if (i3 == 5) {
                                supportSQLiteProgram.bindNull(i2);
                            }
                        }
                    }

                    @Override // androidx.sqlite.db.SupportSQLiteQuery
                    public int getArgCount() {
                        return this.this$0.bindingTypes.length;
                    }

                    @Override // androidx.sqlite.db.SupportSQLiteQuery
                    public String getSql() {
                        return this.this$0.getSql();
                    }
                });
            }
        }

        private final void throwIfInvalidColumn(Cursor cursor, int i2) {
            if (i2 < 0 || i2 >= cursor.getColumnCount()) {
                SQLite.throwSQLiteException(25, "column index out of range");
                throw new e();
            }
        }

        private final Cursor throwIfNoRow() {
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor;
            }
            SQLite.throwSQLiteException(21, "no row");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindBlob */
        public void mo13244bindBlob(int i2, byte[] bArr) {
            x.f(bArr, "value");
            throwIfClosed();
            ensureCapacity(4, i2);
            this.bindingTypes[i2] = 4;
            this.blobBindings[i2] = bArr;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindDouble */
        public void mo13245bindDouble(int i2, double d2) {
            throwIfClosed();
            ensureCapacity(2, i2);
            this.bindingTypes[i2] = 2;
            this.doubleBindings[i2] = d2;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindLong */
        public void mo13246bindLong(int i2, long j2) {
            throwIfClosed();
            ensureCapacity(1, i2);
            this.bindingTypes[i2] = 1;
            this.longBindings[i2] = j2;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindNull */
        public void mo13247bindNull(int i2) {
            throwIfClosed();
            ensureCapacity(5, i2);
            this.bindingTypes[i2] = 5;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindText */
        public void mo13248bindText(int i2, String str) {
            x.f(str, "value");
            throwIfClosed();
            ensureCapacity(3, i2);
            this.bindingTypes[i2] = 3;
            this.stringBindings[i2] = str;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: clearBindings */
        public void mo13249clearBindings() {
            throwIfClosed();
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
            if (!isClosed()) {
                mo13249clearBindings();
                reset();
            }
            setClosed(true);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public byte[] getBlob(int i2) {
            throwIfClosed();
            Cursor cursorThrowIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(cursorThrowIfNoRow, i2);
            byte[] blob = cursorThrowIfNoRow.getBlob(i2);
            x.e(blob, "getBlob(...)");
            return blob;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String getColumnName(int i2) {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            throwIfInvalidColumn(cursor, i2);
            String columnName = cursor.getColumnName(i2);
            x.e(columnName, "getColumnName(...)");
            return columnName;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnType(int i2) {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            throwIfInvalidColumn(cursor, i2);
            return Companion.getDataType(cursor, i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public double getDouble(int i2) {
            throwIfClosed();
            Cursor cursorThrowIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(cursorThrowIfNoRow, i2);
            return cursorThrowIfNoRow.getDouble(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(int i2) {
            throwIfClosed();
            Cursor cursorThrowIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(cursorThrowIfNoRow, i2);
            return cursorThrowIfNoRow.getLong(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String getText(int i2) {
            throwIfClosed();
            Cursor cursorThrowIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(cursorThrowIfNoRow, i2);
            String string = cursorThrowIfNoRow.getString(i2);
            x.e(string, "getString(...)");
            return string;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(int i2) {
            throwIfClosed();
            Cursor cursorThrowIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(cursorThrowIfNoRow, i2);
            return cursorThrowIfNoRow.isNull(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
            throwIfClosed();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                cursor.close();
            }
            this.cursor = null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean step() {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.");
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

            public /* synthetic */ Companion(h.g.b.o oVar) {
                this();
            }
        }
    }

    public /* synthetic */ SupportSQLiteStatement(SupportSQLiteDatabase supportSQLiteDatabase, String str, h.g.b.o oVar) {
        this(supportSQLiteDatabase, str);
    }
}
