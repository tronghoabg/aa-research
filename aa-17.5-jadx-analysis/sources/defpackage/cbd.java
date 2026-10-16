package defpackage;

import j$.util.List;

/* loaded from: classes.dex */
public final class cbd<E> extends afar<E> implements List<E>, cbe {
    private final cbe a;
    private final int b;
    private final int c;
    private final int d;

    public cbd(cbe cbeVar, int i, int i2) {
        this.a = cbeVar;
        this.b = i;
        this.c = i2;
        a.aI(i, i2, cbeVar.size());
        this.d = i2 - i;
    }

    @Override // defpackage.afam
    public final int a() {
        return this.d;
    }

    @Override // defpackage.afar, java.util.List
    public final E get(int i) {
        a.aG(i, this.d);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.afar, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        a.aI(i, i2, this.d);
        cbe cbeVar = this.a;
        int i3 = this.b;
        return new cbd(cbeVar, i + i3, i3 + i2);
    }
}
