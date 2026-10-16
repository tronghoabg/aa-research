package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afdj implements java.io.Serializable, defpackage.afdo {
    private final defpackage.afdo a;
    private final defpackage.afdm b;

    public afdj(defpackage.afdo afdoVar, defpackage.afdm afdmVar) {
        afdoVar.getClass();
        this.a = afdoVar;
        this.b = afdmVar;
    }

    private final int a() {
        int i = 2;
        while (true) {
            defpackage.afdo afdoVar = this.a;
            this = afdoVar instanceof defpackage.afdj ? (defpackage.afdj) afdoVar : null;
            if (this == null) {
                return i;
            }
            i++;
        }
    }

    private final boolean b(defpackage.afdm afdmVar) {
        return defpackage.afga.f(get(afdmVar.getKey()), afdmVar);
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final java.lang.Object writeReplace() {
        int iA = a();
        defpackage.afdo[] afdoVarArr = new defpackage.afdo[iA];
        defpackage.afgt afgtVar = new defpackage.afgt();
        fold(defpackage.afbk.a, new myl(afdoVarArr, afgtVar, 13, (byte[]) null));
        if (afgtVar.a == iA) {
            return new afdi(afdoVarArr);
        }
        throw new java.lang.IllegalStateException("Check failed.");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.afdj) {
            defpackage.afdj afdjVar = (defpackage.afdj) obj;
            if (afdjVar.a() == a()) {
                while (afdjVar.b(this.b)) {
                    defpackage.afdo afdoVar = this.a;
                    if (afdoVar instanceof defpackage.afdj) {
                        this = (defpackage.afdj) afdoVar;
                    } else if (afdjVar.b((defpackage.afdm) afdoVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.afdo
    public final <R> R fold(R r, defpackage.affg<? super R, ? super defpackage.afdm, ? extends R> affgVar) {
        return affgVar.invoke((java.lang.Object) this.a.fold(r, affgVar), this.b);
    }

    @Override // defpackage.afdo
    public final <E extends defpackage.afdm> E get(defpackage.afdn<E> afdnVar) {
        afdnVar.getClass();
        while (true) {
            E e = (E) this.b.get(afdnVar);
            if (e != null) {
                return e;
            }
            defpackage.afdo afdoVar = this.a;
            if (!(afdoVar instanceof defpackage.afdj)) {
                return (E) afdoVar.get(afdnVar);
            }
            this = (defpackage.afdj) afdoVar;
        }
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    @Override // defpackage.afdo
    public final defpackage.afdo minusKey(defpackage.afdn<?> afdnVar) {
        afdnVar.getClass();
        defpackage.afdm afdmVar = this.b;
        defpackage.afdm afdmVar2 = afdmVar.get(afdnVar);
        defpackage.afdo afdoVar = this.a;
        if (afdmVar2 != null) {
            return afdoVar;
        }
        defpackage.afdo afdoVarMinusKey = afdoVar.minusKey(afdnVar);
        if (afdoVarMinusKey != afdoVar) {
            return afdoVarMinusKey == defpackage.afdp.a ? afdmVar : new defpackage.afdj(afdoVarMinusKey, afdmVar);
        }
        return this;
    }

    @Override // defpackage.afdo
    public final /* bridge */ defpackage.afdo plus(defpackage.afdo afdoVar) {
        return defpackage.afga.w(this, afdoVar);
    }

    public final java.lang.String toString() {
        return "[" + fold("", new defpackage.ooy(15)) + "]";
    }
}
