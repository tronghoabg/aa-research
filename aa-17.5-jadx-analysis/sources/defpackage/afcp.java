package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class afcp implements Serializable, afco {
    public static final afcp a = new afcp();
    private static final long serialVersionUID = 0;

    private afcp() {
    }

    private final Object readResolve() {
        return a;
    }

    @Override // defpackage.afco
    public final <E extends afcm> E get(afcn<E> afcnVar) {
        afcnVar.getClass();
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.afco
    public final afco minusKey(afcn<?> afcnVar) {
        afcnVar.getClass();
        return this;
    }

    @Override // defpackage.afco
    public final afco plus(afco afcoVar) {
        afcoVar.getClass();
        return afcoVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.afco
    public final <R> R fold(R r, afeg<? super R, ? super afcm, ? extends R> afegVar) {
        return r;
    }
}
