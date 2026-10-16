package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class pzz implements Serializable {
    private final int a;
    private final int b;

    public pzz(int i) {
        this.b = 1;
        this.a = i;
    }

    public static pzy a() {
        pzy pzyVar = new pzy();
        pzyVar.c = 1;
        pzyVar.a = -1;
        pzyVar.b = (byte) 1;
        return pzyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pzz)) {
            return false;
        }
        pzz pzzVar = (pzz) obj;
        int i = this.b;
        int i2 = pzzVar.b;
        if (i != 0) {
            return i2 == 1 && this.a == pzzVar.a;
        }
        throw null;
    }

    public final int hashCode() {
        a.aW(this.b);
        return (this.a ^ (-722379962)) * 1525764945;
    }

    public final String toString() {
        xxg xxgVar = new xxg("ImpressionParams");
        xxgVar.c();
        int i = this.b;
        String str = i != 1 ? "null" : "VISIBILITY_VISIBLE";
        if (i == 0) {
            throw null;
        }
        xxgVar.b("visibility", str);
        xxgVar.f("elementIndex", this.a);
        xxgVar.b("geoUgcData", null);
        xxgVar.b("mapsData", null);
        xxgVar.b("tronData", null);
        xxgVar.b("mapsImpressionData", null);
        return xxgVar.toString();
    }

    public pzz() {
        throw null;
    }
}
