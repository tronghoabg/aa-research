package dd;

import j$.util.Objects;
import java.util.List;

/* renamed from: dd.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2429h {

    /* renamed from: a, reason: collision with root package name */
    public List f34270a;

    /* renamed from: b, reason: collision with root package name */
    public k f34271b;

    /* renamed from: c, reason: collision with root package name */
    public String f34272c;

    /* renamed from: d, reason: collision with root package name */
    public String f34273d;

    /* renamed from: e, reason: collision with root package name */
    public String f34274e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f34275f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2429h.class == obj.getClass()) {
            C2429h c2429h = (C2429h) obj;
            if (this.f34270a.equals(c2429h.f34270a) && this.f34271b.equals(c2429h.f34271b) && Objects.equals(this.f34272c, c2429h.f34272c) && Objects.equals(this.f34273d, c2429h.f34273d) && Objects.equals(this.f34274e, c2429h.f34274e) && this.f34275f.equals(c2429h.f34275f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f34270a, this.f34271b, this.f34272c, this.f34273d, this.f34274e, this.f34275f);
    }
}
