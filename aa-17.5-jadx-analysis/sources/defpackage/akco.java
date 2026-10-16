package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class akco implements Serializable {
    public static final akco a = new akcn("eras", (byte) 1);
    public static final akco b = new akcn("centuries", (byte) 2);
    public static final akco c = new akcn("weekyears", (byte) 3);
    public static final akco d = new akcn("years", (byte) 4);
    public static final akco e = new akcn("months", (byte) 5);
    public static final akco f = new akcn("weeks", (byte) 6);
    public static final akco g = new akcn("days", (byte) 7);
    public static final akco h = new akcn("halfdays", (byte) 8);
    public static final akco i = new akcn("hours", (byte) 9);
    public static final akco j = new akcn("minutes", (byte) 10);
    public static final akco k = new akcn("seconds", (byte) 11);
    public static final akco l = new akcn("millis", (byte) 12);
    private static final long serialVersionUID = 8765135187319L;
    public final String m;

    protected akco(String str) {
        this.m = str;
    }

    public abstract akcm a(akcd akcdVar);

    public final String toString() {
        return this.m;
    }
}
