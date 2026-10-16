package E;

import com.unity3d.services.UnityAdsConstants;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final x f2700a = new x(new C0422l(1, 4), 2);

    /* renamed from: b, reason: collision with root package name */
    public static final x f2701b = new x(new C0422l(1, 3), 3);

    static {
        AbstractC3256n.m(2, "direction");
        AbstractC3256n.m(2, "direction");
        AbstractC3256n.m(1, "direction");
        AbstractC3256n.m(1, "direction");
        AbstractC3256n.m(3, "direction");
        AbstractC3256n.m(3, "direction");
    }

    public static Z.k a(Z.k kVar) {
        AbstractC3340k.e(kVar, "<this>");
        return kVar.g(f2701b);
    }

    public static final Z.k b(Z.k height, float f10) {
        AbstractC3340k.e(height, "$this$height");
        return height.g(new M(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, 5));
    }

    public static final Z.k c(Z.k size, float f10) {
        AbstractC3340k.e(size, "$this$size");
        return size.g(new M(f10, f10, f10, f10, true));
    }

    public static final Z.k d(Z.k size, long j8) {
        AbstractC3340k.e(size, "$this$size");
        return e(size, L0.f.b(j8), L0.f.a(j8));
    }

    public static final Z.k e(Z.k size, float f10, float f11) {
        AbstractC3340k.e(size, "$this$size");
        return size.g(new M(f10, f11, f10, f11, true));
    }

    public static final Z.k f(float f10) {
        return new M(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
    }

    public static Z.k g(Z.k widthIn, float f10) {
        AbstractC3340k.e(widthIn, "$this$widthIn");
        return widthIn.g(new M(Float.NaN, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10));
    }
}
