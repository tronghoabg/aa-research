package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
final class yuh implements defpackage.yuf {
    public static final defpackage.yuh a;
    public static final defpackage.yuh b;
    private static final sun.misc.Unsafe c;
    private static final int d;
    private static final /* synthetic */ defpackage.yuh[] e;

    static {
        sun.misc.Unsafe unsafeL;
        defpackage.yuh yuhVar = new defpackage.yuh("UNSAFE_LITTLE_ENDIAN", 0);
        a = yuhVar;
        defpackage.yuh yuhVar2 = new defpackage.yuh("UNSAFE_BIG_ENDIAN", 1);
        b = yuhVar2;
        e = new defpackage.yuh[]{yuhVar, yuhVar2};
        try {
            try {
                unsafeL = sun.misc.Unsafe.getUnsafe();
            } catch (java.lang.Exception e2) {
                throw new java.lang.RuntimeException("Could not initialize intrinsics", e2);
            }
        } catch (java.lang.SecurityException unused) {
            try {
                unsafeL = (sun.misc.Unsafe) java.lang.Class.forName("java.security.AccessController").getMethod("doPrivileged", java.security.PrivilegedExceptionAction.class).invoke(null, new defpackage.yug());
            } catch (java.lang.Exception unused2) {
                unsafeL = defpackage.a.L();
            }
        }
        c = unsafeL;
        d = unsafeL.arrayBaseOffset(byte[].class);
        if (unsafeL.arrayIndexScale(byte[].class) != 1) {
            throw new java.lang.AssertionError();
        }
    }

    public static defpackage.yuh valueOf(java.lang.String str) {
        return (defpackage.yuh) java.lang.Enum.valueOf(defpackage.yuh.class, str);
    }

    public static defpackage.yuh[] values() {
        return (defpackage.yuh[]) e.clone();
    }

    @Override // defpackage.yuf
    public final /* synthetic */ long a(byte[] bArr, int i) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return c.getLong(bArr, ((long) i) + ((long) d));
        }
        if (iOrdinal == 1) {
            return java.lang.Long.reverseBytes(c.getLong(bArr, ((long) i) + ((long) d)));
        }
        throw null;
    }
}
