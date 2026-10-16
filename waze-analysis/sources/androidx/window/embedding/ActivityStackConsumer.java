package androidx.window.embedding;

import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.reflection.Consumer2;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ActivityStackConsumer implements Consumer2<List<? extends androidx.window.extensions.embedding.ActivityStack>> {
    private final EmbeddingAdapter adapter;
    private final EmbeddingInterfaceCompat.EmbeddingCallbackInterface callback;

    public ActivityStackConsumer(EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface, EmbeddingAdapter embeddingAdapter) {
        x.f(embeddingCallbackInterface, "callback");
        x.f(embeddingAdapter, "adapter");
        this.callback = embeddingCallbackInterface;
        this.adapter = embeddingAdapter;
    }

    @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
    public void accept(List<? extends androidx.window.extensions.embedding.ActivityStack> list) {
        x.f(list, "value");
        this.callback.onActivityStackChanged(this.adapter.translate$window(list));
    }
}
