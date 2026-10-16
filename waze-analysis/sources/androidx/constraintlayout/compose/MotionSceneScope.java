package androidx.constraintlayout.compose;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.constraintlayout.core.parser.CLObject;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MotionSceneScope {
    public static final int $stable = 8;
    private int generatedCount;
    private int generatedIdCount;
    private HashMap<String, ConstraintSet> constraintSetsByName = new HashMap<>();
    private HashMap<String, Transition> transitionsByName = new HashMap<>();

    /* compiled from: WazeSource */
    public final class ConstrainedLayoutReferences {
        private final Object[] ids;

        public ConstrainedLayoutReferences(Object[] objArr) {
            this.ids = objArr;
        }

        public final ConstrainedLayoutReference component1() {
            Object[] objArr = this.ids;
            return new ConstrainedLayoutReference(objArr.length > 0 ? objArr[0] : MotionSceneScope.this.nextId());
        }

        public final ConstrainedLayoutReference component10() {
            Object[] objArr = this.ids;
            return MotionSceneScope.this.createRefFor(objArr.length > 9 ? objArr[9] : MotionSceneScope.this.nextId());
        }

        public final ConstrainedLayoutReference component11() {
            Object[] objArr = this.ids;
            return MotionSceneScope.this.createRefFor(objArr.length > 10 ? objArr[10] : MotionSceneScope.this.nextId());
        }

        public final ConstrainedLayoutReference component12() {
            Object[] objArr = this.ids;
            return MotionSceneScope.this.createRefFor(objArr.length > 11 ? objArr[11] : MotionSceneScope.this.nextId());
        }

        public final ConstrainedLayoutReference component13() {
            Object[] objArr = this.ids;
            return MotionSceneScope.this.createRefFor(objArr.length > 12 ? objArr[12] : MotionSceneScope.this.nextId());
        }

        public final ConstrainedLayoutReference component14() {
            Object[] objArr = this.ids;
            return MotionSceneScope.this.createRefFor(objArr.length > 13 ? objArr[13] : MotionSceneScope.this.nextId());
        }

        public final ConstrainedLayoutReference component15() {
            Object[] objArr = this.ids;
            return MotionSceneScope.this.createRefFor(objArr.length > 14 ? objArr[14] : MotionSceneScope.this.nextId());
        }

        public final ConstrainedLayoutReference component16() {
            Object[] objArr = this.ids;
            return MotionSceneScope.this.createRefFor(objArr.length > 15 ? objArr[15] : MotionSceneScope.this.nextId());
        }

        public final ConstrainedLayoutReference component2() {
            Object[] objArr = this.ids;
            return MotionSceneScope.this.createRefFor(objArr.length > 1 ? objArr[1] : MotionSceneScope.this.nextId());
        }

        public final ConstrainedLayoutReference component3() {
            Object[] objArr = this.ids;
            return MotionSceneScope.this.createRefFor(objArr.length > 2 ? objArr[2] : MotionSceneScope.this.nextId());
        }

        public final ConstrainedLayoutReference component4() {
            Object[] objArr = this.ids;
            return MotionSceneScope.this.createRefFor(objArr.length > 3 ? objArr[3] : MotionSceneScope.this.nextId());
        }

        public final ConstrainedLayoutReference component5() {
            Object[] objArr = this.ids;
            return MotionSceneScope.this.createRefFor(objArr.length > 4 ? objArr[4] : MotionSceneScope.this.nextId());
        }

        public final ConstrainedLayoutReference component6() {
            Object[] objArr = this.ids;
            return MotionSceneScope.this.createRefFor(objArr.length > 5 ? objArr[5] : MotionSceneScope.this.nextId());
        }

        public final ConstrainedLayoutReference component7() {
            Object[] objArr = this.ids;
            return MotionSceneScope.this.createRefFor(objArr.length > 6 ? objArr[6] : MotionSceneScope.this.nextId());
        }

        public final ConstrainedLayoutReference component8() {
            Object[] objArr = this.ids;
            return MotionSceneScope.this.createRefFor(objArr.length > 7 ? objArr[7] : MotionSceneScope.this.nextId());
        }

        public final ConstrainedLayoutReference component9() {
            Object[] objArr = this.ids;
            return MotionSceneScope.this.createRefFor(objArr.length > 8 ? objArr[8] : MotionSceneScope.this.nextId());
        }
    }

    public static /* synthetic */ ConstraintSetRef addConstraintSet$default(MotionSceneScope motionSceneScope, ConstraintSet constraintSet, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return motionSceneScope.addConstraintSet(constraintSet, str);
    }

    public static /* synthetic */ void addTransition$default(MotionSceneScope motionSceneScope, Transition transition, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        motionSceneScope.addTransition(transition, str);
    }

    public static /* synthetic */ ConstraintSetRef constraintSet$default(MotionSceneScope motionSceneScope, String str, ConstraintSetRef constraintSetRef, l lVar, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            constraintSetRef = null;
        }
        return motionSceneScope.constraintSet(str, constraintSetRef, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defaultTransition$default(MotionSceneScope motionSceneScope, ConstraintSetRef constraintSetRef, ConstraintSetRef constraintSetRef2, l lVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            lVar = new l() { // from class: androidx.constraintlayout.compose.MotionSceneScope$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return ab.f48028a;
                }
            };
        }
        motionSceneScope.defaultTransition(constraintSetRef, constraintSetRef2, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String nextId() {
        StringBuilder sb = new StringBuilder("androidx.constraintlayoutid");
        int i2 = this.generatedIdCount;
        this.generatedIdCount = i2 + 1;
        sb.append(i2);
        return sb.toString();
    }

    private final String nextName() {
        StringBuilder sb = new StringBuilder("androidx.constraintlayout");
        int i2 = this.generatedCount;
        this.generatedCount = i2 + 1;
        sb.append(i2);
        return sb.toString();
    }

    private final void setMotionProperty(ConstrainScope constrainScope, String str, float f2) {
        if (!constrainScope.getContainerObject$constraintlayout_compose().has("motion")) {
            constrainScope.getContainerObject$constraintlayout_compose().put("motion", new CLObject(new char[0]));
        }
        CLObject objectOrNull = constrainScope.getContainerObject$constraintlayout_compose().getObjectOrNull("motion");
        if (objectOrNull == null) {
            return;
        }
        objectOrNull.putNumber(str, f2);
    }

    /* renamed from: toJsonHexString-8_81llA, reason: not valid java name */
    private final String m11607toJsonHexString8_81llA(long j2) {
        String str = String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(ColorKt.m8282toArgb8_81llA(j2))}, 1));
        x.e(str, "format(...)");
        return str;
    }

    public static /* synthetic */ void transition$default(MotionSceneScope motionSceneScope, ConstraintSetRef constraintSetRef, ConstraintSetRef constraintSetRef2, String str, l lVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        motionSceneScope.transition(constraintSetRef, constraintSetRef2, str, lVar);
    }

    public final ConstraintSetRef addConstraintSet(ConstraintSet constraintSet, String str) {
        if (str == null) {
            str = nextName();
        }
        this.constraintSetsByName.put(str, constraintSet);
        return new ConstraintSetRef(str);
    }

    public final void addTransition(Transition transition, String str) {
        if (str == null) {
            str = nextName();
        }
        this.transitionsByName.put(str, transition);
    }

    public final ConstraintSetRef constraintSet(String str, ConstraintSetRef constraintSetRef, l<? super ConstraintSetScope, ab> lVar) {
        return addConstraintSet(new DslConstraintSet(lVar, constraintSetRef != null ? this.constraintSetsByName.get(constraintSetRef.getName$constraintlayout_compose()) : null), str);
    }

    public final ConstrainedLayoutReference createRefFor(Object obj) {
        return new ConstrainedLayoutReference(obj);
    }

    public final ConstrainedLayoutReferences createRefsFor(Object... objArr) {
        return new ConstrainedLayoutReferences(Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: customColor-mxwnekA, reason: not valid java name */
    public final void m11608customColormxwnekA(ConstrainScope constrainScope, String str, long j2) {
        if (!constrainScope.getContainerObject$constraintlayout_compose().has("custom")) {
            constrainScope.getContainerObject$constraintlayout_compose().put("custom", new CLObject(new char[0]));
        }
        CLObject objectOrNull = constrainScope.getContainerObject$constraintlayout_compose().getObjectOrNull("custom");
        if (objectOrNull == null) {
            return;
        }
        objectOrNull.putString(str, m11607toJsonHexString8_81llA(j2));
    }

    /* renamed from: customDistance-wH6b6FI, reason: not valid java name */
    public final void m11611customDistancewH6b6FI(KeyAttributeScope keyAttributeScope, String str, float f2) {
        keyAttributeScope.getCustomPropertiesValue$constraintlayout_compose().put(str, Float.valueOf(f2));
    }

    public final void customFloat(ConstrainScope constrainScope, String str, float f2) {
        if (!constrainScope.getContainerObject$constraintlayout_compose().has("custom")) {
            constrainScope.getContainerObject$constraintlayout_compose().put("custom", new CLObject(new char[0]));
        }
        CLObject objectOrNull = constrainScope.getContainerObject$constraintlayout_compose().getObjectOrNull("custom");
        if (objectOrNull == null) {
            return;
        }
        objectOrNull.putNumber(str, f2);
    }

    /* renamed from: customFontSize-kncR6DU, reason: not valid java name */
    public final void m11613customFontSizekncR6DU(KeyAttributeScope keyAttributeScope, String str, long j2) {
        keyAttributeScope.getCustomPropertiesValue$constraintlayout_compose().put(str, Float.valueOf(TextUnit.m11362getValueimpl(j2)));
    }

    public final void customInt(KeyAttributeScope keyAttributeScope, String str, int i2) {
        keyAttributeScope.getCustomPropertiesValue$constraintlayout_compose().put(str, Integer.valueOf(i2));
    }

    public final void defaultTransition(ConstraintSetRef constraintSetRef, ConstraintSetRef constraintSetRef2, l<? super TransitionScope, ab> lVar) {
        transition(constraintSetRef, constraintSetRef2, "default", lVar);
    }

    public final HashMap<String, ConstraintSet> getConstraintSetsByName$constraintlayout_compose() {
        return this.constraintSetsByName;
    }

    public final float getStaggeredWeight(ConstrainScope constrainScope) {
        if (constrainScope.getContainerObject$constraintlayout_compose().has("motion")) {
            return constrainScope.getContainerObject$constraintlayout_compose().getObject("motion").getFloatOrNaN("stagger");
        }
        return Float.NaN;
    }

    public final HashMap<String, Transition> getTransitionsByName$constraintlayout_compose() {
        return this.transitionsByName;
    }

    public final void reset$constraintlayout_compose() {
        this.generatedCount = 0;
        this.constraintSetsByName.clear();
        this.transitionsByName.clear();
    }

    public final void setConstraintSetsByName$constraintlayout_compose(HashMap<String, ConstraintSet> map) {
        this.constraintSetsByName = map;
    }

    public final void setStaggeredWeight(ConstrainScope constrainScope, float f2) {
        setMotionProperty(constrainScope, "stagger", f2);
    }

    public final void setTransitionsByName$constraintlayout_compose(HashMap<String, Transition> map) {
        this.transitionsByName = map;
    }

    public final void transition(ConstraintSetRef constraintSetRef, ConstraintSetRef constraintSetRef2, String str, l<? super TransitionScope, ab> lVar) {
        if (str == null) {
            str = nextName();
        }
        HashMap<String, Transition> map = this.transitionsByName;
        TransitionScope transitionScope = new TransitionScope(constraintSetRef.getName$constraintlayout_compose(), constraintSetRef2.getName$constraintlayout_compose());
        lVar.invoke(transitionScope);
        map.put(str, new TransitionImpl(transitionScope.getObject$constraintlayout_compose()));
    }

    /* renamed from: customDistance-wH6b6FI, reason: not valid java name */
    public final void m11610customDistancewH6b6FI(ConstrainScope constrainScope, String str, float f2) {
        customFloat(constrainScope, str, f2);
    }

    public final void customInt(ConstrainScope constrainScope, String str, int i2) {
        customFloat(constrainScope, str, i2);
    }

    /* renamed from: customFontSize-kncR6DU, reason: not valid java name */
    public final void m11612customFontSizekncR6DU(ConstrainScope constrainScope, String str, long j2) {
        customFloat(constrainScope, str, TextUnit.m11362getValueimpl(j2));
    }

    public final void customFloat(KeyAttributeScope keyAttributeScope, String str, float f2) {
        keyAttributeScope.getCustomPropertiesValue$constraintlayout_compose().put(str, Float.valueOf(f2));
    }

    /* renamed from: customColor-mxwnekA, reason: not valid java name */
    public final void m11609customColormxwnekA(KeyAttributeScope keyAttributeScope, String str, long j2) {
        keyAttributeScope.getCustomPropertiesValue$constraintlayout_compose().put(str, m11607toJsonHexString8_81llA(j2));
    }
}
