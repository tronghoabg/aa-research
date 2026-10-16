package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class yeb extends defpackage.ycx {
    final /* synthetic */ defpackage.yed a;
    private final java.lang.Object b;
    private int c;

    public yeb(defpackage.yed yedVar, int i) {
        this.a = yedVar;
        this.b = yedVar.g(i);
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1) {
            defpackage.yed yedVar = this.a;
            if (i < yedVar.size() && j$.util.Objects.equals(this.b, yedVar.g(this.c))) {
                return;
            }
        }
        this.c = this.a.f(this.b);
    }

    @Override // defpackage.ycx, java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.b;
    }

    @Override // defpackage.ycx, java.util.Map.Entry
    public final java.lang.Object getValue() {
        defpackage.yed yedVar = this.a;
        java.util.Map mapN = yedVar.n();
        if (mapN != null) {
            return mapN.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return yedVar.j(i);
    }

    @Override // defpackage.ycx, java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        defpackage.yed yedVar = this.a;
        java.util.Map mapN = yedVar.n();
        if (mapN != null) {
            return mapN.put(this.b, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            yedVar.put(this.b, obj);
            return null;
        }
        java.lang.Object objJ = yedVar.j(i);
        yedVar.t(this.c, obj);
        return objJ;
    }
}
