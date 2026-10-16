package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bkl {
    public final int a;
    public final int b;
    public final int c;
    public final defpackage.dga d;

    public bkl(int i, int i2, int i3, defpackage.dga dgaVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = dgaVar;
    }

    public final defpackage.bkn a(int i) {
        return new defpackage.bkn(defpackage.bxi.w(this.d, i), i);
    }

    public final java.lang.String b() {
        return this.d.a.a.b;
    }

    public final int c() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            return 2;
        }
        return i > i2 ? 1 : 3;
    }

    public final java.lang.String toString() {
        defpackage.dga dgaVar = this.d;
        int i = this.b;
        int i2 = this.a;
        return "SelectionInfo(id=1, range=(" + i2 + "-" + ((java.lang.Object) defpackage.dln.x(defpackage.bxi.w(dgaVar, i2))) + "," + i + "-" + ((java.lang.Object) defpackage.dln.x(defpackage.bxi.w(dgaVar, i))) + "), prevOffset=" + this.c + ")";
    }
}
