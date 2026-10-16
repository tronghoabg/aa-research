package Va;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Va.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0988h {

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f14222p = {-2, 6, -10, 8, 2, 17, -39, 18, -4, 19, -14, 3, 17, -2, -5, -4, 37, -38, 27, -31, 9, 6, 9, -4, -3, 41, -52, 18, -4, 19, -12, -3, 14, -14, -14, -2, 6, 9, -4, -3, 41, -34, -8, -2, -3, 10, 37, -31, -3, 14, -14, -14, -2, 4, 7, -9, 15, -16, 18, -21, 21, 23, -27, -14, -2, 41, -23, -17, -2, -4, 51, -32, -14, -2, 3, -4, -13, 10, 20, -26, 5, 8, 20, -33, 31, -36, -4, 18, -4, 19, -29, 0, 14, 2, -12, -3, 2, -13, 3, 1, 7, 30, -38, 27, -31, 14, -4, -11, 11, -13, 13, -11, 17, 2, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: q, reason: collision with root package name */
    public static int f14223q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static int f14224r = 1;

    /* renamed from: a, reason: collision with root package name */
    public String f14225a;

    /* renamed from: b, reason: collision with root package name */
    public String f14226b;

    /* renamed from: c, reason: collision with root package name */
    public String f14227c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14228d;

    /* renamed from: e, reason: collision with root package name */
    public String f14229e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14230f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14231g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14232h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14233i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14234j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f14235l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f14236m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f14237n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f14238o;

    public static /* synthetic */ List a(C0988h c0988h) {
        int i5 = f14224r + 1;
        int i10 = i5 % 128;
        f14223q = i10;
        int i11 = i5 % 2;
        ArrayList arrayList = c0988h.f14236m;
        if (i11 != 0) {
            int i12 = 78 / 0;
        }
        int i13 = i10 + 117;
        f14224r = i13 % 128;
        if (i13 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    public static /* synthetic */ List b(C0988h c0988h) {
        int i5 = f14224r;
        int i10 = i5 + 5;
        f14223q = i10 % 128;
        int i11 = i10 % 2;
        ArrayList arrayList = c0988h.f14237n;
        if (i11 != 0) {
            throw null;
        }
        int i12 = i5 + 107;
        f14223q = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 59 / 0;
        }
        return arrayList;
    }

    public static String c(int i5, int i10, byte b5, short s10, int i11) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i11 + 93;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f14222p[653552270 + i5] + 93);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i5 + i12) - (-653552268)) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i10 + 679993649);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f14222p;
                        int i14 = AbstractC1104pb.f14486F;
                        AbstractC1104pb.f14486F = i14 - 1;
                        char c11 = (char) (AbstractC1104pb.f14489I + (((byte) (bArr[i14] + s10)) ^ AbstractC1104pb.f14487G));
                        AbstractC1104pb.f14488H = c11;
                        sb2.append(c11);
                        AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                        AbstractC1104pb.f14485E++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public static /* synthetic */ boolean d(C0988h c0988h) {
        int i5 = (f14224r + 93) % 128;
        f14223q = i5;
        boolean z2 = c0988h.f14232h;
        int i10 = i5 + 103;
        f14224r = i10 % 128;
        if (i10 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public static String e(int i5, String str) {
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
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ 18995913069435934L);
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

    public static /* synthetic */ List f(C0988h c0988h) {
        int i5 = f14223q;
        int i10 = i5 + 59;
        f14224r = i10 % 128;
        int i11 = i10 % 2;
        ArrayList arrayList = c0988h.f14235l;
        if (i11 == 0) {
            int i12 = 25 / 0;
        }
        f14224r = (i5 + 3) % 128;
        return arrayList;
    }
}
