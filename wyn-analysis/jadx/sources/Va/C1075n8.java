package Va;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* renamed from: Va.n8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1075n8 implements InterfaceC1101p8 {

    /* renamed from: c, reason: collision with root package name */
    public static int f14424c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f14425d = 1;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14426a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ C1114q8 f14427b;

    public /* synthetic */ C1075n8(int i5) {
        this.f14426a = i5;
    }

    @Override // Va.InterfaceC1101p8
    public final Object a(List list) {
        switch (this.f14426a) {
            case 0:
                C1114q8.f14533i = (C1114q8.f14532h + 75) % 128;
                C1114q8 c1114q8 = this.f14427b;
                int i5 = C1114q8.f14532h + 79;
                C1114q8.f14533i = i5 % 128;
                if (i5 % 2 == 0) {
                    c1114q8.b(list).g();
                    throw null;
                }
                C1178v8 c1178v8B = c1114q8.b(list);
                if (!c1178v8B.g()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C1114q8.p((ViewConfiguration.getEdgeSlop() >> 16) + 1031, (ViewConfiguration.getWindowTouchSlop() >> 8) + 24, (char) (44670 - TextUtils.getOffsetBefore("", 0))).intern());
                    sb2.append(c1178v8B);
                    c1114q8.r(sb2.toString(), null);
                    throw null;
                }
                String strF = c1178v8B.f();
                c1114q8.n(list, C1114q8.p(1055 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 1 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 43112)).intern(), strF, C1114q8.p((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1056, 48 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) Gravity.getAbsoluteGravity(0, 0)).intern());
                Pair pair = new Pair(strF, c1114q8.s(list));
                int i10 = C1114q8.f14532h + 123;
                int i11 = i10 % 128;
                C1114q8.f14533i = i11;
                if (i10 % 2 == 0) {
                    throw null;
                }
                int i12 = i11 + 67;
                C1114q8.f14532h = i12 % 128;
                if (i12 % 2 == 0) {
                    return pair;
                }
                throw null;
            default:
                int i13 = f14425d + 115;
                f14424c = i13 % 128;
                if (i13 % 2 == 0) {
                    return b(list);
                }
                b(list);
                throw null;
        }
    }

    public AbstractC1215y8 b(List list) {
        String str;
        AbstractC1215y8 abstractC1215y8S = this.f14427b.s(list);
        if ((abstractC1215y8S instanceof J8) || (abstractC1215y8S instanceof C8)) {
            int i5 = f14424c + 91;
            f14425d = i5 % 128;
            if (i5 % 2 == 0) {
                int i10 = 5 / 0;
            }
            return abstractC1215y8S;
        }
        C1114q8 c1114q8 = this.f14427b;
        StringBuilder sb2 = new StringBuilder();
        int fadingEdgeLength = 31 - (ViewConfiguration.getFadingEdgeLength() >> 16);
        int i11 = 102 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1));
        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 32;
        char[] charArray = "\uffc1\u0005\u0006\u0017\n\u0006\u0004\u0006\u0013\uffc1\u0015\u0016\u0003\uffc1\u0006\r\u0003\u0002\n\u0013\u0002\u0017\uffc1\u0005\u0006\u0015\u0004\u0006\u0011\u0019￦".toCharArray();
        synchronized (Ab.f13221x) {
            try {
                char[] cArr = new char[fadingEdgeLength];
                Ab.f13219v = 0;
                while (true) {
                    int i12 = Ab.f13219v;
                    if (i12 >= fadingEdgeLength) {
                        break;
                    }
                    char c10 = (char) (charArray[i12] + i11);
                    cArr[i12] = c10;
                    cArr[i12] = (char) (c10 - 7);
                    Ab.f13219v = i12 + 1;
                }
                if (iIndexOf > 0) {
                    Ab.f13220w = iIndexOf;
                    char[] cArr2 = new char[fadingEdgeLength];
                    System.arraycopy(cArr, 0, cArr2, 0, fadingEdgeLength);
                    int i13 = Ab.f13220w;
                    System.arraycopy(cArr2, 0, cArr, fadingEdgeLength - i13, i13);
                    int i14 = Ab.f13220w;
                    System.arraycopy(cArr2, i14, cArr, 0, fadingEdgeLength - i14);
                }
                char[] cArr3 = new char[fadingEdgeLength];
                Ab.f13219v = 0;
                while (true) {
                    int i15 = Ab.f13219v;
                    if (i15 < fadingEdgeLength) {
                        cArr3[i15] = cArr[(fadingEdgeLength - i15) - 1];
                        Ab.f13219v = i15 + 1;
                    } else {
                        str = new String(cArr3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        sb2.append(str.intern());
        sb2.append(abstractC1215y8S);
        String string = sb2.toString();
        C1114q8.f14533i = (C1114q8.f14532h + 25) % 128;
        c1114q8.q(string);
        throw null;
    }
}
