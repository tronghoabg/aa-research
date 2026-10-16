package od;

import A7.C0237b0;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Q1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f41792a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f41793b;

    public Q1(String str, Map map) {
        Fe.e.t(str, "policyName");
        this.f41792a = str;
        Fe.e.t(map, "rawConfigValue");
        this.f41793b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Q1) {
            Q1 q12 = (Q1) obj;
            if (this.f41792a.equals(q12.f41792a) && this.f41793b.equals(q12.f41793b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41792a, this.f41793b});
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(this.f41792a, "policyName");
        c0237b0S.f(this.f41793b, "rawConfigValue");
        return c0237b0S.toString();
    }
}
