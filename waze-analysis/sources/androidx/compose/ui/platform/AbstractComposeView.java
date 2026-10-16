package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.node.Owner;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.waze.R;
import h.ab;
import h.g.a.a;
import h.g.b.o;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class AbstractComposeView extends ViewGroup {
    public static final int $stable = 8;
    private WeakReference<CompositionContext> cachedViewTreeCompositionContext;
    private ComposeViewContext composeViewContext;
    private Composition composition;
    private boolean creatingComposition;
    private a<ab> disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;
    private CompositionContext parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.disposeViewCompositionStrategy = ViewCompositionStrategy.Companion.getDefault().installFor(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachedToWindow() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.composeViewContext == null) {
                AndroidComposeView androidComposeView = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof AndroidComposeView) {
                        androidComposeView = (AndroidComposeView) childAt;
                    }
                }
                if (androidComposeView != null) {
                    androidComposeView.setComposeViewContext(updateAutoCreatedComposeViewContext(ComposeView_androidKt.findViewTreeComposeViewRoot(this), androidComposeView.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                ensureCompositionCreated();
            }
        }
    }

    private final CompositionContext cacheIfAlive(CompositionContext compositionContext) {
        CompositionContext compositionContext2 = true != isAlive(compositionContext) ? null : compositionContext;
        if (compositionContext2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(compositionContext2);
        }
        return compositionContext;
    }

    private final void checkAddView() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void ensureCompositionCreated() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    ComposeViewContext composeViewContextResolveComposeViewContext = this.composeViewContext;
                    if (composeViewContextResolveComposeViewContext == null) {
                        composeViewContextResolveComposeViewContext = resolveComposeViewContext();
                    }
                    this.composition = Wrapper_androidKt.setContent(this, composeViewContextResolveComposeViewContext, ComposableLambdaKt.composableLambdaInstance(1003123809, true, new AbstractComposeView$ensureCompositionCreated$1$1(this)));
                } finally {
                    Trace.endSection();
                }
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    private final boolean isAlive(CompositionContext compositionContext) {
        return !(compositionContext instanceof Recomposer) || ((Recomposer.State) ((Recomposer) compositionContext).getCurrentState().d()).compareTo(Recomposer.State.ShuttingDown) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.ui.platform.ComposeViewContext resolveComposeViewContext() {
        /*
            r9 = this;
            r0 = r9
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r0 = r0.getChildCount()
            r1 = 0
            if (r0 != 0) goto Lc
        La:
            r0 = r1
            goto L1f
        Lc:
            r0 = 0
            android.view.View r0 = r9.getChildAt(r0)
            boolean r2 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r2 == 0) goto L18
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            goto L19
        L18:
            r0 = r1
        L19:
            if (r0 == 0) goto La
            androidx.compose.ui.platform.ComposeViewContext r0 = r0.getComposeViewContext()
        L1f:
            r2 = r9
            android.view.View r2 = (android.view.View) r2
            android.view.View r4 = androidx.compose.ui.platform.ComposeView_androidKt.access$findViewTreeComposeViewRoot(r2)
            androidx.compose.ui.platform.ComposeViewContext r2 = androidx.compose.ui.platform.ComposeView_androidKt.getComposeViewContext(r4)
            if (r2 != 0) goto L7c
            androidx.compose.runtime.CompositionContext r5 = r9.resolveParentCompositionContext()
            androidx.lifecycle.LifecycleOwner r9 = androidx.lifecycle.ViewTreeLifecycleOwner.get(r4)
            if (r9 != 0) goto L49
            if (r0 == 0) goto L3d
            androidx.lifecycle.LifecycleOwner r9 = r0.getLifecycleOwner$ui()
            goto L3e
        L3d:
            r9 = r1
        L3e:
            if (r9 == 0) goto L41
            goto L49
        L41:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Composed into the View which doesn't propagate ViewTreeLifecycleOwner!"
            r9.<init>(r0)
            throw r9
        L49:
            r6 = r9
            androidx.savedstate.SavedStateRegistryOwner r9 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.get(r4)
            if (r9 != 0) goto L63
            if (r0 == 0) goto L57
            androidx.savedstate.SavedStateRegistryOwner r9 = r0.getSavedStateRegistryOwner$ui()
            goto L58
        L57:
            r9 = r1
        L58:
            if (r9 == 0) goto L5b
            goto L63
        L5b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!"
            r9.<init>(r0)
            throw r9
        L63:
            r7 = r9
            androidx.lifecycle.ViewModelStoreOwner r9 = androidx.lifecycle.ViewTreeViewModelStoreOwner.get(r4)
            if (r9 != 0) goto L72
            if (r0 == 0) goto L70
            androidx.lifecycle.ViewModelStoreOwner r1 = r0.getViewModelStoreOwner$ui()
        L70:
            r8 = r1
            goto L73
        L72:
            r8 = r9
        L73:
            androidx.compose.ui.platform.ComposeViewContext r3 = new androidx.compose.ui.platform.ComposeViewContext
            r3.<init>(r4, r5, r6, r7, r8)
            androidx.compose.ui.platform.ComposeView_androidKt.setComposeViewContext(r4, r3)
            return r3
        L7c:
            androidx.compose.ui.platform.ComposeViewContext r9 = r9.updateAutoCreatedComposeViewContext(r4, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AbstractComposeView.resolveComposeViewContext():androidx.compose.ui.platform.ComposeViewContext");
    }

    private final CompositionContext resolveParentCompositionContext() {
        CompositionContext compositionContext;
        CompositionContext compositionContext2 = this.parentContext;
        if (compositionContext2 != null) {
            return compositionContext2;
        }
        AbstractComposeView abstractComposeView = this;
        CompositionContext compositionContextFindViewTreeCompositionContext = WindowRecomposer_androidKt.findViewTreeCompositionContext(abstractComposeView);
        CompositionContext compositionContext3 = null;
        if (compositionContextFindViewTreeCompositionContext != null) {
            cacheIfAlive(compositionContextFindViewTreeCompositionContext);
        } else {
            compositionContextFindViewTreeCompositionContext = null;
        }
        if (compositionContextFindViewTreeCompositionContext != null) {
            return compositionContextFindViewTreeCompositionContext;
        }
        WeakReference<CompositionContext> weakReference = this.cachedViewTreeCompositionContext;
        if (weakReference != null && (compositionContext = weakReference.get()) != null && true == isAlive(compositionContext)) {
            compositionContext3 = compositionContext;
        }
        if (compositionContext3 != null) {
            return compositionContext3;
        }
        Recomposer windowRecomposer = WindowRecomposer_androidKt.getWindowRecomposer(abstractComposeView);
        cacheIfAlive(windowRecomposer);
        return windowRecomposer;
    }

    private final void setParentContext(CompositionContext compositionContext) {
        if (this.parentContext != compositionContext) {
            this.parentContext = compositionContext;
            if (compositionContext != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            Composition composition = this.composition;
            if (composition != null) {
                composition.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    ensureCompositionCreated();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    private final ComposeViewContext updateAutoCreatedComposeViewContext(View view, ComposeViewContext composeViewContext) {
        CompositionContext compositionContextResolveParentCompositionContext = resolveParentCompositionContext();
        LifecycleOwner lifecycleOwner$ui = ViewTreeLifecycleOwner.get(view);
        ViewModelStoreOwner viewModelStoreOwner = ViewTreeViewModelStoreOwner.get(view);
        SavedStateRegistryOwner savedStateRegistryOwner$ui = ViewTreeSavedStateRegistryOwner.get(view);
        if (compositionContextResolveParentCompositionContext == composeViewContext.getCompositionContext$ui() && lifecycleOwner$ui == composeViewContext.getLifecycleOwner$ui() && viewModelStoreOwner == composeViewContext.getViewModelStoreOwner$ui() && savedStateRegistryOwner$ui == composeViewContext.getSavedStateRegistryOwner$ui()) {
            return composeViewContext;
        }
        if (compositionContextResolveParentCompositionContext.getEffectCoroutineContext() != composeViewContext.getCompositionContext$ui().getEffectCoroutineContext()) {
            disposeComposition();
        }
        if (lifecycleOwner$ui == null) {
            lifecycleOwner$ui = composeViewContext.getLifecycleOwner$ui();
        }
        LifecycleOwner lifecycleOwner = lifecycleOwner$ui;
        if (savedStateRegistryOwner$ui == null) {
            savedStateRegistryOwner$ui = composeViewContext.getSavedStateRegistryOwner$ui();
        }
        ComposeViewContext composeViewContextCopy = composeViewContext.copy(view, compositionContextResolveParentCompositionContext, lifecycleOwner, savedStateRegistryOwner$ui, viewModelStoreOwner);
        ComposeView_androidKt.setComposeViewContext(view, composeViewContextCopy);
        return composeViewContextCopy;
    }

    public abstract void Content(Composer composer, int i2);

    @Override // android.view.ViewGroup
    public void addView(View view) {
        checkAddView();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        return super.addViewInLayout(view, i2, layoutParams);
    }

    public final void createComposition() {
        ComposeViewContext composeViewContext;
        View view$ui;
        if (this.parentContext == null && !isAttachedToWindow() && ((composeViewContext = this.composeViewContext) == null || (view$ui = composeViewContext.getView$ui()) == null || !view$ui.isAttachedToWindow())) {
            throw new IllegalStateException("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
        ensureCompositionCreated();
    }

    public final void disposeComposition() {
        View childAt = getChildAt(0);
        AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
        if (androidComposeView != null) {
            androidComposeView.removeConnectionToComposeViewContext();
        }
        Composition composition = this.composition;
        if (composition != null) {
            composition.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m10173getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        AutoClearFocusBehavior autoClearFocusBehavior = tag instanceof AutoClearFocusBehavior ? (AutoClearFocusBehavior) tag : null;
        return autoClearFocusBehavior != null ? autoClearFocusBehavior.m10209unboximpl() : AutoClearFocusBehavior.Companion.m10211getDefault4UtRPd4();
    }

    public final ComposeViewContext getComposeViewContext$ui() {
        return this.composeViewContext;
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui(boolean z, int i2, int i3, int i4, int i5) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i4 - i2) - getPaddingRight(), (i5 - i3) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui(int i2, int i3) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i2, i3);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i2)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i3) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i3)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (WindowRecomposer_androidKt.getContentChild(this).getParent() == null) {
            getHandler().postAtFrontOfQueue(new Runnable() { // from class: androidx.compose.ui.platform.AbstractComposeView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.attachedToWindow();
                }
            });
        } else {
            attachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        internalOnLayout$ui(z, i2, i3, i4, i5);
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) {
        ensureCompositionCreated();
        internalOnMeasure$ui(i2, i3);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i2);
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m10174setAutoClearFocusBehavior17tfJxM(int i2) {
        setTag(R.id.auto_clear_focus_behavior_tag, AutoClearFocusBehavior.m10203boximpl(i2));
    }

    public final void setComposeViewContext$ui(ComposeViewContext composeViewContext) {
        if (this.composeViewContext != composeViewContext) {
            if (composeViewContext == null) {
                disposeComposition();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
                if (androidComposeView != null) {
                    if (androidComposeView.getCoroutineContext() != composeViewContext.getCompositionContext$ui().getEffectCoroutineContext()) {
                        disposeComposition();
                    }
                    androidComposeView.setComposeViewContext(composeViewContext);
                }
            }
            this.composeViewContext = composeViewContext;
        }
    }

    public final void setParentCompositionContext(CompositionContext compositionContext) {
        setParentContext(compositionContext);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(ViewCompositionStrategy viewCompositionStrategy) {
        a<ab> aVar = this.disposeViewCompositionStrategy;
        if (aVar != null) {
            aVar.invoke();
        }
        this.disposeViewCompositionStrategy = viewCompositionStrategy.installFor(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        checkAddView();
        super.addView(view, i2);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        checkAddView();
        return super.addViewInLayout(view, i2, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, int i3) {
        checkAddView();
        super.addView(view, i2, i3);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, i2, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AbstractComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i2, int i3, o oVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    public final void createComposition(ComposeViewContext composeViewContext) {
        if (composeViewContext.getView$ui().isAttachedToWindow()) {
            setComposeViewContext$ui(composeViewContext);
            ensureCompositionCreated();
            return;
        }
        throw new IllegalStateException("createComposition requires the ComposeViewContext's view to be attached to a window.");
    }
}
