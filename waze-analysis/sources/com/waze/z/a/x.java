package com.waze.z.a;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.webkit.Profile;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class x extends aa {

    /* renamed from: a, reason: collision with root package name */
    public static final x f46210a = new x();

    private x() {
        super(null);
    }

    @Override // com.waze.z.a.aa
    public final FiniteAnimationSpec a(long j2) {
        return AnimationSpecKt.tween(DisplayStrings.DS_NIGHT, (int) h.o.a.m(j2), new CubicBezierEasing(0.2f, 0.7f, -0.17f, 1.02f));
    }

    @Override // com.waze.z.a.aa
    public final FiniteAnimationSpec b(long j2) {
        return AnimationSpecKt.tween(300, (int) h.o.a.m(j2), new CubicBezierEasing(0.4f, 0.0f, 1.0f, 0.2f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1616117910;
    }

    public final String toString() {
        return Profile.DEFAULT_PROFILE_NAME;
    }
}
