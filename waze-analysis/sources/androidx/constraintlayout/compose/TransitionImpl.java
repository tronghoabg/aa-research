package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.TransitionParser;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TransitionImpl implements Transition {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final TransitionImpl EMPTY = new TransitionImpl(new CLObject(new char[0]));
    private final CLObject parsedTransition;

    public TransitionImpl(CLObject cLObject) {
        this.parsedTransition = cLObject;
    }

    public final void applyAllTo(androidx.constraintlayout.core.state.Transition transition) {
        try {
            TransitionParser.parse(this.parsedTransition, transition);
        } catch (CLParsingException e2) {
            e2.toString();
            Log.e("CML", "Error parsing JSON ".concat(e2.toString()));
        }
    }

    public final void applyKeyFramesTo(androidx.constraintlayout.core.state.Transition transition) {
        try {
            TransitionParser.parseKeyFrames(this.parsedTransition, transition);
        } catch (CLParsingException e2) {
            e2.toString();
            Log.e("CML", "Error parsing JSON ".concat(e2.toString()));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x.n(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        x.d(obj, "null cannot be cast to non-null type androidx.constraintlayout.compose.TransitionImpl");
        return x.n(this.parsedTransition, ((TransitionImpl) obj).parsedTransition);
    }

    @Override // androidx.constraintlayout.compose.Transition
    public String getEndConstraintSetId() {
        String stringOrNull = this.parsedTransition.getStringOrNull(TypedValues.TransitionType.S_TO);
        return stringOrNull == null ? TtmlNode.END : stringOrNull;
    }

    @Override // androidx.constraintlayout.compose.Transition
    public String getStartConstraintSetId() {
        String stringOrNull = this.parsedTransition.getStringOrNull(TypedValues.TransitionType.S_FROM);
        return stringOrNull == null ? TtmlNode.START : stringOrNull;
    }

    public int hashCode() {
        return this.parsedTransition.hashCode();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final TransitionImpl getEMPTY$constraintlayout_compose() {
            return TransitionImpl.EMPTY;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
