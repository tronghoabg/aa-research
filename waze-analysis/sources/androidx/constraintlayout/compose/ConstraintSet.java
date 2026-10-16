package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.Measurable;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface ConstraintSet {

    /* compiled from: WazeSource */
    /* renamed from: androidx.constraintlayout.compose.ConstraintSet$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$applyTo(ConstraintSet constraintSet, androidx.constraintlayout.core.state.Transition transition, int i2) {
        }

        public static boolean $default$isDirty(ConstraintSet constraintSet, List list) {
            return true;
        }

        public static ConstraintSet $default$override(ConstraintSet constraintSet, String str, float f2) {
            return constraintSet;
        }

        public static /* synthetic */ void access$applyTo$jd(ConstraintSet constraintSet, androidx.constraintlayout.core.state.Transition transition, int i2) {
        }

        public static /* synthetic */ boolean access$isDirty$jd(ConstraintSet constraintSet, List list) {
            return true;
        }

        public static /* synthetic */ ConstraintSet access$override$jd(ConstraintSet constraintSet, String str, float f2) {
            return constraintSet;
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static void applyTo(ConstraintSet constraintSet, androidx.constraintlayout.core.state.Transition transition, int i2) {
        }

        @Deprecated
        public static boolean isDirty(ConstraintSet constraintSet, List<? extends Measurable> list) {
            return true;
        }

        @Deprecated
        public static ConstraintSet override(ConstraintSet constraintSet, String str, float f2) {
            return constraintSet;
        }
    }

    void applyTo(State state, List<? extends Measurable> list);

    void applyTo(androidx.constraintlayout.core.state.Transition transition, int i2);

    boolean isDirty(List<? extends Measurable> list);

    ConstraintSet override(String str, float f2);
}
