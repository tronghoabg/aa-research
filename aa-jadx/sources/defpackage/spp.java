package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class spp implements defpackage.slq {
    public static final defpackage.spp a = new defpackage.spp(null);
    public final java.lang.String b;

    public spp(java.lang.String str) {
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.spp) {
            return j$.util.Objects.equals(this.b, ((defpackage.spp) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.b});
    }
}
