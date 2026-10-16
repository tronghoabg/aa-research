package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class ywf {
    public final java.lang.Object a;

    public ywf(java.lang.Object obj) {
        this.a = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !defpackage.afga.f(getClass(), obj.getClass())) {
            return false;
        }
        return defpackage.afga.f(this.a, ((defpackage.ywf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
