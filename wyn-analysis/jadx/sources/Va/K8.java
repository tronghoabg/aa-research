package Va;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.List;
import java.util.Map;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class K8 extends I8 {

    /* renamed from: j, reason: collision with root package name */
    public static int f13481j = 0;
    public static int k = 1;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC1215y8 f13482i;

    public K8(AbstractC1215y8 abstractC1215y8, AbstractC1215y8 abstractC1215y82, AbstractC1215y8 abstractC1215y83) {
        super(abstractC1215y8, abstractC1215y82);
        this.f13482i = abstractC1215y83;
    }

    public static String h(String str, int i5, int i10, int i11, boolean z2) {
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
                    cArr[i12] = (char) (c10 - 140);
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

    @Override // Va.AbstractC1215y8
    public final C1139s8 b(C1203x8 c1203x8, C1214y7 c1214y7) throws JSONException {
        long j8;
        C1139s8 c1139s8C = e().c(c1203x8, c1214y7);
        int i5 = (f13481j + 91) % 128;
        k = i5;
        f13481j = (i5 + 23) % 128;
        C1139s8 c1139s8C2 = this.f13482i.c(c1203x8, c1214y7);
        try {
            Object objC = g().c(c1203x8, c1214y7).c();
            if (objC instanceof JSONObject) {
                ((JSONObject) objC).put((String) c1139s8C.c(), c1139s8C2.c());
                return c1139s8C2;
            }
            if (!(!(objC instanceof JSONArray))) {
                ((JSONArray) objC).put(c1139s8C.a().intValue(), c1139s8C2.c());
                return c1139s8C2;
            }
            if (objC instanceof Map) {
                ((Map) objC).put(c1139s8C.c(), c1139s8C2.c());
                k = (f13481j + 1) % 128;
                return c1139s8C2;
            }
            if (objC instanceof List) {
                int i10 = k + 99;
                f13481j = i10 % 128;
                if (i10 % 2 == 0) {
                    ((List) objC).set(c1139s8C.a().intValue(), c1139s8C2.c());
                    return c1139s8C2;
                }
                ((List) objC).set(c1139s8C.a().intValue(), c1139s8C2.c());
                throw null;
            }
            if (objC.getClass().isArray()) {
                ((Object[]) objC)[c1139s8C.a().intValue()] = c1139s8C2.c();
                return c1139s8C2;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(h("\u0003\u0010\u000e\u0016\u0003ﾾ\u0012\u0013\u000eﾾ\u0012\u000e\u0007\u0010\u0001\u0011\u0000\u0013\u0011ﾾ\u0005\f\u0007\u0012\uffff\u0013\n\uffff\u0014\u0003ﾾ\u0010\r\u0010\u0010￣ￅﾾ\f\r\u0007\u0011\u0011", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 42, Color.blue(0) + 238, 36 - ((Process.getThreadPriority(0) + 20) >> 6), true).intern());
            sb2.append(this);
            j8 = 0;
            try {
                sb2.append(h("ￆ\u001b\u0014\u0019\u001b\u0016\u0016\u0015\u0018\u001a\u000b\nￆ\u0015\b\u0010\u000b\t\u001aￆￍ￠ￆ\u001a\u0018\u001f\u000f\u0014\rￆ\u001a\u0015ￆ\u001b\u0019\u000bￆ\u0001\u0003ￆ\u0015\u0014ￆ\u0007\u0014", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 45, AndroidCharacter.getMirror('0') + 182, ExpandableListView.getPackedPositionGroup(0L) + 20, false).intern());
                sb2.append(objC);
                new C1023j8(c1214y7, c1203x8, sb2.toString(), null).d(c1214y7.f());
                return c1139s8C2;
            } catch (Exception e7) {
                e = e7;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(h("\u0003\u0010\u000e\u0016\u0003ﾾ\u0012\u0013\u000eﾾ\u0012\u000e\u0007\u0010\u0001\u0011\u0000\u0013\u0011ﾾ\u0005\f\u0007\u0012\uffff\u0013\n\uffff\u0014\u0003ﾾ\u0010\r\u0010\u0010￣ￅﾾ\f\r\u0007\u0011\u0011", 43 - ExpandableListView.getPackedPositionType(j8), (ViewConfiguration.getZoomControlsTimeout() > j8 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j8 ? 0 : -1)) + 237, 35 - TextUtils.lastIndexOf("", '0', 0), true).intern());
                sb3.append(this);
                sb3.append(h(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 179 - (ExpandableListView.getPackedPositionForGroup(0) > j8 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j8 ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > j8 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j8 ? 0 : -1)), true).intern());
                new C1023j8(c1214y7, c1203x8, sb3.toString(), e).d(c1214y7.f());
                return c1139s8C2;
            }
        } catch (Exception e10) {
            e = e10;
            j8 = 0;
        }
    }

    @Override // Va.I8
    public final boolean equals(Object obj) {
        f13481j = (k + 93) % 128;
        if (this == obj) {
            return true;
        }
        if (obj != null && K8.class == obj.getClass()) {
            if (!super.equals(obj)) {
                f13481j = (k + 115) % 128;
                return false;
            }
            AbstractC1215y8 abstractC1215y8 = ((K8) obj).f13482i;
            AbstractC1215y8 abstractC1215y82 = this.f13482i;
            if (abstractC1215y82 != null) {
                f13481j = (k + 33) % 128;
                return abstractC1215y82.equals(abstractC1215y8);
            }
            if (abstractC1215y8 == null) {
                int i5 = f13481j + 35;
                k = i5 % 128;
                if (i5 % 2 == 0) {
                    int i10 = 44 / 0;
                }
                return true;
            }
        }
        return false;
    }

    @Override // Va.I8
    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = super.hashCode() * 31;
        AbstractC1215y8 abstractC1215y8 = this.f13482i;
        if (abstractC1215y8 != null) {
            int i5 = f13481j + 119;
            k = i5 % 128;
            if (i5 % 2 == 0) {
                abstractC1215y8.hashCode();
                throw null;
            }
            iHashCode = abstractC1215y8.hashCode();
            k = (f13481j + 123) % 128;
        } else {
            iHashCode = 0;
        }
        return iHashCode2 + iHashCode;
    }

    @Override // Va.I8
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(h("\u0014\ufff7\ufff7", 2 - MotionEvent.axisFromString(""), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 180, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3, false).intern());
        int i5 = (f13481j + 91) % 128;
        k = i5;
        f13481j = (i5 + 23) % 128;
        sb2.append(this.f13482i.toString());
        String string = sb2.toString();
        int i10 = k + 5;
        f13481j = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 66 / 0;
        }
        return string;
    }
}
