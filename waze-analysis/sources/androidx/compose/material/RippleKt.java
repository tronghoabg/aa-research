package androidx.compose.material;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.unit.Dp;
import h.g.a.a;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RippleKt {
    private static final ProvidableCompositionLocal<RippleConfiguration> LocalRippleConfiguration = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.material.RippleKt$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return RippleKt.LocalRippleConfiguration$lambda$0();
        }
    }, 1, null);
    private static final RippleNodeFactory DefaultBoundedRipple = new RippleNodeFactory(true, Dp.Companion.m11184getUnspecifiedD9Ej5fM(), Color.Companion.m8264getUnspecified0d7_KjU(), (o) null);
    private static final RippleNodeFactory DefaultUnboundedRipple = new RippleNodeFactory(false, Dp.Companion.m11184getUnspecifiedD9Ej5fM(), Color.Companion.m8264getUnspecified0d7_KjU(), (o) null);
    private static final RippleAlpha LightThemeHighContrastRippleAlpha = new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);
    private static final RippleAlpha LightThemeLowContrastRippleAlpha = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);
    private static final RippleAlpha DarkThemeRippleAlpha = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);

    static final RippleConfiguration LocalRippleConfiguration$lambda$0() {
        return new RippleConfiguration(0L, null, 3, null);
    }

    public static final ProvidableCompositionLocal<RippleConfiguration> getLocalRippleConfiguration() {
        return LocalRippleConfiguration;
    }

    /* renamed from: ripple-H2RKhps, reason: not valid java name */
    public static final IndicationNodeFactory m4168rippleH2RKhps(boolean z, float f2, long j2) {
        if (Dp.m11169equalsimpl0(f2, Dp.Companion.m11184getUnspecifiedD9Ej5fM()) && Color.m8229equalsimpl0(j2, Color.Companion.m8264getUnspecified0d7_KjU())) {
            return z ? DefaultBoundedRipple : DefaultUnboundedRipple;
        }
        return new RippleNodeFactory(z, f2, j2, (o) null);
    }

    /* renamed from: ripple-H2RKhps$default, reason: not valid java name */
    public static /* synthetic */ IndicationNodeFactory m4169rippleH2RKhps$default(boolean z, float f2, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            j2 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        return m4168rippleH2RKhps(1 == ((z ? 1 : 0) | (i2 & 1)), f2, j2);
    }

    /* renamed from: ripple-wH6b6FI, reason: not valid java name */
    public static final IndicationNodeFactory m4170ripplewH6b6FI(ColorProducer colorProducer, boolean z, float f2) {
        return new RippleNodeFactory(z, f2, colorProducer, (o) null);
    }

    /* renamed from: ripple-wH6b6FI$default, reason: not valid java name */
    public static /* synthetic */ IndicationNodeFactory m4171ripplewH6b6FI$default(ColorProducer colorProducer, boolean z, float f2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f2 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        return m4170ripplewH6b6FI(colorProducer, z | (!((i2 & 2) == 0)), f2);
    }
}
