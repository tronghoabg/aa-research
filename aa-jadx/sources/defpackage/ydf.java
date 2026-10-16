package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ydf implements defpackage.yoo {
    public transient java.util.Collection a;
    private transient java.util.Set b;

    public java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map map = (java.util.Map) defpackage.ysr.J(k(), obj);
        if (map == null) {
            return null;
        }
        return defpackage.ysr.J(map, obj2);
    }

    public java.util.Collection b() {
        throw null;
    }

    @Override // defpackage.yoo
    public final java.util.Set c() {
        java.util.Set set = this.b;
        if (set != null) {
            return set;
        }
        java.util.Set setD = d();
        this.b = setD;
        return setD;
    }

    public java.util.Set d() {
        throw null;
    }

    public final boolean e() {
        return f() == 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.yoo) {
            return c().equals(((defpackage.yoo) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }

    public final java.lang.String toString() {
        return k().toString();
    }
}
