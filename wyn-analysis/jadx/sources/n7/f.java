package N7;

import Yf.AbstractC1300f;
import android.view.View;
import ba.C1521a;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import k1.g0;
import k1.v0;

/* loaded from: classes4.dex */
public final class f extends AbstractC1300f {

    /* renamed from: c, reason: collision with root package name */
    public final View f8592c;

    /* renamed from: d, reason: collision with root package name */
    public int f8593d;

    /* renamed from: e, reason: collision with root package name */
    public int f8594e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f8595f;

    public f(View view) {
        super(0);
        this.f8595f = new int[2];
        this.f8592c = view;
    }

    @Override // Yf.AbstractC1300f
    public final void a(g0 g0Var) {
        this.f8592c.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // Yf.AbstractC1300f
    public final void b(g0 g0Var) {
        View view = this.f8592c;
        int[] iArr = this.f8595f;
        view.getLocationOnScreen(iArr);
        this.f8593d = iArr[1];
    }

    @Override // Yf.AbstractC1300f
    public final v0 c(v0 v0Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((g0) it.next()).f38830a.c() & 8) != 0) {
                this.f8592c.setTranslationY(J7.a.c(r0.f38830a.b(), this.f8594e, 0));
                break;
            }
        }
        return v0Var;
    }

    @Override // Yf.AbstractC1300f
    public final C1521a d(g0 g0Var, C1521a c1521a) {
        View view = this.f8592c;
        int[] iArr = this.f8595f;
        view.getLocationOnScreen(iArr);
        int i5 = this.f8593d - iArr[1];
        this.f8594e = i5;
        view.setTranslationY(i5);
        return c1521a;
    }
}
