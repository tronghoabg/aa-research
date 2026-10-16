package defpackage;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class slr {
    private final int a;
    private final sku b;
    private final String c;
    private final rju d;

    public slr(rju rjuVar, sku skuVar, String str) {
        this.d = rjuVar;
        this.b = skuVar;
        this.c = str;
        this.a = Objects.hash(rjuVar, skuVar, str, null);
    }

    public final String a() {
        return (String) this.d.b;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof slr)) {
            return false;
        }
        slr slrVar = (slr) obj;
        return Objects.equals(this.d, slrVar.d) && Objects.equals(this.b, slrVar.b) && Objects.equals(this.c, slrVar.c) && Objects.equals(null, null);
    }

    public final int hashCode() {
        return this.a;
    }
}
