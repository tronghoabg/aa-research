package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aixs implements defpackage.aivn {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aixs(defpackage.aixu aixuVar, java.lang.Runnable runnable, int i) {
        this.c = i;
        this.a = aixuVar;
        this.b = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.aivn
    public final void gK() {
        int i = this.c;
        java.lang.Object obj = this.a;
        if (i == 0) {
            ((defpackage.aixu) obj).a.removeCallbacks(this.b);
            return;
        }
        java.lang.Object obj2 = this.b;
        synchronized (defpackage.ehb.a) {
            java.util.Map map = defpackage.ehb.b;
            defpackage.ehb ehbVar = (defpackage.ehb) map.get(obj2);
            if (ehbVar != null) {
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = ehbVar.c;
                copyOnWriteArrayList.remove(obj);
                if (copyOnWriteArrayList.isEmpty()) {
                    map.remove(obj2);
                    ehbVar.stopWatching();
                }
            }
        }
    }

    public /* synthetic */ aixs(java.lang.String str, defpackage.affc affcVar, int i) {
        this.c = i;
        this.b = str;
        this.a = affcVar;
    }
}
