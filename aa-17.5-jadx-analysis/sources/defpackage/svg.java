package defpackage;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class svg implements sku {
    public static final svg a = new svg();
    private final boolean b = false;
    private final boolean d = false;
    private final String e = null;
    private final boolean f = false;
    private final boolean i = false;
    private final String g = null;
    private final String h = null;
    private final Long j = null;
    private final Long k = null;

    private svg() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof svg)) {
            return false;
        }
        svg svgVar = (svg) obj;
        boolean z = svgVar.b;
        boolean z2 = svgVar.d;
        String str = svgVar.e;
        if (Objects.equals(null, null)) {
            boolean z3 = svgVar.f;
            boolean z4 = svgVar.i;
            String str2 = svgVar.g;
            if (Objects.equals(null, null)) {
                String str3 = svgVar.h;
                if (Objects.equals(null, null)) {
                    Long l = svgVar.j;
                    if (Objects.equals(null, null)) {
                        Long l2 = svgVar.k;
                        if (Objects.equals(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(false, false, null, false, false, null, null, null, null);
    }
}
