package net.zetetic.database.sqlcipher;

import A7.AbstractC0279p0;
import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.Log;
import android.util.LruCache;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ka.AbstractC3256n;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.Logger;
import org.apache.tika.utils.StringUtils;
import wg.b;

/* loaded from: classes5.dex */
public final class SQLiteConnection implements CancellationSignal.OnCancelListener {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f41045m = new String[0];

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f41046n = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final CloseGuard f41047a;

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteConnectionPool f41048b;

    /* renamed from: c, reason: collision with root package name */
    public final SQLiteDatabaseConfiguration f41049c;

    /* renamed from: d, reason: collision with root package name */
    public final int f41050d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f41051e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f41052f;

    /* renamed from: g, reason: collision with root package name */
    public final PreparedStatementCache f41053g;

    /* renamed from: h, reason: collision with root package name */
    public PreparedStatement f41054h;

    /* renamed from: i, reason: collision with root package name */
    public final OperationLog f41055i;

    /* renamed from: j, reason: collision with root package name */
    public long f41056j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f41057l;

    public static final class Operation {

        /* renamed from: a, reason: collision with root package name */
        public long f41058a;

        /* renamed from: b, reason: collision with root package name */
        public long f41059b;

        /* renamed from: c, reason: collision with root package name */
        public long f41060c;

        /* renamed from: d, reason: collision with root package name */
        public String f41061d;

        /* renamed from: e, reason: collision with root package name */
        public String f41062e;

        /* renamed from: f, reason: collision with root package name */
        public ArrayList f41063f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f41064g;

        /* renamed from: h, reason: collision with root package name */
        public RuntimeException f41065h;

        /* renamed from: i, reason: collision with root package name */
        public int f41066i;

        public final void a(StringBuilder sb2) {
            sb2.append(this.f41061d);
            if (this.f41064g) {
                sb2.append(" took ");
                sb2.append(this.f41060c - this.f41059b);
                sb2.append("ms");
            } else {
                sb2.append(" started ");
                sb2.append(System.currentTimeMillis() - this.f41058a);
                sb2.append("ms ago");
            }
            sb2.append(" - ");
            sb2.append(!this.f41064g ? "running" : this.f41065h != null ? "failed" : "succeeded");
            if (this.f41062e != null) {
                sb2.append(", sql=\"");
                sb2.append(this.f41062e.replaceAll("[\\s]*\\n+[\\s]*", StringUtils.SPACE));
                sb2.append("\"");
            }
            if (this.f41065h != null) {
                sb2.append(", exception=\"");
                sb2.append(this.f41065h.getMessage());
                sb2.append("\"");
            }
        }
    }

    public static final class OperationLog {

        /* renamed from: a, reason: collision with root package name */
        public final Operation[] f41067a = new Operation[20];

        /* renamed from: b, reason: collision with root package name */
        public int f41068b;

        /* renamed from: c, reason: collision with root package name */
        public int f41069c;

