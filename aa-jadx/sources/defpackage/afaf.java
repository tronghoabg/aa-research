package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class afaf extends defpackage.aeyy {
    protected int b;

    protected afaf(int i) {
        this.b = i;
    }

    protected abstract defpackage.afae b(int i, int i2);

    protected abstract short c(int i);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16720;
    }

    @Override // defpackage.aeyy, j$.util.Spliterator.OfPrimitive
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void forEachRemaining(defpackage.aezs aezsVar) {
        int iG = g();
        while (true) {
            int i = this.b;
            if (i >= iG) {
                return;
            }
            aezsVar.c(c(i));
            this.b++;
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return ((long) g()) - ((long) this.b);
    }

    @Override // j$.util.Spliterator.OfPrimitive
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean tryAdvance(defpackage.aezs aezsVar) {
        if (this.b >= g()) {
            return false;
        }
        int i = this.b;
        this.b = i + 1;
        aezsVar.c(c(i));
        return true;
    }

    protected abstract int g();

    @Override // defpackage.aeyy, j$.util.Spliterator
    /* JADX INFO: renamed from: gG, reason: merged with bridge method [inline-methods] */
    public defpackage.afae trySplit() {
        throw null;
    }
}
