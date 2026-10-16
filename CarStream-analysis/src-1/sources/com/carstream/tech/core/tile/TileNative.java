package com.carstream.tech.core.tile;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class TileNative {
    public static final boolean a;

    static {
        boolean z;
        try {
            System.loadLibrary("tilecore");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        a = z;
    }

    public static int[] a(byte[] bArr, byte[] bArr2, int i) {
        if (a && bArr != null) {
            try {
                return giaiVaDoc(bArr, bArr2, i);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static native int[] giaiVaDoc(byte[] bArr, byte[] bArr2, int i);
}
