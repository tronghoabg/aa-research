package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SelectionManager$contextMenuAreaModifier$2 extends g implements l<e<? super ab>, Object> {
    int label;
    final /* synthetic */ SelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionManager$contextMenuAreaModifier$2(SelectionManager selectionManager, e<? super SelectionManager$contextMenuAreaModifier$2> eVar) {
        super(1, eVar);
        this.this$0 = selectionManager;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(e<?> eVar) {
        return new SelectionManager$contextMenuAreaModifier$2(this.this$0, eVar);
    }

    @Override // h.g.a.l
    public final Object invoke(e<? super ab> eVar) {
        return ((SelectionManager$contextMenuAreaModifier$2) create(eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            k<AnnotatedString, TextRange> contextTextAndSelection$foundation = this.this$0.getContextTextAndSelection$foundation();
            if (contextTextAndSelection$foundation != null) {
                SelectionManager selectionManager = this.this$0;
                AnnotatedString annotatedString = (AnnotatedString) contextTextAndSelection$foundation.a();
                long jM10550unboximpl = ((TextRange) contextTextAndSelection$foundation.b()).m10550unboximpl();
                PlatformSelectionBehaviors platformSelectionBehaviors$foundation = selectionManager.getPlatformSelectionBehaviors$foundation();
                if (platformSelectionBehaviors$foundation != null) {
                    this.label = 1;
                    if (platformSelectionBehaviors$foundation.mo3852onShowSelectionToolbarSbBc2M(annotatedString, jM10550unboximpl, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        return ab.f48028a;
    }
}
