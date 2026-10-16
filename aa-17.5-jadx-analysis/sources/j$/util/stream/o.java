package j$.util.stream;

import java.util.function.Consumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class o extends a2 {
    public final Consumer i;

    public o(Consumer consumer) {
        super((byte) 1);
        this.i = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.i.accept(obj);
    }
}
