package Va;

import android.view.ViewConfiguration;
import com.chartboost.sdk.Chartboost;

/* renamed from: Va.p9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1102p9 extends AbstractC1127r9 {

    /* renamed from: c, reason: collision with root package name */
    public static int f14479c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f14480d = 1;

    public static String f(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(8706025318067162097L, charArray, i5);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i10 = AbstractC1104pb.f14483C;
                    if (i10 < cArrZ.length) {
                        cArrZ[i10] = (char) ((cArrZ[i10] ^ cArrZ[i10 % 4]) ^ ((i10 - 4) * 8706025318067162097L));
                        AbstractC1104pb.f14483C = i10 + 1;
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

    @Override // Va.AbstractC1127r9
    public final String a() {
        f14479c = (f14480d + 41) % 128;
        String strIntern = f(1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "舶艕\udae6樤酿ﶧ䎹ꀘ궆\ueaa8㩮偁\uddcd㩲").intern();
        int i5 = f14479c + 73;
        f14480d = i5 % 128;
        if (i5 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        K1 k12 = new K1(a());
        int i5 = f14480d + 103;
        f14479c = i5 % 128;
        if (i5 % 2 == 0) {
            return k12;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        int i5 = f14480d + 13;
        f14479c = i5 % 128;
        String strIntern = f(i5 % 2 != 0 ? 1 / (ViewConfiguration.getTapTimeout() * 36) : 1 - (ViewConfiguration.getTapTimeout() >> 16), "䖦䗅ꧦⴗ\ue278몘븢巟樁馥絟귇ᩚ䥣䶝ﴖ쪙㤱鶘쵎㮝\ue912\uec44ᲂ\uab1a\ud8dc㱜泱孜袞\u0c8d밺எ").intern();
        int i10 = f14480d + 65;
        f14479c = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 83 / 0;
        }
        return strIntern;
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = f14480d + 41;
        f14479c = i5 % 128;
        if (i5 % 2 == 0) {
            return Chartboost.class;
        }
        throw null;
    }
}
