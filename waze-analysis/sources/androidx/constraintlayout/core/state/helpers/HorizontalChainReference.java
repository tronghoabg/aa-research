package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class HorizontalChainReference extends ChainReference {

    /* compiled from: WazeSource */
    /* renamed from: androidx.constraintlayout.core.state.helpers.HorizontalChainReference$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Chain;

        static {
            int[] iArr = new int[State.Chain.values().length];
            $SwitchMap$androidx$constraintlayout$core$state$State$Chain = iArr;
            try {
                iArr[State.Chain.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Chain[State.Chain.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Chain[State.Chain.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public HorizontalChainReference(State state) {
        super(state, State.Helper.HORIZONTAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        ArrayList<Object> arrayList = this.mReferences;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mHelperState.constraints(arrayList.get(i2)).clearHorizontal();
        }
        ArrayList<Object> arrayList2 = this.mReferences;
        int size2 = arrayList2.size();
        ConstraintReference constraintReference = null;
        int i3 = 0;
        ConstraintReference constraintReference2 = null;
        while (i3 < size2) {
            Object obj = arrayList2.get(i3);
            ConstraintReference constraintReferenceConstraints = this.mHelperState.constraints(obj);
            if (constraintReference2 == null) {
                Object obj2 = this.mStartToStart;
                if (obj2 != null) {
                    constraintReferenceConstraints.startToStart(obj2).margin(this.mMarginStart).marginGone(this.mMarginStartGone);
                } else {
                    Object obj3 = this.mStartToEnd;
                    if (obj3 != null) {
                        constraintReferenceConstraints.startToEnd(obj3).margin(this.mMarginStart).marginGone(this.mMarginStartGone);
                    } else {
                        Object obj4 = this.mLeftToLeft;
                        if (obj4 != null) {
                            constraintReferenceConstraints.startToStart(obj4).margin(this.mMarginLeft).marginGone(this.mMarginLeftGone);
                        } else {
                            Object obj5 = this.mLeftToRight;
                            if (obj5 != null) {
                                constraintReferenceConstraints.startToEnd(obj5).margin(this.mMarginLeft).marginGone(this.mMarginLeftGone);
                            } else {
                                String string = constraintReferenceConstraints.getKey().toString();
                                constraintReferenceConstraints.startToStart(State.PARENT).margin(Float.valueOf(getPreMargin(string))).marginGone(Float.valueOf(getPreGoneMargin(string)));
                            }
                        }
                    }
                }
                constraintReference2 = constraintReferenceConstraints;
            }
            if (constraintReference != null) {
                String string2 = constraintReference.getKey().toString();
                String string3 = constraintReferenceConstraints.getKey().toString();
                constraintReference.endToStart(constraintReferenceConstraints.getKey()).margin(Float.valueOf(getPostMargin(string2))).marginGone(Float.valueOf(getPostGoneMargin(string2)));
                constraintReferenceConstraints.startToEnd(constraintReference.getKey()).margin(Float.valueOf(getPreMargin(string3))).marginGone(Float.valueOf(getPreGoneMargin(string3)));
            }
            float weight = getWeight(obj.toString());
            if (weight != -1.0f) {
                constraintReferenceConstraints.setHorizontalChainWeight(weight);
            }
            i3++;
            constraintReference = constraintReferenceConstraints;
        }
        if (constraintReference != null) {
            Object obj6 = this.mEndToStart;
            if (obj6 != null) {
                constraintReference.endToStart(obj6).margin(this.mMarginEnd).marginGone(this.mMarginEndGone);
            } else {
                Object obj7 = this.mEndToEnd;
                if (obj7 != null) {
                    constraintReference.endToEnd(obj7).margin(this.mMarginEnd).marginGone(this.mMarginEndGone);
                } else {
                    Object obj8 = this.mRightToLeft;
                    if (obj8 != null) {
                        constraintReference.endToStart(obj8).margin(this.mMarginRight).marginGone(this.mMarginRightGone);
                    } else {
                        Object obj9 = this.mRightToRight;
                        if (obj9 != null) {
                            constraintReference.endToEnd(obj9).margin(this.mMarginRight).marginGone(this.mMarginRightGone);
                        } else {
                            String string4 = constraintReference.getKey().toString();
                            constraintReference.endToEnd(State.PARENT).margin(Float.valueOf(getPostMargin(string4))).marginGone(Float.valueOf(getPostGoneMargin(string4)));
                        }
                    }
                }
            }
        }
        if (constraintReference2 == null) {
            return;
        }
        float f2 = this.mBias;
        if (f2 != 0.5f) {
            constraintReference2.horizontalBias(f2);
        }
        State.Chain chain = State.Chain.SPREAD;
        int iOrdinal = this.mStyle.ordinal();
        if (iOrdinal == 0) {
            constraintReference2.setHorizontalChainStyle(0);
        } else if (iOrdinal == 1) {
            constraintReference2.setHorizontalChainStyle(1);
        } else {
            if (iOrdinal != 2) {
                return;
            }
            constraintReference2.setHorizontalChainStyle(2);
        }
    }
}
