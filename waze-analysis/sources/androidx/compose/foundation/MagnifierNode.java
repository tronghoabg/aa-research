package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.w;
import h.g.b.x;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MagnifierNode extends Modifier.Node implements GlobalPositionAwareModifierNode, DrawModifierNode, SemanticsModifierNode, ObserverModifierNode {
    public static final int $stable = 8;
    private State<Offset> anchorPositionInRootState;
    private boolean clippingEnabled;
    private float cornerRadius;
    private Density density;
    private o<ab> drawSignalChannel;
    private float elevation;
    private final MutableState layoutCoordinates$delegate;
    private PlatformMagnifier magnifier;
    private l<? super Density, Offset> magnifierCenter;
    private l<? super DpSize, ab> onSizeChanged;
    private PlatformMagnifierFactory platformMagnifierFactory;
    private IntSize previousSize;
    private long size;
    private l<? super Density, Offset> sourceCenter;
    private long sourceCenterInRoot;
    private boolean useTextDefault;
    private View view;
    private float zoom;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.MagnifierNode$onAttach$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return MagnifierNode.this.new AnonymousClass1(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        
            if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(new androidx.compose.foundation.MagnifierNode$onAttach$1$$ExternalSyntheticLambda0(), r4) != r0) goto L19;
         */
        /* JADX WARN: Path cross not found for [B:13:0x0027, B:15:0x0032], limit reached: 23 */
        /* JADX WARN: Path cross not found for [B:15:0x0032, B:13:0x0027], limit reached: 23 */
        /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0038 -> B:11:0x001f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0048 -> B:19:0x004a). Please report as a decompilation issue!!! */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                e.b.c.b(r5)
                goto L4a
            L10:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L18:
                e.b.c.b(r5)
                goto L32
            L1c:
                e.b.c.b(r5)
            L1f:
                androidx.compose.foundation.MagnifierNode r5 = androidx.compose.foundation.MagnifierNode.this
                kotlinx.coroutines.a.o r5 = androidx.compose.foundation.MagnifierNode.access$getDrawSignalChannel$p(r5)
                if (r5 == 0) goto L32
                r1 = r4
                h.c.e r1 = (h.c.e) r1
                r4.label = r3
                java.lang.Object r5 = r5.d(r1)
                if (r5 == r0) goto L56
            L32:
                androidx.compose.foundation.MagnifierNode r5 = androidx.compose.foundation.MagnifierNode.this
                androidx.compose.foundation.PlatformMagnifier r5 = androidx.compose.foundation.MagnifierNode.access$getMagnifier$p(r5)
                if (r5 == 0) goto L1f
                androidx.compose.foundation.MagnifierNode$onAttach$1$$ExternalSyntheticLambda0 r5 = new androidx.compose.foundation.MagnifierNode$onAttach$1$$ExternalSyntheticLambda0
                r5.<init>()
                r1 = r4
                h.c.e r1 = (h.c.e) r1
                r4.label = r2
                java.lang.Object r5 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(r5, r1)
                if (r5 == r0) goto L56
            L4a:
                androidx.compose.foundation.MagnifierNode r5 = androidx.compose.foundation.MagnifierNode.this
                androidx.compose.foundation.PlatformMagnifier r5 = androidx.compose.foundation.MagnifierNode.access$getMagnifier$p(r5)
                if (r5 == 0) goto L1f
                r5.updateContent()
                goto L1f
            L56:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MagnifierNode(l lVar, l lVar2, l lVar3, float f2, boolean z, long j2, float f3, float f4, boolean z2, PlatformMagnifierFactory platformMagnifierFactory, int i2, h.g.b.o oVar) {
        long jM11271getUnspecifiedMYxV2XQ = (i2 & 32) != 0 ? DpSize.Companion.m11271getUnspecifiedMYxV2XQ() : j2;
        float fM11184getUnspecifiedD9Ej5fM = (i2 & 64) != 0 ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : f3;
        float fM11184getUnspecifiedD9Ej5fM2 = (i2 & 128) != 0 ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : f4;
        boolean z3 = (!((i2 & 256) == 0)) | z2;
        PlatformMagnifierFactory forCurrentPlatform = (i2 & 512) != 0 ? PlatformMagnifierFactory.Companion.getForCurrentPlatform() : platformMagnifierFactory;
        int i3 = i2 & 8;
        int i4 = i2 & 4;
        int i5 = i2 & 2;
        boolean z4 = ((i2 & 16) == 0) & z;
        this(lVar, i5 != 0 ? null : lVar2, i4 != 0 ? null : lVar3, i3 != 0 ? Float.NaN : f2, z4, jM11271getUnspecifiedMYxV2XQ, fM11184getUnspecifiedD9Ej5fM, fM11184getUnspecifiedD9Ej5fM2, z3, forCurrentPlatform, null);
    }

    /* renamed from: getAnchorPositionInRoot-F1C5BW0, reason: not valid java name */
    private final long m2039getAnchorPositionInRootF1C5BW0() {
        State<Offset> stateDerivedStateOf = this.anchorPositionInRootState;
        if (stateDerivedStateOf == null) {
            stateDerivedStateOf = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.foundation.MagnifierNode$$ExternalSyntheticLambda2
                @Override // h.g.a.a
                public final Object invoke() {
                    return MagnifierNode.getAnchorPositionInRoot_F1C5BW0$lambda$0(this.f$0);
                }
            });
            this.anchorPositionInRootState = stateDerivedStateOf;
        }
        return stateDerivedStateOf != null ? stateDerivedStateOf.getValue().m7990unboximpl() : Offset.Companion.m7995getUnspecifiedF1C5BW0();
    }

    static final Offset getAnchorPositionInRoot_F1C5BW0$lambda$0(MagnifierNode magnifierNode) {
        LayoutCoordinates layoutCoordinates = magnifierNode.getLayoutCoordinates();
        return Offset.m7969boximpl(layoutCoordinates != null ? LayoutCoordinatesKt.positionInRoot(layoutCoordinates) : Offset.Companion.m7995getUnspecifiedF1C5BW0());
    }

    private final LayoutCoordinates getLayoutCoordinates() {
        return (LayoutCoordinates) this.layoutCoordinates$delegate.getValue();
    }

    static final ab onObservedReadsChanged$lambda$0(MagnifierNode magnifierNode) {
        magnifierNode.updateMagnifier();
        return ab.f48028a;
    }

    private final void recreateMagnifier() {
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        View viewRequireView = this.view;
        if (viewRequireView == null) {
            viewRequireView = DelegatableNode_androidKt.requireView(this);
        }
        View view = viewRequireView;
        this.view = view;
        Density densityRequireDensity = this.density;
        if (densityRequireDensity == null) {
            densityRequireDensity = DelegatableNodeKt.requireDensity(this);
        }
        Density density = densityRequireDensity;
        this.density = density;
        this.magnifier = this.platformMagnifierFactory.mo2071createnHHXs2Y(view, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, density, this.zoom);
        updateSizeIfNecessary();
    }

    private final void setLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates$delegate.setValue(layoutCoordinates);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateMagnifier() {
        /*
            r9 = this;
            androidx.compose.ui.unit.Density r0 = r9.density
            if (r0 != 0) goto Ld
            r0 = r9
            androidx.compose.ui.node.DelegatableNode r0 = (androidx.compose.ui.node.DelegatableNode) r0
            androidx.compose.ui.unit.Density r0 = androidx.compose.ui.node.DelegatableNodeKt.requireDensity(r0)
            r9.density = r0
        Ld:
            h.g.a.l<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> r1 = r9.sourceCenter
            java.lang.Object r1 = r1.invoke(r0)
            androidx.compose.ui.geometry.Offset r1 = (androidx.compose.ui.geometry.Offset) r1
            long r1 = r1.m7990unboximpl()
            r3 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r5 = r1 & r3
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L84
            long r5 = r9.m2039getAnchorPositionInRootF1C5BW0()
            long r5 = r5 & r3
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L84
            long r5 = r9.m2039getAnchorPositionInRootF1C5BW0()
            long r1 = androidx.compose.ui.geometry.Offset.m7985plusMKHz9U(r5, r1)
            r9.sourceCenterInRoot = r1
            h.g.a.l<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> r1 = r9.magnifierCenter
            if (r1 == 0) goto L67
            java.lang.Object r0 = r1.invoke(r0)
            androidx.compose.ui.geometry.Offset r0 = (androidx.compose.ui.geometry.Offset) r0
            long r0 = r0.m7990unboximpl()
            androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.m7969boximpl(r0)
            long r1 = r0.m7990unboximpl()
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 != 0) goto L58
            r0 = 0
        L58:
            if (r0 == 0) goto L67
            long r0 = r0.m7990unboximpl()
            long r2 = r9.m2039getAnchorPositionInRootF1C5BW0()
            long r0 = androidx.compose.ui.geometry.Offset.m7985plusMKHz9U(r2, r0)
            goto L6d
        L67:
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.Companion
            long r0 = r0.m7995getUnspecifiedF1C5BW0()
        L6d:
            r5 = r0
            androidx.compose.foundation.PlatformMagnifier r0 = r9.magnifier
            if (r0 != 0) goto L75
            r9.recreateMagnifier()
        L75:
            androidx.compose.foundation.PlatformMagnifier r2 = r9.magnifier
            if (r2 == 0) goto L80
            long r3 = r9.sourceCenterInRoot
            float r7 = r9.zoom
            r2.mo2070updateWko1d7g(r3, r5, r7)
        L80:
            r9.updateSizeIfNecessary()
            return
        L84:
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.Companion
            long r0 = r0.m7995getUnspecifiedF1C5BW0()
            r9.sourceCenterInRoot = r0
            androidx.compose.foundation.PlatformMagnifier r9 = r9.magnifier
            if (r9 == 0) goto L93
            r9.dismiss()
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode.updateMagnifier():void");
    }

    private final void updateSizeIfNecessary() {
        Density density;
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier == null || (density = this.density) == null || IntSize.m11336equalsimpl(platformMagnifier.mo2069getSizeYbymL2g(), this.previousSize)) {
            return;
        }
        l<? super DpSize, ab> lVar = this.onSizeChanged;
        if (lVar != null) {
            lVar.invoke(DpSize.m11250boximpl(density.mo2125toDpSizekrfVVM(IntSizeKt.m11351toSizeozmzZPI(platformMagnifier.mo2069getSizeYbymL2g()))));
        }
        this.previousSize = IntSize.m11331boximpl(platformMagnifier.mo2069getSizeYbymL2g());
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(Magnifier_androidKt.getMagnifierPositionInRoot(), new a() { // from class: androidx.compose.foundation.MagnifierNode$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return Offset.m7969boximpl(this.f$0.sourceCenterInRoot);
            }
        });
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        o<ab> oVar = this.drawSignalChannel;
        if (oVar != null) {
            oVar.i(ab.f48028a);
        }
    }

    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    /* renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m2040getCornerRadiusD9Ej5fM() {
        return this.cornerRadius;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m2041getElevationD9Ej5fM() {
        return this.elevation;
    }

    public final l<Density, Offset> getMagnifierCenter() {
        return this.magnifierCenter;
    }

    public final l<DpSize, ab> getOnSizeChanged() {
        return this.onSizeChanged;
    }

    public final PlatformMagnifierFactory getPlatformMagnifierFactory() {
        return this.platformMagnifierFactory;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    /* renamed from: getSize-MYxV2XQ, reason: not valid java name */
    public final long m2042getSizeMYxV2XQ() {
        return this.size;
    }

    public final l<Density, Offset> getSourceCenter() {
        return this.sourceCenter;
    }

    public final boolean getUseTextDefault() {
        return this.useTextDefault;
    }

    public final float getZoom() {
        return this.zoom;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean isImportantForBounds() {
        return true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
        this.drawSignalChannel = w.c(0, null, null, 7);
        aj.z(getCoroutineScope(), null, ag.f51345d, new AnonymousClass1(null), 1);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        this.magnifier = null;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        setLayoutCoordinates(layoutCoordinates);
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new a() { // from class: androidx.compose.foundation.MagnifierNode$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return MagnifierNode.onObservedReadsChanged$lambda$0(this.f$0);
            }
        });
    }

    public final void setClippingEnabled(boolean z) {
        this.clippingEnabled = z;
    }

    /* renamed from: setCornerRadius-0680j_4, reason: not valid java name */
    public final void m2043setCornerRadius0680j_4(float f2) {
        this.cornerRadius = f2;
    }

    /* renamed from: setElevation-0680j_4, reason: not valid java name */
    public final void m2044setElevation0680j_4(float f2) {
        this.elevation = f2;
    }

    public final void setMagnifierCenter(l<? super Density, Offset> lVar) {
        this.magnifierCenter = lVar;
    }

    public final void setOnSizeChanged(l<? super DpSize, ab> lVar) {
        this.onSizeChanged = lVar;
    }

    public final void setPlatformMagnifierFactory(PlatformMagnifierFactory platformMagnifierFactory) {
        this.platformMagnifierFactory = platformMagnifierFactory;
    }

    /* renamed from: setSize-EaSLcWc, reason: not valid java name */
    public final void m2045setSizeEaSLcWc(long j2) {
        this.size = j2;
    }

    public final void setSourceCenter(l<? super Density, Offset> lVar) {
        this.sourceCenter = lVar;
    }

    public final void setUseTextDefault(boolean z) {
        this.useTextDefault = z;
    }

    public final void setZoom(float f2) {
        this.zoom = f2;
    }

    /* renamed from: update-5F03MCQ, reason: not valid java name */
    public final void m2046update5F03MCQ(l<? super Density, Offset> lVar, l<? super Density, Offset> lVar2, float f2, boolean z, long j2, float f3, float f4, boolean z2, l<? super DpSize, ab> lVar3, PlatformMagnifierFactory platformMagnifierFactory) {
        float f5 = this.zoom;
        long j3 = this.size;
        float f6 = this.cornerRadius;
        boolean z3 = this.useTextDefault;
        float f7 = this.elevation;
        boolean z4 = this.clippingEnabled;
        PlatformMagnifierFactory platformMagnifierFactory2 = this.platformMagnifierFactory;
        View view = this.view;
        Density density = this.density;
        this.sourceCenter = lVar;
        this.magnifierCenter = lVar2;
        this.zoom = f2;
        this.useTextDefault = z;
        this.size = j2;
        this.cornerRadius = f3;
        this.elevation = f4;
        this.clippingEnabled = z2;
        this.onSizeChanged = lVar3;
        this.platformMagnifierFactory = platformMagnifierFactory;
        MagnifierNode magnifierNode = this;
        View viewRequireView = DelegatableNode_androidKt.requireView(magnifierNode);
        Density densityRequireDensity = DelegatableNodeKt.requireDensity(magnifierNode);
        if (this.magnifier != null && ((!Magnifier_androidKt.equalsIncludingNaN(f2, f5) && !platformMagnifierFactory.getCanUpdateZoom()) || !DpSize.m11259equalsimpl0(j2, j3) || !Dp.m11169equalsimpl0(f3, f6) || !Dp.m11169equalsimpl0(f4, f7) || z != z3 || z2 != z4 || !x.n(platformMagnifierFactory, platformMagnifierFactory2) || !x.n(viewRequireView, view) || !x.n(densityRequireDensity, density))) {
            recreateMagnifier();
        }
        updateMagnifier();
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
    }

    private MagnifierNode(l<? super Density, Offset> lVar, l<? super Density, Offset> lVar2, l<? super DpSize, ab> lVar3, float f2, boolean z, long j2, float f3, float f4, boolean z2, PlatformMagnifierFactory platformMagnifierFactory) {
        this.sourceCenter = lVar;
        this.magnifierCenter = lVar2;
        this.onSizeChanged = lVar3;
        this.zoom = f2;
        this.useTextDefault = z;
        this.size = j2;
        this.cornerRadius = f3;
        this.elevation = f4;
        this.clippingEnabled = z2;
        this.platformMagnifierFactory = platformMagnifierFactory;
        this.layoutCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.sourceCenterInRoot = Offset.Companion.m7995getUnspecifiedF1C5BW0();
    }

    public /* synthetic */ MagnifierNode(l lVar, l lVar2, l lVar3, float f2, boolean z, long j2, float f3, float f4, boolean z2, PlatformMagnifierFactory platformMagnifierFactory, h.g.b.o oVar) {
        this(lVar, lVar2, lVar3, f2, z, j2, f3, f4, z2, platformMagnifierFactory);
    }
}
