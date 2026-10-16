package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vlu {
    public final java.lang.String a;

    public vlu(java.lang.String str) {
        this.a = str;
    }

    public static defpackage.vlu a(defpackage.vlu vluVar, defpackage.vlu vluVar2) {
        return new defpackage.vlu(java.lang.String.valueOf(vluVar.a).concat(java.lang.String.valueOf(vluVar2.a)));
    }

    public static defpackage.vlu b(defpackage.vlu vluVar, defpackage.vlu... vluVarArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(vluVar.a);
        for (defpackage.vlu vluVar2 : vluVarArr) {
            sb.append(vluVar2.a);
        }
        return new defpackage.vlu(sb.toString());
    }

    public static defpackage.vlu c(java.lang.String str, java.lang.Class cls) {
        if (defpackage.ysr.bw(str)) {
            return new defpackage.vlu(cls.getSimpleName());
        }
        return new defpackage.vlu(java.lang.String.valueOf(str).concat(java.lang.String.valueOf(cls.getSimpleName())));
    }

    public static defpackage.vlu d(java.lang.String str, java.lang.Enum r2) {
        if (defpackage.ysr.bw(str)) {
            return new defpackage.vlu(r2.name());
        }
        return new defpackage.vlu(java.lang.String.valueOf(str).concat(java.lang.String.valueOf(r2.name())));
    }

    public static java.lang.String e(defpackage.vlu vluVar) {
        if (vluVar == null) {
            return null;
        }
        return vluVar.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.vlu) {
            return this.a.equals(((defpackage.vlu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a;
    }
}
