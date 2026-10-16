package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.HelperWidget;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class BarrierReference extends HelperReference {
    private Barrier mBarrierWidget;
    private State.Direction mDirection;
    private int mMargin;

    /* compiled from: WazeSource */
    /* renamed from: androidx.constraintlayout.core.state.helpers.BarrierReference$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Direction;

        static {
            int[] iArr = new int[State.Direction.values().length];
            $SwitchMap$androidx$constraintlayout$core$state$State$Direction = iArr;
            try {
                iArr[State.Direction.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Direction[State.Direction.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Direction[State.Direction.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Direction[State.Direction.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Direction[State.Direction.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Direction[State.Direction.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public BarrierReference(State state) {
        super(state, State.Helper.BARRIER);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0022  */
    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void apply() {
        /*
            r5 = this;
            r5.getHelperWidget()
            androidx.constraintlayout.core.state.State$Direction r0 = androidx.constraintlayout.core.state.State.Direction.LEFT
            androidx.constraintlayout.core.state.State$Direction r0 = r5.mDirection
            int r0 = r0.ordinal()
            r1 = 0
            if (r0 == 0) goto L23
            r2 = 1
            if (r0 == r2) goto L22
            r3 = 2
            if (r0 == r3) goto L23
            r4 = 3
            if (r0 == r4) goto L22
            r2 = 4
            if (r0 == r2) goto L20
            r2 = 5
            if (r0 == r2) goto L1e
            goto L23
        L1e:
            r1 = r4
            goto L23
        L20:
            r1 = r3
            goto L23
        L22:
            r1 = r2
        L23:
            androidx.constraintlayout.core.widgets.Barrier r0 = r5.mBarrierWidget
            r0.setBarrierType(r1)
            androidx.constraintlayout.core.widgets.Barrier r0 = r5.mBarrierWidget
            int r5 = r5.mMargin
            r0.setMargin(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.helpers.BarrierReference.apply():void");
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public HelperWidget getHelperWidget() {
        Barrier barrier = this.mBarrierWidget;
        if (barrier != null) {
            return barrier;
        }
        Barrier barrier2 = new Barrier();
        this.mBarrierWidget = barrier2;
        return barrier2;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public ConstraintReference margin(Object obj) {
        margin(this.mHelperState.convertDimension(obj));
        return this;
    }

    public void setBarrierDirection(State.Direction direction) {
        this.mDirection = direction;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public ConstraintReference margin(int i2) {
        this.mMargin = i2;
        return this;
    }
}