        public final int a(String str, String str2, Object[] objArr) {
            int i5;
            synchronized (this.f41067a) {
                try {
                    int i10 = (this.f41068b + 1) % 20;
                    Operation[] operationArr = this.f41067a;
                    Operation operation = operationArr[i10];
                    if (operation == null) {
                        operation = new Operation();
                        operationArr[i10] = operation;
                    } else {
                        operation.f41064g = false;
                        operation.f41065h = null;
                        ArrayList arrayList = operation.f41063f;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                    }
                    operation.f41058a = System.currentTimeMillis();
                    operation.f41059b = SystemClock.uptimeMillis();
                    operation.f41061d = str;
                    operation.f41062e = str2;
                    if (objArr != null) {
                        ArrayList arrayList2 = operation.f41063f;
                        if (arrayList2 == null) {
                            operation.f41063f = new ArrayList();
                        } else {
                            arrayList2.clear();
                        }
                        for (Object obj : objArr) {
                            if (obj == null || !(obj instanceof byte[])) {
                                operation.f41063f.add(obj);
                            } else {
                                operation.f41063f.add(SQLiteConnection.f41046n);
                            }
                        }
                    }
                    int i11 = this.f41069c;
                    this.f41069c = i11 + 1;
                    i5 = (i11 << 8) | i10;
                    operation.f41066i = i5;
                    this.f41068b = i10;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i5;
        }

        public final void b(int i5) {
            synchronized (this.f41067a) {
                Operation operation = this.f41067a[i5 & 255];
                if (operation.f41066i != i5) {
                    operation = null;
                }
                if (operation != null) {
                    operation.f41060c = SystemClock.uptimeMillis();
                    operation.f41064g = true;
                }
            }
        }

        public final void c(int i5) {
            synchronized (this.f41067a) {
                Operation operation = this.f41067a[i5 & 255];
                if (operation.f41066i != i5) {
                    operation = null;
                }
                if (operation != null) {
                    operation.f41060c = SystemClock.uptimeMillis();
                    operation.f41064g = true;
                }
            }
        }

        public final void d(RuntimeException runtimeException, int i5) {
            synchronized (this.f41067a) {
                Operation operation = this.f41067a[i5 & 255];
                if (operation.f41066i != i5) {
                    operation = null;
                }
                if (operation != null) {
                    operation.f41065h = runtimeException;
                }
            }
        }
    }

    public static final class PreparedStatement {

        /* renamed from: a, reason: collision with root package name */
        public PreparedStatement f41070a;

        /* renamed from: b, reason: collision with root package name */
        public String f41071b;

        /* renamed from: c, reason: collision with root package name */
        public long f41072c;

        /* renamed from: d, reason: collision with root package name */
        public int f41073d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f41074e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f41075f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f41076g;
    }

    public final class PreparedStatementCache extends LruCache<String, PreparedStatement> {
        public PreparedStatementCache(int i5) {
            super(i5);
        }

        @Override // android.util.LruCache
        public final void entryRemoved(boolean z2, String str, PreparedStatement preparedStatement, PreparedStatement preparedStatement2) {
            PreparedStatement preparedStatement3 = preparedStatement;
            preparedStatement3.f41075f = false;
            if (preparedStatement3.f41076g) {
                return;
            }
            SQLiteConnection.this.n(preparedStatement3);
        }
    }

    public SQLiteConnection(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i5, boolean z2) {
        CloseGuard closeGuard = new CloseGuard();
        this.f41047a = closeGuard;
        this.f41055i = new OperationLog();
        this.f41048b = sQLiteConnectionPool;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        this.f41049c = sQLiteDatabaseConfiguration2;
        this.f41050d = i5;
        this.f41051e = z2;
        this.f41052f = (sQLiteDatabaseConfiguration.f41127c & 1) != 0;
        this.f41053g = new PreparedStatementCache(sQLiteDatabaseConfiguration2.f41128d);
        closeGuard.a();
    }

    public static String d(String str) {
        return str.equals("0") ? "OFF" : str.equals(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION) ? "NORMAL" : str.equals(CommonGetHeaderBiddingToken.HB_TOKEN_VERSION) ? "FULL" : str;
    }

    private static native void nativeBindBlob(long j8, long j10, int i5, byte[] bArr);

    private static native void nativeBindDouble(long j8, long j10, int i5, double d3);

    private static native void nativeBindLong(long j8, long j10, int i5, long j11);

    private static native void nativeBindNull(long j8, long j10, int i5);

    private static native void nativeBindString(long j8, long j10, int i5, String str);

    private static native void nativeCancel(long j8);

    private static native void nativeClose(long j8);

    private static native void nativeExecute(long j8, long j10);

    private static native int nativeExecuteForBlobFileDescriptor(long j8, long j10);

    private static native int nativeExecuteForChangedRowCount(long j8, long j10);

    private static native long nativeExecuteForCursorWindow(long j8, long j10, long j11, int i5, int i10, boolean z2);

    private static native long nativeExecuteForLastInsertedRowId(long j8, long j10);

    private static native long nativeExecuteForLong(long j8, long j10);

    private static native String nativeExecuteForString(long j8, long j10);

    private static native void nativeExecuteRaw(long j8, long j10);

    private static native void nativeFinalizeStatement(long j8, long j10);

    private static native int nativeGetColumnCount(long j8, long j10);

    private static native String nativeGetColumnName(long j8, long j10, int i5);

    private static native int nativeGetDbLookaside(long j8);

    private static native int nativeGetParameterCount(long j8, long j10);

    private static native boolean nativeHasCodec();

    private static native boolean nativeIsReadOnly(long j8, long j10);

    private static native int nativeKey(long j8, byte[] bArr);

    private static native long nativeOpen(String str, int i5, String str2, boolean z2, boolean z10);

    private static native long nativePrepareStatement(long j8, String str);

    private static native int nativeReKey(long j8, byte[] bArr);

    private static native void nativeRegisterCustomFunction(long j8, SQLiteCustomFunction sQLiteCustomFunction);

    private static native void nativeRegisterLocalizedCollators(long j8, String str);

    private static native void nativeResetCancel(long j8, boolean z2);

    private static native void nativeResetStatementAndClearBindings(long j8, long j10);

    public static boolean o() {
        return nativeHasCodec();
    }

    public final PreparedStatement a(String str) {
        boolean z2;
        PreparedStatementCache preparedStatementCache = this.f41053g;
        PreparedStatement preparedStatement = preparedStatementCache.get(str);
        if (preparedStatement == null) {
            z2 = false;
        } else {
            if (!preparedStatement.f41076g) {
                return preparedStatement;
            }
            z2 = true;
        }
        long jNativePrepareStatement = nativePrepareStatement(this.f41056j, str);
        try {
            int iNativeGetParameterCount = nativeGetParameterCount(this.f41056j, jNativePrepareStatement);
            int iA = DatabaseUtils.a(str);
            boolean zNativeIsReadOnly = nativeIsReadOnly(this.f41056j, jNativePrepareStatement);
            PreparedStatement preparedStatement2 = this.f41054h;
            if (preparedStatement2 != null) {
                this.f41054h = preparedStatement2.f41070a;
                preparedStatement2.f41070a = null;
                preparedStatement2.f41075f = false;
            } else {
                preparedStatement2 = new PreparedStatement();
            }
            preparedStatement2.f41071b = str;
            preparedStatement2.f41072c = jNativePrepareStatement;
            preparedStatement2.f41073d = iNativeGetParameterCount;
            preparedStatement2.f41074e = zNativeIsReadOnly;
            if (!z2 && (iA == 2 || iA == 1)) {
                try {
                    preparedStatementCache.put(str, preparedStatement2);
                    preparedStatement2.f41075f = true;
                } catch (RuntimeException e7) {
                    e = e7;
                    preparedStatement = preparedStatement2;
                    if (preparedStatement == null || !preparedStatement.f41075f) {
                        nativeFinalizeStatement(this.f41056j, jNativePrepareStatement);
                    }
                    throw e;
                }
            }
            preparedStatement2.f41076g = true;
            return preparedStatement2;
        } catch (RuntimeException e10) {
            e = e10;
        }
    }

    public final void b(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
            int i5 = this.f41057l + 1;
            this.f41057l = i5;
            if (i5 == 1) {
                nativeResetCancel(this.f41056j, true);
                cancellationSignal.setOnCancelListener(this);
            }
        }
    }

