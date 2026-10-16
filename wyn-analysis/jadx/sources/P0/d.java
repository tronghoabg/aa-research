package p0;

import U8.v0;
import android.view.MotionEvent;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f43124a = new d();

    public final long a(@NotNull MotionEvent motionEvent, int i5) {
        AbstractC3340k.e(motionEvent, "motionEvent");
        return v0.f(motionEvent.getRawX(i5), motionEvent.getRawY(i5));
    }
}
