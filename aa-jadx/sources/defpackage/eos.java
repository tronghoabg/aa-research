package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class eos {
    public final defpackage.eox a;
    public final defpackage.eoz b;
    public boolean c = true;

    public eos(defpackage.eox eoxVar, defpackage.eoz eozVar) {
        this.a = eoxVar;
        this.b = eozVar;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.a);
        sb.append(" ");
        sb.append(true != this.c ? "+>" : "->");
        sb.append(" ");
        sb.append(this.b);
        return sb.toString();
    }
}
