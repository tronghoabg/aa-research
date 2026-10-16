package Y1;

import Q1.x;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f16335a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16336b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16337c;

    public f(String str, String str2, String str3) {
        this.f16335a = str;
        this.f16336b = str2;
        this.f16337c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            int i5 = x.f9724a;
            if (Objects.equals(this.f16335a, fVar.f16335a) && Objects.equals(this.f16336b, fVar.f16336b) && Objects.equals(this.f16337c, fVar.f16337c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f16335a.hashCode() * 31;
        String str = this.f16336b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f16337c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
