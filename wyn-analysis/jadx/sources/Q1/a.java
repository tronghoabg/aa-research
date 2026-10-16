package Q1;

import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f9659a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f9660b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f9661c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i5, int i10, int i11) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i5), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static String b(int i5, boolean z2, int i10, int i11, int[] iArr, int i12) {
        Object[] objArr = {f9660b[i5], Integer.valueOf(i10), Integer.valueOf(i11), Character.valueOf(z2 ? 'H' : 'L'), Integer.valueOf(i12)};
        int i13 = x.f9724a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair c(java.lang.String r12, java.lang.String[] r13, N1.C0757f r14) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.a.c(java.lang.String, java.lang.String[], N1.f):android.util.Pair");
    }
}
