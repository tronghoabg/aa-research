package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class qmu {
    public final qmh a;
    public volatile Boolean b;
    private String c;
    private Set d;

    protected qmu(qmh qmhVar) {
        this.a = qmhVar;
    }

    public static final long b() {
        return ((Long) qmy.y.f()).longValue();
    }

    public static final long c() {
        return ((Long) qmy.g.f()).longValue();
    }

    public static final long d() {
        return ((Long) qmy.f.f()).longValue();
    }

    public static final int e() {
        return ((Integer) qmy.r.f()).intValue();
    }

    public static final int f() {
        return ((Integer) qmy.j.f()).intValue();
    }

    public static final int g() {
        return ((Integer) qmy.i.f()).intValue();
    }

    public static final String h() {
        return (String) qmy.l.f();
    }

    public static final String i() {
        return (String) qmy.m.f();
    }

    public static final String j() {
        return (String) qmy.k.f();
    }

    public static final boolean k() {
        return ((Boolean) qmy.a.f()).booleanValue();
    }

    public final Set a() {
        String str;
        String str2 = (String) qmy.u.f();
        if (this.d == null || (str = this.c) == null || !str.equals(str2)) {
            String[] strArrSplit = TextUtils.split(str2, ",");
            HashSet hashSet = new HashSet();
            for (String str3 : strArrSplit) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(str3)));
                } catch (NumberFormatException unused) {
                }
            }
            this.c = str2;
            this.d = hashSet;
        }
        return this.d;
    }
}
