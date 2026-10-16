package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class snc {
    public final defpackage.smo a;
    public final com.google.android.gms.common.Feature b;

    public snc(defpackage.smo smoVar, com.google.android.gms.common.Feature feature) {
        this.a = smoVar;
        this.b = feature;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.snc) {
            defpackage.snc sncVar = (defpackage.snc) obj;
            if (j$.util.Objects.equals(this.a, sncVar.a) && j$.util.Objects.equals(this.b, sncVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, this.b});
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.sqg.b("key", this.a, arrayList);
        defpackage.sqg.b("feature", this.b, arrayList);
        return defpackage.sqg.a(arrayList, this);
    }
}
