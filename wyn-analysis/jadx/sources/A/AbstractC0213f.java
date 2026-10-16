package A;

/* renamed from: A.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0213f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f153a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};

    public static /* synthetic */ int a(int i5, int i10) {
        if (i5 == 0 || i10 == 0) {
            throw null;
        }
        return i5 - i10;
    }

    public static /* synthetic */ boolean b(int i5, int i10) {
        if (i5 != 0) {
            return i5 == i10;
        }
        throw null;
    }

    public static int c(float f10, int i5, int i10) {
        return (Float.floatToIntBits(f10) + i5) * i10;
    }

    public static int d(int i5, int i10, int i11) {
        return (f(i5) + i10) * i11;
    }

    public static String e(StringBuilder sb2, long j8, char c10) {
        sb2.append(j8);
        sb2.append(c10);
        return sb2.toString();
    }

    public static /* synthetic */ int f(int i5) {
        if (i5 != 0) {
            return i5 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] g(int i5) {
        int[] iArr = new int[i5];
        System.arraycopy(f153a, 0, iArr, 0, i5);
        return iArr;
    }
}
