package androidx.work.impl.constraints;

import androidx.work.impl.model.WorkSpec;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface OnConstraintsStateChangedListener {
    void onConstraintsStateChanged(WorkSpec workSpec, ConstraintsState constraintsState);
}
