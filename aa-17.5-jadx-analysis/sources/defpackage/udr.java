package defpackage;

import j$.util.Optional;

/* loaded from: classes3.dex */
public final class udr {
    public final too a;
    public final float b;
    public final Optional c;
    public final long d;
    public final long e;

    public udr(too tooVar, float f, Optional optional, long j, long j2) {
        this.a = tooVar;
        this.b = f;
        this.c = optional;
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof udr) {
            udr udrVar = (udr) obj;
            too tooVar = this.a;
            if (tooVar != null ? tooVar.equals(udrVar.a) : udrVar.a == null) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(udrVar.b) && this.c.equals(udrVar.c) && this.d == udrVar.d && this.e == udrVar.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        too tooVar = this.a;
        int iHashCode = (((((tooVar == null ? 0 : tooVar.hashCode()) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        long j2 = this.e;
        return ((((int) (j ^ (j >>> 32))) ^ (iHashCode * 1000003)) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        Optional optional = this.c;
        return "{" + String.valueOf(this.a) + ", " + this.b + ", " + String.valueOf(optional) + ", " + this.d + ", " + this.e + "}";
    }

    public udr() {
        throw null;
    }
}
