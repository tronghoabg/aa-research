package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnPlacedModifierKt;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.state.WidgetFrame;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;

/* compiled from: WazeSource */
@LayoutScopeMarker
/* loaded from: classes3.dex */
public final class MotionLayoutScope {
    public static final int $stable = 8;
    private final MotionMeasurer measurer;
    private final MutableFloatState motionProgress;

    /* compiled from: WazeSource */
    public final class CustomProperties {
        private final String id;

        public CustomProperties(String str) {
            this.id = str;
        }

        /* renamed from: color-vNxB06k, reason: not valid java name */
        public final long m11590colorvNxB06k(String str) {
            MotionLayoutScope motionLayoutScope = MotionLayoutScope.this;
            return motionLayoutScope.measurer.m11605getCustomColorXeAY9LY(this.id, str, motionLayoutScope.motionProgress.getFloatValue());
        }

        /* renamed from: distance-u2uoSUM, reason: not valid java name */
        public final float m11591distanceu2uoSUM(String str) {
            MotionLayoutScope motionLayoutScope = MotionLayoutScope.this;
            return motionLayoutScope.measurer.getCustomFloat(this.id, str, motionLayoutScope.motionProgress.getFloatValue());
        }

        /* renamed from: float, reason: not valid java name */
        public final float m11592float(String str) {
            MotionLayoutScope motionLayoutScope = MotionLayoutScope.this;
            return motionLayoutScope.measurer.getCustomFloat(this.id, str, motionLayoutScope.motionProgress.getFloatValue());
        }

        /* renamed from: fontSize-kPz2Gy4, reason: not valid java name */
        public final long m11593fontSizekPz2Gy4(String str) {
            MotionLayoutScope motionLayoutScope = MotionLayoutScope.this;
            return TextUnitKt.getSp(motionLayoutScope.measurer.getCustomFloat(this.id, str, motionLayoutScope.motionProgress.getFloatValue()));
        }

        /* renamed from: int, reason: not valid java name */
        public final int m11594int(String str) {
            MotionLayoutScope motionLayoutScope = MotionLayoutScope.this;
            return (int) motionLayoutScope.measurer.getCustomFloat(this.id, str, motionLayoutScope.motionProgress.getFloatValue());
        }
    }

    /* compiled from: WazeSource */
    public final class MotionProperties {
        private String myId;
        private String myTag;

        public MotionProperties(String str, String str2) {
            this.myId = str;
            this.myTag = str2;
        }

        /* renamed from: color-vNxB06k, reason: not valid java name */
        public final long m11595colorvNxB06k(String str) {
            MotionLayoutScope motionLayoutScope = MotionLayoutScope.this;
            return motionLayoutScope.measurer.m11605getCustomColorXeAY9LY(this.myId, str, motionLayoutScope.motionProgress.getFloatValue());
        }

        /* renamed from: distance-u2uoSUM, reason: not valid java name */
        public final float m11596distanceu2uoSUM(String str) {
            MotionLayoutScope motionLayoutScope = MotionLayoutScope.this;
            return motionLayoutScope.measurer.getCustomFloat(this.myId, str, motionLayoutScope.motionProgress.getFloatValue());
        }

        /* renamed from: float, reason: not valid java name */
        public final float m11597float(String str) {
            MotionLayoutScope motionLayoutScope = MotionLayoutScope.this;
            return motionLayoutScope.measurer.getCustomFloat(this.myId, str, motionLayoutScope.motionProgress.getFloatValue());
        }

        /* renamed from: fontSize-kPz2Gy4, reason: not valid java name */
        public final long m11598fontSizekPz2Gy4(String str) {
            MotionLayoutScope motionLayoutScope = MotionLayoutScope.this;
            return TextUnitKt.getSp(motionLayoutScope.measurer.getCustomFloat(this.myId, str, motionLayoutScope.motionProgress.getFloatValue()));
        }

        public final String id() {
            return this.myId;
        }

        /* renamed from: int, reason: not valid java name */
        public final int m11599int(String str) {
            MotionLayoutScope motionLayoutScope = MotionLayoutScope.this;
            return (int) motionLayoutScope.measurer.getCustomFloat(this.myId, str, motionLayoutScope.motionProgress.getFloatValue());
        }

