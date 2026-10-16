package defpackage;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class adsl {
    public String a = "unknown-authority";
    public adis b = adis.a;
    public String c;
    public adke d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof adsl)) {
            return false;
        }
        adsl adslVar = (adsl) obj;
        if (this.a.equals(adslVar.a) && this.b.equals(adslVar.b)) {
            String str = adslVar.c;
            if (Objects.equals(null, null) && Objects.equals(this.d, adslVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, null, this.d);
    }
}
