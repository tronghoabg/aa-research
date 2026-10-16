package net.zetetic.database.sqlcipher;

import android.database.DatabaseUtils;
import android.os.CancellationSignal;
import net.zetetic.database.CursorWindow;

/* loaded from: classes5.dex */
public final class SQLiteSession {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteConnectionPool f41159a;

    /* renamed from: b, reason: collision with root package name */
    public SQLiteConnection f41160b;

    /* renamed from: c, reason: collision with root package name */
    public int f41161c;

    /* renamed from: d, reason: collision with root package name */
    public Transaction f41162d;

    /* renamed from: e, reason: collision with root package name */
    public Transaction f41163e;

    public static final class Transaction {

        /* renamed from: a, reason: collision with root package name */
        public Transaction f41164a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f41165b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f41166c;
    }

    public SQLiteSession(SQLiteConnectionPool sQLiteConnectionPool) {
        if (sQLiteConnectionPool == null) {
            throw new IllegalArgumentException("connectionPool must not be null");
        }
        this.f41159a = sQLiteConnectionPool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0103  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r21, int r22, android.os.CancellationSignal r23) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.zetetic.database.sqlcipher.SQLiteSession.a(java.lang.String, int, android.os.CancellationSignal):void");
    }

    public final void b(int i5, int i10, CancellationSignal cancellationSignal) {
        Transaction transaction = this.f41163e;
        if (transaction != null && transaction.f41165b) {
            throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        if (this.f41163e == null) {
            a(null, i10, cancellationSignal);
        }
        try {
            if (this.f41163e == null) {
                if (i5 == 1) {
                    this.f41160b.h("BEGIN IMMEDIATE;", null, cancellationSignal);
                } else if (i5 != 2) {
                    this.f41160b.h("BEGIN;", null, cancellationSignal);
                } else {
                    this.f41160b.h("BEGIN EXCLUSIVE;", null, cancellationSignal);
                }
            }
            Transaction transaction2 = this.f41162d;
            if (transaction2 != null) {
                this.f41162d = transaction2.f41164a;
                transaction2.f41164a = null;
                transaction2.f41165b = false;
                transaction2.f41166c = false;
            } else {
                transaction2 = new Transaction();
            }
            transaction2.f41164a = this.f41163e;
            this.f41163e = transaction2;
        } catch (Throwable th) {
            if (this.f41163e == null) {
                i();
            }
            throw th;
        }
    }

    public final void c(CancellationSignal cancellationSignal) {
        if (this.f41163e == null) {
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        Transaction transaction = this.f41163e;
        boolean z2 = transaction.f41165b && !transaction.f41166c;
        Transaction transaction2 = transaction.f41164a;
        this.f41163e = transaction2;
        transaction.f41164a = this.f41162d;
        this.f41162d = transaction;
        if (transaction2 != null) {
            if (z2) {
                return;
            }
            transaction2.f41166c = true;
            return;
        }
        try {
            if (z2) {
                this.f41160b.h("COMMIT;", null, cancellationSignal);
            } else {
                this.f41160b.h("ROLLBACK;", null, cancellationSignal);
            }
            i();
        } catch (Throwable th) {
            i();
            throw th;
        }
    }

    public final int d(int i5, String str, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (h(str, i5, null)) {
            return 0;
        }
        a(str, i5, null);
        try {
            return this.f41160b.i(str, objArr);
        } finally {
            i();
        }
    }

    public final int e(String str, Object[] objArr, CursorWindow cursorWindow, int i5, int i10, boolean z2, int i11, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (cursorWindow == null) {
            throw new IllegalArgumentException("window must not be null.");
        }
        if (h(str, i11, cancellationSignal)) {
            cursorWindow.h();
            return 0;
        }
        a(str, i11, cancellationSignal);
        try {
            return this.f41160b.j(str, objArr, cursorWindow, i5, i10, z2, cancellationSignal);
        } finally {
            i();
        }
    }

    public final long f(int i5, String str, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (h(str, i5, null)) {
            return 0L;
        }
        a(str, i5, null);
        try {
            return this.f41160b.k(str, objArr);
        } finally {
            i();
        }
    }

    public final long g(int i5, String str, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (h(str, i5, null)) {
            return 0L;
        }
        a(str, i5, null);
        try {
            return this.f41160b.l(str, objArr);
        } finally {
            i();
        }
    }

    public final boolean h(String str, int i5, CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        int sqlStatementType = DatabaseUtils.getSqlStatementType(str);
        if (sqlStatementType == 4) {
            b(2, i5, cancellationSignal);
            return true;
        }
        if (sqlStatementType != 5) {
            if (sqlStatementType != 6) {
                return false;
            }
            c(cancellationSignal);
            return true;
        }
        Transaction transaction = this.f41163e;
        if (transaction == null) {
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
        if (transaction.f41165b) {
            throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
        transaction.f41165b = true;
        c(cancellationSignal);
        return true;
    }

    public final void i() {
        int i5 = this.f41161c - 1;
        this.f41161c = i5;
        if (i5 == 0) {
            try {
                this.f41159a.D(this.f41160b);
            } finally {
                this.f41160b = null;
            }
        }
    }
}
