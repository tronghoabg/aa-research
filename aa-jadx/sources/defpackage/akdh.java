package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class akdh implements java.io.Serializable {
    public static final defpackage.akdh b = new defpackage.akdg("era", (byte) 1, defpackage.akdo.a);
    public static final defpackage.akdh c;
    public static final defpackage.akdh d;
    public static final defpackage.akdh e;
    public static final defpackage.akdh f;
    public static final defpackage.akdh g;
    public static final defpackage.akdh h;
    public static final defpackage.akdh i;
    public static final defpackage.akdh j;
    public static final defpackage.akdh k;
    public static final defpackage.akdh l;
    public static final defpackage.akdh m;
    public static final defpackage.akdh n;
    public static final defpackage.akdh o;
    public static final defpackage.akdh p;
    public static final defpackage.akdh q;
    public static final defpackage.akdh r;
    public static final defpackage.akdh s;
    private static final long serialVersionUID = -42615285973990L;
    public static final defpackage.akdh t;
    public static final defpackage.akdh u;
    public static final defpackage.akdh v;
    public static final defpackage.akdh w;
    public static final defpackage.akdh x;
    public final java.lang.String y;

    static {
        defpackage.akdo akdoVar = defpackage.akdo.d;
        c = new defpackage.akdg("yearOfEra", (byte) 2, akdoVar);
        d = new defpackage.akdg("centuryOfEra", (byte) 3, defpackage.akdo.b);
        e = new defpackage.akdg("yearOfCentury", (byte) 4, akdoVar);
        f = new defpackage.akdg("year", (byte) 5, akdoVar);
        defpackage.akdo akdoVar2 = defpackage.akdo.g;
        g = new defpackage.akdg("dayOfYear", (byte) 6, akdoVar2);
        h = new defpackage.akdg("monthOfYear", (byte) 7, defpackage.akdo.e);
        i = new defpackage.akdg("dayOfMonth", (byte) 8, akdoVar2);
        defpackage.akdo akdoVar3 = defpackage.akdo.c;
        j = new defpackage.akdg("weekyearOfCentury", (byte) 9, akdoVar3);
        k = new defpackage.akdg("weekyear", (byte) 10, akdoVar3);
        l = new defpackage.akdg("weekOfWeekyear", (byte) 11, defpackage.akdo.f);
        m = new defpackage.akdg("dayOfWeek", (byte) 12, akdoVar2);
        n = new defpackage.akdg("halfdayOfDay", (byte) 13, defpackage.akdo.h);
        defpackage.akdo akdoVar4 = defpackage.akdo.i;
        o = new defpackage.akdg("hourOfHalfday", (byte) 14, akdoVar4);
        p = new defpackage.akdg("clockhourOfHalfday", (byte) 15, akdoVar4);
        q = new defpackage.akdg("clockhourOfDay", (byte) 16, akdoVar4);
        r = new defpackage.akdg("hourOfDay", (byte) 17, akdoVar4);
        defpackage.akdo akdoVar5 = defpackage.akdo.j;
        s = new defpackage.akdg("minuteOfDay", (byte) 18, akdoVar5);
        t = new defpackage.akdg("minuteOfHour", (byte) 19, akdoVar5);
        defpackage.akdo akdoVar6 = defpackage.akdo.k;
        u = new defpackage.akdg("secondOfDay", (byte) 20, akdoVar6);
        v = new defpackage.akdg("secondOfMinute", (byte) 21, akdoVar6);
        defpackage.akdo akdoVar7 = defpackage.akdo.l;
        w = new defpackage.akdg("millisOfDay", (byte) 22, akdoVar7);
        x = new defpackage.akdg("millisOfSecond", (byte) 23, akdoVar7);
    }

    protected akdh(java.lang.String str) {
        this.y = str;
    }

    public abstract defpackage.akdf a(defpackage.akdd akddVar);

    public final java.lang.String toString() {
        return this.y;
    }
}
