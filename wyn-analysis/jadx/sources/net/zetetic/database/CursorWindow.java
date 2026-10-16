package net.zetetic.database;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import net.zetetic.database.sqlcipher.SQLiteClosable;

/* loaded from: classes5.dex */
public class CursorWindow extends SQLiteClosable {

    /* renamed from: b, reason: collision with root package name */
    public long f41034b;

    /* renamed from: c, reason: collision with root package name */
    public int f41035c;

    /* renamed from: d, reason: collision with root package name */
    public final String f41036d;

    public CursorWindow(String str) {
        this(str, Http2.INITIAL_MAX_FRAME_SIZE);
    }

    private static native boolean nativeAllocRow(long j8);

    private static native void nativeClear(long j8);

    private static native long nativeCreate(String str, int i5);

    private static native void nativeDispose(long j8);

    private static native void nativeFreeLastRow(long j8);

    private static native byte[] nativeGetBlob(long j8, int i5, int i10);

    private static native double nativeGetDouble(long j8, int i5, int i10);

    private static native long nativeGetLong(long j8, int i5, int i10);

    private static native String nativeGetName(long j8);

    private static native int nativeGetNumRows(long j8);

    private static native String nativeGetString(long j8, int i5, int i10);

    private static native int nativeGetType(long j8, int i5, int i10);

    private static native boolean nativePutBlob(long j8, byte[] bArr, int i5, int i10);

    private static native boolean nativePutDouble(long j8, double d3, int i5, int i10);

    private static native boolean nativePutLong(long j8, long j10, int i5, int i10);

    private static native boolean nativePutNull(long j8, int i5, int i10);

    private static native boolean nativePutString(long j8, String str, int i5, int i10);

    private static native boolean nativeSetNumColumns(long j8, int i5);

    public final int B(int i5, int i10) {
        return nativeGetType(this.f41034b, i5 - this.f41035c, i10);
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteClosable
    public final void b() {
        long j8 = this.f41034b;
        if (j8 != 0) {
            nativeDispose(j8);
            this.f41034b = 0L;
        }
    }

    public final void finalize() throws Throwable {
        try {
            long j8 = this.f41034b;
            if (j8 != 0) {
                nativeDispose(j8);
                this.f41034b = 0L;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h() {
        this.f41035c = 0;
        nativeClear(this.f41034b);
    }

    public final byte[] i(int i5, int i10) {
        return nativeGetBlob(this.f41034b, i5 - this.f41035c, i10);
    }

    public final double o(int i5, int i10) {
        return nativeGetDouble(this.f41034b, i5 - this.f41035c, i10);
    }

    public final String toString() {
        return this.f41036d + " {" + Long.toHexString(this.f41034b) + "}";
    }

    public final long w(int i5, int i10) {
        return nativeGetLong(this.f41034b, i5 - this.f41035c, i10);
    }

    public final int y() {
        return nativeGetNumRows(this.f41034b);
    }

    public final String z(int i5, int i10) {
        return nativeGetString(this.f41034b, i5 - this.f41035c, i10);
    }

    public CursorWindow(String str, int i5) {
        this.f41035c = 0;
        str = (str == null || str.length() == 0) ? "<unnamed>" : str;
        this.f41036d = str;
        long jNativeCreate = nativeCreate(str, i5);
        this.f41034b = jNativeCreate;
        if (jNativeCreate != 0) {
            return;
        }
        throw new CursorWindowAllocationException("Cursor window allocation of " + (i5 / Segment.SHARE_MINIMUM) + " kb failed. ");
    }
}
