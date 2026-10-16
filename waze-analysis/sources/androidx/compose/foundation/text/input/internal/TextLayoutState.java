package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.a;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextLayoutState implements HeightForSingleLineFieldProvider {
    public static final int $stable = 8;
    private final BringIntoViewRequester bringIntoViewRequester;
    private final MutableState coreNodeCoordinates$delegate;
    private final MutableState decoratorNodeCoordinates$delegate;
    private final MutableState heightForSingleLineField$delegate;
    private TextFieldLayoutStateCache layoutCache;
    private final TextFieldLayoutStateCache layoutResult$delegate;
    private p<? super Density, ? super a<TextLayoutResult>, ab> onTextLayout;
    private final MutableState textLayoutNodeCoordinates$delegate;

    public TextLayoutState() {
        TextFieldLayoutStateCache textFieldLayoutStateCache = new TextFieldLayoutStateCache();
        this.layoutCache = textFieldLayoutStateCache;
        this.layoutResult$delegate = textFieldLayoutStateCache;
        this.textLayoutNodeCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.coreNodeCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.decoratorNodeCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.heightForSingleLineField$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m11162boximpl(0.0f), null, 2, null);
        this.bringIntoViewRequester = BringIntoViewRequesterKt.BringIntoViewRequester();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLayoutResult layoutWithNewMeasureInputs__hBUhpc$lambda$0$0(TextLayoutState textLayoutState) {
        return textLayoutState.layoutCache.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U$foundation, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m3686coercedInVisibleBoundsOfInputTextMKHz9U$foundation(long r5) {
        /*
            r4 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r4.getTextLayoutNodeCoordinates()
            if (r0 == 0) goto L22
            boolean r1 = r0.isAttached()
            if (r1 == 0) goto L1a
            androidx.compose.ui.layout.LayoutCoordinates r4 = r4.getDecoratorNodeCoordinates()
            r1 = 0
            if (r4 == 0) goto L20
            r2 = 0
            r3 = 2
            androidx.compose.ui.geometry.Rect r1 = androidx.compose.ui.layout.LayoutCoordinates.CC.localBoundingBoxOf$default(r4, r0, r2, r3, r1)
            goto L20
        L1a:
            androidx.compose.ui.geometry.Rect$Companion r4 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r1 = r4.getZero()
        L20:
            if (r1 != 0) goto L28
        L22:
            androidx.compose.ui.geometry.Rect$Companion r4 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r1 = r4.getZero()
        L28:
            long r4 = androidx.compose.foundation.text.input.internal.TextLayoutStateKt.m3691coerceIn3MmeM6k(r5, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextLayoutState.m3686coercedInVisibleBoundsOfInputTextMKHz9U$foundation(long):long");
    }

    public final BringIntoViewRequester getBringIntoViewRequester() {
        return this.bringIntoViewRequester;
    }

    public final LayoutCoordinates getCoreNodeCoordinates() {
        return (LayoutCoordinates) this.coreNodeCoordinates$delegate.getValue();
    }

    public final LayoutCoordinates getDecoratorNodeCoordinates() {
        return (LayoutCoordinates) this.decoratorNodeCoordinates$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.text.input.internal.HeightForSingleLineFieldProvider
    /* renamed from: getHeightForSingleLineField-D9Ej5fM */
    public float mo3341getHeightForSingleLineFieldD9Ej5fM() {
        return ((Dp) this.heightForSingleLineField$delegate.getValue()).m11178unboximpl();
    }

    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult$delegate.getValue();
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public final int m3687getOffsetForPosition3MmeM6k(long j2, boolean z) {
        TextLayoutResult layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return -1;
        }
        if (z) {
            j2 = m3686coercedInVisibleBoundsOfInputTextMKHz9U$foundation(j2);
        }
        return layoutResult.m10516getOffsetForPositionk4lQ0M(TextLayoutStateKt.m3692fromDecorationToTextLayoutUv8p0NA(this, j2));
    }

    public final p<Density, a<TextLayoutResult>, ab> getOnTextLayout() {
        return this.onTextLayout;
    }

    public final LayoutCoordinates getTextLayoutNodeCoordinates() {
        return (LayoutCoordinates) this.textLayoutNodeCoordinates$delegate.getValue();
    }

    /* renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m3688isPositionOnTextk4lQ0M(long j2) {
        TextLayoutResult layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return false;
        }
        long jM3692fromDecorationToTextLayoutUv8p0NA = TextLayoutStateKt.m3692fromDecorationToTextLayoutUv8p0NA(this, m3686coercedInVisibleBoundsOfInputTextMKHz9U$foundation(j2));
        int lineForVerticalPosition = layoutResult.getLineForVerticalPosition(Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & jM3692fromDecorationToTextLayoutUv8p0NA)));
        int i2 = (int) (jM3692fromDecorationToTextLayoutUv8p0NA >> 32);
        return Float.intBitsToFloat(i2) >= layoutResult.getLineLeft(lineForVerticalPosition) && Float.intBitsToFloat(i2) <= layoutResult.getLineRight(lineForVerticalPosition);
    }

    /* renamed from: layoutWithNewMeasureInputs--hBUhpc, reason: not valid java name */
    public final TextLayoutResult m3689layoutWithNewMeasureInputshBUhpc(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2) {
        TextLayoutResult textLayoutResultM3679layoutWithNewMeasureInputshBUhpc = this.layoutCache.m3679layoutWithNewMeasureInputshBUhpc(density, layoutDirection, resolver, j2);
        p<? super Density, ? super a<TextLayoutResult>, ab> pVar = this.onTextLayout;
        if (pVar != null) {
            pVar.invoke(density, new a() { // from class: androidx.compose.foundation.text.input.internal.TextLayoutState$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return TextLayoutState.layoutWithNewMeasureInputs__hBUhpc$lambda$0$0(this.f$0);
                }
            });
        }
        return textLayoutResultM3679layoutWithNewMeasureInputshBUhpc;
    }

    public final void setCoreNodeCoordinates(LayoutCoordinates layoutCoordinates) {
        this.coreNodeCoordinates$delegate.setValue(layoutCoordinates);
    }

    public final void setDecoratorNodeCoordinates(LayoutCoordinates layoutCoordinates) {
        this.decoratorNodeCoordinates$delegate.setValue(layoutCoordinates);
    }

    /* renamed from: setHeightForSingleLineField-0680j_4, reason: not valid java name */
    public void m3690setHeightForSingleLineField0680j_4(float f2) {
        this.heightForSingleLineField$delegate.setValue(Dp.m11162boximpl(f2));
    }

    public final void setOnTextLayout(p<? super Density, ? super a<TextLayoutResult>, ab> pVar) {
        this.onTextLayout = pVar;
    }

    public final void setTextLayoutNodeCoordinates(LayoutCoordinates layoutCoordinates) {
        this.textLayoutNodeCoordinates$delegate.setValue(layoutCoordinates);
    }

    public final void updateNonMeasureInputs(TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z, boolean z2, KeyboardOptions keyboardOptions) {
        this.layoutCache.updateNonMeasureInputs(transformedTextFieldState, textStyle, z, z2, keyboardOptions);
    }
}
