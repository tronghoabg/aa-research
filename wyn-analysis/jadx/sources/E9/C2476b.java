package e9;

import com.google.android.gms.ads.nativead.l;
import f9.C2618a;

/* renamed from: e9.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2476b {

    /* renamed from: a, reason: collision with root package name */
    public final l f34438a;

    /* renamed from: b, reason: collision with root package name */
    public final C2618a f34439b;

    public C2476b(C2618a c2618a) {
        if (c2618a == null) {
            this.f34439b = null;
            this.f34438a = null;
        } else {
            if (c2618a.f35245d == 0) {
                c2618a.f35245d = System.currentTimeMillis();
            }
            this.f34439b = c2618a;
            this.f34438a = new l(c2618a);
        }
    }
}
