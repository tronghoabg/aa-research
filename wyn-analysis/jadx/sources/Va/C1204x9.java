package Va;

import android.graphics.Color;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.mbridge.msdk.MBridgeSDK;

/* renamed from: Va.x9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1204x9 extends AbstractC1127r9 {

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f14780c = {'c', 29252, 58427, 22191, 51393, 15029, 44400, 8004, 37180, 996, 30155, 59383, 23145, 52316, 15934, 45294, 8862, 38038, 1860, 31043, 60213, 24035, 53205, 16824, 46171, 9847, 38933, 'm', 29250, 58424, 22261, 51401, 15024, 44400, 8012, 37172};

    /* renamed from: d, reason: collision with root package name */
    public static int f14781d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f14782e = 1;

    public static String f(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f14780c[i5 + i11] ^ (i11 * (-8812005333178027477L))) ^ c10);
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

    @Override // Va.AbstractC1127r9
    public final String a() {
        char cRgb;
        int longPressTimeout;
        int packedPositionType;
        int i5 = f14782e + 53;
        f14781d = i5 % 128;
        if (i5 % 2 != 0) {
            cRgb = (char) (Color.rgb(0, 0, 1) - 16777216);
            longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) * 4;
            packedPositionType = ExpandableListView.getPackedPositionType(1L) + 124;
        } else {
            cRgb = (char) ((-16777216) - Color.rgb(0, 0, 0));
            longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 27;
            packedPositionType = ExpandableListView.getPackedPositionType(0L) + 9;
        }
        String strIntern = f(longPressTimeout, packedPositionType, cRgb).intern();
        f14781d = (f14782e + 19) % 128;
        return strIntern;
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        C1223z4 c1223z4 = new C1223z4(a());
        int i5 = f14782e + 1;
        f14781d = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 98 / 0;
        }
        return c1223z4;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        f14782e = (f14781d + 3) % 128;
        String strIntern = f(ExpandableListView.getPackedPositionType(0L), View.resolveSize(0, 0) + 27, (char) View.resolveSize(0, 0)).intern();
        int i5 = f14782e + 13;
        f14781d = i5 % 128;
        if (i5 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = (f14782e + 61) % 128;
        f14781d = i5;
        f14782e = (i5 + 13) % 128;
        return MBridgeSDK.class;
    }
}
