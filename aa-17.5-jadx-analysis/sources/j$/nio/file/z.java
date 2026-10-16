package j$.nio.file;

import j$.util.function.Consumer$CC;
import j$.util.stream.a2;
import j$.util.stream.z2;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements Consumer, z2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ z(Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        byte b = this.a;
        Consumer consumer = this.b;
        switch (b) {
            case 0:
                consumer.accept(a.g(obj));
                break;
            case 1:
                consumer.accept(a.g(obj));
                break;
            case 2:
                consumer.accept(new j$.util.q((Map.Entry) obj));
                break;
            default:
                consumer.accept(obj);
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
    public boolean s() {
        return false;
    }

    @Override // j$.util.stream.z2
    public /* synthetic */ void accept(long j) {
        a2.i();
        throw null;
    }

    @Override // j$.util.stream.z2
    public /* synthetic */ void accept(int i) {
        a2.d();
        throw null;
    }

    @Override // j$.util.stream.z2
    public void p(long j) {
    }

    @Override // j$.util.stream.z2
    public void end() {
    }
}
