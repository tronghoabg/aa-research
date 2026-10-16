package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public class p0 extends j$.util.stream.d {
    public final j$.util.stream.a h;
    public final java.util.function.LongFunction i;
    public final java.util.function.BinaryOperator j;

    public p0(j$.util.stream.p0 p0Var, j$.util.Spliterator spliterator) {
        super(p0Var, spliterator);
        this.h = p0Var.h;
        this.i = p0Var.i;
        this.j = p0Var.j;
    }

    @Override // j$.util.stream.d
    public final java.lang.Object a() {
        j$.util.stream.b0 b0Var = (j$.util.stream.b0) this.i.apply(this.h.g(this.b));
        this.h.s(this.b, b0Var);
        return b0Var.build();
    }

    @Override // j$.util.stream.d
    public final j$.util.stream.d e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.p0(this, spliterator);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(java.util.concurrent.CountedCompleter countedCompleter) {
        j$.util.stream.d dVar = this.d;
        if (dVar != null) {
            this.f = (j$.util.stream.j0) this.j.apply((j$.util.stream.j0) ((j$.util.stream.p0) dVar).f, (j$.util.stream.j0) ((j$.util.stream.p0) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public p0(j$.util.stream.a aVar, j$.util.Spliterator spliterator, java.util.function.LongFunction longFunction, java.util.function.BinaryOperator binaryOperator) {
        super(aVar, spliterator);
        this.h = aVar;
        this.i = longFunction;
        this.j = binaryOperator;
    }
}
