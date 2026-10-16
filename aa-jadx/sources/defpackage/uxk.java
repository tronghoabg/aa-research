package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uxk extends java.lang.RuntimeException {
    public uxk(java.lang.String str, java.lang.String str2, int i, java.lang.String str3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("\nGL info log: \n");
        sb.append(str2);
        sb.append("\nShader ");
        sb.append(i == 35633 ? "vert" : "frag");
        sb.append(" source: \n");
        sb.append(str3);
        super(sb.toString());
    }

    public uxk(java.lang.String str) {
        super(str);
    }

    public uxk(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        super(str + "\nGL info log: \n" + str2 + "\nShader vert source: \n" + str3 + "\nShader frag source: \n" + str4 + "\n");
    }

    public uxk(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }
}
