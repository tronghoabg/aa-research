package ad;

import j$.util.Objects;

/* loaded from: classes5.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final String f17540a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17541b;

    public U(String str, String str2) {
        this.f17540a = str;
        this.f17541b = str2;
    }

    public final R6.e a() {
        G6.S s10 = new G6.S();
        s10.f4560a = "";
        s10.f4561b = "";
        String str = this.f17540a;
        if (str != null) {
            s10.f4560a = str;
        }
        String str2 = this.f17541b;
        if (str2 != null) {
            s10.f4561b = str2;
        }
        return new R6.e(s10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u10 = (U) obj;
        return Objects.equals(u10.f17540a, this.f17540a) && Objects.equals(u10.f17541b, this.f17541b);
    }

    public final int hashCode() {
        return Objects.hash(this.f17540a, this.f17541b);
    }
}
