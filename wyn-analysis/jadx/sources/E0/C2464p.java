package e0;

import android.graphics.Canvas;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* renamed from: e0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2464p {

    /* renamed from: a, reason: collision with root package name */
    public static final C2464p f34372a = new C2464p();

    public final void a(@NotNull Canvas canvas, boolean z2) {
        AbstractC3340k.e(canvas, "canvas");
        if (z2) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
