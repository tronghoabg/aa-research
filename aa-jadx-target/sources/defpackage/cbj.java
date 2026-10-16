package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cbj<E> extends defpackage.afbr<E> implements j$.util.List<E>, defpackage.cbk {
    private final defpackage.cbk a;
    private final int b;
    private final int c;
    private final int d;

    public cbj(defpackage.cbk cbkVar, int i, int i2) {
        this.a = cbkVar;
        this.b = i;
        this.c = i2;
        defpackage.a.aH(i, i2, cbkVar.size());
        this.d = i2 - i;
    }

    @Override // defpackage.afbm
    public final int a() {
        return this.d;
    }

    @Override // defpackage.afbr, java.util.List
    public final E get(int i) {
        defpackage.a.aF(i, this.d);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.afbr, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        defpackage.a.aH(i, i2, this.d);
        defpackage.cbk cbkVar = this.a;
        int i3 = this.b;
        return new defpackage.cbj(cbkVar, i + i3, i3 + i2);
    }
}
