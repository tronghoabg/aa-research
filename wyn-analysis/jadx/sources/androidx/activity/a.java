package androidx.activity;

import android.window.BackEvent;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17696a = new a();

    @NotNull
    public final BackEvent a(float f10, float f11, float f12, int i5) {
        return new BackEvent(f10, f11, f12, i5);
    }

    public final float b(@NotNull BackEvent backEvent) {
        AbstractC3340k.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(@NotNull BackEvent backEvent) {
        AbstractC3340k.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(@NotNull BackEvent backEvent) {
        AbstractC3340k.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(@NotNull BackEvent backEvent) {
        AbstractC3340k.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
