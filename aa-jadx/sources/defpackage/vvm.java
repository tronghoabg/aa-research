package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class vvm {
    public final defpackage.vlu a;

    public vvm(defpackage.vlu vluVar) {
        this.a = vluVar;
    }

    static defpackage.vvm a(android.app.Activity activity) {
        return new defpackage.vvm(new defpackage.vlu(activity.getClass().getName()));
    }

    final java.lang.String b() {
        return this.a.a;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.vvm) && b().equals(((defpackage.vvm) obj).b());
    }

    public final int hashCode() {
        return (b().hashCode() * 31) ^ 1231;
    }

    public final java.lang.String toString() {
        return defpackage.a.bp(this.a.a, "MeasurementKey{rawStringEventName=null, noPiiEventName=", ", isActivity=true}");
    }

    public vvm() {
        throw null;
    }
}