    public final void c(PreparedStatement preparedStatement, Object[] objArr) {
        int length = objArr != null ? objArr.length : 0;
        if (length != preparedStatement.f41073d) {
            throw new SQLiteBindOrColumnIndexOutOfRangeException("Expected " + preparedStatement.f41073d + " bind arguments but " + length + " were provided.");
        }
        if (length == 0) {
            return;
        }
        long j8 = preparedStatement.f41072c;
        for (int i5 = 0; i5 < length; i5++) {
            Object obj = objArr[i5];
            int iB = DatabaseUtils.b(obj);
            if (iB == 0) {
                nativeBindNull(this.f41056j, j8, i5 + 1);
            } else if (iB == 1) {
                nativeBindLong(this.f41056j, j8, i5 + 1, ((Number) obj).longValue());
            } else if (iB == 2) {
                nativeBindDouble(this.f41056j, j8, i5 + 1, ((Number) obj).doubleValue());
            } else if (iB == 4) {
                nativeBindBlob(this.f41056j, j8, i5 + 1, (byte[]) obj);
            } else if (obj instanceof Boolean) {
                nativeBindLong(this.f41056j, j8, i5 + 1, ((Boolean) obj).booleanValue() ? 1L : 0L);
            } else {
                nativeBindString(this.f41056j, j8, i5 + 1, obj.toString());
            }
        }
    }

