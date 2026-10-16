package defpackage;

/* loaded from: classes.dex */
public final class agw {
    public final aei a;
    public final aes b;
    public final int c = 0;

    public agw(aei aeiVar, aes aesVar) {
        this.a = aeiVar;
        this.b = aesVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agw)) {
            return false;
        }
        agw agwVar = (agw) obj;
        if (!affa.f(this.a, agwVar.a) || !affa.f(this.b, agwVar.b)) {
            return false;
        }
        int i = agwVar.c;
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
