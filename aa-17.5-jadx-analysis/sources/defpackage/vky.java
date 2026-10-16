package defpackage;

/* loaded from: classes.dex */
public final class vky {
    public final String a;

    public vky(String str) {
        this.a = str;
    }

    public static vky a(vky vkyVar, vky vkyVar2) {
        return new vky(String.valueOf(vkyVar.a).concat(String.valueOf(vkyVar2.a)));
    }

    public static vky b(vky vkyVar, vky... vkyVarArr) {
        StringBuilder sb = new StringBuilder(vkyVar.a);
        for (vky vkyVar2 : vkyVarArr) {
            sb.append(vkyVar2.a);
        }
        return new vky(sb.toString());
    }

    public static vky c(String str, Class cls) {
        if (woy.am(str)) {
            return new vky(cls.getSimpleName());
        }
        return new vky(String.valueOf(str).concat(String.valueOf(cls.getSimpleName())));
    }

    public static vky d(String str, Enum r2) {
        if (woy.am(str)) {
            return new vky(r2.name());
        }
        return new vky(String.valueOf(str).concat(String.valueOf(r2.name())));
    }

    public static String e(vky vkyVar) {
        if (vkyVar == null) {
            return null;
        }
        return vkyVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vky) {
            return this.a.equals(((vky) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
