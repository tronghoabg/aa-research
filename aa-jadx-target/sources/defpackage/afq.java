package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afq extends defpackage.afp {
    public final int c;

    public afq(java.lang.Object obj, defpackage.aez aezVar) {
        super(obj, aezVar);
        this.c = 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.afq)) {
            return false;
        }
        defpackage.afq afqVar = (defpackage.afq) obj;
        if (!defpackage.afga.f(afqVar.a, this.a) || !defpackage.afga.f(afqVar.b, this.b)) {
            return false;
        }
        int i = afqVar.c;
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 961) + this.b.hashCode();
    }
}
