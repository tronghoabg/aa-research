package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class afdp implements java.io.Serializable, defpackage.afdo {
    public static final defpackage.afdp a = new defpackage.afdp();
    private static final long serialVersionUID = 0;

    private afdp() {
    }

    private final java.lang.Object readResolve() {
        return a;
    }

    @Override // defpackage.afdo
    public final <E extends defpackage.afdm> E get(defpackage.afdn<E> afdnVar) {
        afdnVar.getClass();
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.afdo
    public final defpackage.afdo minusKey(defpackage.afdn<?> afdnVar) {
        afdnVar.getClass();
        return this;
    }

    @Override // defpackage.afdo
    public final defpackage.afdo plus(defpackage.afdo afdoVar) {
        afdoVar.getClass();
        return afdoVar;
    }

    public final java.lang.String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.afdo
    public final <R> R fold(R r, defpackage.affg<? super R, ? super defpackage.afdm, ? extends R> affgVar) {
        return r;
    }
}
