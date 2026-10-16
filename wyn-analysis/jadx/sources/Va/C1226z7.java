package Va;

/* renamed from: Va.z7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1226z7 extends AbstractC1104pb implements Q6 {

    /* renamed from: M, reason: collision with root package name */
    public static final char[] f14839M = {'s', 'e', 't', 'S', 'a', 'r', 'c', 'h', 'u', 'p', 'C', 'l', 'M', 'i', 'n', 'D', 'F', 'o', 'I', 'A', 'O', 'b', 'j', 'g', 'm', 'y', 'E', 'q', 'd', '\'', 'v', 'w', 'x', 'z', '{', '|'};

    /* renamed from: N, reason: collision with root package name */
    public static int f14840N = 0;

    /* renamed from: O, reason: collision with root package name */
    public static int f14841O = 1;

    /* renamed from: K, reason: collision with root package name */
    public A7 f14842K;
    public yb L;

    public static String A(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f14839M;
                char[] cArr2 = new char[i5];
                if (i5 % 2 != 0) {
                    i5--;
                    cArr2[i5] = (char) (charArray[i5] - b5);
                }
                if (i5 > 1) {
                    Ab.f13193A = 0;
                    while (true) {
                        int i10 = Ab.f13193A;
                        if (i10 >= i5) {
                            break;
                        }
                        char c10 = charArray[i10];
                        int i11 = i10 + 1;
                        char c11 = charArray[i11];
                        if (c10 == c11) {
                            cArr2[i10] = (char) (c10 - b5);
                            cArr2[i11] = (char) (c11 - b5);
                        } else {
                            int i12 = c10 / 6;
                            int i13 = c10 % 6;
                            int i14 = c11 / 6;
                            int i15 = c11 % 6;
                            if (i13 == i15) {
                                cArr2[i10] = cArr[(((i12 + 5) % 6) * 6) + i13];
                                cArr2[i11] = cArr[(((i14 + 5) % 6) * 6) + i15];
                            } else if (i12 == i14) {
                                cArr2[i10] = cArr[(i12 * 6) + ((i13 + 5) % 6)];
                                cArr2[i11] = cArr[(i14 * 6) + ((i15 + 5) % 6)];
                            } else {
                                cArr2[i10] = cArr[(i12 * 6) + i15];
                                cArr2[i11] = cArr[(i14 * 6) + i13];
                            }
                        }
                        Ab.f13193A = i10 + 2;
                    }
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String q0(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC0897a.f13937u) {
            try {
                AbstractC0897a.f13936t = i5;
                char[] cArr = new char[charArray.length];
                AbstractC0897a.f13935s = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13935s;
                    if (i10 < charArray.length) {
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ 4332122569198919397L);
                        AbstractC0897a.f13935s = i10 + 1;
                    } else {
                        str2 = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    @Override // Va.Q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Va.C1214y7 r21, java.lang.String r22, java.util.ArrayList r23, Va.Ra r24, Va.C1203x8 r25) {
        /*
            Method dump skipped, instructions count: 1416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1226z7.a(Va.y7, java.lang.String, java.util.ArrayList, Va.Ra, Va.x8):java.lang.Object");
    }
}