    public final void e(byte[] bArr) {
        int iNativeReKey = nativeReKey(this.f41056j, bArr);
        Logger.b().a(4, null, "SQLiteConnection", AbstractC3256n.g(iNativeReKey, "Database rekey operation returned:"));
        if (iNativeReKey != 0) {
            throw new SQLiteException(AbstractC3256n.g(iNativeReKey, "Failed to rekey database, result code:"));
        }
    }

    public final void f(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            int i5 = this.f41057l - 1;
            this.f41057l = i5;
            if (i5 == 0) {
                cancellationSignal.setOnCancelListener(null);
                nativeResetCancel(this.f41056j, false);
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            SQLiteConnectionPool sQLiteConnectionPool = this.f41048b;
            if (sQLiteConnectionPool != null && this.f41056j != 0) {
                Logger.b().a(5, null, "SQLiteConnectionPool", "A SQLiteConnection object for database '" + sQLiteConnectionPool.f41081d.f41126b + "' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
                sQLiteConnectionPool.f41080c.set(true);
            }
            g(true);
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final void g(boolean z2) {
        Throwable th;
        CloseGuard closeGuard = this.f41047a;
        if (z2 && (th = closeGuard.f41043a) != null) {
            Log.w("A resource was acquired at attached stack trace but never released. See java.io.Closeable for information on avoiding resource leaks.", th);
        }
        closeGuard.f41043a = null;
        if (this.f41056j != 0) {
            OperationLog operationLog = this.f41055i;
            int iA = operationLog.a("close", null, null);
            try {
                this.f41053g.evictAll();
                nativeClose(this.f41056j);
                this.f41056j = 0L;
            } finally {
                operationLog.b(iA);
            }
        }
    }

    public final void h(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        OperationLog operationLog = this.f41055i;
        int iA = operationLog.a("execute", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementA = a(str);
                try {
                    w(preparedStatementA);
                    c(preparedStatementA, objArr);
                    b(cancellationSignal);
                    try {
                        nativeExecute(this.f41056j, preparedStatementA.f41072c);
                    } finally {
                        f(cancellationSignal);
                    }
                } finally {
                    s(preparedStatementA);
                }
            } finally {
                operationLog.b(iA);
            }
        } catch (RuntimeException e7) {
            operationLog.d(e7, iA);
            throw e7;
        }
    }

    public final int i(String str, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        OperationLog operationLog = this.f41055i;
        int iA = operationLog.a("executeForChangedRowCount", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementA = a(str);
                try {
                    w(preparedStatementA);
                    c(preparedStatementA, objArr);
                    return nativeExecuteForChangedRowCount(this.f41056j, preparedStatementA.f41072c);
                } finally {
                    s(preparedStatementA);
                }
            } catch (RuntimeException e7) {
                operationLog.d(e7, iA);
                throw e7;
            }
        } finally {
            operationLog.c(iA);
        }
    }

    public final int j(String str, Object[] objArr, CursorWindow cursorWindow, int i5, int i10, boolean z2, CancellationSignal cancellationSignal) {
        int iA;
        OperationLog operationLog = this.f41055i;
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (cursorWindow == null) {
            throw new IllegalArgumentException("window must not be null.");
        }
        cursorWindow.a();
        try {
            try {
                iA = operationLog.a("executeForCursorWindow", str, objArr);
                try {
                    PreparedStatement preparedStatementA = a(str);
                    try {
                        w(preparedStatementA);
                        c(preparedStatementA, objArr);
                        b(cancellationSignal);
                        try {
                            long jNativeExecuteForCursorWindow = nativeExecuteForCursorWindow(this.f41056j, preparedStatementA.f41072c, cursorWindow.f41034b, i5, i10, z2);
                            int i11 = (int) jNativeExecuteForCursorWindow;
                            cursorWindow.y();
                            cursorWindow.f41035c = (int) (jNativeExecuteForCursorWindow >> 32);
                            return i11;
                        } finally {
                            f(cancellationSignal);
                        }
                    } finally {
                        s(preparedStatementA);
                    }
                } catch (RuntimeException e7) {
                    operationLog.d(e7, iA);
                    throw e7;
                }
            } finally {
                operationLog.c(iA);
            }
        } finally {
            cursorWindow.d();
        }
    }

    public final long k(String str, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        OperationLog operationLog = this.f41055i;
        int iA = operationLog.a("executeForLastInsertedRowId", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementA = a(str);
                try {
                    w(preparedStatementA);
                    c(preparedStatementA, objArr);
                    return nativeExecuteForLastInsertedRowId(this.f41056j, preparedStatementA.f41072c);
                } finally {
                    s(preparedStatementA);
                }
            } catch (RuntimeException e7) {
                operationLog.d(e7, iA);
                throw e7;
            }
        } finally {
            operationLog.b(iA);
        }
    }

