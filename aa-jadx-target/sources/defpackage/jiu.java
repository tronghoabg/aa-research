package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jiu {
    public final defpackage.jik a;
    public final defpackage.jik b;
    public final defpackage.jik c;
    public final defpackage.jik d;

    public jiu(defpackage.jik jikVar, defpackage.jik jikVar2, defpackage.jik jikVar3, defpackage.jik jikVar4) {
        this.a = jikVar;
        this.b = jikVar2;
        this.c = jikVar3;
        this.d = jikVar4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.jiu) {
            defpackage.jiu jiuVar = (defpackage.jiu) obj;
            defpackage.jik jikVar = this.a;
            if (jikVar != null ? jikVar.equals(jiuVar.a) : jiuVar.a == null) {
                defpackage.jik jikVar2 = this.b;
                if (jikVar2 != null ? jikVar2.equals(jiuVar.b) : jiuVar.b == null) {
                    defpackage.jik jikVar3 = this.c;
                    if (jikVar3 != null ? jikVar3.equals(jiuVar.c) : jiuVar.c == null) {
                        defpackage.jik jikVar4 = this.d;
                        if (jikVar4 != null ? jikVar4.equals(jiuVar.d) : jiuVar.d == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.jik jikVar = this.a;
        int iHashCode = jikVar == null ? 0 : jikVar.hashCode();
        defpackage.jik jikVar2 = this.b;
        int iHashCode2 = jikVar2 == null ? 0 : jikVar2.hashCode();
        int i = iHashCode ^ 1000003;
        defpackage.jik jikVar3 = this.c;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (jikVar3 == null ? 0 : jikVar3.hashCode())) * 1000003;
        defpackage.jik jikVar4 = this.d;
        return iHashCode3 ^ (jikVar4 != null ? jikVar4.hashCode() : 0);
    }

    public final java.lang.String toString() {
        defpackage.jik jikVar = this.d;
        defpackage.jik jikVar2 = this.c;
        defpackage.jik jikVar3 = this.b;
        return "WindowAnimationSet{enterAnimation=" + java.lang.String.valueOf(this.a) + ", exitAnimation=" + java.lang.String.valueOf(jikVar3) + ", enterFromEmptyAnimation=" + java.lang.String.valueOf(jikVar2) + ", exitToEmptyAnimation=" + java.lang.String.valueOf(jikVar) + "}";
    }

    public jiu() {
        throw null;
    }
}
