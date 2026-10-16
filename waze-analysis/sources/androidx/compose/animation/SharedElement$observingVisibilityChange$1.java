package androidx.compose.animation;

import h.ab;
import h.g.a.a;
import h.g.b.y;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SharedElement$observingVisibilityChange$1 extends y implements a<ab> {
    final /* synthetic */ SharedElement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedElement$observingVisibilityChange$1(SharedElement sharedElement) {
        super(0);
        this.this$0 = sharedElement;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        List<SharedElementEntry> allEntries = this.this$0.getAllEntries();
        int size = allEntries.size();
        for (int i2 = 0; i2 < size; i2++) {
            SharedElementEntry sharedElementEntry = allEntries.get(i2);
            if (sharedElementEntry.getTarget() && sharedElementEntry.isEnabled()) {
                return;
            }
        }
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
