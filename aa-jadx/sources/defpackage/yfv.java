package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class yfv extends defpackage.ycx {
    final java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.yge c;

    public yfv(defpackage.yge ygeVar, int i) {
        this.c = ygeVar;
        this.a = ygeVar.a[i];
        this.b = i;
    }

    final void a() {
        int i = this.b;
        if (i != -1) {
            defpackage.yge ygeVar = this.c;
            if (i <= ygeVar.c && j$.util.Objects.equals(ygeVar.a[i], this.a)) {
                return;
            }
        }
        this.b = this.c.b(this.a);
    }

    @Override // defpackage.ycx, java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.a;
    }

    @Override // defpackage.ycx, java.util.Map.Entry
    public final java.lang.Object getValue() {
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return this.c.b[i];
    }

    @Override // defpackage.ycx, java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        a();
        int i = this.b;
        defpackage.yge ygeVar = this.c;
        if (i == -1) {
            ygeVar.j(this.a, obj);
            return null;
        }
        java.lang.Object obj2 = ygeVar.b[i];
        if (j$.util.Objects.equals(obj2, obj)) {
            return obj;
        }
        ygeVar.m(this.b, obj);
        return obj2;
    }
}
