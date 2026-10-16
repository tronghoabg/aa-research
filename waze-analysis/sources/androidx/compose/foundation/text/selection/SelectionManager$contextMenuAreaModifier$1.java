package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SelectionManager$contextMenuAreaModifier$1 extends g implements p<Offset, e<? super ab>, Object> {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ SelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionManager$contextMenuAreaModifier$1(SelectionManager selectionManager, e<? super SelectionManager$contextMenuAreaModifier$1> eVar) {
        super(2, eVar);
        this.this$0 = selectionManager;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        SelectionManager$contextMenuAreaModifier$1 selectionManager$contextMenuAreaModifier$1 = new SelectionManager$contextMenuAreaModifier$1(this.this$0, eVar);
        selectionManager$contextMenuAreaModifier$1.J$0 = ((Offset) obj).m7990unboximpl();
        return selectionManager$contextMenuAreaModifier$1;
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(Offset offset, e<? super ab> eVar) {
        return m3895invoke3MmeM6k(offset.m7990unboximpl(), eVar);
    }

    /* renamed from: invoke-3MmeM6k, reason: not valid java name */
    public final Object m3895invoke3MmeM6k(long j2, e<? super ab> eVar) {
        return ((SelectionManager$contextMenuAreaModifier$1) create(Offset.m7969boximpl(j2), eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            long j2 = this.J$0;
            k<AnnotatedString, TextRange> contextTextAndSelection$foundation = this.this$0.getContextTextAndSelection$foundation();
            if (contextTextAndSelection$foundation != null) {
                SelectionManager selectionManager = this.this$0;
                AnnotatedString annotatedString = (AnnotatedString) contextTextAndSelection$foundation.a();
                long jM10550unboximpl = ((TextRange) contextTextAndSelection$foundation.b()).m10550unboximpl();
                PlatformSelectionBehaviors platformSelectionBehaviors$foundation = selectionManager.getPlatformSelectionBehaviors$foundation();
                if (platformSelectionBehaviors$foundation != null) {
                    Offset offsetM7969boximpl = Offset.m7969boximpl(j2);
                    this.label = 1;
                    if (platformSelectionBehaviors$foundation.mo3851onShowContextMenu_2OEclM(annotatedString, jM10550unboximpl, offsetM7969boximpl, this) == aVar) {
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
