package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fsq {
    public final android.graphics.Bitmap a;
    public final java.util.Map b;

    public fsq(android.graphics.Bitmap bitmap, java.util.Map map) {
        this.a = bitmap;
        this.b = map;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.fsq)) {
            return false;
        }
        defpackage.fsq fsqVar = (defpackage.fsq) obj;
        return defpackage.afga.f(this.a, fsqVar.a) && defpackage.afga.f(this.b, fsqVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Value(bitmap=" + this.a + ", extras=" + this.b + ")";
    }
}
