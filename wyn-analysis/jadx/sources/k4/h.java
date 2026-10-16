package k4;

import android.os.SystemClock;
import i4.C2844a;
import i4.C2849f;
import p7.AbstractC3772b;

/* loaded from: classes.dex */
public final class h extends xg.g {
    @Override // xg.g
    public final boolean j(C2849f c2849f) {
        AbstractC3772b abstractC3772b = c2849f.f36786a;
        boolean z2 = abstractC3772b instanceof C2844a;
        int i5 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        if ((z2 ? ((C2844a) abstractC3772b).f36782e : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        AbstractC3772b abstractC3772b2 = c2849f.f36787b;
        if (abstractC3772b2 instanceof C2844a) {
            i5 = ((C2844a) abstractC3772b2).f36782e;
        }
        return i5 > 100;
    }

    @Override // xg.g
    public final boolean k() {
        boolean z2;
        synchronized (f.f39266a) {
            try {
                int i5 = f.f39268c;
                f.f39268c = i5 + 1;
                if (i5 >= 30 || SystemClock.uptimeMillis() > f.f39269d + 30000) {
                    f.f39268c = 0;
                    f.f39269d = SystemClock.uptimeMillis();
                    String[] list = f.f39267b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    f.f39270e = list.length < 800;
                }
                z2 = f.f39270e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }
}
