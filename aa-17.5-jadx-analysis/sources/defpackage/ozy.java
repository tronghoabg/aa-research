package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class ozy {
    public final String a;
    public final String b;
    public final String c;
    public final xpv d;
    public final List e;

    public ozy(String str, String str2, String str3, xpv xpvVar, List list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        xpvVar.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = xpvVar;
        this.e = list;
    }

    public final boolean a(ozy ozyVar) {
        return affa.f(this.a, ozyVar != null ? ozyVar.a : null) && affa.f(this.b, ozyVar.b) && affa.f(this.c, ozyVar.c) && this.d == ozyVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozy)) {
            return false;
        }
        ozy ozyVar = (ozy) obj;
        return affa.f(this.a, ozyVar.a) && affa.f(this.b, ozyVar.b) && affa.f(this.c, ozyVar.c) && this.d == ozyVar.d && affa.f(this.e, ozyVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        String str = String.format("WifiConfiguration(ssid=%s, bssid=%s, securityMode=%s, mostRecentlyUsedFrequenciesMhz=%s)", Arrays.copyOf(new Object[]{this.a, this.b, this.d.name(), woy.bQ(this.e)}, 4));
        str.getClass();
        return str;
    }
}
