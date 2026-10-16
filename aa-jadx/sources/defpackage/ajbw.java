package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajbw implements defpackage.afdo {
    public final java.lang.Throwable a;
    private final /* synthetic */ defpackage.afdo b;

    public ajbw(java.lang.Throwable th, defpackage.afdo afdoVar) {
        this.b = afdoVar;
        this.a = th;
    }

    @Override // defpackage.afdo
    public final <R> R fold(R r, defpackage.affg<? super R, ? super defpackage.afdm, ? extends R> affgVar) {
        return (R) this.b.fold(r, affgVar);
    }

    @Override // defpackage.afdo
    public final <E extends defpackage.afdm> E get(defpackage.afdn<E> afdnVar) {
        return (E) this.b.get(afdnVar);
    }

    @Override // defpackage.afdo
    public final defpackage.afdo minusKey(defpackage.afdn<?> afdnVar) {
        return this.b.minusKey(afdnVar);
    }

    @Override // defpackage.afdo
    public final defpackage.afdo plus(defpackage.afdo afdoVar) {
        return this.b.plus(afdoVar);
    }
}
