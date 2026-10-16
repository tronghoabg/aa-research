package androidx.compose.ui.focus;

import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class FocusRestorerKt$saveFocusedChild$1$1 extends y implements a<Object> {
    final /* synthetic */ int $previouslyFocusedChildHash;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FocusRestorerKt$saveFocusedChild$1$1(int i2) {
        super(0);
        this.$previouslyFocusedChildHash = i2;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        return Integer.valueOf(this.$previouslyFocusedChildHash);
    }
}
