package androidx.compose.material3;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RippleKt {
    private static final RippleNodeFactory DefaultBoundedRipple;
    private static final RippleNodeFactory DefaultUnboundedRipple;
    private static final ProvidableCompositionLocal<RippleThemeConfiguration> LocalRippleThemeConfiguration = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.material3.RippleKt$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return RippleDefaults.INSTANCE.getThemeConfiguration();
        }
    }, 1, null);
    private static final ProvidableCompositionLocal<RippleConfiguration> LocalRippleConfiguration = CompositionLocalKt.compositionLocalWithComputedDefaultOf(new l() { // from class: androidx.compose.material3.RippleKt$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return RippleKt.LocalRippleConfiguration$lambda$0((CompositionLocalAccessorScope) obj);
        }
    });

    static {
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        DefaultBoundedRipple = new RippleNodeFactory(true, Dp.Companion.m11184getUnspecifiedD9Ej5fM(), Color.Companion.m8264getUnspecified0d7_KjU(), (Shape) null, true, z2, z3, z, (o) null);
        DefaultUnboundedRipple = new RippleNodeFactory(false, Dp.Companion.m11184getUnspecifiedD9Ej5fM(), Color.Companion.m8264getUnspecified0d7_KjU(), (Shape) null, z2, z3, z, true, (o) null);
    }

    static final RippleConfiguration LocalRippleConfiguration$lambda$0(CompositionLocalAccessorScope compositionLocalAccessorScope) {
        return new RippleConfiguration(0L, 1, (o) null);
    }

    public static final ProvidableCompositionLocal<RippleConfiguration> getLocalRippleConfiguration() {
        return LocalRippleConfiguration;
    }

    public static final ProvidableCompositionLocal<RippleThemeConfiguration> getLocalRippleThemeConfiguration() {
        return LocalRippleThemeConfiguration;
    }

    /* renamed from: ripple-H2RKhps, reason: not valid java name */
    public static final /* synthetic */ IndicationNodeFactory m5411rippleH2RKhps(boolean z, float f2, long j2) {
        return m5413rippleOu1YvPQ(z, f2, j2, null, true, true, true, true);
    }

    /* renamed from: ripple-H2RKhps$default, reason: not valid java name */
    public static /* synthetic */ IndicationNodeFactory m5412rippleH2RKhps$default(boolean z, float f2, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            j2 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        return m5411rippleH2RKhps(1 == ((z ? 1 : 0) | (i2 & 1)), f2, j2);
    }

    /* renamed from: ripple-Ou1YvPQ, reason: not valid java name */
    public static final IndicationNodeFactory m5413rippleOu1YvPQ(boolean z, float f2, long j2, Shape shape, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (Dp.m11169equalsimpl0(f2, Dp.Companion.m11184getUnspecifiedD9Ej5fM()) && Color.m8229equalsimpl0(j2, Color.Companion.m8264getUnspecified0d7_KjU()) && shape == null && z2 && z3 && z4 && z5) {
            return z ? DefaultBoundedRipple : DefaultUnboundedRipple;
        }
        return new RippleNodeFactory(z, f2, j2, shape, z2, z3, z4, z5, (o) null);
    }

    /* renamed from: ripple-Ou1YvPQ$default, reason: not valid java name */
    public static /* synthetic */ IndicationNodeFactory m5414rippleOu1YvPQ$default(boolean z, float f2, long j2, Shape shape, boolean z2, boolean z3, boolean z4, boolean z5, int i2, Object obj) {
        boolean z6;
        boolean z7;
        Shape shape2;
        boolean z8;
        long j3;
        boolean z9;
        if ((i2 & 2) != 0) {
            f2 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            j2 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        int i3 = (z ? 1 : 0) | (i2 & 1);
        if ((i2 & 8) != 0) {
            shape = null;
        }
        boolean z10 = z2 | (!((i2 & 16) == 0));
        boolean z11 = z3 | (!((i2 & 32) == 0));
        boolean z12 = z4 | (!((i2 & 64) == 0));
        boolean z13 = (!((i2 & 128) == 0)) | z5;
        if (1 != i3) {
            z6 = z11;
            z7 = z12;
            shape2 = shape;
            z8 = z10;
            j3 = j2;
            z9 = false;
        } else {
            z6 = z11;
            z7 = z12;
            shape2 = shape;
            z8 = z10;
            j3 = j2;
            z9 = true;
        }
        return m5413rippleOu1YvPQ(z9, f2, j3, shape2, z8, z6, z7, z13);
    }

    /* renamed from: ripple-TN_CM5M, reason: not valid java name */
    public static final IndicationNodeFactory m5415rippleTN_CM5M(ColorProducer colorProducer, boolean z, float f2, Shape shape, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new RippleNodeFactory(z, f2, colorProducer, shape, z2, z3, z4, z5, (o) null);
    }

    /* renamed from: ripple-TN_CM5M$default, reason: not valid java name */
    public static /* synthetic */ IndicationNodeFactory m5416rippleTN_CM5M$default(ColorProducer colorProducer, boolean z, float f2, Shape shape, boolean z2, boolean z3, boolean z4, boolean z5, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f2 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        float f3 = f2;
        boolean z6 = z | (!((i2 & 2) == 0));
        if ((i2 & 8) != 0) {
            shape = null;
        }
        return m5415rippleTN_CM5M(colorProducer, z6, f3, shape, (!((i2 & 16) == 0)) | z2, (!((i2 & 32) == 0)) | z3, (!((i2 & 64) == 0)) | z4, (!((i2 & 128) == 0)) | z5);
    }

    /* renamed from: ripple-wH6b6FI, reason: not valid java name */
    public static final /* synthetic */ IndicationNodeFactory m5417ripplewH6b6FI(ColorProducer colorProducer, boolean z, float f2) {
        return m5415rippleTN_CM5M(colorProducer, z, f2, null, true, true, true, true);
    }

    /* renamed from: ripple-wH6b6FI$default, reason: not valid java name */
    public static /* synthetic */ IndicationNodeFactory m5418ripplewH6b6FI$default(ColorProducer colorProducer, boolean z, float f2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f2 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        return m5417ripplewH6b6FI(colorProducer, z | (!((i2 & 2) == 0)), f2);
    }
}
