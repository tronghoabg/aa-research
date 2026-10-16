package Va;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: Va.g8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0984g8 {

    /* renamed from: h, reason: collision with root package name */
    public static final char[] f14187h = {'s', 26684, 53474, 14526, 41302, 'a', 26667, 53473, 14511, 41302, 2316, 29141, 55691, 'm', 26668, 53503, 14521, 41281, 2335, 29125, 29356, 6899, 41529, 19057, 54155, 19140, 8862, 39510, 29204, 60401, 17343, 'm', 26668, 53478, 14515, 41291, 2313, 29125, '\n', 26691};

    /* renamed from: i, reason: collision with root package name */
    public static int f14188i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static int f14189j = 1;

    /* renamed from: a, reason: collision with root package name */
    public String f14190a;

    /* renamed from: b, reason: collision with root package name */
    public String f14191b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14192c;

    /* renamed from: d, reason: collision with root package name */
    public List f14193d;

    /* renamed from: e, reason: collision with root package name */
    public List f14194e;

    /* renamed from: f, reason: collision with root package name */
    public Map f14195f;

    /* renamed from: g, reason: collision with root package name */
    public Map f14196g;

    public static Map a(HashMap map) {
        if (map != null) {
            f14189j = (f14188i + 17) % 128;
            return map;
        }
        HashMap map2 = new HashMap();
        int i5 = f14189j + 15;
        f14188i = i5 % 128;
        if (i5 % 2 == 0) {
            return map2;
        }
        throw null;
    }

    public static List b(ArrayList arrayList) {
        int i5 = (f14188i + 89) % 128;
        f14189j = i5;
        if (arrayList == null) {
            return new ArrayList();
        }
        int i10 = i5 + 33;
        f14188i = i10 % 128;
        if (i10 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    public static String c(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f14187h[i5 + i11] ^ (i11 * (-5139470497520129975L))) ^ c10);
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

    public final String toString() {
        ArrayList arrayList = new ArrayList(this.f14196g.values());
        Collections.sort(arrayList, new A7.R0(7));
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f14188i = (f14189j + 69) % 128;
            sb2.append(((C1126r8) it.next()).toString());
            sb2.append(c(TextUtils.indexOf((CharSequence) "", '0') + 39, 2 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) (ViewConfiguration.getTouchSlop() >> 8)).intern());
            f14188i = (f14189j + 61) % 128;
        }
        return sb2.toString();
    }
}
