package androidx.compose.material3.carousel;

import androidx.collection.FloatFloatPair;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.p;
import h.g.a.q;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MultiAspectCarouselKt {
    public static final MultiAspectCarouselItemDrawInfo MultiAspectCarouselItemDrawInfo(final int i2, final LazyListState lazyListState) {
        return new MultiAspectCarouselItemDrawInfoImpl(i2, new MultiAspectCarouselContainerState() { // from class: androidx.compose.material3.carousel.MultiAspectCarouselKt.MultiAspectCarouselItemDrawInfo.1
            @Override // androidx.compose.material3.carousel.MultiAspectCarouselContainerState
            public Orientation getOrientation() {
                return lazyListState.getLayoutInfo().getOrientation();
            }

            @Override // androidx.compose.material3.carousel.MultiAspectCarouselContainerState
            public float getViewportEndOffset() {
                return lazyListState.getLayoutInfo().getViewportEndOffset();
            }

            @Override // androidx.compose.material3.carousel.MultiAspectCarouselContainerState
            public float getViewportStartOffset() {
                return lazyListState.getLayoutInfo().getViewportStartOffset();
            }
        }, new MultiAspectCarouselItemInfoState() { // from class: androidx.compose.material3.carousel.MultiAspectCarouselKt.MultiAspectCarouselItemDrawInfo.2
            private final LazyListItemInfo getInfo() {
                LazyListItemInfo lazyListItemInfo;
                List<LazyListItemInfo> visibleItemsInfo = lazyListState.getLayoutInfo().getVisibleItemsInfo();
                int size = visibleItemsInfo.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        lazyListItemInfo = null;
                        break;
                    }
                    int i4 = i2;
                    lazyListItemInfo = visibleItemsInfo.get(i3);
                    if (lazyListItemInfo.getIndex() == i4) {
                        break;
                    }
                    i3++;
                }
                return lazyListItemInfo;
            }

            @Override // androidx.compose.material3.carousel.MultiAspectCarouselItemInfoState
            public float getCrossAxisSize() {
                Orientation orientation = lazyListState.getLayoutInfo().getOrientation();
                Orientation orientation2 = Orientation.Horizontal;
                LazyListState lazyListState2 = lazyListState;
                return (int) (orientation == orientation2 ? lazyListState2.getLayoutInfo().mo2879getViewportSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE : lazyListState2.getLayoutInfo().mo2879getViewportSizeYbymL2g() >> 32);
            }

            @Override // androidx.compose.material3.carousel.MultiAspectCarouselItemInfoState
            public float getMainAxisSize() {
                if (getInfo() != null) {
                    return r0.getSize();
                }
                return 0.0f;
            }

            @Override // androidx.compose.material3.carousel.MultiAspectCarouselItemInfoState
            public float getOffset() {
                if (getInfo() != null) {
                    return r0.getOffset();
                }
                return 0.0f;
            }

            @Override // androidx.compose.material3.carousel.MultiAspectCarouselItemInfoState
            public boolean isVisible() {
                return getInfo() != null;
            }
        });
    }

    public static final void MultiAspectCarouselScope(final q<? super MultiAspectCarouselScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(901366131);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(qVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(901366131, i3, -1, "androidx.compose.material3.carousel.MultiAspectCarouselScope (MultiAspectCarousel.kt:64)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new MultiAspectCarouselScopeImpl();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            qVar.invoke((MultiAspectCarouselScopeImpl) objRememberedValue, composerStartRestartGroup, Integer.valueOf(((i3 << 3) & 112) | 6));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.carousel.MultiAspectCarouselKt$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return MultiAspectCarouselKt.MultiAspectCarouselScope$lambda$1(qVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab MultiAspectCarouselScope$lambda$1(q qVar, int i2, Composer composer, int i3) {
        MultiAspectCarouselScope(qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getMask(MultiAspectCarouselContainerState multiAspectCarouselContainerState, MultiAspectCarouselItemInfoState multiAspectCarouselItemInfoState) {
        if (!multiAspectCarouselItemInfoState.isVisible()) {
            return FloatFloatPair.m1675constructorimpl(0.0f, 0.0f);
        }
        float mainAxisSize = multiAspectCarouselItemInfoState.getMainAxisSize();
        float crossAxisSize = multiAspectCarouselItemInfoState.getCrossAxisSize();
        float offset = multiAspectCarouselItemInfoState.getOffset();
        float maskIntensity = getMaskIntensity(mainAxisSize, crossAxisSize);
        if (offset < multiAspectCarouselContainerState.getViewportStartOffset()) {
            return FloatFloatPair.m1675constructorimpl(StrategyKt.lerp(0.0f, (1.0f - maskIntensity) * mainAxisSize, 0.0f, mainAxisSize, multiAspectCarouselContainerState.getViewportStartOffset() - offset), mainAxisSize);
        }
        return offset > multiAspectCarouselContainerState.getViewportEndOffset() - mainAxisSize ? FloatFloatPair.m1675constructorimpl(0.0f, StrategyKt.lerp(mainAxisSize, maskIntensity * mainAxisSize, 0.0f, mainAxisSize, -((multiAspectCarouselContainerState.getViewportEndOffset() - offset) - mainAxisSize))) : FloatFloatPair.m1675constructorimpl(0.0f, mainAxisSize);
    }

    private static final float getMaskIntensity(float f2, float f3) {
        float f4 = f2 / f3;
        if (f4 > 1.7777778f) {
            return 0.5f;
        }
        if (f4 < 1.7777778f && f4 > 1.0f) {
            return StrategyKt.lerp(0.33333334f, 0.5f, 1.0f, 1.7777778f, f4);
        }
        if (f4 >= 1.0f || f4 <= 0.5625f) {
            return 0.25f;
        }
        return StrategyKt.lerp(0.25f, 0.33333334f, 0.5625f, 1.0f, f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getMinSize(MultiAspectCarouselItemInfoState multiAspectCarouselItemInfoState) {
        if (!multiAspectCarouselItemInfoState.isVisible()) {
            return 0.0f;
        }
        return multiAspectCarouselItemInfoState.getMainAxisSize() * (1.0f - getMaskIntensity(multiAspectCarouselItemInfoState.getMainAxisSize(), multiAspectCarouselItemInfoState.getCrossAxisSize()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getParallax(MultiAspectCarouselContainerState multiAspectCarouselContainerState, MultiAspectCarouselItemInfoState multiAspectCarouselItemInfoState) {
        if (multiAspectCarouselItemInfoState.isVisible()) {
            float mainAxisSize = multiAspectCarouselItemInfoState.getMainAxisSize();
            float crossAxisSize = multiAspectCarouselItemInfoState.getCrossAxisSize();
            float offset = multiAspectCarouselItemInfoState.getOffset();
            float maskIntensity = getMaskIntensity(mainAxisSize, crossAxisSize) * mainAxisSize;
            if (offset < multiAspectCarouselContainerState.getViewportStartOffset()) {
                return StrategyKt.lerp(0.0f, maskIntensity, 0.0f, mainAxisSize, multiAspectCarouselContainerState.getViewportStartOffset() - offset);
            }
            if (offset > multiAspectCarouselContainerState.getViewportEndOffset() - mainAxisSize) {
                return -StrategyKt.lerp(0.0f, maskIntensity, 0.0f, mainAxisSize, -((multiAspectCarouselContainerState.getViewportEndOffset() - offset) - mainAxisSize));
            }
        }
        return 0.0f;
    }

    public static final MultiAspectCarouselItemDrawInfo MultiAspectCarouselItemDrawInfo(final int i2, final LazyGridState lazyGridState) {
        return new MultiAspectCarouselItemDrawInfoImpl(i2, new MultiAspectCarouselContainerState() { // from class: androidx.compose.material3.carousel.MultiAspectCarouselKt.MultiAspectCarouselItemDrawInfo.3
            @Override // androidx.compose.material3.carousel.MultiAspectCarouselContainerState
            public Orientation getOrientation() {
                return lazyGridState.getLayoutInfo().getOrientation();
            }

            @Override // androidx.compose.material3.carousel.MultiAspectCarouselContainerState
            public float getViewportEndOffset() {
                return lazyGridState.getLayoutInfo().getViewportEndOffset();
            }

            @Override // androidx.compose.material3.carousel.MultiAspectCarouselContainerState
            public float getViewportStartOffset() {
                return lazyGridState.getLayoutInfo().getViewportStartOffset();
            }
        }, new MultiAspectCarouselItemInfoState() { // from class: androidx.compose.material3.carousel.MultiAspectCarouselKt.MultiAspectCarouselItemDrawInfo.4
            private final LazyGridItemInfo getInfo() {
                LazyGridItemInfo lazyGridItemInfo;
                List<LazyGridItemInfo> visibleItemsInfo = lazyGridState.getLayoutInfo().getVisibleItemsInfo();
                int size = visibleItemsInfo.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        lazyGridItemInfo = null;
                        break;
                    }
                    int i4 = i2;
                    lazyGridItemInfo = visibleItemsInfo.get(i3);
                    if (lazyGridItemInfo.getIndex() == i4) {
                        break;
                    }
                    i3++;
                }
                return lazyGridItemInfo;
            }

            private final boolean isHorizontal() {
                return lazyGridState.getLayoutInfo().getOrientation() == Orientation.Horizontal;
            }

            @Override // androidx.compose.material3.carousel.MultiAspectCarouselItemInfoState
            public float getCrossAxisSize() {
                LazyGridItemInfo info = getInfo();
                if (info == null) {
                    return 0.0f;
                }
                long jMo2909getSizeYbymL2g = info.mo2909getSizeYbymL2g();
                return (int) (isHorizontal() ? jMo2909getSizeYbymL2g & MuxerUtil.UNSIGNED_INT_MAX_VALUE : jMo2909getSizeYbymL2g >> 32);
            }

            @Override // androidx.compose.material3.carousel.MultiAspectCarouselItemInfoState
            public float getMainAxisSize() {
                LazyGridItemInfo info = getInfo();
                if (info == null) {
                    return 0.0f;
                }
                long jMo2909getSizeYbymL2g = info.mo2909getSizeYbymL2g();
                return (int) (isHorizontal() ? jMo2909getSizeYbymL2g >> 32 : jMo2909getSizeYbymL2g & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            }

            @Override // androidx.compose.material3.carousel.MultiAspectCarouselItemInfoState
            public float getOffset() {
                LazyGridItemInfo info = getInfo();
                if (info == null) {
                    return 0.0f;
                }
                long jMo2908getOffsetnOccac = info.mo2908getOffsetnOccac();
                return isHorizontal() ? IntOffset.m11296getXimpl(jMo2908getOffsetnOccac) : IntOffset.m11297getYimpl(jMo2908getOffsetnOccac);
            }

            @Override // androidx.compose.material3.carousel.MultiAspectCarouselItemInfoState
            public boolean isVisible() {
                return getInfo() != null;
            }
        });
    }
}
