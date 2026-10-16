package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aeha extends defpackage.aefp {
    protected int b;

    protected aeha(int i) {
        this.b = i;
    }

    protected abstract byte a(int i);

    protected abstract defpackage.aegz c(int i, int i2);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16720;
    }

    @Override // defpackage.aefp, j$.util.Spliterator.OfPrimitive
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void forEachRemaining(defpackage.aegj aegjVar) {
        int iG = g();
        while (true) {
            int i = this.b;
            if (i >= iG) {
                return;
            }
            aegjVar.b(a(i));
            this.b++;
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return ((long) g()) - ((long) this.b);
    }

    @Override // j$.util.Spliterator.OfPrimitive
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean tryAdvance(defpackage.aegj aegjVar) {
        if (this.b >= g()) {
            return false;
        }
        int i = this.b;
        this.b = i + 1;
        aegjVar.b(a(i));
        return true;
    }

    protected abstract int g();

    @Override // defpackage.aefp, j$.util.Spliterator
    /* JADX INFO: renamed from: gB, reason: merged with bridge method [inline-methods] */
    public defpackage.aegz trySplit() {
        throw null;
    }
}
