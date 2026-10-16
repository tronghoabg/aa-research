package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import org.xml.sax.Attributes;

/* loaded from: classes3.dex */
public final class ackh {
    public Object a;
    public final Object b;

    public ackh(Attributes attributes) {
        this.a = null;
        this.b = attributes;
        String strH = aclf.h("style", attributes);
        if (strH != null) {
            this.a = new sf(strH);
        }
    }

    public final Float a(String str) {
        String strC = c(str);
        if (strC == null) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(strC));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final Integer b(String str) throws NumberFormatException {
        String strC = c(str);
        if (strC == null) {
            return null;
        }
        if (!strC.startsWith("#") || (strC.length() != 4 && strC.length() != 7)) {
            return (Integer) acke.a.get(strC);
        }
        try {
            int i = Integer.parseInt(strC.substring(1), 16);
            if (strC.length() == 4) {
                int i2 = i & 3840;
                int i3 = i & 240;
                int i4 = i & 15;
                i = i4 | (i2 << 12) | (i2 << 8) | (i3 << 4) | (i3 << 8) | (i4 << 4);
            }
            return Integer.valueOf(i);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, org.xml.sax.Attributes] */
    public final String c(String str) {
        Object obj = this.a;
        String strE = obj != null ? ((sf) obj).e(str) : null;
        return strE == null ? aclf.h(str, this.b) : strE;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final Integer d(abgx abgxVar) {
        zwg zwgVar = (zwg) this.b.get(abgxVar);
        if (zwgVar == null) {
            return null;
        }
        return zwgVar.b;
    }

    public ackh() {
        this.b = new ConcurrentHashMap();
        this.a = new HashSet();
    }
}
