package Va;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okio.Utf8;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONObject;

/* renamed from: Va.pb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1104pb implements Lb {

    /* renamed from: A, reason: collision with root package name */
    public static int f14481A = 0;

    /* renamed from: B, reason: collision with root package name */
    public static int f14482B = 1;

    /* renamed from: C, reason: collision with root package name */
    public static int f14483C = 0;

    /* renamed from: E, reason: collision with root package name */
    public static int f14485E = 0;

    /* renamed from: F, reason: collision with root package name */
    public static int f14486F = 0;

    /* renamed from: G, reason: collision with root package name */
    public static byte f14487G = 0;

    /* renamed from: H, reason: collision with root package name */
    public static char f14488H = 0;

    /* renamed from: I, reason: collision with root package name */
    public static char f14489I = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f14492b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f14493c = 1;

    /* renamed from: f, reason: collision with root package name */
    public static int f14496f = 26;

    /* renamed from: g, reason: collision with root package name */
    public static int f14497g = 17;

    /* renamed from: j, reason: collision with root package name */
    public static int f14500j = 0;
    public static int k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static Class f14501l = null;

    /* renamed from: m, reason: collision with root package name */
    public static Object f14502m = null;

    /* renamed from: n, reason: collision with root package name */
    public static Field f14503n = null;

    /* renamed from: o, reason: collision with root package name */
    public static Field f14504o = null;

    /* renamed from: p, reason: collision with root package name */
    public static Field f14505p = null;

    /* renamed from: q, reason: collision with root package name */
    public static Field f14506q = null;

    /* renamed from: t, reason: collision with root package name */
    public static int f14509t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static int f14510u = 1;

    /* renamed from: w, reason: collision with root package name */
    public static int f14512w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static int f14513x = 1;

    /* renamed from: y, reason: collision with root package name */
    public static int f14514y = 0;

    /* renamed from: z, reason: collision with root package name */
    public static int f14515z = 1;

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f14491a = {1298932842, -197027055, -154054474, -1722665922, 1691398089, -1697114311, -2119410660, 446218433, 1646534289, -1454972747, 939164875, -358157251, -1949797401, 1228462036, -222053653, -702576149, 1634639611, 313094871};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f14494d = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f14495e = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f14498h = {-140861380, -101537821, 1701047980, 1529910405, -1678622952, 457852994, -1682158729, 727614069, 1877836739, -958969474, 784242412, -1683665356, -835964726, -1883250494, 1385268854, -612508731, -1454388289, 1186543329};

    /* renamed from: i, reason: collision with root package name */
    public static final char[] f14499i = {'E', 'r', 'o', ' ', 's', 'e', 'n', 'd', 'i', 'g', 't', 'q', 'u', ':', 'U', 'T', 'F', '-', '8', 'C', 'c', 'P', 'O', 'S', 'y', 'p', 'a', 'l', '/', 'j', ';', 'h', '=', 'f', '\"', '}'};

    /* renamed from: r, reason: collision with root package name */
    public static final char[] f14507r = {217, 230, 220, 234, 231, 225, 166, 238, 221, 239, 207, 197, 223, 193, 229, 232, 228, 236, 188, 222, 237, 191, 218, 199, 204, 219, 224, 196, 235, 152, 200, 241, 187, 203, 227, 190};

    /* renamed from: s, reason: collision with root package name */
    public static final char[] f14508s = {'g', 'e', 't', 'I', 'n', 's', 'a', 'c', 'A', 'd', 'r', 'o', 'i', 'U', 'l', 'E', ' ', 'W', 'w', 'M', 'v', ':', 'm', 'O', 'C', 'k', 'L', 'P', 'y', 'p', 'V', 'h', 'j', 'q', 'u', 'x'};

    /* renamed from: v, reason: collision with root package name */
    public static final char[] f14511v = {'.', 'E', '3', '3', '.', 'G', '\\', '{', 224, 'r', 226, 228, 205, 217, 227, 189, 201, 203, 180, 185, 209, 201, 173, '/', 21, 'C', 'X', 'W', 'g', 'g', '[', '\\', 18, 129, 259, 271, 271, 255, 256, 235, 'L', 160, 167, 153, 133};

    /* renamed from: D, reason: collision with root package name */
    public static final Object f14484D = new Object();

    /* renamed from: J, reason: collision with root package name */
    public static final Object f14490J = new Object();

    public static String A(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f14508s;
                char[] cArr2 = new char[i5];
                if (i5 % 2 != 0) {
                    i5--;
                    cArr2[i5] = (char) (charArray[i5] - b5);
                }
                if (i5 > 1) {
                    Ab.f13193A = 0;
                    while (true) {
                        int i10 = Ab.f13193A;
                        if (i10 >= i5) {
                            break;
                        }
                        char c10 = charArray[i10];
                        int i11 = i10 + 1;
                        char c11 = charArray[i11];
                        if (c10 == c11) {
                            cArr2[i10] = (char) (c10 - b5);
                            cArr2[i11] = (char) (c11 - b5);
                        } else {
                            int i12 = c10 / 6;
                            int i13 = c10 % 6;
                            int i14 = c11 / 6;
                            int i15 = c11 % 6;
                            if (i13 == i15) {
                                cArr2[i10] = cArr[(((i12 + 5) % 6) * 6) + i13];
                                cArr2[i11] = cArr[(((i14 + 5) % 6) * 6) + i15];
                            } else if (i12 == i14) {
                                cArr2[i10] = cArr[(i12 * 6) + ((i13 + 5) % 6)];
                                cArr2[i11] = cArr[(i14 * 6) + ((i15 + 5) % 6)];
                            } else {
                                cArr2[i10] = cArr[(i12 * 6) + i15];
                                cArr2[i11] = cArr[(i14 * 6) + i13];
                            }
                        }
                        Ab.f13193A = i10 + 2;
                    }
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String B(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f14491a.clone();
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

    public static String C(C1052lb c1052lb) {
        int i5 = k + 77;
        int i10 = i5 % 128;
        f14500j = i10;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (c1052lb == null) {
            int i11 = i10 + 107;
            k = i11 % 128;
            if (i11 % 2 != 0) {
                return null;
            }
            throw null;
        }
        String str = (String) c1052lb.f14373b;
        int i12 = i10 + 83;
        k = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static String D(JSONObject jSONObject) throws NoSuchAlgorithmException, InvalidKeyException {
        String strZ;
        String string = jSONObject.toString();
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(e((char) (ViewConfiguration.getJumpTapTimeout() >> 16), "抃ȣ퍜ᄉ", "ྑ押\u2e9a\udb6bК옇밉ሴ렝礣楋࣋숃㻮鬳쨒뗹\uded1韞隗铂ꥎᇐ鍘䄘䪘\ue702⬼ᄌ\ue0f5䍅䱇\u2e61覢", 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern().getBytes(e((char) (TextUtils.getOffsetBefore("", 0) + 12439), "넩텬韼ᐰ", "⩇\uf794ꅢ䦀겹", (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 53384015).intern()), mac.getAlgorithm()));
            strZ = Z(mac.doFinal(string.replaceAll(e((char) ((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 12575), "ኆӄ₼퀱", "ꌛ", 50242 - AndroidCharacter.getMirror('0')).intern(), "").replaceAll(e((char) (TextUtils.lastIndexOf("", '0', 0) + 45142), "姈罥嗯뾰", "씓", View.getDefaultSize(0, 0) - 276863655).intern(), "").getBytes(e((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 12439), "넩텬韼ᐰ", "⩇\uf794ꅢ䦀겹", (-53384015) - (Process.myTid() >> 22)).intern())));
        } catch (Exception e7) {
            String strIntern = e((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "ڥ䉄ৄ༗", "ܕ䭩揔껀극\ueddf꣕藘係", Color.blue(0) - 1002290170).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e((char) Gravity.getAbsoluteGravity(0, 0), "踵\uf7bb쎘毟", "쀿댹࣎\ueb8a⚠㰌漓", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1728595058).intern());
            sb2.append(e7.getLocalizedMessage());
            Ab.x(strIntern, sb2.toString());
            strZ = null;
        }
        StringBuilder sbJ = N0.a.j(string.substring(0, string.lastIndexOf(125)));
        sbJ.append(p(KeyEvent.getDeadChar(0, 0) + 7, new int[]{-1114967043, 215042430, -1044119761, -1995536038}).intern());
        sbJ.append(strZ);
        sbJ.append(V((byte) ((Process.myPid() >> 22) + 53), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2, "#\u001e").intern());
        String string2 = sbJ.toString();
        k = (f14500j + 69) % 128;
        return string2;
    }

    public static Field E(Class cls, String str) throws NoSuchFieldException, SecurityException {
        int i5 = f14509t + 121;
        f14510u = i5 % 128;
        try {
            if (i5 % 2 == 0) {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            }
            Field declaredField2 = cls.getDeclaredField(str);
            declaredField2.setAccessible(true);
            return declaredField2;
        } catch (Exception e7) {
            Ab.a0(A((byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 93), 11 - MotionEvent.axisFromString(""), "\n\u0002\n\u000b\u0006\u0011\u0007\u000f\u0000\u000e\u0011\u0002").intern(), W(Gravity.getAbsoluteGravity(0, 0) + 127, "\u0083\u0091\u0089\u0086¤\u0083\u0089\u0084\u0081\u0091\u009a\u0089\u0093\u0092\u0089\u008d\u009e\u0082\u0086\u009e\u0084\u0085\u0084\u0084\u0089").intern(), e7, false);
            return null;
        }
    }

    public static ArrayList F(String str, String str2, boolean z2) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        loop0: while (matcher.find()) {
            int i5 = f14512w + 61;
            f14513x = i5 % 128;
            if (i5 % 2 == 0) {
                matcher.groupCount();
                throw null;
            }
            if (matcher.groupCount() == 0) {
                arrayList.add(matcher.group());
                if (z2) {
                    int i10 = f14512w;
                    int i11 = i10 + 73;
                    f14513x = i11 % 128;
                    if (i11 % 2 == 0) {
                        throw null;
                    }
                    f14513x = (i10 + 115) % 128;
                    return arrayList;
                }
            } else {
                for (int i12 = 1; i12 <= matcher.groupCount(); i12++) {
                    int i13 = f14512w + 99;
                    f14513x = i13 % 128;
                    if (i13 % 2 == 0) {
                        arrayList.add(matcher.group(i12));
                        int i14 = 38 / 0;
                        if (z2) {
                            break loop0;
                        }
                    } else {
                        arrayList.add(matcher.group(i12));
                        if (z2) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static List G(int i5, List list) {
        List arrayList = new ArrayList();
        if (list.size() > i5 && P(list, i5, List.class)) {
            int i10 = f14482B + 69;
            f14481A = i10 % 128;
            if (i10 % 2 != 0) {
                arrayList = (List) U(list, i5, List.class);
                int i11 = 98 / 0;
            } else {
                arrayList = (List) U(list, i5, List.class);
            }
        }
        int i12 = f14482B + 51;
        f14481A = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 78 / 0;
        }
        return arrayList;
    }

    public static List H(Class cls, Object obj) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (f14503n == null) {
            Field declaredField = cls.getDeclaredField(A((byte) ((PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 38), 7 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\u0012\"\r\u0000\u0017\u0000").intern());
            f14503n = declaredField;
            declaredField.setAccessible(true);
            f14510u = (f14509t + 71) % 128;
        }
        Object obj2 = f14503n.get(obj);
        if (!(obj2 instanceof List)) {
            return obj2 instanceof View[] ? Arrays.asList((View[]) f14503n.get(obj)) : new ArrayList();
        }
        f14509t = (f14510u + 81) % 128;
        return (List) f14503n.get(obj);
    }

    public static void I(Ba ba2) {
        f14492b = (f14493c + 109) % 128;
        try {
            Executors.newSingleThreadExecutor().execute(ba2);
            f14492b = (f14493c + 29) % 128;
        } catch (Throwable th) {
            Ab.a0(B(14 - (Process.myPid() >> 22), new int[]{-1741285904, 660927425, -712794376, 1145832806, -1770931323, -175753562, -1959853324, -418441781}).intern(), B(26 - (KeyEvent.getMaxKeyCode() >> 16), new int[]{-542025723, -667686862, -881736036, -2053683438, -711822109, 416775171, 144066113, -436687946, 2145477332, 1972944995, -645666537, 424064798, -322878268, -2001697437}).intern(), th, false);
        }
    }

    public static void J(MediaPlayer mediaPlayer, N9 n92) throws IllegalAccessException, IllegalArgumentException {
        Field fieldE;
        MediaPlayer.OnCompletionListener onCompletionListener;
        int i5 = f14510u + 15;
        f14509t = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                fieldE = E(MediaPlayer.class, W(TextUtils.getOffsetAfter("", 0) * 49, "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u0082\u0085\u0086\u0092\u0089\u0091\u0090\u008f\u0085¡\u0082\u0098\u008f").intern());
                onCompletionListener = (MediaPlayer.OnCompletionListener) fieldE.get(mediaPlayer);
                if (onCompletionListener instanceof O9) {
                    return;
                }
            } else {
                fieldE = E(MediaPlayer.class, W(127 - TextUtils.getOffsetAfter("", 0), "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u0082\u0085\u0086\u0092\u0089\u0091\u0090\u008f\u0085¡\u0082\u0098\u008f").intern());
                onCompletionListener = (MediaPlayer.OnCompletionListener) fieldE.get(mediaPlayer);
                if (onCompletionListener instanceof O9) {
                    return;
                }
            }
            O9 o92 = new O9(onCompletionListener);
            o92.f13577b = n92;
            fieldE.set(mediaPlayer, o92);
            f14510u = (f14509t + 65) % 128;
        } catch (Exception e7) {
            Ab.a0(A((byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 94), TextUtils.indexOf("", "", 0) + 12, "\n\u0002\n\u000b\u0006\u0011\u0007\u000f\u0000\u000e\u0011\u0002").intern(), W(126 - MotionEvent.axisFromString(""), "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u0082\u0085\u0086\u0092\u0089\u0091\u0090\u008f\u0085¡\u0081\u0086\u0083\u0089\u008c\u0082\u0098\u0089\u009a\u0081\u0091\u0090\u0089\u0084\u009e\u0082\u0086\u009e\u0084\u0085\u0084\u0084\u0089").intern(), e7, false);
        }
    }

    public static void K(MediaPlayer mediaPlayer, T9 t92) throws IllegalAccessException, IllegalArgumentException {
        Field fieldE;
        MediaPlayer.OnSeekCompleteListener onSeekCompleteListener;
        int i5 = f14509t + 115;
        f14510u = i5 % 128;
        try {
            if (i5 % 2 == 0) {
                fieldE = E(MediaPlayer.class, W(ViewConfiguration.getDoubleTapTimeout() >> 51, "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u0089\u0092\u0089\u0091\u0090\u008f\u0085¡£\u0089\u0089¢\u0082\u0098\u008f").intern());
                onSeekCompleteListener = (MediaPlayer.OnSeekCompleteListener) fieldE.get(mediaPlayer);
                if (!(onSeekCompleteListener instanceof U9)) {
                    U9 u92 = new U9(onSeekCompleteListener);
                    u92.f13757b = t92;
                    fieldE.set(mediaPlayer, u92);
                }
            } else {
                fieldE = E(MediaPlayer.class, W((ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u0089\u0092\u0089\u0091\u0090\u008f\u0085¡£\u0089\u0089¢\u0082\u0098\u008f").intern());
                onSeekCompleteListener = (MediaPlayer.OnSeekCompleteListener) fieldE.get(mediaPlayer);
                if (!(onSeekCompleteListener instanceof U9)) {
                    U9 u922 = new U9(onSeekCompleteListener);
                    u922.f13757b = t92;
                    fieldE.set(mediaPlayer, u922);
                }
            }
            int i10 = f14509t + 81;
            f14510u = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        } catch (Exception e7) {
            Ab.a0(A((byte) (92 - TextUtils.indexOf((CharSequence) "", '0', 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 12, "\n\u0002\n\u000b\u0006\u0011\u0007\u000f\u0000\u000e\u0011\u0002").intern(), W((ViewConfiguration.getPressedStateDuration() >> 16) + 127, "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u0089\u0092\u0089\u0091\u0090\u008f\u0085¡£\u0089\u0089¢\u0082\u0098\u0089\u009a\u0081\u0091\u0090\u0089\u0084\u009e\u0082\u0086\u009e\u0084\u0085\u0084\u0084\u0089").intern(), e7, false);
        }
    }

    public static boolean N(int i5, String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 0) {
            return false;
        }
        f14512w = (f14513x + 123) % 128;
        if (str.length() > i5) {
            return false;
        }
        int i10 = f14513x + 93;
        f14512w = i10 % 128;
        return i10 % 2 == 0;
    }

    public static boolean O(String str) {
        int i5 = f14513x + 123;
        f14512w = i5 % 128;
        if (i5 % 2 != 0) {
            Cb.h();
            throw null;
        }
        if (!Cb.h()) {
            try {
                new GZIPInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        int i10 = f14513x + 9;
        f14512w = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public static boolean P(List list, int i5, Class cls) {
        Object obj = list.get(i5);
        if (obj == null) {
            return true;
        }
        int i10 = f14482B + 77;
        f14481A = i10 % 128;
        int i11 = i10 % 2;
        Class<?> cls2 = obj.getClass();
        if (i11 != 0) {
            cls.isAssignableFrom(cls2);
            throw null;
        }
        if (cls.isAssignableFrom(cls2)) {
            return true;
        }
        int i12 = f14481A + 25;
        f14482B = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 25 / 0;
        }
        return false;
    }

    public static byte[] Q(String str) {
        int length;
        byte[] bArr;
        int i5;
        int i10 = f14493c + 117;
        f14492b = i10 % 128;
        if (i10 % 2 != 0) {
            length = str.length();
            bArr = new byte[length >> 3];
            i5 = 1;
        } else {
            length = str.length();
            bArr = new byte[length / 2];
            i5 = 0;
        }
        f14492b = (f14493c + 55) % 128;
        while (i5 < length) {
            bArr[i5 / 2] = (byte) (Character.digit(str.charAt(i5 + 1), 16) + (Character.digit(str.charAt(i5), 16) << 4));
            i5 += 2;
        }
        int i11 = f14493c + 11;
        f14492b = i11 % 128;
        if (i11 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    public static byte[] R(String str) throws C1090oa {
        byte[] bArr;
        byte[] bArr2;
        int i5;
        int i10;
        int iC;
        char c10;
        f14497g = (f14496f + 51) % 128;
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        int i11 = f14496f;
        byte[] bArr3 = f14495e;
        int i12 = i11 + 69;
        int i13 = i12 % 128;
        f14497g = i13;
        if (i12 % 2 == 0) {
            bArr = new byte[((length - 2) * 3) >> 3];
            bArr2 = new byte[5];
            i5 = 1;
            i10 = 1;
            iC = 1;
        } else {
            bArr = new byte[M6.C(length, 3, 4, 2)];
            bArr2 = new byte[4];
            i5 = 0;
            i10 = 0;
            iC = 0;
        }
        f14496f = (i13 + 123) % 128;
        while (true) {
            if (i5 >= length) {
                break;
            }
            int i14 = f14496f;
            int i15 = (i14 + 85) % 128;
            f14497g = i15;
            byte b5 = (byte) (bytes[i5] & 127);
            byte b10 = bArr3[b5];
            if (b10 < -5) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(X("┃빧⧗鞧┃빧쯺쿏ᖤ\udbee榗ꏇ㺯\ud869纹\ue5c1离\ud90dᆸᷦ詃跫။괲䨭⊆⢸ꩂ\ue7ba\uee93", (ViewConfiguration.getPressedStateDuration() >> 16) + 30).intern());
                sb2.append(i5);
                sb2.append(X("毆宱", 2 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
                sb2.append((int) bytes[i5]);
                sb2.append(X("\udfb1곋骊\u3130늊꾧絁푆ꜞ껧", (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 9).intern());
                throw new C1090oa(sb2.toString());
            }
            if (b10 < -1) {
                c10 = 4;
            } else {
                if (b5 == 61) {
                    int i16 = length - i5;
                    byte b11 = (byte) (bytes[length - 1] & 127);
                    if (i10 != 0) {
                        f14496f = (i15 + 13) % 128;
                        if (i10 != 1) {
                            if (i10 == 3) {
                                f14496f = (i15 + 111) % 128;
                                if (i16 <= 2) {
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(X("︒뭓㹘⦷\ue5f5\ue33c䋀\udfe9鈢ᮄ⟅䤻ⳳ\u09da式ଌ櫒靑絁푆쯺쿏閫嗀\uda0eᥚ\ue086䒹\uef03蝫ﰭ㷞劤얓ꗐ兙ᶖ者ΥꞱ阘㒡ᷝ晋땬謼⧗鞧ꀨ볅䧨\ue460싿\ue186熷脏ᶖ者Ɗ揿쯺쿏\ue7ba\uee93", TextUtils.indexOf("", "", 0, 0) + 64).intern());
                                sb3.append(i5);
                                throw new C1090oa(sb3.toString());
                            }
                            if (i10 != 4 || i16 <= 1) {
                                if (b11 != 61 && b11 != 10) {
                                    throw new C1090oa(X("阘㒡ᷝ晋땬謼⧗鞧ꀨ볅䧨\ue460싿\ue186ᆸᷦᛍ梯\ue5f5\ue33cꀨ볅嶗禚⧗鞧쵻똞후燪嶗禚\udcab\uf102퓖䏿\ue3e7ⲅ慻早", Drawable.resolveOpacity(0, 0) + 39).intern());
                                }
                            }
                            StringBuilder sb32 = new StringBuilder();
                            sb32.append(X("︒뭓㹘⦷\ue5f5\ue33c䋀\udfe9鈢ᮄ⟅䤻ⳳ\u09da式ଌ櫒靑絁푆쯺쿏閫嗀\uda0eᥚ\ue086䒹\uef03蝫ﰭ㷞劤얓ꗐ兙ᶖ者ΥꞱ阘㒡ᷝ晋땬謼⧗鞧ꀨ볅䧨\ue460싿\ue186熷脏ᶖ者Ɗ揿쯺쿏\ue7ba\uee93", TextUtils.indexOf("", "", 0, 0) + 64).intern());
                            sb32.append(i5);
                            throw new C1090oa(sb32.toString());
                        }
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(X("\ue5f5\ue33cꀨ볅嶗禚⧗鞧︒뭓㹘⦷\ue5f5\ue33c䋀\udfe9鈢ᮄ⟅䤻ⳳ\u09da式ଌ⢸ꩂ\ue7ba\uee93鈢ᮄ⟅䤻ᶖ者Ɗ揿쯺쿏\ue7ba\uee93", 40 - Color.green(0)).intern());
                    sb4.append(i5);
                    throw new C1090oa(sb4.toString());
                }
                int i17 = i10 + 1;
                bArr2[i10] = b5;
                c10 = 4;
                if (i17 == 4) {
                    int i18 = i14 + 77;
                    f14497g = i18 % 128;
                    iC = i18 % 2 == 0 ? iC >>> c(bArr2, bArr, iC, bArr3) : c(bArr2, bArr, iC, bArr3) + iC;
                    i10 = 0;
                } else {
                    i10 = i17;
                }
            }
            i5++;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(X("锉螝\udcab\uf102诲\uf02f잆\uf211詃跫莦භ\ue5f5\ue33c䋀\udfe9폝컄\u0cf6㴘錶ኼ⟅䤻殟较熷脏ᶖ者Ɗ揿쯺쿏\ue7ba\uee93", 36 - TextUtils.getCapsMode("", 0, 0)).intern());
                sb5.append(length - 1);
                throw new C1090oa(sb5.toString());
            }
            bArr2[i10] = 61;
            iC += c(bArr2, bArr, iC, bArr3);
        }
        byte[] bArr4 = new byte[iC];
        System.arraycopy(bArr, 0, bArr4, 0, iC);
        int i19 = f14496f + 95;
        f14497g = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = 90 / 0;
        }
        return bArr4;
    }

    public static long S() {
        int i5 = f14492b + 75;
        f14493c = i5 % 128;
        if (i5 % 2 != 0) {
            return SystemClock.elapsedRealtime();
        }
        SystemClock.elapsedRealtime();
        throw null;
    }

    public static Object T(Context context) {
        int i5 = f14514y + 49;
        f14515z = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                return AbstractC1168ub.k(i0(), f0(TextUtils.getOffsetBefore("", 0) + 5701, "⭚㴝߃榻片䐗껗낿饻\ue333\uf5ea").intern(), Arrays.asList(context)).invoke(null, context);
            }
            Method methodK = AbstractC1168ub.k(i0(), f0(25488 / TextUtils.getOffsetBefore("", 1), "⭚㴝߃榻片䐗껗낿饻\ue333\uf5ea").intern(), Arrays.asList(context));
            Object[] objArr = new Object[1];
            objArr[1] = context;
            return methodK.invoke(null, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            int i10 = f14515z + 55;
            f14514y = i10 % 128;
            if (i10 % 2 == 0) {
                return null;
            }
            throw null;
        }
    }

    public static Object U(List list, int i5, Class cls) {
        int i10 = f14481A + 17;
        f14482B = i10 % 128;
        if (i10 % 2 == 0) {
            list.get(i5);
            throw null;
        }
        Object obj = list.get(i5);
        if (obj == null || cls.isAssignableFrom(obj.getClass())) {
            int i11 = f14482B + 93;
            f14481A = i11 % 128;
            if (i11 % 2 == 0) {
                return obj;
            }
            throw null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(o((Process.myTid() >> 22) + 1, "誻諸鶀땣წ꼗\udc34뻠筽岵\ufb0dꁅ\ue2b2梆㞕瓒").intern());
        sb2.append(obj.getClass().getName());
        sb2.append(o(1 - Color.blue(0), "ꖠꖀꐒ\ue9e9⥫\uf39c斩슮").intern());
        sb2.append(cls.getName());
        throw new ClassCastException(sb2.toString());
    }

    public static String V(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f14499i;
                char[] cArr2 = new char[i5];
                if (i5 % 2 != 0) {
                    i5--;
                    cArr2[i5] = (char) (charArray[i5] - b5);
                }
                if (i5 > 1) {
                    Ab.f13193A = 0;
                    while (true) {
                        int i10 = Ab.f13193A;
                        if (i10 >= i5) {
                            break;
                        }
                        char c10 = charArray[i10];
                        int i11 = i10 + 1;
                        char c11 = charArray[i11];
                        if (c10 == c11) {
                            cArr2[i10] = (char) (c10 - b5);
                            cArr2[i11] = (char) (c11 - b5);
                        } else {
                            int i12 = c10 / 6;
                            int i13 = c10 % 6;
                            int i14 = c11 / 6;
                            int i15 = c11 % 6;
                            if (i13 == i15) {
                                cArr2[i10] = cArr[(((i12 + 5) % 6) * 6) + i13];
                                cArr2[i11] = cArr[(((i14 + 5) % 6) * 6) + i15];
                            } else if (i12 == i14) {
                                cArr2[i10] = cArr[(i12 * 6) + ((i13 + 5) % 6)];
                                cArr2[i11] = cArr[(i14 * 6) + ((i15 + 5) % 6)];
                            } else {
                                cArr2[i10] = cArr[(i12 * 6) + i15];
                                cArr2[i11] = cArr[(i14 * 6) + i13];
                            }
                        }
                        Ab.f13193A = i10 + 2;
                    }
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String W(int i5, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f14507r;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13938v;
                    if (i10 < AbstractC0897a.f13939w) {
                        cArr2[i10] = (char) (cArr[bytes[(r4 - 1) - i10] + i5] - 'x');
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

    public static String X(String str, int i5) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13198F) {
            try {
                char[] cArr = new char[charArray.length];
                Ab.f13197E = 0;
                char[] cArr2 = new char[2];
                while (true) {
                    int i10 = Ab.f13197E;
                    if (i10 < charArray.length) {
                        cArr2[0] = charArray[i10];
                        cArr2[1] = charArray[i10 + 1];
                        int i11 = 58224;
                        for (int i12 = 0; i12 < 16; i12++) {
                            char c10 = cArr2[1];
                            char c11 = cArr2[0];
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 15139)) ^ ((c11 >>> 5) + 36163)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 15360) ^ ((c12 + i11) ^ ((c12 << 4) + 57987))));
                            i11 -= 40503;
                        }
                        int i13 = Ab.f13197E;
                        cArr[i13] = cArr2[0];
                        cArr[i13 + 1] = cArr2[1];
                        Ab.f13197E = i13 + 2;
                    } else {
                        str2 = new String(cArr, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String Y(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f14511v, i5, cArr, 0, i10);
                if (bytes != null) {
                    char[] cArr2 = new char[i10];
                    Ab.f13222y = 0;
                    char c10 = 0;
                    while (true) {
                        int i13 = Ab.f13222y;
                        if (i13 >= i10) {
                            break;
                        }
                        if (bytes[i13] == 1) {
                            cArr2[i13] = (char) (((cArr[i13] << 1) + 1) - c10);
                        } else {
                            cArr2[i13] = (char) ((cArr[i13] << 1) - c10);
                        }
                        c10 = cArr2[i13];
                        Ab.f13222y = i13 + 1;
                    }
                    cArr = cArr2;
                }
                if (i12 > 0) {
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr, 0, cArr3, 0, i10);
                    int i14 = i10 - i12;
                    System.arraycopy(cArr3, 0, cArr, i14, i12);
                    System.arraycopy(cArr3, i12, cArr, 0, i14);
                }
                if (z2) {
                    char[] cArr4 = new char[i10];
                    Ab.f13222y = 0;
                    while (true) {
                        int i15 = Ab.f13222y;
                        if (i15 >= i10) {
                            break;
                        }
                        cArr4[i15] = cArr[(i10 - i15) - 1];
                        Ab.f13222y = i15 + 1;
                    }
                    cArr = cArr4;
                }
                if (i11 > 0) {
                    Ab.f13222y = 0;
                    while (true) {
                        int i16 = Ab.f13222y;
                        if (i16 >= i10) {
                            break;
                        }
                        cArr[i16] = (char) (cArr[i16] - iArr[2]);
                        Ab.f13222y = i16 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String Z(byte[] r14) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.AbstractC1104pb.Z(byte[]):java.lang.String");
    }

    public static void a0(MediaPlayer mediaPlayer, L9 l92) throws IllegalAccessException, IllegalArgumentException {
        try {
            Field fieldE = E(MediaPlayer.class, W((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u0085\u0094\u0082\u008e\u0082\u0098\u008f").intern());
            MediaPlayer.OnInfoListener onInfoListener = (MediaPlayer.OnInfoListener) fieldE.get(mediaPlayer);
            if (!(onInfoListener instanceof M9)) {
                M9 m92 = new M9(onInfoListener);
                m92.f13532b = l92;
                fieldE.set(mediaPlayer, m92);
                f14510u = (f14509t + 121) % 128;
            }
            f14509t = (f14510u + 63) % 128;
        } catch (Exception e7) {
            Ab.a0(A((byte) ((ViewConfiguration.getTapTimeout() >> 16) + 93), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 11, "\n\u0002\n\u000b\u0006\u0011\u0007\u000f\u0000\u000e\u0011\u0002").intern(), W(View.resolveSizeAndState(0, 0, 0) + 127, "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u0085\u0094\u0082\u008e\u0081\u0086\u0083\u0089\u008c\u0082\u0098\u0089\u009a\u0081\u0091\u0090\u0089\u0084\u009e\u0082\u0086\u009e\u0084\u0085\u0084\u0084\u0089").intern(), e7, false);
        }
    }

    public static int b(String str, String str2) {
        f14512w = (f14513x + 93) % 128;
        int i5 = 0;
        String[] strArrSplit = str.replaceAll(Y("\u0001\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{0, 7, 0, 0}, true).intern(), "").split(Y("\u0001\u0000", new int[]{7, 2, 155, 2}, false).intern());
        String[] strArrSplit2 = str2.replaceAll(Y("\u0001\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{0, 7, 0, 0}, true).intern(), "").split(Y("\u0001\u0000", new int[]{7, 2, 155, 2}, false).intern());
        while (i5 < strArrSplit.length) {
            int i10 = (f14513x + 11) % 128;
            f14512w = i10;
            if (i5 >= strArrSplit2.length) {
                break;
            }
            f14513x = (i10 + 35) % 128;
            if (!strArrSplit[i5].equals(strArrSplit2[i5])) {
                break;
            }
            i5++;
        }
        if (i5 >= strArrSplit.length || i5 >= strArrSplit2.length) {
            return Integer.signum(strArrSplit.length - strArrSplit2.length);
        }
        int i11 = f14512w + 11;
        f14513x = i11 % 128;
        if (i11 % 2 != 0) {
            return Integer.signum(Integer.valueOf(strArrSplit[i5]).compareTo(Integer.valueOf(strArrSplit2[i5])));
        }
        Integer.signum(Integer.valueOf(strArrSplit[i5]).compareTo(Integer.valueOf(strArrSplit2[i5])));
        throw null;
    }

    public static void b0(Closeable closeable) {
        if (closeable != null) {
            f14500j = (k + 77) % 128;
            try {
                closeable.close();
                k = (f14500j + 7) % 128;
            } catch (Throwable unused) {
            }
        }
    }

    public static int c(byte[] bArr, byte[] bArr2, int i5, byte[] bArr3) {
        byte b5 = bArr[2];
        if (b5 == 61) {
            f14497g = (f14496f + 39) % 128;
            bArr2[i5] = (byte) ((((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6)) >>> 16);
            return 1;
        }
        byte b10 = bArr[3];
        if (b10 != 61) {
            int i10 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b5] << 24) >>> 18) | ((bArr3[b10] << 24) >>> 24);
            bArr2[i5] = (byte) (i10 >> 16);
            bArr2[i5 + 1] = (byte) (i10 >> 8);
            bArr2[i5 + 2] = (byte) i10;
            return 3;
        }
        int i11 = f14496f;
        f14497g = (i11 + 77) % 128;
        int i12 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b5] << 24) >>> 18);
        bArr2[i5] = (byte) (i12 >>> 16);
        bArr2[i5 + 1] = (byte) (i12 >>> 8);
        int i13 = i11 + 25;
        f14497g = i13 % 128;
        if (i13 % 2 != 0) {
            return 2;
        }
        throw null;
    }

    public static View.OnClickListener d(View view) {
        try {
            Object objL = l(view);
            if (objL == null) {
                return null;
            }
            Class<?> cls = objL.getClass();
            synchronized (AbstractC1104pb.class) {
                try {
                    if (f14505p == null) {
                        f14505p = E(cls, A((byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 106), KeyEvent.keyCodeFromString("") + 16, "\u0017\u0012\u0000\u001c\u000f\r\r\u001f\u0018\u000e\u0000\u0003\u0002\u0005\u0004\u0007").intern());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return (View.OnClickListener) f14505p.get(objL);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String e(char c10, String str, String str2, int i5) {
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
                        cArr3[i10] = (char) (((charArray[i10] ^ c12) ^ 0) ^ 31817);
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

    public static boolean e0(String str) {
        f14500j = (k + 89) % 128;
        if (str.length() > 256) {
            f14500j = (k + 7) % 128;
            return true;
        }
        k = (f14500j + 81) % 128;
        return false;
    }

    public static String f(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            } catch (Throwable th) {
                th = th;
                bufferedReader = null;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            bufferedReader = null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            f14500j = (k + 109) % 128;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = stringBuffer.toString();
                    b0(inputStream);
                    b0(bufferedReader);
                    k = (f14500j + 25) % 128;
                    return string;
                }
                if (stringBuffer.length() > 0) {
                    stringBuffer.append('\r');
                }
                stringBuffer.append(line);
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                Ab.R(p((AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 8, new int[]{-1105117575, -117190742, -749102689, -168875190}).intern(), V((byte) ((AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 28), TextUtils.indexOf((CharSequence) "", '0') + 23, "\u0001\u0002\u0002\u0003\u0002\u0004\u000b\u0003\u0090\u0090\t\u0007\u000f\t\u0002\u0000\u0001\u001c\u0000\b\u0005\u0000").intern(), th);
                return null;
            } finally {
                b0(inputStream);
                b0(bufferedReader);
            }
        }
    }

    public static String f0(int i5, String str) {
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
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ (-3927734697160398019L));
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

    public static HttpURLConnection g(String str) throws ProtocolException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(V((byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 106), Color.blue(0) + 4, "\u0016\u0017\u0015\u0011").intern());
        httpURLConnection.setRequestProperty(V((byte) (((Process.getThreadPriority(0) + 20) >> 6) + 18), 12 - TextUtils.getTrimmedLength(""), "\u0014\u0001\u0007\u000b\u0000\u000b\u000b\u0010\f\u001b\u001d\u0001").intern(), V((byte) (27 - TextUtils.indexOf((CharSequence) "", '0', 0)), 30 - ((byte) KeyEvent.getModifierMetaStateMask()), "\u001b\u001a\u001a\u001c\u000e\u001a\u001c\b\u000e\b\n\u0018\u001c\u0005\u0000\b!\u0000\u0013 \u0019\u0002\u0005\u0000\b\"\u0010\u0006#\u000fT").intern());
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        f14500j = (k + 33) % 128;
        return httpURLConnection;
    }

    public static long g0() {
        f14492b = (f14493c + 113) % 128;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        f14492b = (f14493c + 117) % 128;
        return timeInMillis;
    }

    public static View.OnTouchListener h0(View view) {
        try {
            Object objL = l(view);
            if (objL == null) {
                return null;
            }
            Class<?> cls = objL.getClass();
            synchronized (AbstractC1104pb.class) {
                try {
                    if (f14506q == null) {
                        f14506q = E(cls, W(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u009b\u009a\u0095\u0085\u0099\u0082\u0098\u008f").intern());
                    }
                } finally {
                }
            }
            return (View.OnTouchListener) f14506q.get(objL);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class i0() {
        f14514y = (f14515z + 27) % 128;
        Class clsA = AbstractC1168ub.a(f0(24113 - (KeyEvent.getMaxKeyCode() >> 16), "⭜畢霻㇜厖ﶡṿ렒\uda9b擨蚸❅䄐\ue32c\u0df1꾐졂樝됫훽炈酋㍿崷ￄᦚ뮦쑱昄胂⊭䲱\ued72༂꧋쯫ᖷ뙜큕爆鳺㺇彖索ᬓꗒ잜憣艩ⰿ从\ue88dઽꭕ\uf50a។뇤펳籂鸄").intern(), false);
        f14514y = (f14515z + 53) % 128;
        return clsA;
    }

    public static C1052lb j(String str) {
        HttpURLConnection httpURLConnectionK0;
        long jS;
        String strF;
        int responseCode;
        String responseMessage;
        int i5 = k + 117;
        f14500j = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                httpURLConnectionK0 = k0(str);
                jS = S();
                strF = f(httpURLConnectionK0);
                responseCode = httpURLConnectionK0.getResponseCode();
                responseMessage = httpURLConnectionK0.getResponseMessage();
                if (responseCode >= 25706) {
                    httpURLConnectionK0.disconnect();
                    k = (f14500j + 35) % 128;
                }
            } else {
                httpURLConnectionK0 = k0(str);
                jS = S();
                strF = f(httpURLConnectionK0);
                responseCode = httpURLConnectionK0.getResponseCode();
                responseMessage = httpURLConnectionK0.getResponseMessage();
                if (responseCode >= 400) {
                    httpURLConnectionK0.disconnect();
                    k = (f14500j + 35) % 128;
                }
            }
            return new C1052lb(S() - jS, strF, responseMessage, responseCode);
        } catch (Throwable th) {
            String strIntern = p(8 - Color.red(0), new int[]{-1105117575, -117190742, -749102689, -168875190}).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(V((byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 20), ((byte) KeyEvent.getModifierMetaStateMask()) + 28, "\u0001\u0002\u0002\u0003\u0002\u0004\u0005\u0000\u0007\b\t\u0007\u000f\t\u000b\u0003\t\u0004\u0002\u0000\u0006\u0011\u0000\u0005\u0007\u00104").intern());
            sb2.append(th.getLocalizedMessage());
            Ab.R(strIntern, sb2.toString(), th);
            return null;
        }
    }

    public static String j0(String str, String str2) {
        int i5 = f14512w + 75;
        f14513x = i5 % 128;
        return i5 % 2 == 0 ? str.substring(1, str.length() >> str2.length()) : str.substring(0, str.length() - str2.length());
    }

    public static HttpURLConnection k0(String str) throws ProtocolException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(p((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2, new int[]{1822607127, 1877283319}).intern());
        int i5 = f14500j + 27;
        k = i5 % 128;
        if (i5 % 2 != 0) {
            return httpURLConnection;
        }
        throw null;
    }

    public static Object l(View view) {
        try {
            synchronized (AbstractC1104pb.class) {
                try {
                    if (f14504o == null) {
                        f14504o = E(View.class, W(127 - TextUtils.getOffsetBefore("", 0), "\u0085\u0094\u0082\u008e\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u008f").intern());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return f14504o.get(view);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void l0(MediaPlayer mediaPlayer, P9 p92) throws IllegalAccessException, IllegalArgumentException {
        Field fieldE;
        MediaPlayer.OnPreparedListener onPreparedListener;
        int i5 = f14510u + 1;
        f14509t = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                fieldE = E(MediaPlayer.class, W(Color.red(1) * 86, "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u0083\u0089\u0084\u0081\u0090\u0089\u0084\u009f\u0082\u0098\u008f").intern());
                onPreparedListener = (MediaPlayer.OnPreparedListener) fieldE.get(mediaPlayer);
                if (onPreparedListener instanceof Q9) {
                    return;
                }
            } else {
                fieldE = E(MediaPlayer.class, W(127 - Color.red(0), "\u0084\u0089\u0082\u0089\u0092\u009d\u0086\u009c\u0083\u0089\u0084\u0081\u0090\u0089\u0084\u009f\u0082\u0098\u008f").intern());
                onPreparedListener = (MediaPlayer.OnPreparedListener) fieldE.get(mediaPlayer);
                if (onPreparedListener instanceof Q9) {
                    return;
                }
            }
            Q9 q92 = new Q9(onPreparedListener);
            q92.f13636b = p92;
            fieldE.set(mediaPlayer, q92);
            f14509t = (f14510u + 85) % 128;
        } catch (Exception e7) {
            Ab.a0(A((byte) (KeyEvent.normalizeMetaState(0) + 93), 12 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\n\u0002\n\u000b\u0006\u0011\u0007\u000f\u0000\u000e\u0011\u0002").intern(), A((byte) (86 - (ViewConfiguration.getLongPressTimeout() >> 16)), 38 - TextUtils.indexOf((CharSequence) "", '0'), "\u0004\u0007\u000b\u0006\u0010\u0016\u0010\u0000\u0016\u0010\u0005\u0019\f\b\r\u0007\u0016\u0005\u0019\u0007\u0006\u000f\t\u0018\u0007\u0004\u0018\u000b\u0007\u0004\b\u001b\u0011\u0000\u0003\u0002\u0005\u0002È").intern(), e7, false);
        }
    }

    public static String o(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (f14484D) {
            try {
                char[] cArrZ = z(3161781294382484749L, charArray, i5);
                f14483C = 4;
                while (true) {
                    int i10 = f14483C;
                    if (i10 < cArrZ.length) {
                        cArrZ[i10] = (char) ((cArrZ[i10] ^ cArrZ[i10 % 4]) ^ ((i10 - 4) * 3161781294382484749L));
                        f14483C = i10 + 1;
                    } else {
                        str2 = new String(cArrZ, 4, cArrZ.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static boolean o0(String str) {
        f14512w = (f14513x + 11) % 128;
        if (!TextUtils.isEmpty(str)) {
            return str.matches(Y("\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000", new int[]{9, 14, Sdk.SDKError.Reason.STORE_REGION_CODE_ERROR_VALUE, 0}, false).intern());
        }
        f14513x = (f14512w + 49) % 128;
        return false;
    }

    public static String p(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f14498h.clone();
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

    public static byte[] p0(HttpURLConnection httpURLConnection, JSONObject jSONObject) throws Throwable {
        byte[] bytes;
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        int i5 = k + 71;
        f14500j = i5 % 128;
        if (i5 % 2 != 0) {
            String strD = D(jSONObject);
            bytes = strD.getBytes(V((byte) ((ViewConfiguration.getScrollDefaultDelay() >>> 95) * 63), (ViewConfiguration.getKeyRepeatTimeout() << 93) + 3, "\u000f\u0010\u0011\f\u00ad").intern());
            if (!e0(strD)) {
                return bytes;
            }
        } else {
            String strD2 = D(jSONObject);
            bytes = strD2.getBytes(V((byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 117), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5, "\u000f\u0010\u0011\f\u00ad").intern());
            if (!e0(strD2)) {
                return bytes;
            }
        }
        httpURLConnection.setRequestProperty(V((byte) (Color.red(0) + 78), View.MeasureSpec.getMode(0) + 16, "\u0014\u0001\u0007\u000b\u0000\u000b\u000b\u0010\u0006\f\u001a\b\b\t\u0007\n").intern(), p(4 - Gravity.getAbsoluteGravity(0, 0), new int[]{-327433133, 1069826920}).intern());
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e7) {
            e = e7;
        }
        try {
            gZIPOutputStream.write(bytes);
            gZIPOutputStream.flush();
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i10 = f14500j;
            int i11 = i10 + 3;
            k = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 74 / 0;
            }
            k = (i10 + 55) % 128;
            return byteArray;
        } catch (Exception e10) {
            e = e10;
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream2 = gZIPOutputStream;
            if (gZIPOutputStream2 != null) {
                try {
                    gZIPOutputStream2.close();
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    public static String q(String str, String str2, boolean z2) {
        int i5 = f14512w + 103;
        f14513x = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (z2) {
            if (!TextUtils.isEmpty(str2)) {
                f14512w = (f14513x + 87) % 128;
                if (!str2.startsWith(Y(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{23, 1, 0, 1}, false).intern())) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Y("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{24, 8, 0, 0}, true).intern());
                    sb2.append(str2);
                    str2 = sb2.toString();
                    f14513x = (f14512w + 125) % 128;
                }
                if (!str2.endsWith(Y(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{32, 1, 0, 0}, true).intern())) {
                    StringBuilder sbJ = N0.a.j(str2);
                    sbJ.append(Y("\u0001\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{33, 7, 168, 0}, false).intern());
                    str2 = sbJ.toString();
                }
            }
            int i10 = f14513x + 35;
            f14512w = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 72 / 0;
            }
        }
        ArrayList arrayListF = F(str, str2, true);
        if (arrayListF.size() > 0) {
            return (String) arrayListF.get(0);
        }
        f14512w = (f14513x + 121) % 128;
        return null;
    }

    public static void t(View view, R9 r92) {
        f14509t = (f14510u + 117) % 128;
        View.OnClickListener onClickListenerD = d(view);
        if (onClickListenerD instanceof S9) {
            return;
        }
        S9 s92 = new S9(onClickListenerD);
        s92.f13686b = r92;
        view.setOnClickListener(s92);
        f14509t = (f14510u + 49) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r0
  0x0021: PHI (r0v4 android.view.View$OnTouchListener) = (r0v3 android.view.View$OnTouchListener), (r0v5 android.view.View$OnTouchListener) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void u(android.view.View r3, Va.X9 r4) {
        /*
            int r0 = Va.AbstractC1104pb.f14509t
            int r0 = r0 + 3
            int r1 = r0 % 128
            Va.AbstractC1104pb.f14510u = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L19
            android.view.View$OnTouchListener r0 = h0(r3)
            boolean r1 = r0 instanceof Va.Y9
            r2 = 80
            int r2 = r2 / 0
            if (r1 != 0) goto L2b
            goto L21
        L19:
            android.view.View$OnTouchListener r0 = h0(r3)
            boolean r1 = r0 instanceof Va.Y9
            if (r1 != 0) goto L2b
        L21:
            Va.Y9 r1 = new Va.Y9
            r1.<init>(r0)
            r1.f13881b = r4
            r3.setOnTouchListener(r1)
        L2b:
            int r3 = Va.AbstractC1104pb.f14510u
            int r3 = r3 + 25
            int r4 = r3 % 128
            Va.AbstractC1104pb.f14509t = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L38
            return
        L38:
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.AbstractC1104pb.u(android.view.View, Va.X9):void");
    }

    public static void y(byte[] bArr, int i5, int i10, byte[] bArr2, int i11, byte[] bArr3) {
        int i12;
        int i13;
        if (i10 > 0) {
            int i14 = f14497g + 33;
            f14496f = i14 % 128;
            i12 = i14 % 2 != 0 ? (bArr[i5] / 53) >>> 63 : (bArr[i5] << 24) >>> 8;
        } else {
            i12 = 0;
        }
        int i15 = i12 | (i10 > 1 ? (bArr[i5 + 1] << 24) >>> 16 : 0);
        if (i10 > 2) {
            int i16 = f14496f + 53;
            f14497g = i16 % 128;
            i13 = i16 % 2 == 0 ? (bArr[i5 - 3] << 68) * 63 : (bArr[i5 + 2] << 24) >>> 24;
        } else {
            i13 = 0;
        }
        int i17 = i13 | i15;
        if (i10 == 1) {
            bArr2[i11] = bArr3[i17 >>> 18];
            bArr2[i11 + 1] = bArr3[(i17 >>> 12) & 63];
            bArr2[i11 + 2] = 61;
            bArr2[i11 + 3] = 61;
            f14497g = (f14496f + 99) % 128;
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            bArr2[i11] = bArr3[i17 >>> 18];
            bArr2[i11 + 1] = bArr3[(i17 >>> 12) & 63];
            bArr2[i11 + 2] = bArr3[(i17 >>> 6) & 63];
            bArr2[i11 + 3] = bArr3[i17 & 63];
            return;
        }
        bArr2[i11] = bArr3[i17 >>> 18];
        bArr2[i11 + 1] = bArr3[(i17 >>> 12) & 63];
        bArr2[i11 + 2] = bArr3[(i17 >>> 6) & 63];
        bArr2[i11 + 3] = 61;
        int i18 = f14497g + 125;
        f14496f = i18 % 128;
        if (i18 % 2 != 0) {
            int i19 = 88 / 0;
        }
    }

    public static char[] z(long j8, char[] cArr, int i5) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i10 = 0;
        int i11 = 4;
        for (int i12 = 0; i12 < cArr.length; i12++) {
            if ((((j8 >>> i12) & 1) != i5 || i10 >= 4) && i11 < length) {
                cArr2[i11] = cArr[i12];
                i11++;
            } else {
                cArr2[i10] = cArr[i12];
                i10++;
            }
        }
        return cArr2;
    }

    @Override // Va.Lb
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public abstract void w(JSONObject jSONObject, WebView webView, Vb vb2, View view);

    @Override // Va.Lb
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public abstract void v(JSONObject jSONObject, WebView webView, View view);

    @Override // Va.Lb
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public abstract void s(JSONObject jSONObject, WebView webView, InterfaceC0950e0 interfaceC0950e0, View view);

    @Override // Va.Lb
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public abstract void r(JSONObject jSONObject, WebView webView, View view);

    @Override // Va.Lb
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public abstract void k(JSONObject jSONObject, WebView webView, View view);

    @Override // Va.Lb
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public abstract void n(JSONObject jSONObject, WebView webView, InterfaceC0950e0 interfaceC0950e0, View view);

    @Override // Va.Lb
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public abstract void m(JSONObject jSONObject, WebView webView, View view);

    @Override // Va.Lb
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public abstract void h(JSONObject jSONObject, WebView webView, View view);
}
