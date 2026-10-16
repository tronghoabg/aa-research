package c8;

import android.graphics.Matrix;
import android.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public float f19792a;

    /* renamed from: b, reason: collision with root package name */
    public float f19793b;

    /* renamed from: c, reason: collision with root package name */
    public float f19794c;

    /* renamed from: d, reason: collision with root package name */
    public float f19795d;

    /* renamed from: e, reason: collision with root package name */
    public float f19796e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f19797f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f19798g = new ArrayList();

    public t() {
        d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 270.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void a(float f10) {
        float f11 = this.f19795d;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f19793b;
        float f14 = this.f19794c;
        p pVar = new p(f13, f14, f13, f14);
        pVar.f19785f = this.f19795d;
        pVar.f19786g = f12;
        this.f19798g.add(new C1590n(pVar));
        this.f19795d = f10;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f19797f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((r) arrayList.get(i5)).a(matrix, path);
        }
    }

    public final void c(float f10, float f11) {
        q qVar = new q();
        qVar.f19787b = f10;
        qVar.f19788c = f11;
        this.f19797f.add(qVar);
        o oVar = new o(qVar, this.f19793b, this.f19794c);
        float fB = oVar.b() + 270.0f;
        float fB2 = oVar.b() + 270.0f;
        a(fB);
        this.f19798g.add(oVar);
        this.f19795d = fB2;
        this.f19793b = f10;
        this.f19794c = f11;
    }

    public final void d(float f10, float f11, float f12) {
        this.f19792a = f10;
        this.f19793b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f19794c = f10;
        this.f19795d = f11;
        this.f19796e = (f11 + f12) % 360.0f;
        this.f19797f.clear();
        this.f19798g.clear();
    }
}
