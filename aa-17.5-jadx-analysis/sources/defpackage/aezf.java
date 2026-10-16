package defpackage;

/* loaded from: classes3.dex */
public abstract class aezf extends aexy {
    protected int b;

    protected aezf(int i) {
        this.b = i;
    }

    protected abstract aeze b(int i, int i2);

    protected abstract short c(int i);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16720;
    }

    @Override // defpackage.aexy, j$.util.Spliterator.OfPrimitive
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void forEachRemaining(aeys aeysVar) {
        int iG = g();
        while (true) {
            int i = this.b;
            if (i >= iG) {
                return;
            }
            aeysVar.c(c(i));
            this.b++;
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return g() - this.b;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean tryAdvance(aeys aeysVar) {
        if (this.b >= g()) {
            return false;
        }
        int i = this.b;
        this.b = i + 1;
        aeysVar.c(c(i));
        return true;
    }

    protected abstract int g();

    @Override // defpackage.aexy, j$.util.Spliterator
    /* renamed from: hu, reason: merged with bridge method [inline-methods] */
    public aeze trySplit() {
        throw null;
    }
}
