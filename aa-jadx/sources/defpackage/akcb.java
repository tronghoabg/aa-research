package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class akcb implements defpackage.akca {
    private final defpackage.akca a;

    public akcb() {
        this.a = new defpackage.akbw();
    }

    public final java.lang.Object j(java.lang.String str, java.lang.Class cls) {
        java.lang.Object objV = v(str);
        if (objV == null) {
            return null;
        }
        return cls.cast(objV);
    }

    public final defpackage.ajqa k() {
        return (defpackage.ajqa) j("http.connection", defpackage.ajqa.class);
    }

    public final defpackage.ajqe l() {
        return (defpackage.ajqe) j("http.target_host", defpackage.ajqe.class);
    }

    @Override // defpackage.akca
    public final java.lang.Object v(java.lang.String str) {
        return this.a.v(str);
    }

    @Override // defpackage.akca
    public final void x(java.lang.String str, java.lang.Object obj) {
        this.a.x(str, obj);
    }

    public akcb(defpackage.akca akcaVar) {
        this.a = akcaVar;
    }
}
