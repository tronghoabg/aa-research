package ff;

/* renamed from: ff.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2648c {
    public static void a(int i5, int i10, int i11) {
        if (i5 < 0 || i10 > i11) {
            StringBuilder sbH = R8.v.h("startIndex: ", i5, ", endIndex: ", i10, ", size: ");
            sbH.append(i11);
            throw new IndexOutOfBoundsException(sbH.toString());
        }
        if (i5 > i10) {
            throw new IllegalArgumentException(R8.v.e(i5, i10, "startIndex: ", " > endIndex: "));
        }
    }

    public static void b(int i5, int i10) {
        if (i5 < 0 || i5 >= i10) {
            throw new IndexOutOfBoundsException(R8.v.e(i5, i10, "index: ", ", size: "));
        }
    }

    public static void c(int i5, int i10) {
        if (i5 < 0 || i5 > i10) {
            throw new IndexOutOfBoundsException(R8.v.e(i5, i10, "index: ", ", size: "));
        }
    }

    public static void d(int i5, int i10, int i11) {
        if (i5 < 0 || i10 > i11) {
            StringBuilder sbH = R8.v.h("fromIndex: ", i5, ", toIndex: ", i10, ", size: ");
            sbH.append(i11);
            throw new IndexOutOfBoundsException(sbH.toString());
        }
        if (i5 > i10) {
            throw new IllegalArgumentException(R8.v.e(i5, i10, "fromIndex: ", " > toIndex: "));
        }
    }

    public static int e(int i5, int i10) {
        int i11 = i5 + (i5 >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        if (i11 - 2147483639 <= 0) {
            return i11;
        }
        if (i10 > 2147483639) {
            return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        return 2147483639;
    }
}
