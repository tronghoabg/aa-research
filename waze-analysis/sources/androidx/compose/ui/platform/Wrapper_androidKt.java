package androidx.compose.ui.platform;

import android.view.ViewGroup;
import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.CancellationHandle;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.UiApplier;
import androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner;
import h.ab;
import h.c;
import h.g.a.a;
import h.g.b.r;
import h.g.b.u;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Wrapper_androidKt {
    private static final ViewGroup.LayoutParams DefaultLayoutParams = new ViewGroup.LayoutParams(-2, -2);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.Wrapper_androidKt$setContent$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 implements LifecycleRetainedValuesStoreOwner.FrameEndScheduler, r {
        final /* synthetic */ CompositionContext $tmp0;

        AnonymousClass1(CompositionContext compositionContext) {
            this.$tmp0 = compositionContext;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof LifecycleRetainedValuesStoreOwner.FrameEndScheduler) && (obj instanceof r)) {
                return x.n(getFunctionDelegate(), ((r) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // h.g.b.r
        public final c<?> getFunctionDelegate() {
            return new u(1, this.$tmp0, CompositionContext.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.FrameEndScheduler
        public final CancellationHandle scheduleFrameEndCallback(a<ab> aVar) {
            return this.$tmp0.scheduleFrameEndCallback(aVar);
        }
    }

    public static final AbstractApplier<LayoutNode> createApplier(LayoutNode layoutNode) {
        return new UiApplier(layoutNode);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.runtime.Composition setContent(androidx.compose.ui.platform.AbstractComposeView r4, androidx.compose.ui.platform.ComposeViewContext r5, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r6) {
        /*
            androidx.compose.ui.platform.GlobalSnapshotManager r0 = androidx.compose.ui.platform.GlobalSnapshotManager.INSTANCE
            r0.ensureStarted()
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L1f
            r0 = 0
            android.view.View r0 = r4.getChildAt(r0)
            boolean r2 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r2 == 0) goto L18
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            goto L19
        L18:
            r0 = r1
        L19:
            if (r0 == 0) goto L22
            r0.setComposeViewContext(r5)
            goto L23
        L1f:
            r4.removeAllViews()
        L22:
            r0 = r1
        L23:
            if (r0 != 0) goto L37
            androidx.compose.ui.platform.AndroidComposeView r0 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r2 = r4.getContext()
            r0.<init>(r2, r5)
            android.view.View r2 = r0.getView()
            android.view.ViewGroup$LayoutParams r3 = androidx.compose.ui.platform.Wrapper_androidKt.DefaultLayoutParams
            r4.addView(r2, r3)
        L37:
            r0.setComposeViewContext(r5)
            androidx.compose.ui.platform.ComposeViewContext r4 = r4.getComposeViewContext$ui()
            if (r4 == 0) goto L47
            r5.incrementViewCount$ui()
            r4 = 1
            r0.setComposeViewContextIncrementedDuringInit$ui(r4)
        L47:
            boolean r4 = androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled()
            if (r4 == 0) goto L64
            r4 = 2131362828(0x7f0a040c, float:1.8345448E38)
            java.lang.Object r2 = r0.getTag(r4)
            if (r2 != 0) goto L64
            java.util.WeakHashMap r2 = new java.util.WeakHashMap
            r2.<init>()
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r2 = java.util.Collections.newSetFromMap(r2)
            r0.setTag(r4, r2)
        L64:
            r4 = 2131363917(0x7f0a084d, float:1.8347656E38)
            java.lang.Object r2 = r0.getTag(r4)
            boolean r3 = r2 instanceof androidx.compose.ui.platform.WrappedComposition
            if (r3 == 0) goto L72
            r1 = r2
            androidx.compose.ui.platform.WrappedComposition r1 = (androidx.compose.ui.platform.WrappedComposition) r1
        L72:
            if (r1 != 0) goto L8f
            androidx.compose.ui.platform.WrappedComposition r1 = new androidx.compose.ui.platform.WrappedComposition
            androidx.compose.ui.node.UiApplier r2 = new androidx.compose.ui.node.UiApplier
            androidx.compose.ui.node.LayoutNode r3 = r0.getRoot()
            r2.<init>(r3)
            androidx.compose.runtime.Applier r2 = (androidx.compose.runtime.Applier) r2
            androidx.compose.runtime.CompositionContext r3 = r5.getCompositionContext$ui()
            androidx.compose.runtime.Composition r2 = androidx.compose.runtime.CompositionKt.Composition(r2, r3)
            r1.<init>(r0, r2)
            r0.setTag(r4, r1)
        L8f:
            r1.setContent(r6)
            androidx.compose.runtime.CompositionContext r4 = r5.getCompositionContext$ui()
            androidx.compose.ui.platform.Wrapper_androidKt$setContent$1 r5 = new androidx.compose.ui.platform.Wrapper_androidKt$setContent$1
            r5.<init>(r4)
            androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner$FrameEndScheduler r5 = (androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.FrameEndScheduler) r5
            r0.setFrameEndScheduler$ui(r5)
            androidx.compose.runtime.Composition r1 = (androidx.compose.runtime.Composition) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.Wrapper_androidKt.setContent(androidx.compose.ui.platform.AbstractComposeView, androidx.compose.ui.platform.ComposeViewContext, h.g.a.p):androidx.compose.runtime.Composition");
    }
}
