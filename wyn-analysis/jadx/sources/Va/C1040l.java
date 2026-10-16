package Va;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Va.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1040l implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static int f14345b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f14346c = 1;

    /* renamed from: a, reason: collision with root package name */
    public final Sa f14347a;

    public C1040l(Sa sa2) {
        this.f14347a = sa2;
    }

    public static String f(char c10, String str, String str2, int i5) {
        String str3;
        char[] charArray = str2.toCharArray();
        char[] charArray2 = str.toCharArray();
        char[] charArray3 = "\u0000\u0000\u0000\u0000".toCharArray();
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
                        cArr3[i10] = (char) (((charArray[i10] ^ c12) ^ 0) ^ 4870);
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

    public final long a() {
        f14346c = (f14345b + 27) % 128;
        long jOptLong = j().optLong(f((char) (TextUtils.getCapsMode("", 0, 0) + 53376), "㉬⮮胳駐", "ీ짩", Color.alpha(0)).intern());
        f14346c = (f14345b + 59) % 128;
        return jOptLong;
    }

    public final long b() {
        f14345b = (f14346c + 89) % 128;
        long jOptInt = j().optInt(f((char) (37785 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "첶ꨎ頔Γ", "诫ಚ", ImageFormat.getBitsPerPixel(0) + 1).intern());
        int i5 = f14345b + 19;
        f14346c = i5 % 128;
        if (i5 % 2 != 0) {
            return jOptInt;
        }
        throw null;
    }

    public final int c(C1040l c1040l) {
        long jA = a();
        long jA2 = c1040l.a();
        if (jA < jA2) {
            int i5 = f14345b + 79;
            f14346c = i5 % 128;
            if (i5 % 2 != 0) {
                return -1;
            }
            throw null;
        }
        if (jA != jA2) {
            return 1;
        }
        int i10 = f14346c + 99;
        f14345b = i10 % 128;
        if (i10 % 2 == 0) {
            return e(c1040l);
        }
        e(c1040l);
        throw null;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        int i5 = f14346c + 15;
        f14345b = i5 % 128;
        C1040l c1040l = (C1040l) obj;
        if (i5 % 2 != 0) {
            c(c1040l);
            throw null;
        }
        int iC = c(c1040l);
        int i10 = f14345b + 79;
        f14346c = i10 % 128;
        if (i10 % 2 != 0) {
            return iC;
        }
        throw null;
    }

    public final Sa d() {
        int i5 = f14345b + 41;
        f14346c = i5 % 128;
        int i10 = i5 % 2;
        Sa sa2 = this.f14347a;
        if (i10 == 0) {
            int i11 = 43 / 0;
        }
        return sa2;
    }

    public final int e(C1040l c1040l) {
        int i5 = f14346c + 55;
        f14345b = i5 % 128;
        if (i5 % 2 != 0) {
            b();
            c1040l.b();
            throw null;
        }
        long jB = b();
        long jB2 = c1040l.b();
        if (jB < jB2) {
            return -1;
        }
        if (jB != jB2) {
            return 1;
        }
        int i10 = f14346c + 83;
        f14345b = i10 % 128;
        return i10 % 2 != 0 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        int i5 = (f14345b + 111) % 128;
        f14346c = i5;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        int i10 = i5 + 89;
        f14345b = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (C1040l.class != obj.getClass()) {
            return false;
        }
        C1040l c1040l = (C1040l) obj;
        int i11 = f14345b;
        int i12 = i11 + 105;
        f14346c = i12 % 128;
        int i13 = i12 % 2;
        Sa sa2 = this.f14347a;
        if (i13 == 0) {
            String str = sa2.f13689b;
            throw null;
        }
        String str2 = sa2.f13689b;
        int i14 = i11 + 105;
        f14346c = i14 % 128;
        int i15 = i14 % 2;
        Sa sa3 = c1040l.f14347a;
        if (i15 != 0) {
            return str2.equals(sa3.f13689b);
        }
        String str3 = sa3.f13689b;
        throw null;
    }

    public final String g() {
        JSONObject jSONObjectJ;
        String strF;
        int i5 = f14345b + 107;
        f14346c = i5 % 128;
        if (i5 % 2 == 0) {
            jSONObjectJ = j();
            strF = f((char) (61498 << Color.argb(0, 1, 0, 1)), "\ue8f5潭㫔돰", "㊮嵃뼻", (-730894872) - TextUtils.indexOf("", ""));
        } else {
            jSONObjectJ = j();
            strF = f((char) (61498 - Color.argb(0, 0, 0, 0)), "\ue8f5潭㫔돰", "㊮嵃뼻", TextUtils.indexOf("", "") - 730894872);
        }
        return jSONObjectJ.optString(strF.intern(), null);
    }

    public final void h(String str) throws JSONException {
        JSONObject jSONObjectJ;
        String strF;
        int i5 = f14346c + 43;
        f14345b = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                jSONObjectJ = j();
                strF = f((char) (61497 / (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), "\ue8f5潭㫔돰", "㊮嵃뼻", (ViewConfiguration.getLongPressTimeout() % 39) - 730894872);
            } else {
                jSONObjectJ = j();
                strF = f((char) ((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 61497), "\ue8f5潭㫔돰", "㊮嵃뼻", (-730894872) - (ViewConfiguration.getLongPressTimeout() >> 16));
            }
            jSONObjectJ.put(strF.intern(), str);
        } catch (JSONException unused) {
        }
    }

    public final int hashCode() {
        f14346c = (f14345b + 85) % 128;
        if (j() == null) {
            return 0;
        }
        int i5 = f14345b + 11;
        f14346c = i5 % 128;
        if (i5 % 2 == 0) {
            j().hashCode();
            throw null;
        }
        int iHashCode = j().hashCode();
        int i10 = f14346c + 11;
        f14345b = i10 % 128;
        if (i10 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String i() {
        f14345b = (f14346c + 5) % 128;
        String strOptString = j().optString(f((char) ((Process.myPid() >> 22) + 13584), "骖껫႔\udc35", "ᰃ࠷ち쥙", 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern());
        int i5 = f14345b + 31;
        f14346c = i5 % 128;
        if (i5 % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    public final synchronized JSONObject j() {
        int i5 = f14345b + 117;
        f14346c = i5 % 128;
        if (i5 % 2 == 0) {
            JSONObject jSONObject = this.f14347a.f13688a;
            throw null;
        }
        return this.f14347a.f13688a;
    }

    public final String toString() {
        int i5 = f14346c + 1;
        f14345b = i5 % 128;
        if (i5 % 2 != 0) {
            j().toString();
            throw null;
        }
        String string = j().toString();
        f14346c = (f14345b + 17) % 128;
        return string;
    }
}
