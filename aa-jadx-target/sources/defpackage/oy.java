package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oy {
    public final java.util.Set a = new java.util.concurrent.CopyOnWriteArraySet();
    public volatile android.content.Context b;

    public final void a(defpackage.oz ozVar) {
        ozVar.getClass();
        if (this.b != null) {
            ozVar.a();
        }
        this.a.add(ozVar);
    }

    public final void b() {
        this.b = null;
    }

    public final void c(android.content.Context context) {
        this.b = context;
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.oz) it.next()).a();
        }
    }
}
