package i0;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import ka.AbstractC3256n;

/* renamed from: i0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2825c {

    /* renamed from: a, reason: collision with root package name */
    public final String f36599a;

    /* renamed from: b, reason: collision with root package name */
    public final float f36600b;

    /* renamed from: c, reason: collision with root package name */
    public final float f36601c;

    /* renamed from: d, reason: collision with root package name */
    public final float f36602d;

    /* renamed from: e, reason: collision with root package name */
    public final float f36603e;

    /* renamed from: f, reason: collision with root package name */
    public final long f36604f;

    /* renamed from: g, reason: collision with root package name */
    public final int f36605g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f36606h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f36607i;

    /* renamed from: j, reason: collision with root package name */
    public final C2824b f36608j;
    public boolean k;

    public C2825c(String str, float f10, float f11, float f12, float f13, long j8, int i5, boolean z2) {
        this.f36599a = str;
        this.f36600b = f10;
        this.f36601c = f11;
        this.f36602d = f12;
        this.f36603e = f13;
        this.f36604f = j8;
        this.f36605g = i5;
        this.f36606h = z2;
        ArrayList arrayList = new ArrayList();
        this.f36607i = arrayList;
        C2824b c2824b = new C2824b(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 1023);
        this.f36608j = c2824b;
        arrayList.add(c2824b);
    }

    public final C2826d a() {
        b();
        while (true) {
            ArrayList arrayList = this.f36607i;
            if (arrayList.size() <= 1) {
                C2824b c2824b = this.f36608j;
                H h10 = new H(c2824b.f36589a, c2824b.f36590b, c2824b.f36591c, c2824b.f36592d, c2824b.f36593e, c2824b.f36594f, c2824b.f36595g, c2824b.f36596h, c2824b.f36597i, c2824b.f36598j);
                C2826d c2826d = new C2826d(this.f36599a, this.f36600b, this.f36601c, this.f36602d, this.f36603e, h10, this.f36604f, this.f36605g, this.f36606h);
                this.k = true;
                return c2826d;
            }
            b();
            C2824b c2824b2 = (C2824b) arrayList.remove(arrayList.size() - 1);
            ((C2824b) AbstractC3256n.e(arrayList, 1)).f36598j.add(new H(c2824b2.f36589a, c2824b2.f36590b, c2824b2.f36591c, c2824b2.f36592d, c2824b2.f36593e, c2824b2.f36594f, c2824b2.f36595g, c2824b2.f36596h, c2824b2.f36597i, c2824b2.f36598j));
        }
    }

    public final void b() {
        if (this.k) {
            throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
    }
}
