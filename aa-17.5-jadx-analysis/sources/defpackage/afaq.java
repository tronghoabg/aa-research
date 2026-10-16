package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class afaq<E> extends afar<E> implements RandomAccess {
    private final afar a;
    private final int b;
    private final int c;

    public afaq(afar afarVar, int i, int i2) {
        this.a = afarVar;
        this.b = i;
        a.aI(i, i2, afarVar.a());
        this.c = i2 - i;
    }

    @Override // defpackage.afam
    public final int a() {
        return this.c;
    }

    @Override // defpackage.afar, java.util.List
    public final E get(int i) {
        a.aG(i, this.c);
        return (E) this.a.get(this.b + i);
    }

    @Override // defpackage.afar, java.util.List
    public final List subList(int i, int i2) {
        a.aI(i, i2, this.c);
        afar afarVar = this.a;
        int i3 = this.b;
        return new afaq(afarVar, i + i3, i3 + i2);
    }
}
