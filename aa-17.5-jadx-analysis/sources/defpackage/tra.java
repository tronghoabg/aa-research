package defpackage;

import j$.util.Optional;

/* loaded from: classes3.dex */
public final class tra {
    public final aekf a;
    public final int b;
    public final String c;
    public final int d;
    public final boolean e;
    public final Optional f;
    public final boolean g;

    public tra(aekf aekfVar, String str, int i, boolean z, Optional optional) {
        this.a = aekfVar;
        this.b = 30;
        this.c = str;
        this.d = i;
        this.e = z;
        this.f = optional;
        this.g = true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tra) {
            tra traVar = (tra) obj;
            if (this.a.equals(traVar.a) && this.b == traVar.b && this.c.equals(traVar.c) && this.d == traVar.d && this.e == traVar.e && this.f.equals(traVar.f) && this.g == traVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((this.b ^ 942107342) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ 1237) * (-721379959)) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true == this.g ? 1231 : 1237);
    }

    public final String toString() {
        Optional optional = this.f;
        return "{false, false, " + String.valueOf(this.a) + ", false, " + this.b + ", false, false, " + this.c + ", " + this.d + ", false, false, false, false, false, false, " + this.e + ", false, 0, false, false, false, " + String.valueOf(optional) + ", false, false, false, false, false, " + this.g + "}";
    }

    public tra() {
        throw null;
    }
}
