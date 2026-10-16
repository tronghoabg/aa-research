package Va;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;

/* renamed from: Va.k9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1037k9 extends AbstractC1063m9 {

    /* renamed from: h, reason: collision with root package name */
    public static final char[] f14343h = {'c', 50890, 36135, 21441, 6902, 57664, 42922, 28390, 13644, 64428, 49692, 35188, 20441, 5711, 56693, 41935, 27195, 12507, 63477, 48719, 33921, 19431, 4687, 55479, 40715, 26233, 11433, 62281, 47725, 32961, 18239, 3541, 54473, 39723, 24963, 10491, 61210, 46473, 31807, 17252, 2459, 53257, 38777};

    @Override // Va.AbstractC1127r9
    public final String d() {
        String str;
        char cResolveSize = (char) View.resolveSize(0, 0);
        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1;
        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 43;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[scrollDefaultDelay];
                Ab.f13217t = 0;
                while (true) {
                    int i5 = Ab.f13217t;
                    if (i5 < scrollDefaultDelay) {
                        cArr[i5] = (char) ((f14343h[modifierMetaStateMask + i5] ^ (i5 * (-5994887538470238555L))) ^ cResolveSize);
                        Ab.f13217t = i5 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str.intern();
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        return PAGSdk.class;
    }
}
