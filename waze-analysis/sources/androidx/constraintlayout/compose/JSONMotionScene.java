package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.ConstraintSetParser;
import h.a.i;
import h.g.b.x;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class JSONMotionScene extends EditableJSONLayout implements MotionScene {
    public static final int $stable = 0;
    private final HashMap<String, String> constraintSetsContent;
    private float forcedProgress;
    private final HashMap<String, String> transitionsContent;

    public JSONMotionScene(String str) {
        super(str);
        this.constraintSetsContent = new HashMap<>();
        this.transitionsContent = new HashMap<>();
        this.forcedProgress = Float.NaN;
        initialization();
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public String getConstraintSet(int i2) {
        Object objS;
        Collection<String> collectionValues = this.constraintSetsContent.values();
        x.f(collectionValues, "<this>");
        if (collectionValues instanceof List) {
            objS = i.S((List) collectionValues, i2);
        } else if (i2 < 0) {
            objS = null;
        } else {
            int i3 = 0;
            for (Object obj : collectionValues) {
                int i4 = i3 + 1;
                if (i2 == i3) {
                    objS = obj;
                    break;
                }
                i3 = i4;
            }
            objS = null;
        }
        return (String) objS;
    }

    @Override // androidx.constraintlayout.compose.MotionScene
    public ConstraintSet getConstraintSetInstance(String str) {
        String constraintSet = getConstraintSet(str);
        if (constraintSet != null) {
            return ConstraintLayoutKt.ConstraintSet(constraintSet);
        }
        return null;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public float getForcedProgress() {
        return this.forcedProgress;
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public String getTransition(String str) {
        return this.transitionsContent.get(str);
    }

    @Override // androidx.constraintlayout.compose.MotionScene
    public Transition getTransitionInstance(String str) {
        CLObject cLObject;
        String transition = getTransition(str);
        if (transition == null) {
            return null;
        }
        try {
            cLObject = CLParser.parse(transition);
        } catch (CLParsingException e2) {
            e2.toString();
            Log.e("CML", "Error parsing JSON ".concat(e2.toString()));
            cLObject = null;
        }
        if (cLObject == null) {
            return null;
        }
        return new TransitionImpl(cLObject);
    }

    @Override // androidx.constraintlayout.compose.EditableJSONLayout
    protected void onNewContent(String str) {
        super.onNewContent(str);
        try {
            ConstraintSetParser.parseMotionSceneJSON(this, str);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void onNewProgress(float f2) {
        this.forcedProgress = f2;
        signalUpdate();
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void resetForcedProgress() {
        this.forcedProgress = Float.NaN;
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public void setConstraintSetContent(String str, String str2) {
        this.constraintSetsContent.put(str, str2);
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public void setTransitionContent(String str, String str2) {
        this.transitionsContent.put(str, str2);
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public String getConstraintSet(String str) {
        return this.constraintSetsContent.get(str);
    }
}
