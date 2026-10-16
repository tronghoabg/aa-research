package androidx.constraintlayout.compose;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TransitionScopeKt {
    public static final Transition Transition(String str, String str2, l<? super TransitionScope, ab> lVar) {
        TransitionScope transitionScope = new TransitionScope(str, str2);
        lVar.invoke(transitionScope);
        return new TransitionImpl(transitionScope.getObject$constraintlayout_compose());
    }

    public static /* synthetic */ Transition Transition$default(String str, String str2, l lVar, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            str = TtmlNode.START;
        }
        if ((i2 & 2) != 0) {
            str2 = TtmlNode.END;
        }
        return Transition(str, str2, lVar);
    }
}
