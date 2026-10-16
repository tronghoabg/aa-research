package com.carstream.tech.core.license;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class NativeGuard {
    public static volatile boolean a;

    static {
        try {
            System.loadLibrary("guard");
            a = true;
        } catch (Throwable unused) {
            a = false;
        }
    }

    public static byte[] a(byte[] bArr) {
        if (!a) {
            return null;
        }
        try {
            return deMaN(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int b() {
        if (!a) {
            return 0;
        }
        try {
            return kiemVetN();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        if (!a) {
            return null;
        }
        try {
            return kdf(bArr, bArr2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void d(byte[] bArr) {
        if (a && bArr.length == 32) {
            try {
                setCheKeyN(bArr);
            } catch (Throwable unused) {
            }
        }
    }

    private static native byte[] deMaN(byte[] bArr);

    private static native byte[] kdf(byte[] bArr, byte[] bArr2);

    private static native int kiemVetN();

    private static native void setCheKeyN(byte[] bArr);
}
