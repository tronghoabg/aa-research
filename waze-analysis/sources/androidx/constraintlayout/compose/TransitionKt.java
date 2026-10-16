package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TransitionKt {
    public static final Transition Transition(String str) {
        CLObject cLObject;
        try {
            cLObject = CLParser.parse(str);
        } catch (CLParsingException e2) {
            e2.toString();
            Log.e("CML", "Error parsing JSON ".concat(e2.toString()));
            cLObject = null;
        }
        return cLObject != null ? new TransitionImpl(cLObject) : TransitionImpl.Companion.getEMPTY$constraintlayout_compose();
    }
}
