package defpackage;

/* loaded from: classes.dex */
public final class zht {
    public final String a;
    public final zhs b;

    public zht(zhs zhsVar) {
        this.a = "java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService";
        this.b = zhsVar;
    }

    public final boolean equals(Object obj) {
        zhs zhsVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zht) {
            zht zhtVar = (zht) obj;
            if (this.a.equals(zhtVar.a) && ((zhsVar = this.b) != null ? zhsVar.equals(zhtVar.b) : zhtVar.b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        zhs zhsVar = this.b;
        return (zhsVar == null ? 0 : zhsVar.hashCode()) ^ (iHashCode * (-721379959));
    }

    public final String toString() {
        return "GrpcMethodConfig{service=" + this.a + ", method=null, grpcRetryConfig=" + String.valueOf(this.b) + "}";
    }

    public zht() {
        throw null;
    }
}
