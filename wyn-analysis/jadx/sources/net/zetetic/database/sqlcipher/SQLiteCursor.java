package net.zetetic.database.sqlcipher;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.util.HashMap;
import net.zetetic.database.AbstractWindowedCursor;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.Logger;

/* loaded from: classes5.dex */
public class SQLiteCursor extends AbstractWindowedCursor {

    /* renamed from: l, reason: collision with root package name */
    public final String[] f41106l;

    /* renamed from: m, reason: collision with root package name */
    public final SQLiteQuery f41107m;

    /* renamed from: n, reason: collision with root package name */
    public final SQLiteCursorDriver f41108n;

    /* renamed from: o, reason: collision with root package name */
    public int f41109o;

    /* renamed from: p, reason: collision with root package name */
    public int f41110p;

    /* renamed from: q, reason: collision with root package name */
    public HashMap f41111q;

    @Deprecated
    public SQLiteCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // net.zetetic.database.AbstractCursor
    public final void b(int i5) {
        int i10;
        CursorWindow cursorWindow = this.k;
        if (cursorWindow == null || i5 < (i10 = cursorWindow.f41035c) || i5 >= cursorWindow.y() + i10) {
            h(i5);
        }
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        synchronized (this) {
            this.f41107m.d();
            this.f41108n.getClass();
        }
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public final void deactivate() {
        a();
        this.f41108n.getClass();
    }

    @Override // net.zetetic.database.AbstractCursor
    public final void finalize() {
        try {
            if (this.k != null) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public final int getColumnIndex(String str) {
        if (this.f41111q == null) {
            String[] strArr = this.f41106l;
            int length = strArr.length;
            HashMap map = new HashMap(length, 1.0f);
            for (int i5 = 0; i5 < length; i5++) {
                map.put(strArr[i5], Integer.valueOf(i5));
            }
            this.f41111q = map;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            Logger.a(new Exception(), "SQLiteCursor", "requesting column name with table name -- ".concat(str));
            str = str.substring(iLastIndexOf + 1);
        }
        Integer num = (Integer) this.f41111q.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.database.Cursor
    public final String[] getColumnNames() {
        return this.f41106l;
    }

    @Override // android.database.Cursor
    public final int getCount() {
        if (this.f41109o == -1) {
            h(0);
        }
        return this.f41109o;
    }

    public final void h(int i5) {
        SQLiteQuery sQLiteQuery = this.f41107m;
        String strJ = sQLiteQuery.f41152b.J();
        CursorWindow cursorWindow = this.k;
        if (cursorWindow == null) {
            CursorWindow cursorWindow2 = new CursorWindow(strJ, Http2.INITIAL_MAX_FRAME_SIZE);
            CursorWindow cursorWindow3 = this.k;
            if (cursorWindow2 != cursorWindow3) {
                if (cursorWindow3 != null) {
                    cursorWindow3.d();
                    this.k = null;
                }
                this.k = cursorWindow2;
            }
            this.f41109o = -1;
        } else {
            cursorWindow.h();
        }
        try {
            if (this.f41109o != -1) {
                sQLiteQuery.i(this.k, Math.max(i5 - (this.f41110p / 3), 0), i5, false);
                return;
            }
            this.f41109o = sQLiteQuery.i(this.k, Math.max(i5, 0), i5, true);
            this.f41110p = this.k.y();
            if (Logger.b().b(3, "SQLiteCursor")) {
                Logger.b().a(3, null, "SQLiteCursor", "received count(*) from native_fill_window: " + this.f41109o);
            }
        } catch (RuntimeException e7) {
            CursorWindow cursorWindow4 = this.k;
            if (cursorWindow4 != null) {
                if (cursorWindow4 != null) {
                    cursorWindow4.d();
                    this.k = null;
                }
                this.k = null;
            }
            this.f41109o = -1;
            throw e7;
        }
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public final boolean requery() {
        if (!this.f41024b) {
            synchronized (this) {
                try {
                    if (!this.f41107m.f41152b.isOpen()) {
                        return false;
                    }
                    CursorWindow cursorWindow = this.k;
                    if (cursorWindow != null) {
                        cursorWindow.h();
                    }
                    this.f41023a = -1;
                    this.f41109o = -1;
                    this.f41108n.getClass();
                    try {
                        super.requery();
                        return true;
                    } catch (IllegalStateException e7) {
                        Logger.b().a(5, e7, "SQLiteCursor", "requery() failed " + e7.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return false;
    }

    public SQLiteCursor(SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.f41109o = -1;
        if (sQLiteQuery == null) {
            throw new IllegalArgumentException("query object cannot be null");
        }
        this.f41108n = sQLiteCursorDriver;
        this.f41111q = null;
        this.f41107m = sQLiteQuery;
        this.f41106l = sQLiteQuery.f41155e;
    }
}
