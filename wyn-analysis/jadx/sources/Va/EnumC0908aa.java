package Va;

import java.io.UnsupportedEncodingException;

/* renamed from: Va.aa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC0908aa {
    f13983b(-1),
    f13984c(0),
    f13985d(1),
    f13986e(2),
    f13987f(3),
    f13988g(4),
    f13989h(5),
    f13990i(6);

    public static final char[] k = {382, 375, 372, 376, 384, 370, 374, 362, 368, 366, 369, 381, 373, 383, 365, 377, 386, 363, 380, 364, 379};

    /* renamed from: l, reason: collision with root package name */
    public static int f13992l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static int f13993m = 1;

    /* renamed from: a, reason: collision with root package name */
    public final int f13994a;

    static {
        int i5 = f13993m + 109;
        f13992l = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    EnumC0908aa(int i5) {
        this.f13994a = i5;
    }

    public static EnumC0908aa a(int i5) {
        int i10 = (f13993m + 23) % 128;
        f13992l = i10;
        switch (i5) {
            case -1:
                return f13983b;
            case 0:
                return f13984c;
            case 1:
                return f13985d;
            case 2:
                return f13986e;
            case 3:
                return f13987f;
            case 4:
                int i11 = i10 + 63;
                f13993m = i11 % 128;
                if (i11 % 2 != 0) {
                    return f13988g;
                }
                throw null;
            case 5:
                return f13989h;
            case 6:
                return f13990i;
            default:
                return null;
        }
    }

    public static String c(int i5, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = k;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13938v;
                    if (i10 < AbstractC0897a.f13939w) {
                        cArr2[i10] = (char) (cArr[bytes[(r4 - 1) - i10] + i5] - 297);
                        AbstractC0897a.f13938v = i10 + 1;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static EnumC0908aa valueOf(String str) {
        int i5 = f13992l + 11;
        f13993m = i5 % 128;
        if (i5 % 2 != 0) {
            return (EnumC0908aa) Enum.valueOf(EnumC0908aa.class, str);
        }
        Enum.valueOf(EnumC0908aa.class, str);
        throw null;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0908aa[] valuesCustom() {
        int i5 = f13992l + 87;
        f13993m = i5 % 128;
        int i10 = i5 % 2;
        EnumC0908aa[] enumC0908aaArrValuesCustom = values();
        if (i10 != 0) {
            return (EnumC0908aa[]) enumC0908aaArrValuesCustom.clone();
        }
        EnumC0908aa[] enumC0908aaArr = (EnumC0908aa[]) enumC0908aaArrValuesCustom.clone();
        int i11 = 54 / 0;
        return enumC0908aaArr;
    }

    public final int b() {
        int i5 = f13993m + 23;
        int i10 = i5 % 128;
        f13992l = i10;
        if (i5 % 2 != 0) {
            int i11 = 3 / 0;
        }
        f13993m = (i10 + 109) % 128;
        return this.f13994a;
    }
}
