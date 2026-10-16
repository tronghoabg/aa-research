package Va;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Va.f8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0971f8 extends AbstractC1104pb implements Q6 {

    /* renamed from: Q, reason: collision with root package name */
    public static final char[] f14154Q = {'f', 60123, 54576, 49254, 43723, 38149, 32870, 27303, 21781, 16496, 48488, 22480, 26675, 32082, 6092, 10259, 15713, 55228, 59400, 64881, 38840, 43027, 48509, 22444, 26866, 32076, 's', 60107, 54568, 49227, 43740, 38196, 32881, 27316, 21781, 16496, 10937, 5407, 's', 60107, 54568, 49219, 43723, 38176, 32865, 27310, 21788, 16493, 10927, 5384, 'M', 60083, 54762, 49267, 43652, 45977, 22817, 26306, 29616, 6462, 9965, 13213, 55629, 59127, 62353, 39240, 42724, 45963, 22872, 's', 60107, 54568, 49219, 43723, 38181, 32865, 27313, 21764, 16497, 10913, 2275, 57935, 56748, 51404, 41550, 40333, 35057, 25122, 23959, 18683, 8763, 7562, 2281, 57892, 56677, 51416, 41488, 40260, 35033, 25091, 23929, 55965, 12292, 4086, 6845, 28690, 20382, 23227, 45170, 36801, 39594, 61553, 53122, 55957, 12406, 3897, 6793, 28749, 20258, 23181, 45148, 36647, 39614, 61537, 53023, 56044, 12367, 3861, 6902, 29113, 20225, 23250, 45454, 36729, 39618, 61861, 53042, 56014, 12703, 3960, 6707, 29086, 20323, 23156, 45455, 36693, 39482, 61940, 53061, 55836, 12726, 3843, '\''};

    /* renamed from: R, reason: collision with root package name */
    public static final byte[] f14155R = {-23, 13, -9, 0, 13, -1, -19, -64, -1, 6, -11, 19, -8, 5, -1, -8, -28, -13, -8, 12, 19, -36, 3, -5, 17, -2, -9, 0, -1, 44, -49, 15, -2, -7, -8, 12, 19, -29, -7, 3, -8, 3, 15, 23, -22, -1, -15, 19, -8, 5, -1, 24, -39, 15, -14, -7, -8, 12, 19, -29, -7, 3, -8, 3, 15, 23, -22, -1, -15, 19, -8, 5, -1, 24, -39, 15, -2, -17, -16, 7, 9, -17, 17, 19, -18, 35, -51, 15, -2, -12, 35, -45, 9, 0, -13, 15, -16, 7, 0, -9, 47, -45, 42, -43, 15, -2, -15, 27, -43, 6, 9, -8, 8, 2, 2, -11, 28, -36, 15, -2, -18, -2, -5, 1, -2, 50, -48, 42, -43, 15, -2, -23, -1, -4, 41, -37, -5, -16, -19, 19, 29, -42, -1, 6, -11, 19, -8, 5, -1, 24};

    /* renamed from: S, reason: collision with root package name */
    public static int f14156S = 0;

    /* renamed from: T, reason: collision with root package name */
    public static int f14157T = 1;

    /* renamed from: K, reason: collision with root package name */
    public String f14158K;

    /* renamed from: N, reason: collision with root package name */
    public boolean f14160N;

    /* renamed from: O, reason: collision with root package name */
    public String f14161O;
    public String L = "";

    /* renamed from: M, reason: collision with root package name */
    public double f14159M = -1.0d;

    /* renamed from: P, reason: collision with root package name */
    public boolean f14162P = false;

    public static String r0(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f14154Q[i5 + i11] ^ (i11 * (-2582761815048852818L))) ^ c10);
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

    public static String v0(int i5, int i10, byte b5, short s10, int i11) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 29;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f14155R[1623520804 + i11] + 29);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - (-1623520802)) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 - 1109589689);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f14155R;
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0376 A[Catch: Exception -> 0x0336, TryCatch #2 {Exception -> 0x0336, blocks: (B:60:0x032b, B:64:0x0339, B:66:0x0340, B:72:0x0363, B:74:0x0376, B:76:0x037b, B:69:0x034a, B:71:0x0361, B:77:0x037c, B:78:0x037e, B:79:0x037f, B:81:0x038c, B:84:0x0398, B:85:0x0399, B:86:0x039a, B:88:0x03a6, B:90:0x03b3, B:92:0x03bb, B:91:0x03b9, B:94:0x03c0, B:97:0x03e1, B:98:0x03e2, B:100:0x03ef, B:103:0x0401, B:104:0x0402, B:105:0x0403, B:107:0x0424, B:110:0x0434, B:111:0x0435, B:113:0x0448, B:115:0x045d, B:117:0x0461), top: B:127:0x02f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x037b A[Catch: Exception -> 0x0336, TryCatch #2 {Exception -> 0x0336, blocks: (B:60:0x032b, B:64:0x0339, B:66:0x0340, B:72:0x0363, B:74:0x0376, B:76:0x037b, B:69:0x034a, B:71:0x0361, B:77:0x037c, B:78:0x037e, B:79:0x037f, B:81:0x038c, B:84:0x0398, B:85:0x0399, B:86:0x039a, B:88:0x03a6, B:90:0x03b3, B:92:0x03bb, B:91:0x03b9, B:94:0x03c0, B:97:0x03e1, B:98:0x03e2, B:100:0x03ef, B:103:0x0401, B:104:0x0402, B:105:0x0403, B:107:0x0424, B:110:0x0434, B:111:0x0435, B:113:0x0448, B:115:0x045d, B:117:0x0461), top: B:127:0x02f6 }] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v78 */
    @Override // Va.Q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Va.C1214y7 r24, java.lang.String r25, java.util.ArrayList r26, Va.Ra r27, Va.C1203x8 r28) {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0971f8.a(Va.y7, java.lang.String, java.util.ArrayList, Va.Ra, Va.x8):java.lang.Object");
    }

    public final String q0() {
        boolean z2;
        String strIntern;
        String strR0;
        int i5 = f14156S;
        int i10 = i5 + 75;
        f14157T = i10 % 128;
        if (i10 % 2 == 0) {
            z2 = this.f14160N;
            int i11 = 27 / 0;
        } else {
            z2 = this.f14160N;
        }
        if (!(!z2)) {
            int i12 = i5 + 27;
            f14157T = i12 % 128;
            if (i12 % 2 == 0) {
                strR0 = r0(TextUtils.getOffsetBefore("", 1), 103 % (TypedValue.complexToFloat(1) > 2.0f ? 1 : (TypedValue.complexToFloat(1) == 2.0f ? 0 : -1)), (char) (Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE >> Color.rgb(1, 0, 1)));
            } else {
                strR0 = r0(TextUtils.getOffsetBefore("", 0), 10 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) (Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE));
            }
            strIntern = strR0.intern();
        } else {
            strIntern = v0(ExpandableListView.getPackedPositionType(0L) + 1109589787, (-31) - TextUtils.lastIndexOf("", '0'), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (-1623520804) - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(v0(Drawable.resolveOpacity(0, 0) + 1109589798, View.MeasureSpec.getSize(0) - 30, (byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (short) View.getDefaultSize(0, 0), Color.rgb(0, 0, 0) - 1606743582).intern());
        sb2.append(this.L);
        sb2.append(v0(1109589736 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (-30) - Color.alpha(0), (byte) Color.argb(0, 0, 0, 0), (short) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1623520788).intern());
        sb2.append(strIntern);
        String string = sb2.toString();
        int i13 = f14156S + 97;
        f14157T = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 39 / 0;
        }
        return string;
    }

    public final JSONObject s0() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(AbstractC1141sa.f14608b, this.f14158K);
            double d3 = this.f14159M;
            if (d3 > -1.0d) {
                f14156S = (f14157T + 61) % 128;
                jSONObject2.put(AbstractC1141sa.f14605Z, d3);
            }
            jSONObject2.put(AbstractC1141sa.f14607a0, this.f14161O);
        } catch (JSONException unused) {
        }
        try {
            if (jSONObject2.length() > 0) {
                int i5 = f14157T;
                int i10 = i5 + 43;
                f14156S = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                if (!(!this.f14162P)) {
                    f14156S = (i5 + 109) % 128;
                    jSONObject2.put(AbstractC1141sa.f14609b0, true);
                }
                jSONObject.put(AbstractC1141sa.f14604Y, jSONObject2);
            }
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    public final void t0(String str) {
        int i5 = f14156S;
        int i10 = i5 + 25;
        f14157T = i10 % 128;
        int i11 = i10 % 2;
        this.f14158K = str;
        if (i11 == 0) {
            throw null;
        }
        f14157T = (i5 + 105) % 128;
    }

    public final void u0(String str) {
        int i5 = f14157T;
        int i10 = i5 + 93;
        f14156S = i10 % 128;
        int i11 = i10 % 2;
        this.f14161O = str;
        if (i11 != 0) {
            int i12 = 4 / 0;
        }
        int i13 = i5 + 91;
        f14156S = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 65 / 0;
        }
    }
}
