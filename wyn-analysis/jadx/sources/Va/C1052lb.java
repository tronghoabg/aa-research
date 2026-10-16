package Va;

import android.content.Context;
import com.applovin.shadow.okhttp3.internal.http2.Settings;

/* renamed from: Va.lb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1052lb {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f14369d = {62889, 17968, 37544, 61211, 15245, 29721, 'i', 46075, 26466, 6907, 22842, 60093, 15922, 17341, 46054, 'b', 54501, 43373, 32196, 'u', 46049, 26484, 'u', 46059, 't', 'm', 46055, 26484, 6909, 52812, 49398, 29554, 42981, 55926, 3805, 16722, 62920, 10327, 23726, 36641, 50094, 30257, 33936, 14103, 58245, 40475, 19134, 1328, 45477, 'n', 46079, 26481, 6894, 'a', 46060, 26465, 6855, 52809, 33222, 13657, 59596, 39967, 20394, 828, 46775, 27138, 'm', 46076, 26484, 6892, 59470, 23523, 36686, 62178, 9806, 27083, 56662, 195, 29750, 42901, 60218, 24230, 33306, 62850, 14604, 27779, 53448, 1122, 30705, 47986, 61149, 21062, 34251, 51544, 15549, 29426, 49485, 5589, 26688, 48357, 62271, 18406, 39531, 61075, 15638, 29065, 50184, 6391, 28466, 41890, 63035, 19030, 40607, 60739, 8654, 29795, 51454, 7975, 21477, 42500, 64144, 18697, 40399, 53283, 9392, 31591, 53162, 961, 22106, 43721, 63835};

    /* renamed from: e, reason: collision with root package name */
    public static int f14370e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f14371f = 1;

    /* renamed from: a, reason: collision with root package name */
    public final long f14372a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14373b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14374c;

    public C1052lb(long j8, String str, String str2, int i5) {
        this.f14373b = str;
        this.f14372a = j8;
        Aa aa2 = new Aa();
        aa2.f13191a = i5;
        aa2.f13192b = str2;
        this.f14374c = aa2;
    }

    public static String a(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f14369d[i5 + i11] ^ (i11 * 2141125209773618056L)) ^ c10);
                        Ab.f13217t = i11 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static String b(char c10, String str, String str2, int i5) {
        String str3;
        char[] charArray = str2.toCharArray();
        char[] charArray2 = str.toCharArray();
        char[] charArray3 = "∿㋱퀾\uf204".toCharArray();
        synchronized (AbstractC0897a.f13934r) {
            try {
                char[] cArr = (char[]) charArray2.clone();
                char[] cArr2 = (char[]) charArray3.clone();
                cArr[0] = (char) (c10 ^ cArr[0]);
                cArr2[2] = (char) (cArr2[2] + ((char) i5));
                int length = charArray.length;
                char[] cArr3 = new char[length];
                AbstractC0897a.f13933q = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13933q;
                    if (i10 < length) {
                        int i11 = (i10 + 3) % 4;
                        int i12 = cArr[i10 % 4] * 32718;
                        char c11 = cArr2[(i10 + 2) % 4];
                        char c12 = (char) ((i12 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr2[i11] = (char) (((cArr[i11] * 32718) + c11) / Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr[i11] = c12;
                        long j8 = (charArray[i10] ^ c12) ^ (-1007451451062934977L);
                        long j10 = 0;
                        cArr3[i10] = (char) ((j8 ^ j10) ^ j10);
                        AbstractC0897a.f13933q = i10 + 1;
                    } else {
                        str3 = new String(cArr3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0575 A[Catch: all -> 0x060d, TryCatch #8 {all -> 0x060d, blocks: (B:75:0x0557, B:77:0x0575, B:79:0x057b, B:81:0x058b, B:83:0x05cc, B:88:0x0612, B:89:0x0617), top: B:161:0x0557 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0612 A[Catch: all -> 0x060d, TRY_ENTER, TryCatch #8 {all -> 0x060d, blocks: (B:75:0x0557, B:77:0x0575, B:79:0x057b, B:81:0x058b, B:83:0x05cc, B:88:0x0612, B:89:0x0617), top: B:161:0x0557 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject c(org.json.JSONObject r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 2586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1052lb.c(org.json.JSONObject, boolean, boolean, boolean):org.json.JSONObject");
    }

    public C1052lb(Context context, H h10, long j8) {
        this.f14373b = context;
        this.f14374c = h10;
        this.f14372a = j8;
        context.getApplicationContext();
    }
}
