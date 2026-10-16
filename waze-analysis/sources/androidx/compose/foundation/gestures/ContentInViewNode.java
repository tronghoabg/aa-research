package androidx.compose.foundation.gestures;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.MeasuredSizeAwareModifierNode;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.c.a.h;
import h.c.e;
import h.d.b;
import h.g.a.a;
import h.g.b.x;
import h.i;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ContentInViewNode extends Modifier.Node implements BringIntoViewResponder, CompositionLocalConsumerModifierNode, MeasuredSizeAwareModifierNode {
    public static final int $stable = 8;
    private BringIntoViewSpec bringIntoViewSpec;
    private a<Rect> getFocusedRect;
    private boolean isAnimationRunning;
    private Orientation orientation;
    private boolean reverseDirection;
    private final ScrollingLogic scrollingLogic;
    private final boolean shouldAutoInvalidate;
    private boolean trackingFocusedChild;
    private final BringIntoViewRequestPriorityQueue bringIntoViewRequests = new BringIntoViewRequestPriorityQueue();
    private long viewportSize = ContentInViewNodeKt.UnspecifiedIntSize;

    /* compiled from: WazeSource */
    public final class Request {
        public static final int $stable = 8;
        private final k<ab> continuation;
        private final a<Rect> currentBounds;

        /* JADX WARN: Multi-variable type inference failed */
        public Request(a<Rect> aVar, k<? super ab> kVar) {
            this.currentBounds = aVar;
            this.continuation = kVar;
        }

        public final k<ab> getContinuation() {
            return this.continuation;
        }

        public final a<Rect> getCurrentBounds() {
            return this.currentBounds;
        }

        public String toString() {
            String str;
            ae aeVar = (ae) this.continuation.getContext().get(ae.f51340a);
            String strA = aeVar != null ? aeVar.a() : null;
            StringBuilder sb = new StringBuilder("Request@");
            int iHashCode = hashCode();
            h.m.k.y(16);
            String string = Integer.toString(iHashCode, 16);
            x.e(string, "toString(...)");
            sb.append(string);
            if (strA != null) {
                str = "[" + strA + "](";
            } else {
                str = "(";
            }
            sb.append(str);
            sb.append("currentBounds()=");
            sb.append(this.currentBounds.invoke());
            sb.append(", continuation=");
            sb.append(this.continuation);
            sb.append(')');
            return sb.toString();
        }
    }

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ContentInViewNode(Orientation orientation, ScrollingLogic scrollingLogic, boolean z, BringIntoViewSpec bringIntoViewSpec, a<Rect> aVar) {
        this.orientation = orientation;
        this.scrollingLogic = scrollingLogic;
        this.reverseDirection = z;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.getFocusedRect = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateScrollDelta-I_oMVgE, reason: not valid java name */
    public final float m2154calculateScrollDeltaI_oMVgE(BringIntoViewSpec bringIntoViewSpec, long j2) {
        long j3 = this.viewportSize;
        Rect rectFindBringIntoViewRequest = findBringIntoViewRequest();
        if (rectFindBringIntoViewRequest == null) {
            rectFindBringIntoViewRequest = this.trackingFocusedChild ? this.getFocusedRect.invoke() : null;
            if (rectFindBringIntoViewRequest == null) {
                return 0.0f;
            }
        }
        long jM11351toSizeozmzZPI = IntSizeKt.m11351toSizeozmzZPI(j3);
        Orientation orientation = this.orientation;
        Orientation orientation2 = Orientation.Vertical;
        int iOrdinal = orientation.ordinal();
        if (iOrdinal == 0) {
            return bringIntoViewSpec.calculateScrollDistance(rectFindBringIntoViewRequest.getTop() - IntOffset.m11297getYimpl(j2), rectFindBringIntoViewRequest.getBottom() - rectFindBringIntoViewRequest.getTop(), Float.intBitsToFloat((int) (jM11351toSizeozmzZPI & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        }
        if (iOrdinal == 1) {
            return bringIntoViewSpec.calculateScrollDistance(rectFindBringIntoViewRequest.getLeft() - IntOffset.m11296getXimpl(j2), rectFindBringIntoViewRequest.getRight() - rectFindBringIntoViewRequest.getLeft(), Float.intBitsToFloat((int) (jM11351toSizeozmzZPI >> 32)));
        }
        throw new i();
    }

    /* renamed from: compareTo-TemP2vQ, reason: not valid java name */
    private final int m2155compareToTemP2vQ(long j2, long j3) {
        long j4;
        long j5;
        Orientation orientation = this.orientation;
        Orientation orientation2 = Orientation.Vertical;
        int iOrdinal = orientation.ordinal();
        if (iOrdinal == 0) {
            j4 = j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            j5 = j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        } else {
            if (iOrdinal != 1) {
                throw new i();
            }
            j4 = j2 >> 32;
            j5 = j3 >> 32;
        }
        return x.a((int) j4, (int) j5);
    }

    /* renamed from: compareTo-iLBOSCw, reason: not valid java name */
    private final int m2156compareToiLBOSCw(long j2, long j3) {
        Orientation orientation = this.orientation;
        Orientation orientation2 = Orientation.Vertical;
        int iOrdinal = orientation.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return Float.compare(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 >> 32)));
            }
            throw new i();
        }
        return Float.compare(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
    }

    private final Rect computeDestination(Rect rect) {
        return rect.m8017translatek4lQ0M(m2161relocationOffsetfbGrOKE(rect, m2163getViewportSizeOrZeroYbymL2g$foundation(), IntOffset.Companion.m11307getZeronOccac()) ^ (-9223372034707292160L));
    }

    private final Rect findBringIntoViewRequest() {
        MutableVector mutableVector = this.bringIntoViewRequests.requests;
        int size = mutableVector.getSize() - 1;
        Object[] objArr = mutableVector.content;
        Rect rect = null;
        if (size < objArr.length) {
            while (true) {
                if (size < 0) {
                    break;
                }
                Rect rectInvoke = ((Request) objArr[size]).getCurrentBounds().invoke();
                if (rectInvoke != null) {
                    if (m2156compareToiLBOSCw(rectInvoke.m8013getSizeNHjbRc(), IntSizeKt.m11351toSizeozmzZPI(m2163getViewportSizeOrZeroYbymL2g$foundation())) <= 0) {
                        rect = rectInvoke;
                    } else if (rect == null) {
                        return rectInvoke;
                    }
                }
                size--;
            }
        }
        return rect;
    }

    /* renamed from: isMaxVisible--EQwtKw, reason: not valid java name */
    private final boolean m2157isMaxVisibleEQwtKw(Rect rect, long j2, long j3) {
        long jM2161relocationOffsetfbGrOKE = m2161relocationOffsetfbGrOKE(rect, j2, j3);
        return Math.abs(Float.intBitsToFloat((int) (jM2161relocationOffsetfbGrOKE >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jM2161relocationOffsetfbGrOKE & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) <= 0.5f;
    }

    /* renamed from: isMaxVisible--EQwtKw$default, reason: not valid java name */
    static /* synthetic */ boolean m2158isMaxVisibleEQwtKw$default(ContentInViewNode contentInViewNode, Rect rect, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = contentInViewNode.m2163getViewportSizeOrZeroYbymL2g$foundation();
        }
        long j4 = j2;
        if ((i2 & 2) != 0) {
            j3 = IntOffset.Companion.m11307getZeronOccac();
        }
        return contentInViewNode.m2157isMaxVisibleEQwtKw(rect, j4, j3);
    }

    /* renamed from: launchAnimation--gyyYBs, reason: not valid java name */
    private final void m2159launchAnimationgyyYBs(long j2) {
        BringIntoViewSpec bringIntoViewSpecRequireBringIntoViewSpec = requireBringIntoViewSpec();
        if (this.isAnimationRunning) {
            InlineClassHelperKt.throwIllegalStateException("launchAnimation called when previous animation was running");
        }
        aj.z(getCoroutineScope(), null, ag.f51345d, new ContentInViewNode$launchAnimation$2(this, new UpdatableAnimationState(requireBringIntoViewSpec().getScrollAnimationSpec()), bringIntoViewSpecRequireBringIntoViewSpec, j2, null), 1);
    }

    /* renamed from: launchAnimation--gyyYBs$default, reason: not valid java name */
    static /* synthetic */ void m2160launchAnimationgyyYBs$default(ContentInViewNode contentInViewNode, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = IntOffset.Companion.m11307getZeronOccac();
        }
        contentInViewNode.m2159launchAnimationgyyYBs(j2);
    }

    /* renamed from: relocationOffset-fbGrOKE, reason: not valid java name */
    private final long m2161relocationOffsetfbGrOKE(Rect rect, long j2, long j3) {
        long jM11351toSizeozmzZPI = IntSizeKt.m11351toSizeozmzZPI(j2);
        Orientation orientation = this.orientation;
        Orientation orientation2 = Orientation.Vertical;
        int iOrdinal = orientation.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new i();
            }
            return (Float.floatToRawIntBits(requireBringIntoViewSpec().calculateScrollDistance(rect.getLeft() - IntOffset.m11296getXimpl(j3), rect.getRight() - rect.getLeft(), Float.intBitsToFloat((int) (jM11351toSizeozmzZPI >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        }
        float fCalculateScrollDistance = requireBringIntoViewSpec().calculateScrollDistance(rect.getTop() - IntOffset.m11297getYimpl(j3), rect.getBottom() - rect.getTop(), Float.intBitsToFloat((int) (jM11351toSizeozmzZPI & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fCalculateScrollDistance) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    private final BringIntoViewSpec requireBringIntoViewSpec() {
        BringIntoViewSpec bringIntoViewSpec = this.bringIntoViewSpec;
        return bringIntoViewSpec == null ? (BringIntoViewSpec) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, BringIntoViewSpec_androidKt.getLocalBringIntoViewSpec()) : bringIntoViewSpec;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Object bringChildIntoView(a<Rect> aVar, e<? super ab> eVar) {
        Rect rectInvoke = aVar.invoke();
        if (rectInvoke != null && !m2158isMaxVisibleEQwtKw$default(this, rectInvoke, 0L, 0L, 3, null)) {
            l lVar = new l(h.d(eVar), 1);
            lVar.u();
            if (this.bringIntoViewRequests.enqueue(new Request(aVar, lVar)) && !this.isAnimationRunning) {
                m2160launchAnimationgyyYBs$default(this, 0L, 1, null);
            }
            Object objJ = lVar.j();
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (objJ == aVar2) {
                b.c(eVar);
            }
            if (objJ == aVar2) {
                return objJ;
            }
        }
        return ab.f48028a;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Rect calculateRectForParent(Rect rect) {
        if (IntSize.m11337equalsimpl0(this.viewportSize, ContentInViewNodeKt.UnspecifiedIntSize)) {
            InlineClassHelperKt.throwIllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return computeDestination(rect);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* renamed from: getViewportSize-YbymL2g$foundation, reason: not valid java name */
    public final long m2162getViewportSizeYbymL2g$foundation() {
        return this.viewportSize;
    }

    /* renamed from: getViewportSizeOrZero-YbymL2g$foundation, reason: not valid java name */
    public final long m2163getViewportSizeOrZeroYbymL2g$foundation() {
        long j2 = this.viewportSize;
        return IntSize.m11337equalsimpl0(j2, ContentInViewNodeKt.UnspecifiedIntSize) ? IntSize.Companion.m11344getZeroYbymL2g() : j2;
    }

    @Override // androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo2116onRemeasuredozmzZPI(long j2) {
        long jM11307getZeronOccac;
        long jM2163getViewportSizeOrZeroYbymL2g$foundation = m2163getViewportSizeOrZeroYbymL2g$foundation();
        this.viewportSize = j2;
        if (m2155compareToTemP2vQ(j2, jM2163getViewportSizeOrZeroYbymL2g$foundation) >= 0) {
            return;
        }
        if (this.reverseDirection) {
            jM11307getZeronOccac = IntOffset.Companion.m11307getZeronOccac();
        } else if (this.orientation == Orientation.Vertical) {
            jM11307getZeronOccac = (((int) (jM2163getViewportSizeOrZeroYbymL2g$foundation & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - ((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        } else {
            jM11307getZeronOccac = (((int) (jM2163getViewportSizeOrZeroYbymL2g$foundation >> 32)) - ((int) (j2 >> 32))) << 32;
        }
        long j3 = jM11307getZeronOccac;
        Rect rectInvoke = this.getFocusedRect.invoke();
        if (rectInvoke == null || this.isAnimationRunning || this.trackingFocusedChild || !m2158isMaxVisibleEQwtKw$default(this, rectInvoke, jM2163getViewportSizeOrZeroYbymL2g$foundation, 0L, 2, null) || m2158isMaxVisibleEQwtKw$default(this, rectInvoke, 0L, j3, 1, null)) {
            return;
        }
        this.trackingFocusedChild = true;
        m2159launchAnimationgyyYBs(j3);
    }

    public final void update(Orientation orientation, boolean z, BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.reverseDirection = z;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }
}
