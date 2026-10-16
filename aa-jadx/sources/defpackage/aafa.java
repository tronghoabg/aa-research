package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class aafa {
    public final com.google.android.libraries.maps.model.CameraPosition a;
    public final com.google.android.libraries.maps.model.CameraPosition b;
    public final long c;

    public aafa(com.google.android.libraries.maps.model.CameraPosition cameraPosition, com.google.android.libraries.maps.model.CameraPosition cameraPosition2, long j) {
        this.a = cameraPosition;
        defpackage.zlv.n(cameraPosition2, "dest");
        this.b = cameraPosition2;
        defpackage.acmj.h(j >= 0, "invalid durationMs: %s", new java.lang.Object[]{java.lang.Long.valueOf(j)});
        this.c = j;
    }

    protected abstract double a(double d);

    protected abstract double b(double d, double d2, double d3);

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.aafa)) {
            return false;
        }
        defpackage.aafa aafaVar = (defpackage.aafa) obj;
        return defpackage.a.B(this.a, aafaVar.a) && defpackage.a.B(this.b, aafaVar.b) && this.c == aafaVar.c;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, this.b, java.lang.Long.valueOf(this.c)});
    }
}
