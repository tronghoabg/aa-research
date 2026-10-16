package defpackage;

/* loaded from: classes.dex */
public final class zhu {
    public final ygr a;

    public zhu(ygr ygrVar) {
        this.a = ygrVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zhu) {
            return this.a.equals(((zhu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GrpcServiceConfig{grpcMethodConfigs=" + String.valueOf(this.a) + "}";
    }

    public zhu() {
        throw null;
    }
}
