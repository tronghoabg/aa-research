package m9;

import j$.util.Objects;
import p9.EnumC3788i;

/* renamed from: m9.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3526z extends AbstractC3501A {

    /* renamed from: a, reason: collision with root package name */
    public final r f40516a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC3788i f40517b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f40518c;

    public C3526z(r rVar, EnumC3788i enumC3788i, Object obj) {
        this.f40516a = rVar;
        this.f40517b = enumC3788i;
        this.f40518c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3526z.class == obj.getClass()) {
            C3526z c3526z = (C3526z) obj;
            if (this.f40517b == c3526z.f40517b && Objects.equals(this.f40516a, c3526z.f40516a) && Objects.equals(this.f40518c, c3526z.f40518c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        r rVar = this.f40516a;
        int iHashCode = (rVar != null ? rVar.f40508a.hashCode() : 0) * 31;
        EnumC3788i enumC3788i = this.f40517b;
        int iHashCode2 = (iHashCode + (enumC3788i != null ? enumC3788i.hashCode() : 0)) * 31;
        Object obj = this.f40518c;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }
}
