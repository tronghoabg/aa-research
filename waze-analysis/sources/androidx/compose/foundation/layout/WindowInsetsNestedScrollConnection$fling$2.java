package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.an;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class WindowInsetsNestedScrollConnection$fling$2 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ WindowInsetsAnimationController $animationController;
    final /* synthetic */ int $current;
    final /* synthetic */ an $endVelocity;
    final /* synthetic */ float $flingAmount;
    final /* synthetic */ int $hidden;
    final /* synthetic */ int $shown;
    final /* synthetic */ SplineBasedFloatDecayAnimationSpec $spec;
    final /* synthetic */ boolean $targetShown;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ WindowInsetsAnimationController $animationController;
        final /* synthetic */ int $current;
        final /* synthetic */ an $endVelocity;
        final /* synthetic */ float $flingAmount;
        final /* synthetic */ int $hidden;
        final /* synthetic */ int $shown;
        final /* synthetic */ SplineBasedFloatDecayAnimationSpec $spec;
        final /* synthetic */ boolean $targetShown;
        int label;
        final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i2, float f2, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, int i3, int i4, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, an anVar, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$current = i2;
            this.$flingAmount = f2;
            this.$spec = splineBasedFloatDecayAnimationSpec;
            this.$hidden = i3;
            this.$shown = i4;
            this.this$0 = windowInsetsNestedScrollConnection;
            this.$endVelocity = anVar;
            this.$animationController = windowInsetsAnimationController;
            this.$targetShown = z;
        }

        static final ab invokeSuspend$lambda$0(int i2, int i3, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, an anVar, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, float f2, float f3) {
            if (f2 > i3 || i2 > f2) {
                anVar.f48102a = f3;
                windowInsetsAnimationController.finish(z);
                windowInsetsNestedScrollConnection.animationController = null;
                br brVar = windowInsetsNestedScrollConnection.animationJob;
                if (brVar != null) {
                    brVar.s(new WindowInsetsAnimationCancelledException());
                }
            } else {
                windowInsetsNestedScrollConnection.adjustInsets(f2);
            }
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, this.this$0, this.$endVelocity, this.$animationController, this.$targetShown, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                int i3 = this.$current;
                float f2 = this.$flingAmount;
                SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = this.$spec;
                final int i4 = this.$hidden;
                final int i5 = this.$shown;
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
                final an anVar = this.$endVelocity;
                final WindowInsetsAnimationController windowInsetsAnimationController = this.$animationController;
                final boolean z = this.$targetShown;
                p pVar = new p() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1$$ExternalSyntheticLambda0
                    @Override // h.g.a.p
                    public final Object invoke(Object obj2, Object obj3) {
                        return WindowInsetsNestedScrollConnection$fling$2.AnonymousClass1.invokeSuspend$lambda$0(i4, i5, windowInsetsNestedScrollConnection, anVar, windowInsetsAnimationController, z, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                    }
                };
                AnonymousClass1 anonymousClass1 = this;
                this.label = 1;
                if (SuspendAnimationKt.animateDecay(i3, f2, splineBasedFloatDecayAnimationSpec, (p<? super Float, ? super Float, ab>) pVar, anonymousClass1) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowInsetsNestedScrollConnection$fling$2(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i2, float f2, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, int i3, int i4, an anVar, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, e<? super WindowInsetsNestedScrollConnection$fling$2> eVar) {
        super(2, eVar);
        this.this$0 = windowInsetsNestedScrollConnection;
        this.$current = i2;
        this.$flingAmount = f2;
        this.$spec = splineBasedFloatDecayAnimationSpec;
        this.$hidden = i3;
        this.$shown = i4;
        this.$endVelocity = anVar;
        this.$animationController = windowInsetsAnimationController;
        this.$targetShown = z;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(this.this$0, this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, this.$endVelocity, this.$animationController, this.$targetShown, eVar);
        windowInsetsNestedScrollConnection$fling$2.L$0 = obj;
        return windowInsetsNestedScrollConnection$fling$2;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((WindowInsetsNestedScrollConnection$fling$2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            af afVar = (af) this.L$0;
            WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
            windowInsetsNestedScrollConnection.animationJob = aj.z(afVar, null, null, new AnonymousClass1(this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, windowInsetsNestedScrollConnection, this.$endVelocity, this.$animationController, this.$targetShown, null), 3);
            br brVar = this.this$0.animationJob;
            if (brVar != null) {
                this.label = 1;
                if (brVar.m(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        this.this$0.animationJob = null;
        return ab.f48028a;
    }
}
