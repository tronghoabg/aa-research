package androidx.compose.foundation.text.selection;

import android.support.v4.app.j$$ExternalSyntheticApiModelOutline1;
import android.view.textclassifier.TextClassifier;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2 extends g implements p<TextClassifier, e<? super ab>, Object> {
    final /* synthetic */ long $selection;
    final /* synthetic */ CharSequence $text;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PlatformSelectionBehaviorsImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, CharSequence charSequence, long j2, e<? super PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2> eVar) {
        super(2, eVar);
        this.this$0 = platformSelectionBehaviorsImpl;
        this.$text = charSequence;
        this.$selection = j2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2 platformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2 = new PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2(this.this$0, this.$text, this.$selection, eVar);
        platformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2.L$0 = obj;
        return platformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(TextClassifier textClassifier, e<? super ab> eVar) {
        return ((PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2) create(textClassifier, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            TextClassifier textClassifierM66m = j$$ExternalSyntheticApiModelOutline1.m66m(this.L$0);
            this.label = 1;
            if (this.this$0.m3857classifyTextM8tDOmk(this.$text, this.$selection, textClassifierM66m, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        return ab.f48028a;
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(TextClassifier textClassifier, e<? super ab> eVar) {
        return invoke2(j$$ExternalSyntheticApiModelOutline1.m66m((Object) textClassifier), eVar);
    }
}
