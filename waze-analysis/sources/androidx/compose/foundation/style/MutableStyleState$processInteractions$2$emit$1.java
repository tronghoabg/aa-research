package androidx.compose.foundation.style;

import androidx.compose.foundation.interaction.Interaction;
import h.ab;
import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MutableStyleState$processInteractions$2$emit$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MutableStyleState$processInteractions$2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MutableStyleState$processInteractions$2$emit$1(MutableStyleState$processInteractions$2<? super T> mutableStyleState$processInteractions$2, e<? super MutableStyleState$processInteractions$2$emit$1> eVar) {
        super(eVar);
        this.this$0 = mutableStyleState$processInteractions$2;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Interaction) null, (e<? super ab>) this);
    }
}
