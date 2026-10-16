package com.waze.z.a;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class z extends aa {

    /* renamed from: a, reason: collision with root package name */
    public static final z f46212a = new z();

    private z() {
        super(null);
    }

    @Override // com.waze.z.a.aa
    public final FiniteAnimationSpec a(long j2) {
        return AnimationSpecKt.spring(0.7f, 130.0f, null);
    }

    @Override // com.waze.z.a.aa
    public final FiniteAnimationSpec b(long j2) {
        return AnimationSpecKt.tween(DisplayStrings.DS_NIGHT, (int) h.o.a.m(j2), new CubicBezierEasing(0.9f, 0.01f, 0.99f, 0.75f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1738797227;
    }

    public final String toString() {
        return "Light";
    }
}
