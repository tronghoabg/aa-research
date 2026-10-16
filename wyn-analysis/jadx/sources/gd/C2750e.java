package gd;

import j$.util.Objects;
import java.util.Map;

/* renamed from: gd.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2750e {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f35872a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f35873b;

    /* renamed from: c, reason: collision with root package name */
    public Map f35874c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2750e.class == obj.getClass()) {
            C2750e c2750e = (C2750e) obj;
            if (this.f35872a.equals(c2750e.f35872a) && this.f35873b.equals(c2750e.f35873b) && this.f35874c.equals(c2750e.f35874c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f35872a, this.f35873b, this.f35874c);
    }
}
