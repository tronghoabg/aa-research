package defpackage;

import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class ytc implements yta {
    public static final ytc a;
    public static final ytc b;
    private static final Unsafe c;
    private static final int d;
    private static final /* synthetic */ ytc[] e;

    static {
        Unsafe unsafeM;
        ytc ytcVar = new ytc("UNSAFE_LITTLE_ENDIAN", 0);
        a = ytcVar;
        ytc ytcVar2 = new ytc("UNSAFE_BIG_ENDIAN", 1);
        b = ytcVar2;
        e = new ytc[]{ytcVar, ytcVar2};
        try {
            try {
                unsafeM = Unsafe.getUnsafe();
            } catch (Exception e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2);
            }
        } catch (SecurityException unused) {
            try {
                unsafeM = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, new ytb());
            } catch (Exception unused2) {
                unsafeM = a.M();
            }
        }
        c = unsafeM;
        d = unsafeM.arrayBaseOffset(byte[].class);
        if (unsafeM.arrayIndexScale(byte[].class) != 1) {
            throw new AssertionError();
        }
    }

    public static ytc valueOf(String str) {
        return (ytc) Enum.valueOf(ytc.class, str);
    }

    public static ytc[] values() {
        return (ytc[]) e.clone();
    }

    @Override // defpackage.yta
    public final /* synthetic */ long a(byte[] bArr, int i) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return c.getLong(bArr, i + d);
        }
        if (iOrdinal == 1) {
            return Long.reverseBytes(c.getLong(bArr, i + d));
        }
        throw null;
    }
}
