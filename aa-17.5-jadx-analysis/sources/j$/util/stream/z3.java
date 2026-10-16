package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements x2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ IntConsumer b;

    public /* synthetic */ z3(IntConsumer intConsumer, byte b) {
        this.a = b;
        this.b = intConsumer;
    }

    @Override // j$.util.stream.x2, j$.util.stream.z2
    public final void accept(int i) {
        byte b = this.a;
        IntConsumer intConsumer = this.b;
        switch (b) {
            case 0:
                intConsumer.accept(i);
                break;
            default:
                ((n3) intConsumer).accept(i);
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

    @Override // j$.util.stream.x2
    public final /* synthetic */ void r(Integer num) {
        switch (this.a) {
            case 0:
                a2.e(this, num);
                break;
            default:
                a2.e(this, num);
                break;
        }
    }

    @Override // j$.util.stream.z2
    public final boolean s() {
        switch (this.a) {
        }
        return false;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
        }
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.z2
    public final /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 0:
                a2.i();
                throw null;
            default:
                a2.i();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.a) {
            case 0:
                r((Integer) obj);
                break;
            default:
                r((Integer) obj);
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
