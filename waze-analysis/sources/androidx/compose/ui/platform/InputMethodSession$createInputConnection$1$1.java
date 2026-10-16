package androidx.compose.ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.WeakReference;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class InputMethodSession$createInputConnection$1$1 extends y implements l<NullableInputConnectionWrapper, ab> {
    final /* synthetic */ InputMethodSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InputMethodSession$createInputConnection$1$1(InputMethodSession inputMethodSession) {
        super(1);
        this.this$0 = inputMethodSession;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NullableInputConnectionWrapper nullableInputConnectionWrapper) {
        nullableInputConnectionWrapper.disposeDelegate();
        MutableVector mutableVector = this.this$0.connections;
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (x.n((WeakReference) objArr[i2], nullableInputConnectionWrapper)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            this.this$0.connections.removeAt(i2);
        }
        if (this.this$0.connections.getSize() == 0) {
            this.this$0.onAllConnectionsClosed.invoke();
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(NullableInputConnectionWrapper nullableInputConnectionWrapper) {
        invoke2(nullableInputConnectionWrapper);
        return ab.f48028a;
    }
}
