package A;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: A.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229w implements InterfaceC0228v {

    /* renamed from: a, reason: collision with root package name */
    public final float f184a;

    /* renamed from: b, reason: collision with root package name */
    public final E f185b;

    public C0229w(float f10, float f11) {
        this.f184a = f11;
        E e7 = new E();
        e7.f19a = 1.0f;
        double dSqrt = Math.sqrt(50.0d);
        e7.f20b = dSqrt;
        e7.f21c = false;
        if (((float) (dSqrt * dSqrt)) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        e7.f20b = Math.sqrt(f10);
        e7.f21c = false;
        this.f185b = e7;
    }

    @Override // A.InterfaceC0228v
    public final float c(float f10, float f11, float f12) {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // A.InterfaceC0228v
    public final float d(long j8, float f10, float f11, float f12) {
        E e7 = this.f185b;
        e7.f19a = f11;
        return Float.intBitsToFloat((int) (e7.a(f10, f12, j8 / 1000000) >> 32));
    }

    @Override // A.InterfaceC0228v
    public final float j(long j8, float f10, float f11, float f12) {
        E e7 = this.f185b;
        e7.f19a = f11;
        return Float.intBitsToFloat((int) (e7.a(f10, f12, j8 / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0252  */
    @Override // A.InterfaceC0228v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long k(float r35, float r36, float r37) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.C0229w.k(float, float, float):long");
    }

    @Override // A.InterfaceC0216i
    public final c0 q(S3.e converter) {
        AbstractC3340k.e(converter, "converter");
        return new S3.n(this);
    }
}
