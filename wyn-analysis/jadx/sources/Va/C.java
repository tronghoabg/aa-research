package Va;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class C extends Mb {

    /* renamed from: g, reason: collision with root package name */
    public static int f13246g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f13247h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static int f13248i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static int f13249j = 1;

    public static String A(String str, int i5, int i10, int i11, boolean z2) {
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
                    cArr[i12] = (char) (c10 - 167);
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
                if (z2) {
                    char[] cArr3 = new char[i5];
                    Ab.f13219v = 0;
                    while (true) {
                        int i15 = Ab.f13219v;
                        if (i15 >= i5) {
                            break;
                        }
                        cArr3[i15] = cArr[(i5 - i15) - 1];
                        Ab.f13219v = i15 + 1;
                    }
                    cArr = cArr3;
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String t(String str, int i5, int i10, int i11, boolean z2) {
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
                    cArr[i12] = (char) (c10 - 154);
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
                if (z2) {
                    char[] cArr3 = new char[i5];
                    Ab.f13219v = 0;
                    while (true) {
                        int i15 = Ab.f13219v;
                        if (i15 >= i5) {
                            break;
                        }
                        cArr3[i15] = cArr[(i5 - i15) - 1];
                        Ab.f13219v = i15 + 1;
                    }
                    cArr = cArr3;
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public List B() {
        f13248i = (f13249j + 5) % 128;
        W w2 = (W) this.f13539b;
        w2.getClass();
        int i5 = W.f13803g + 97;
        W.f13804h = i5 % 128;
        int i10 = i5 % 2;
        List listV = Ab.V(w2.f13808d, W.b(i10 == 0 ? 56 >>> View.MeasureSpec.getMode(0) : 127 - View.MeasureSpec.getMode(0), "\u0095\u0093\u0088").intern(), w2.f13805a);
        f13248i = (f13249j + 95) % 128;
        return listV;
    }

    public JSONObject C() {
        JSONObject jSONObjectE;
        String strT;
        int i5 = f13246g + 75;
        f13247h = i5 % 128;
        if (i5 % 2 == 0) {
            jSONObjectE = e();
            strT = t("\u0006\u0004\ufff3\ufffb\u0006\u0005", 27 % (ViewConfiguration.getFadingEdgeLength() >> 21), (ViewConfiguration.getDoubleTapTimeout() % 15) * 13622, 23 >> (TypedValue.complexToFraction(1, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > 1.0f ? 1 : (TypedValue.complexToFraction(1, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 1.0f ? 0 : -1)), false);
        } else {
            jSONObjectE = e();
            strT = t("\u0006\u0004\ufff3\ufffb\u0006\u0005", (ViewConfiguration.getFadingEdgeLength() >> 16) + 6, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 264, (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 6, false);
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectE.optJSONObject(strT.intern());
        int i10 = f13246g + 71;
        f13247h = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 59 / 0;
        }
        return jSONObjectOptJSONObject;
    }

    public int u() {
        f13248i = (f13249j + 107) % 128;
        W w2 = (W) this.f13539b;
        w2.getClass();
        W.f13803g = (W.f13804h + 39) % 128;
        int iOptInt = w2.f13808d.optInt(W.b((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, "\u0083\u0096\u0093\u0088").intern(), 7);
        W.f13804h = (W.f13803g + 115) % 128;
        int i5 = f13249j + 27;
        f13248i = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 85 / 0;
        }
        return iOptInt;
    }

    public int x() {
        f13249j = (f13248i + 49) % 128;
        W w2 = (W) this.f13539b;
        w2.getClass();
        W.f13804h = (W.f13803g + 1) % 128;
        int iOptInt = w2.f13808d.optInt(W.c("\ufffb\u000b￼\u0001", TextUtils.indexOf((CharSequence) "", '0') + 5, View.combineMeasuredStates(0, 0) + 193, View.MeasureSpec.getMode(0) + 3, false).intern(), 2);
        W.f13804h = (W.f13803g + 9) % 128;
        int i5 = f13249j + 97;
        f13248i = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 58 / 0;
        }
        return iOptInt;
    }

    public String y() {
        JSONObject jSONObjectE;
        String strT;
        int i5 = f13247h + 19;
        f13246g = i5 % 128;
        if (i5 % 2 != 0) {
            jSONObjectE = e();
            strT = t("\ufff6\u0005\u0005", 2 - View.getDefaultSize(0, 1), 8495 % Gravity.getAbsoluteGravity(1, 0), 16777217 >> Color.rgb(0, 1, 1), true);
        } else {
            jSONObjectE = e();
            strT = t("\ufff6\u0005\u0005", View.getDefaultSize(0, 0) + 3, 265 - Gravity.getAbsoluteGravity(0, 0), Color.rgb(0, 0, 0) + 16777217, true);
        }
        return jSONObjectE.optString(strT.intern());
    }

    public List z() {
        List listD;
        int i5 = f13249j + 109;
        f13248i = i5 % 128;
        if (i5 % 2 != 0) {
            listD = ((W) this.f13539b).d();
            int i10 = 5 / 0;
        } else {
            listD = ((W) this.f13539b).d();
        }
        int i11 = f13249j + 123;
        f13248i = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 1 / 0;
        }
        return listD;
    }
}
