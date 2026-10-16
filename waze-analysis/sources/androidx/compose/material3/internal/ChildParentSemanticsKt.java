package androidx.compose.material3.internal;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ChildParentSemanticsKt {
    public static final Modifier childSemantics(Modifier modifier, l<? super SemanticsPropertyReceiver, ab> lVar) {
        return modifier.then(new ChildSemanticsNodeElement(lVar));
    }

    public static /* synthetic */ Modifier childSemantics$default(Modifier modifier, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = new l() { // from class: androidx.compose.material3.internal.ChildParentSemanticsKt$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return ab.f48028a;
                }
            };
        }
        return childSemantics(modifier, lVar);
    }

    public static final Modifier parentSemantics(Modifier modifier, l<? super SemanticsPropertyReceiver, ab> lVar) {
        return modifier.then(new ParentSemanticsNodeElement(lVar));
    }
}
