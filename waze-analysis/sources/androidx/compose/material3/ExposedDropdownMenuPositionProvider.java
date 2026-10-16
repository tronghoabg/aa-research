package androidx.compose.material3;

import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.media3.muxer.MuxerUtil;
import h.a.i;
import h.ab;
import h.g.a.p;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ExposedDropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final MenuPosition.Vertical bottomToAnchorTop;
    private final MenuPosition.Vertical bottomToWindowBottom;
    private final Density density;
    private final MenuPosition.Horizontal endToAnchorEnd;
    private final State<ab> keyboardSignalState;
    private final MenuPosition.Horizontal leftToWindowLeft;
    private final p<IntRect, IntRect, ab> onPositionCalculated;
    private final MenuPosition.Horizontal rightToWindowRight;
    private final MenuPosition.Horizontal startToAnchorStart;
    private final MenuPosition.Vertical topToAnchorBottom;
    private final MenuPosition.Vertical topToWindowTop;
    private final int topWindowInsets;
    private final int verticalMargin;

    /* JADX WARN: Multi-variable type inference failed */
    public ExposedDropdownMenuPositionProvider(Density density, int i2, State<ab> state, int i3, p<? super IntRect, ? super IntRect, ab> pVar) {
        this.density = density;
        this.topWindowInsets = i2;
        this.keyboardSignalState = state;
        this.verticalMargin = i3;
        this.onPositionCalculated = pVar;
        this.startToAnchorStart = MenuPosition.startToAnchorStart$default(MenuPosition.INSTANCE, 0, 1, null);
        this.endToAnchorEnd = MenuPosition.endToAnchorEnd$default(MenuPosition.INSTANCE, 0, 1, null);
        this.leftToWindowLeft = MenuPosition.leftToWindowLeft$default(MenuPosition.INSTANCE, 0, 1, null);
        this.rightToWindowRight = MenuPosition.rightToWindowRight$default(MenuPosition.INSTANCE, 0, 1, null);
        this.topToAnchorBottom = MenuPosition.topToAnchorBottom$default(MenuPosition.INSTANCE, 0, 1, null);
        this.bottomToAnchorTop = MenuPosition.bottomToAnchorTop$default(MenuPosition.INSTANCE, 0, 1, null);
        this.topToWindowTop = MenuPosition.INSTANCE.topToWindowTop(i3);
        this.bottomToWindowBottom = MenuPosition.INSTANCE.bottomToWindowBottom(i3);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo2094calculatePositionllwVHH4(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        IntRect intRect2;
        char c2;
        long j4;
        int iMo6179position95KtPRI;
        State<ab> state = this.keyboardSignalState;
        if (state != null) {
            state.getValue();
        }
        char c3 = ' ';
        long j5 = MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        long j6 = j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        int i2 = this.topWindowInsets;
        MenuPosition.Horizontal[] horizontalArr = new MenuPosition.Horizontal[3];
        int i3 = 0;
        horizontalArr[0] = this.startToAnchorStart;
        horizontalArr[1] = this.endToAnchorEnd;
        int iM11296getXimpl = IntOffset.m11296getXimpl(intRect.m11320getCenternOccac());
        long j7 = ((((int) j6) + i2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (((int) (j2 >> 32)) << 32);
        int i4 = (int) (j7 >> 32);
        horizontalArr[2] = iM11296getXimpl < i4 / 2 ? this.leftToWindowLeft : this.rightToWindowRight;
        List listI = i.i(horizontalArr);
        int size = listI.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                intRect2 = intRect;
                c2 = c3;
                j4 = j5;
                iMo6179position95KtPRI = 0;
                break;
            }
            c2 = c3;
            j4 = j5;
            int i6 = (int) (j3 >> c2);
            int i7 = size;
            int i8 = i5;
            intRect2 = intRect;
            int i9 = i4;
            iMo6179position95KtPRI = ((MenuPosition.Horizontal) listI.get(i5)).mo6179position95KtPRI(intRect2, j7, i6, layoutDirection);
            if (i8 == i.e(listI) || (iMo6179position95KtPRI >= 0 && i6 + iMo6179position95KtPRI <= i9)) {
                break;
            }
            i5 = i8 + 1;
            i4 = i9;
            size = i7;
            c3 = c2;
            j5 = j4;
        }
        MenuPosition.Vertical[] verticalArr = new MenuPosition.Vertical[3];
        verticalArr[0] = this.topToAnchorBottom;
        verticalArr[1] = this.bottomToAnchorTop;
        int i10 = (int) (j7 & j4);
        verticalArr[2] = IntOffset.m11297getYimpl(intRect2.m11320getCenternOccac()) < i10 / 2 ? this.topToWindowTop : this.bottomToWindowBottom;
        List listI2 = i.i(verticalArr);
        int size2 = listI2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            int i12 = (int) (j3 & j4);
            int iMo6180positionJVtK1S4 = ((MenuPosition.Vertical) listI2.get(i11)).mo6180positionJVtK1S4(intRect2, j7, i12);
            if (i11 == i.e(listI2) || (iMo6180positionJVtK1S4 >= 0 && i12 + iMo6180positionJVtK1S4 <= i10)) {
                i3 = iMo6180positionJVtK1S4;
                break;
            }
        }
        long j8 = (iMo6179position95KtPRI << c2) | (i3 & j4);
        this.onPositionCalculated.invoke(intRect2, IntRectKt.m11329IntRectVbeCjmY(j8, j3));
        return j8;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final State<ab> getKeyboardSignalState() {
        return this.keyboardSignalState;
    }

    public final p<IntRect, IntRect, ab> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public final int getTopWindowInsets() {
        return this.topWindowInsets;
    }

    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    public /* synthetic */ ExposedDropdownMenuPositionProvider(Density density, int i2, State state, int i3, p pVar, int i4, o oVar) {
        this(density, i2, (i4 & 4) != 0 ? null : state, (i4 & 8) != 0 ? density.mo2121roundToPx0680j_4(MenuKt.getMenuVerticalMargin()) : i3, (i4 & 16) != 0 ? new p() { // from class: androidx.compose.material3.ExposedDropdownMenuPositionProvider$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return ab.f48028a;
            }
        } : pVar);
    }
}
