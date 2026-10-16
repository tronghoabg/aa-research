package androidx.compose.ui.graphics;

import android.os.Build;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class RenderEffect {
    public static final int $stable = 0;
    private android.graphics.RenderEffect internalRenderEffect;

    private RenderEffect() {
    }

    public final android.graphics.RenderEffect asAndroidRenderEffect() {
        android.graphics.RenderEffect renderEffect = this.internalRenderEffect;
        if (renderEffect != null) {
            return renderEffect;
        }
        android.graphics.RenderEffect renderEffectCreateRenderEffect = createRenderEffect();
        this.internalRenderEffect = renderEffectCreateRenderEffect;
        return renderEffectCreateRenderEffect;
    }

    protected abstract android.graphics.RenderEffect createRenderEffect();

    public boolean isSupported() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public /* synthetic */ RenderEffect(o oVar) {
        this();
    }
}
