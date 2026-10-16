package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yio extends defpackage.yfh {
    final /* synthetic */ java.lang.Iterable a;
    final /* synthetic */ defpackage.xyd b;

    public yio(java.lang.Iterable iterable, defpackage.xyd xydVar) {
        this.a = iterable;
        this.b = xydVar;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.yiu(this.a.iterator(), this.b);
    }
}