    public final long l(String str, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        OperationLog operationLog = this.f41055i;
        int iA = operationLog.a("executeForLong", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementA = a(str);
                try {
                    w(preparedStatementA);
                    c(preparedStatementA, objArr);
                    return nativeExecuteForLong(this.f41056j, preparedStatementA.f41072c);
                } finally {
                    s(preparedStatementA);
                }
            } catch (RuntimeException e7) {
                operationLog.d(e7, iA);
                throw e7;
            }
        } finally {
            operationLog.b(iA);
        }
    }

    public final String m(String str) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        OperationLog operationLog = this.f41055i;
        int iA = operationLog.a("executeForString", str, null);
        try {
            try {
                PreparedStatement preparedStatementA = a(str);
                try {
                    w(preparedStatementA);
                    c(preparedStatementA, null);
                    return nativeExecuteForString(this.f41056j, preparedStatementA.f41072c);
                } finally {
                    s(preparedStatementA);
                }
            } catch (RuntimeException e7) {
                operationLog.d(e7, iA);
                throw e7;
            }
        } finally {
            operationLog.b(iA);
        }
    }

    public final void n(PreparedStatement preparedStatement) {
        nativeFinalizeStatement(this.f41056j, preparedStatement.f41072c);
        preparedStatement.f41071b = null;
        preparedStatement.f41070a = this.f41054h;
        this.f41054h = preparedStatement;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        nativeCancel(this.f41056j);
    }

    public final void p() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f41049c;
        long jNativeOpen = nativeOpen(sQLiteDatabaseConfiguration.f41125a, sQLiteDatabaseConfiguration.f41127c, sQLiteDatabaseConfiguration.f41126b, SQLiteDebug.f41133a, SQLiteDebug.f41134b);
        this.f41056j = jNativeOpen;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.f41049c;
        SQLiteDatabaseHook sQLiteDatabaseHook = sQLiteDatabaseConfiguration2.f41131g;
        byte[] bArr = sQLiteDatabaseConfiguration2.f41130f;
        if (bArr != null && bArr.length > 0) {
            Logger.b().a(4, null, "SQLiteConnection", AbstractC3256n.g(nativeKey(jNativeOpen, bArr), "Database keying operation returned:"));
        }
        SQLiteDatabaseHook sQLiteDatabaseHook2 = this.f41049c.f41131g;
        if (sQLiteDatabaseHook2 != null) {
            sQLiteDatabaseHook2.a(this);
        }
        byte[] bArr2 = this.f41049c.f41130f;
        if (bArr2 != null && bArr2.length > 0) {
            l("SELECT COUNT(*) FROM sqlite_schema;", null);
        }
        if (!this.f41049c.f41125a.equalsIgnoreCase(":memory:") && !this.f41052f) {
            WeakHashMap weakHashMap = SQLiteDatabase.f41113j;
            if (!nativeHasCodec()) {
                synchronized (SQLiteGlobal.f41139a) {
                    try {
                        if (SQLiteGlobal.f41140b == 0) {
                            SQLiteGlobal.f41140b = new StatFs("/data").getBlockSize();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (l("PRAGMA page_size", null) != 4096) {
                    h("PRAGMA page_size=4096", null, null);
                }
            }
        }
        if (!this.f41052f) {
            this.f41049c.getClass();
            if (l("PRAGMA foreign_keys", null) != 0) {
                h(AbstractC0279p0.k(0L, "PRAGMA foreign_keys="), null, null);
            }
        }
        if (!this.f41049c.f41125a.equalsIgnoreCase(":memory:") && !this.f41052f) {
            if (l("PRAGMA journal_size_limit", null) != 10000) {
                l("PRAGMA journal_size_limit=10000", null);
            }
        }
        if (!this.f41049c.f41125a.equalsIgnoreCase(":memory:") && !this.f41052f) {
            long jMax = Math.max(1, 1000);
            if (l("PRAGMA wal_autocheckpoint", null) != jMax) {
                l("PRAGMA wal_autocheckpoint=" + jMax, null);
            }
        }
        v();
        if (!nativeHasCodec()) {
            u();
        }
        int size = this.f41049c.f41132h.size();
        for (int i5 = 0; i5 < size; i5++) {
            nativeRegisterCustomFunction(this.f41056j, (SQLiteCustomFunction) this.f41049c.f41132h.get(i5));
        }
    }

    public final void q(String str, SQLiteStatementInfo sQLiteStatementInfo) {
        OperationLog operationLog = this.f41055i;
        int iA = operationLog.a("prepare", str, null);
        try {
            try {
                PreparedStatement preparedStatementA = a(str);
                try {
                    sQLiteStatementInfo.f41167a = preparedStatementA.f41073d;
                    sQLiteStatementInfo.f41169c = preparedStatementA.f41074e;
                    int iNativeGetColumnCount = nativeGetColumnCount(this.f41056j, preparedStatementA.f41072c);
                    if (iNativeGetColumnCount == 0) {
                        sQLiteStatementInfo.f41168b = f41045m;
                    } else {
                        sQLiteStatementInfo.f41168b = new String[iNativeGetColumnCount];
                        for (int i5 = 0; i5 < iNativeGetColumnCount; i5++) {
                            sQLiteStatementInfo.f41168b[i5] = nativeGetColumnName(this.f41056j, preparedStatementA.f41072c, i5);
                        }
                    }
                    s(preparedStatementA);
                } catch (Throwable th) {
                    s(preparedStatementA);
                    throw th;
                }
            } catch (RuntimeException e7) {
                operationLog.d(e7, iA);
                throw e7;
            }
        } finally {
            operationLog.b(iA);
        }
    }

    public final void r(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2;
        this.k = false;
        int size = sQLiteDatabaseConfiguration.f41132h.size();
        int i5 = 0;
        while (true) {
            sQLiteDatabaseConfiguration2 = this.f41049c;
            if (i5 >= size) {
                break;
            }
            SQLiteCustomFunction sQLiteCustomFunction = (SQLiteCustomFunction) sQLiteDatabaseConfiguration.f41132h.get(i5);
            if (!sQLiteDatabaseConfiguration2.f41132h.contains(sQLiteCustomFunction)) {
                nativeRegisterCustomFunction(this.f41056j, sQLiteCustomFunction);
            }
            i5++;
        }
        sQLiteDatabaseConfiguration2.getClass();
        boolean z2 = ((sQLiteDatabaseConfiguration.f41127c ^ sQLiteDatabaseConfiguration2.f41127c) & 536870912) != 0;
        boolean zEquals = sQLiteDatabaseConfiguration.f41129e.equals(sQLiteDatabaseConfiguration2.f41129e);
        sQLiteDatabaseConfiguration2.a(sQLiteDatabaseConfiguration);
        if (z2) {
            v();
        }
        if (zEquals) {
            return;
        }
        u();
    }

    public final void s(PreparedStatement preparedStatement) {
        preparedStatement.f41076g = false;
        if (!preparedStatement.f41075f) {
            n(preparedStatement);
            return;
        }
        try {
            nativeResetStatementAndClearBindings(this.f41056j, preparedStatement.f41072c);
        } catch (SQLiteException unused) {
            this.f41053g.remove(preparedStatement.f41071b);
        }
    }

    public final void t(String str) {
        String strM = m("PRAGMA journal_mode");
        if (strM.equalsIgnoreCase(str)) {
            return;
        }
        try {
            if (m("PRAGMA journal_mode=".concat(str)).equalsIgnoreCase(str)) {
                return;
            }
        } catch (SQLiteDatabaseLockedException unused) {
        }
        StringBuilder sb2 = new StringBuilder("Could not change the database journal mode of '");
        AbstractC3256n.p(sb2, this.f41049c.f41126b, "' from '", strM, "' to '");
        Logger.b().a(5, null, "SQLiteConnection", b.c(sb2, str, "' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode."));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SQLiteConnection: ");
        sb2.append(this.f41049c.f41125a);
        sb2.append(" (");
        return AbstractC0279p0.j(this.f41050d, ")", sb2);
    }

    public final void u() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f41049c;
        if ((sQLiteDatabaseConfiguration.f41127c & 16) != 0) {
            return;
        }
        String string = sQLiteDatabaseConfiguration.f41129e.toString();
        nativeRegisterLocalizedCollators(this.f41056j, string);
        if (this.f41052f) {
            return;
        }
        try {
            h("CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)", null, null);
            String strM = m("SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1");
            if (strM == null || !strM.equals(string)) {
                h("BEGIN", null, null);
                try {
                    h("DELETE FROM android_metadata", null, null);
                    h("INSERT INTO android_metadata (locale) VALUES(?)", new Object[]{string}, null);
                    h("REINDEX LOCALIZED", null, null);
                    h("COMMIT", null, null);
                } catch (Throwable th) {
                    h("ROLLBACK", null, null);
                    throw th;
                }
            }
        } catch (RuntimeException e7) {
            throw new SQLiteException(AbstractC3256n.h(new StringBuilder("Failed to change locale for db '"), sQLiteDatabaseConfiguration.f41126b, "' to '", string, "'."), e7);
        }
    }

    public final void v() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f41049c;
        if (sQLiteDatabaseConfiguration.f41125a.equalsIgnoreCase(":memory:") || this.f41052f) {
            return;
        }
        if ((sQLiteDatabaseConfiguration.f41127c & 536870912) != 0) {
            t("WAL");
            if (d(m("PRAGMA synchronous")).equalsIgnoreCase(d("normal"))) {
                return;
            }
            h("PRAGMA synchronous=".concat("normal"), null, null);
            return;
        }
        t("delete");
        if (d(m("PRAGMA synchronous")).equalsIgnoreCase(d("normal"))) {
            return;
        }
        h("PRAGMA synchronous=".concat("normal"), null, null);
    }

    public final void w(PreparedStatement preparedStatement) {
        if (this.k && !preparedStatement.f41074e) {
            throw new SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
        }
    }
}
