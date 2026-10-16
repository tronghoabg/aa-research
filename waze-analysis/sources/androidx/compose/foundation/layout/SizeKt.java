package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SizeKt {
    private static final FillElement FillWholeMaxWidth = FillElement.Companion.width(1.0f);
    private static final FillElement FillWholeMaxHeight = FillElement.Companion.height(1.0f);
    private static final FillElement FillWholeMaxSize = FillElement.Companion.size(1.0f);
    private static final WrapContentElement WrapContentWidthCenter = WrapContentElement.Companion.width(Alignment.Companion.getCenterHorizontally(), false);
    private static final WrapContentElement WrapContentWidthStart = WrapContentElement.Companion.width(Alignment.Companion.getStart(), false);
    private static final WrapContentElement WrapContentHeightCenter = WrapContentElement.Companion.height(Alignment.Companion.getCenterVertically(), false);
    private static final WrapContentElement WrapContentHeightTop = WrapContentElement.Companion.height(Alignment.Companion.getTop(), false);
    private static final WrapContentElement WrapContentSizeCenter = WrapContentElement.Companion.size(Alignment.Companion.getCenter(), false);
    private static final WrapContentElement WrapContentSizeTopStart = WrapContentElement.Companion.size(Alignment.Companion.getTopStart(), false);

    /* renamed from: defaultMinSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m2806defaultMinSizeVpY3zN4(Modifier modifier, float f2, float f3) {
        return modifier.then(new UnspecifiedConstraintsElement(f2, f3, null));
    }

    /* renamed from: defaultMinSize-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2807defaultMinSizeVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        return m2806defaultMinSizeVpY3zN4(modifier, f2, f3);
    }

    public static final Modifier fillMaxHeight(Modifier modifier, float f2) {
        return modifier.then(f2 == 1.0f ? FillWholeMaxHeight : FillElement.Companion.height(f2));
    }

    public static /* synthetic */ Modifier fillMaxHeight$default(Modifier modifier, float f2, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            f2 = 1.0f;
        }
        return fillMaxHeight(modifier, f2);
    }

    public static final Modifier fillMaxSize(Modifier modifier, float f2) {
        return modifier.then(f2 == 1.0f ? FillWholeMaxSize : FillElement.Companion.size(f2));
    }

    public static /* synthetic */ Modifier fillMaxSize$default(Modifier modifier, float f2, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            f2 = 1.0f;
        }
        return fillMaxSize(modifier, f2);
    }

    public static final Modifier fillMaxWidth(Modifier modifier, float f2) {
        return modifier.then(f2 == 1.0f ? FillWholeMaxWidth : FillElement.Companion.width(f2));
    }

    public static /* synthetic */ Modifier fillMaxWidth$default(Modifier modifier, float f2, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            f2 = 1.0f;
        }
        return fillMaxWidth(modifier, f2);
    }

    /* renamed from: height-3ABfNKs, reason: not valid java name */
    public static final Modifier m2808height3ABfNKs(Modifier modifier, float f2) {
        return modifier.then(new SizeElement(0.0f, f2, 0.0f, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$height3ABfNKs$$inlined$debugInspectorInfo$1(f2) : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: heightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m2809heightInVpY3zN4(Modifier modifier, float f2, float f3) {
        return modifier.then(new SizeElement(0.0f, f2, 0.0f, f3, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$heightInVpY3zN4$$inlined$debugInspectorInfo$1(f2, f3) : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: heightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2810heightInVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        return m2809heightInVpY3zN4(modifier, f2, f3);
    }

    /* renamed from: requiredHeight-3ABfNKs, reason: not valid java name */
    public static final Modifier m2811requiredHeight3ABfNKs(Modifier modifier, float f2) {
        return modifier.then(new SizeElement(0.0f, f2, 0.0f, f2, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredHeight3ABfNKs$$inlined$debugInspectorInfo$1(f2) : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredHeightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m2812requiredHeightInVpY3zN4(Modifier modifier, float f2, float f3) {
        return modifier.then(new SizeElement(0.0f, f2, 0.0f, f3, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredHeightInVpY3zN4$$inlined$debugInspectorInfo$1(f2, f3) : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredHeightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2813requiredHeightInVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        return m2812requiredHeightInVpY3zN4(modifier, f2, f3);
    }

    /* renamed from: requiredSize-3ABfNKs, reason: not valid java name */
    public static final Modifier m2814requiredSize3ABfNKs(Modifier modifier, float f2) {
        return modifier.then(new SizeElement(f2, f2, f2, f2, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredSize3ABfNKs$$inlined$debugInspectorInfo$1(f2) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSize-6HolHcs, reason: not valid java name */
    public static final Modifier m2815requiredSize6HolHcs(Modifier modifier, long j2) {
        return m2816requiredSizeVpY3zN4(modifier, DpSize.m11262getWidthD9Ej5fM(j2), DpSize.m11260getHeightD9Ej5fM(j2));
    }

    /* renamed from: requiredSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m2816requiredSizeVpY3zN4(Modifier modifier, float f2, float f3) {
        return modifier.then(new SizeElement(f2, f3, f2, f3, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredSizeVpY3zN4$$inlined$debugInspectorInfo$1(f2, f3) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m2817requiredSizeInqDBjuR0(Modifier modifier, float f2, float f3, float f4, float f5) {
        return modifier.then(new SizeElement(f2, f3, f4, f5, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredSizeInqDBjuR0$$inlined$debugInspectorInfo$1(f2, f3, f4, f5) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2818requiredSizeInqDBjuR0$default(Modifier modifier, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f4 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        return m2817requiredSizeInqDBjuR0(modifier, f2, f3, f4, f5);
    }

    /* renamed from: requiredWidth-3ABfNKs, reason: not valid java name */
    public static final Modifier m2819requiredWidth3ABfNKs(Modifier modifier, float f2) {
        return modifier.then(new SizeElement(f2, 0.0f, f2, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredWidth3ABfNKs$$inlined$debugInspectorInfo$1(f2) : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: requiredWidthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m2820requiredWidthInVpY3zN4(Modifier modifier, float f2, float f3) {
        return modifier.then(new SizeElement(f2, 0.0f, f3, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredWidthInVpY3zN4$$inlined$debugInspectorInfo$1(f2, f3) : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: requiredWidthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2821requiredWidthInVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        return m2820requiredWidthInVpY3zN4(modifier, f2, f3);
    }

    /* renamed from: size-3ABfNKs, reason: not valid java name */
    public static final Modifier m2822size3ABfNKs(Modifier modifier, float f2) {
        return modifier.then(new SizeElement(f2, f2, f2, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$size3ABfNKs$$inlined$debugInspectorInfo$1(f2) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: size-6HolHcs, reason: not valid java name */
    public static final Modifier m2823size6HolHcs(Modifier modifier, long j2) {
        return m2824sizeVpY3zN4(modifier, DpSize.m11262getWidthD9Ej5fM(j2), DpSize.m11260getHeightD9Ej5fM(j2));
    }

    /* renamed from: size-VpY3zN4, reason: not valid java name */
    public static final Modifier m2824sizeVpY3zN4(Modifier modifier, float f2, float f3) {
        return modifier.then(new SizeElement(f2, f3, f2, f3, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$sizeVpY3zN4$$inlined$debugInspectorInfo$1(f2, f3) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: sizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m2825sizeInqDBjuR0(Modifier modifier, float f2, float f3, float f4, float f5) {
        return modifier.then(new SizeElement(f2, f3, f4, f5, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$sizeInqDBjuR0$$inlined$debugInspectorInfo$1(f2, f3, f4, f5) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: sizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2826sizeInqDBjuR0$default(Modifier modifier, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f4 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        return m2825sizeInqDBjuR0(modifier, f2, f3, f4, f5);
    }

    /* renamed from: width-3ABfNKs, reason: not valid java name */
    public static final Modifier m2827width3ABfNKs(Modifier modifier, float f2) {
        return modifier.then(new SizeElement(f2, 0.0f, f2, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$width3ABfNKs$$inlined$debugInspectorInfo$1(f2) : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: widthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m2828widthInVpY3zN4(Modifier modifier, float f2, float f3) {
        return modifier.then(new SizeElement(f2, 0.0f, f3, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$widthInVpY3zN4$$inlined$debugInspectorInfo$1(f2, f3) : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: widthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2829widthInVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        return m2828widthInVpY3zN4(modifier, f2, f3);
    }

    public static final Modifier wrapContentHeight(Modifier modifier, Alignment.Vertical vertical, boolean z) {
        return modifier.then((!x.n(vertical, Alignment.Companion.getCenterVertically()) || z) ? (!x.n(vertical, Alignment.Companion.getTop()) || z) ? WrapContentElement.Companion.height(vertical, z) : WrapContentHeightTop : WrapContentHeightCenter);
    }

    public static /* synthetic */ Modifier wrapContentHeight$default(Modifier modifier, Alignment.Vertical vertical, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            vertical = Alignment.Companion.getCenterVertically();
        }
        return wrapContentHeight(modifier, vertical, z & ((i2 & 2) == 0));
    }

    public static final Modifier wrapContentSize(Modifier modifier, Alignment alignment, boolean z) {
        return modifier.then((!x.n(alignment, Alignment.Companion.getCenter()) || z) ? (!x.n(alignment, Alignment.Companion.getTopStart()) || z) ? WrapContentElement.Companion.size(alignment, z) : WrapContentSizeTopStart : WrapContentSizeCenter);
    }

    public static /* synthetic */ Modifier wrapContentSize$default(Modifier modifier, Alignment alignment, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        return wrapContentSize(modifier, alignment, z & ((i2 & 2) == 0));
    }

    public static final Modifier wrapContentWidth(Modifier modifier, Alignment.Horizontal horizontal, boolean z) {
        return modifier.then((!x.n(horizontal, Alignment.Companion.getCenterHorizontally()) || z) ? (!x.n(horizontal, Alignment.Companion.getStart()) || z) ? WrapContentElement.Companion.width(horizontal, z) : WrapContentWidthStart : WrapContentWidthCenter);
    }

    public static /* synthetic */ Modifier wrapContentWidth$default(Modifier modifier, Alignment.Horizontal horizontal, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            horizontal = Alignment.Companion.getCenterHorizontally();
        }
        return wrapContentWidth(modifier, horizontal, z & ((i2 & 2) == 0));
    }
}
