package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ziv {
    public final java.lang.String a;
    public final defpackage.ziu b;

    public ziv(defpackage.ziu ziuVar) {
        this.a = "java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService";
        this.b = ziuVar;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.ziu ziuVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ziv) {
            defpackage.ziv zivVar = (defpackage.ziv) obj;
            if (this.a.equals(zivVar.a) && ((ziuVar = this.b) != null ? ziuVar.equals(zivVar.b) : zivVar.b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        defpackage.ziu ziuVar = this.b;
        return (ziuVar == null ? 0 : ziuVar.hashCode()) ^ (iHashCode * (-721379959));
    }

    public final java.lang.String toString() {
        return "GrpcMethodConfig{service=" + this.a + ", method=null, grpcRetryConfig=" + java.lang.String.valueOf(this.b) + "}";
    }

    public ziv() {
        throw null;
    }
}
