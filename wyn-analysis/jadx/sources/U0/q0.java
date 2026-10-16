package u0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class q0 extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        AbstractC3340k.e(view, "view");
        AbstractC3340k.e(outline, "outline");
        Outline outlineB = ((s0) view).f46368e.b();
        AbstractC3340k.b(outlineB);
        outline.set(outlineB);
    }
}
