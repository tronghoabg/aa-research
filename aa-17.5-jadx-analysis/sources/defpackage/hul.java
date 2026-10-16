package defpackage;

/* loaded from: classes2.dex */
public final class hul {
    public static final huk a = new huj();
    public final Object b;
    public final huk c;
    public final String d;
    public volatile byte[] e;

    public hul(String str, Object obj, huk hukVar) {
        fxy.h(str);
        this.d = str;
        this.b = obj;
        this.c = hukVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hul) {
            return this.d.equals(((hul) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "Option{key='" + this.d + "'}";
    }
}
