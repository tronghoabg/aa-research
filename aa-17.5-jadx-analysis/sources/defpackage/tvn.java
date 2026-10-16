package defpackage;

/* loaded from: classes3.dex */
public final class tvn {
    public final abes a;
    public final usf b;
    public final usf c;
    public final usf d;

    public tvn(abes abesVar, usf usfVar, usf usfVar2, usf usfVar3) {
        this.a = abesVar;
        this.b = usfVar;
        this.c = usfVar2;
        this.d = usfVar3;
    }

    public final boolean equals(Object obj) {
        usf usfVar;
        usf usfVar2;
        usf usfVar3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tvn) {
            tvn tvnVar = (tvn) obj;
            if (this.a.equals(tvnVar.a) && ((usfVar = this.b) != null ? usfVar.equals(tvnVar.b) : tvnVar.b == null) && ((usfVar2 = this.c) != null ? usfVar2.equals(tvnVar.c) : tvnVar.c == null) && ((usfVar3 = this.d) != null ? usfVar3.equals(tvnVar.d) : tvnVar.d == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        usf usfVar = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (usfVar == null ? 0 : usfVar.hashCode())) * 1000003;
        usf usfVar2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (usfVar2 == null ? 0 : usfVar2.hashCode())) * 1000003;
        usf usfVar3 = this.d;
        return iHashCode3 ^ (usfVar3 != null ? usfVar3.hashCode() : 0);
    }

    public final String toString() {
        usf usfVar = this.d;
        usf usfVar2 = this.c;
        usf usfVar3 = this.b;
        return "{" + this.a.toString() + ", " + String.valueOf(usfVar3) + ", " + String.valueOf(usfVar2) + ", " + String.valueOf(usfVar) + "}";
    }

    public tvn() {
        throw null;
    }
}
