package defpackage;

/* loaded from: classes.dex */
public final class cci extends ccf {
    private final cby c;

    public cci(cby cbyVar) {
        this.c = cbyVar;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 2;
        Object[] objArr = this.a;
        return new cbt(this.c, objArr[i], objArr[i + 1]);
    }
}
