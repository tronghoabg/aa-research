package net.zetetic.database;

import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.StaleDataException;

/* loaded from: classes5.dex */
public abstract class AbstractWindowedCursor extends AbstractCursor {
    public CursorWindow k;

    @Override // net.zetetic.database.AbstractCursor
    public final void a() {
        super.a();
        CursorWindow cursorWindow = this.k;
        if (cursorWindow != null) {
            cursorWindow.d();
            this.k = null;
        }
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public final void copyStringToBuffer(int i5, CharArrayBuffer charArrayBuffer) {
        CursorWindow cursorWindow = this.k;
        int i10 = this.f41023a;
        if (charArrayBuffer == null) {
            cursorWindow.getClass();
            throw new IllegalArgumentException("CharArrayBuffer should not be null");
        }
        char[] charArray = cursorWindow.z(i10, i5).toCharArray();
        charArrayBuffer.data = charArray;
        charArrayBuffer.sizeCopied = charArray.length;
    }

    public final void d() {
        if (-1 == this.f41023a || getCount() == this.f41023a) {
            throw new CursorIndexOutOfBoundsException(this.f41023a, getCount());
        }
        if (this.k == null) {
            throw new StaleDataException("Attempting to access a closed CursorWindow.Most probable cause: cursor is deactivated prior to calling this method.");
        }
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public final byte[] getBlob(int i5) {
        d();
        return this.k.i(this.f41023a, i5);
    }

    @Override // android.database.Cursor
    public final double getDouble(int i5) {
        d();
        return this.k.o(this.f41023a, i5);
    }

    @Override // android.database.Cursor
    public final float getFloat(int i5) {
        d();
        return (float) this.k.o(this.f41023a, i5);
    }

    @Override // android.database.Cursor
    public final int getInt(int i5) {
        d();
        return (int) this.k.w(this.f41023a, i5);
    }

    @Override // android.database.Cursor
    public final long getLong(int i5) {
        d();
        return this.k.w(this.f41023a, i5);
    }

    @Override // android.database.Cursor
    public final short getShort(int i5) {
        d();
        return (short) this.k.w(this.f41023a, i5);
    }

    @Override // android.database.Cursor
    public final String getString(int i5) {
        d();
        return this.k.z(this.f41023a, i5);
    }

    @Override // android.database.Cursor
    public final int getType(int i5) {
        return this.k.B(this.f41023a, i5);
    }

    @Override // android.database.Cursor
    public final boolean isNull(int i5) {
        return this.k.B(this.f41023a, i5) == 0;
    }
}
