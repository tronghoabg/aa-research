package defpackage;

/* loaded from: classes3.dex */
public final class uwn extends RuntimeException {
    public uwn(String str, String str2, int i, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\nGL info log: \n");
        sb.append(str2);
        sb.append("\nShader ");
        sb.append(i == 35633 ? "vert" : "frag");
        sb.append(" source: \n");
        sb.append(str3);
        super(sb.toString());
    }

    public uwn(String str) {
        super(str);
    }

    public uwn(String str, String str2, String str3, String str4) {
        super(str + "\nGL info log: \n" + str2 + "\nShader vert source: \n" + str3 + "\nShader frag source: \n" + str4 + "\n");
    }

    public uwn(String str, Throwable th) {
        super(str, th);
    }
}
