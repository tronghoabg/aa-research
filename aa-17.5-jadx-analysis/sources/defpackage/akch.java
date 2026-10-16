package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class akch implements Serializable {
    public static final akch b = new akcg("era", (byte) 1, akco.a);
    public static final akch c;
    public static final akch d;
    public static final akch e;
    public static final akch f;
    public static final akch g;
    public static final akch h;
    public static final akch i;
    public static final akch j;
    public static final akch k;
    public static final akch l;
    public static final akch m;
    public static final akch n;
    public static final akch o;
    public static final akch p;
    public static final akch q;
    public static final akch r;
    public static final akch s;
    private static final long serialVersionUID = -42615285973990L;
    public static final akch t;
    public static final akch u;
    public static final akch v;
    public static final akch w;
    public static final akch x;
    public final String y;

    static {
        akco akcoVar = akco.d;
        c = new akcg("yearOfEra", (byte) 2, akcoVar);
        d = new akcg("centuryOfEra", (byte) 3, akco.b);
        e = new akcg("yearOfCentury", (byte) 4, akcoVar);
        f = new akcg("year", (byte) 5, akcoVar);
        akco akcoVar2 = akco.g;
        g = new akcg("dayOfYear", (byte) 6, akcoVar2);
        h = new akcg("monthOfYear", (byte) 7, akco.e);
        i = new akcg("dayOfMonth", (byte) 8, akcoVar2);
        akco akcoVar3 = akco.c;
        j = new akcg("weekyearOfCentury", (byte) 9, akcoVar3);
        k = new akcg("weekyear", (byte) 10, akcoVar3);
        l = new akcg("weekOfWeekyear", (byte) 11, akco.f);
        m = new akcg("dayOfWeek", (byte) 12, akcoVar2);
        n = new akcg("halfdayOfDay", (byte) 13, akco.h);
        akco akcoVar4 = akco.i;
        o = new akcg("hourOfHalfday", (byte) 14, akcoVar4);
        p = new akcg("clockhourOfHalfday", (byte) 15, akcoVar4);
        q = new akcg("clockhourOfDay", (byte) 16, akcoVar4);
        r = new akcg("hourOfDay", (byte) 17, akcoVar4);
        akco akcoVar5 = akco.j;
        s = new akcg("minuteOfDay", (byte) 18, akcoVar5);
        t = new akcg("minuteOfHour", (byte) 19, akcoVar5);
        akco akcoVar6 = akco.k;
        u = new akcg("secondOfDay", (byte) 20, akcoVar6);
        v = new akcg("secondOfMinute", (byte) 21, akcoVar6);
        akco akcoVar7 = akco.l;
        w = new akcg("millisOfDay", (byte) 22, akcoVar7);
        x = new akcg("millisOfSecond", (byte) 23, akcoVar7);
    }

    protected akch(String str) {
        this.y = str;
    }

    public abstract akcf a(akcd akcdVar);

    public final String toString() {
        return this.y;
    }
}
