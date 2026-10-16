package defpackage;

/* loaded from: classes3.dex */
public abstract class ahkz<E> {
    public final int bitWidth;
    public final int offset;

    private ahkz(int i, int i2) {
        this.offset = i;
        this.bitWidth = i2;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Lahor;>(Lahkz<*>;[TE;)Lahkz<TE;>; */
    public static ahkz after(ahkz ahkzVar, ahor[] ahorVarArr) {
        return new ahky(ahkzVar.offset + ahkzVar.bitWidth, ahorVarArr);
    }

    public static ahkx booleanAfter(ahkz<?> ahkzVar) {
        return new ahkx(ahkzVar.offset + ahkzVar.bitWidth);
    }

    public static ahkx booleanFirst() {
        return new ahkx(0);
    }

    public abstract E get(int i);

    public abstract int toFlags(E e);

    public /* synthetic */ ahkz(int i, int i2, ahkw ahkwVar) {
        this(i, i2);
    }
}
