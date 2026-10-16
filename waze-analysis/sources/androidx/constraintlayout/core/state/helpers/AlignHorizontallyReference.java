package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class AlignHorizontallyReference extends HelperReference {
    private float mBias;

    public AlignHorizontallyReference(State state) {
        super(state, State.Helper.ALIGN_VERTICALLY);
        this.mBias = 0.5f;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        ArrayList<Object> arrayList = this.mReferences;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintReference constraintReferenceConstraints = this.mHelperState.constraints(arrayList.get(i2));
            constraintReferenceConstraints.clearHorizontal();
            Object obj = this.mStartToStart;
            if (obj != null) {
                constraintReferenceConstraints.startToStart(obj);
            } else {
                Object obj2 = this.mStartToEnd;
                if (obj2 != null) {
                    constraintReferenceConstraints.startToEnd(obj2);
                } else {
                    constraintReferenceConstraints.startToStart(State.PARENT);
                }
            }
            Object obj3 = this.mEndToStart;
            if (obj3 != null) {
                constraintReferenceConstraints.endToStart(obj3);
            } else {
                Object obj4 = this.mEndToEnd;
                if (obj4 != null) {
                    constraintReferenceConstraints.endToEnd(obj4);
                } else {
                    constraintReferenceConstraints.endToEnd(State.PARENT);
                }
            }
            float f2 = this.mBias;
            if (f2 != 0.5f) {
                constraintReferenceConstraints.horizontalBias(f2);
            }
        }
    }
}
