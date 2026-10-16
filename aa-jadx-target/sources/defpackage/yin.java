package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yin extends defpackage.yfh {
    final /* synthetic */ java.lang.Iterable a;
    final /* synthetic */ defpackage.xyp b;

    public yin(java.lang.Iterable iterable, defpackage.xyp xypVar) {
        this.a = iterable;
        this.b = xypVar;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        java.util.Iterator it = this.a.iterator();
        it.getClass();
        return new defpackage.yit(it, this.b);
    }
}
