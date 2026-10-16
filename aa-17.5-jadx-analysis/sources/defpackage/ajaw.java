package defpackage;

/* loaded from: classes3.dex */
public final class ajaw implements afco {
    public final Throwable a;
    private final /* synthetic */ afco b;

    public ajaw(Throwable th, afco afcoVar) {
        this.b = afcoVar;
        this.a = th;
    }

    @Override // defpackage.afco
    public final <R> R fold(R r, afeg<? super R, ? super afcm, ? extends R> afegVar) {
        return (R) this.b.fold(r, afegVar);
    }

    @Override // defpackage.afco
    public final <E extends afcm> E get(afcn<E> afcnVar) {
        return (E) this.b.get(afcnVar);
    }

    @Override // defpackage.afco
    public final afco minusKey(afcn<?> afcnVar) {
        return this.b.minusKey(afcnVar);
    }

    @Override // defpackage.afco
    public final afco plus(afco afcoVar) {
        return this.b.plus(afcoVar);
    }
}
