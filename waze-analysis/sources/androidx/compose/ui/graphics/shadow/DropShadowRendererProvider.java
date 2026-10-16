package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface DropShadowRendererProvider {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final DropShadowRendererProvider Default = new DropShadowRendererProvider() { // from class: androidx.compose.ui.graphics.shadow.DropShadowRendererProvider$Companion$Default$1
            @Override // androidx.compose.ui.graphics.shadow.DropShadowRendererProvider
            /* renamed from: obtainDropShadowRenderer-eZhPAX0 */
            public final DropShadowRenderer mo8966obtainDropShadowRenderereZhPAX0(Shape shape, long j2, LayoutDirection layoutDirection, Density density, Shadow shadow) {
                return new DropShadowRenderer(shadow, shape.mo2037createOutlinePq9zytI(j2, layoutDirection, density));
            }
        };

        private Companion() {
        }

        public final DropShadowRendererProvider getDefault() {
            return Default;
        }
    }

    /* renamed from: obtainDropShadowRenderer-eZhPAX0 */
    DropShadowRenderer mo8966obtainDropShadowRenderereZhPAX0(Shape shape, long j2, LayoutDirection layoutDirection, Density density, Shadow shadow);
}
