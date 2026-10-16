package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.material3.SearchBarState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.LayoutCoordinates;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.q;
import h.k.n;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SearchBarState {
    public static final int $stable = 0;
    private static final float Collapsed = 0.0f;
    public static final Companion Companion = new Companion(null);
    private static final float Expanded = 1.0f;
    private final Animatable<Float, AnimationVector1D> animatable;
    private final AnimationSpec<Float> animationSpecForCollapse;
    private final AnimationSpec<Float> animationSpecForContentFadeIn;
    private final AnimationSpec<Float> animationSpecForContentFadeOut;
    private final AnimationSpec<Float> animationSpecForExpand;
    private final MutableState collapsedCoords$delegate;
    private final Animatable<Float, AnimationVector1D> contentAnimatable;
    private final State currentValue$delegate;
    private final MutableState expandsToFullScreen$delegate;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.SearchBarState$animateToCollapsed$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super br>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material3.SearchBarState$animateToCollapsed$2$1, reason: invalid class name */
        final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
            int label;
            final /* synthetic */ SearchBarState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SearchBarState searchBarState, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.this$0 = searchBarState;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass1(this.this$0, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.this$0.contentAnimatable, new Float(0.0f), this.this$0.animationSpecForContentFadeOut, null, null, this, 12, null) == aVar) {
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
        }

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material3.SearchBarState$animateToCollapsed$2$2, reason: invalid class name and collision with other inner class name */
        final class C00702 extends g implements p<af, e<? super ab>, Object> {
            int label;
            final /* synthetic */ SearchBarState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00702(SearchBarState searchBarState, e<? super C00702> eVar) {
                super(2, eVar);
                this.this$0 = searchBarState;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new C00702(this.this$0, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((C00702) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.this$0.getAnimatable$material3(), new Float(0.0f), this.this$0.getAnimationSpecForCollapse$material3(), null, null, this, 12, null) == aVar) {
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
        }

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = SearchBarState.this.new AnonymousClass2(eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super br> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            af afVar = (af) this.L$0;
            aj.z(afVar, null, null, new AnonymousClass1(SearchBarState.this, null), 3);
            return aj.z(afVar, null, null, new C00702(SearchBarState.this, null), 3);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.SearchBarState$animateToExpanded$2, reason: invalid class name and case insensitive filesystem */
    final class C03502 extends g implements p<af, e<? super br>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material3.SearchBarState$animateToExpanded$2$1, reason: invalid class name */
        final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
            int label;
            final /* synthetic */ SearchBarState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SearchBarState searchBarState, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.this$0 = searchBarState;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass1(this.this$0, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.this$0.getAnimatable$material3(), new Float(1.0f), this.this$0.getAnimationSpecForExpand$material3(), null, null, this, 12, null) == aVar) {
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
        }

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material3.SearchBarState$animateToExpanded$2$2, reason: invalid class name and collision with other inner class name */
        final class C00712 extends g implements p<af, e<? super ab>, Object> {
            int label;
            final /* synthetic */ SearchBarState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00712(SearchBarState searchBarState, e<? super C00712> eVar) {
                super(2, eVar);
                this.this$0 = searchBarState;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new C00712(this.this$0, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((C00712) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.this$0.contentAnimatable, new Float(1.0f), this.this$0.animationSpecForContentFadeIn, null, null, this, 12, null) == aVar) {
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
        }

        C03502(e<? super C03502> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C03502 c03502 = SearchBarState.this.new C03502(eVar);
            c03502.L$0 = obj;
            return c03502;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super br> eVar) {
            return ((C03502) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            af afVar = (af) this.L$0;
            aj.z(afVar, null, null, new AnonymousClass1(SearchBarState.this, null), 3);
            return aj.z(afVar, null, null, new C00712(SearchBarState.this, null), 3);
        }
    }

    public SearchBarState(SearchBarValue searchBarValue, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2) {
        this(AnimatableKt.Animatable$default(searchBarValue == SearchBarValue.Expanded ? 1.0f : 0.0f, 0.0f, 2, null), AnimatableKt.Animatable$default(searchBarValue != SearchBarValue.Expanded ? 0.0f : 1.0f, 0.0f, 2, null), animationSpec, animationSpec2, AnimationSpecKt.snap$default(0, 1, null), AnimationSpecKt.snap$default(0, 1, null));
    }

    static final SearchBarValue currentValue_delegate$lambda$0(SearchBarState searchBarState) {
        return searchBarState.animatable.getValue().floatValue() <= 0.02f ? SearchBarValue.Collapsed : SearchBarValue.Expanded;
    }

    public final Object animateToCollapsed(e<? super ab> eVar) {
        Object objD = aj.d(new AnonymousClass2(null), eVar);
        return objD == a.f48038a ? objD : ab.f48028a;
    }

    public final Object animateToExpanded(e<? super ab> eVar) {
        Object objD = aj.d(new C03502(null), eVar);
        return objD == a.f48038a ? objD : ab.f48028a;
    }

    public final Animatable<Float, AnimationVector1D> getAnimatable$material3() {
        return this.animatable;
    }

    public final AnimationSpec<Float> getAnimationSpecForCollapse$material3() {
        return this.animationSpecForCollapse;
    }

    public final AnimationSpec<Float> getAnimationSpecForExpand$material3() {
        return this.animationSpecForExpand;
    }

    public final LayoutCoordinates getCollapsedCoords() {
        return (LayoutCoordinates) this.collapsedCoords$delegate.getValue();
    }

    public final float getContentProgress$material3() {
        return n.g(this.contentAnimatable.getValue().floatValue(), 0.0f, 1.0f);
    }

    public final SearchBarValue getCurrentValue() {
        return (SearchBarValue) this.currentValue$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getExpandsToFullScreen$material3() {
        return ((Boolean) this.expandsToFullScreen$delegate.getValue()).booleanValue();
    }

    public final float getProgress() {
        return n.g(this.animatable.getValue().floatValue(), 0.0f, 1.0f);
    }

    public final SearchBarValue getTargetValue() {
        return this.animatable.getTargetValue().floatValue() == 1.0f ? SearchBarValue.Expanded : SearchBarValue.Collapsed;
    }

    public final boolean isAnimating() {
        return this.animatable.isRunning();
    }

    public final void setCollapsedCoords(LayoutCoordinates layoutCoordinates) {
        this.collapsedCoords$delegate.setValue(layoutCoordinates);
    }

    public final void setExpandsToFullScreen$material3(boolean z) {
        this.expandsToFullScreen$delegate.setValue(Boolean.valueOf(z));
    }

    public final Object snapTo(float f2, e<? super ab> eVar) {
        Object objSnapTo = this.animatable.snapTo(new Float(f2), eVar);
        return objSnapTo == a.f48038a ? objSnapTo : ab.f48028a;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final SearchBarState Saver$lambda$1(AnimationSpec animationSpec, AnimationSpec animationSpec2, List list) {
            Object obj = list.get(0);
            q qVar = q.f48127a;
            return new SearchBarState(new Animatable(obj, VectorConvertersKt.getVectorConverter(qVar), null, null, 12, null), new Animatable(list.get(1), VectorConvertersKt.getVectorConverter(qVar), null, null, 12, null), animationSpec, animationSpec2, AnimationSpecKt.snap$default(0, 1, null), AnimationSpecKt.snap$default(0, 1, null), null);
        }

        static final SearchBarState Saver$lambda$3(AnimationSpec animationSpec, AnimationSpec animationSpec2, AnimationSpec animationSpec3, AnimationSpec animationSpec4, List list) {
            Object obj = list.get(0);
            q qVar = q.f48127a;
            return new SearchBarState(new Animatable(obj, VectorConvertersKt.getVectorConverter(qVar), null, null, 12, null), new Animatable(list.get(1), VectorConvertersKt.getVectorConverter(qVar), null, null, 12, null), animationSpec, animationSpec2, animationSpec3, animationSpec4, null);
        }

        public final Saver<SearchBarState, ?> Saver(final AnimationSpec<Float> animationSpec, final AnimationSpec<Float> animationSpec2) {
            return ListSaverKt.listSaver(new p() { // from class: androidx.compose.material3.SearchBarState$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    SearchBarState searchBarState = (SearchBarState) obj2;
                    return i.i(Float.valueOf(searchBarState.getProgress()), Float.valueOf(searchBarState.getContentProgress$material3()));
                }
            }, new l() { // from class: androidx.compose.material3.SearchBarState$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return SearchBarState.Companion.Saver$lambda$1(animationSpec, animationSpec2, (List) obj);
                }
            });
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final Saver<SearchBarState, ?> Saver(final AnimationSpec<Float> animationSpec, final AnimationSpec<Float> animationSpec2, final AnimationSpec<Float> animationSpec3, final AnimationSpec<Float> animationSpec4) {
            return ListSaverKt.listSaver(new p() { // from class: androidx.compose.material3.SearchBarState$Companion$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    SearchBarState searchBarState = (SearchBarState) obj2;
                    return i.i(Float.valueOf(searchBarState.getProgress()), Float.valueOf(searchBarState.getContentProgress$material3()));
                }
            }, new l() { // from class: androidx.compose.material3.SearchBarState$Companion$$ExternalSyntheticLambda3
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return SearchBarState.Companion.Saver$lambda$3(animationSpec, animationSpec2, animationSpec3, animationSpec4, (List) obj);
                }
            });
        }
    }

    private SearchBarState(Animatable<Float, AnimationVector1D> animatable, Animatable<Float, AnimationVector1D> animatable2, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2, AnimationSpec<Float> animationSpec3, AnimationSpec<Float> animationSpec4) {
        this.animatable = animatable;
        this.contentAnimatable = animatable2;
        this.animationSpecForExpand = animationSpec;
        this.animationSpecForCollapse = animationSpec2;
        this.animationSpecForContentFadeIn = animationSpec3;
        this.animationSpecForContentFadeOut = animationSpec4;
        this.expandsToFullScreen$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.collapsedCoords$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentValue$delegate = SnapshotStateKt.derivedStateOf(new h.g.a.a() { // from class: androidx.compose.material3.SearchBarState$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return SearchBarState.currentValue_delegate$lambda$0(this.f$0);
            }
        });
    }

    public /* synthetic */ SearchBarState(Animatable animatable, Animatable animatable2, AnimationSpec animationSpec, AnimationSpec animationSpec2, AnimationSpec animationSpec3, AnimationSpec animationSpec4, o oVar) {
        this(animatable, animatable2, animationSpec, animationSpec2, animationSpec3, animationSpec4);
    }

    public SearchBarState(SearchBarValue searchBarValue, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2, AnimationSpec<Float> animationSpec3, AnimationSpec<Float> animationSpec4) {
        this(AnimatableKt.Animatable$default(searchBarValue == SearchBarValue.Expanded ? 1.0f : 0.0f, 0.0f, 2, null), AnimatableKt.Animatable$default(searchBarValue != SearchBarValue.Expanded ? 0.0f : 1.0f, 0.0f, 2, null), animationSpec, animationSpec2, animationSpec3, animationSpec4);
    }
}
