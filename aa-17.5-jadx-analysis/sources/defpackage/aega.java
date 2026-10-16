package defpackage;

/* loaded from: classes3.dex */
public abstract class aega extends aeep {
    protected int b;

    protected aega(int i) {
        this.b = i;
    }

    protected abstract byte a(int i);

    protected abstract aefz c(int i, int i2);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16720;
    }

    @Override // defpackage.aeep, j$.util.Spliterator.OfPrimitive
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void forEachRemaining(aefj aefjVar) {
        int iG = g();
        while (true) {
            int i = this.b;
            if (i >= iG) {
                return;
            }
            aefjVar.b(a(i));
            this.b++;
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return g() - this.b;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean tryAdvance(aefj aefjVar) {
        if (this.b >= g()) {
            return false;
        }
        int i = this.b;
        this.b = i + 1;
        aefjVar.b(a(i));
        return true;
    }

    protected abstract int g();

    @Override // defpackage.aeep, j$.util.Spliterator
    /* renamed from: hp, reason: merged with bridge method [inline-methods] */
    public aefz trySplit() {
        throw null;
    }
}
