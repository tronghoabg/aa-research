package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ajvv implements defpackage.ajqb {
    public defpackage.ajpy a;
    public defpackage.ajpy b;
    public boolean c;

    protected ajvv() {
    }

    @Override // defpackage.ajqb
    public final defpackage.ajpy c() {
        return this.b;
    }

    @Override // defpackage.ajqb
    public final defpackage.ajpy d() {
        return this.a;
    }

    @Override // defpackage.ajqb
    public final boolean g() {
        return this.c;
    }

    public final void j(java.lang.String str) {
        this.a = new defpackage.akax("Content-Type", str);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        if (this.a != null) {
            sb.append("Content-Type: ");
            sb.append(this.a.c());
            sb.append(',');
        }
        if (this.b != null) {
            sb.append("Content-Encoding: ");
            sb.append(this.b.c());
            sb.append(',');
        }
        long jA = a();
        if (jA >= 0) {
            sb.append("Content-Length: ");
            sb.append(jA);
            sb.append(',');
        }
        sb.append("Chunked: ");
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.ajqb
    @java.lang.Deprecated
    public final void e() throws java.io.IOException {
    }
}
