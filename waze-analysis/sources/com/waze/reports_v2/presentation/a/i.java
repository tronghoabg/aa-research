package com.waze.reports_v2.presentation.a;

import android.graphics.Typeface;
import android.support.v7.widget.ej;
import androidx.core.content.res.ResourcesCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends ej {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LottieAnimationView f34725a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(LottieAnimationView lottieAnimationView) {
        super(null);
        this.f34725a = lottieAnimationView;
    }

    @Override // android.support.v7.widget.ej
    public final Typeface l() {
        return ResourcesCompat.getFont(this.f34725a.getContext(), R.font.proximanova_semibold);
    }
}
