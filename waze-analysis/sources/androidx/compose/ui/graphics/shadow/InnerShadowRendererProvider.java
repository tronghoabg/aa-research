package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface InnerShadowRendererProvider {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final InnerShadowRendererProvider Default = new InnerShadowRendererProvider() { // from class: androidx.compose.ui.graphics.shadow.InnerShadowRendererProvider$Companion$Default$1
            @Override // androidx.compose.ui.graphics.shadow.InnerShadowRendererProvider
            /* renamed from: obtainInnerShadowRenderer-eZhPAX0 */
            public final InnerShadowRenderer mo8967obtainInnerShadowRenderereZhPAX0(Shape shape, long j2, LayoutDirection layoutDirection, Density density, Shadow shadow) {
                return new InnerShadowRenderer(shadow, shape.mo2037createOutlinePq9zytI(j2, layoutDirection, density));
            }
        };

        private Companion() {
        }

        public final InnerShadowRendererProvider getDefault() {
            return Default;
        }
    }

    /* renamed from: obtainInnerShadowRenderer-eZhPAX0 */
    InnerShadowRenderer mo8967obtainInnerShadowRenderereZhPAX0(Shape shape, long j2, LayoutDirection layoutDirection, Density density, Shadow shadow);
}
