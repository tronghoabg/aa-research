package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.constraintlayout.core.parser.CLObject;
import java.util.Arrays;

/* compiled from: WazeSource */
@LayoutScopeMarker
/* loaded from: classes3.dex */
public final class ConstraintSetScope extends ConstraintLayoutBaseScope {
    public static final int $stable = 8;
    private int generatedCount;

    /* compiled from: WazeSource */
    public final class ConstrainedLayoutReferences {
        private final Object[] ids;

        public ConstrainedLayoutReferences(Object[] objArr) {
            this.ids = objArr;
        }

        public final ConstrainedLayoutReference component1() {
            Object[] objArr = this.ids;
            return new ConstrainedLayoutReference(objArr.length > 0 ? objArr[0] : ConstraintSetScope.this.nextId());
        }

        public final ConstrainedLayoutReference component10() {
            Object[] objArr = this.ids;
            return ConstraintSetScope.this.createRefFor(objArr.length > 9 ? objArr[9] : ConstraintSetScope.this.nextId());
        }

        public final ConstrainedLayoutReference component11() {
            Object[] objArr = this.ids;
            return ConstraintSetScope.this.createRefFor(objArr.length > 10 ? objArr[10] : ConstraintSetScope.this.nextId());
        }

        public final ConstrainedLayoutReference component12() {
            Object[] objArr = this.ids;
            return ConstraintSetScope.this.createRefFor(objArr.length > 11 ? objArr[11] : ConstraintSetScope.this.nextId());
        }

        public final ConstrainedLayoutReference component13() {
            Object[] objArr = this.ids;
            return ConstraintSetScope.this.createRefFor(objArr.length > 12 ? objArr[12] : ConstraintSetScope.this.nextId());
        }

        public final ConstrainedLayoutReference component14() {
            Object[] objArr = this.ids;
            return ConstraintSetScope.this.createRefFor(objArr.length > 13 ? objArr[13] : ConstraintSetScope.this.nextId());
        }

        public final ConstrainedLayoutReference component15() {
            Object[] objArr = this.ids;
            return ConstraintSetScope.this.createRefFor(objArr.length > 14 ? objArr[14] : ConstraintSetScope.this.nextId());
        }

        public final ConstrainedLayoutReference component16() {
            Object[] objArr = this.ids;
            return ConstraintSetScope.this.createRefFor(objArr.length > 15 ? objArr[15] : ConstraintSetScope.this.nextId());
        }

        public final ConstrainedLayoutReference component2() {
            Object[] objArr = this.ids;
            return ConstraintSetScope.this.createRefFor(objArr.length > 1 ? objArr[1] : ConstraintSetScope.this.nextId());
        }

        public final ConstrainedLayoutReference component3() {
            Object[] objArr = this.ids;
            return ConstraintSetScope.this.createRefFor(objArr.length > 2 ? objArr[2] : ConstraintSetScope.this.nextId());
        }

        public final ConstrainedLayoutReference component4() {
            Object[] objArr = this.ids;
            return ConstraintSetScope.this.createRefFor(objArr.length > 3 ? objArr[3] : ConstraintSetScope.this.nextId());
        }

        public final ConstrainedLayoutReference component5() {
            Object[] objArr = this.ids;
            return ConstraintSetScope.this.createRefFor(objArr.length > 4 ? objArr[4] : ConstraintSetScope.this.nextId());
        }

        public final ConstrainedLayoutReference component6() {
            Object[] objArr = this.ids;
            return ConstraintSetScope.this.createRefFor(objArr.length > 5 ? objArr[5] : ConstraintSetScope.this.nextId());
        }

        public final ConstrainedLayoutReference component7() {
            Object[] objArr = this.ids;
            return ConstraintSetScope.this.createRefFor(objArr.length > 6 ? objArr[6] : ConstraintSetScope.this.nextId());
        }

        public final ConstrainedLayoutReference component8() {
            Object[] objArr = this.ids;
            return ConstraintSetScope.this.createRefFor(objArr.length > 7 ? objArr[7] : ConstraintSetScope.this.nextId());
        }

        public final ConstrainedLayoutReference component9() {
            Object[] objArr = this.ids;
            return ConstraintSetScope.this.createRefFor(objArr.length > 8 ? objArr[8] : ConstraintSetScope.this.nextId());
        }
    }

    public ConstraintSetScope(CLObject cLObject) {
        super(cLObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String nextId() {
        StringBuilder sb = new StringBuilder("androidx.constraintlayout.id");
        int i2 = this.generatedCount;
        this.generatedCount = i2 + 1;
        sb.append(i2);
        return sb.toString();
    }

    public final ConstrainedLayoutReference createRefFor(Object obj) {
        return new ConstrainedLayoutReference(obj);
    }

    public final ConstrainedLayoutReferences createRefsFor(Object... objArr) {
        return new ConstrainedLayoutReferences(Arrays.copyOf(objArr, objArr.length));
    }
}
