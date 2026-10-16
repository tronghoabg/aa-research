package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ers {
    public final defpackage.esq h = new defpackage.esq();

    public final void g() {
        defpackage.esq esqVar = this.h;
        if (!esqVar.c) {
            esqVar.c = true;
            synchronized (esqVar.d) {
                java.util.Iterator it = esqVar.a.values().iterator();
                while (it.hasNext()) {
                    defpackage.esq.a((java.lang.AutoCloseable) it.next());
                }
                java.util.Set set = esqVar.b;
                java.util.Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    defpackage.esq.a((java.lang.AutoCloseable) it2.next());
                }
                set.clear();
            }
        }
        d();
    }

    protected void d() {
    }
}
