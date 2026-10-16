package Va;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: Va.fa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0973fa {

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f14168f = {'%', 17, '.', '-', 'm', 30, '/', '\"', '0', 'W', 'r', 'l', 17, '<', 'x', '.', '?', 197, 215, 'Q', 173, 17, 'J', 's', 'j', 'f', 'g', 'a', '@', 'N', 'Z', '.', 'A', 'j', 'j', 'b', 'a', '@', '\'', '\'', 'C', 'h', 'h', 'i', 'q', '[', '2', '.', 136, 135, 148, 'r', 134, 135, 148, 131, 138, 'u', 'D', '\\', 'D', 149, 149, 131, 142, 133, 129, 'D', 157, '\\', 'D', 131, 150, 131, 134, 129, 'D', 'N', 'D', 149, 135, 133, 144, 135, 148, 135};

    /* renamed from: g, reason: collision with root package name */
    public static int f14169g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f14170h = 1;

    /* renamed from: a, reason: collision with root package name */
    public final List f14171a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14172b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f14173c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f14174d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public int f14175e = 0;

    public C0973fa(int i5, List list) {
        this.f14171a = list;
        this.f14172b = i5;
    }

    public static ArrayList a(Object obj) {
        ArrayList arrayList = new ArrayList();
        f14169g = (f14170h + 29) % 128;
        int i5 = 0;
        while (i5 < Array.getLength(obj)) {
            arrayList.add(Array.get(obj, i5));
            i5++;
            f14170h = (f14169g + 117) % 128;
        }
        return arrayList;
    }

    public static String b(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{12, 1, 0, 1}, false).intern());
        sb2.append(str.replace(c(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - TextUtils.getOffsetBefore("", 0), Color.rgb(0, 0, 0) + 16777313, TextUtils.indexOf("", "") + 1, false).intern(), h("\u0000\u0000", new int[]{13, 2, 28, 0}, false).intern()).replace(h(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{12, 1, 0, 1}, false).intern(), h("\u0000\u0000", new int[]{15, 2, 0, 0}, false).intern()).replace(c(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, -Process.getGidForName(""), (Process.myPid() >> 22) + 15, -((byte) KeyEvent.getModifierMetaStateMask()), true).intern(), h(null, new int[]{17, 2, 105, 1}, true).intern()).replace(c(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 18 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), true).intern(), h("\u0000\u0000", new int[]{19, 2, 70, 0}, false).intern()).replace(c(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, Color.alpha(0) + 1, 13 - ExpandableListView.getPackedPositionChild(0L), 1 - (ViewConfiguration.getLongPressTimeout() >> 16), false).intern(), c("\f\ufff4", 2 - (ViewConfiguration.getFadingEdgeLength() >> 16), 110 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 2 - View.MeasureSpec.getMode(0), true).intern()));
        sb2.append(h(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{12, 1, 0, 1}, false).intern());
        String string = sb2.toString();
        f14169g = (f14170h + 69) % 128;
        return string;
    }

    public static String c(String str, int i5, int i10, int i11, boolean z2) {
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
                    cArr[i12] = (char) (c10 - 5);
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

    public static Object g(Object obj) {
        int i5 = f14169g;
        f14170h = (i5 + 43) % 128;
        if (obj instanceof WeakReference) {
            return ((WeakReference) obj).get();
        }
        if (!(obj instanceof AtomicReference)) {
            f14170h = (i5 + 17) % 128;
            return obj;
        }
        Object obj2 = ((AtomicReference) obj).get();
        f14170h = (f14169g + 1) % 128;
        return obj2;
    }

    public static String h(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
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
                System.arraycopy(f14168f, i5, cArr, 0, i10);
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

    public static boolean k(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof String) {
            return ((String) obj).isEmpty();
        }
        if (obj instanceof Number) {
            f14170h = (f14169g + 43) % 128;
            return ((Number) obj).doubleValue() == 0.0d;
        }
        if (obj instanceof Boolean) {
            f14169g = (f14170h + 95) % 128;
            if (((Boolean) obj).booleanValue()) {
                return false;
            }
            f14169g = (f14170h + 89) % 128;
            return true;
        }
        if (obj instanceof Collection) {
            boolean zIsEmpty = ((Collection) obj).isEmpty();
            int i5 = f14169g + 125;
            f14170h = i5 % 128;
            if (i5 % 2 == 0) {
                int i10 = 30 / 0;
            }
            return zIsEmpty;
        }
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        if (obj.getClass().isArray()) {
            if (Array.getLength(obj) == 0) {
                int i11 = f14169g + 111;
                f14170h = i11 % 128;
                return i11 % 2 != 0;
            }
            f14170h = (f14169g + 7) % 128;
        }
        return false;
    }

    public final Field[] d(Class cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            f14169g = (f14170h + 113) % 128;
            if (!AbstractC1168ub.g(cls, this.f14171a)) {
                break;
            }
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            cls = cls.getSuperclass();
        }
        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
        f14169g = (f14170h + 103) % 128;
        return fieldArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0183, code lost:
    
        if (r14.contains(r1) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018b, code lost:
    
        if (r14.contains(r1) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018f, code lost:
    
        r14.add(r1);
        r22.f14175e++;
        r5 = new java.lang.StringBuilder(c("ￋ\u001c\u001c\n\u0015\f\bￋ$￣", android.graphics.Color.green(0) + 10, 92 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 9 - android.text.TextUtils.indexOf("", ""), true).intern());
        r5.append(b(r1.getClass().getSimpleName()));
        Va.C0973fa.f14170h = (Va.C0973fa.f14169g + 59) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01d2, code lost:
    
        r6 = r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01da, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01dc, code lost:
    
        r6 = Va.C0973fa.f14170h + 115;
        Va.C0973fa.f14169g = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e5, code lost:
    
        if ((r6 % 2) != 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ea, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01eb, code lost:
    
        r9 = java.lang.Integer.toHexString(r1.hashCode());
        r14 = new java.lang.StringBuilder();
        r14.append(r1.getClass().getName());
        r14.append(h(org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{0, 1, 10, 1}, false).intern());
        r14.append(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x021d, code lost:
    
        if (r6.equals(r14.toString()) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x021f, code lost:
    
        r14 = new java.lang.StringBuilder();
        r14.append(r1.getClass().getSimpleName());
        r14.append(h(org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{0, 1, 10, 1}, false).intern());
        r14.append(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0249, code lost:
    
        if (r6.equals(r14.toString()) == true) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 1167
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0973fa.e(java.lang.Object):java.lang.String");
    }

    public final String f(Map map) {
        StringBuilder sb2 = new StringBuilder(c(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - TextUtils.getTrimmedLength(""), 128 - View.MeasureSpec.getMode(0), KeyEvent.keyCodeFromString("") + 1, false).intern());
        boolean z2 = true;
        for (Map.Entry entry : map.entrySet()) {
            f14169g = (f14170h + 59) % 128;
            if (!k(entry.getValue())) {
                f14169g = (f14170h + 71) % 128;
                if (!z2) {
                    sb2.append(c(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - Gravity.getAbsoluteGravity(0, 0), 48 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), View.resolveSize(0, 0) + 1, true).intern());
                }
                sb2.append(b(String.valueOf(entry.getKey())));
                sb2.append(c(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 62, 1 - TextUtils.getTrimmedLength(""), false).intern());
                sb2.append(e(entry.getValue()));
                f14169g = (f14170h + 95) % 128;
                z2 = false;
            }
        }
        sb2.append(c(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, TextUtils.indexOf("", "", 0, 0) + 1, View.MeasureSpec.getMode(0) + Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE, 1 - Color.green(0), true).intern());
        return sb2.toString();
    }

    public final String i(String str) {
        f14170h = (f14169g + 91) % 128;
        if (str.length() > 30) {
            f14170h = (f14169g + 39) % 128;
            HashSet hashSet = this.f14174d;
            if (hashSet.contains(str)) {
                f14169g = (f14170h + 65) % 128;
                return h("\u0000\u0000\u0000\u0000\u0000\u0001\u0001", new int[]{5, 7, 0, 2}, true).intern();
            }
            hashSet.add(str);
        }
        String strB = b(str);
        int i5 = f14169g + 107;
        f14170h = i5 % 128;
        if (i5 % 2 != 0) {
            return strB;
        }
        throw null;
    }

    public final String j(Collection collection) {
        StringBuilder sb2 = new StringBuilder(h("\u0001", new int[]{3, 1, 0, 1}, true).intern());
        f14169g = (f14170h + 77) % 128;
        boolean z2 = true;
        for (Object obj : collection) {
            f14169g = (f14170h + 45) % 128;
            if (!k(obj)) {
                if (!z2) {
                    sb2.append(c(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - (Process.myTid() >> 22), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 49, 1 - KeyEvent.keyCodeFromString(""), true).intern());
                }
                sb2.append(e(obj));
                z2 = false;
            }
        }
        sb2.append(h(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{4, 1, 125, 0}, false).intern());
        return sb2.toString();
    }
}
