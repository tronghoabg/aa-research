package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MaintainWindowPositionPopupPositionProvider implements PopupPositionProvider {
    private final PopupPositionProvider popupPositionProvider;
    private LayoutDirection previousLayoutDirection;
    private IntSize previousPopupContentSize;
    private IntOffset previousPosition;
    private IntSize previousWindowSize;

    public MaintainWindowPositionPopupPositionProvider(PopupPositionProvider popupPositionProvider) {
        this.popupPositionProvider = popupPositionProvider;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo2094calculatePositionllwVHH4(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        IntSize intSize;
        IntSize intSize2;
        IntOffset intOffset = this.previousPosition;
        if (intOffset != null && (intSize = this.previousWindowSize) != null && IntSize.m11337equalsimpl0(intSize.m11343unboximpl(), j2) && this.previousLayoutDirection == layoutDirection && (intSize2 = this.previousPopupContentSize) != null && IntSize.m11337equalsimpl0(intSize2.m11343unboximpl(), j3)) {
            return intOffset.m11305unboximpl();
        }
        long jMo2094calculatePositionllwVHH4 = this.popupPositionProvider.mo2094calculatePositionllwVHH4(intRect, j2, layoutDirection, j3);
        this.previousWindowSize = IntSize.m11331boximpl(j2);
        this.previousLayoutDirection = layoutDirection;
        this.previousPopupContentSize = IntSize.m11331boximpl(j3);
        this.previousPosition = IntOffset.m11287boximpl(jMo2094calculatePositionllwVHH4);
        return jMo2094calculatePositionllwVHH4;
    }

    public final PopupPositionProvider getPopupPositionProvider() {
        return this.popupPositionProvider;
    }

    public final LayoutDirection getPreviousLayoutDirection() {
        return this.previousLayoutDirection;
    }

    /* renamed from: getPreviousPopupContentSize-bOM6tXw, reason: not valid java name */
    public final IntSize m3440getPreviousPopupContentSizebOM6tXw() {
        return this.previousPopupContentSize;
    }

    /* renamed from: getPreviousPosition-JyOPPKE, reason: not valid java name */
    public final IntOffset m3441getPreviousPositionJyOPPKE() {
        return this.previousPosition;
    }

    /* renamed from: getPreviousWindowSize-bOM6tXw, reason: not valid java name */
    public final IntSize m3442getPreviousWindowSizebOM6tXw() {
        return this.previousWindowSize;
    }

    public final void setPreviousLayoutDirection(LayoutDirection layoutDirection) {
        this.previousLayoutDirection = layoutDirection;
    }

    /* renamed from: setPreviousPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m3443setPreviousPopupContentSizefhxjrPA(IntSize intSize) {
        this.previousPopupContentSize = intSize;
    }

    /* renamed from: setPreviousPosition-fg0MpWk, reason: not valid java name */
    public final void m3444setPreviousPositionfg0MpWk(IntOffset intOffset) {
        this.previousPosition = intOffset;
    }

    /* renamed from: setPreviousWindowSize-fhxjrPA, reason: not valid java name */
    public final void m3445setPreviousWindowSizefhxjrPA(IntSize intSize) {
        this.previousWindowSize = intSize;
    }
}
