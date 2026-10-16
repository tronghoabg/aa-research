package Va;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.AppNode;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: Va.m7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1061m7 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final char[] f14383R = {' ', 'R', 'R', 'R', 'k', 'n', 'o', 'o', 'n', 'v', ' ', 'V', 'f', 'g', 'p', 'k', 'l', 'q', '[', 'V', '2', 'S', 'X', 'p', '_', '^', 'i', '\"', 'S', 'i', 'p', 'k', 'm', '[', 'T', 128, 271, 293, 300, 295, 297, 279, 272, 281, 284, 303, 301, 143, 292, 297, 264, 269, 304, 300, 293, 292, 291, 260, 258, 285, 294, 267, 243, 268, 290, 297, 292, 294, 287, 282, 290, 297, '9', 'j', 'Q', 'S', 'R', 'S', '2', 'i', 'W', 'R', 'U', ']', 'p', 'l', 'o', 'k', 'j', 'k', 128, 171, 160, 168, 179, 168, 179, 178, 177, 164, 179, 173, 136, 163, '$', 'E', 'I', 'O', '_', 'k', 'l', 'q', 'i', 'l', 'l', 'k', 'a', 'J', 'Z', 178, 170, 171, 171, 170, 167, 142, 143, 164, 165, 166, 173, 161, ':', 'q', 'i', 'g', 'j', 'W', 'R', 'c', '^', '^', 'h', 'i', 'j', 'q', 'e', 't', 232, 238, 220, 212, 222, 227, 237, 240, '8', '\\', 'V', 'e', 'f', 'l', 'Z', 'X', '6', 'l', 'r', 'a', 'X', 'h', 'k', 'l', 'i', 'g', 'm', 'n', 'a', 'a', 'p', 't', 'l', 'h', 'j', 'o', 'o', 'o', 'w', 'j', 'i', 'u', '\\', 184, 190, 182, 174, 187, 192, 192, 184, 188, 190, 174, 174, 190, 198, 192, 189, 188, 191};

    /* renamed from: S, reason: collision with root package name */
    public static int f14384S = 0;

    /* renamed from: T, reason: collision with root package name */
    public static int f14385T = 1;

    public static String C0(AppNode appNode) {
        f14384S = (f14385T + 27) % 128;
        String appId = appNode.getAppId();
        f14385T = (f14384S + 7) % 128;
        return appId;
    }

    public static String D0(AdPayload.AdUnit adUnit) {
        f14385T = (f14384S + 73) % 128;
        String campaign = adUnit.getCampaign();
        f14385T = (f14384S + 57) % 128;
        return campaign;
    }

    public static String E0(AdPayload.CacheableReplacement cacheableReplacement) {
        int i5 = f14385T + 3;
        f14384S = i5 % 128;
        int i10 = i5 % 2;
        String url = cacheableReplacement.getUrl();
        if (i10 != 0) {
            int i11 = 61 / 0;
        }
        f14384S = (f14385T + 11) % 128;
        return url;
    }

    public static String F0(Placement placement) {
        int i5 = f14384S + 97;
        f14385T = i5 % 128;
        if (i5 % 2 != 0) {
            return placement.getReferenceId();
        }
        placement.getReferenceId();
        throw null;
    }

    public static String G0(String str, int i5, int i10, int i11, boolean z2) {
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
                    cArr[i12] = (char) (c10 - ']');
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

    public static boolean H0(Placement placement) {
        f14384S = (f14385T + 113) % 128;
        boolean zIsRewardedVideo = placement.isRewardedVideo();
        int i5 = f14385T + 69;
        f14384S = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 14 / 0;
        }
        return zIsRewardedVideo;
    }

    public static AdPayload.AdUnit I0(AdPayload adPayload) {
        f14385T = (f14384S + 99) % 128;
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        f14385T = (f14384S + 1) % 128;
        return adUnit;
    }

    public static AdPayload.TemplateSettings J0(AdPayload.AdUnit adUnit) {
        int i5 = f14385T + 79;
        f14384S = i5 % 128;
        if (i5 % 2 != 0) {
            adUnit.getTemplateSettings();
            throw null;
        }
        AdPayload.TemplateSettings templateSettings = adUnit.getTemplateSettings();
        f14385T = (f14384S + 89) % 128;
        return templateSettings;
    }

    public static String Y(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f14383R, i5, cArr, 0, i10);
                if (bArr != null) {
                    char[] cArr2 = new char[i10];
                    Ab.f13222y = 0;
                    char c10 = 0;
                    while (true) {
                        int i13 = Ab.f13222y;
                        if (i13 >= i10) {
                            break;
                        }
                        if (bArr[i13] == 1) {
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

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(Y("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{147, 9, Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE, 0}, false).intern(), new C0996h7());
        map.put(Y("\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{156, 8, 0, 3}, false).intern(), new C1022j7());
        map.put(Y("\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000", new int[]{164, 26, 6, 0}, false).intern(), new C1009i7());
        map.put(G0("\b\u000b￼\u0004\u0002\t\u0002\u0000\u000f\uffde￼", 11 - KeyEvent.keyCodeFromString(""), 193 - Process.getGidForName(""), 6 - (ViewConfiguration.getWindowTouchSlop() >> 8), false).intern(), new C1035k7());
        map.put(G0("￫\u0007￼\ufffe\u0000\b\u0000\t\u000f￤\uffff\u0002\u0000\u000f", (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 14, 194 - (Process.myTid() >> 22), 10 - ImageFormat.getBitsPerPixel(0), false).intern(), new C0983g7());
        map.put(Y("\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000", new int[]{190, 19, 82, 0}, false).intern(), new C1048l7());
        map.put(G0("\u0011\uffff￬\r\u0003\t\uffff\ufffe\u0003\ufff0\ufffe\uffff\ufffe\f\ufffb", 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 195 - (ViewConfiguration.getJumpTapTimeout() >> 16), 5 - Drawable.resolveOpacity(0, 0), true).intern(), new C0970f7());
        int i5 = f14385T + 101;
        f14384S = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 0 / 0;
        }
        return map;
    }

    @Override // Va.Z0
    public final String t0() {
        f14384S = (f14385T + 105) % 128;
        try {
            String str = u0().split(G0(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 138 - TextUtils.indexOf("", ""), (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), true).intern())[0];
            int i5 = f14384S + 41;
            f14385T = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // Va.Z0
    public final String u0() {
        f14385T = (f14384S + 119) % 128;
        try {
            C1051la c1051la = (C1051la) C0999ha.j().f14264b;
            String strIntern = G0("\u0010\u0012\uffd8\uffde￢\u0018\u0010\uffdf\u0011￢\u0018\u0010\u000f\u0018", 14 - TextUtils.getCapsMode("", 0, 0), Color.green(0) + 169, 2 - (ViewConfiguration.getPressedStateDuration() >> 16), true).intern();
            c1051la.getClass();
            String strN = C1051la.n(BuildConfig.class, strIntern);
            f14385T = (f14384S + 79) % 128;
            return strN;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0421  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1061m7.w0(java.lang.String):java.lang.Class");
    }
}
