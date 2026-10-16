package u0;

/* renamed from: u0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4168d extends J4.d {

    /* renamed from: d, reason: collision with root package name */
    public static C4168d f46219d;

    @Override // J4.d
    public final int[] f(int i5) {
        int length = j().length();
        if (length <= 0 || i5 >= length) {
            return null;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < length && j().charAt(i5) == '\n' && (j().charAt(i5) == '\n' || (i5 != 0 && j().charAt(i5 - 1) != '\n'))) {
            i5++;
        }
        if (i5 >= length) {
            return null;
        }
        int i10 = i5 + 1;
        while (i10 < length && !o(i10)) {
            i10++;
        }
        return i(i5, i10);
    }

    @Override // J4.d
    public final int[] m(int i5) {
        int length = j().length();
        if (length <= 0 || i5 <= 0) {
            return null;
        }
        if (i5 > length) {
            i5 = length;
        }
        while (i5 > 0 && j().charAt(i5 - 1) == '\n' && !o(i5)) {
            i5--;
        }
        if (i5 <= 0) {
            return null;
        }
        int i10 = i5 - 1;
        while (i10 > 0 && (j().charAt(i10) == '\n' || (i10 != 0 && j().charAt(i10 - 1) != '\n'))) {
            i10--;
        }
        return i(i10, i5);
    }

    public final boolean o(int i5) {
        if (i5 <= 0 || j().charAt(i5 - 1) == '\n') {
            return false;
        }
        return i5 == j().length() || j().charAt(i5) == '\n';
    }
}
