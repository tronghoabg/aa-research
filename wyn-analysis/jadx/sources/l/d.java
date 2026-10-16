package l;

import android.animation.TimeInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public final class d implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public int[] f39818a;

    /* renamed from: b, reason: collision with root package name */
    public int f39819b;

    /* renamed from: c, reason: collision with root package name */
    public int f39820c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        int i5 = (int) ((f10 * this.f39820c) + 0.5f);
        int i10 = this.f39819b;
        int[] iArr = this.f39818a;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = iArr[i11];
            if (i5 < i12) {
                break;
            }
            i5 -= i12;
            i11++;
        }
        return (i11 / i10) + (i11 < i10 ? i5 / this.f39820c : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
