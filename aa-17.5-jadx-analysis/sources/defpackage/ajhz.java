package defpackage;

/* loaded from: classes3.dex */
public final class ajhz {
    public static final aisp a = new aisp("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final aisp b = new aisp(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String c;

    public ajhz(String str, String[] strArr) {
        strArr.getClass();
        this.c = str;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ajhz) && affa.f(((ajhz) obj).c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }
}
