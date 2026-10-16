package androidx.fragment.app;

import android.animation.AnimatorSet;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1421j {

    /* renamed from: a, reason: collision with root package name */
    public static final C1421j f18459a = new C1421j();

    public final void a(@NotNull AnimatorSet animatorSet) {
        AbstractC3340k.e(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(@NotNull AnimatorSet animatorSet, long j8) {
        AbstractC3340k.e(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j8);
    }
}
