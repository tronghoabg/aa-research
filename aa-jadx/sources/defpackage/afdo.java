package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface afdo {
    <R> R fold(R r, defpackage.affg<? super R, ? super defpackage.afdm, ? extends R> affgVar);

    <E extends defpackage.afdm> E get(defpackage.afdn<E> afdnVar);

    defpackage.afdo minusKey(defpackage.afdn<?> afdnVar);

    defpackage.afdo plus(defpackage.afdo afdoVar);
}
