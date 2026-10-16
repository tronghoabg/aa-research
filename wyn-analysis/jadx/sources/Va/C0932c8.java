package Va;

/* renamed from: Va.c8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0932c8 {

    /* renamed from: d, reason: collision with root package name */
    public static int f14063d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f14064a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14065b;

    /* renamed from: c, reason: collision with root package name */
    public String f14066c;

    public static String a(int i5, int i10, int i11, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13221x) {
            try {
                char[] cArr = new char[i5];
                Ab.f13219v = 0;
                while (true) {
                    int i12 = Ab.f13219v;
                    if (i12 >= i5) {
                        break;
                    }
                    char c10 = (char) (charArray[i12] + i10);
                    cArr[i12] = c10;
                    cArr[i12] = (char) (c10 - 'l');
                    Ab.f13219v = i12 + 1;
                }
                if (i11 > 0) {
                    Ab.f13220w = i11;
                    char[] cArr2 = new char[i5];
                    System.arraycopy(cArr, 0, cArr2, 0, i5);
                    int i13 = Ab.f13220w;
                    System.arraycopy(cArr2, 0, cArr, i5 - i13, i13);
                    int i14 = Ab.f13220w;
                    System.arraycopy(cArr2, i14, cArr, 0, i5 - i14);
                }
                char[] cArr3 = new char[i5];
                Ab.f13219v = 0;
                while (true) {
                    int i15 = Ab.f13219v;
                    if (i15 < i5) {
                        cArr3[i15] = cArr[(i5 - i15) - 1];
                        Ab.f13219v = i15 + 1;
                    } else {
                        str2 = new String(cArr3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public final String b() {
        if ((f14063d + 61) % 2 == 0) {
            int i5 = 9 / 0;
        }
        return this.f14066c;
    }

    public final boolean c() {
        int i5 = ((f14063d + 5) % 128) + 91;
        f14063d = i5 % 128;
        if (i5 % 2 == 0) {
            return this.f14064a;
        }
        throw null;
    }
}
