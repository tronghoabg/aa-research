package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.media3.muxer.MuxerUtil;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.r;
import h.g.b.o;
import h.g.b.x;
import h.k.n;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, ComposeNodeLifecycleCallback, OwnerScope, OnApplyWindowInsetsListener {
    private l<? super Rect, ab> bringIntoViewRequester;
    private final int compositeKeyHash;
    private Density density;
    private final NestedScrollDispatcher dispatcher;
    private boolean hasUpdateBlock;
    private WindowInsetsCompat insets;
    private boolean isDrawing;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;
    private final LayoutNode layoutNode;
    private LifecycleOwner lifecycleOwner;
    private final int[] location;
    private Modifier modifier;
    private final NestedScrollingParentHelper nestedScrollingParentHelper;
    private l<? super Density, ab> onDensityChanged;
    private l<? super Modifier, ab> onModifierChanged;
    private l<? super Boolean, ab> onRequestDisallowInterceptTouchEvent;
    private final Owner owner;
    private final int[] position;
    private a<ab> release;
    private a<ab> reset;
    private final a<ab> runInvalidate;
    private final a<ab> runUpdate;
    private SavedStateRegistryOwner savedStateRegistryOwner;
    private long size;
    private a<ab> update;
    private final View view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final l<AndroidViewHolder, ab> OnCommitAffectingUpdate = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ boolean $consumed;
        final /* synthetic */ long $viewVelocity;
        int label;
        final /* synthetic */ AndroidViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, AndroidViewHolder androidViewHolder, long j2, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$consumed = z;
            this.this$0 = androidViewHolder;
            this.$viewVelocity = j2;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$consumed, this.this$0, this.$viewVelocity, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            if (r11 != r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
        
            if (r11 != r0) goto L17;
         */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                e.b.c.b(r11)
                goto L5a
            L10:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L18:
                e.b.c.b(r11)
                goto L3c
            L1c:
                e.b.c.b(r11)
                boolean r11 = r10.$consumed
                androidx.compose.ui.viewinterop.AndroidViewHolder r1 = r10.this$0
                if (r11 != 0) goto L42
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r4 = androidx.compose.ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r1)
                androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.ui.unit.Velocity.Companion
                long r5 = r11.m11417getZero9UxMQ8M()
                long r7 = r10.$viewVelocity
                r9 = r10
                h.c.e r9 = (h.c.e) r9
                r10.label = r3
                java.lang.Object r11 = r4.m9457dispatchPostFlingRZ2iAVY(r5, r7, r9)
                if (r11 == r0) goto L62
            L3c:
                androidx.compose.ui.unit.Velocity r11 = (androidx.compose.ui.unit.Velocity) r11
                r11.m11415unboximpl()
                goto L5f
            L42:
                r11 = r2
                long r2 = r10.$viewVelocity
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r1 = androidx.compose.ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r1)
                androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.ui.unit.Velocity.Companion
                long r4 = r4.m11417getZero9UxMQ8M()
                r6 = r10
                h.c.e r6 = (h.c.e) r6
                r10.label = r11
                java.lang.Object r11 = r1.m9457dispatchPostFlingRZ2iAVY(r2, r4, r6)
                if (r11 == r0) goto L62
            L5a:
                androidx.compose.ui.unit.Velocity r11 = (androidx.compose.ui.unit.Velocity) r11
                r11.m11415unboximpl()
            L5f:
                h.ab r10 = h.ab.f48028a
                return r10
            L62:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    final class C03981 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ long $toBeConsumed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03981(long j2, e<? super C03981> eVar) {
            super(2, eVar);
            this.$toBeConsumed = j2;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return AndroidViewHolder.this.new C03981(this.$toBeConsumed, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C03981) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                long j2 = this.$toBeConsumed;
                this.label = 1;
                if (androidViewHolder.dispatcher.m9459dispatchPreFlingQWom1Mo(j2, this) == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidViewHolder(Context context, CompositionContext compositionContext, int i2, NestedScrollDispatcher nestedScrollDispatcher, View view, Owner owner) {
        super(context);
        this.compositeKeyHash = i2;
        this.dispatcher = nestedScrollDispatcher;
        this.view = view;
        this.owner = owner;
        if (compositionContext != null) {
            WindowRecomposer_androidKt.setCompositionContext(this, compositionContext);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        AndroidViewHolder androidViewHolder = this;
        ViewCompat.setWindowInsetsAnimationCallback(androidViewHolder, new WindowInsetsAnimationCompat.Callback() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder.2
            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List<WindowInsetsAnimationCompat> list) {
                return AndroidViewHolder.this.insetToLayoutPosition(windowInsetsCompat);
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
                return AndroidViewHolder.this.insetBounds(boundsCompat);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(androidViewHolder, this);
        this.update = AndroidViewHolder$update$1.INSTANCE;
        this.reset = AndroidViewHolder$reset$1.INSTANCE;
        this.release = AndroidViewHolder$release$1.INSTANCE;
        this.modifier = Modifier.Companion;
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.position = new int[2];
        this.size = IntSize.Companion.m11344getZeroYbymL2g();
        this.runUpdate = new AndroidViewHolder$runUpdate$1(this);
        this.runInvalidate = new AndroidViewHolder$runInvalidate$1(this);
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        Object[] objArr = 0 == true ? 1 : 0;
        final LayoutNode layoutNode = new LayoutNode(false, objArr, 3, null);
        layoutNode.setInteropViewFactoryHolder$ui(this);
        Modifier modifierThen = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(PointerInteropFilter_androidKt.pointerInteropFilter(SemanticsModifierKt.semantics(NestedScrollModifierKt.nestedScroll(Modifier.Companion, AndroidViewHolder_androidKt.NoOpScrollConnection, this.dispatcher), true, AndroidViewHolder$layoutNode$1$coreModifier$1.INSTANCE), this), new AndroidViewHolder$layoutNode$1$coreModifier$2(this, layoutNode, this)), new AndroidViewHolder$layoutNode$1$coreModifier$3(this, layoutNode)).then(new BringIntoViewElement(new AndroidViewHolder$layoutNode$1$coreModifier$4(this)));
        layoutNode.setCompositeKeyHash(this.compositeKeyHash);
        layoutNode.setModifier(this.modifier.then(modifierThen));
        this.onModifierChanged = new AndroidViewHolder$layoutNode$1$1(layoutNode, modifierThen);
        layoutNode.setDensity(this.density);
        this.onDensityChanged = new AndroidViewHolder$layoutNode$1$2(layoutNode);
        layoutNode.setOnAttach$ui(new AndroidViewHolder$layoutNode$1$3(this, layoutNode));
        layoutNode.setOnDetach$ui(new AndroidViewHolder$layoutNode$1$4(this));
        layoutNode.setMeasurePolicy(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            private final int intrinsicHeight(int i3) {
                ViewGroup.LayoutParams layoutParams = this.$this_run.getLayoutParams();
                x.c(layoutParams);
                this.$this_run.measure(this.$this_run.obtainMeasureSpec(0, i3, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return this.$this_run.getMeasuredHeight();
            }

            private final int intrinsicWidth(int i3) {
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                x.c(layoutParams);
                this.$this_run.measure(iMakeMeasureSpec, this.$this_run.obtainMeasureSpec(0, i3, layoutParams.height));
                return this.$this_run.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                return intrinsicHeight(i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                return intrinsicWidth(i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                if (this.$this_run.getChildCount() == 0) {
                    return MeasureScope.CC.layout$default(measureScope, Constraints.m11109getMinWidthimpl(j2), Constraints.m11108getMinHeightimpl(j2), null, AndroidViewHolder$layoutNode$1$5$measure$1.INSTANCE, 4, null);
                }
                if (Constraints.m11109getMinWidthimpl(j2) != 0) {
                    this.$this_run.getChildAt(0).setMinimumWidth(Constraints.m11109getMinWidthimpl(j2));
                }
                if (Constraints.m11108getMinHeightimpl(j2) != 0) {
                    this.$this_run.getChildAt(0).setMinimumHeight(Constraints.m11108getMinHeightimpl(j2));
                }
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                int iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(j2);
                int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                x.c(layoutParams);
                int iObtainMeasureSpec = androidViewHolder2.obtainMeasureSpec(iM11109getMinWidthimpl, iM11107getMaxWidthimpl, layoutParams.width);
                AndroidViewHolder androidViewHolder3 = this.$this_run;
                int iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j2);
                int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
                ViewGroup.LayoutParams layoutParams2 = androidViewHolder3.getLayoutParams();
                x.c(layoutParams2);
                androidViewHolder2.measure(iObtainMeasureSpec, androidViewHolder3.obtainMeasureSpec(iM11108getMinHeightimpl, iM11106getMaxHeightimpl, layoutParams2.height));
                AndroidViewHolder androidViewHolder4 = this.$this_run;
                return MeasureScope.CC.layout$default(measureScope, androidViewHolder4.getMeasuredWidth(), androidViewHolder4.getMeasuredHeight(), null, new AndroidViewHolder$layoutNode$1$5$measure$2(androidViewHolder4, layoutNode), 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                return intrinsicHeight(i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                return intrinsicWidth(i3);
            }
        });
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            InlineClassHelperKt.throwIllegalStateException("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.owner.getSnapshotObserver();
    }

    private final Insets inset(Insets insets, int i2, int i3, int i4, int i5) {
        int i6 = insets.left - i2;
        int i7 = insets.top - i3;
        int i8 = insets.right - i4;
        int i9 = insets.bottom - i5;
        if (i6 < 0) {
            i6 = 0;
        }
        if (i7 < 0) {
            i7 = 0;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        return Insets.of(i6, i7, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowInsetsAnimationCompat.BoundsCompat insetBounds(WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        NodeCoordinator innerCoordinator$ui = this.layoutNode.getInnerCoordinator$ui();
        if (innerCoordinator$ui.isAttached()) {
            NodeCoordinator nodeCoordinator = innerCoordinator$ui;
            long jM11313roundk4lQ0M = IntOffsetKt.m11313roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(nodeCoordinator));
            int iM11296getXimpl = IntOffset.m11296getXimpl(jM11313roundk4lQ0M);
            if (iM11296getXimpl < 0) {
                iM11296getXimpl = 0;
            }
            int iM11297getYimpl = IntOffset.m11297getYimpl(jM11313roundk4lQ0M);
            if (iM11297getYimpl < 0) {
                iM11297getYimpl = 0;
            }
            long jMo9743getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(nodeCoordinator).mo9743getSizeYbymL2g();
            long j2 = jMo9743getSizeYbymL2g >> 32;
            long j3 = jMo9743getSizeYbymL2g & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            long jMo9743getSizeYbymL2g2 = innerCoordinator$ui.mo9743getSizeYbymL2g();
            int i2 = iM11297getYimpl;
            long jM11313roundk4lQ0M2 = IntOffsetKt.m11313roundk4lQ0M(innerCoordinator$ui.mo9746localToRootMKHz9U((Float.floatToRawIntBits((int) (jMo9743getSizeYbymL2g2 >> 32)) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits((int) (jMo9743getSizeYbymL2g2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)))));
            int iM11296getXimpl2 = ((int) j2) - IntOffset.m11296getXimpl(jM11313roundk4lQ0M2);
            if (iM11296getXimpl2 < 0) {
                iM11296getXimpl2 = 0;
            }
            int iM11297getYimpl2 = ((int) j3) - IntOffset.m11297getYimpl(jM11313roundk4lQ0M2);
            int i3 = iM11297getYimpl2 >= 0 ? iM11297getYimpl2 : 0;
            if (iM11296getXimpl != 0 || i2 != 0 || iM11296getXimpl2 != 0 || i3 != 0) {
                int i4 = iM11296getXimpl;
                int i5 = i3;
                int i6 = iM11296getXimpl2;
                return new WindowInsetsAnimationCompat.BoundsCompat(inset(boundsCompat.getLowerBound(), i4, i2, i6, i5), inset(boundsCompat.getUpperBound(), i4, i2, i6, i5));
            }
        }
        return boundsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowInsetsCompat insetToLayoutPosition(WindowInsetsCompat windowInsetsCompat) {
        if (!windowInsetsCompat.hasInsets()) {
            return windowInsetsCompat;
        }
        NodeCoordinator innerCoordinator$ui = this.layoutNode.getInnerCoordinator$ui();
        if (!innerCoordinator$ui.isAttached()) {
            return windowInsetsCompat;
        }
        NodeCoordinator nodeCoordinator = innerCoordinator$ui;
        long jM11313roundk4lQ0M = IntOffsetKt.m11313roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(nodeCoordinator));
        int iM11296getXimpl = IntOffset.m11296getXimpl(jM11313roundk4lQ0M);
        if (iM11296getXimpl < 0) {
            iM11296getXimpl = 0;
        }
        int iM11297getYimpl = IntOffset.m11297getYimpl(jM11313roundk4lQ0M);
        if (iM11297getYimpl < 0) {
            iM11297getYimpl = 0;
        }
        long jMo9743getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(nodeCoordinator).mo9743getSizeYbymL2g();
        long j2 = jMo9743getSizeYbymL2g >> 32;
        long j3 = jMo9743getSizeYbymL2g & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        long jMo9743getSizeYbymL2g2 = innerCoordinator$ui.mo9743getSizeYbymL2g();
        long jM11313roundk4lQ0M2 = IntOffsetKt.m11313roundk4lQ0M(innerCoordinator$ui.mo9746localToRootMKHz9U((Float.floatToRawIntBits((int) (jMo9743getSizeYbymL2g2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (jMo9743getSizeYbymL2g2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        int iM11296getXimpl2 = ((int) j2) - IntOffset.m11296getXimpl(jM11313roundk4lQ0M2);
        if (iM11296getXimpl2 < 0) {
            iM11296getXimpl2 = 0;
        }
        int iM11297getYimpl2 = ((int) j3) - IntOffset.m11297getYimpl(jM11313roundk4lQ0M2);
        int i2 = iM11297getYimpl2 >= 0 ? iM11297getYimpl2 : 0;
        return (iM11296getXimpl == 0 && iM11297getYimpl == 0 && iM11296getXimpl2 == 0 && i2 == 0) ? windowInsetsCompat : windowInsetsCompat.inset(iM11296getXimpl, iM11297getYimpl, iM11296getXimpl2, i2);
    }

    private final <T> T insetValue(T t, r<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> rVar) {
        NodeCoordinator innerCoordinator$ui = this.layoutNode.getInnerCoordinator$ui();
        if (innerCoordinator$ui.isAttached()) {
            NodeCoordinator nodeCoordinator = innerCoordinator$ui;
            long jM11313roundk4lQ0M = IntOffsetKt.m11313roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(nodeCoordinator));
            int iM11296getXimpl = IntOffset.m11296getXimpl(jM11313roundk4lQ0M);
            if (iM11296getXimpl < 0) {
                iM11296getXimpl = 0;
            }
            int iM11297getYimpl = IntOffset.m11297getYimpl(jM11313roundk4lQ0M);
            if (iM11297getYimpl < 0) {
                iM11297getYimpl = 0;
            }
            long jMo9743getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(nodeCoordinator).mo9743getSizeYbymL2g();
            long j2 = jMo9743getSizeYbymL2g >> 32;
            long j3 = jMo9743getSizeYbymL2g & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            long jMo9743getSizeYbymL2g2 = innerCoordinator$ui.mo9743getSizeYbymL2g() >> 32;
            long jM11313roundk4lQ0M2 = IntOffsetKt.m11313roundk4lQ0M(innerCoordinator$ui.mo9746localToRootMKHz9U((MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits((int) (r12 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) | (Float.floatToRawIntBits((int) jMo9743getSizeYbymL2g2) << 32)));
            int iM11296getXimpl2 = ((int) j2) - IntOffset.m11296getXimpl(jM11313roundk4lQ0M2);
            if (iM11296getXimpl2 < 0) {
                iM11296getXimpl2 = 0;
            }
            int iM11297getYimpl2 = ((int) j3) - IntOffset.m11297getYimpl(jM11313roundk4lQ0M2);
            int i2 = iM11297getYimpl2 >= 0 ? iM11297getYimpl2 : 0;
            if (iM11296getXimpl != 0 || iM11297getYimpl != 0 || iM11296getXimpl2 != 0 || i2 != 0) {
                return rVar.invoke(Integer.valueOf(iM11296getXimpl), Integer.valueOf(iM11297getYimpl), Integer.valueOf(iM11296getXimpl2), Integer.valueOf(i2));
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int obtainMeasureSpec(int i2, int i3, int i4) {
        if (i4 >= 0 || i2 == i3) {
            return View.MeasureSpec.makeMeasureSpec(n.j(i4, i2, i3), 1073741824);
        }
        if (i4 == -2) {
            if (i3 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
            }
        } else if (i4 == -1 && i3 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i2 = iArr[0];
        region.op(i2, iArr[1], i2 + getWidth(), this.location[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final Density getDensity() {
        return this.density;
    }

    public final View getInteropView() {
        return this.view;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.getNestedScrollAxes();
    }

    public final l<Density, ab> getOnDensityChanged$ui() {
        return this.onDensityChanged;
    }

    public final l<Modifier, ab> getOnModifierChanged$ui() {
        return this.onModifierChanged;
    }

    public final l<Boolean, ab> getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final a<ab> getRelease() {
        return this.release;
    }

    public final a<ab> getReset() {
        return this.reset;
    }

    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final a<ab> getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        invalidateOrDefer();
        return null;
    }

    public final void invalidateOrDefer() {
        if (!this.isDrawing) {
            this.layoutNode.invalidateLayer$ui();
            return;
        }
        View view = this.view;
        final a<ab> aVar = this.runInvalidate;
        view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.invoke();
            }
        });
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttachedToWindow();
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.insets = new WindowInsetsCompat(windowInsetsCompat);
        return insetToLayoutPosition(windowInsetsCompat);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidateOrDefer();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().clear$ui(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.view.layout(0, 0, i4 - i2, i5 - i3);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(i2, i3);
        View view = this.view;
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.lastWidthMeasureSpec = i2;
        this.lastHeightMeasureSpec = i3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        float composeVelocity = AndroidViewHolder_androidKt.toComposeVelocity(f2);
        float composeVelocity2 = AndroidViewHolder_androidKt.toComposeVelocity(f3);
        aj.z(this.dispatcher.getCoroutineScope(), null, null, new AnonymousClass1(z, this, VelocityKt.Velocity(composeVelocity, composeVelocity2), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        float composeVelocity = AndroidViewHolder_androidKt.toComposeVelocity(f2);
        float composeVelocity2 = AndroidViewHolder_androidKt.toComposeVelocity(f3);
        aj.z(this.dispatcher.getCoroutineScope(), null, null, new C03981(VelocityKt.Velocity(composeVelocity, composeVelocity2), null), 3);
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr, int i4) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(i2);
            float composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(i3);
            long jFloatToRawIntBits = Float.floatToRawIntBits(composeOffset);
            long jM9460dispatchPreScrollOzD1aCk = nestedScrollDispatcher.m9460dispatchPreScrollOzD1aCk((Float.floatToRawIntBits(composeOffset2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32), AndroidViewHolder_androidKt.toNestedScrollSource(i4));
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM9460dispatchPreScrollOzD1aCk >> 32)));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM9460dispatchPreScrollOzD1aCk & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(i2);
            float composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(i3);
            long jFloatToRawIntBits = Float.floatToRawIntBits(composeOffset);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(composeOffset2);
            float composeOffset3 = AndroidViewHolder_androidKt.toComposeOffset(i4);
            float composeOffset4 = AndroidViewHolder_androidKt.toComposeOffset(i5);
            long jM9458dispatchPostScrollDzOQY0M = nestedScrollDispatcher.m9458dispatchPostScrollDzOQY0M((jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32), (Float.floatToRawIntBits(composeOffset3) << 32) | (Float.floatToRawIntBits(composeOffset4) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), AndroidViewHolder_androidKt.toNestedScrollSource(i6));
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM9458dispatchPostScrollDzOQY0M >> 32)));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM9458dispatchPostScrollDzOQY0M & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i2, int i3) {
        this.nestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i2, i3);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        this.release.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i2, int i3) {
        return ((i2 & 2) == 0 && (i2 & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i2) {
        this.nestedScrollingParentHelper.onStopNestedScroll(view, i2);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    public final void remeasure() {
        int i2;
        int i3 = this.lastWidthMeasureSpec;
        if (i3 == Integer.MIN_VALUE || (i2 = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i3, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, android.graphics.Rect rect, boolean z) {
        l<? super Rect, ab> lVar = this.bringIntoViewRequester;
        if (lVar == null) {
            return true;
        }
        lVar.invoke(rect != null ? RectHelper_androidKt.toComposeRect(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        l<? super Boolean, ab> lVar = this.onRequestDisallowInterceptTouchEvent;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(Density density) {
        if (density != this.density) {
            this.density = density;
            l<? super Density, ab> lVar = this.onDensityChanged;
            if (lVar != null) {
                lVar.invoke(density);
            }
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            ViewTreeLifecycleOwner.set(this, lifecycleOwner);
        }
    }

    public final void setModifier(Modifier modifier) {
        if (modifier != this.modifier) {
            this.modifier = modifier;
            l<? super Modifier, ab> lVar = this.onModifierChanged;
            if (lVar != null) {
                lVar.invoke(modifier);
            }
        }
    }

    public final void setOnDensityChanged$ui(l<? super Density, ab> lVar) {
        this.onDensityChanged = lVar;
    }

    public final void setOnModifierChanged$ui(l<? super Modifier, ab> lVar) {
        this.onModifierChanged = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(l<? super Boolean, ab> lVar) {
        this.onRequestDisallowInterceptTouchEvent = lVar;
    }

    protected final void setRelease(a<ab> aVar) {
        this.release = aVar;
    }

    protected final void setReset(a<ab> aVar) {
        this.reset = aVar;
    }

    public final void setSavedStateRegistryOwner(SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            ViewTreeSavedStateRegistryOwner.set(this, savedStateRegistryOwner);
        }
    }

    protected final void setUpdate(a<ab> aVar) {
        this.update = aVar;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(i2);
            float composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(i3);
            long jFloatToRawIntBits = Float.floatToRawIntBits(composeOffset);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(composeOffset2);
            float composeOffset3 = AndroidViewHolder_androidKt.toComposeOffset(i4);
            float composeOffset4 = AndroidViewHolder_androidKt.toComposeOffset(i5);
            nestedScrollDispatcher.m9458dispatchPostScrollDzOQY0M((jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32), (Float.floatToRawIntBits(composeOffset3) << 32) | (Float.floatToRawIntBits(composeOffset4) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), AndroidViewHolder_androidKt.toNestedScrollSource(i6));
        }
    }
}
