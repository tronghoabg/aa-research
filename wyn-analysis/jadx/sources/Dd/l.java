package dd;

import j$.util.Objects;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public String f34279a;

    /* renamed from: b, reason: collision with root package name */
    public String f34280b;

    /* renamed from: c, reason: collision with root package name */
    public String f34281c;

    /* renamed from: d, reason: collision with root package name */
    public String f34282d;

    /* renamed from: e, reason: collision with root package name */
    public String f34283e;

    /* renamed from: f, reason: collision with root package name */
    public String f34284f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (Objects.equals(this.f34279a, lVar.f34279a) && this.f34280b.equals(lVar.f34280b) && this.f34281c.equals(lVar.f34281c) && Objects.equals(this.f34282d, lVar.f34282d) && Objects.equals(this.f34283e, lVar.f34283e) && Objects.equals(this.f34284f, lVar.f34284f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f34279a, this.f34280b, this.f34281c, this.f34282d, this.f34283e, this.f34284f);
    }
}
