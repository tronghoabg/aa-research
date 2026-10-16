package Q2;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final A0.f f9775c = new A0.f(3);

    /* renamed from: a, reason: collision with root package name */
    public final P1.b f9776a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9777b;

    public d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f10, int i5, float f11, int i10, boolean z2, int i11, int i12) {
        boolean z10;
        int i13;
        if (z2) {
            z10 = true;
            i13 = i11;
        } else {
            z10 = false;
            i13 = -16777216;
        }
        this.f9776a = new P1.b(spannableStringBuilder, alignment, null, null, f10, 0, i5, f11, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z10, i13, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f9777b = i12;
    }
}
