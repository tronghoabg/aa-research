package Va;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

/* renamed from: Va.sa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1141sa {

    /* renamed from: U, reason: collision with root package name */
    public static final String f14600U;

    /* renamed from: V, reason: collision with root package name */
    public static final String f14601V;

    /* renamed from: W, reason: collision with root package name */
    public static final String f14602W;

    /* renamed from: X, reason: collision with root package name */
    public static final String f14603X;

    /* renamed from: Y, reason: collision with root package name */
    public static final String f14604Y;

    /* renamed from: Z, reason: collision with root package name */
    public static final String f14605Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final String f14607a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final String f14609b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final List f14611c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final char[] f14613d0 = {'7', 'n', 'l', 'n', 'j', 'i', 'l', 'f', 'l', 'q', 'k', '3', 'm', 'q', 'k', '*', 'f', 't', 'j', 'c', 'b', 'u', 239, 236, 214, 216, 228, '6', 'q', 'v', 'r', 'r', 's', '9', 'i', 'X', 'Y', 'c', 'm', 'u', 'p', 'g', 143, 293, 300, 291, 285, 287, 290, 129, 266, 268, 265, 263, 262, 150, 299, 297, 297, 301, 300, 297, 279, 281, 284, '0', 'b', 'm', 'o', 'n', 'R', 169, 172, 168, 169, 162, 165, 177, 'T', 176, 186, 170, 168, 180, 180, 'R', 161, 161, 165, 158, 152, 161, 'N', 158, 163, 167, 161, 'C', 132, 132, 136, '7', 'o', 's', '|', 'z', 'a', 191, 196, 202, '8', 'q', 'k', 'm', 'u', 'k', 'c', 'f', '`', 188, 202, 227, 218, 208, 227, 236, 228, 220, '1', 'k', '[', 'Z', 'k', 'c', 'j', 'l', 'd', 'V', 'D', 's', 231, 239, 246, 236, 237, 230, 230, 238, 213, 199, 'w', 238, 244, 250, 249, 251, 237, 237, 245, 220, 206, '2', 'd', 'o', 't', 'p', 's', 's', 'l', 'T', '\\', 'k', 'R', 'D', '$', 'D', 'R', 'k', 'c', 'Z', 'k', 'm', 'd', '[', 'c', 'j', 'j', 'l', '2', 'f', 'o', 'e', 'd', 'k', 'd', 'g', 'f', 'h', 136, 261, 259, '2', 'i', '^', '^', 'q', 'c', '\\', 'i', 'i', 'T', ']', 'm', 'i', 'q', '4', 'w', 143, 143, 140, 142, 137, 139, '6', 'k', 'f', 'k', '2', 'd', 'l', 'q', 'm', 'g', 'a', 'a', 'b'};

    /* renamed from: a, reason: collision with root package name */
    public static final String f14606a = a("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{0, 11, 0, 0}, true).intern();

    /* renamed from: b, reason: collision with root package name */
    public static final String f14608b = a("\u0001\u0001\u0000\u0001", new int[]{11, 4, 0, 0}, true).intern();

    /* renamed from: c, reason: collision with root package name */
    public static final String f14610c = b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 19788), "鈋ϣ䰀配", "代ᕀꀇ쫾", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1).intern();

    /* renamed from: d, reason: collision with root package name */
    public static final String f14612d = a("\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{15, 6, 0, 4}, false).intern();

    /* renamed from: e, reason: collision with root package name */
    public static final String f14614e = a("\u0000\u0001\u0000\u0001\u0000\u0001", new int[]{21, 6, Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE, 0}, true).intern();

    /* renamed from: f, reason: collision with root package name */
    public static final String f14615f = b((char) ((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 41096), "苿굶裺\ue7a0", "좋\uf44a", ExpandableListView.getPackedPositionChild(0) + 1).intern();

    /* renamed from: g, reason: collision with root package name */
    public static final String f14616g = a("\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{27, 6, 0, 1}, false).intern();

    /* renamed from: h, reason: collision with root package name */
    public static final String f14617h = b((char) TextUtils.indexOf("", ""), "︫缣挸瀕", "䜅㿻刐\udd6aᰫ匞\uf245\ufbcb", TextUtils.indexOf("", "", 0, 0)).intern();

    /* renamed from: i, reason: collision with root package name */
    public static final String f14618i = a("\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000", new int[]{33, 9, 0, 6}, true).intern();

    /* renamed from: j, reason: collision with root package name */
    public static final String f14619j = a("\u0000\u0000\u0000\u0000\u0000\u0000\u0000", new int[]{42, 7, 185, 6}, false).intern();
    public static final String k = a("\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{49, 6, 158, 5}, false).intern();

    /* renamed from: l, reason: collision with root package name */
    public static final String f14620l = a("\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001", new int[]{55, 10, 187, 5}, false).intern();

    /* renamed from: m, reason: collision with root package name */
    public static final String f14621m = b((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10522), "莊ࣸᫍ㈩", "\ue0e2䁸묁\ue379郒", View.combineMeasuredStates(0, 0) - 855050109).intern();

    /* renamed from: n, reason: collision with root package name */
    public static final String f14622n = b((char) (5020 - KeyEvent.keyCodeFromString("")), "ಪ笹鲩眓", "\u2d7d調妶氋柶", (-1451542260) - Color.alpha(0)).intern();

    /* renamed from: o, reason: collision with root package name */
    public static final String f14623o = a("\u0001\u0001\u0000\u0001\u0000", new int[]{65, 5, 0, 0}, false).intern();

    /* renamed from: p, reason: collision with root package name */
    public static final String f14624p = b((char) (ViewConfiguration.getEdgeSlop() >> 16), "钡獪餪헙", "〻ӂ넍栉䠑\u2005䮨", (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 712206996).intern();

    /* renamed from: q, reason: collision with root package name */
    public static final String f14625q = b((char) TextUtils.getOffsetAfter("", 0), "ፋ\ud907ਜ਼兒", "\ud994곴鑡죂뎏ﻏᕛ潢", View.MeasureSpec.makeMeasureSpec(0, 0)).intern();

    /* renamed from: r, reason: collision with root package name */
    public static final String f14626r = a("\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new int[]{70, 8, 66, 0}, false).intern();

    /* renamed from: s, reason: collision with root package name */
    public static final String f14627s = b((char) (63894 - (ViewConfiguration.getFadingEdgeLength() >> 16)), "랱蔀隢狹", "縌鲩\u1bf6ᝠ⽒\uf16a", Color.blue(0)).intern();

    /* renamed from: t, reason: collision with root package name */
    public static final String f14628t = b((char) Drawable.resolveOpacity(0, 0), "껄沬踂叞", "ﳌ㯵ﲾ褡컡哓䁉", (ViewConfiguration.getFadingEdgeLength() >> 16) + 40676526).intern();

    /* renamed from: u, reason: collision with root package name */
    public static final String f14629u = b((char) (ExpandableListView.getPackedPositionGroup(0) + 870), "縌剷曚ᤃ", "ꊄ蜃䘼ლ쪔⤐", ViewConfiguration.getMinimumFlingVelocity() >> 16).intern();

    /* renamed from: v, reason: collision with root package name */
    public static final String f14630v = a("\u0000\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{78, 7, 69, 0}, false).intern();

    /* renamed from: w, reason: collision with root package name */
    public static final String f14631w = b((char) ExpandableListView.getPackedPositionType(0), "樷븸ပ짗", "㏉膰薞쨍⯓饡㚎", 364787818 - (ViewConfiguration.getEdgeSlop() >> 16)).intern();

    /* renamed from: x, reason: collision with root package name */
    public static final String f14632x = a("\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{85, 7, 50, 0}, true).intern();

    /* renamed from: y, reason: collision with root package name */
    public static final String f14633y = b((char) View.getDefaultSize(0, 0), "洘☌ু琮", "\ue953쏌컅䞎\ueae2ი쐱", (-1054471058) - (SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1))).intern();

    /* renamed from: z, reason: collision with root package name */
    public static final String f14634z = b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), "－\u0aba겻ꀫ", "\uf4aa↚葥췢陨䆟\udac7", (-1156924673) - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern();

    /* renamed from: A, reason: collision with root package name */
    public static final String f14581A = b((char) (4443 - ExpandableListView.getPackedPositionChild(0)), "핻߱岤眑", "輣⼼教⓯濰邶", 1 - (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1))).intern();

    /* renamed from: B, reason: collision with root package name */
    public static final String f14582B = b((char) (8019 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1))), "▘抷刱紟", "䑫땯ꖥ擫뇻", 828552997 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern();

    /* renamed from: C, reason: collision with root package name */
    public static final String f14583C = a("\u0000\u0001\u0001\u0000\u0001", new int[]{92, 5, 56, 2}, true).intern();

    /* renamed from: D, reason: collision with root package name */
    public static final String f14584D = b((char) (TextUtils.indexOf("", "") + 16640), "셔ӓ$╁", "ḋ뺡⑵쑍了", 604296129 - (Process.myTid() >> 22)).intern();

    /* renamed from: E, reason: collision with root package name */
    public static final String f14585E = b((char) (21314 - (ViewConfiguration.getScrollBarSize() >> 8)), "현堔䋵\udb53", "勓磽쵧御捹", (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 178776874).intern();

    /* renamed from: F, reason: collision with root package name */
    public static final String f14586F = a("\u0000\u0001\u0001\u0001", new int[]{97, 4, 34, 0}, true).intern();

    /* renamed from: G, reason: collision with root package name */
    public static final String f14587G = a("\u0000\u0001\u0001\u0001\u0000", new int[]{101, 5, 13, 3}, true).intern();

    /* renamed from: H, reason: collision with root package name */
    public static final String f14588H = a("\u0000\u0001\u0001\u0001", new int[]{106, 4, 89, 0}, false).intern();

    /* renamed from: I, reason: collision with root package name */
    public static final String f14589I = a("\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{110, 8, 0, 0}, true).intern();

    /* renamed from: J, reason: collision with root package name */
    public static final String f14590J = b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), "ﳟ\uecd0뿄\uf39b", "蟐뉕瓞遭挠솺ൻ咋", (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1).intern();

    /* renamed from: K, reason: collision with root package name */
    public static final String f14591K = b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), "䈈滖プに", "\u0cce듕㈷톺\udaac緵꺽\ueac1⤒", (-680602047) - Process.getGidForName("")).intern();
    public static final String L = b((char) ((AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 7140), "檟䭖\ue4cfଛ", "\uf847椤朘䚨濱\ud988\ue412ஐ莎\ue642\ued98\uded1慘", (Process.myPid() >> 22) - 817146262).intern();

    /* renamed from: M, reason: collision with root package name */
    public static final String f14592M = a("\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001", new int[]{118, 10, 120, 10}, false).intern();

    /* renamed from: N, reason: collision with root package name */
    public static final String f14593N = b((char) Color.green(0), "溿䖲ྙ綯", "픫\ud98e깛罘\ue602\u209e\uf578⋬⯌부짥", View.MeasureSpec.makeMeasureSpec(0, 0) - 1723485586).intern();

    /* renamed from: O, reason: collision with root package name */
    public static final String f14594O = a("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{128, 11, 0, 9}, false).intern();

    /* renamed from: P, reason: collision with root package name */
    public static final String f14595P = a("\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{139, 11, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 0}, true).intern();

    /* renamed from: Q, reason: collision with root package name */
    public static final String f14596Q = a("\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{150, 11, Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE, 0}, true).intern();

    /* renamed from: R, reason: collision with root package name */
    public static final String f14597R = a("\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001", new int[]{161, 13, 0, 0}, true).intern();

    /* renamed from: S, reason: collision with root package name */
    public static final String f14598S = a("\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{174, 14, 0, 0}, false).intern();

    /* renamed from: T, reason: collision with root package name */
    public static final String f14599T = b((char) ExpandableListView.getPackedPositionType(0), "\udc70Ά嶷Ď", "絑䂭퉴\uea6b铤㧟瑾흵", ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern();

    static {
        a("\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{188, 10, 0, 0}, true).intern();
        f14600U = b((char) (Color.rgb(0, 0, 0) + 16792652), "玓윺䳺︼", "ጩ\ue471", (-1) - MotionEvent.axisFromString("")).intern();
        f14601V = b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24621), "ڌﶮⶖ덠", "䢫兗翌", Process.getGidForName("") - 1761759737).intern();
        f14602W = a("\u0000\u0000\u0001", new int[]{198, 3, 153, 1}, false).intern();
        f14603X = a("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", new int[]{201, 14, 0, 0}, false).intern();
        f14604Y = a("\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001", new int[]{Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 8, 37, 4}, false).intern();
        f14605Z = b((char) (View.getDefaultSize(0, 0) + 44597), "쌎\udbc3㖩鶮", "㦽䴶䬯", (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1445215294).intern();
        f14607a0 = b((char) (Color.red(0) + 16279), "软潄靬\uee3f", "ᄀ\uee50න", 1819231374 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern();
        f14609b0 = a("\u0001\u0000\u0000\u0001", new int[]{Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 4, 0, 1}, false).intern();
        f14611c0 = Arrays.asList(a("\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001", new int[]{Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 9, 0, 0}, true).intern());
    }

    public static String a(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f14613d0, i5, cArr, 0, i10);
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
                        cArr3[i10] = (char) (((charArray[i10] ^ c12) ^ 0) ^ 7433);
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
}
