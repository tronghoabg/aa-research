package Va;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.unity3d.services.UnityAdsConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Va.hb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1000hb {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1000hb f14265a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1000hb f14266b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1000hb f14267c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC1000hb[] f14268d;

    /* renamed from: e, reason: collision with root package name */
    public static int f14269e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f14270f = 1;

    static {
        EnumC1000hb enumC1000hb = new EnumC1000hb(b((char) (View.MeasureSpec.getSize(0) + 44882), "셕㩋勞貯", "蠹ㄘ腘䨔", ViewConfiguration.getScrollBarFadeDuration() >> 16).intern(), 0);
        f14265a = enumC1000hb;
        EnumC1000hb enumC1000hb2 = new EnumC1000hb(b((char) (ExpandableListView.getPackedPositionGroup(0L) + 59853), "絡힉춍\uefe9", "箭שׁ뫨\ue70e쥦蓦剃᥄\uedac\u1af4幐ᕇ\u0010醙徠⡚ཫ", TextUtils.indexOf("", "", 0, 0) - 1915254403).intern(), 1);
        f14266b = enumC1000hb2;
        EnumC1000hb enumC1000hb3 = new EnumC1000hb(b((char) (ViewConfiguration.getTouchSlop() >> 8), "Ỻﴁ鼦䤔", "댖ऺ\uf8c8쩡ⱊ敖\udd23⫈ʃ扸꛷⇤\ue916\ue821㓨퉩앩嘏퀏頜퍫曤", '0' - AndroidCharacter.getMirror('0')).intern(), 2);
        f14267c = enumC1000hb3;
        f14268d = new EnumC1000hb[]{enumC1000hb, enumC1000hb2, enumC1000hb3};
        f14270f = (f14269e + 33) % 128;
    }

    public static EnumC1000hb a(String str) {
        f14269e = (f14270f + 67) % 128;
        if (!TextUtils.isEmpty(str)) {
            int iHashCode = str.hashCode();
            char c10 = 65535;
            if (iHashCode != 3642) {
                if (iHashCode != 96921) {
                    if (iHashCode == 109261 && str.equals(b((char) (TextUtils.getTrimmedLength("") + 28132), "媣暖\ue4c4\ud86d", "힜⑰渏", (-999909798) - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                        c10 = 0;
                    }
                } else if (str.equals(b((char) (26394 - ((byte) KeyEvent.getModifierMetaStateMask())), "ꞻ萱ᭁ孧", "䌗꾜⪘", 1099182503 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                    f14269e = (f14270f + 119) % 128;
                    c10 = 1;
                }
            } else if (str.equals(b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22123), "\uf4bc푒毬孖", "닛긞", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1).intern())) {
                c10 = 2;
            }
            if (c10 == 0) {
                return f14265a;
            }
            if (c10 == 1) {
                return f14266b;
            }
            if (c10 == 2) {
                int i5 = f14270f + 119;
                f14269e = i5 % 128;
                if (i5 % 2 == 0) {
                    return f14267c;
                }
                throw null;
            }
        }
        return null;
    }

    public static String b(char c10, String str, String str2, int i5) {
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
                        cArr3[i10] = (char) (((charArray[i10] ^ c12) ^ 1183494631) ^ 0);
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

    public static EnumC1000hb valueOf(String str) {
        f14270f = (f14269e + 49) % 128;
        EnumC1000hb enumC1000hb = (EnumC1000hb) Enum.valueOf(EnumC1000hb.class, str);
        f14270f = (f14269e + 9) % 128;
        return enumC1000hb;
    }

    public static EnumC1000hb[] values() throws CloneNotSupportedException {
        int i5 = f14269e + 79;
        f14270f = i5 % 128;
        int i10 = i5 % 2;
        EnumC1000hb[] enumC1000hbArr = f14268d;
        if (i10 == 0) {
            enumC1000hbArr.clone();
            throw null;
        }
        EnumC1000hb[] enumC1000hbArr2 = (EnumC1000hb[]) enumC1000hbArr.clone();
        int i11 = f14270f + 51;
        f14269e = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 21 / 0;
        }
        return enumC1000hbArr2;
    }
}
