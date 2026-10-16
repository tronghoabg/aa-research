package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cff implements java.util.ListIterator, defpackage.afhc {
    final /* synthetic */ defpackage.afgt a;
    final /* synthetic */ defpackage.cfg b;

    public cff(defpackage.afgt afgtVar, defpackage.cfg cfgVar) {
        this.a = afgtVar;
        this.b = cfgVar;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(java.lang.Object obj) {
        defpackage.cev.d();
        throw new defpackage.afap();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a.a < this.b.a + (-1);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a.a >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        defpackage.afgt afgtVar = this.a;
        int i = afgtVar.a + 1;
        defpackage.cfg cfgVar = this.b;
        defpackage.cev.b(i, cfgVar.a);
        afgtVar.a = i;
        return cfgVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.a + 1;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        defpackage.afgt afgtVar = this.a;
        defpackage.cfg cfgVar = this.b;
        int i = afgtVar.a;
        defpackage.cev.b(i, cfgVar.a);
        afgtVar.a = i - 1;
        return cfgVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a.a;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        defpackage.cev.d();
        throw new defpackage.afap();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj) {
        defpackage.cev.d();
        throw new defpackage.afap();
    }
}
