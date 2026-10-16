package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class fce extends fcg {
    public int[] a;
    public long[] b;
    public double[] c;
    public String[] d;
    public byte[][] e;
    private Cursor i;

    public fce(fbl fblVar, String str) {
        super(fblVar, str);
        this.a = new int[0];
        this.b = new long[0];
        this.c = new double[0];
        this.d = new String[0];
        this.e = new byte[0][];
    }

    private final Cursor p() {
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor;
        }
        dan.k(21, "no row");
        throw new aezp();
    }

    private final void q(int i, int i2) {
        int[] iArr = this.a;
        int i3 = i2 + 1;
        if (iArr.length < i3) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i3);
            iArrCopyOf.getClass();
            this.a = iArrCopyOf;
        }
        if (i == 1) {
            long[] jArr = this.b;
            if (jArr.length < i3) {
                long[] jArrCopyOf = Arrays.copyOf(jArr, i3);
                jArrCopyOf.getClass();
                this.b = jArrCopyOf;
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.c;
            if (dArr.length < i3) {
                double[] dArrCopyOf = Arrays.copyOf(dArr, i3);
                dArrCopyOf.getClass();
                this.c = dArrCopyOf;
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.d;
            if (strArr.length < i3) {
                Object[] objArrCopyOf = Arrays.copyOf(strArr, i3);
                objArrCopyOf.getClass();
                this.d = (String[]) objArrCopyOf;
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.e;
        if (bArr.length < i3) {
            Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i3);
            objArrCopyOf2.getClass();
            this.e = (byte[][]) objArrCopyOf2;
        }
    }

    private final void r() {
        if (this.i == null) {
            fbl fblVar = this.f;
            ajmd ajmdVar = new ajmd(this, null);
            final dxm dxmVar = new dxm(ajmdVar, 2);
            SQLiteDatabase.CursorFactory cursorFactory = new SQLiteDatabase.CursorFactory() { // from class: fbr
                /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor, java.lang.Object] */
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    String[] strArr = fbs.a;
                    return dxmVar.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            };
            Object obj = ajmdVar.a;
            Cursor cursorRawQueryWithFactory = ((fbs) fblVar).e.rawQueryWithFactory(cursorFactory, ((fcg) obj).g, fbs.b, null);
            cursorRawQueryWithFactory.getClass();
            this.i = cursorRawQueryWithFactory;
        }
    }

    private static final void s(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            dan.k(25, "column index out of range");
            throw new aezp();
        }
    }

    @Override // defpackage.fbk
    public final int a() {
        n();
        r();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.fbk
    public final long b(int i) {
        n();
        Cursor cursorP = p();
        s(cursorP, i);
        return cursorP.getLong(i);
    }

    @Override // defpackage.fbk
    public final String c(int i) {
        n();
        r();
        Cursor cursor = this.i;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        s(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.fbk, java.lang.AutoCloseable
    public final void close() {
        if (!this.h) {
            n();
            this.a = new int[0];
            this.b = new long[0];
            this.c = new double[0];
            this.d = new String[0];
            this.e = new byte[0][];
            i();
        }
        o();
    }

    @Override // defpackage.fbk
    public final String d(int i) {
        n();
        Cursor cursorP = p();
        s(cursorP, i);
        String string = cursorP.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.fbk
    public final void e(int i, byte[] bArr) {
        bArr.getClass();
        n();
        q(4, i);
        this.a[i] = 4;
        this.e[i] = bArr;
    }

    @Override // defpackage.fbk
    public final void f(int i, long j) {
        n();
        q(1, i);
        this.a[i] = 1;
        this.b[i] = j;
    }

    @Override // defpackage.fbk
    public final void g(int i) {
        n();
        q(5, i);
        this.a[i] = 5;
    }

    @Override // defpackage.fbk
    public final void h(int i, String str) {
        str.getClass();
        n();
        q(3, i);
        this.a[i] = 3;
        this.d[i] = str;
    }

    @Override // defpackage.fbk
    public final void i() {
        n();
        Cursor cursor = this.i;
        if (cursor != null) {
            cursor.close();
        }
        this.i = null;
    }

    @Override // defpackage.fbk
    public final boolean j(int i) {
        n();
        Cursor cursorP = p();
        s(cursorP, i);
        return cursorP.isNull(i);
    }

    @Override // defpackage.fbk
    public final boolean k() {
        n();
        r();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.fbk
    public final byte[] l(int i) {
        n();
        Cursor cursorP = p();
        s(cursorP, i);
        byte[] blob = cursorP.getBlob(i);
        blob.getClass();
        return blob;
    }
}
