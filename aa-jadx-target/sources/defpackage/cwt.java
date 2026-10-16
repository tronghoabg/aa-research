package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cwt {
    private final float a = 10.0f;
    private final float b = 40.0f;
    private final float c = 10.0f;
    private final float d = 40.0f;
    private final boolean e = true;

    public static final long a(defpackage.dlo dloVar) {
        return defpackage.ud.b(dloVar.dN(10.0f), dloVar.dN(40.0f), dloVar.dN(10.0f), dloVar.dN(40.0f));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cwt)) {
            return false;
        }
        defpackage.cwt cwtVar = (defpackage.cwt) obj;
        float f = cwtVar.a;
        float f2 = cwtVar.b;
        float f3 = cwtVar.c;
        float f4 = cwtVar.d;
        boolean z = cwtVar.e;
        return true;
    }

    public final int hashCode() {
        return 905970895;
    }

    public final java.lang.String toString() {
        return "DpTouchBoundsExpansion(start=" + defpackage.dlr.b(10.0f) + ", top=" + defpackage.dlr.b(40.0f) + ", end=" + defpackage.dlr.b(10.0f) + ", bottom=" + defpackage.dlr.b(40.0f) + ", isLayoutDirectionAware=true)";
    }
}
