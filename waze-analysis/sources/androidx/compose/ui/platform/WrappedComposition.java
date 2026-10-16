package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionServiceKey;
import androidx.compose.runtime.CompositionServices;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.WrappedComposition;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.waze.R;
import h.ab;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import h.g.b.y;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class WrappedComposition implements Composition, LifecycleEventObserver, CompositionServices {
    private Lifecycle addedToLifecycle;
    private boolean disposed;
    private p<? super Composer, ? super Integer, ab> lastContent = ComposableSingletons$Wrapper_androidKt.INSTANCE.m10217getLambda$1759434350$ui();
    private final Composition original;
    private final AndroidComposeView owner;

    public WrappedComposition(AndroidComposeView androidComposeView, Composition composition) {
        this.owner = androidComposeView;
        this.original = composition;
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.addedToLifecycle;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
            this.addedToLifecycle = null;
        }
        this.original.dispose();
    }

    @Override // androidx.compose.runtime.CompositionServices
    public <T> T getCompositionService(CompositionServiceKey<T> compositionServiceKey) {
        Composition composition = this.original;
        CompositionServices compositionServices = composition instanceof CompositionServices ? (CompositionServices) composition : null;
        if (compositionServices != null) {
            return (T) compositionServices.getCompositionService(compositionServiceKey);
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        return this.original.getHasInvalidations();
    }

    public final Composition getOriginal() {
        return this.original;
    }

    public final AndroidComposeView getOwner() {
        return this.owner;
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.original.isDisposed();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else {
            if (event != Lifecycle.Event.ON_CREATE || this.disposed) {
                return;
            }
            setContent(this.lastContent);
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(p<? super Composer, ? super Integer, ab> pVar) {
        this.owner.setOnReadyForComposition(new AnonymousClass1(pVar));
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<ComposeViewContext, ab> {
        final /* synthetic */ p<Composer, Integer, ab> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(p<? super Composer, ? super Integer, ab> pVar) {
            super(1);
            this.$content = pVar;
        }

        static final void invoke$lambda$0(WrappedComposition wrappedComposition, Lifecycle lifecycle) {
            if (wrappedComposition.disposed) {
                return;
            }
            wrappedComposition.addedToLifecycle = lifecycle;
            lifecycle.addObserver(wrappedComposition);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ComposeViewContext composeViewContext) {
            if (WrappedComposition.this.disposed) {
                return;
            }
            final Lifecycle lifecycle = composeViewContext.getLifecycleOwner$ui().getLifecycle();
            WrappedComposition.this.lastContent = this.$content;
            if (WrappedComposition.this.addedToLifecycle != null) {
                if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                    WrappedComposition wrappedComposition = WrappedComposition.this;
                    wrappedComposition.getOriginal().setContent(ComposableLambdaKt.composableLambdaInstance(-1723985096, true, new AnonymousClass2(wrappedComposition, composeViewContext, this.$content)));
                    return;
                }
                return;
            }
            if (x.n(Looper.myLooper(), composeViewContext.getView$ui().getHandler().getLooper())) {
                WrappedComposition.this.addedToLifecycle = lifecycle;
                lifecycle.addObserver(WrappedComposition.this);
            } else {
                View view$ui = composeViewContext.getView$ui();
                final WrappedComposition wrappedComposition2 = WrappedComposition.this;
                view$ui.post(new Runnable() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        WrappedComposition.AnonymousClass1.invoke$lambda$0(wrappedComposition2, lifecycle);
                    }
                });
            }
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(ComposeViewContext composeViewContext) {
            invoke2(composeViewContext);
            return ab.f48028a;
        }

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$2, reason: invalid class name */
        final class AnonymousClass2 extends y implements p<Composer, Integer, ab> {
            final /* synthetic */ ComposeViewContext $composeViewContext;
            final /* synthetic */ p<Composer, Integer, ab> $content;
            final /* synthetic */ WrappedComposition this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(WrappedComposition wrappedComposition, ComposeViewContext composeViewContext, p<? super Composer, ? super Integer, ab> pVar) {
                super(2);
                this.this$0 = wrappedComposition;
                this.$composeViewContext = composeViewContext;
                this.$content = pVar;
            }

            public final void invoke(Composer composer, int i2) {
                if (!composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1723985096, i2, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:124)");
                }
                WrappedComposition wrappedComposition = this.this$0;
                AndroidComposeView owner = wrappedComposition.getOwner();
                boolean zChangedInstance = composer.changedInstance(wrappedComposition);
                WrappedComposition wrappedComposition2 = this.this$0;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = (p) new WrappedComposition$setContent$1$2$1$1(wrappedComposition2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                EffectsKt.LaunchedEffect(owner, (p<? super af, ? super e<? super ab>, ? extends Object>) objRememberedValue, composer, 0);
                WrappedComposition wrappedComposition3 = this.this$0;
                AndroidComposeView owner2 = wrappedComposition3.getOwner();
                boolean zChangedInstance2 = composer.changedInstance(wrappedComposition3);
                WrappedComposition wrappedComposition4 = this.this$0;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = (p) new WrappedComposition$setContent$1$2$2$1(wrappedComposition4, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                EffectsKt.LaunchedEffect(owner2, (p<? super af, ? super e<? super ab>, ? extends Object>) objRememberedValue2, composer, 0);
                this.$composeViewContext.ProvideCompositionLocals$ui(this.this$0.getOwner(), this.$content, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // h.g.a.p
            public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return ab.f48028a;
            }
        }
    }
}
