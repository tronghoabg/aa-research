package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.compose.MotionLayoutScope;
import h.ab;
import h.g.a.p;
import h.g.a.q;
import h.g.a.r;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class MotionCarouselScopeImpl implements MotionCarouselScope, MotionItemsProvider {
    private int itemsCount;
    private q<? super Integer, ? super Composer, ? super Integer, ab> itemsProvider;
    private r<? super Integer, ? super androidx.compose.runtime.State<MotionLayoutScope.MotionProperties>, ? super Composer, ? super Integer, ab> itemsProviderWithProperties;

    static final ab getContent$lambda$0(MotionCarouselScopeImpl motionCarouselScopeImpl, int i2, Composer composer, int i3) {
        if ((i3 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1496757042, i3, -1, "androidx.constraintlayout.compose.MotionCarouselScopeImpl.getContent.<anonymous> (MotionCarousel.kt:355)");
            }
            q<? super Integer, ? super Composer, ? super Integer, ab> qVar = motionCarouselScopeImpl.itemsProvider;
            if (qVar == null) {
                composer.startReplaceGroup(461446118);
            } else {
                composer.startReplaceGroup(430527355);
                qVar.invoke(Integer.valueOf(i2), composer, 0);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return ab.f48028a;
    }

    static final ab getContent$lambda$1(MotionCarouselScopeImpl motionCarouselScopeImpl, int i2, androidx.compose.runtime.State state, Composer composer, int i3) {
        if ((i3 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1094644265, i3, -1, "androidx.constraintlayout.compose.MotionCarouselScopeImpl.getContent.<anonymous> (MotionCarousel.kt:362)");
            }
            r<? super Integer, ? super androidx.compose.runtime.State<MotionLayoutScope.MotionProperties>, ? super Composer, ? super Integer, ab> rVar = motionCarouselScopeImpl.itemsProviderWithProperties;
            if (rVar == null) {
                composer.startReplaceGroup(-1139348385);
            } else {
                composer.startReplaceGroup(-313847838);
                rVar.invoke(Integer.valueOf(i2), state, composer, 0);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return ab.f48028a;
    }

    @Override // androidx.constraintlayout.compose.MotionItemsProvider
    public int count() {
        return this.itemsCount;
    }

    @Override // androidx.constraintlayout.compose.MotionItemsProvider
    public p<Composer, Integer, ab> getContent(final int i2) {
        return ComposableLambdaKt.composableLambdaInstance(-1496757042, true, new p() { // from class: androidx.constraintlayout.compose.MotionCarouselScopeImpl$$ExternalSyntheticLambda1
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return MotionCarouselScopeImpl.getContent$lambda$0(this.f$0, i2, (Composer) obj, ((Integer) obj2).intValue());
            }
        });
    }

    public final int getItemsCount() {
        return this.itemsCount;
    }

    public final q<Integer, Composer, Integer, ab> getItemsProvider() {
        return this.itemsProvider;
    }

    public final r<Integer, androidx.compose.runtime.State<MotionLayoutScope.MotionProperties>, Composer, Integer, ab> getItemsProviderWithProperties() {
        return this.itemsProviderWithProperties;
    }

    @Override // androidx.constraintlayout.compose.MotionItemsProvider
    public boolean hasItemsWithProperties() {
        return this.itemsProviderWithProperties != null;
    }

    @Override // androidx.constraintlayout.compose.MotionCarouselScope
    public void items(int i2, q<? super Integer, ? super Composer, ? super Integer, ab> qVar) {
        this.itemsCount = i2;
        this.itemsProvider = qVar;
    }

    @Override // androidx.constraintlayout.compose.MotionCarouselScope
    public void itemsWithProperties(int i2, r<? super Integer, ? super androidx.compose.runtime.State<MotionLayoutScope.MotionProperties>, ? super Composer, ? super Integer, ab> rVar) {
        this.itemsCount = i2;
        this.itemsProviderWithProperties = rVar;
    }

    public final void setItemsCount(int i2) {
        this.itemsCount = i2;
    }

    public final void setItemsProvider(q<? super Integer, ? super Composer, ? super Integer, ab> qVar) {
        this.itemsProvider = qVar;
    }

    public final void setItemsProviderWithProperties(r<? super Integer, ? super androidx.compose.runtime.State<MotionLayoutScope.MotionProperties>, ? super Composer, ? super Integer, ab> rVar) {
        this.itemsProviderWithProperties = rVar;
    }

    @Override // androidx.constraintlayout.compose.MotionItemsProvider
    public p<Composer, Integer, ab> getContent(final int i2, final androidx.compose.runtime.State<MotionLayoutScope.MotionProperties> state) {
        return ComposableLambdaKt.composableLambdaInstance(1094644265, true, new p() { // from class: androidx.constraintlayout.compose.MotionCarouselScopeImpl$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return MotionCarouselScopeImpl.getContent$lambda$1(this.f$0, i2, state, (Composer) obj, ((Integer) obj2).intValue());
            }
        });
    }
}
