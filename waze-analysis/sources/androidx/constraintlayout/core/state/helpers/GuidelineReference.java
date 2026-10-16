package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.Reference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class GuidelineReference implements Facade, Reference {
    private Guideline mGuidelineWidget;
    private Object mKey;
    private int mOrientation;
    final State mState;
    private int mStart = -1;
    private int mEnd = -1;
    private float mPercent = 0.0f;

    public GuidelineReference(State state) {
        this.mState = state;
    }

    @Override // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public void apply() {
        this.mGuidelineWidget.setOrientation(this.mOrientation);
        int i2 = this.mStart;
        if (i2 != -1) {
            this.mGuidelineWidget.setGuideBegin(i2);
            return;
        }
        int i3 = this.mEnd;
        Guideline guideline = this.mGuidelineWidget;
        if (i3 != -1) {
            guideline.setGuideEnd(i3);
        } else {
            guideline.setGuidePercent(this.mPercent);
        }
    }

    public GuidelineReference end(Object obj) {
        this.mStart = -1;
        this.mEnd = this.mState.convertDimension(obj);
        this.mPercent = 0.0f;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public ConstraintWidget getConstraintWidget() {
        Guideline guideline = this.mGuidelineWidget;
        if (guideline != null) {
            return guideline;
        }
        Guideline guideline2 = new Guideline();
        this.mGuidelineWidget = guideline2;
        return guideline2;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Facade getFacade() {
        return null;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Object getKey() {
        return this.mKey;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public GuidelineReference percent(float f2) {
        this.mStart = -1;
        this.mEnd = -1;
        this.mPercent = f2;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setConstraintWidget(ConstraintWidget constraintWidget) {
        this.mGuidelineWidget = constraintWidget instanceof Guideline ? (Guideline) constraintWidget : null;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setKey(Object obj) {
        this.mKey = obj;
    }

    public void setOrientation(int i2) {
        this.mOrientation = i2;
    }

    public GuidelineReference start(Object obj) {
        this.mStart = this.mState.convertDimension(obj);
        this.mEnd = -1;
        this.mPercent = 0.0f;
        return this;
    }
}
