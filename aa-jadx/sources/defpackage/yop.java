package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class yop implements defpackage.yon {
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.yon) {
            defpackage.yon yonVar = (defpackage.yon) obj;
            if (j$.util.Objects.equals(b(), yonVar.b()) && j$.util.Objects.equals(a(), yonVar.a()) && j$.util.Objects.equals(c(), yonVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(b(), a(), c());
    }

    public final java.lang.String toString() {
        return "(" + b().toString() + "," + a().toString() + ")=" + c().toString();
    }
}
