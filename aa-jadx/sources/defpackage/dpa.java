package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class dpa {
    public final java.lang.Object h;

    public dpa(java.lang.Object obj) {
        this.h = obj;
        new java.util.LinkedHashMap();
    }

    public java.lang.Object a() {
        return this.h;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.dpa) && defpackage.afga.f(a(), ((defpackage.dpa) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
