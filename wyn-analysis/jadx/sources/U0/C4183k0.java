package u0;

import android.view.RenderNode;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* renamed from: u0.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4183k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C4183k0 f46249a = new C4183k0();

    public final int a(@NotNull RenderNode renderNode) {
        AbstractC3340k.e(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    public final int b(@NotNull RenderNode renderNode) {
        AbstractC3340k.e(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    public final void c(@NotNull RenderNode renderNode, int i5) {
        AbstractC3340k.e(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i5);
    }

    public final void d(@NotNull RenderNode renderNode, int i5) {
        AbstractC3340k.e(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i5);
    }
}
