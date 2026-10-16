package defpackage;

/* loaded from: classes3.dex */
final class udn {
    public final float a;
    public final ujk b;
    public final ueu c;
    public final boolean d;
    public final tra e;
    public final usy f;
    public final wnq g;

    public udn(usy usyVar, float f, ujk ujkVar, ueu ueuVar, wnq wnqVar, boolean z, tra traVar) {
        this.f = usyVar;
        this.a = f;
        this.b = ujkVar;
        this.c = ueuVar;
        this.g = wnqVar;
        this.d = z;
        this.e = traVar;
    }

    final int a() {
        return (int) this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof udn) {
            udn udnVar = (udn) obj;
            if (this.f.equals(udnVar.f)) {
                if (Float.floatToIntBits(this.a) == Float.floatToIntBits(udnVar.a) && this.b.equals(udnVar.b) && this.c.equals(udnVar.c) && this.g.equals(udnVar.g) && this.d == udnVar.d && this.e.equals(udnVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a)) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.g.hashCode();
        return this.e.hashCode() ^ (((iHashCode * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        tra traVar = this.e;
        wnq wnqVar = this.g;
        ueu ueuVar = this.c;
        ujk ujkVar = this.b;
        return "{" + String.valueOf(this.f) + ", " + this.a + ", " + ujkVar.toString() + ", " + ueuVar.toString() + ", " + wnqVar.toString() + ", " + this.d + ", " + traVar.toString() + "}";
    }

    public udn() {
        throw null;
    }
}
