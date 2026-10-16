package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z implements java.util.function.Consumer, j$.util.stream.z2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.Consumer b;

    public /* synthetic */ z(java.util.function.Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        byte b = this.a;
        java.util.function.Consumer consumer = this.b;
        switch (b) {
            case 0:
                consumer.accept(j$.nio.file.a.g(obj));
                break;
            case 1:
                consumer.accept(j$.nio.file.a.g(obj));
                break;
            case 2:
                consumer.accept(new j$.util.q((java.util.Map.Entry) obj));
                break;
            default:
                consumer.accept(obj);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.z2
    public boolean s() {
        return false;
    }

    @Override // j$.util.stream.z2
    public /* synthetic */ void accept(long j) {
        j$.util.stream.a2.i();
        throw null;
    }

    @Override // j$.util.stream.z2
    public /* synthetic */ void accept(int i) {
        j$.util.stream.a2.d();
        throw null;
    }

    @Override // j$.util.stream.z2
    public void p(long j) {
    }

    @Override // j$.util.stream.z2
    public void end() {
    }
}
