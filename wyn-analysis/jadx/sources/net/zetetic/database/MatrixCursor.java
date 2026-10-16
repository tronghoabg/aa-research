package net.zetetic.database;

import R8.v;
import android.database.CursorIndexOutOfBoundsException;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes5.dex */
public class MatrixCursor extends AbstractCursor {
    public final String[] k;

    /* renamed from: l, reason: collision with root package name */
    public final Object[] f41039l;

    /* renamed from: m, reason: collision with root package name */
    public final int f41040m;

    public class RowBuilder {
    }

    public MatrixCursor(String[] strArr, int i5) {
        this.k = strArr;
        int length = strArr.length;
        this.f41040m = length;
        this.f41039l = new Object[length * (i5 < 1 ? 1 : i5)];
    }

    public final Object d(int i5) {
        int i10 = this.f41040m;
        if (i5 < 0 || i5 >= i10) {
            throw new CursorIndexOutOfBoundsException(v.e(i5, i10, "Requested column: ", ", # of columns: "));
        }
        int i11 = this.f41023a;
        if (i11 < 0) {
            throw new CursorIndexOutOfBoundsException("Before first row.");
        }
        if (i11 >= 0) {
            throw new CursorIndexOutOfBoundsException("After last row.");
        }
        return this.f41039l[(i11 * i10) + i5];
    }

    @Override // android.database.Cursor
    public final String[] getColumnNames() {
        return this.k;
    }

    @Override // android.database.Cursor
    public final int getCount() {
        return 0;
    }

    @Override // android.database.Cursor
    public final double getDouble(int i5) {
        Object objD = d(i5);
        if (objD == null) {
            return 0.0d;
        }
        return objD instanceof Number ? ((Number) objD).doubleValue() : Double.parseDouble(objD.toString());
    }

    @Override // android.database.Cursor
    public final float getFloat(int i5) {
        Object objD = d(i5);
        return objD == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : objD instanceof Number ? ((Number) objD).floatValue() : Float.parseFloat(objD.toString());
    }

    @Override // android.database.Cursor
    public final int getInt(int i5) {
        Object objD = d(i5);
        if (objD == null) {
            return 0;
        }
        return objD instanceof Number ? ((Number) objD).intValue() : Integer.parseInt(objD.toString());
    }

    @Override // android.database.Cursor
    public final long getLong(int i5) {
        Object objD = d(i5);
        if (objD == null) {
            return 0L;
        }
        return objD instanceof Number ? ((Number) objD).longValue() : Long.parseLong(objD.toString());
    }

    @Override // android.database.Cursor
    public final short getShort(int i5) {
        Object objD = d(i5);
        if (objD == null) {
            return (short) 0;
        }
        return objD instanceof Number ? ((Number) objD).shortValue() : Short.parseShort(objD.toString());
    }

    @Override // android.database.Cursor
    public final String getString(int i5) {
        Object objD = d(i5);
        if (objD == null) {
            return null;
        }
        return objD.toString();
    }

    @Override // android.database.Cursor
    public final int getType(int i5) {
        return DatabaseUtils.b(d(i5));
    }

    @Override // android.database.Cursor
    public final boolean isNull(int i5) {
        return d(i5) == null;
    }

    public MatrixCursor(String[] strArr) {
        this(strArr, 16);
    }

    @Override // net.zetetic.database.AbstractCursor
    public final void b(int i5) {
    }
}
