package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bwk {
    public int a;
    public java.lang.Object b;
    public final java.lang.Object c;

    public bwk() {
        this.c = new defpackage.bzc(new defpackage.ov[16]);
    }

    public final void a(int i, java.lang.Object obj) {
        if (i < 0) {
            defpackage.asq.c("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        defpackage.ov ovVar = new defpackage.ov(this.a, i, obj);
        this.a += i;
        ((defpackage.bzc) this.c).n(ovVar);
    }

    public final defpackage.ov b(int i) {
        if (i < 0 || i >= this.a) {
            defpackage.asq.e("Index " + i + ", size " + this.a);
        }
        java.lang.Object obj = this.b;
        if (obj != null) {
            defpackage.ov ovVar = (defpackage.ov) obj;
            int i2 = ovVar.a;
            if (i < ovVar.b + i2 && i2 <= i) {
                return ovVar;
            }
        }
        defpackage.bzc bzcVar = (defpackage.bzc) this.c;
        defpackage.ov ovVar2 = (defpackage.ov) bzcVar.a[defpackage.axd.q(bzcVar, i)];
        this.b = ovVar2;
        return ovVar2;
    }

    public bwk(defpackage.bxl bxlVar, int i, java.lang.Object obj) {
        this.c = bxlVar;
        this.a = i;
        this.b = obj;
    }

    public bwk(defpackage.dck dckVar) {
        this.c = dckVar;
    }
}
