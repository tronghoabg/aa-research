package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.Measurable;
import androidx.constraintlayout.compose.DerivedConstraintSet;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.ConstraintSetParser;
import h.g.b.o;
import h.g.b.x;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class JSONConstraintSet extends EditableJSONLayout implements DerivedConstraintSet {
    public static final int $stable = 0;
    private boolean _isDirty;
    private final ConstraintSet extendFrom;
    private final String overrideVariables;
    private final HashMap<String, Float> overridedVariables;

    public JSONConstraintSet(String str, String str2, ConstraintSet constraintSet) {
        super(str);
        this.extendFrom = constraintSet;
        this.overridedVariables = new HashMap<>();
        this.overrideVariables = str2;
        this._isDirty = true;
        initialization();
    }

    private final void applyLayoutVariables(ConstraintSetParser.LayoutVariables layoutVariables) {
        String str = this.overrideVariables;
        if (str != null) {
            try {
                CLObject cLObject = CLParser.parse(str);
                int size = cLObject.size();
                for (int i2 = 0; i2 < size; i2++) {
                    CLElement cLElement = cLObject.get(i2);
                    x.d(cLElement, "null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey");
                    CLKey cLKey = (CLKey) cLElement;
                    layoutVariables.putOverride(cLKey.content(), cLKey.getValue().getFloat());
                }
            } catch (CLParsingException e2) {
                PrintStream printStream = System.err;
                e2.toString();
                printStream.println("exception: ".concat(e2.toString()));
            }
        }
        for (String str2 : this.overridedVariables.keySet()) {
            Float f2 = this.overridedVariables.get(str2);
            x.c(f2);
            layoutVariables.putOverride(str2, f2.floatValue());
        }
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(androidx.constraintlayout.core.state.Transition transition, int i2) {
        applyLayoutVariables(new ConstraintSetParser.LayoutVariables());
        ConstraintSetParser.parseJSON(getCurrentContent(), transition, i2);
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    public void applyToState(State state) {
        ConstraintSetParser.LayoutVariables layoutVariables = new ConstraintSetParser.LayoutVariables();
        applyLayoutVariables(layoutVariables);
        try {
            ConstraintSetParser.parseJSON(getCurrentContent(), state, layoutVariables);
            this._isDirty = false;
        } catch (Exception unused) {
            this._isDirty = true;
        }
    }

    public final void emitDesignElements(ArrayList<ConstraintSetParser.DesignElement> arrayList) {
        try {
            arrayList.clear();
            ConstraintSetParser.parseDesignElementsJSON(getCurrentContent(), arrayList);
        } catch (Exception unused) {
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof JSONConstraintSet) {
            return x.n(getCurrentContent(), ((JSONConstraintSet) obj).getCurrentContent());
        }
        return false;
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    public ConstraintSet getExtendFrom() {
        return this.extendFrom;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public float getForcedProgress() {
        return 0.0f;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public boolean isDirty(List<? extends Measurable> list) {
        return this._isDirty;
    }

    @Override // androidx.constraintlayout.compose.EditableJSONLayout
    protected void onNewContent(String str) {
        super.onNewContent(str);
        this._isDirty = true;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void onNewProgress(float f2) {
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public ConstraintSet override(String str, float f2) {
        this.overridedVariables.put(str, Float.valueOf(f2));
        return this;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void resetForcedProgress() {
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet, androidx.constraintlayout.compose.ConstraintSet
    public /* synthetic */ void applyTo(State state, List list) {
        DerivedConstraintSet.CC.$default$applyTo(this, state, list);
    }

    public /* synthetic */ JSONConstraintSet(String str, String str2, ConstraintSet constraintSet, int i2, o oVar) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : constraintSet);
    }
}
