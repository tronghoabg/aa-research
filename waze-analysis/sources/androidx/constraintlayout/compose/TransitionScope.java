package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLObject;
import h.ab;
import h.g.a.l;
import java.util.Arrays;

/* compiled from: WazeSource */
@LayoutScopeMarker
/* loaded from: classes3.dex */
public final class TransitionScope {
    public static final int $stable = 8;
    private final String from;
    private float maxStaggerDelay;
    private OnSwipe onSwipe;
    private final String to;
    private final CLObject containerObject = new CLObject(new char[0]);
    private final CLObject keyFramesObject = new CLObject(new char[0]);
    private final CLArray keyAttributesArray = new CLArray(new char[0]);
    private final CLArray keyPositionsArray = new CLArray(new char[0]);
    private final CLArray keyCyclesArray = new CLArray(new char[0]);
    private final CLObject onSwipeObject = new CLObject(new char[0]);
    private Arc motionArc = Arc.Companion.getNone();

    public TransitionScope(String str, String str2) {
        this.from = str;
        this.to = str2;
    }

    private final void addKeyAttributesIfMissing() {
        this.containerObject.put("KeyFrames", this.keyFramesObject);
        this.keyFramesObject.put("KeyAttributes", this.keyAttributesArray);
    }

    private final void addKeyCyclesIfMissing() {
        this.containerObject.put("KeyFrames", this.keyFramesObject);
        this.keyFramesObject.put("KeyCycles", this.keyCyclesArray);
    }

    private final void addKeyPositionsIfMissing() {
        this.containerObject.put("KeyFrames", this.keyFramesObject);
        this.keyFramesObject.put("KeyPositions", this.keyPositionsArray);
    }

    public final ConstrainedLayoutReference createRefFor(Object obj) {
        return new ConstrainedLayoutReference(obj);
    }

    public final float getMaxStaggerDelay() {
        return this.maxStaggerDelay;
    }

    public final Arc getMotionArc() {
        return this.motionArc;
    }

    public final CLObject getObject$constraintlayout_compose() {
        Object id$constraintlayout_compose;
        Object id$constraintlayout_compose2;
        this.containerObject.putString(TypedValues.TransitionType.S_PATH_MOTION_ARC, this.motionArc.getName());
        this.containerObject.putString(TypedValues.TransitionType.S_FROM, this.from);
        this.containerObject.putString(TypedValues.TransitionType.S_TO, this.to);
        this.containerObject.putNumber(TypedValues.TransitionType.S_STAGGERED, this.maxStaggerDelay);
        OnSwipe onSwipe = this.onSwipe;
        if (onSwipe != null) {
            this.containerObject.put("onSwipe", this.onSwipeObject);
            this.onSwipeObject.putString("direction", onSwipe.getDirection().getName());
            this.onSwipeObject.putNumber("scale", onSwipe.getDragScale());
            ConstrainedLayoutReference dragAround = onSwipe.getDragAround();
            if (dragAround != null && (id$constraintlayout_compose2 = dragAround.getId$constraintlayout_compose()) != null) {
                this.onSwipeObject.putString("around", id$constraintlayout_compose2.toString());
            }
            ConstrainedLayoutReference limitBoundsTo = onSwipe.getLimitBoundsTo();
            if (limitBoundsTo != null && (id$constraintlayout_compose = limitBoundsTo.getId$constraintlayout_compose()) != null) {
                this.onSwipeObject.putString("limitBounds", id$constraintlayout_compose.toString());
            }
            this.onSwipeObject.putNumber("threshold", onSwipe.getDragThreshold());
            this.onSwipeObject.putString("anchor", onSwipe.getAnchor().getId$constraintlayout_compose().toString());
            this.onSwipeObject.putString("side", onSwipe.getSide().getName());
            this.onSwipeObject.putString("touchUp", onSwipe.getOnTouchUp().getName());
            this.onSwipeObject.putString("mode", onSwipe.getMode().getName());
            this.onSwipeObject.putNumber("maxVelocity", onSwipe.getMode().getMaxVelocity$constraintlayout_compose());
            this.onSwipeObject.putNumber("maxAccel", onSwipe.getMode().getMaxAcceleration$constraintlayout_compose());
            this.onSwipeObject.putNumber("springMass", onSwipe.getMode().getSpringMass$constraintlayout_compose());
            this.onSwipeObject.putNumber("springStiffness", onSwipe.getMode().getSpringStiffness$constraintlayout_compose());
            this.onSwipeObject.putNumber("springDamping", onSwipe.getMode().getSpringDamping$constraintlayout_compose());
            this.onSwipeObject.putNumber("stopThreshold", onSwipe.getMode().getSpringThreshold$constraintlayout_compose());
            this.onSwipeObject.putString("springBoundary", onSwipe.getMode().getSpringBoundary$constraintlayout_compose().getName());
        }
        return this.containerObject;
    }

    public final OnSwipe getOnSwipe() {
        return this.onSwipe;
    }

    public final void keyAttributes(ConstrainedLayoutReference[] constrainedLayoutReferenceArr, l<? super KeyAttributesScope, ab> lVar) {
        KeyAttributesScope keyAttributesScope = new KeyAttributesScope((ConstrainedLayoutReference[]) Arrays.copyOf(constrainedLayoutReferenceArr, constrainedLayoutReferenceArr.length));
        lVar.invoke(keyAttributesScope);
        addKeyAttributesIfMissing();
        this.keyAttributesArray.add(keyAttributesScope.getKeyFramePropsObject$constraintlayout_compose());
    }

    public final void keyCycles(ConstrainedLayoutReference[] constrainedLayoutReferenceArr, l<? super KeyCyclesScope, ab> lVar) {
        KeyCyclesScope keyCyclesScope = new KeyCyclesScope((ConstrainedLayoutReference[]) Arrays.copyOf(constrainedLayoutReferenceArr, constrainedLayoutReferenceArr.length));
        lVar.invoke(keyCyclesScope);
        addKeyCyclesIfMissing();
        this.keyCyclesArray.add(keyCyclesScope.getKeyFramePropsObject$constraintlayout_compose());
    }

    public final void keyPositions(ConstrainedLayoutReference[] constrainedLayoutReferenceArr, l<? super KeyPositionsScope, ab> lVar) {
        KeyPositionsScope keyPositionsScope = new KeyPositionsScope((ConstrainedLayoutReference[]) Arrays.copyOf(constrainedLayoutReferenceArr, constrainedLayoutReferenceArr.length));
        lVar.invoke(keyPositionsScope);
        addKeyPositionsIfMissing();
        this.keyPositionsArray.add(keyPositionsScope.getKeyFramePropsObject$constraintlayout_compose());
    }

    public final void reset$constraintlayout_compose() {
        this.containerObject.clear();
        this.keyFramesObject.clear();
        this.keyAttributesArray.clear();
        this.onSwipeObject.clear();
    }

    public final void setMaxStaggerDelay(float f2) {
        this.maxStaggerDelay = f2;
    }

    public final void setMotionArc(Arc arc) {
        this.motionArc = arc;
    }

    public final void setOnSwipe(OnSwipe onSwipe) {
        this.onSwipe = onSwipe;
    }
}
