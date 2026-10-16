package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.LongConsumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b4 implements y2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LongConsumer b;

    public /* synthetic */ b4(LongConsumer longConsumer, byte b) {
        this.a = b;
        this.b = longConsumer;
    }

    @Override // j$.util.stream.y2
    public final /* synthetic */ void B(Long l) {
        switch (this.a) {
            case 0:
                a2.g(this, l);
                break;
            default:
                a2.g(this, l);
                break;
        }
    }

    @Override // j$.util.stream.y2, j$.util.stream.z2
    public final void accept(long j) {
        byte b = this.a;
        LongConsumer longConsumer = this.b;
        switch (b) {
            case 0:
                longConsumer.accept(j);
                break;
            default:
                ((p3) longConsumer).accept(j);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.z2
    public final void end() {
        byte b = this.a;
    }

    @Override // j$.util.stream.z2
    public final void p(long j) {
        byte b = this.a;
    }

    @Override // j$.util.stream.z2
    public final boolean s() {
        switch (this.a) {
        }
        return false;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.a) {
        }
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // j$.util.stream.z2
    public final /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 0:
                a2.d();
                throw null;
            default:
                a2.d();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.a) {
            case 0:
                B((Long) obj);
                break;
            default:
                B((Long) obj);
                break;
        }
    }

    private final void a(long j) {
    }

    private final void b(long j) {
    }

    private final void c() {
    }

    private final void d() {
    }
}
