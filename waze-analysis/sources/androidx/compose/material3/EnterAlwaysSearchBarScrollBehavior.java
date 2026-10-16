package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.Velocity;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.an;
import h.g.b.o;
import h.g.b.x;
import h.k.n;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class EnterAlwaysSearchBarScrollBehavior implements SearchBarScrollBehavior {
    public static final Companion Companion = new Companion(null);
    private final MutableFloatState _contentOffset$delegate;
    private final MutableFloatState _scrollOffset$delegate;
    private final MutableFloatState _scrollOffsetLimit$delegate;
    private final a<Boolean> canScroll;
    private final DecayAnimationSpec<Float> flingAnimationSpec;
    private final NestedScrollConnection nestedScrollConnection = new NestedScrollConnection() { // from class: androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$nestedScrollConnection$1
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostFling-RZ2iAVY */
        public Object mo2297onPostFlingRZ2iAVY(long j2, long j3, e<? super Velocity> eVar) {
            return !this.this$0.getCanScroll().invoke().booleanValue() ? Velocity.m11397boximpl(Velocity.Companion.m11417getZero9UxMQ8M()) : this.this$0.m4798settleSearchBarOhffZ5M(Velocity.m11407getYimpl(j3), eVar);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostScroll-DzOQY0M */
        public long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2) {
            if (!this.this$0.getCanScroll().invoke().booleanValue()) {
                return Offset.Companion.m7996getZeroF1C5BW0();
            }
            if (this.this$0.getReverseLayout()) {
                int i3 = (int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
                if (Float.intBitsToFloat(i3) > 0.0f) {
                    EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior = this.this$0;
                    enterAlwaysSearchBarScrollBehavior.setScrollOffset(enterAlwaysSearchBarScrollBehavior.getScrollOffset() + Float.intBitsToFloat(i3));
                    EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior2 = this.this$0;
                    enterAlwaysSearchBarScrollBehavior2.setContentOffset(enterAlwaysSearchBarScrollBehavior2.getContentOffset() + Float.intBitsToFloat(i3));
                    return Offset.m7974copydBAh8RU$default(j3, 0.0f, 0.0f, 2, null);
                }
            }
            if (!this.this$0.getReverseLayout()) {
                EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior3 = this.this$0;
                int i4 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
                enterAlwaysSearchBarScrollBehavior3.setScrollOffset(enterAlwaysSearchBarScrollBehavior3.getScrollOffset() + Float.intBitsToFloat(i4));
                EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior4 = this.this$0;
                enterAlwaysSearchBarScrollBehavior4.setContentOffset(enterAlwaysSearchBarScrollBehavior4.getContentOffset() + Float.intBitsToFloat(i4));
            }
            return Offset.Companion.m7996getZeroF1C5BW0();
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreFling-QWom1Mo */
        public /* synthetic */ Object mo2299onPreFlingQWom1Mo(long j2, e eVar) {
            return NestedScrollConnection.CC.m9452onPreFlingQWom1Mo$suspendImpl(this, j2, eVar);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreScroll-OzD1aCk */
        public long mo2300onPreScrollOzD1aCk(long j2, int i2) {
            if (!this.this$0.getCanScroll().invoke().booleanValue()) {
                return Offset.Companion.m7996getZeroF1C5BW0();
            }
            EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior = this.this$0;
            int i3 = (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2);
            float scrollOffset = enterAlwaysSearchBarScrollBehavior.getScrollOffset();
            enterAlwaysSearchBarScrollBehavior.setScrollOffset(enterAlwaysSearchBarScrollBehavior.getScrollOffset() + Float.intBitsToFloat(i3));
            return (this.this$0.getReverseLayout() || scrollOffset == this.this$0.getScrollOffset()) ? Offset.Companion.m7996getZeroF1C5BW0() : Offset.m7974copydBAh8RU$default(j2, 0.0f, 0.0f, 2, null);
        }
    };
    private final boolean reverseLayout;
    private final AnimationSpec<Float> snapAnimationSpec;

    public EnterAlwaysSearchBarScrollBehavior(float f2, float f3, float f4, a<Boolean> aVar, boolean z, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec) {
        this.canScroll = aVar;
        this.reverseLayout = z;
        this.snapAnimationSpec = animationSpec;
        this.flingAnimationSpec = decayAnimationSpec;
        this._scrollOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
        this._scrollOffsetLimit$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f3);
        this._contentOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f4);
    }

    private final float get_contentOffset() {
        return this._contentOffset$delegate.getFloatValue();
    }

    private final float get_scrollOffset() {
        return this._scrollOffset$delegate.getFloatValue();
    }

    private final float get_scrollOffsetLimit() {
        return this._scrollOffsetLimit$delegate.getFloatValue();
    }

    static final ab searchBarScrollBehavior$lambda$0(EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, float f2) {
        enterAlwaysSearchBarScrollBehavior.setScrollOffset(enterAlwaysSearchBarScrollBehavior.getScrollOffset() + f2);
        return ab.f48028a;
    }

    static final MeasureResult searchBarScrollBehavior$lambda$1(EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(constraints.m11113unboximpl());
        final int iB = h.h.a.b(enterAlwaysSearchBarScrollBehavior.getScrollOffset());
        int height = placeableMo9741measureBRTryo0.getHeight() + iB;
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), n.h(height, 0), null, new l() { // from class: androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return EnterAlwaysSearchBarScrollBehavior.searchBarScrollBehavior$lambda$1$0(placeableMo9741measureBRTryo0, iB, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab searchBarScrollBehavior$lambda$1$0(Placeable placeable, int i2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, i2, 0.0f, (l) null, 12, (Object) null);
        return ab.f48028a;
    }

    static final ab searchBarScrollBehavior$lambda$2(EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, IntSize intSize) {
        enterAlwaysSearchBarScrollBehavior.setScrollOffsetLimit(-((int) (intSize.m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        return ab.f48028a;
    }

    private final void set_contentOffset(float f2) {
        this._contentOffset$delegate.setFloatValue(f2);
    }

    private final void set_scrollOffset(float f2) {
        this._scrollOffset$delegate.setFloatValue(f2);
    }

    private final void set_scrollOffsetLimit(float f2) {
        this._scrollOffsetLimit$delegate.setFloatValue(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(r5, r6, false, r6, r7, 2, null) != r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f9, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(r1, r4, r5, false, r3, r7, 4, null) == r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fb, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: settleSearchBar-OhffZ5M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4798settleSearchBarOhffZ5M(float r23, h.c.e<? super androidx.compose.ui.unit.Velocity> r24) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.m4798settleSearchBarOhffZ5M(float, h.c.e):java.lang.Object");
    }

    static final ab settleSearchBar_OhffZ5M$lambda$0(an anVar, EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, an anVar2, AnimationScope animationScope) {
        float fFloatValue = ((Number) animationScope.getValue()).floatValue() - anVar.f48102a;
        float scrollOffset = enterAlwaysSearchBarScrollBehavior.getScrollOffset();
        enterAlwaysSearchBarScrollBehavior.setScrollOffset(scrollOffset + fFloatValue);
        float fAbs = Math.abs(scrollOffset - enterAlwaysSearchBarScrollBehavior.getScrollOffset());
        anVar.f48102a = ((Number) animationScope.getValue()).floatValue();
        anVar2.f48102a = ((Number) animationScope.getVelocity()).floatValue();
        if (Math.abs(fFloatValue - fAbs) > 0.5f) {
            animationScope.cancelAnimation();
        }
        return ab.f48028a;
    }

    static final ab settleSearchBar_OhffZ5M$lambda$1(EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, AnimationScope animationScope) {
        enterAlwaysSearchBarScrollBehavior.setScrollOffset(((Number) animationScope.getValue()).floatValue());
        return ab.f48028a;
    }

    public final a<Boolean> getCanScroll() {
        return this.canScroll;
    }

    @Override // androidx.compose.material3.SearchBarScrollBehavior
    public float getContentOffset() {
        return get_contentOffset();
    }

    public final DecayAnimationSpec<Float> getFlingAnimationSpec() {
        return this.flingAnimationSpec;
    }

    @Override // androidx.compose.material3.SearchBarScrollBehavior
    public NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.material3.SearchBarScrollBehavior
    public float getScrollOffset() {
        return get_scrollOffset();
    }

    @Override // androidx.compose.material3.SearchBarScrollBehavior
    public float getScrollOffsetLimit() {
        return get_scrollOffsetLimit();
    }

    public final AnimationSpec<Float> getSnapAnimationSpec() {
        return this.snapAnimationSpec;
    }

    @Override // androidx.compose.material3.SearchBarScrollBehavior
    public Modifier searchBarScrollBehavior(Modifier modifier) {
        return OnRemeasuredModifierKt.onSizeChanged(LayoutModifierKt.layout(ClipKt.clipToBounds(DraggableKt.draggable$default(modifier, DraggableKt.DraggableState(new l() { // from class: androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return EnterAlwaysSearchBarScrollBehavior.searchBarScrollBehavior$lambda$0(this.f$0, ((Float) obj).floatValue());
            }
        }), Orientation.Vertical, this.canScroll.invoke().booleanValue(), null, false, null, new AnonymousClass2(null), false, DisplayStrings.DS_TRIP_OVERVIEW_PTL_LABEL, null)), new q() { // from class: androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$$ExternalSyntheticLambda4
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return EnterAlwaysSearchBarScrollBehavior.searchBarScrollBehavior$lambda$1(this.f$0, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            }
        }), new l() { // from class: androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$$ExternalSyntheticLambda5
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return EnterAlwaysSearchBarScrollBehavior.searchBarScrollBehavior$lambda$2(this.f$0, (IntSize) obj);
            }
        });
    }

    @Override // androidx.compose.material3.SearchBarScrollBehavior
    public void setContentOffset(float f2) {
        set_contentOffset(f2);
    }

    @Override // androidx.compose.material3.SearchBarScrollBehavior
    public void setScrollOffset(float f2) {
        set_scrollOffset(n.g(f2, getScrollOffsetLimit(), 0.0f));
    }

    @Override // androidx.compose.material3.SearchBarScrollBehavior
    public void setScrollOffsetLimit(float f2) {
        set_scrollOffsetLimit(f2);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final EnterAlwaysSearchBarScrollBehavior Saver$lambda$1(a aVar, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, List list) {
            Object obj = list.get(0);
            x.d(obj, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) obj).floatValue();
            Object obj2 = list.get(1);
            x.d(obj2, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue2 = ((Float) obj2).floatValue();
            Object obj3 = list.get(2);
            x.d(obj3, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue3 = ((Float) obj3).floatValue();
            Object obj4 = list.get(3);
            x.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
            return new EnterAlwaysSearchBarScrollBehavior(fFloatValue, fFloatValue2, fFloatValue3, aVar, ((Boolean) obj4).booleanValue(), animationSpec, decayAnimationSpec);
        }

        public final Saver<EnterAlwaysSearchBarScrollBehavior, ?> Saver(final a<Boolean> aVar, final AnimationSpec<Float> animationSpec, final DecayAnimationSpec<Float> decayAnimationSpec) {
            return ListSaverKt.listSaver(new p() { // from class: androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior = (EnterAlwaysSearchBarScrollBehavior) obj2;
                    return i.i(Float.valueOf(enterAlwaysSearchBarScrollBehavior.getScrollOffset()), Float.valueOf(enterAlwaysSearchBarScrollBehavior.getScrollOffsetLimit()), Float.valueOf(enterAlwaysSearchBarScrollBehavior.getContentOffset()), Boolean.valueOf(enterAlwaysSearchBarScrollBehavior.getReverseLayout()));
                }
            }, new l() { // from class: androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return EnterAlwaysSearchBarScrollBehavior.Companion.Saver$lambda$1(aVar, animationSpec, decayAnimationSpec, (List) obj);
                }
            });
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements q<af, Float, e<? super ab>, Object> {
        /* synthetic */ float F$0;
        int label;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(3, eVar);
        }

        public final Object invoke(af afVar, float f2, e<? super ab> eVar) {
            AnonymousClass2 anonymousClass2 = EnterAlwaysSearchBarScrollBehavior.this.new AnonymousClass2(eVar);
            anonymousClass2.F$0 = f2;
            return anonymousClass2.invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                float f2 = this.F$0;
                this.label = 1;
                if (EnterAlwaysSearchBarScrollBehavior.this.m4798settleSearchBarOhffZ5M(f2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }

        @Override // h.g.a.q
        public /* bridge */ /* synthetic */ Object invoke(af afVar, Float f2, e<? super ab> eVar) {
            return invoke(afVar, f2.floatValue(), eVar);
        }
    }
}
