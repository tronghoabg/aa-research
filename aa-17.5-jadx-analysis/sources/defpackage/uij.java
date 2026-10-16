package defpackage;

/* loaded from: classes3.dex */
public class uij {
    public final tox a;
    public final ukr b;
    public final uxb c;
    public final ujk d;
    public final int e;
    public final String f;
    public final aacq g;

    public uij(tox toxVar, ukr ukrVar, uxb uxbVar, ujk ujkVar, int i, aacq aacqVar, String str) {
        toxVar.getClass();
        this.a = toxVar;
        ukrVar.getClass();
        this.b = ukrVar;
        uxbVar.getClass();
        this.c = uxbVar;
        this.d = ujkVar;
        this.e = i;
        this.g = aacqVar;
        str.getClass();
        this.f = str;
    }

    public static uij a(tox toxVar, ukr ukrVar, ujk ujkVar, uxb uxbVar, Integer num, aacq aacqVar, String str) {
        return new uif(toxVar, ukrVar, uxbVar, ujkVar, num.intValue(), aacqVar, str);
    }

    public boolean equals(Object obj) {
        aacq aacqVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof uij) {
            uij uijVar = (uij) obj;
            if (this.a.equals(uijVar.a) && this.b.equals(uijVar.b) && this.c.equals(uijVar.c) && this.d.equals(uijVar.d) && this.e == uijVar.e && ((aacqVar = this.g) != null ? aacqVar.equals(uijVar.g) : uijVar.g == null) && this.f.equals(uijVar.f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        aacq aacqVar = this.g;
        return this.f.hashCode() ^ (((((iHashCode * 1000003) ^ this.e) * 1000003) ^ (aacqVar == null ? 0 : aacqVar.hashCode())) * 1000003);
    }

    public String toString() {
        return "{" + this.a.b + ", " + this.b.toString() + ", " + String.valueOf(this.c) + ", " + this.d.toString() + ", " + this.e + ", " + String.valueOf(this.g) + ", " + this.f + "}";
    }

    public uij() {
        throw null;
    }
}
