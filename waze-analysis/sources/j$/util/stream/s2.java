package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class s2 extends d {

    /* renamed from: h, reason: collision with root package name */
    public final a f50602h;

    /* renamed from: i, reason: collision with root package name */
    public final LongFunction f50603i;

    /* renamed from: j, reason: collision with root package name */
    public final BinaryOperator f50604j;

    public s2(s2 s2Var, Spliterator spliterator) {
        super(s2Var, spliterator);
        this.f50602h = s2Var.f50602h;
        this.f50603i = s2Var.f50603i;
        this.f50604j = s2Var.f50604j;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        e2 e2Var = (e2) this.f50603i.apply(this.f50602h.r(this.f50362b));
        this.f50602h.Q(this.f50362b, e2Var);
        return e2Var.build();
    }

    @Override // j$.util.stream.d
    public final d e(Spliterator spliterator) {
        return new s2(this, spliterator);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.f50364d;
        if (dVar != null) {
            this.f50366f = (m2) this.f50604j.apply((m2) ((s2) dVar).f50366f, (m2) ((s2) this.f50365e).f50366f);
        }
        super.onCompletion(countedCompleter);
    }

    public s2(a aVar, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(aVar, spliterator);
        this.f50602h = aVar;
        this.f50603i = longFunction;
        this.f50604j = binaryOperator;
    }
}
