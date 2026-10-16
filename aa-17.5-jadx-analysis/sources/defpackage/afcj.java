package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class afcj implements Serializable, afco {
    private final afco a;
    private final afcm b;

    public afcj(afco afcoVar, afcm afcmVar) {
        afcoVar.getClass();
        this.a = afcoVar;
        this.b = afcmVar;
    }

    private final int a() {
        int i = 2;
        while (true) {
            afco afcoVar = this.a;
            this = afcoVar instanceof afcj ? (afcj) afcoVar : null;
            if (this == null) {
                return i;
            }
            i++;
        }
    }

    private final boolean b(afcm afcmVar) {
        return affa.f(get(afcmVar.getKey()), afcmVar);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int iA = a();
        afco[] afcoVarArr = new afco[iA];
        afft afftVar = new afft();
        fold(afak.a, new mxw(afcoVarArr, afftVar, 12, null));
        if (afftVar.a == iA) {
            return new afci(afcoVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof afcj) {
            afcj afcjVar = (afcj) obj;
            if (afcjVar.a() == a()) {
                while (true) {
                    if (!afcjVar.b(this.b)) {
                        break;
                    }
                    afco afcoVar = this.a;
                    if (afcoVar instanceof afcj) {
                        this = (afcj) afcoVar;
                    } else if (afcjVar.b((afcm) afcoVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.afco
    public final <R> R fold(R r, afeg<? super R, ? super afcm, ? extends R> afegVar) {
        return afegVar.invoke((Object) this.a.fold(r, afegVar), this.b);
    }

    @Override // defpackage.afco
    public final <E extends afcm> E get(afcn<E> afcnVar) {
        afcnVar.getClass();
        while (true) {
            E e = (E) this.b.get(afcnVar);
            if (e != null) {
                return e;
            }
            afco afcoVar = this.a;
            if (!(afcoVar instanceof afcj)) {
                return (E) afcoVar.get(afcnVar);
            }
            this = (afcj) afcoVar;
        }
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    @Override // defpackage.afco
    public final afco minusKey(afcn<?> afcnVar) {
        afcnVar.getClass();
        afcm afcmVar = this.b;
        afcm afcmVar2 = afcmVar.get(afcnVar);
        afco afcoVar = this.a;
        if (afcmVar2 != null) {
            return afcoVar;
        }
        afco afcoVarMinusKey = afcoVar.minusKey(afcnVar);
        return afcoVarMinusKey != afcoVar ? afcoVarMinusKey == afcp.a ? afcmVar : new afcj(afcoVarMinusKey, afcmVar) : this;
    }

    @Override // defpackage.afco
    public final /* bridge */ afco plus(afco afcoVar) {
        return affa.w(this, afcoVar);
    }

    public final String toString() {
        return "[" + fold("", new ooh(12)) + "]";
    }
}
