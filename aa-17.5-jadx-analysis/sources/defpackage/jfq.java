package defpackage;

/* loaded from: classes.dex */
public final class jfq {
    public String a;
    public String b;
    public String c;
    public String d;
    private String e;

    public final jfr a() {
        String str = this.e;
        if (str != null) {
            return new jfr(str, this.a, this.b, this.c, this.d);
        }
        throw new IllegalStateException("Missing required properties: make");
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null make");
        }
        this.e = str;
    }
}
