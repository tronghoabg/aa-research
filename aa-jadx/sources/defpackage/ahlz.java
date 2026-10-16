package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ahlz<E> {
    public final int bitWidth;
    public final int offset;

    private ahlz(int i, int i2) {
        this.offset = i;
        this.bitWidth = i2;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Lahpr;>(Lahlz<*>;[TE;)Lahlz<TE;>; */
    public static defpackage.ahlz after(defpackage.ahlz ahlzVar, defpackage.ahpr[] ahprVarArr) {
        return new defpackage.ahly(ahlzVar.offset + ahlzVar.bitWidth, ahprVarArr);
    }

    public static defpackage.ahlx booleanAfter(defpackage.ahlz<?> ahlzVar) {
        return new defpackage.ahlx(ahlzVar.offset + ahlzVar.bitWidth);
    }

    public static defpackage.ahlx booleanFirst() {
        return new defpackage.ahlx(0);
    }

    public abstract E get(int i);

    public abstract int toFlags(E e);
}
