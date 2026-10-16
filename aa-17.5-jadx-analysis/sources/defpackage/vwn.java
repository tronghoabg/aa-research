package defpackage;

/* loaded from: classes.dex */
public final class vwn {
    public xxh a = xvy.a;
    public byte b;
    public int c;

    public final vwo a() {
        int i;
        if (this.b == 1 && (i = this.c) != 0) {
            return new vwo(i, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" enablement");
        }
        if (this.b == 0) {
            sb.append(" manualCapture");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
