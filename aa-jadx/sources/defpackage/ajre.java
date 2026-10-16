package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajre {
    public defpackage.ajqx a = defpackage.ajqx.a;
    public defpackage.ajqy b;
    public defpackage.ajrj c;
    public java.util.Queue d;

    public final void a() {
        this.a = defpackage.ajqx.a;
        this.d = null;
        this.b = null;
        this.c = null;
    }

    public final void b(defpackage.ajqy ajqyVar, defpackage.ajrj ajrjVar) {
        this.b = ajqyVar;
        this.c = ajrjVar;
        this.d = null;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("state:");
        sb.append(this.a);
        sb.append(";");
        if (this.b != null) {
            sb.append("auth scheme:");
            sb.append(this.b.b());
            sb.append(";");
        }
        if (this.c != null) {
            sb.append("credentials present");
        }
        return sb.toString();
    }
}
