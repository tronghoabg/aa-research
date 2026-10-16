package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cko {
    public static final defpackage.cko a = new defpackage.cko();
    public final float b = 0.0f;
    public final float c = 0.0f;
    public final float d = 0.0f;
    public final float e = 0.0f;

    private cko() {
        if (defpackage.dlr.a(0.0f, 0.0f) < 0 || defpackage.dlr.a(0.0f, 0.0f) < 0 || defpackage.dlr.a(0.0f, 0.0f) < 0 || defpackage.dlr.a(0.0f, 0.0f) < 0) {
            defpackage.ckn.a("Layer outsets must be non-negative");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cko)) {
            return false;
        }
        defpackage.cko ckoVar = (defpackage.cko) obj;
        float f = ckoVar.b;
        float f2 = ckoVar.c;
        float f3 = ckoVar.d;
        float f4 = ckoVar.e;
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final java.lang.String toString() {
        return "LayerOutsets(left=" + defpackage.dlr.b(0.0f) + ", top=" + defpackage.dlr.b(0.0f) + ", right=" + defpackage.dlr.b(0.0f) + ", bottom=" + defpackage.dlr.b(0.0f) + ")";
    }
}
