package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class f5 extends d {

    /* renamed from: h, reason: collision with root package name */
    public final d4 f50401h;

    public f5(f5 f5Var, Spliterator spliterator) {
        super(f5Var, spliterator);
        this.f50401h = f5Var.f50401h;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.f50361a;
        y4 y4VarQ = this.f50401h.Q();
        aVar.Q(this.f50362b, y4VarQ);
        return y4VarQ;
    }

    @Override // j$.util.stream.d
    public final d e(Spliterator spliterator) {
        return new f5(this, spliterator);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.f50364d;
        if (dVar != null) {
            y4 y4Var = (y4) ((f5) dVar).f50366f;
            y4Var.B((y4) ((f5) this.f50365e).f50366f);
            this.f50366f = y4Var;
        }
        super.onCompletion(countedCompleter);
    }

    public f5(d4 d4Var, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.f50401h = d4Var;
    }
}
