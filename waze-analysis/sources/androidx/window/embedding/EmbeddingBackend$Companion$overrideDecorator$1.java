package androidx.window.embedding;

import h.g.a.l;
import h.g.b.u;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class EmbeddingBackend$Companion$overrideDecorator$1 extends u implements l<EmbeddingBackend, EmbeddingBackend> {
    EmbeddingBackend$Companion$overrideDecorator$1(Object obj) {
        super(1, obj, EmbeddingBackendDecorator.class, "decorate", "decorate(Landroidx/window/embedding/EmbeddingBackend;)Landroidx/window/embedding/EmbeddingBackend;", 0);
    }

    @Override // h.g.a.l
    public final EmbeddingBackend invoke(EmbeddingBackend embeddingBackend) {
        x.f(embeddingBackend, "p0");
        return ((EmbeddingBackendDecorator) this.receiver).decorate(embeddingBackend);
    }
}
