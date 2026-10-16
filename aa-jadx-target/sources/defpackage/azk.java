package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class azk {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public int c;
    public defpackage.affg d;
    final /* synthetic */ defpackage.ngb e;

    public azk(defpackage.ngb ngbVar, int i, java.lang.Object obj, java.lang.Object obj2) {
        this.e = ngbVar;
        this.a = obj;
        this.b = obj2;
        this.c = i;
    }

    public final defpackage.affg a() {
        defpackage.affg affgVar = this.d;
        if (affgVar != null) {
            return affgVar;
        }
        defpackage.ccz cczVar = new defpackage.ccz(818252804, true, new defpackage.aps(this.e, this, 4));
        this.d = cczVar;
        return cczVar;
    }
}
