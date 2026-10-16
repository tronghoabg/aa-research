package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;
import androidx.constraintlayout.core.state.ConstraintSetParser;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.strings.DisplayStrings;
import h.a.c;
import h.ab;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class ConstraintLayoutBaseScope {
    public static final int $stable = 8;
    private final int HelpersStartId;
    private final CLObject containerObject;
    private int helperId;
    private int helpersHashCode;
    private final List<l<State, ab>> tasks;

    /* compiled from: WazeSource */
    public final class BaselineAnchor {
        public static final int $stable = 0;
        private final Object id;
        private final LayoutReference reference;

        public BaselineAnchor(Object obj, LayoutReference layoutReference) {
            this.id = obj;
            this.reference = layoutReference;
        }

        public static /* synthetic */ BaselineAnchor copy$default(BaselineAnchor baselineAnchor, Object obj, LayoutReference layoutReference, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                obj = baselineAnchor.id;
            }
            if ((i2 & 2) != 0) {
                layoutReference = baselineAnchor.reference;
            }
            return baselineAnchor.copy(obj, layoutReference);
        }

        public final Object component1$constraintlayout_compose() {
            return this.id;
        }

        public final LayoutReference component2() {
            return this.reference;
        }

        public final BaselineAnchor copy(Object obj, LayoutReference layoutReference) {
            return new BaselineAnchor(obj, layoutReference);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BaselineAnchor)) {
                return false;
            }
            BaselineAnchor baselineAnchor = (BaselineAnchor) obj;
            return x.n(this.id, baselineAnchor.id) && x.n(this.reference, baselineAnchor.reference);
        }

        public final Object getId$constraintlayout_compose() {
            return this.id;
        }

        public final LayoutReference getReference() {
            return this.reference;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.reference.hashCode();
        }

        public String toString() {
            return "BaselineAnchor(id=" + this.id + ", reference=" + this.reference + ')';
        }
    }

    /* compiled from: WazeSource */
    public final class HorizontalAnchor {
        public static final int $stable = 0;
        private final Object id;
        private final int index;
        private final LayoutReference reference;

        public HorizontalAnchor(Object obj, int i2, LayoutReference layoutReference) {
            this.id = obj;
            this.index = i2;
            this.reference = layoutReference;
        }

        public static /* synthetic */ HorizontalAnchor copy$default(HorizontalAnchor horizontalAnchor, Object obj, int i2, LayoutReference layoutReference, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                obj = horizontalAnchor.id;
            }
            if ((i3 & 2) != 0) {
                i2 = horizontalAnchor.index;
            }
            if ((i3 & 4) != 0) {
                layoutReference = horizontalAnchor.reference;
            }
            return horizontalAnchor.copy(obj, i2, layoutReference);
        }

        public final Object component1$constraintlayout_compose() {
            return this.id;
        }

        public final int component2$constraintlayout_compose() {
            return this.index;
        }

        public final LayoutReference component3() {
            return this.reference;
        }

        public final HorizontalAnchor copy(Object obj, int i2, LayoutReference layoutReference) {
            return new HorizontalAnchor(obj, i2, layoutReference);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HorizontalAnchor)) {
                return false;
            }
            HorizontalAnchor horizontalAnchor = (HorizontalAnchor) obj;
            return x.n(this.id, horizontalAnchor.id) && this.index == horizontalAnchor.index && x.n(this.reference, horizontalAnchor.reference);
        }

        public final Object getId$constraintlayout_compose() {
            return this.id;
        }

        public final int getIndex$constraintlayout_compose() {
            return this.index;
        }

        public final LayoutReference getReference() {
            return this.reference;
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + this.index) * 31) + this.reference.hashCode();
        }

        public String toString() {
            return "HorizontalAnchor(id=" + this.id + ", index=" + this.index + ", reference=" + this.reference + ')';
        }
    }

    /* compiled from: WazeSource */
    public final class VerticalAnchor {
        public static final int $stable = 0;
        private final Object id;
        private final int index;
        private final LayoutReference reference;

        public VerticalAnchor(Object obj, int i2, LayoutReference layoutReference) {
            this.id = obj;
            this.index = i2;
            this.reference = layoutReference;
        }

        public static /* synthetic */ VerticalAnchor copy$default(VerticalAnchor verticalAnchor, Object obj, int i2, LayoutReference layoutReference, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                obj = verticalAnchor.id;
            }
            if ((i3 & 2) != 0) {
                i2 = verticalAnchor.index;
            }
            if ((i3 & 4) != 0) {
                layoutReference = verticalAnchor.reference;
            }
            return verticalAnchor.copy(obj, i2, layoutReference);
        }

        public final Object component1$constraintlayout_compose() {
            return this.id;
        }

        public final int component2$constraintlayout_compose() {
            return this.index;
        }

        public final LayoutReference component3() {
            return this.reference;
        }

        public final VerticalAnchor copy(Object obj, int i2, LayoutReference layoutReference) {
            return new VerticalAnchor(obj, i2, layoutReference);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerticalAnchor)) {
                return false;
            }
            VerticalAnchor verticalAnchor = (VerticalAnchor) obj;
            return x.n(this.id, verticalAnchor.id) && this.index == verticalAnchor.index && x.n(this.reference, verticalAnchor.reference);
        }

        public final Object getId$constraintlayout_compose() {
            return this.id;
        }

        public final int getIndex$constraintlayout_compose() {
            return this.index;
        }

        public final LayoutReference getReference() {
            return this.reference;
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + this.index) * 31) + this.reference.hashCode();
        }

        public String toString() {
            return "VerticalAnchor(id=" + this.id + ", index=" + this.index + ", reference=" + this.reference + ')';
        }
    }

    public ConstraintLayoutBaseScope(CLObject cLObject) {
        CLObject cLObjectMo11647clone;
        this.tasks = new ArrayList();
        this.containerObject = (cLObject == null || (cLObjectMo11647clone = cLObject.mo11647clone()) == null) ? new CLObject(new char[0]) : cLObjectMo11647clone;
        this.HelpersStartId = 1000;
        this.helperId = 1000;
    }

    /* renamed from: createAbsoluteLeftBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ VerticalAnchor m11457createAbsoluteLeftBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAbsoluteLeftBarrier-3ABfNKs");
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return constraintLayoutBaseScope.m11472createAbsoluteLeftBarrier3ABfNKs(layoutReferenceArr, f2);
    }

    /* renamed from: createAbsoluteRightBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ VerticalAnchor m11458createAbsoluteRightBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAbsoluteRightBarrier-3ABfNKs");
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return constraintLayoutBaseScope.m11473createAbsoluteRightBarrier3ABfNKs(layoutReferenceArr, f2);
    }

    /* renamed from: createBottomBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ HorizontalAnchor m11459createBottomBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBottomBarrier-3ABfNKs");
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return constraintLayoutBaseScope.m11474createBottomBarrier3ABfNKs(layoutReferenceArr, f2);
    }

    /* renamed from: createColumn-lG28NQ4$default, reason: not valid java name */
    public static /* synthetic */ ConstrainedLayoutReference m11460createColumnlG28NQ4$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f2, float[] fArr, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createColumn-lG28NQ4");
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            fArr = new float[0];
        }
        return constraintLayoutBaseScope.m11475createColumnlG28NQ4(layoutReferenceArr, f2, fArr);
    }

    /* renamed from: createEndBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ VerticalAnchor m11461createEndBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createEndBarrier-3ABfNKs");
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return constraintLayoutBaseScope.m11476createEndBarrier3ABfNKs(layoutReferenceArr, f2);
    }

    /* renamed from: createFlow-6oEtc9w$default, reason: not valid java name */
    public static /* synthetic */ ConstrainedLayoutReference m11462createFlow6oEtc9w$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, boolean z, float f2, float f3, int i2, float f4, float f5, Wrap wrap, VerticalAlign verticalAlign, HorizontalAlign horizontalAlign, float f6, float f7, FlowStyle flowStyle, FlowStyle flowStyle2, int i3, Object obj) {
        if (obj == null) {
            return constraintLayoutBaseScope.m11477createFlow6oEtc9w(layoutReferenceArr, z & ((i3 & 2) == 0), (i3 & 4) != 0 ? 0.0f : f2, (i3 & 8) != 0 ? 0.0f : f3, (i3 & 16) == 0 ? i2 : 0, (i3 & 32) != 0 ? 0.0f : f4, (i3 & 64) != 0 ? 0.0f : f5, (i3 & 128) != 0 ? Wrap.Companion.getNone() : wrap, (i3 & 256) != 0 ? VerticalAlign.Companion.getCenter() : verticalAlign, (i3 & 512) != 0 ? HorizontalAlign.Companion.getCenter() : horizontalAlign, (i3 & 1024) != 0 ? 0.0f : f6, (i3 & 2048) == 0 ? f7 : 0.0f, (i3 & 4096) != 0 ? FlowStyle.Companion.getPacked() : flowStyle, (i3 & 8192) != 0 ? FlowStyle.Companion.getPacked() : flowStyle2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFlow-6oEtc9w");
    }

    /* renamed from: createFlow-Fgo90cY$default, reason: not valid java name */
    public static /* synthetic */ ConstrainedLayoutReference m11463createFlowFgo90cY$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, boolean z, float f2, float f3, int i2, float f4, float f5, float f6, float f7, Wrap wrap, VerticalAlign verticalAlign, HorizontalAlign horizontalAlign, float f8, float f9, FlowStyle flowStyle, FlowStyle flowStyle2, int i3, Object obj) {
        if (obj == null) {
            return constraintLayoutBaseScope.m11478createFlowFgo90cY(layoutReferenceArr, ((i3 & 2) == 0) & z, (i3 & 4) != 0 ? 0.0f : f2, (i3 & 8) != 0 ? 0.0f : f3, (i3 & 16) == 0 ? i2 : 0, (i3 & 32) != 0 ? 0.0f : f4, (i3 & 64) != 0 ? 0.0f : f5, (i3 & 128) != 0 ? 0.0f : f6, (i3 & 256) != 0 ? 0.0f : f7, (i3 & 512) != 0 ? Wrap.Companion.getNone() : wrap, (i3 & 1024) != 0 ? VerticalAlign.Companion.getCenter() : verticalAlign, (i3 & 2048) != 0 ? HorizontalAlign.Companion.getCenter() : horizontalAlign, (i3 & 4096) != 0 ? 0.0f : f8, (i3 & 8192) == 0 ? f9 : 0.0f, (i3 & 16384) != 0 ? FlowStyle.Companion.getPacked() : flowStyle, (i3 & 32768) != 0 ? FlowStyle.Companion.getPacked() : flowStyle2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFlow-Fgo90cY");
    }

    /* renamed from: createFlow-IkjhEj4$default, reason: not valid java name */
    public static /* synthetic */ ConstrainedLayoutReference m11464createFlowIkjhEj4$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, boolean z, float f2, float f3, int i2, float f4, Wrap wrap, VerticalAlign verticalAlign, HorizontalAlign horizontalAlign, float f5, float f6, FlowStyle flowStyle, FlowStyle flowStyle2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFlow-IkjhEj4");
        }
        boolean z2 = z & ((i3 & 2) == 0);
        if ((i3 & 4) != 0) {
            f2 = 0.0f;
        }
        return constraintLayoutBaseScope.m11479createFlowIkjhEj4(layoutReferenceArr, z2, f2, (i3 & 8) != 0 ? 0.0f : f3, (i3 & 16) == 0 ? i2 : 0, (i3 & 32) != 0 ? 0.0f : f4, (i3 & 64) != 0 ? Wrap.Companion.getNone() : wrap, (i3 & 128) != 0 ? VerticalAlign.Companion.getCenter() : verticalAlign, (i3 & 256) != 0 ? HorizontalAlign.Companion.getCenter() : horizontalAlign, (i3 & 512) != 0 ? 0.0f : f5, (i3 & 1024) == 0 ? f6 : 0.0f, (i3 & 2048) != 0 ? FlowStyle.Companion.getPacked() : flowStyle, (i3 & 4096) != 0 ? FlowStyle.Companion.getPacked() : flowStyle2);
    }

    /* renamed from: createGrid-Hu23Yyw$default, reason: not valid java name */
    public static /* synthetic */ ConstrainedLayoutReference m11465createGridHu23Yyw$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, int i2, int i3, boolean z, float f2, float f3, float[] fArr, float[] fArr2, Skip[] skipArr, Span[] spanArr, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createGrid-Hu23Yyw");
        }
        boolean z2 = z | (!((i5 & 8) == 0));
        if ((i5 & 16) != 0) {
            f2 = 0.0f;
        }
        if ((i5 & 32) != 0) {
            f3 = 0.0f;
        }
        if ((i5 & 64) != 0) {
            fArr = new float[0];
        }
        if ((i5 & 128) != 0) {
            fArr2 = new float[0];
        }
        if ((i5 & 256) != 0) {
            skipArr = new Skip[0];
        }
        if ((i5 & 512) != 0) {
            spanArr = new Span[0];
        }
        if ((i5 & 1024) != 0) {
            i4 = GridFlag.Companion.m11539getNonedTRCCdc();
        }
        return constraintLayoutBaseScope.m11480createGridHu23Yyw(layoutReferenceArr, i2, i3, z2, f2, f3, fArr, fArr2, skipArr, spanArr, i4);
    }

    private final int createHelperId() {
        int i2 = this.helperId;
        this.helperId = i2 + 1;
        return i2;
    }

    public static /* synthetic */ HorizontalChainReference createHorizontalChain$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, ChainStyle chainStyle, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createHorizontalChain");
        }
        if ((i2 & 2) != 0) {
            chainStyle = ChainStyle.Companion.getSpread();
        }
        return constraintLayoutBaseScope.createHorizontalChain(layoutReferenceArr, chainStyle);
    }

    /* renamed from: createRow-lG28NQ4$default, reason: not valid java name */
    public static /* synthetic */ ConstrainedLayoutReference m11466createRowlG28NQ4$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f2, float[] fArr, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createRow-lG28NQ4");
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            fArr = new float[0];
        }
        return constraintLayoutBaseScope.m11487createRowlG28NQ4(layoutReferenceArr, f2, fArr);
    }

    /* renamed from: createStartBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ VerticalAnchor m11467createStartBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createStartBarrier-3ABfNKs");
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return constraintLayoutBaseScope.m11488createStartBarrier3ABfNKs(layoutReferenceArr, f2);
    }

    /* renamed from: createTopBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ HorizontalAnchor m11468createTopBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createTopBarrier-3ABfNKs");
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return constraintLayoutBaseScope.m11489createTopBarrier3ABfNKs(layoutReferenceArr, f2);
    }

    public static /* synthetic */ VerticalChainReference createVerticalChain$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, ChainStyle chainStyle, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createVerticalChain");
        }
        if ((i2 & 2) != 0) {
            chainStyle = ChainStyle.Companion.getSpread();
        }
        return constraintLayoutBaseScope.createVerticalChain(layoutReferenceArr, chainStyle);
    }

    public static /* synthetic */ void getContainerObject$annotations() {
    }

    public static /* synthetic */ void getHelpersHashCode$annotations() {
    }

    protected static /* synthetic */ void getTasks$annotations() {
    }

    private final void updateHelpersHashCode(int i2) {
        this.helpersHashCode = ((this.helpersHashCode * 1009) + i2) % 1000000007;
    }

    /* renamed from: withChainParams-ouYQatA$default, reason: not valid java name */
    public static /* synthetic */ LayoutReference m11469withChainParamsouYQatA$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference layoutReference, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withChainParams-ouYQatA");
        }
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        if ((i2 & 16) != 0) {
            f6 = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f7 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            f8 = 0.0f;
        }
        if ((i2 & 128) != 0) {
            f9 = 0.0f;
        }
        if ((i2 & 256) != 0) {
            f10 = Float.NaN;
        }
        constraintLayoutBaseScope.m11490withChainParamsouYQatA(layoutReference, f2, f3, f4, f5, f6, f7, f8, f9, f10);
        return layoutReference;
    }

    /* renamed from: withHorizontalChainParams-YLPp7PM$default, reason: not valid java name */
    public static /* synthetic */ LayoutReference m11470withHorizontalChainParamsYLPp7PM$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference layoutReference, float f2, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withHorizontalChainParams-YLPp7PM");
        }
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        if ((i2 & 16) != 0) {
            f6 = Float.NaN;
        }
        constraintLayoutBaseScope.m11491withHorizontalChainParamsYLPp7PM(layoutReference, f2, f3, f4, f5, f6);
        return layoutReference;
    }

    /* renamed from: withVerticalChainParams-YLPp7PM$default, reason: not valid java name */
    public static /* synthetic */ LayoutReference m11471withVerticalChainParamsYLPp7PM$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference layoutReference, float f2, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withVerticalChainParams-YLPp7PM");
        }
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        if ((i2 & 16) != 0) {
            f6 = Float.NaN;
        }
        constraintLayoutBaseScope.m11492withVerticalChainParamsYLPp7PM(layoutReference, f2, f3, f4, f5, f6);
        return layoutReference;
    }

    public final void applyTo(State state) {
        ConstraintSetParser.LayoutVariables layoutVariables = new ConstraintSetParser.LayoutVariables();
        ConstraintSetParser.populateState(this.containerObject, state, layoutVariables);
    }

    public final CLObject asCLContainer$constraintlayout_compose(LayoutReference layoutReference) {
        String string = layoutReference.getId$constraintlayout_compose().toString();
        if (this.containerObject.getObjectOrNull(string) == null) {
            this.containerObject.put(string, new CLObject(new char[0]));
        }
        return this.containerObject.getObject(string);
    }

    public final ConstrainScope constrain(ConstrainedLayoutReference constrainedLayoutReference, l<? super ConstrainScope, ab> lVar) {
        ConstrainScope constrainScope = new ConstrainScope(constrainedLayoutReference.getId$constraintlayout_compose(), asCLContainer$constraintlayout_compose(constrainedLayoutReference));
        lVar.invoke(constrainScope);
        return constrainScope;
    }

    /* renamed from: createAbsoluteLeftBarrier-3ABfNKs, reason: not valid java name */
    public final VerticalAnchor m11472createAbsoluteLeftBarrier3ABfNKs(LayoutReference[] layoutReferenceArr, float f2) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : layoutReferenceArr) {
            cLArray.add(CLString.from(layoutReference.getId$constraintlayout_compose().toString()));
        }
        LayoutReferenceImpl layoutReferenceImpl2 = layoutReferenceImpl;
        CLObject cLObjectAsCLContainer$constraintlayout_compose = asCLContainer$constraintlayout_compose(layoutReferenceImpl2);
        cLObjectAsCLContainer$constraintlayout_compose.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "barrier");
        cLObjectAsCLContainer$constraintlayout_compose.putString("direction", TtmlNode.LEFT);
        cLObjectAsCLContainer$constraintlayout_compose.putNumber("margin", f2);
        cLObjectAsCLContainer$constraintlayout_compose.put("contains", cLArray);
        updateHelpersHashCode(11);
        for (LayoutReference layoutReference2 : layoutReferenceArr) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(Dp.m11170hashCodeimpl(f2));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose(), 0, layoutReferenceImpl2);
    }

    /* renamed from: createAbsoluteRightBarrier-3ABfNKs, reason: not valid java name */
    public final VerticalAnchor m11473createAbsoluteRightBarrier3ABfNKs(LayoutReference[] layoutReferenceArr, float f2) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : layoutReferenceArr) {
            cLArray.add(CLString.from(layoutReference.getId$constraintlayout_compose().toString()));
        }
        LayoutReferenceImpl layoutReferenceImpl2 = layoutReferenceImpl;
        CLObject cLObjectAsCLContainer$constraintlayout_compose = asCLContainer$constraintlayout_compose(layoutReferenceImpl2);
        cLObjectAsCLContainer$constraintlayout_compose.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "barrier");
        cLObjectAsCLContainer$constraintlayout_compose.putString("direction", TtmlNode.RIGHT);
        cLObjectAsCLContainer$constraintlayout_compose.putNumber("margin", f2);
        cLObjectAsCLContainer$constraintlayout_compose.put("contains", cLArray);
        updateHelpersHashCode(14);
        for (LayoutReference layoutReference2 : layoutReferenceArr) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(Dp.m11170hashCodeimpl(f2));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose(), 0, layoutReferenceImpl2);
    }

    /* renamed from: createBottomBarrier-3ABfNKs, reason: not valid java name */
    public final HorizontalAnchor m11474createBottomBarrier3ABfNKs(LayoutReference[] layoutReferenceArr, float f2) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : layoutReferenceArr) {
            cLArray.add(CLString.from(layoutReference.getId$constraintlayout_compose().toString()));
        }
        LayoutReferenceImpl layoutReferenceImpl2 = layoutReferenceImpl;
        CLObject cLObjectAsCLContainer$constraintlayout_compose = asCLContainer$constraintlayout_compose(layoutReferenceImpl2);
        cLObjectAsCLContainer$constraintlayout_compose.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "barrier");
        cLObjectAsCLContainer$constraintlayout_compose.putString("direction", "bottom");
        cLObjectAsCLContainer$constraintlayout_compose.putNumber("margin", f2);
        cLObjectAsCLContainer$constraintlayout_compose.put("contains", cLArray);
        updateHelpersHashCode(15);
        for (LayoutReference layoutReference2 : layoutReferenceArr) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(Dp.m11170hashCodeimpl(f2));
        return new HorizontalAnchor(layoutReferenceImpl.getId$constraintlayout_compose(), 0, layoutReferenceImpl2);
    }

    /* renamed from: createColumn-lG28NQ4, reason: not valid java name */
    public final ConstrainedLayoutReference m11475createColumnlG28NQ4(LayoutReference[] layoutReferenceArr, float f2, float[] fArr) {
        int length;
        int length2 = fArr.length;
        if (length2 == 0 || (length = layoutReferenceArr.length) == length2) {
            return m11465createGridHu23Yyw$default(this, (LayoutReference[]) Arrays.copyOf(layoutReferenceArr, layoutReferenceArr.length), 0, 1, false, f2, 0.0f, fArr, null, null, null, 0, DisplayStrings.DS_VOICE_PROMPT_VOICE_NAME_MESSAGEBOX_TITLE, null);
        }
        throw new IllegalArgumentException("Number of weights (" + length2 + ") should match number of elements (" + length + ").");
    }

    /* renamed from: createEndBarrier-3ABfNKs, reason: not valid java name */
    public final VerticalAnchor m11476createEndBarrier3ABfNKs(LayoutReference[] layoutReferenceArr, float f2) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : layoutReferenceArr) {
            cLArray.add(CLString.from(layoutReference.getId$constraintlayout_compose().toString()));
        }
        LayoutReferenceImpl layoutReferenceImpl2 = layoutReferenceImpl;
        CLObject cLObjectAsCLContainer$constraintlayout_compose = asCLContainer$constraintlayout_compose(layoutReferenceImpl2);
        cLObjectAsCLContainer$constraintlayout_compose.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "barrier");
        cLObjectAsCLContainer$constraintlayout_compose.putString("direction", TtmlNode.END);
        cLObjectAsCLContainer$constraintlayout_compose.putNumber("margin", f2);
        cLObjectAsCLContainer$constraintlayout_compose.put("contains", cLArray);
        updateHelpersHashCode(13);
        for (LayoutReference layoutReference2 : layoutReferenceArr) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(Dp.m11170hashCodeimpl(f2));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose(), 0, layoutReferenceImpl2);
    }

    /* renamed from: createFlow-6oEtc9w, reason: not valid java name */
    public final ConstrainedLayoutReference m11477createFlow6oEtc9w(LayoutReference[] layoutReferenceArr, boolean z, float f2, float f3, int i2, float f4, float f5, Wrap wrap, VerticalAlign verticalAlign, HorizontalAlign horizontalAlign, float f6, float f7, FlowStyle flowStyle, FlowStyle flowStyle2) {
        return m11478createFlowFgo90cY((LayoutReference[]) Arrays.copyOf(layoutReferenceArr, layoutReferenceArr.length), z, f2, f3, i2, f4, f5, f4, f5, wrap, verticalAlign, horizontalAlign, f6, f7, flowStyle, flowStyle2);
    }

    /* renamed from: createFlow-Fgo90cY, reason: not valid java name */
    public final ConstrainedLayoutReference m11478createFlowFgo90cY(LayoutReference[] layoutReferenceArr, boolean z, float f2, float f3, int i2, float f4, float f5, float f6, float f7, Wrap wrap, VerticalAlign verticalAlign, HorizontalAlign horizontalAlign, float f8, float f9, FlowStyle flowStyle, FlowStyle flowStyle2) {
        ConstrainedLayoutReference constrainedLayoutReference = new ConstrainedLayoutReference(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : layoutReferenceArr) {
            if (layoutReference != null) {
                cLArray.add(CLString.from(layoutReference.getId$constraintlayout_compose().toString()));
            }
        }
        CLArray cLArray2 = new CLArray(new char[0]);
        cLArray2.add(new CLNumber(f4));
        cLArray2.add(new CLNumber(f5));
        cLArray2.add(new CLNumber(f6));
        cLArray2.add(new CLNumber(f7));
        CLObject cLObjectAsCLContainer$constraintlayout_compose = asCLContainer$constraintlayout_compose(constrainedLayoutReference);
        cLObjectAsCLContainer$constraintlayout_compose.put("contains", cLArray);
        cLObjectAsCLContainer$constraintlayout_compose.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, true != z ? "hFlow" : "vFlow");
        cLObjectAsCLContainer$constraintlayout_compose.putNumber("vGap", f2);
        cLObjectAsCLContainer$constraintlayout_compose.putNumber("hGap", f3);
        cLObjectAsCLContainer$constraintlayout_compose.putNumber("maxElement", i2);
        cLObjectAsCLContainer$constraintlayout_compose.put("padding", cLArray2);
        cLObjectAsCLContainer$constraintlayout_compose.putString("wrap", wrap.getName$constraintlayout_compose());
        cLObjectAsCLContainer$constraintlayout_compose.putString("vAlign", verticalAlign.getName$constraintlayout_compose());
        cLObjectAsCLContainer$constraintlayout_compose.putString("hAlign", horizontalAlign.getName$constraintlayout_compose());
        cLObjectAsCLContainer$constraintlayout_compose.putNumber("hFlowBias", f8);
        cLObjectAsCLContainer$constraintlayout_compose.putNumber("vFlowBias", f9);
        cLObjectAsCLContainer$constraintlayout_compose.putString("vStyle", flowStyle.getName$constraintlayout_compose());
        cLObjectAsCLContainer$constraintlayout_compose.putString("hStyle", flowStyle2.getName$constraintlayout_compose());
        updateHelpersHashCode(16);
        int length = layoutReferenceArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            LayoutReference layoutReference2 = layoutReferenceArr[i3];
            updateHelpersHashCode(layoutReference2 != null ? layoutReference2.hashCode() : 0);
        }
        return constrainedLayoutReference;
    }

    /* renamed from: createFlow-IkjhEj4, reason: not valid java name */
    public final ConstrainedLayoutReference m11479createFlowIkjhEj4(LayoutReference[] layoutReferenceArr, boolean z, float f2, float f3, int i2, float f4, Wrap wrap, VerticalAlign verticalAlign, HorizontalAlign horizontalAlign, float f5, float f6, FlowStyle flowStyle, FlowStyle flowStyle2) {
        return m11478createFlowFgo90cY((LayoutReference[]) Arrays.copyOf(layoutReferenceArr, layoutReferenceArr.length), z, f2, f3, i2, f4, f4, f4, f4, wrap, verticalAlign, horizontalAlign, f5, f6, flowStyle, flowStyle2);
    }

    /* renamed from: createGrid-Hu23Yyw, reason: not valid java name */
    public final ConstrainedLayoutReference m11480createGridHu23Yyw(LayoutReference[] layoutReferenceArr, int i2, int i3, boolean z, float f2, float f3, float[] fArr, float[] fArr2, Skip[] skipArr, Span[] spanArr, int i4) {
        int length = fArr.length;
        if (length != 0 && i2 > 0 && i2 != length) {
            throw new IllegalArgumentException("Number of weights (" + length + ") should match number of rows (" + i2 + ").");
        }
        int length2 = fArr2.length;
        if (length2 != 0 && i3 > 0 && i3 != length2) {
            throw new IllegalArgumentException("Number of weights (" + length2 + ") should match number of columns (" + i3 + ").");
        }
        ConstrainedLayoutReference constrainedLayoutReference = new ConstrainedLayoutReference(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : layoutReferenceArr) {
            cLArray.add(CLString.from(layoutReference.getId$constraintlayout_compose().toString()));
        }
        String strAD = fArr.length > 1 ? c.aD(fArr, ",", 0, null, null, 62) : "";
        String strAD2 = fArr2.length > 1 ? c.aD(fArr2, ",", 0, null, null, 62) : "";
        String strAE = skipArr.length == 0 ? "" : c.aE(skipArr, ",", null, null, new l<Skip, CharSequence>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutBaseScope$createGrid$2
            @Override // h.g.a.l
            public /* bridge */ /* synthetic */ CharSequence invoke(Skip skip) {
                return m11493invokefXgvMDs(skip.m11622unboximpl());
            }

            /* renamed from: invoke-fXgvMDs, reason: not valid java name */
            public final CharSequence m11493invokefXgvMDs(String str) {
                return str;
            }
        }, 30);
        String strAE2 = spanArr.length != 0 ? c.aE(spanArr, ",", null, null, new l<Span, CharSequence>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutBaseScope$createGrid$3
            @Override // h.g.a.l
            public /* bridge */ /* synthetic */ CharSequence invoke(Span span) {
                return m11494invoke56oDYsA(span.m11631unboximpl());
            }

            /* renamed from: invoke-56oDYsA, reason: not valid java name */
            public final CharSequence m11494invoke56oDYsA(String str) {
                return str;
            }
        }, 30) : "";
        CLObject cLObjectAsCLContainer$constraintlayout_compose = asCLContainer$constraintlayout_compose(constrainedLayoutReference);
        cLObjectAsCLContainer$constraintlayout_compose.put("contains", cLArray);
        cLObjectAsCLContainer$constraintlayout_compose.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "grid");
        cLObjectAsCLContainer$constraintlayout_compose.putNumber("orientation", true != z ? 1.0f : 0.0f);
        cLObjectAsCLContainer$constraintlayout_compose.putNumber("rows", i2);
        cLObjectAsCLContainer$constraintlayout_compose.putNumber("columns", i3);
        cLObjectAsCLContainer$constraintlayout_compose.putNumber("vGap", f2);
        cLObjectAsCLContainer$constraintlayout_compose.putNumber("hGap", f3);
        cLObjectAsCLContainer$constraintlayout_compose.putString("rowWeights", strAD);
        cLObjectAsCLContainer$constraintlayout_compose.putString("columnWeights", strAD2);
        cLObjectAsCLContainer$constraintlayout_compose.putString("skips", strAE);
        cLObjectAsCLContainer$constraintlayout_compose.putString("spans", strAE2);
        cLObjectAsCLContainer$constraintlayout_compose.putNumber("flags", i4);
        return constrainedLayoutReference;
    }

    public final VerticalAnchor createGuidelineFromAbsoluteLeft(float f2) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        LayoutReferenceImpl layoutReferenceImpl2 = layoutReferenceImpl;
        CLObject cLObjectAsCLContainer$constraintlayout_compose = asCLContainer$constraintlayout_compose(layoutReferenceImpl2);
        cLObjectAsCLContainer$constraintlayout_compose.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "vGuideline");
        cLObjectAsCLContainer$constraintlayout_compose.putNumber("percent", f2);
        updateHelpersHashCode(4);
        updateHelpersHashCode(Float.floatToIntBits(f2));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose(), 0, layoutReferenceImpl2);
    }

    /* renamed from: createGuidelineFromAbsoluteLeft-0680j_4, reason: not valid java name */
    public final VerticalAnchor m11481createGuidelineFromAbsoluteLeft0680j_4(float f2) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        LayoutReferenceImpl layoutReferenceImpl2 = layoutReferenceImpl;
        CLObject cLObjectAsCLContainer$constraintlayout_compose = asCLContainer$constraintlayout_compose(layoutReferenceImpl2);
        cLObjectAsCLContainer$constraintlayout_compose.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "vGuideline");
        cLObjectAsCLContainer$constraintlayout_compose.putNumber(TtmlNode.LEFT, f2);
        updateHelpersHashCode(2);
        updateHelpersHashCode(Dp.m11170hashCodeimpl(f2));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose(), 0, layoutReferenceImpl2);
    }

    public final VerticalAnchor createGuidelineFromAbsoluteRight(float f2) {
        return createGuidelineFromAbsoluteLeft(1.0f - f2);
    }

    /* renamed from: createGuidelineFromAbsoluteRight-0680j_4, reason: not valid java name */
    public final VerticalAnchor m11482createGuidelineFromAbsoluteRight0680j_4(float f2) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        LayoutReferenceImpl layoutReferenceImpl2 = layoutReferenceImpl;
        CLObject cLObjectAsCLContainer$constraintlayout_compose = asCLContainer$constraintlayout_compose(layoutReferenceImpl2);
        cLObjectAsCLContainer$constraintlayout_compose.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "vGuideline");
        cLObjectAsCLContainer$constraintlayout_compose.putNumber(TtmlNode.RIGHT, f2);
        updateHelpersHashCode(6);
        updateHelpersHashCode(Dp.m11170hashCodeimpl(f2));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose(), 0, layoutReferenceImpl2);
    }

    public final HorizontalAnchor createGuidelineFromBottom(float f2) {
        return createGuidelineFromTop(1.0f - f2);
    }

    /* renamed from: createGuidelineFromBottom-0680j_4, reason: not valid java name */
    public final HorizontalAnchor m11483createGuidelineFromBottom0680j_4(float f2) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        LayoutReferenceImpl layoutReferenceImpl2 = layoutReferenceImpl;
        CLObject cLObjectAsCLContainer$constraintlayout_compose = asCLContainer$constraintlayout_compose(layoutReferenceImpl2);
        cLObjectAsCLContainer$constraintlayout_compose.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "hGuideline");
        cLObjectAsCLContainer$constraintlayout_compose.putNumber(TtmlNode.END, f2);
        updateHelpersHashCode(9);
        updateHelpersHashCode(Dp.m11170hashCodeimpl(f2));
        return new HorizontalAnchor(layoutReferenceImpl.getId$constraintlayout_compose(), 0, layoutReferenceImpl2);
    }

    public final VerticalAnchor createGuidelineFromEnd(float f2) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.add(CLString.from(TtmlNode.END));
        cLArray.add(new CLNumber(f2));
        LayoutReferenceImpl layoutReferenceImpl2 = layoutReferenceImpl;
        CLObject cLObjectAsCLContainer$constraintlayout_compose = asCLContainer$constraintlayout_compose(layoutReferenceImpl2);
        cLObjectAsCLContainer$constraintlayout_compose.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "vGuideline");
        cLObjectAsCLContainer$constraintlayout_compose.put("percent", cLArray);
        updateHelpersHashCode(3);
        updateHelpersHashCode(Float.floatToIntBits(f2));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose(), 0, layoutReferenceImpl2);
    }

    /* renamed from: createGuidelineFromEnd-0680j_4, reason: not valid java name */
    public final VerticalAnchor m11484createGuidelineFromEnd0680j_4(float f2) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        LayoutReferenceImpl layoutReferenceImpl2 = layoutReferenceImpl;
        CLObject cLObjectAsCLContainer$constraintlayout_compose = asCLContainer$constraintlayout_compose(layoutReferenceImpl2);
        cLObjectAsCLContainer$constraintlayout_compose.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "vGuideline");
        cLObjectAsCLContainer$constraintlayout_compose.putNumber(TtmlNode.END, f2);
        updateHelpersHashCode(5);
        updateHelpersHashCode(Dp.m11170hashCodeimpl(f2));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose(), 0, layoutReferenceImpl2);
    }

    public final VerticalAnchor createGuidelineFromStart(float f2) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.add(CLString.from(TtmlNode.START));
        cLArray.add(new CLNumber(f2));
        LayoutReferenceImpl layoutReferenceImpl2 = layoutReferenceImpl;
        CLObject cLObjectAsCLContainer$constraintlayout_compose = asCLContainer$constraintlayout_compose(layoutReferenceImpl2);
        cLObjectAsCLContainer$constraintlayout_compose.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "vGuideline");
        cLObjectAsCLContainer$constraintlayout_compose.put("percent", cLArray);
        updateHelpersHashCode(3);
        updateHelpersHashCode(Float.floatToIntBits(f2));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose(), 0, layoutReferenceImpl2);
    }

    /* renamed from: createGuidelineFromStart-0680j_4, reason: not valid java name */
    public final VerticalAnchor m11485createGuidelineFromStart0680j_4(float f2) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        LayoutReferenceImpl layoutReferenceImpl2 = layoutReferenceImpl;
        CLObject cLObjectAsCLContainer$constraintlayout_compose = asCLContainer$constraintlayout_compose(layoutReferenceImpl2);
        cLObjectAsCLContainer$constraintlayout_compose.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "vGuideline");
        cLObjectAsCLContainer$constraintlayout_compose.putNumber(TtmlNode.START, f2);
        updateHelpersHashCode(1);
        updateHelpersHashCode(Dp.m11170hashCodeimpl(f2));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose(), 0, layoutReferenceImpl2);
    }

    public final HorizontalAnchor createGuidelineFromTop(float f2) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        LayoutReferenceImpl layoutReferenceImpl2 = layoutReferenceImpl;
        CLObject cLObjectAsCLContainer$constraintlayout_compose = asCLContainer$constraintlayout_compose(layoutReferenceImpl2);
        cLObjectAsCLContainer$constraintlayout_compose.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "hGuideline");
        cLObjectAsCLContainer$constraintlayout_compose.putNumber("percent", f2);
        updateHelpersHashCode(8);
        updateHelpersHashCode(Float.floatToIntBits(f2));
        return new HorizontalAnchor(layoutReferenceImpl.getId$constraintlayout_compose(), 0, layoutReferenceImpl2);
    }

    /* renamed from: createGuidelineFromTop-0680j_4, reason: not valid java name */
    public final HorizontalAnchor m11486createGuidelineFromTop0680j_4(float f2) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        LayoutReferenceImpl layoutReferenceImpl2 = layoutReferenceImpl;
        CLObject cLObjectAsCLContainer$constraintlayout_compose = asCLContainer$constraintlayout_compose(layoutReferenceImpl2);
        cLObjectAsCLContainer$constraintlayout_compose.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "hGuideline");
        cLObjectAsCLContainer$constraintlayout_compose.putNumber(TtmlNode.START, f2);
        updateHelpersHashCode(7);
        updateHelpersHashCode(Dp.m11170hashCodeimpl(f2));
        return new HorizontalAnchor(layoutReferenceImpl.getId$constraintlayout_compose(), 0, layoutReferenceImpl2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.constraintlayout.core.parser.CLArray, androidx.constraintlayout.core.parser.CLContainer] */
    public final HorizontalChainReference createHorizontalChain(LayoutReference[] layoutReferenceArr, ChainStyle chainStyle) {
        ?? From;
        HorizontalChainReference horizontalChainReference = new HorizontalChainReference(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : layoutReferenceArr) {
            Map map = layoutReference.helperParamsMap;
            int i2 = ar.f48106a;
            Object obj = map.get(new m(ChainParams.class).c());
            if (true != (obj instanceof ChainParams)) {
                obj = null;
            }
            ChainParams chainParams = (ChainParams) obj;
            if (chainParams != null) {
                From = new CLArray(new char[0]);
                From.add(CLString.from(layoutReference.getId$constraintlayout_compose().toString()));
                From.add(new CLNumber(chainParams.getWeight()));
                From.add(new CLNumber(chainParams.m11439getStartMarginD9Ej5fM()));
                From.add(new CLNumber(chainParams.m11437getEndMarginD9Ej5fM()));
                From.add(new CLNumber(chainParams.m11438getStartGoneMarginD9Ej5fM()));
                From.add(new CLNumber(chainParams.m11436getEndGoneMarginD9Ej5fM()));
            } else {
                From = CLString.from(layoutReference.getId$constraintlayout_compose().toString());
            }
            cLArray.add((CLElement) From);
        }
        CLArray cLArray2 = new CLArray(new char[0]);
        cLArray2.add(CLString.from(chainStyle.getName$constraintlayout_compose()));
        Float bias$constraintlayout_compose = chainStyle.getBias$constraintlayout_compose();
        cLArray2.add(new CLNumber(bias$constraintlayout_compose != null ? bias$constraintlayout_compose.floatValue() : 0.5f));
        CLObject cLObjectAsCLContainer$constraintlayout_compose = asCLContainer$constraintlayout_compose(horizontalChainReference);
        cLObjectAsCLContainer$constraintlayout_compose.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "hChain");
        cLObjectAsCLContainer$constraintlayout_compose.put("contains", cLArray);
        cLObjectAsCLContainer$constraintlayout_compose.put("style", cLArray2);
        updateHelpersHashCode(16);
        for (LayoutReference layoutReference2 : layoutReferenceArr) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(chainStyle.hashCode());
        return horizontalChainReference;
    }

    /* renamed from: createRow-lG28NQ4, reason: not valid java name */
    public final ConstrainedLayoutReference m11487createRowlG28NQ4(LayoutReference[] layoutReferenceArr, float f2, float[] fArr) {
        int length;
        int length2 = fArr.length;
        if (length2 == 0 || (length = layoutReferenceArr.length) == length2) {
            return m11465createGridHu23Yyw$default(this, (LayoutReference[]) Arrays.copyOf(layoutReferenceArr, layoutReferenceArr.length), 1, 0, false, 0.0f, f2, null, fArr, null, null, 0, DisplayStrings.DS_VOICE_TYPING, null);
        }
        throw new IllegalArgumentException("Number of weights (" + length2 + ") should match number of elements (" + length + ").");
    }

    /* renamed from: createStartBarrier-3ABfNKs, reason: not valid java name */
    public final VerticalAnchor m11488createStartBarrier3ABfNKs(LayoutReference[] layoutReferenceArr, float f2) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : layoutReferenceArr) {
            cLArray.add(CLString.from(layoutReference.getId$constraintlayout_compose().toString()));
        }
        LayoutReferenceImpl layoutReferenceImpl2 = layoutReferenceImpl;
        CLObject cLObjectAsCLContainer$constraintlayout_compose = asCLContainer$constraintlayout_compose(layoutReferenceImpl2);
        cLObjectAsCLContainer$constraintlayout_compose.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "barrier");
        cLObjectAsCLContainer$constraintlayout_compose.putString("direction", TtmlNode.START);
        cLObjectAsCLContainer$constraintlayout_compose.putNumber("margin", f2);
        cLObjectAsCLContainer$constraintlayout_compose.put("contains", cLArray);
        updateHelpersHashCode(10);
        for (LayoutReference layoutReference2 : layoutReferenceArr) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(Dp.m11170hashCodeimpl(f2));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose(), 0, layoutReferenceImpl2);
    }

    /* renamed from: createTopBarrier-3ABfNKs, reason: not valid java name */
    public final HorizontalAnchor m11489createTopBarrier3ABfNKs(LayoutReference[] layoutReferenceArr, float f2) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : layoutReferenceArr) {
            cLArray.add(CLString.from(layoutReference.getId$constraintlayout_compose().toString()));
        }
        LayoutReferenceImpl layoutReferenceImpl2 = layoutReferenceImpl;
        CLObject cLObjectAsCLContainer$constraintlayout_compose = asCLContainer$constraintlayout_compose(layoutReferenceImpl2);
        cLObjectAsCLContainer$constraintlayout_compose.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "barrier");
        cLObjectAsCLContainer$constraintlayout_compose.putString("direction", "top");
        cLObjectAsCLContainer$constraintlayout_compose.putNumber("margin", f2);
        cLObjectAsCLContainer$constraintlayout_compose.put("contains", cLArray);
        updateHelpersHashCode(12);
        for (LayoutReference layoutReference2 : layoutReferenceArr) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(Dp.m11170hashCodeimpl(f2));
        return new HorizontalAnchor(layoutReferenceImpl.getId$constraintlayout_compose(), 0, layoutReferenceImpl2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.constraintlayout.core.parser.CLArray, androidx.constraintlayout.core.parser.CLContainer] */
    public final VerticalChainReference createVerticalChain(LayoutReference[] layoutReferenceArr, ChainStyle chainStyle) {
        ?? From;
        VerticalChainReference verticalChainReference = new VerticalChainReference(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : layoutReferenceArr) {
            Map map = layoutReference.helperParamsMap;
            int i2 = ar.f48106a;
            Object obj = map.get(new m(ChainParams.class).c());
            if (true != (obj instanceof ChainParams)) {
                obj = null;
            }
            ChainParams chainParams = (ChainParams) obj;
            if (chainParams != null) {
                From = new CLArray(new char[0]);
                From.add(CLString.from(layoutReference.getId$constraintlayout_compose().toString()));
                From.add(new CLNumber(chainParams.getWeight()));
                From.add(new CLNumber(chainParams.m11441getTopMarginD9Ej5fM()));
                From.add(new CLNumber(chainParams.m11435getBottomMarginD9Ej5fM()));
                From.add(new CLNumber(chainParams.m11440getTopGoneMarginD9Ej5fM()));
                From.add(new CLNumber(chainParams.m11434getBottomGoneMarginD9Ej5fM()));
            } else {
                From = CLString.from(layoutReference.getId$constraintlayout_compose().toString());
            }
            cLArray.add((CLElement) From);
        }
        CLArray cLArray2 = new CLArray(new char[0]);
        cLArray2.add(CLString.from(chainStyle.getName$constraintlayout_compose()));
        Float bias$constraintlayout_compose = chainStyle.getBias$constraintlayout_compose();
        cLArray2.add(new CLNumber(bias$constraintlayout_compose != null ? bias$constraintlayout_compose.floatValue() : 0.5f));
        CLObject cLObjectAsCLContainer$constraintlayout_compose = asCLContainer$constraintlayout_compose(verticalChainReference);
        cLObjectAsCLContainer$constraintlayout_compose.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "vChain");
        cLObjectAsCLContainer$constraintlayout_compose.put("contains", cLArray);
        cLObjectAsCLContainer$constraintlayout_compose.put("style", cLArray2);
        updateHelpersHashCode(17);
        for (LayoutReference layoutReference2 : layoutReferenceArr) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(chainStyle.hashCode());
        return verticalChainReference;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConstraintLayoutBaseScope) {
            return x.n(this.containerObject, ((ConstraintLayoutBaseScope) obj).containerObject);
        }
        return false;
    }

    public final CLObject getContainerObject() {
        return this.containerObject;
    }

    public final int getHelpersHashCode() {
        return this.helpersHashCode;
    }

    protected final List<l<State, ab>> getTasks() {
        return this.tasks;
    }

    public int hashCode() {
        return this.containerObject.hashCode();
    }

    public void reset() {
        this.containerObject.clear();
        this.helperId = this.HelpersStartId;
        this.helpersHashCode = 0;
    }

    public final void setHelpersHashCode(int i2) {
        this.helpersHashCode = i2;
    }

    /* renamed from: withChainParams-ouYQatA, reason: not valid java name */
    public final LayoutReference m11490withChainParamsouYQatA(LayoutReference layoutReference, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        layoutReference.setHelperParams$constraintlayout_compose(new ChainParams(f2, f3, f4, f5, f6, f7, f8, f9, f10, null));
        return layoutReference;
    }

    /* renamed from: withHorizontalChainParams-YLPp7PM, reason: not valid java name */
    public final LayoutReference m11491withHorizontalChainParamsYLPp7PM(LayoutReference layoutReference, float f2, float f3, float f4, float f5, float f6) {
        m11490withChainParamsouYQatA(layoutReference, f2, 0.0f, f3, 0.0f, f4, 0.0f, f5, 0.0f, f6);
        return layoutReference;
    }

    /* renamed from: withVerticalChainParams-YLPp7PM, reason: not valid java name */
    public final LayoutReference m11492withVerticalChainParamsYLPp7PM(LayoutReference layoutReference, float f2, float f3, float f4, float f5, float f6) {
        m11490withChainParamsouYQatA(layoutReference, 0.0f, f2, 0.0f, f3, 0.0f, f4, 0.0f, f5, f6);
        return layoutReference;
    }

    public final HorizontalChainScope constrain(HorizontalChainReference horizontalChainReference, l<? super HorizontalChainScope, ab> lVar) {
        HorizontalChainScope horizontalChainScope = new HorizontalChainScope(horizontalChainReference.getId$constraintlayout_compose(), asCLContainer$constraintlayout_compose(horizontalChainReference));
        lVar.invoke(horizontalChainScope);
        return horizontalChainScope;
    }

    public final VerticalChainScope constrain(VerticalChainReference verticalChainReference, l<? super VerticalChainScope, ab> lVar) {
        VerticalChainScope verticalChainScope = new VerticalChainScope(verticalChainReference.getId$constraintlayout_compose(), asCLContainer$constraintlayout_compose(verticalChainReference));
        lVar.invoke(verticalChainScope);
        return verticalChainScope;
    }

    public final void constrain(ConstrainedLayoutReference[] constrainedLayoutReferenceArr, l<? super ConstrainScope, ab> lVar) {
        for (ConstrainedLayoutReference constrainedLayoutReference : constrainedLayoutReferenceArr) {
            constrain(constrainedLayoutReference, lVar);
        }
    }

    public ConstraintLayoutBaseScope() {
        this(null);
    }
}
