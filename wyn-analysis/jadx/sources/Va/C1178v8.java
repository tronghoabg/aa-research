package Va;

import android.view.ViewConfiguration;

/* renamed from: Va.v8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1178v8 {

    /* renamed from: c, reason: collision with root package name */
    public static int f14705c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f14706d = 1;

    /* renamed from: a, reason: collision with root package name */
    public final EnumC1165u8 f14707a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14708b;

    public C1178v8(EnumC1165u8 enumC1165u8, String str) {
        this.f14707a = enumC1165u8;
        this.f14708b = str;
    }

    public final boolean a() {
        int i5 = f14705c + 17;
        f14706d = i5 % 128;
        if (i5 % 2 == 0) {
            d();
            EnumC1165u8 enumC1165u8 = EnumC1165u8.f14664a;
            throw null;
        }
        if (d() == EnumC1165u8.f14665b) {
            f14706d = (f14705c + 77) % 128;
            return true;
        }
        int i10 = f14705c + 19;
        f14706d = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 14 / 0;
        }
        return false;
    }

    public final boolean b() {
        int i5 = f14705c + 29;
        f14706d = i5 % 128;
        if (i5 % 2 == 0) {
            d();
            EnumC1165u8 enumC1165u8 = EnumC1165u8.f14664a;
            throw null;
        }
        if (d() == EnumC1165u8.f14669f) {
            return true;
        }
        f14706d = (f14705c + 3) % 128;
        return false;
    }

    public final boolean c() {
        int i5 = f14706d + 119;
        f14705c = i5 % 128;
        if (i5 % 2 != 0) {
            d();
            EnumC1165u8 enumC1165u8 = EnumC1165u8.f14664a;
            throw null;
        }
        if (d() != EnumC1165u8.f14670g) {
            return false;
        }
        f14705c = (f14706d + 51) % 128;
        return true;
    }

    public final EnumC1165u8 d() {
        f14705c = (f14706d + 123) % 128;
        return this.f14707a;
    }

    public final boolean e() {
        if (d() == EnumC1165u8.f14668e) {
            f14705c = (f14706d + 99) % 128;
            return true;
        }
        f14706d = (f14705c + 49) % 128;
        return false;
    }

    public final String f() {
        int i5 = f14705c + 79;
        f14706d = i5 % 128;
        if (i5 % 2 != 0) {
            return this.f14708b;
        }
        throw null;
    }

    public final boolean g() {
        if (d() == EnumC1165u8.f14667d) {
            f14706d = (f14705c + 41) % 128;
            return true;
        }
        f14705c = (f14706d + 103) % 128;
        return false;
    }

    public final boolean h(String str) {
        int i5 = f14705c + 77;
        f14706d = i5 % 128;
        int i10 = i5 % 2;
        String str2 = this.f14708b;
        if (i10 == 0) {
            str2.equals(str);
            throw null;
        }
        boolean zEquals = str2.equals(str);
        f14705c = (f14706d + 91) % 128;
        return zEquals;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f14707a);
        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 2381;
        char[] charArray = "枰".toCharArray();
        synchronized (AbstractC0897a.f13937u) {
            try {
                AbstractC0897a.f13936t = touchSlop;
                char[] cArr = new char[charArray.length];
                AbstractC0897a.f13935s = 0;
                while (true) {
                    int i5 = AbstractC0897a.f13935s;
                    if (i5 < charArray.length) {
                        cArr[i5] = (char) ((charArray[i5] ^ (AbstractC0897a.f13936t * i5)) ^ 28018248313169802L);
                        AbstractC0897a.f13935s = i5 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        sb2.append(str.intern());
        sb2.append(this.f14708b);
        String string = sb2.toString();
        f14705c = (f14706d + 73) % 128;
        return string;
    }
}
