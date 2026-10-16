package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dvf {
    public final android.content.res.Resources a;
    public final android.content.res.Resources.Theme b;

    public dvf(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.dvf dvfVar = (defpackage.dvf) obj;
            if (this.a.equals(dvfVar.a) && j$.util.Objects.equals(this.b, dvfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }
}
