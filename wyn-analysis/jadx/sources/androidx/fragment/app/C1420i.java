package androidx.fragment.app;

import android.animation.AnimatorSet;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.fragment.app.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1420i {

    /* renamed from: a, reason: collision with root package name */
    public static final C1420i f18458a = new C1420i();

    public final long a(@NotNull AnimatorSet animatorSet) {
        AbstractC3340k.e(animatorSet, "animatorSet");
        return animatorSet.getTotalDuration();
    }
}
