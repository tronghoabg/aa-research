package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ymq extends defpackage.ymi {
    final java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.ymr c;

    public ymq(defpackage.ymr ymrVar, int i) {
        this.c = ymrVar;
        this.a = ymrVar.a[i];
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // defpackage.ymg
    public final int a() {
        int i = this.b;
        if (i != -1) {
            defpackage.ymr ymrVar = this.c;
            if (i >= ymrVar.c || !j$.util.Objects.equals(this.a, ymrVar.a[i])) {
                this.b = this.c.e(this.a);
            }
        } else {
            this.b = this.c.e(this.a);
        }
        int i2 = this.b;
        if (i2 == -1) {
            return 0;
        }
        return this.c.b[i2];
    }

    @Override // defpackage.ymg
    public final java.lang.Object b() {
        return this.a;
    }
}
