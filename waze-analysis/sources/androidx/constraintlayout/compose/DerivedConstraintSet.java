package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.Measurable;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface DerivedConstraintSet extends ConstraintSet {
    @Override // androidx.constraintlayout.compose.ConstraintSet
    void applyTo(State state, List<? extends Measurable> list);

    void applyToState(State state);

    ConstraintSet getExtendFrom();

    /* compiled from: WazeSource */
    /* renamed from: androidx.constraintlayout.compose.DerivedConstraintSet$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$applyTo(DerivedConstraintSet derivedConstraintSet, State state, List list) {
            ConstraintSet extendFrom = derivedConstraintSet.getExtendFrom();
            if (extendFrom != null) {
                extendFrom.applyTo(state, (List<? extends Measurable>) list);
            }
            derivedConstraintSet.applyToState(state);
        }

        public static /* synthetic */ boolean access$isDirty$jd(DerivedConstraintSet derivedConstraintSet, List list) {
            return true;
        }

        public static /* synthetic */ ConstraintSet access$override$jd(DerivedConstraintSet derivedConstraintSet, String str, float f2) {
            return derivedConstraintSet;
        }

        public static /* synthetic */ void access$applyTo$jd(DerivedConstraintSet derivedConstraintSet, androidx.constraintlayout.core.state.Transition transition, int i2) {
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static void applyTo(DerivedConstraintSet derivedConstraintSet, State state, List<? extends Measurable> list) {
            CC.$default$applyTo(derivedConstraintSet, state, list);
        }

        @Deprecated
        public static boolean isDirty(DerivedConstraintSet derivedConstraintSet, List<? extends Measurable> list) {
            return true;
        }

        @Deprecated
        public static ConstraintSet override(DerivedConstraintSet derivedConstraintSet, String str, float f2) {
            return derivedConstraintSet;
        }

        @Deprecated
        public static void applyTo(DerivedConstraintSet derivedConstraintSet, androidx.constraintlayout.core.state.Transition transition, int i2) {
        }
    }
}
