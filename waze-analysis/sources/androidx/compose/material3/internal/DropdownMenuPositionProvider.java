package androidx.compose.material3.internal;

import androidx.collection.IntList;
import androidx.collection.MutableIntList;
import androidx.compose.material3.DropdownMenuPopupPositionProvider;
import androidx.compose.material3.MenuAnchorPosition;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.a.i;
import h.ab;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DropdownMenuPositionProvider implements DropdownMenuPopupPositionProvider {
    public static final int $stable = 0;
    private final MenuPosition.Vertical bottomToAnchorBottom;
    private final MenuPosition.Vertical bottomToAnchorTop;
    private final MenuPosition.Vertical bottomToWindowBottom;
    private final MenuPosition.Vertical centerToAnchorTop;
    private final long contentOffset;
    private final Density density;
    private final MenuAnchorPosition dropdownMenuAnchorPosition;
    private final MenuPosition.Horizontal endToAnchorEnd;
    private final MenuPosition.Horizontal endToAnchorStart;
    private final int horizontalMargin;
    private final MenuPosition.Horizontal leftToWindowLeft;
    private final p<IntRect, IntRect, ab> onPositionCalculated;
    private final MenuPosition.Horizontal rightToWindowRight;
    private final MenuPosition.Horizontal startToAnchorEnd;
    private final MenuPosition.Horizontal startToAnchorStart;
    private final MenuPosition.Vertical topToAnchorBottom;
    private final MenuPosition.Vertical topToAnchorTop;
    private final MenuPosition.Vertical topToWindowTop;
    private final MutableState<TransformOrigin> transformOriginState;
    private final int verticalMargin;

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(MutableState<TransformOrigin> mutableState, long j2, Density density, MenuAnchorPosition menuAnchorPosition, int i2, int i3, p<? super IntRect, ? super IntRect, ab> pVar) {
        this.transformOriginState = mutableState;
        this.contentOffset = j2;
        this.density = density;
        this.dropdownMenuAnchorPosition = menuAnchorPosition;
        this.verticalMargin = i2;
        this.horizontalMargin = i3;
        this.onPositionCalculated = pVar;
        int iMo2121roundToPx0680j_4 = density.mo2121roundToPx0680j_4(DpOffset.m11225getXD9Ej5fM(j2));
        this.startToAnchorStart = MenuPosition.INSTANCE.startToAnchorStart(iMo2121roundToPx0680j_4);
        this.endToAnchorStart = MenuPosition.INSTANCE.endToAnchorStart(iMo2121roundToPx0680j_4);
        this.endToAnchorEnd = MenuPosition.INSTANCE.endToAnchorEnd(iMo2121roundToPx0680j_4);
        this.startToAnchorEnd = MenuPosition.INSTANCE.startToAnchorEnd(iMo2121roundToPx0680j_4);
        this.leftToWindowLeft = MenuPosition.INSTANCE.leftToWindowLeft(i3);
        this.rightToWindowRight = MenuPosition.INSTANCE.rightToWindowRight(i3);
        int iMo2121roundToPx0680j_42 = density.mo2121roundToPx0680j_4(DpOffset.m11227getYD9Ej5fM(j2));
        this.topToAnchorBottom = MenuPosition.INSTANCE.topToAnchorBottom(iMo2121roundToPx0680j_42);
        this.topToAnchorTop = MenuPosition.INSTANCE.topToAnchorTop(iMo2121roundToPx0680j_42);
        this.bottomToAnchorTop = MenuPosition.INSTANCE.bottomToAnchorTop(iMo2121roundToPx0680j_42);
        this.bottomToAnchorBottom = MenuPosition.INSTANCE.bottomToAnchorBottom(iMo2121roundToPx0680j_42);
        this.centerToAnchorTop = MenuPosition.INSTANCE.centerToAnchorTop(iMo2121roundToPx0680j_42);
        this.topToWindowTop = MenuPosition.INSTANCE.topToWindowTop(i2);
        this.bottomToWindowBottom = MenuPosition.INSTANCE.bottomToWindowBottom(i2);
    }

    /* renamed from: abovePosition-Kf4kD6o, reason: not valid java name */
    private final long m6258abovePositionKf4kD6o(IntRect intRect, long j2, long j3, LayoutDirection layoutDirection) {
        MenuPosition.Horizontal[] horizontalArr = new MenuPosition.Horizontal[3];
        horizontalArr[0] = this.startToAnchorStart;
        horizontalArr[1] = this.endToAnchorEnd;
        horizontalArr[2] = IntOffset.m11296getXimpl(intRect.m11320getCenternOccac()) < ((int) (j2 >> 32)) / 2 ? this.leftToWindowLeft : this.rightToWindowRight;
        List<? extends MenuPosition.Horizontal> listI = i.i(horizontalArr);
        MenuPosition.Vertical[] verticalArr = new MenuPosition.Vertical[4];
        verticalArr[0] = this.bottomToAnchorTop;
        verticalArr[1] = this.topToAnchorBottom;
        verticalArr[2] = this.centerToAnchorTop;
        verticalArr[3] = IntOffset.m11297getYimpl(intRect.m11320getCenternOccac()) < ((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)) / 2 ? this.topToWindowTop : this.bottomToWindowBottom;
        return m6263positioningLogictBze9TY(m6266xValuesFromCandidatesV7c76IY(listI, intRect, j2, j3, layoutDirection), m6267yValuesFromCandidates9x1nBME(i.i(verticalArr), intRect, j2, j3), intRect, j2, j3);
    }

    /* renamed from: belowPosition-Kf4kD6o, reason: not valid java name */
    private final long m6259belowPositionKf4kD6o(IntRect intRect, long j2, long j3, LayoutDirection layoutDirection) {
        MenuPosition.Horizontal[] horizontalArr = new MenuPosition.Horizontal[3];
        horizontalArr[0] = this.startToAnchorStart;
        horizontalArr[1] = this.endToAnchorEnd;
        horizontalArr[2] = IntOffset.m11296getXimpl(intRect.m11320getCenternOccac()) < ((int) (j2 >> 32)) / 2 ? this.leftToWindowLeft : this.rightToWindowRight;
        List<? extends MenuPosition.Horizontal> listI = i.i(horizontalArr);
        MenuPosition.Vertical[] verticalArr = new MenuPosition.Vertical[4];
        verticalArr[0] = this.topToAnchorBottom;
        verticalArr[1] = this.bottomToAnchorTop;
        verticalArr[2] = this.centerToAnchorTop;
        verticalArr[3] = IntOffset.m11297getYimpl(intRect.m11320getCenternOccac()) < ((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)) / 2 ? this.topToWindowTop : this.bottomToWindowBottom;
        return m6263positioningLogictBze9TY(m6266xValuesFromCandidatesV7c76IY(listI, intRect, j2, j3, layoutDirection), m6267yValuesFromCandidates9x1nBME(i.i(verticalArr), intRect, j2, j3), intRect, j2, j3);
    }

    /* renamed from: copy-qcKtr7c$default, reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m6260copyqcKtr7c$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, MutableState mutableState, long j2, Density density, MenuAnchorPosition menuAnchorPosition, int i2, int i3, p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            mutableState = dropdownMenuPositionProvider.transformOriginState;
        }
        if ((i4 & 2) != 0) {
            j2 = dropdownMenuPositionProvider.contentOffset;
        }
        if ((i4 & 4) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        if ((i4 & 8) != 0) {
            menuAnchorPosition = dropdownMenuPositionProvider.dropdownMenuAnchorPosition;
        }
        if ((i4 & 16) != 0) {
            i2 = dropdownMenuPositionProvider.verticalMargin;
        }
        if ((i4 & 32) != 0) {
            i3 = dropdownMenuPositionProvider.horizontalMargin;
        }
        if ((i4 & 64) != 0) {
            pVar = dropdownMenuPositionProvider.onPositionCalculated;
        }
        p pVar2 = pVar;
        int i5 = i2;
        Density density2 = density;
        return dropdownMenuPositionProvider.m6269copyqcKtr7c(mutableState, j2, density2, menuAnchorPosition, i5, i3, pVar2);
    }

    /* renamed from: endPosition-Kf4kD6o, reason: not valid java name */
    private final long m6261endPositionKf4kD6o(IntRect intRect, long j2, long j3, LayoutDirection layoutDirection) {
        MenuPosition.Horizontal[] horizontalArr = new MenuPosition.Horizontal[3];
        horizontalArr[0] = this.startToAnchorEnd;
        horizontalArr[1] = this.endToAnchorStart;
        horizontalArr[2] = IntOffset.m11296getXimpl(intRect.m11320getCenternOccac()) < ((int) (j2 >> 32)) / 2 ? this.leftToWindowLeft : this.rightToWindowRight;
        List<? extends MenuPosition.Horizontal> listI = i.i(horizontalArr);
        MenuPosition.Vertical[] verticalArr = new MenuPosition.Vertical[3];
        verticalArr[0] = this.topToAnchorTop;
        verticalArr[1] = this.bottomToAnchorBottom;
        verticalArr[2] = IntOffset.m11297getYimpl(intRect.m11320getCenternOccac()) < ((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)) / 2 ? this.topToWindowTop : this.bottomToWindowBottom;
        return m6263positioningLogictBze9TY(m6266xValuesFromCandidatesV7c76IY(listI, intRect, j2, j3, layoutDirection), m6267yValuesFromCandidates9x1nBME(i.i(verticalArr), intRect, j2, j3), intRect, j2, j3);
    }

    /* renamed from: leftPosition-uHY26d4, reason: not valid java name */
    private final long m6262leftPositionuHY26d4(IntRect intRect, long j2, long j3) {
        MenuPosition.Horizontal[] horizontalArr = new MenuPosition.Horizontal[3];
        horizontalArr[0] = this.endToAnchorStart;
        horizontalArr[1] = this.startToAnchorEnd;
        horizontalArr[2] = IntOffset.m11296getXimpl(intRect.m11320getCenternOccac()) < ((int) (j2 >> 32)) / 2 ? this.leftToWindowLeft : this.rightToWindowRight;
        List<? extends MenuPosition.Horizontal> listI = i.i(horizontalArr);
        MenuPosition.Vertical[] verticalArr = new MenuPosition.Vertical[3];
        verticalArr[0] = this.topToAnchorTop;
        verticalArr[1] = this.bottomToAnchorBottom;
        verticalArr[2] = IntOffset.m11297getYimpl(intRect.m11320getCenternOccac()) < ((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)) / 2 ? this.topToWindowTop : this.bottomToWindowBottom;
        return m6263positioningLogictBze9TY(m6266xValuesFromCandidatesV7c76IY(listI, intRect, j2, j3, LayoutDirection.Ltr), m6267yValuesFromCandidates9x1nBME(i.i(verticalArr), intRect, j2, j3), intRect, j2, j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        r6 = r16;
     */
    /* renamed from: positioningLogic-tBze9TY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long m6263positioningLogictBze9TY(androidx.collection.IntList r16, androidx.collection.IntList r17, androidx.compose.ui.unit.IntRect r18, long r19, long r21) {
        /*
            r15 = this;
            r1 = r16
            r2 = r17
            r3 = r21
            int r5 = r1._size
            r6 = 0
            h.k.j r5 = h.k.n.u(r6, r5)
            int r7 = r5.a()
            int r5 = r5.b()
            r8 = 32
            if (r7 > r5) goto L37
        L19:
            int r9 = r1.get(r7)
            int r10 = r1._size
            int r10 = r10 + (-1)
            if (r7 == r10) goto L38
            int r10 = r15.horizontalMargin
            if (r9 < r10) goto L32
            long r11 = r3 >> r8
            long r13 = r19 >> r8
            int r13 = (int) r13
            int r13 = r13 - r10
            int r10 = (int) r11
            int r10 = r10 + r9
            if (r10 > r13) goto L32
            goto L38
        L32:
            if (r7 == r5) goto L37
            int r7 = r7 + 1
            goto L19
        L37:
            r9 = r6
        L38:
            int r1 = r2._size
            h.k.j r1 = h.k.n.u(r6, r1)
            int r5 = r1.a()
            int r1 = r1.b()
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r5 > r1) goto L74
        L4d:
            int r7 = r2.get(r5)
            int r12 = r2._size
            int r12 = r12 + (-1)
            if (r5 == r12) goto L6f
            int r12 = r15.verticalMargin
            if (r7 < r12) goto L69
            long r13 = r3 & r10
            r16 = r7
            long r6 = r19 & r10
            int r6 = (int) r6
            int r6 = r6 - r12
            int r7 = (int) r13
            int r7 = r16 + r7
            if (r7 > r6) goto L69
            goto L71
        L69:
            if (r5 == r1) goto L74
            int r5 = r5 + 1
            r6 = 0
            goto L4d
        L6f:
            r16 = r7
        L71:
            r6 = r16
            goto L75
        L74:
            r6 = 0
        L75:
            long r1 = (long) r9
            long r1 = r1 << r8
            long r5 = (long) r6
            long r5 = r5 & r10
            h.g.a.p<androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect, h.ab> r0 = r15.onPositionCalculated
            long r1 = r1 | r5
            androidx.compose.ui.unit.IntRect r3 = androidx.compose.ui.unit.IntRectKt.m11329IntRectVbeCjmY(r1, r3)
            r4 = r18
            r0.invoke(r4, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.DropdownMenuPositionProvider.m6263positioningLogictBze9TY(androidx.collection.IntList, androidx.collection.IntList, androidx.compose.ui.unit.IntRect, long, long):long");
    }

    /* renamed from: rightPosition-uHY26d4, reason: not valid java name */
    private final long m6264rightPositionuHY26d4(IntRect intRect, long j2, long j3) {
        MenuPosition.Horizontal[] horizontalArr = new MenuPosition.Horizontal[3];
        horizontalArr[0] = this.startToAnchorEnd;
        horizontalArr[1] = this.endToAnchorStart;
        horizontalArr[2] = IntOffset.m11296getXimpl(intRect.m11320getCenternOccac()) < ((int) (j2 >> 32)) / 2 ? this.leftToWindowLeft : this.rightToWindowRight;
        List<? extends MenuPosition.Horizontal> listI = i.i(horizontalArr);
        MenuPosition.Vertical[] verticalArr = new MenuPosition.Vertical[3];
        verticalArr[0] = this.topToAnchorTop;
        verticalArr[1] = this.bottomToAnchorBottom;
        verticalArr[2] = IntOffset.m11297getYimpl(intRect.m11320getCenternOccac()) < ((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)) / 2 ? this.topToWindowTop : this.bottomToWindowBottom;
        return m6263positioningLogictBze9TY(m6266xValuesFromCandidatesV7c76IY(listI, intRect, j2, j3, LayoutDirection.Ltr), m6267yValuesFromCandidates9x1nBME(i.i(verticalArr), intRect, j2, j3), intRect, j2, j3);
    }

    /* renamed from: startPosition-Kf4kD6o, reason: not valid java name */
    private final long m6265startPositionKf4kD6o(IntRect intRect, long j2, long j3, LayoutDirection layoutDirection) {
        MenuPosition.Horizontal[] horizontalArr = new MenuPosition.Horizontal[3];
        horizontalArr[0] = this.endToAnchorStart;
        horizontalArr[1] = this.startToAnchorEnd;
        horizontalArr[2] = IntOffset.m11296getXimpl(intRect.m11320getCenternOccac()) < ((int) (j2 >> 32)) / 2 ? this.leftToWindowLeft : this.rightToWindowRight;
        List<? extends MenuPosition.Horizontal> listI = i.i(horizontalArr);
        MenuPosition.Vertical[] verticalArr = new MenuPosition.Vertical[3];
        verticalArr[0] = this.topToAnchorTop;
        verticalArr[1] = this.bottomToAnchorBottom;
        verticalArr[2] = IntOffset.m11297getYimpl(intRect.m11320getCenternOccac()) < ((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)) / 2 ? this.topToWindowTop : this.bottomToWindowBottom;
        return m6263positioningLogictBze9TY(m6266xValuesFromCandidatesV7c76IY(listI, intRect, j2, j3, layoutDirection), m6267yValuesFromCandidates9x1nBME(i.i(verticalArr), intRect, j2, j3), intRect, j2, j3);
    }

    /* renamed from: xValuesFromCandidates-V7c76IY, reason: not valid java name */
    private final IntList m6266xValuesFromCandidatesV7c76IY(List<? extends MenuPosition.Horizontal> list, IntRect intRect, long j2, long j3, LayoutDirection layoutDirection) {
        MutableIntList mutableIntList = new MutableIntList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            mutableIntList.add(list.get(i2).mo6179position95KtPRI(intRect, j2, (int) (j3 >> 32), layoutDirection));
        }
        return mutableIntList;
    }

    /* renamed from: yValuesFromCandidates-9x1nBME, reason: not valid java name */
    private final IntList m6267yValuesFromCandidates9x1nBME(List<? extends MenuPosition.Vertical> list, IntRect intRect, long j2, long j3) {
        MutableIntList mutableIntList = new MutableIntList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            mutableIntList.add(list.get(i2).mo6180positionJVtK1S4(intRect, j2, (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j3)));
        }
        return mutableIntList;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo2094calculatePositionllwVHH4(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        MenuAnchorPosition menuAnchorPosition = this.dropdownMenuAnchorPosition;
        if (menuAnchorPosition instanceof MenuAnchorPosition.Above) {
            return m6258abovePositionKf4kD6o(intRect, j2, j3, layoutDirection);
        }
        if (menuAnchorPosition instanceof MenuAnchorPosition.Below) {
            return m6259belowPositionKf4kD6o(intRect, j2, j3, layoutDirection);
        }
        if (menuAnchorPosition instanceof MenuAnchorPosition.Start) {
            return m6265startPositionKf4kD6o(intRect, j2, j3, layoutDirection);
        }
        if (menuAnchorPosition instanceof MenuAnchorPosition.End) {
            return m6261endPositionKf4kD6o(intRect, j2, j3, layoutDirection);
        }
        if (menuAnchorPosition instanceof MenuAnchorPosition.Left) {
            return m6262leftPositionuHY26d4(intRect, j2, j3);
        }
        if (menuAnchorPosition instanceof MenuAnchorPosition.Right) {
            return m6264rightPositionuHY26d4(intRect, j2, j3);
        }
        if (menuAnchorPosition instanceof MenuAnchorPosition.Custom) {
            return m6263positioningLogictBze9TY(((MenuAnchorPosition.Custom) menuAnchorPosition).getXCandidates().invoke(intRect, IntSize.m11331boximpl(j2), IntSize.m11331boximpl(j3)), ((MenuAnchorPosition.Custom) this.dropdownMenuAnchorPosition).getYCandidates().invoke(intRect, IntSize.m11331boximpl(j2), IntSize.m11331boximpl(j3)), intRect, j2, j3);
        }
        throw new h.i();
    }

    public final MutableState<TransformOrigin> component1() {
        return this.transformOriginState;
    }

    /* renamed from: component2-RKDOV3M, reason: not valid java name */
    public final long m6268component2RKDOV3M() {
        return this.contentOffset;
    }

    public final Density component3() {
        return this.density;
    }

    public final MenuAnchorPosition component4() {
        return this.dropdownMenuAnchorPosition;
    }

    public final int component5() {
        return this.verticalMargin;
    }

    public final int component6() {
        return this.horizontalMargin;
    }

    public final p<IntRect, IntRect, ab> component7() {
        return this.onPositionCalculated;
    }

    /* renamed from: copy-qcKtr7c, reason: not valid java name */
    public final DropdownMenuPositionProvider m6269copyqcKtr7c(MutableState<TransformOrigin> mutableState, long j2, Density density, MenuAnchorPosition menuAnchorPosition, int i2, int i3, p<? super IntRect, ? super IntRect, ab> pVar) {
        return new DropdownMenuPositionProvider(mutableState, j2, density, menuAnchorPosition, i2, i3, pVar, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
        return x.n(this.transformOriginState, dropdownMenuPositionProvider.transformOriginState) && DpOffset.m11224equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && x.n(this.density, dropdownMenuPositionProvider.density) && x.n(this.dropdownMenuAnchorPosition, dropdownMenuPositionProvider.dropdownMenuAnchorPosition) && this.verticalMargin == dropdownMenuPositionProvider.verticalMargin && this.horizontalMargin == dropdownMenuPositionProvider.horizontalMargin && x.n(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    /* renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m6270getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final MenuAnchorPosition getDropdownMenuAnchorPosition() {
        return this.dropdownMenuAnchorPosition;
    }

    public final int getHorizontalMargin() {
        return this.horizontalMargin;
    }

    public final p<IntRect, IntRect, ab> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    @Override // androidx.compose.material3.DropdownMenuPopupPositionProvider
    public MutableState<TransformOrigin> getTransformOriginState() {
        return this.transformOriginState;
    }

    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    public int hashCode() {
        return (((((((((((this.transformOriginState.hashCode() * 31) + DpOffset.m11229hashCodeimpl(this.contentOffset)) * 31) + this.density.hashCode()) * 31) + this.dropdownMenuAnchorPosition.hashCode()) * 31) + this.verticalMargin) * 31) + this.horizontalMargin) * 31) + this.onPositionCalculated.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(transformOriginState=" + this.transformOriginState + ", contentOffset=" + ((Object) DpOffset.m11232toStringimpl(this.contentOffset)) + ", density=" + this.density + ", dropdownMenuAnchorPosition=" + this.dropdownMenuAnchorPosition + ", verticalMargin=" + this.verticalMargin + ", horizontalMargin=" + this.horizontalMargin + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    public /* synthetic */ DropdownMenuPositionProvider(MutableState mutableState, long j2, Density density, MenuAnchorPosition menuAnchorPosition, int i2, int i3, p pVar, o oVar) {
        this(mutableState, j2, density, menuAnchorPosition, i2, i3, pVar);
    }

    public /* synthetic */ DropdownMenuPositionProvider(MutableState mutableState, long j2, Density density, MenuAnchorPosition menuAnchorPosition, int i2, int i3, p pVar, int i4, o oVar) {
        this(mutableState, j2, density, menuAnchorPosition, (i4 & 16) != 0 ? density.mo2121roundToPx0680j_4(MenuKt.getMenuVerticalMargin()) : i2, (i4 & 32) != 0 ? density.mo2121roundToPx0680j_4(MenuKt.getMenuHorizontalMargin()) : i3, (i4 & 64) != 0 ? new p() { // from class: androidx.compose.material3.internal.DropdownMenuPositionProvider$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return ab.f48028a;
            }
        } : pVar, null);
    }
}
