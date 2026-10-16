package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OffsetKt {
    public static final Modifier absoluteOffset(Modifier modifier, final l<? super Density, IntOffset> lVar) {
        return modifier.then(new OffsetPxElement(lVar, false, new l() { // from class: androidx.compose.foundation.layout.OffsetKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return OffsetKt.absoluteOffset$lambda$0(lVar, (InspectorInfo) obj);
            }
        }));
    }

    static final ab absoluteOffset$lambda$0(l lVar, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("absoluteOffset");
        inspectorInfo.getProperties().set(TypedValues.CycleType.S_WAVE_OFFSET, lVar);
        return ab.f48028a;
    }

    /* renamed from: absoluteOffset-VpY3zN4, reason: not valid java name */
    public static final Modifier m2712absoluteOffsetVpY3zN4(Modifier modifier, final float f2, final float f3) {
        return modifier.then(new OffsetElement(f2, f3, false, new l() { // from class: androidx.compose.foundation.layout.OffsetKt$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return OffsetKt.absoluteOffset_VpY3zN4$lambda$0(f2, f3, (InspectorInfo) obj);
            }
        }, null));
    }

    /* renamed from: absoluteOffset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2713absoluteOffsetVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        return m2712absoluteOffsetVpY3zN4(modifier, f2, f3);
    }

    static final ab absoluteOffset_VpY3zN4$lambda$0(float f2, float f3, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("absoluteOffset");
        inspectorInfo.getProperties().set("x", Dp.m11162boximpl(f2));
        inspectorInfo.getProperties().set("y", Dp.m11162boximpl(f3));
        return ab.f48028a;
    }

    public static final Modifier offset(Modifier modifier, final l<? super Density, IntOffset> lVar) {
        return modifier.then(new OffsetPxElement(lVar, true, new l() { // from class: androidx.compose.foundation.layout.OffsetKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return OffsetKt.offset$lambda$0(lVar, (InspectorInfo) obj);
            }
        }));
    }

    static final ab offset$lambda$0(l lVar, InspectorInfo inspectorInfo) {
        inspectorInfo.setName(TypedValues.CycleType.S_WAVE_OFFSET);
        inspectorInfo.getProperties().set(TypedValues.CycleType.S_WAVE_OFFSET, lVar);
        return ab.f48028a;
    }

    /* renamed from: offset-VpY3zN4, reason: not valid java name */
    public static final Modifier m2714offsetVpY3zN4(Modifier modifier, final float f2, final float f3) {
        return modifier.then(new OffsetElement(f2, f3, true, new l() { // from class: androidx.compose.foundation.layout.OffsetKt$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return OffsetKt.offset_VpY3zN4$lambda$0(f2, f3, (InspectorInfo) obj);
            }
        }, null));
    }

    /* renamed from: offset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2715offsetVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        return m2714offsetVpY3zN4(modifier, f2, f3);
    }

    static final ab offset_VpY3zN4$lambda$0(float f2, float f3, InspectorInfo inspectorInfo) {
        inspectorInfo.setName(TypedValues.CycleType.S_WAVE_OFFSET);
        inspectorInfo.getProperties().set("x", Dp.m11162boximpl(f2));
        inspectorInfo.getProperties().set("y", Dp.m11162boximpl(f3));
        return ab.f48028a;
    }
}
