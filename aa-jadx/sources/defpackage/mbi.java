package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class mbi {
    public final java.util.List a = new java.util.ArrayList();
    public final java.util.Map b = new java.util.HashMap();
    private final java.lang.String c;
    private final java.lang.String d;

    public mbi(java.lang.String str, java.lang.String str2) {
        this.d = str;
        this.c = str2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.c);
        sb.append(" | ");
        sb.append(java.lang.String.format(java.util.Locale.US, "%s: SESSION START\n", this.d));
        sb.append("\n# of notifications posted by package name:\n");
        for (java.util.Map.Entry entry : this.b.entrySet()) {
            sb.append(java.lang.String.format(java.util.Locale.US, "%s\t%d\n", entry.getKey(), entry.getValue()));
        }
        sb.append("\nListener events:\n");
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            sb.append((defpackage.mbj) it.next());
            sb.append("\n");
        }
        return sb.toString();
    }
}
