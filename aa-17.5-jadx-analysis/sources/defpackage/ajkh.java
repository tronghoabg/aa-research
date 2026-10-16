package defpackage;

/* loaded from: classes2.dex */
public final class ajkh {
    public final ajib a;
    public final int b;
    public final String c;

    public ajkh(ajib ajibVar, int i, String str) {
        str.getClass();
        this.a = ajibVar;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a == ajib.a) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        return sb.toString();
    }
}
