package hd;

import j$.util.Objects;
import java.util.Map;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public String f36401a;

    /* renamed from: b, reason: collision with root package name */
    public g f36402b;

    /* renamed from: c, reason: collision with root package name */
    public Map f36403c;

    /* renamed from: d, reason: collision with root package name */
    public String f36404d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f36401a.equals(eVar.f36401a) && Objects.equals(this.f36402b, eVar.f36402b) && this.f36403c.equals(eVar.f36403c) && Objects.equals(this.f36404d, eVar.f36404d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f36401a, this.f36402b, this.f36403c, this.f36404d);
    }
}
