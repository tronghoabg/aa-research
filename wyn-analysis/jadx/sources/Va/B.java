package Va;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import j$.util.DesugarCollections;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f13224a = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(b(13 - TextUtils.indexOf("", "", 0), TextUtils.lastIndexOf("", '0') + 299, 9 - (SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)), "\u0007\u0002\r\ufff8\ufffb\u0005\b\ufffb\ufffa�\n\ufff8\u0002").intern(), b((ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) + 17, ExpandableListView.getPackedPositionType(0) + Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE, KeyEvent.keyCodeFromString("") + 2, "\ufffa\u0003\n\ufff6\ufff9\b\ufff4\b\ufffa\b\b\ufffe\u0004\u0003\ufff4\t\u0004\u0000").intern())));

    /* renamed from: b, reason: collision with root package name */
    public static int f13225b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f13226c = (f13225b + 67) % 128;

    public static boolean a(String str) {
        int i5 = f13225b + 5;
        f13226c = i5 % 128;
        int i10 = i5 % 2;
        boolean zContains = f13224a.contains(str);
        if (i10 == 0) {
            int i11 = 34 / 0;
        }
        f13226c = (f13225b + 47) % 128;
        return zContains;
    }

    public static String b(int i5, int i10, int i11, String str) {
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
                    cArr[i12] = (char) (c10 - 195);
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
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static boolean c(String str, String str2) {
        int i5 = f13226c + 71;
        f13225b = i5 % 128;
        if (i5 % 2 == 0 ? AbstractC1104pb.N(64, str) : AbstractC1104pb.N(100, str)) {
            if (AbstractC1104pb.N(64, str2)) {
                int i10 = f13226c + 43;
                int i11 = i10 % 128;
                f13225b = i11;
                boolean z2 = i10 % 2 == 0;
                int i12 = i11 + 19;
                f13226c = i12 % 128;
                if (i12 % 2 != 0) {
                    return z2;
                }
                throw null;
            }
        }
        return false;
    }

    public static boolean d(AbstractMap abstractMap, String str) {
        f13225b = (f13226c + 105) % 128;
        if (abstractMap.containsKey(str)) {
            f13225b = (f13226c + 47) % 128;
            return false;
        }
        int size = abstractMap.size();
        Iterator it = f13224a.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            if (abstractMap.containsKey((String) it.next())) {
                f13226c = (f13225b + 23) % 128;
                i5++;
            }
        }
        f13226c = (f13225b + 35) % 128;
        return size >= i5 + 5;
    }
}
