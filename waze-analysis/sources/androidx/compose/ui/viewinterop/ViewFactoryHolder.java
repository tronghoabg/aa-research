package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements ViewRootForInspector {
    public static final int $stable = 8;
    private final int compositeKeyHash;
    private final NestedScrollDispatcher dispatcher;
    private l<? super T, ab> releaseBlock;
    private l<? super T, ab> resetBlock;
    private SaveableStateRegistry.Entry savableRegistryEntry;
    private final String saveStateKey;
    private final SaveableStateRegistry saveStateRegistry;
    private final T typedView;
    private l<? super T, ab> updateBlock;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder$registerSaveStateProvider$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements a<Object> {
        final /* synthetic */ ViewFactoryHolder<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.this$0 = viewFactoryHolder;
        }

        @Override // h.g.a.a
        public final Object invoke() {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            ((ViewFactoryHolder) this.this$0).typedView.saveHierarchyState(sparseArray);
            return sparseArray;
        }
    }

    private ViewFactoryHolder(Context context, CompositionContext compositionContext, T t, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, int i2, Owner owner) {
        super(context, compositionContext, i2, nestedScrollDispatcher, t, owner);
        this.typedView = t;
        this.dispatcher = nestedScrollDispatcher;
        this.saveStateRegistry = saveableStateRegistry;
        this.compositeKeyHash = i2;
        setClipChildren(false);
        String strValueOf = String.valueOf(i2);
        this.saveStateKey = strValueOf;
        Object objConsumeRestored = saveableStateRegistry != null ? saveableStateRegistry.consumeRestored(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objConsumeRestored instanceof SparseArray ? (SparseArray) objConsumeRestored : null;
        if (sparseArray != null) {
            t.restoreHierarchyState(sparseArray);
        }
        registerSaveStateProvider();
        this.updateBlock = AndroidView_androidKt.getNoOpUpdate();
        this.resetBlock = AndroidView_androidKt.getNoOpUpdate();
        this.releaseBlock = AndroidView_androidKt.getNoOpUpdate();
    }

    private final void registerSaveStateProvider() {
        SaveableStateRegistry saveableStateRegistry = this.saveStateRegistry;
        if (saveableStateRegistry != null) {
            setSavableRegistryEntry(saveableStateRegistry.registerProvider(this.saveStateKey, new AnonymousClass1(this)));
        }
    }

    private final void setSavableRegistryEntry(SaveableStateRegistry.Entry entry) {
        SaveableStateRegistry.Entry entry2 = this.savableRegistryEntry;
        if (entry2 != null) {
            entry2.unregister();
        }
        this.savableRegistryEntry = entry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterSaveStateProvider() {
        setSavableRegistryEntry(null);
    }

    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public final l<T, ab> getReleaseBlock() {
        return this.releaseBlock;
    }

    public final l<T, ab> getResetBlock() {
        return this.resetBlock;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public /* synthetic */ AbstractComposeView getSubCompositionView() {
        return null;
    }

    public final l<T, ab> getUpdateBlock() {
        return this.updateBlock;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(l<? super T, ab> lVar) {
        this.releaseBlock = lVar;
        setRelease(new ViewFactoryHolder$releaseBlock$1(this));
    }

    public final void setResetBlock(l<? super T, ab> lVar) {
        this.resetBlock = lVar;
        setReset(new ViewFactoryHolder$resetBlock$1(this));
    }

    public final void setUpdateBlock(l<? super T, ab> lVar) {
        this.updateBlock = lVar;
        setUpdate(new ViewFactoryHolder$updateBlock$1(this));
    }

    /* synthetic */ ViewFactoryHolder(Context context, CompositionContext compositionContext, View view, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, int i2, Owner owner, int i3, o oVar) {
        this(context, (i3 & 2) != 0 ? null : compositionContext, view, (i3 & 8) != 0 ? new NestedScrollDispatcher() : nestedScrollDispatcher, saveableStateRegistry, i2, owner);
    }

    public ViewFactoryHolder(Context context, l<? super Context, ? extends T> lVar, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i2, Owner owner) {
        this(context, compositionContext, lVar.invoke(context), null, saveableStateRegistry, i2, owner, 8, null);
    }

    public /* synthetic */ ViewFactoryHolder(Context context, l lVar, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i2, Owner owner, int i3, o oVar) {
        this(context, lVar, (i3 & 4) != 0 ? null : compositionContext, saveableStateRegistry, i2, owner);
    }
}
