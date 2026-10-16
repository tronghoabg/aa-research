package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aisz implements java.util.Iterator, defpackage.afhc {
    final /* synthetic */ java.lang.Object a;
    private final java.util.Iterator b;
    private int c;
    private final /* synthetic */ int d;

    public aisz(defpackage.aisw aiswVar, int i) {
        this.d = i;
        this.a = aiswVar;
        this.b = new defpackage.aitb((defpackage.aitc) aiswVar.a);
    }

    private final void a() {
        while (this.c < ((defpackage.aisw) this.a).b) {
            java.util.Iterator it = this.b;
            if (!it.hasNext()) {
                return;
            }
            it.next();
            this.c++;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d == 0) {
            return this.b.hasNext();
        }
        a();
        return this.c < 2 && this.b.hasNext();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [affg, java.lang.Object] */
    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.d != 0) {
            a();
            int i = this.c;
            if (i >= 2) {
                throw new java.util.NoSuchElementException();
            }
            this.c = i + 1;
            return this.b.next();
        }
        int i2 = this.c;
        this.c = i2 + 1;
        if (i2 < 0) {
            defpackage.afga.ai();
        }
        java.lang.Object obj = this.a;
        java.util.Iterator it = this.b;
        return ((defpackage.aita) obj).b.invoke(java.lang.Integer.valueOf(i2), it.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.d == 0) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public aisz(defpackage.aita aitaVar, int i) {
        this.d = i;
        this.a = aitaVar;
        this.b = new defpackage.aisl((defpackage.aism) aitaVar.a);
    }
}
