package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ziw {
    public final defpackage.yhx a;

    public ziw(defpackage.yhx yhxVar) {
        this.a = yhxVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ziw) {
            return this.a.equals(((defpackage.ziw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "GrpcServiceConfig{grpcMethodConfigs=" + java.lang.String.valueOf(this.a) + "}";
    }

    public ziw() {
        throw null;
    }
}
