package defpackage;

import android.content.Context;
import android.location.Location;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class lwr {
    public final lwq a;
    public final String b;
    public final double c;
    public final lwp d;
    public final boolean e;
    private final String f;
    private final Set g;

    public lwr(String str, lwq lwqVar, String str2, double d, lwp lwpVar, boolean z) {
        str.getClass();
        str2.getClass();
        this.f = str;
        this.a = lwqVar;
        this.b = str2;
        this.c = d;
        this.d = lwpVar;
        this.e = z;
        this.g = new LinkedHashSet();
    }

    public static final String a(Context context, Location location) {
        context.getClass();
        return lvl.c(context, location);
    }

    public static final List b(List list, double d, int i) {
        String str;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            lwr lwrVar = (lwr) obj;
            if (lwrVar.c >= d) {
                switch (lwrVar.a.ordinal()) {
                    case 1:
                    case 2:
                    case 3:
                        String str2 = lwrVar.b;
                        if (afyh.v(str2) || (i > 0 && str2.length() > i)) {
                            break;
                        } else {
                            arrayList.add(obj);
                            break;
                        }
                    case 4:
                        arrayList.add(obj);
                        break;
                    case 5:
                        String str3 = lwrVar.d.b;
                        if (str3 != null && !afyh.v(str3)) {
                            arrayList.add(obj);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case 6:
                        lwp lwpVar = lwrVar.d;
                        String str4 = lwpVar.c;
                        if ((str4 != null && !afyh.v(str4)) || ((str = lwpVar.a) != null && !afyh.v(str))) {
                            arrayList.add(obj);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case 7:
                        String str5 = lwrVar.d.a;
                        if (str5 != null && !afyh.v(str5)) {
                            arrayList.add(obj);
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return arrayList;
    }

    public final void c(yzz yzzVar) {
        yzzVar.getClass();
        this.g.add(yzzVar);
    }

    public final boolean d(yzz yzzVar) {
        yzzVar.getClass();
        return this.g.contains(yzzVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwr)) {
            return false;
        }
        lwr lwrVar = (lwr) obj;
        return affa.f(this.f, lwrVar.f) && this.a == lwrVar.a && affa.f(this.b, lwrVar.b) && Double.compare(this.c, lwrVar.c) == 0 && affa.f(this.d, lwrVar.d) && this.e == lwrVar.e;
    }

    public final int hashCode() {
        int iHashCode = (((this.f.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
        long jDoubleToLongBits = Double.doubleToLongBits(this.c);
        return (((((iHashCode * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31) + this.d.hashCode()) * 31) + a.f(this.e);
    }

    public final String toString() {
        return "SmartActionDisplayData(id=" + this.f + ", type=" + this.a + ", displayText=" + this.b + ", confidenceScore=" + this.c + ", fulfillmentData=" + this.d + ", isPersonalRecommendation=" + this.e + ")";
    }
}
