package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class vlz {
    public String a;
    public String b;
    public byte c;
    public Object d;
    public Object e;
    public Object f;

    public final void a(ajgu ajguVar) {
        if (ajguVar == null) {
            throw new NullPointerException("Null systemHealthMetric");
        }
        this.e = ajguVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    public final ozy b() {
        int i = ~this.c;
        if ((i & 15) != 0) {
            StringBuilder sb = new StringBuilder();
            if ((this.c & 1) == 0) {
                sb.append(" ssid");
            }
            if ((this.c & 2) == 0) {
                sb.append(" bssid");
            }
            if ((this.c & 4) == 0) {
                sb.append(" password");
            }
            if ((this.c & 8) == 0) {
                sb.append(" securityMode");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        String str = this.a;
        Object obj = this.d;
        String str2 = this.b;
        Object obj2 = this.f;
        int i2 = i & 16;
        Object obj3 = this.e;
        if (i2 != 0) {
            obj3 = afbe.a;
        }
        ?? r6 = obj3;
        return new ozy(str, (String) obj, str2, (xpv) obj2, r6);
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null bssid");
        }
        this.d = str;
        this.c = (byte) (this.c | 2);
    }

    public final void d(List list) {
        if (list == null) {
            throw new NullPointerException("Null mostRecentlyUsedFrequenciesMhz");
        }
        this.e = list;
        this.c = (byte) (this.c | 16);
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null password");
        }
        this.b = str;
        this.c = (byte) (this.c | 4);
    }

    public final void f(xpv xpvVar) {
        this.f = xpvVar;
        this.c = (byte) (this.c | 8);
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null ssid");
        }
        this.a = str;
        this.c = (byte) (this.c | 1);
    }
}
