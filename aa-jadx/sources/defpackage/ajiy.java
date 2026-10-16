package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajiy {
    public static final defpackage.aito a = new defpackage.aito("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final defpackage.aito b = new defpackage.aito(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final java.lang.String c;

    public ajiy(java.lang.String str, java.lang.String[] strArr) {
        strArr.getClass();
        this.c = str;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ajiy) && defpackage.afga.f(((defpackage.ajiy) obj).c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final java.lang.String toString() {
        return this.c;
    }
}
