package Va;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.view.KeyEvent;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;

/* renamed from: Va.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1079o extends Ba {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f14440f = {-1158473971, 161436391, 913501415, 1598249512, 1541415918, 1899371733, -108521647, 697692150, 866476346, -1512944352, 2065516738, 21743659, -2110784006, -1655559257, 116784982, 1520133213, 1106918845, -231818547};

    /* renamed from: g, reason: collision with root package name */
    public static int f14441g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f14442h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static int f14443i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static int f14444j = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14445c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Activity f14446d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ C1092p f14447e;

    public /* synthetic */ C1079o(int i5) {
        this.f14445c = i5;
    }

    public static String d(int i5) {
        String str;
        char[] charArray = "ℇ拉Ꚍ\uea41⸎珝랹ﭵ㼪䃪蓈좞\u0c50倞".toCharArray();
        synchronized (AbstractC0897a.f13937u) {
            try {
                AbstractC0897a.f13936t = i5;
                char[] cArr = new char[charArray.length];
                AbstractC0897a.f13935s = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13935s;
                    if (i10 < charArray.length) {
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ (-685941845773049503L));
                        AbstractC0897a.f13935s = i10 + 1;
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

    public static String e(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f14440f.clone();
                AbstractC0897a.k = 0;
                while (true) {
                    int i10 = AbstractC0897a.k;
                    if (i10 < iArr.length) {
                        int i11 = iArr[i10];
                        char c10 = (char) (i11 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i11;
                        cArr[1] = c11;
                        int i12 = iArr[i10 + 1];
                        char c12 = (char) (i12 >> 16);
                        cArr[2] = c12;
                        char c13 = (char) i12;
                        cArr[3] = c13;
                        AbstractC0897a.f13928l = (c10 << 16) + c11;
                        AbstractC0897a.f13929m = (c12 << 16) + c13;
                        AbstractC0897a.o(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = AbstractC0897a.f13928l ^ iArr2[i13];
                            AbstractC0897a.f13928l = i14;
                            int iG = AbstractC0897a.G(i14) ^ AbstractC0897a.f13929m;
                            int i15 = AbstractC0897a.f13928l;
                            AbstractC0897a.f13928l = iG;
                            AbstractC0897a.f13929m = i15;
                        }
                        int i16 = AbstractC0897a.f13928l;
                        int i17 = AbstractC0897a.f13929m;
                        AbstractC0897a.f13928l = i17;
                        AbstractC0897a.f13929m = i16;
                        int i18 = i16 ^ iArr2[16];
                        AbstractC0897a.f13929m = i18;
                        int i19 = iArr2[17] ^ i17;
                        AbstractC0897a.f13928l = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        AbstractC0897a.o(iArr2);
                        int i20 = AbstractC0897a.k;
                        int i21 = i20 << 1;
                        cArr2[i21] = cArr[0];
                        cArr2[i21 + 1] = cArr[1];
                        cArr2[i21 + 2] = cArr[2];
                        cArr2[i21 + 3] = cArr[3];
                        AbstractC0897a.k = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // Va.Ba
    public final void c() throws JSONException {
        switch (this.f14445c) {
            case 0:
                f14441g = (f14442h + 85) % 128;
                C1092p c1092p = this.f14447e;
                C1194x.o(c1092p.f14469a).d(e(11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new int[]{-167356785, 473306100, 1522588597, -723332714, 1618864549, 1842860760}).intern());
                c1092p.f14469a.x(e((AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 10, new int[]{-167356785, 473306100, 1522588597, -723332714, 1618864549, 1842860760}).intern(), C1092p.e(this.f14446d));
                f14442h = (f14441g + 61) % 128;
                return;
            default:
                f14443i = (f14444j + 115) % 128;
                C1092p c1092p2 = this.f14447e;
                C1194x.o(c1092p2.f14469a).d(d(17351 - Drawable.resolveOpacity(0, 0)).intern());
                c1092p2.f14469a.x(d(((byte) KeyEvent.getModifierMetaStateMask()) + 17352).intern(), C1092p.e(this.f14446d));
                int i5 = f14443i + 49;
                f14444j = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                return;
        }
    }
}
