package androidx.window.embedding;

import androidx.window.reflection.Consumer2;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class OverlayControllerActivityStackConsumer implements Consumer2<List<? extends androidx.window.extensions.embedding.ActivityStack>> {
    private final l<List<? extends androidx.window.extensions.embedding.ActivityStack>, ab> block;

    /* JADX WARN: Multi-variable type inference failed */
    public OverlayControllerActivityStackConsumer(l<? super List<? extends androidx.window.extensions.embedding.ActivityStack>, ab> lVar) {
        x.f(lVar, "block");
        this.block = lVar;
    }

    @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
    public void accept(List<? extends androidx.window.extensions.embedding.ActivityStack> list) {
        x.f(list, "value");
        this.block.invoke(list);
    }
}
