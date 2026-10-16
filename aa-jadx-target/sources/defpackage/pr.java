package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class pr extends defpackage.ps implements java.util.Iterator {
    defpackage.pp a;
    defpackage.pp b;

    public pr(defpackage.pp ppVar, defpackage.pp ppVar2) {
        this.a = ppVar2;
        this.b = ppVar;
    }

    private final defpackage.pp a() {
        defpackage.pp ppVar = this.b;
        defpackage.pp ppVar2 = this.a;
        if (ppVar == ppVar2 || ppVar2 == null) {
            return null;
        }
        return ppVar.c;
    }

    @Override // defpackage.ps
    public final void b(defpackage.pp ppVar) {
        if (this.a == ppVar && ppVar == this.b) {
            this.b = null;
            this.a = null;
        }
        defpackage.pp ppVar2 = this.a;
        if (ppVar2 == ppVar) {
            this.a = ppVar2.d;
        }
        if (this.b == ppVar) {
            this.b = a();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        defpackage.pp ppVar = this.b;
        this.b = a();
        return ppVar;
    }
}
