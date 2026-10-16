package defpackage;

/* loaded from: classes.dex */
public final class jin {
    public final jid a;
    public final jid b;
    public final jid c;
    public final jid d;

    public jin(jid jidVar, jid jidVar2, jid jidVar3, jid jidVar4) {
        this.a = jidVar;
        this.b = jidVar2;
        this.c = jidVar3;
        this.d = jidVar4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jin) {
            jin jinVar = (jin) obj;
            jid jidVar = this.a;
            if (jidVar != null ? jidVar.equals(jinVar.a) : jinVar.a == null) {
                jid jidVar2 = this.b;
                if (jidVar2 != null ? jidVar2.equals(jinVar.b) : jinVar.b == null) {
                    jid jidVar3 = this.c;
                    if (jidVar3 != null ? jidVar3.equals(jinVar.c) : jinVar.c == null) {
                        jid jidVar4 = this.d;
                        if (jidVar4 != null ? jidVar4.equals(jinVar.d) : jinVar.d == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        jid jidVar = this.a;
        int iHashCode = jidVar == null ? 0 : jidVar.hashCode();
        jid jidVar2 = this.b;
        int iHashCode2 = jidVar2 == null ? 0 : jidVar2.hashCode();
        int i = iHashCode ^ 1000003;
        jid jidVar3 = this.c;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (jidVar3 == null ? 0 : jidVar3.hashCode())) * 1000003;
        jid jidVar4 = this.d;
        return iHashCode3 ^ (jidVar4 != null ? jidVar4.hashCode() : 0);
    }

    public final String toString() {
        jid jidVar = this.d;
        jid jidVar2 = this.c;
        jid jidVar3 = this.b;
        return "WindowAnimationSet{enterAnimation=" + String.valueOf(this.a) + ", exitAnimation=" + String.valueOf(jidVar3) + ", enterFromEmptyAnimation=" + String.valueOf(jidVar2) + ", exitToEmptyAnimation=" + String.valueOf(jidVar) + "}";
    }

    public jin() {
        throw null;
    }
}