        public final String tag() {
            return this.myTag;
        }
    }

    public MotionLayoutScope(MotionMeasurer motionMeasurer, MutableFloatState mutableFloatState) {
        this.measurer = motionMeasurer;
        this.motionProgress = mutableFloatState;
    }

    static final Modifier onStartEndBoundsChanged$lambda$1(Object obj, final MotionLayoutScope motionLayoutScope, final p pVar, Modifier modifier, Composer composer, int i2) {
        composer.startReplaceGroup(-1096247907);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1096247907, i2, -1, "androidx.constraintlayout.compose.MotionLayoutScope.onStartEndBoundsChanged.<anonymous> (MotionLayout.kt:714)");
        }
        boolean zChanged = composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = obj.toString();
            composer.updateRememberedValue(objRememberedValue);
        }
        final String str = (String) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        Object obj2 = objRememberedValue2;
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            int[] iArr = new int[4];
            for (int i3 = 0; i3 < 4; i3++) {
                iArr[i3] = 0;
            }
            composer.updateRememberedValue(iArr);
            obj2 = iArr;
        }
        final int[] iArr2 = (int[]) obj2;
        Object objRememberedValue3 = composer.rememberedValue();
        Object obj3 = objRememberedValue3;
        if (objRememberedValue3 == Composer.Companion.getEmpty()) {
            Ref ref = new Ref();
            ref.setValue(Rect.Companion.getZero());
            composer.updateRememberedValue(ref);
            obj3 = ref;
        }
        final Ref ref2 = (Ref) obj3;
        Object objRememberedValue4 = composer.rememberedValue();
        Object obj4 = objRememberedValue4;
        if (objRememberedValue4 == Composer.Companion.getEmpty()) {
            int[] iArr3 = new int[4];
            for (int i4 = 0; i4 < 4; i4++) {
                iArr3[i4] = 0;
            }
            composer.updateRememberedValue(iArr3);
            obj4 = iArr3;
        }
        final int[] iArr4 = (int[]) obj4;
        Object objRememberedValue5 = composer.rememberedValue();
        Object obj5 = objRememberedValue5;
        if (objRememberedValue5 == Composer.Companion.getEmpty()) {
            Ref ref3 = new Ref();
            ref3.setValue(Rect.Companion.getZero());
            composer.updateRememberedValue(ref3);
            obj5 = ref3;
        }
        final Ref ref4 = (Ref) obj5;
        boolean zChangedInstance = composer.changedInstance(motionLayoutScope) | composer.changed(str) | composer.changedInstance(iArr2) | composer.changedInstance(ref2) | composer.changedInstance(iArr4) | composer.changedInstance(ref4) | composer.changed(pVar);
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue6 == Composer.Companion.getEmpty()) {
            Object obj6 = new l() { // from class: androidx.constraintlayout.compose.MotionLayoutScope$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj7) {
                    return MotionLayoutScope.onStartEndBoundsChanged$lambda$1$5$0(this.f$0, str, iArr2, ref2, iArr4, ref4, pVar, (LayoutCoordinates) obj7);
                }
            };
            composer.updateRememberedValue(obj6);
            objRememberedValue6 = obj6;
        }
        Modifier modifierOnPlaced = OnPlacedModifierKt.onPlaced(modifier, (l) objRememberedValue6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierOnPlaced;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab onStartEndBoundsChanged$lambda$1$5$0(MotionLayoutScope motionLayoutScope, String str, int[] iArr, Ref ref, int[] iArr2, Ref ref2, p pVar, LayoutCoordinates layoutCoordinates) {
        boolean z;
        WidgetFrame start = motionLayoutScope.measurer.getTransition().getStart(str);
        int i2 = start.left;
        if (i2 == iArr[0] && start.top == iArr[1] && start.right == iArr[2] && start.bottom == iArr[3]) {
            z = false;
        } else {
            iArr[0] = i2;
            iArr[1] = start.top;
            iArr[2] = start.right;
            int i3 = start.bottom;
            iArr[3] = i3;
            ref.setValue(new Rect(iArr[0], iArr[1], iArr[2], i3));
            z = true;
        }
        WidgetFrame end = motionLayoutScope.measurer.getTransition().getEnd(str);
        int i4 = end.left;
        if (i4 == iArr2[0] && end.top == iArr2[1] && end.right == iArr2[2] && end.bottom == iArr2[3]) {
            if (z) {
            }
            return ab.f48028a;
        }
        iArr2[0] = i4;
        iArr2[1] = end.top;
        iArr2[2] = end.right;
        int i5 = end.bottom;
        iArr2[3] = i5;
        ref2.setValue(new Rect(iArr2[0], iArr2[1], iArr2[2], i5));
        Rect zero = (Rect) ref.getValue();
        if (zero == null) {
            zero = Rect.Companion.getZero();
        }
        Rect zero2 = (Rect) ref2.getValue();
        if (zero2 == null) {
            zero2 = Rect.Companion.getZero();
        }
        pVar.invoke(zero, zero2);
        return ab.f48028a;
    }

    /* renamed from: customColor-WaAFU9c, reason: not valid java name */
    public final long m11584customColorWaAFU9c(String str, String str2) {
        return this.measurer.m11605getCustomColorXeAY9LY(str, str2, this.motionProgress.getFloatValue());
    }

    /* renamed from: customDistance-chRvn1I, reason: not valid java name */
    public final float m11585customDistancechRvn1I(String str, String str2) {
        return this.measurer.getCustomFloat(str, str2, this.motionProgress.getFloatValue());
    }

    public final float customFloat(String str, String str2) {
        return this.measurer.getCustomFloat(str, str2, this.motionProgress.getFloatValue());
    }

    /* renamed from: customFontSize-5XXgJZs, reason: not valid java name */
    public final long m11586customFontSize5XXgJZs(String str, String str2) {
        return TextUnitKt.getSp(this.measurer.getCustomFloat(str, str2, this.motionProgress.getFloatValue()));
    }

    public final int customInt(String str, String str2) {
        return (int) this.measurer.getCustomFloat(str, str2, this.motionProgress.getFloatValue());
    }

    public final CustomProperties customProperties(String str) {
        return new CustomProperties(str);
    }

    /* renamed from: motionColor-WaAFU9c, reason: not valid java name */
    public final long m11587motionColorWaAFU9c(String str, String str2) {
        return this.measurer.m11605getCustomColorXeAY9LY(str, str2, this.motionProgress.getFloatValue());
    }

    /* renamed from: motionDistance-chRvn1I, reason: not valid java name */
    public final float m11588motionDistancechRvn1I(String str, String str2) {
        return this.measurer.getCustomFloat(str, str2, this.motionProgress.getFloatValue());
    }

    public final float motionFloat(String str, String str2) {
        return this.measurer.getCustomFloat(str, str2, this.motionProgress.getFloatValue());
    }

    /* renamed from: motionFontSize-5XXgJZs, reason: not valid java name */
    public final long m11589motionFontSize5XXgJZs(String str, String str2) {
        return TextUnitKt.getSp(this.measurer.getCustomFloat(str, str2, this.motionProgress.getFloatValue()));
    }

    public final int motionInt(String str, String str2) {
        return (int) this.measurer.getCustomFloat(str, str2, this.motionProgress.getFloatValue());
    }

    public final androidx.compose.runtime.State<MotionProperties> motionProperties(String str, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1417298021, i2, -1, "androidx.constraintlayout.compose.MotionLayoutScope.motionProperties (MotionLayout.kt:873)");
        }
        boolean z = true;
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(str)) && (i2 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new MotionProperties(str, null), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    public final Modifier onStartEndBoundsChanged(Modifier modifier, final Object obj, final p<? super Rect, ? super Rect, ab> pVar) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new MotionLayoutScope$onStartEndBoundsChanged$$inlined$debugInspectorInfo$1(obj, pVar) : InspectableValueKt.getNoInspectorInfo(), new q() { // from class: androidx.constraintlayout.compose.MotionLayoutScope$$ExternalSyntheticLambda1
            @Override // h.g.a.q
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return MotionLayoutScope.onStartEndBoundsChanged$lambda$1(obj, this, pVar, (Modifier) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        });
    }

    public final MotionProperties motionProperties(String str, String str2) {
        return new MotionProperties(str, str2);
    }
}
